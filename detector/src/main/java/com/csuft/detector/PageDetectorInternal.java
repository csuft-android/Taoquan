package com.csuft.detector;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class PageDetectorInternal {
    private static final String TAG = "PageDetector";
    public static int MAX_PAGE_DEPTH = 10;

    private static PageDetectorInternal sPageDetector;

    private PageDetectorInternal() {
    }

    public static PageDetectorInternal instance() {
        if (sPageDetector == null) {
            synchronized (PageDetectorInternal.class) {
                if (sPageDetector == null) {
                    sPageDetector = new PageDetectorInternal();
                }
            }
        }
        return sPageDetector;
    }

    public void detectExcessivePageDepth(View view, String fragmentName) {
        List<String[]> results = new ArrayList<>();
        List<View> viewTree = new ArrayList<>();
        traversalViewDepth(view, viewTree, results, fragmentName);
        showPageDepthWarningDialog(results);
    }

    private void traversalViewDepth(@NonNull View view, @NonNull List<View> viewTree, @NonNull List<String[]> results,
                                    String fragmentName) {
        viewTree.add(view);
        if (!(view instanceof ViewGroup) || ((ViewGroup) view).getChildCount() == 0) {
            if (viewTree.size() > MAX_PAGE_DEPTH) {
                String res[] = new String[2];
                res[0] = getViewListString(viewTree, fragmentName);
                res[1] = "View Depth:" + viewTree.size();
                results.add(res);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0, n = viewGroup.getChildCount(); i < n; i++) {
                View childView = viewGroup.getChildAt(i);
                traversalViewDepth(childView, viewTree, results, fragmentName);
            }
        }
        viewTree.remove(viewTree.size() - 1);
    }

    private void showPageDepthWarningDialog(List<String[]> results) {
        if (results.isEmpty()) {
            return;
        }
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < results.size(); i++) {
            StringBuilder strBuilder = new StringBuilder();
            String[] result = results.get(i);
            strBuilder.append(result[0]).append("\n");
            strBuilder.append(result[1]).append("\n");
            map.put("View " + (i + 1) + ":", strBuilder.toString());
        }
        showWarningDialog("危险!!!，页面深度过大", map);
    }

    public static String getViewListString(@NonNull List<View> views, String fragmentName) {
        StringBuilder strBuilder = new StringBuilder();
        String preStr = ">";
        strBuilder.append(fragmentName).append("\n");
        for (int i = 0, n = views.size(); i < n; i++) {
            View view = views.get(i);
            strBuilder.append(preStr).append(view.getClass().getSimpleName());
            String resName = null;
            try {
                resName = view.getResources().getResourceEntryName(view.getId());
            } catch (Throwable t) {
            }
            if (!TextUtils.isEmpty(resName)) {
                strBuilder.append("/").append(resName);
            }
            if (i != n - 1) {
                strBuilder.append("\n");
            }
            preStr = "\t" + preStr;
        }
        return strBuilder.toString();
    }

    public static void showWarningDialog(@NonNull CharSequence title, @NonNull LinkedHashMap<String, String> contents) {
        Activity activity = PageDetector.instance().topActivity();
        if (null == activity || activity.isFinishing()) {
            Log.i(TAG, "showWarningDialog activity is unusable.");
            return;
        }

        List<int[]> spans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int start = 0, end = 0;
        for (String key : contents.keySet()) {
            start = sb.length();
            sb.append(key);
            end = sb.length();
            spans.add(new int[]{start, end});
            sb.append("\n");
            String val = contents.get(key);
            sb.append(val);
            if (!val.endsWith("\n")) {
                sb.append("\n");
            }
            sb.append("\n");
        }
        SpannableString msgSpannableString = new SpannableString(sb.toString());
        for (int[] span : spans) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#CC9933"));
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(16, true);
            msgSpannableString.setSpan(foregroundColorSpan, span[0], span[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            msgSpannableString.setSpan(absoluteSizeSpan, span[0], span[1], Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }

        SpannableString titleSpannableString = new SpannableString(title);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FF0000"));
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(22, true);
        titleSpannableString.setSpan(foregroundColorSpan, 0, titleSpannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        titleSpannableString.setSpan(absoluteSizeSpan, 0, titleSpannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        AlertDialog dialog =
                new AlertDialog.Builder(activity).setTitle(titleSpannableString).setMessage(msgSpannableString).setCancelable(false).
                        setNegativeButton("复制到黏贴板", null).setPositiveButton("确定", null).show();
        Log.i(TAG, "showWarningDialog dialog show.");
        try {
            Field mAlert = AlertDialog.class.getDeclaredField("mAlert");
            mAlert.setAccessible(true);
            Object mAlertController = mAlert.get(dialog);
            Field field = mAlertController.getClass().getDeclaredField("mMessageView");
            field.setAccessible(true);
            TextView messageView = (TextView) field.get(mAlertController);
            messageView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14f);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        positiveButton.setTextColor(0xff9933ff);
        positiveButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 22);
        positiveButton.setPadding(60, 0, 60, 0);
        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
        negativeButton.setTextColor(0xff1E90FF);
        negativeButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);
        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ClipboardManager clipboard = (ClipboardManager) PageDetector.instance().application().getSystemService(Activity.CLIPBOARD_SERVICE);
                    ClipData textCd = ClipData.newPlainText("data", msgSpannableString);
                    clipboard.setPrimaryClip(textCd);
                } catch (Exception e) {
                }
            }
        });
    }

}
