package com.example.dfavostudents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptor extends ArrayAdapter<SpinnerItems> {
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    public MyAdaptor(@NonNull Context context, ArrayList<SpinnerItems> spinnerItems) {
        super(context, 0,spinnerItems);
    }

    private View initView(int position,View convertView,ViewGroup parent){
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.spinner_layout,parent,false);
        }


        TextView textView=convertView.findViewById(R.id.tvCust);
        SpinnerItems spinnerItems=getItem(position);
        textView.setText(spinnerItems.getYear());
        return convertView;
    }
}
