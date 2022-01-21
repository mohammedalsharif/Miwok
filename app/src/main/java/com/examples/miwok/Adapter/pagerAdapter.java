package com.examples.miwok.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.examples.miwok.model.MyTab;

import java.util.ArrayList;

public class pagerAdapter extends FragmentStatePagerAdapter {
   ArrayList<MyTab> listTab=new ArrayList<>();

    public pagerAdapter(@NonNull FragmentManager fm) {
        super(fm);

    }
    public  void addTab(MyTab tab){
        listTab.add(tab);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        MyTab tab = listTab.get(position);
        return tab.getFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        MyTab tab = listTab.get(position);
        return tab.getName();
    }

    @Override
    public int getCount() {
        return listTab.size();
    }
}
