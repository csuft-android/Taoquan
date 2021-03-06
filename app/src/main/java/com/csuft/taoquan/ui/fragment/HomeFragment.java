package com.csuft.taoquan.ui.fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.csuft.taoquan.R;
import com.csuft.taoquan.base.BaseFragment;
import com.csuft.taoquan.model.domain.Categories;
import com.csuft.taoquan.presenter.IHomePresenter;
import com.csuft.taoquan.ui.activity.IMainActivity;
import com.csuft.taoquan.ui.activity.ScanQrCodeActivity;
import com.csuft.taoquan.ui.adapter.HomePagerAdapter;
import com.csuft.taoquan.utils.LogUtils;
import com.csuft.taoquan.utils.PresenterManager;
import com.csuft.taoquan.view.IHomeCallback;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;


public class HomeFragment extends BaseFragment implements IHomeCallback {

    @BindView(R.id.home_indicator)
    public TabLayout mTabLayout;

    private IHomePresenter mHomePresenter;

    @BindView(R.id.home_pager)
    public ViewPager homePager;

    @BindView(R.id.scan_icon)
    public View scanBtn;


    @BindView(R.id.home_search_input_box)
    public View mSearchInputBox;
    private HomePagerAdapter mHomePagerAdapter;

    @Override
    protected int getRootViewResId() {
        return R.layout.fragment_home;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LogUtils.d(this, "on destroy view...");
    }

    @Override
    protected void initView(View rootView) {
        mTabLayout.setupWithViewPager(homePager);
        //给ViewPager设置适配器
        mHomePagerAdapter = new HomePagerAdapter(getChildFragmentManager());
        //设置适配器
        homePager.setAdapter(mHomePagerAdapter);

    }

    @Override
    protected void initListener() {
        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到扫码界面
                startActivity(new Intent(getContext(), ScanQrCodeActivity.class));
            }
        });
        mSearchInputBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到搜索页面
                FragmentActivity activity = getActivity();
                if (activity instanceof IMainActivity) {
                    ((IMainActivity) activity).addSearchFragment();
                }
            }
        });
    }

    @Override
    protected void initPresenter() {
        //创建Presenter
        mHomePresenter = PresenterManager.instance().getHomePresenter();
        mHomePresenter.registerViewCallback(this);
    }

    @Override
    protected View loadRootView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.base_home_fragment_layout, container, false);
    }

    @Override
    protected void loadData() {
        //加载数据
        mHomePresenter.getCategories();
    }

    @Override
    public void onCategoriesLoaded(Categories categories) {
        setUpState(State.SUCCESS);
        LogUtils.d(this, "onCategoriesLoaded..");
        //加载的数据就会从这里回来
        if (mHomePagerAdapter != null) {
            //homePager.setOffscreenPageLimit(categories.getData().size());
            mHomePagerAdapter.setCategories(categories);
        }
    }

    @Override
    public void onError() {
        setUpState(State.ERROR);
    }

    @Override
    public void onLoading() {
        setUpState(State.LOADING);
    }

    @Override
    public void onEmpty() {
        setUpState(State.EMPTY);
    }

    @Override
    protected void release() {
        //取消回调注册
        if (mHomePresenter != null) {
            mHomePresenter.unregisterViewCallback(this);
        }
    }

    @Override
    protected void onRetryClick() {
        //网络错误,点击了重试
        //重新加载分类内容
        if (mHomePresenter != null) {
            mHomePresenter.getCategories();
        }
    }
}
