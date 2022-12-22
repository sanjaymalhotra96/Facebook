package com.example.dfavostudents;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class AddFragment extends Fragment {

    RecyclerView recyclerView;
    StaggeredGridLayoutManager staggeredGridLayoutManager;
    AddFragmentAdaptor addFragmentAdapter;

    public AddFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add, container, false);
        recyclerView=view.findViewById(R.id.freinds_recyclerview);
        // Add the following lines to create RecyclerView
        addFragmentAdapter = new AddFragmentAdaptor(AddFragment.this);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager( 2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(addFragmentAdapter);
        // Inflate the layout for this fragment
        return view;
    }
}