package cyc.cloudv.view.sort_activity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cyc.cloudv.R;

/**
 * Created by 47420 on 2017/7/17.
 */

public class SortOutAdapter extends RecyclerView.Adapter<SortOutAdapter.SortViewHolder> {
    private Context mContext;

    public SortOutAdapter(Context context) {
        mContext = context;
    }

    @Override
    public SortViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_card_view,parent,false);
        SortViewHolder sortViewHolder = new SortViewHolder(view);
        return sortViewHolder;
    }

    @Override
    public void onBindViewHolder(SortViewHolder holder, int position) {
        //获取数据后进行操作
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class SortViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;

        public SortViewHolder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_item_view);

        }
    }
}
