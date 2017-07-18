package cyc.cloudv.view.sort_activity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import cyc.cloudv.R;
import cyc.cloudv.base.BaseActivity;
import cyc.cloudv.view.fragment.SortFragment;
import cyc.cloudv.view.sort_activity.adapter.SortOutAdapter;

/**
 * Created by 47420 on 2017/7/18.
 */

public class SortOutActivity extends BaseActivity {
    private static SortFragment mSortFragment;
    private RecyclerView mRecyclerView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_sort;
    }

    @Override
    public void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_activity_sort);
        mRecyclerView.setAdapter(new SortOutAdapter(this));
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2,
                GridLayoutManager.VERTICAL,false));

    }

    @Override
    public void setupView(Bundle bundle) {

    }
}
