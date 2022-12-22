package com.example.dfavostudents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FriendAdaptor extends RecyclerView.Adapter<FriendAdaptor.MyViewHolder> {

    public FriendAdaptor(FreindFragment freindFragment) {
    }

    @NonNull
    @Override
    public FriendAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.people, parent, false);
        return new FriendAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendAdaptor.MyViewHolder holder, int position) {

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