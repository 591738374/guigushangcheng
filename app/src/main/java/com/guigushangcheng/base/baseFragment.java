package com.guigushangcheng.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 潘鹏程 on 2017/2/22.
 * 微信:13212223597
 * QQ:591738374
 * 作用:
 */

public  abstract  class baseFragment extends Fragment{

    //上下文
    public Context mContext;

    /**
     * 当fragment被创建
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();
    }

    /**
     * 当系统调用该方法实例化视图的时候，调用该方法
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initView();
    }

    /**
     * 有子类实现该方法，显示子类不同的视图
     * @return
     */
    public abstract View initView();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    /**
     * 当子类需要
     * 1.把数据绑定到控件上的时候，重写该方法
     * 2.联网请求，把得到的数据绑定到视图上
     */
    protected void initData(){


    };
}
