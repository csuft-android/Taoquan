package com.CSUFT.taoquan.view;

import com.CSUFT.taoquan.base.IBaseCallback;
import com.CSUFT.taoquan.model.domain.SelectedContent;
import com.CSUFT.taoquan.model.domain.SelectedPageCategory;

public interface ISelectedPageCallback extends IBaseCallback {

    /**
     * 分类内容结果
     *
     * @param categories 分类内容
     */
    void onCategoriesLoaded(SelectedPageCategory categories);


    /**
     * 内容
     *
     * @param content
     */
    void onContentLoaded(SelectedContent content);

}
