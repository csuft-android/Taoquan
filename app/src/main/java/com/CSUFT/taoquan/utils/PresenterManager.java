package com.CSUFT.taoquan.utils;

import com.CSUFT.taoquan.presenter.ICategoryPagerPresenter;
import com.CSUFT.taoquan.presenter.IHomePresenter;
import com.CSUFT.taoquan.presenter.IOnSellPagePresenter;
import com.CSUFT.taoquan.presenter.ISearchPresenter;
import com.CSUFT.taoquan.presenter.ISelectedPagePresenter;
import com.CSUFT.taoquan.presenter.ITicketPresenter;
import com.CSUFT.taoquan.presenter.impl.CategoryPagePresenterImpl;
import com.CSUFT.taoquan.presenter.impl.HomePresenterImpl;
import com.CSUFT.taoquan.presenter.impl.OnSellPagePresenterImpl;
import com.CSUFT.taoquan.presenter.impl.SearchPresenter;
import com.CSUFT.taoquan.presenter.impl.SelectedPagePresenterImpl;
import com.CSUFT.taoquan.presenter.impl.TicketPresenterImpl;

public class PresenterManager {
    private static final PresenterManager ourInstance = new PresenterManager();
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
