package com.csuft.taoquan.ui.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.csuft.taoquan.presenter.impl.IBackFragment;
import com.csuft.taoquan.ui.fragment.PersonalCenterFragment;
import com.csuft.taoquan.utils.SizeUtils;
import com.csuft.taoquan.utils.ToastUtil;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.csuft.taoquan.R;
import com.csuft.taoquan.base.BaseActivity;
import com.csuft.taoquan.base.BaseFragment;
import com.csuft.taoquan.ui.fragment.HomeFragment;
import com.csuft.taoquan.ui.fragment.OnSellFragment;
import com.csuft.taoquan.ui.fragment.SearchFragment;
import com.csuft.taoquan.ui.fragment.SelectedFragment;
import com.csuft.taoquan.utils.LogUtils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;

public class MainActivity extends BaseActivity implements IMainActivity{

    @BindView(R.id.main_navigation_bar)
    public BottomNavigationView mNavigationView;
    private HomeFragment mHomeFragment;
    private OnSellFragment mRedPacketFragment;
    private SelectedFragment mSelectedFragment;
    private SearchFragment mSearchFragment;
    private PersonalCenterFragment mPersonCenterFragment;
    private FragmentManager mFm;
    RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);

    /**
     * 跳转到搜索界面
     */
    public void addSearchFragment() {
        mNavigationView.setVisibility(View.GONE);
        lp.setMargins(0,0,0,0);
        findViewById(R.id.main_page_container).setLayoutParams(lp);
        switchFragment(mSearchFragment);
    }

    @Override
    public void backToHome() {
        lp.setMargins(0,0,0, SizeUtils.dip2px(getBaseContext(),49));
        findViewById(R.id.main_page_container).setLayoutParams(lp);
        mNavigationView.setVisibility(View.VISIBLE);
        switchFragment(mHomeFragment);
    }

    // 用来计算返回键的点击间隔时间
    private long exitTime = 0;
    @Override
    public void onBackPressed() {
        Fragment fragment = lastOneFragment;
        if (fragment instanceof IBackFragment) {
            ((IBackFragment) fragment).onBackPressed();
        } else{
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                ToastUtil.showToast("再按一次退出程序");
                exitTime = System.currentTimeMillis();
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void initEvent() {
        initListener();
    }

    @Override
    protected void initView() {
        initFragments();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }


    private void initFragments() {
        mHomeFragment = new HomeFragment();
        mRedPacketFragment = new OnSellFragment();
        mSelectedFragment = new SelectedFragment();
        mSearchFragment = new SearchFragment();
        mPersonCenterFragment =new PersonalCenterFragment();
        mFm = getSupportFragmentManager();
        switchFragment(mHomeFragment);
    }

    private void initListener() {
        mNavigationView.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                LogUtils.d(this, "切换到首页");
                switchFragment(mHomeFragment);
            } else if (item.getItemId() == R.id.selected) {
                LogUtils.i(this, "切换到精选");
                switchFragment(mSelectedFragment);
            } else if (item.getItemId() == R.id.red_packet) {
                LogUtils.w(this, "切换到特惠");
                switchFragment(mRedPacketFragment);
            }else if(item.getItemId()==R.id.personal_center){
                switchFragment(mPersonCenterFragment);
            }
            return true;
        });
    }

    /**
     * 上一次显示的fragment
     */
    private BaseFragment lastOneFragment = null;

    private void switchFragment(BaseFragment targetFragment) {
        //如果上一个fragment跟当前要切换的fragment是同一个，那么不需要切换
        if (lastOneFragment == targetFragment) {
            return;
        }
        //修改成add和hide的方式来控制Fragment的切换
        FragmentTransaction fragmentTransaction = mFm.beginTransaction();
        if (!targetFragment.isAdded()) {
            fragmentTransaction.add(R.id.main_page_container, targetFragment);
        } else {
            fragmentTransaction.show(targetFragment);
        }
        if (lastOneFragment != null) {
            fragmentTransaction.hide(lastOneFragment);
        }
        lastOneFragment = targetFragment;
        //fragmentTransaction.replace(R.id.main_page_container,targetFragment);
        fragmentTransaction.commit();
    }

}
