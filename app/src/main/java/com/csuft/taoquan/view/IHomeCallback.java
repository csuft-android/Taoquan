package com.csuft.taoquan.view;

import com.csuft.taoquan.base.IBaseCallback;
import com.csuft.taoquan.model.domain.Categories;

public interface IHomeCallback extends IBaseCallback {

    void onCategoriesLoaded(Categories categories);

}
