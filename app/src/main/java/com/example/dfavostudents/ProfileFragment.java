package com.example.dfavostudents;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class ProfileFragment extends Fragment {

    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    AllFreinds allFreinds;
    RecyclerView recyclerView1;
    LinearLayoutManager linearLayoutManager1;
    FacebookAdaptor2 facebookAdaptor2;
    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_profile, container, false);
        recyclerView=view.findViewById(R.id.allfreinds_recyclerview);
        recyclerView1=view.findViewById(R.id.recyclerview122);
        allFreinds = new AllFreinds(ProfileFragment.this);
        gridLayoutManager = new GridLayoutManager( view.getContext(),4,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(allFreinds);

        facebookAdaptor2 = new FacebookAdaptor2(ProfileFragment.this);
        linearLayoutManager1 = new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(facebookAdaptor2);


        return view;
    }

}