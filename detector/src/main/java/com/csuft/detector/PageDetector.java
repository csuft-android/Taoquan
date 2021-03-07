package com.csuft.detector;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.ref.WeakReference;

public class PageDetector {

    private static final String TAG = "PageDetector";
    private WeakReference<Activity> topActivity;
    DetectorActivityCallback detectorActivityCallback;
    private static PageDetector sPageDetector;
    private Application application;

    public Application application() {
        return this.application;
    }

    private PageDetector() {
        detectorActivityCallback = new DetectorActivityCallback();
    }

    public static PageDetector instance() {
        if (sPageDetector == null) {
            synchronized (PageDetector.class) {
                if (sPageDetector == null) {
                    sPageDetector = new PageDetector();
                }
            }
        }
        return sPageDetector;
    }

    public void init(@NonNull Application application) {
        this.application = application;
        application.registerActivityLifecycleCallbacks(detectorActivityCallback);
    }

    @Nullable
    public Activity topActivity() {
        return topActivity != null ? topActivity.get() : null;
    }

    private class DetectorActivityCallback implements Application.ActivityLifecycleCallbacks {

        @Override
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
            Log.i(TAG, "onActivityCreated activity:" + activity.getClass().getName());
//            watchFragments(activity);
        }

        @Override
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override
        public void onActivityResumed(@NonNull Activity activity) {
            topActivity = new WeakReference<>(activity);
            View v = getDecorViewOfActivity(activity);
            PageDetectorInternal.instance().detectExcessivePageDepth(v, activity.getClass().getName());
        }

        @Override
        public void onActivityPaused(@NonNull Activity activity) {

        }

        @Override
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
        }

        @Override
        public void onActivityDestroyed(@NonNull Activity activity) {

        }

    }

    @Nullable
    private FrameLayout getDecorViewOfActivity(@NonNull Activity activity) {
        Window window = activity.getWindow();
        if (null == window) {
            return null;
        }
        View decorView = window.getDecorView();
        FrameLayout contentView = decorView.findViewById(android.R.id.content);
        return contentView;
    }

}
