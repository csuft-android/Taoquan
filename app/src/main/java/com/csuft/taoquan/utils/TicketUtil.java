package com.csuft.taoquan.utils;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.csuft.taoquan.model.domain.IBaseInfo;
import com.csuft.taoquan.presenter.ITicketPresenter;
import com.csuft.taoquan.ui.activity.TicketActivity;

public class TicketUtil {

    public static void toTicketPage(Context context,IBaseInfo baseInfo) {
        //特惠列表内容被点击
        //处理数据
        String title = baseInfo.getTitle();
        //详情的地址
        String url = baseInfo.getUrl();
        if(TextUtils.isEmpty(url)) {
            url = baseInfo.getUrl();
        }
        String cover = baseInfo.getCover();
        //拿到tiketPresenter去加载数据
        ITicketPresenter ticketPresenter = PresenterManager.instance().getTicketPresenter();
        ticketPresenter.getTicket(title,url,cover);
        context.startActivity(new Intent(context,TicketActivity.class));
    }
}
