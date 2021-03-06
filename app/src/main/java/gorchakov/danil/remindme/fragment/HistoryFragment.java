package gorchakov.danil.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import gorchakov.danil.remindme.R;
import gorchakov.danil.remindme.apadter.RemindListAdapter;
import gorchakov.danil.remindme.dto.RemindDto;

public class HistoryFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_history;

    private List<RemindDto> data;
    private RemindListAdapter adapter;

    public static HistoryFragment getInstance(Context context, List<RemindDto> data) {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setData(data);
        fragment.setTitle(context.getString(R.string.tab_item_history));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        adapter = new RemindListAdapter(data);
        recyclerView.setAdapter(adapter);
        return view;
    }

//    private List<RemindDto> createMockRemindListData() {
//        List<RemindDto> data = new ArrayList<>();
//        data.add(new RemindDto("Item 1"));
//        data.add(new RemindDto("Item 2"));
//        data.add(new RemindDto("Item 3"));
//        data.add(new RemindDto("Item 4"));
//        data.add(new RemindDto("Item 5"));
//        data.add(new RemindDto("Item 6"));
//        return data;
//    }


    public void setContext(Context context) {
        this.context = context;
    }

    public void setData(List<RemindDto> data) {
        this.data = data;
    }

    public void refreshData(List<RemindDto> data){
        adapter.setData(data);
        adapter.notifyDataSetChanged();
    }
}
