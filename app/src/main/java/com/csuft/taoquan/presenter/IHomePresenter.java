package com.csuft.taoquan.presenter;

import com.csuft.taoquan.base.IBasePresenter;
import com.csuft.taoquan.view.IHomeCallback;

public interface IHomePresenter extends IBasePresenter<IHomeCallback> {
    /**
     * 获取商品分类
     */
    void getCategories();
}
