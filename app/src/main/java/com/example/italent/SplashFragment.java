package com.example.italent;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends Fragment {

    private ImageView image;

    public SplashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_splash, container, false);
        image=v.findViewById(R.id.image_splash);
        Animation animation= AnimationUtils.loadAnimation(getContext(),R.anim.go_up);
        animation.setDuration(1200);
        return v;
    }


}
