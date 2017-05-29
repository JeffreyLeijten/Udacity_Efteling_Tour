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
        return new RollerCoasterFragment();
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Coasters";
    }
}
