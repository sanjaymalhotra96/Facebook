package com.example.dfavostudents;


import android.content.Context;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdaptor2 extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;




    public MyAdaptor2(Facebook context, androidx.fragment.app.FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = context;
        this.totalTabs = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                FreindFragment freindFragment = new FreindFragment();
                return freindFragment;
            case 2:
                AddFragment addFragment = new AddFragment();
                return addFragment;
            case 3:
                ProfileFragment profileFragment = new ProfileFragment();
                return profileFragment;
            case 4:
                NotificationFragment notificationFragment = new NotificationFragment();
                return notificationFragment;
            case 5:
                MenuFragment menuFragment = new MenuFragment();
                return menuFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
