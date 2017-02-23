package com.guigushangcheng.shoppingcat.fragment;

import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.guigushangcheng.base.baseFragment;

/**
 * Created by 潘鹏程 on 2017/2/22.
 * 微信:13212223597
 * QQ:591738374
 * 作用:
 */

public class ShoppintCatFragment  extends baseFragment {

    private TextView textView;

    @Override
    public View initView() {
        textView=new TextView(mContext);
        textView.setTextSize(20);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);

        return textView;
    }

    @Override
    protected void initData() {
        super.initData();

        Log.e("TAG","购物车的数据被初始化了");
        textView.setText("购物车内容");
    }
}
