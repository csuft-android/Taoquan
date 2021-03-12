package com.csuft.taoquan.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {
    private volatile static  RetrofitManager ourInstance;
    private final Retrofit mRetrofit;

    public static RetrofitManager getInstance() {
        if (ourInstance==null) {
            synchronized (RetrofitManager.class){
                if (ourInstance==null) {
                    ourInstance=new RetrofitManager();
                }
            }
        }
        return ourInstance;
    }

    private RetrofitManager() {
        //创建retrofit
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }
}
