package com.example.dfavostudents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FacebookAdaptor extends RecyclerView.Adapter<FacebookAdaptor.MyViewHolder> {

    public FacebookAdaptor(HomeFragment homeFragment) {
    }

    @NonNull
    @Override
    public FacebookAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.facebook_recyclerview, parent, false);
        return new FacebookAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FacebookAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    {
    }
}