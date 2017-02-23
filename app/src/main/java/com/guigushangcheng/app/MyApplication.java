package com.guigushangcheng.app;

import android.app.Application;

import com.zhy.http.okhttp.OkHttpUtils;

import okhttp3.OkHttpClient;

/**
 * Created by 潘鹏程 on 2017/2/22.
 * 微信:13212223597
 * QQ:591738374
 * 作用: 代表整个软件
 */

public class MyApplication  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        initOkhttpUtils();
    }



    private void initOkhttpUtils() {
        OkHttpClient okHttpClient=new OkHttpClient.
                Builder().
                connectTimeout(10000L, java.util.concurrent.TimeUnit.MILLISECONDS).
                readTimeout(10000L, java.util.concurrent.TimeUnit.MILLISECONDS)
                .build();

        OkHttpUtils.initClient(okHttpClient);
    }


}
