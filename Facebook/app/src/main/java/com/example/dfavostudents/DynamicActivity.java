package com.example.dfavostudents;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout mTabLayout;

    ArrayList<String> Tabvalues  = new ArrayList<>(Arrays.asList("manish", "Kulwinder", "hari","money","kashish","manoj","gurjit","manjit","naman","karan"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
        initViews();
    }


    private void initViews() {
        viewPager = findViewById(R.id.viewpager);
        mTabLayout = findViewById(R.id.tabs);
        viewPager.setOffscreenPageLimit(5);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        setDynamicFragmentToTabLayout();
    }


    private void setDynamicFragmentToTabLayout() {
        for (int i = 0; i < 10; i++) {

            mTabLayout.addTab(mTabLayout.newTab().setText(Tabvalues.get(i)));
        }
        DynamicFragmentAdapter mDynamicFragmentAdapter = new DynamicFragmentAdapter(getSupportFragmentManager(), mTabLayout.getTabCount(),Tabvalues);

        viewPager.setAdapter(mDynamicFragmentAdapter);

        viewPager.setCurrentItem(0);
    }
}
