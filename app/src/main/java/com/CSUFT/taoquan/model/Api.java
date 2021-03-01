package com.CSUFT.taoquan.model;

import com.CSUFT.taoquan.model.domain.Categories;
import com.CSUFT.taoquan.model.domain.HomePagerContent;
import com.CSUFT.taoquan.model.domain.OnSellContent;
import com.CSUFT.taoquan.model.domain.SearchRecommend;
import com.CSUFT.taoquan.model.domain.SearchResult;
import com.CSUFT.taoquan.model.domain.SelectedContent;
import com.CSUFT.taoquan.model.domain.SelectedPageCategory;
import com.CSUFT.taoquan.model.domain.TicketParams;
import com.CSUFT.taoquan.model.domain.TicketResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface Api {

    @GET("discovery/categories")
    Call<Categories> getCategories();

    @GET
    Call<HomePagerContent> getHomePageContent(@Url String url);

    @POST("tpwd")
    Call<TicketResult> getTicket(@Body TicketParams ticketParams);

    @GET("recommend/categories")
    Call<SelectedPageCategory> getSelectedPageCategories();

    @GET
    Call<SelectedContent> getSelectedPageContent(@Url String url);

    @GET
    Call<OnSellContent> getOnSellPageContent(@Url String url);

    @GET("search/recommend")
    Call<SearchRecommend> getRecommendWords();

    @GET("search")
    Call<SearchResult> doSearch(@Query("page") int page,@Query("keyword") String keyword);

}
