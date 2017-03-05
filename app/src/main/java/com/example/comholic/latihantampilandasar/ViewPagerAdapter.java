package com.example.comholic.latihantampilandasar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.comholic.latihantampilandasar.fragment.FragmentExpenses;
import com.example.comholic.latihantampilandasar.fragment.FragmentIncomes;
import com.example.comholic.latihantampilandasar.fragment.FragmentMainTab;
import com.example.comholic.latihantampilandasar.fragment.FragmentOverview;
import com.example.comholic.latihantampilandasar.fragment.FragmentStart;

/**
 * Created by ComHolic on 8/3/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    int tabCount;
    public ViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        FragmentMainTab fragmentMainTab;
        FragmentExpenses fragmentExpenses;
        FragmentIncomes fragmentIncomes;
        FragmentOverview fragmentOverview;
        FragmentStart fragmentStart;

        switch(position) {
            case 0:
                fragmentMainTab = new FragmentMainTab();
                return fragmentMainTab;
            case 1:
                fragmentExpenses = new FragmentExpenses();
                return fragmentExpenses;
            case 2:
                fragmentIncomes = new FragmentIncomes();
                return fragmentIncomes;
            case 3:
                fragmentOverview = new FragmentOverview();
                return fragmentOverview;
            case 4:
                fragmentStart = new FragmentStart();
                return fragmentStart;
            default:
                fragmentMainTab = new FragmentMainTab();
                return fragmentMainTab;

        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
