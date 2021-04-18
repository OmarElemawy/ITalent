package com.example.italent.profile;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import com.example.italent.Follower.FollowingActivity;
import com.example.italent.R;


public class ProfileFragment  extends Fragment {
    LinearLayout followers,following;

    public ProfileFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.profile_fragment, container, false);
        followers= v.findViewById(R.id.followers_id);
        following = v.findViewById(R.id.following_id);

        goToFollowers();
        goToFollowing();


        return v;
    }


    private void goToFollowing() {
        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), FollowingActivity.class);
                startActivity(intent);
            }
        });
    }

    private void goToFollowers() {

        followers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), FollowingActivity.class);
                startActivity(intent);
            }
        });
    }

}
