package com.CSUFT.taoquan.view;

import com.CSUFT.taoquan.base.IBaseCallback;
import com.CSUFT.taoquan.model.domain.Categories;

public interface IHomeCallback extends IBaseCallback {

    void onCategoriesLoaded(Categories categories);

}
