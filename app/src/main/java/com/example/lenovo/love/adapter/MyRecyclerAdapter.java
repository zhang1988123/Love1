package com.example.lenovo.love.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.lenovo.love.R;
import com.example.lenovo.love.bean.Bean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by lenovo
 * on 2018/5/11.
 * at 北京
 */
public class MyRecyclerAdapter extends BaseQuickAdapter<Bean, BaseViewHolder> {

    public MyRecyclerAdapter(int layoutResId, @Nullable List<Bean> data) {
        super(layoutResId, data);
    }
    @Override
    protected void convert(BaseViewHolder helper, Bean item) {
        helper.setText(R.id.mText,item.getTitle());
        helper.setText(R.id.mUrl,item.getUrl());

        Glide.with(mContext).load(item.getImg()).into((ImageView) helper.getView(R.id.mImg));
    }
}
