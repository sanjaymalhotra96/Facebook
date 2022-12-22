package com.example.dfavostudents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class DynamicFragmentAdapter extends FragmentStatePagerAdapter {
    private int mNumOfTabs;
    ArrayList<String> Tabvalues2 = new ArrayList<>();


    DynamicFragmentAdapter(FragmentManager fm, int NumOfTabs, ArrayList<String> tabvalues) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.Tabvalues2=tabvalues;
    }


    @Override
    public Fragment getItem(int position) {
        Bundle b = new Bundle();
        b.putInt("position", position);
        b.putStringArrayList("values", Tabvalues2);
        Fragment frag = DynamicFragment.newInstance();
        frag.setArguments(b);
        return frag;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}