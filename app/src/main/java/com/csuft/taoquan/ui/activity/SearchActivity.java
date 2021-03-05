package com.csuft.taoquan.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.csuft.taoquan.R;
import com.csuft.taoquan.base.BaseActivity;
import com.csuft.taoquan.ui.fragment.SearchFragment;

public class SearchActivity extends BaseActivity {

    private SearchFragment mSearchFragment;

    @Override
    protected void initPresenter() {

    }


    @Override
    protected void initView() {
        FragmentManager mFm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFm.beginTransaction();
        mSearchFragment = new SearchFragment();
        fragmentTransaction.add(R.id.search_page_container,mSearchFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_search;
    }
}
