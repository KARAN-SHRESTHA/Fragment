package com.n.fragment;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class viewPager_activity extends AppCompatActivity{


    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            tabLayout = findViewById(R.id.tabId);
            viewPager = findViewById(R.id.viewPager);

            viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager());

            adapter.addFragment(new FirstFragment(), "Sum");
            adapter.addFragment(new SecondFragment(), "Area of Circle");

            viewPager.setAdapter(adapter);
            tabLayout.setupWithViewPager(viewPager);


    }

}
