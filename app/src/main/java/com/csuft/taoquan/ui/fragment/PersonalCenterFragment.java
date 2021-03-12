package com.csuft.taoquan.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.csuft.taoquan.R;
import com.csuft.taoquan.base.BaseFragment;

import butterknife.BindView;

public class PersonalCenterFragment extends BaseFragment {
    @BindView(R.id.fragment_bar_title_tv)
    public TextView barTitleTv;

    @Override
    protected View loadRootView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_with_bar_layout, container, false);
    }

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_personal_center;
    }

    protected void initView(View rootView) {
        setUpState(State.SUCCESS);
        barTitleTv.setText(R.string.text_personal_center);
    }
}
