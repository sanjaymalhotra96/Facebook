package com.example.dfavostudents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NotificationAdaptor extends RecyclerView.Adapter<NotificationAdaptor.MyViewHolder> {


    public NotificationAdaptor(NotificationFragment notificationFragment) {
    }

    @NonNull
    @Override
    public NotificationAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_not, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}