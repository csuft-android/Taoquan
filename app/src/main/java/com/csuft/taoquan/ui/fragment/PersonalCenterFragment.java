package com.csuft.taoquan.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.csuft.taoquan.R;
import com.csuft.taoquan.base.BaseFragment;

public class PersonalCenterFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_personal_center,container,false);
    }

    @Override
    protected int getRootViewResId() {

        return R.layout.fragment_personal_center;
    }
}
