package com.example.italent.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.italent.R;
import com.example.italent.home.VideoActivity;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Video_adapter extends RecyclerView.Adapter<com.example.italent.adapter.Video_adapter.HomeViewHolder> {
        Context context;
        List<HomeFeld> homeFeld;
        public Video_adapter(Context context, List<HomeFeld>homeFeld)
        {
            this.context=context;
            this.homeFeld=homeFeld;
        }

        @NonNull
        @Override
        public com.example.italent.adapter.Video_adapter.HomeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(context).inflate(R.layout.card_home, viewGroup, false);

            return new com.example.italent.adapter.Video_adapter.HomeViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull com.example.italent.adapter.Video_adapter.HomeViewHolder homeViewHolder, int i) {
            HomeFeld homeFeld = this.homeFeld.get(i);
            homeViewHolder.user_name.setText(homeFeld.getUser_name());
            homeViewHolder.time_post.setText(homeFeld.getTime_post());
            homeViewHolder.user_image.setImageResource(homeFeld.getUser_image());
            Uri uri = Uri.parse("android.resource://"+context.getPackageName()+"/"+homeFeld.getVideo());

        }

        @Override
        public int getItemCount() {
            return homeFeld.size();
        }


        class HomeViewHolder extends RecyclerView.ViewHolder
        {
            TextView user_name,time_post;
            CircleImageView user_image;
            VideoView video;
            CardView card_home;
            public HomeViewHolder(@NonNull View itemView) {
                super(itemView);
                user_name=itemView.findViewById(R.id.user_name_home);
                time_post=itemView.findViewById(R.id.time_post);
                user_image=itemView.findViewById(R.id.user_image_card_home);
                video=itemView.findViewById(R.id.video_home);
                card_home= itemView.findViewById(R.id.card_home);
                card_home.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int adapterPosition = getAdapterPosition();
                        HomeFeld homeFeld = com.example.italent.adapter.Video_adapter.this.homeFeld.get(adapterPosition);
                        Integer video1 = homeFeld.getVideo();
                        Intent intent=new Intent(context, VideoActivity.class);
                        intent.putExtra("video",video1);
                        (context).startActivity(intent);
                        ((VideoActivity)context).finish();
                    }
                });
            }
        }
    }


