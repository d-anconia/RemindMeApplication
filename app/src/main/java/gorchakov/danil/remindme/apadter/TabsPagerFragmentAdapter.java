package gorchakov.danil.remindme.apadter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import gorchakov.danil.remindme.fragment.ExampleFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private String [] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab 1",
                "Напоминания",
                "Tab 2"
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}