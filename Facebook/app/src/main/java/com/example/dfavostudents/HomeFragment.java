package com.example.dfavostudents;



import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    StoryAdaptor storyAdaptor;
    RecyclerView recyclerView1;
    LinearLayoutManager linearLayoutManager1;
    FacebookAdaptor facebookAdaptor;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerview11);
        recyclerView1=view.findViewById(R.id.recyclerview12);
        // Add the following lines to create RecyclerView
        storyAdaptor = new StoryAdaptor(HomeFragment.this);
        linearLayoutManager = new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(storyAdaptor);

        facebookAdaptor = new FacebookAdaptor(HomeFragment.this);
        linearLayoutManager1 = new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(facebookAdaptor);

        return view;


    }




}
