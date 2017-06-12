package com.example.android.eftelingtour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jeffrey on 29-5-2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    Context context;

    public CategoryAdapter( Context pContext, FragmentManager fm){
        super(fm);
        context = pContext;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new ScenicRideFragment();
            case 1: return new DarkRideFragment();
            case 2: return new ExcitingRideFragment();
            case 3: return new RollerCoasterFragment();
            default: return new RollerCoasterFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Scenic Rides";
            case 1: return "Dark Rides";
            case 2: return "Exciting Rides";
            case 3: return "Roller Coasters";
            default: return "Coasters";
        }
    }
}
