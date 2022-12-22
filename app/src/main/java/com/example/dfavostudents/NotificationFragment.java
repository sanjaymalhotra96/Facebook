package com.example.dfavostudents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NotificationFragment extends Fragment {

    RecyclerView recyclerView;
    NotificationAdaptor notificationAdaptor;
    LinearLayoutManager linearLayoutManager;


    public NotificationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view =inflater.inflate(R.layout.notification_fragment, container, false);
        recyclerView = view.findViewById(R.id.notification_recyclerview);

        // Add the following lines to create RecyclerView
        notificationAdaptor = new NotificationAdaptor(NotificationFragment.this);
        linearLayoutManager = new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(notificationAdaptor);

        return  view;
    }
}
