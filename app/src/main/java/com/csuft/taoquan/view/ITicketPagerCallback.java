package com.csuft.taoquan.view;

import com.csuft.taoquan.base.IBaseCallback;
import com.csuft.taoquan.model.domain.TicketResult;

public interface ITicketPagerCallback extends IBaseCallback {
    /**
     * 淘口令加载结果
     *
     * @param cover
     * @param result
     */
    void onTicketLoaded(String cover,TicketResult result);
}
