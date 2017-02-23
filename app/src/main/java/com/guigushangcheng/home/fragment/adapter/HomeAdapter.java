package com.guigushangcheng.home.fragment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atguigu.shoppingmall_1020.R;
import com.guigushangcheng.home.fragment.bean.HomeBean;

import java.util.List;

/**
 * Created by 潘鹏程 on 2017/2/23.
 * 微信:13212223597
 * QQ:591738374
 * 作用:
 */

public class HomeAdapter extends RecyclerView.Adapter {

    public static final int BANNER = 0;
    /**
     * 频道
     */
    public static final int CHANNEL = 1;

    /**
     * 活动
     */
    public static final int ACT = 2;

    /**
     * 秒杀
     */
    public static final int SECKILL = 3;
    /**
     * 推荐
     */
    public static final int RECOMMEND = 4;
    /**
     * 热卖
     */
    public static final int HOT = 5;
    /**
     * 用它加载布局
     */
    private final LayoutInflater inflater;

    /**
     * 当前类型
     */
    public int currentType = BANNER;


    /**
     * 根据位置得到对应的类型
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        if(position==BANNER){

            currentType=BANNER;

        }else if(position==CHANNEL){

            currentType=CHANNEL;

        }else if(position==ACT){

            currentType=ACT;

        }else if(position==SECKILL){

            currentType=SECKILL;

        }else if(position==RECOMMEND){

            currentType=RECOMMEND;

        }else if(position==HOT){

            currentType=HOT;

        }
        return currentType;
    }

    @Override
    public int getItemCount() {
        //所有类型写完后改成6
        return 1;
    }



    private final Context mContext;
    private final HomeBean.ResultEntity result;

    public HomeAdapter(Context mContext, HomeBean.ResultEntity result) {

        this.mContext=mContext;
        this.result=result;

        inflater= LayoutInflater.from(mContext);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==BANNER){


            return new BannerViewHolder(mContext,inflater.inflate(R.layout.banner_viewpager,null));
        }else if(viewType==CHANNEL){


        }else if(viewType==ACT){


        }else if(viewType==SECKILL){


        }else if(viewType==RECOMMEND){


        }else if(viewType==HOT){


        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        if(getItemViewType(position)==BANNER){

            BannerViewHolder viewHolder= (BannerViewHolder) holder;

            //绑定数据
            viewHolder.setData(result.getBanner_info());

        }else if(getItemViewType(position)==CHANNEL){


        }else if(getItemViewType(position)==ACT){


        }else if(getItemViewType(position)==SECKILL){


        }else if(getItemViewType(position)==RECOMMEND){


        }else if(getItemViewType(position)==HOT){


        }

    }

    class BannerViewHolder extends RecyclerView.ViewHolder{


        private final Context mContext;

        private TextView tv_title;

        public BannerViewHolder(Context mContext, View itemView) {
            super(itemView);

            this.mContext=mContext;

            tv_title= (TextView) itemView.findViewById(R.id.tv_title);


        }

        public void setData(List<HomeBean.ResultEntity.BannerInfoEntity> banner_info) {

            tv_title.setText("我是Banner的内容--...");
        }
    }

}
