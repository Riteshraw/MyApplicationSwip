package com.example.myswipeabletabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ritesh on 4/17/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int numTabs;

    public PagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        return new MyTabFragment();
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
