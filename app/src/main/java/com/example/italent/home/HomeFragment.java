package com.example.italent.home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.italent.R;
import com.example.italent.adapter.HomeFeld;
import com.example.italent.adapter.HomeRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    HomeRecyclerAdapter homeRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=v.findViewById(R.id.recyclerView_home);

        homeRecyclerAdapter=new HomeRecyclerAdapter(getContext(),allFild());
        recyclerView.setAdapter(homeRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
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
