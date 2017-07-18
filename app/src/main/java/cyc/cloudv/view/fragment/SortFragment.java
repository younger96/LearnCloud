package cyc.cloudv.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import cyc.cloudv.R;
import cyc.cloudv.base.BaseFragment;
import cyc.cloudv.view.fragment.adapter.SortAdapter;
import cyc.cloudv.view.sort_activity.SortOutActivity;

/**
 * Created by 47420 on 2017/7/17.
 */

public class SortFragment extends BaseFragment {
    private static SortFragment mSortFragment;
    private LinearLayout mLayout_sort;//点击进入分类界面，设置布局为按钮
    private RecyclerView mRecyclerView;

    /**
     * 单例
     * @return
     */
    public SortFragment getInstanse() {
        if (mSortFragment == null) {
            mSortFragment = new SortFragment();
        }
        return mSortFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_sort;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        mLayout_sort = view.findViewById(R.id.layout_sort_fragment);
        mRecyclerView = view.findViewById(R.id.recycler_view_fragment_sort);
        mRecyclerView.setAdapter(new SortAdapter(getActivity()));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //跳转到分类页面
        mLayout_sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),SortOutActivity.class));
            }
        });
    }


}
