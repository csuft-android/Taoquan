package com.CSUFT.taoquan.presenter;

import com.CSUFT.taoquan.base.IBasePresenter;
import com.CSUFT.taoquan.view.IHomeCallback;

public interface IHomePresenter extends IBasePresenter<IHomeCallback> {
    /**
     * 获取商品分类
     */
    void getCategories();
}
