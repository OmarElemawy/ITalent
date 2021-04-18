package com.example.italent.home;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.italent.R;
import com.example.italent.adapter.HomeFeld;
import com.example.italent.adapter.Video_adapter;

import java.util.ArrayList;
import java.util.List;

public class VideoActivity extends AppCompatActivity {
    VideoView video_show;
    RecyclerView recyclerView;
    Video_adapter video_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        int video = getIntent().getExtras().getInt("video");
        video_show =findViewById(R.id.video_show);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+video);
        video_show.setVideoURI(uri);
        video_show.start();
        recyclerView=findViewById(R.id.more_videos);
        video_adapter=new Video_adapter(this,allFild());
        recyclerView.setAdapter(video_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private List<HomeFeld> allFild() {
        List<HomeFeld> homeFeld=new ArrayList<>();
        homeFeld.add(new HomeFeld("Omar Elemawy","10s",R.drawable.ic_profile,R.raw.dubstepbird));
        homeFeld.add(new HomeFeld("Omar Elemawy","10s",R.drawable.ic_profile,R.raw.dubstepbird));
        homeFeld.add(new HomeFeld("Omar Elemawy","10s",R.drawable.ic_profile,R.raw.dubstepbird));
        homeFeld.add(new HomeFeld("Omar Elemawy","10s",R.drawable.ic_profile,R.raw.dubstepbird));
        homeFeld.add(new HomeFeld("Omar Elemawy","10s",R.drawable.ic_profile,R.raw.dubstepbird));
        homeFeld.add(new HomeFeld("Omar Elemawy","10s",R.drawable.ic_profile,R.raw.dubstepbird));
        homeFeld.add(new HomeFeld("Omar Elemawy","10s",R.drawable.ic_profile,R.raw.dubstepbird));
        return homeFeld;
    }
}
