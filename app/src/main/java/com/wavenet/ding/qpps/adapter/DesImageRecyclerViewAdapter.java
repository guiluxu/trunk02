package com.wavenet.ding.qpps.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.wavenet.ding.qpps.R;

import java.util.ArrayList;

public class DesImageRecyclerViewAdapter extends RecyclerView.Adapter<DesImageRecyclerViewAdapter.MyViewHolder> {

    final ArrayList<String> imaDatas;
    Context context;
    private OnItemClickListener mOnItemClickListener = null;

    public DesImageRecyclerViewAdapter(Context context, final ArrayList<String> company_license) {
        this.context = context;
        this.imaDatas = company_license;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_image, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    //注意这里使用getTag方法获取position
                    mOnItemClickListener.onItemClick(v, (int) v.getTag());
                }
            }
        });
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.itemView.setTag(position);
        RequestOptions options = new RequestOptions();
        holder.iv_video.setVisibility(View.GONE);
        if (imaDatas.get(position).contains("视频")){
            holder.iv_video.setVisibility(View.VISIBLE);
        }
        String url=imaDatas.get(position).replace("视频","");

        if (url.contains("语音")){
            Glide.with(context)
                    .load(R.mipmap.img_xiangq_yuyin).apply(options)
                    .into(holder.imageView);
        }else {
            Glide.with(context)
                    .load(url).apply(options)
                    .into(holder.imageView);
        }


    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    @Override
    public int getItemCount() {
        return imaDatas.size();
    }


    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        View view;
        ImageView imageView,iv_video;

        public MyViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            imageView = view.findViewById(R.id.iv);

            iv_video = view.findViewById(R.id.iv_video);

        }
    }

}
