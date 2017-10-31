package gorchakov.danil.remindme.apadter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gorchakov.danil.remindme.dto.RemindDto;
import gorchakov.danil.remindme.fragment.AbstractTabFragment;
import gorchakov.danil.remindme.fragment.BirthdaysFragment;
import gorchakov.danil.remindme.fragment.HistoryFragment;
import gorchakov.danil.remindme.fragment.IdeasFragment;
import gorchakov.danil.remindme.fragment.TodoFragment;

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    private HistoryFragment historyFragment;

    private List<RemindDto> data;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        this.data = new ArrayList<>();
        initTabsMap(context);
    }

    @Override

    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context){
        tabs = new HashMap<>();
        historyFragment = HistoryFragment.getInstance(context, data);
        tabs.put(0, historyFragment);
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }

    public void setData(List<RemindDto> data) {
        this.data = data;
        historyFragment.refreshData(data);
    }
}
