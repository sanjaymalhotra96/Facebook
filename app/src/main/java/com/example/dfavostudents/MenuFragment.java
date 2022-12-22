package com.example.dfavostudents;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class MenuFragment extends Fragment {

    RecyclerView recyclerView;
    ShortcutAdaptor shortcutAdaptor;
    StaggeredGridLayoutManager staggeredGridLayoutManager;

    public MenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.menu_fragment, container, false);

        View view=inflater.inflate(R.layout.menu_fragment,container,false);
        recyclerView=view.findViewById(R.id.shortcuts_recyclerview);
        shortcutAdaptor= new ShortcutAdaptor(MenuFragment.this);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(shortcutAdaptor);

        return  view;

    }
}