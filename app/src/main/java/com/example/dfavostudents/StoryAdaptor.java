package com.example.dfavostudents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StoryAdaptor extends RecyclerView.Adapter<StoryAdaptor.MyViewHolder> {

    public StoryAdaptor(HomeFragment homeFragment) {
    }

    @NonNull
    @Override
    public StoryAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stroryrecycler, parent, false);
        return new StoryAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdaptor.MyViewHolder holder, int position) {

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