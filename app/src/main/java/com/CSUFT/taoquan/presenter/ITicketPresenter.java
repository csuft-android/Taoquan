package com.CSUFT.taoquan.presenter;

import com.CSUFT.taoquan.base.IBasePresenter;
import com.CSUFT.taoquan.view.ITicketPagerCallback;

public interface ITicketPresenter extends IBasePresenter<ITicketPagerCallback> {

    /**
     * 生成淘口令
     *
     * @param title
     * @param url
     * @param cover
     */
    void getTicket(String title,String url,String cover);

}
