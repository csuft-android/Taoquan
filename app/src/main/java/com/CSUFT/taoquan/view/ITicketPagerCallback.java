package com.CSUFT.taoquan.view;

import com.CSUFT.taoquan.base.IBaseCallback;
import com.CSUFT.taoquan.model.domain.TicketResult;

public interface ITicketPagerCallback extends IBaseCallback {
    /**
     * 淘口令加载结果
     *
     * @param cover
     * @param result
     */
    void onTicketLoaded(String cover,TicketResult result);
}
