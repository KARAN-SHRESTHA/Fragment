package com.n.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewPagerAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragmentlist = new ArrayList<>();
    private List<String> fragmentTitle = new ArrayList<>();

    public viewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentlist.get(i);
    }

    @Override
    public int getCount() {
        return fragmentlist.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }


    public void addFragment(Fragment fragment, String title)
    {
        fragmentlist.add(fragment);
        fragmentTitle.add(title);
    }

}
