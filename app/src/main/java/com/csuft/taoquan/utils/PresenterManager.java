package com.csuft.taoquan.utils;

import com.csuft.taoquan.presenter.ICategoryPagerPresenter;
import com.csuft.taoquan.presenter.IHomePresenter;
import com.csuft.taoquan.presenter.IOnSellPagePresenter;
import com.csuft.taoquan.presenter.ISearchPresenter;
import com.csuft.taoquan.presenter.ISelectedPagePresenter;
import com.csuft.taoquan.presenter.ITicketPresenter;
import com.csuft.taoquan.presenter.impl.CategoryPagePresenterImpl;
import com.csuft.taoquan.presenter.impl.HomePresenterImpl;
import com.csuft.taoquan.presenter.impl.OnSellPagePresenterImpl;
import com.csuft.taoquan.presenter.impl.SearchPresenter;
import com.csuft.taoquan.presenter.impl.SelectedPagePresenterImpl;
import com.csuft.taoquan.presenter.impl.TicketPresenterImpl;

public class PresenterManager {
    private volatile static  PresenterManager ourInstance;
    private final ICategoryPagerPresenter mCategoryPagePresenter;
    private final IHomePresenter mHomePresenter;
    private final ITicketPresenter mTicketPresenter;
    private final ISelectedPagePresenter mSelectedPagePresenter;
    private final IOnSellPagePresenter mOnSellPagePresenter;
    private final ISearchPresenter mSearchPresenter;

    public ITicketPresenter getTicketPresenter() {
        return mTicketPresenter;
    }

    public IHomePresenter getHomePresenter() {
        return mHomePresenter;
    }

    public ICategoryPagerPresenter getCategoryPagePresenter() {
        return mCategoryPagePresenter;
    }

    public static PresenterManager getInstance() {
        if (ourInstance==null) {
            synchronized (PresenterManager.class){
                if (ourInstance==null) {
                    ourInstance=new PresenterManager();
                }
            }
        }
        return ourInstance;
    }

    public ISelectedPagePresenter getSelectedPagePresenter() {
        return mSelectedPagePresenter;
    }

    public IOnSellPagePresenter getOnSellPagePresenter() {
        return mOnSellPagePresenter;
    }

    public ISearchPresenter getSearchPresenter() {
        return mSearchPresenter;
    }

    private PresenterManager() {
        mCategoryPagePresenter = new CategoryPagePresenterImpl();
        mHomePresenter = new HomePresenterImpl();
        mTicketPresenter = new TicketPresenterImpl();
        mSelectedPagePresenter = new SelectedPagePresenterImpl();
        mOnSellPagePresenter = new OnSellPagePresenterImpl();
        mSearchPresenter = new SearchPresenter();
    }
}
