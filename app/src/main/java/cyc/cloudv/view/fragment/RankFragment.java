package cyc.cloudv.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import cyc.cloudv.R;
import cyc.cloudv.base.BaseFragment;
import cyc.cloudv.view.fragment.adapter.RankAdapter;

/**
 * Created by 47420 on 2017/7/17.
 */

public class RankFragment extends BaseFragment {


    private static RankFragment sRankFragment;
    private RecyclerView mRecyclerView;

    /**
     * 单例
     * @return
     */
    public RankFragment getInstanse() {
        if (sRankFragment == null) {
            sRankFragment = new RankFragment();
        }
        return sRankFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_rank;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        mRecyclerView = view.findViewById(R.id.recycler_view_fragment_sort);
        mRecyclerView.setAdapter(new RankAdapter(getActivity()));
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1,
                GridLayoutManager.VERTICAL,false));
    }
}
