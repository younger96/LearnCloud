package cyc.cloudv.view.fragment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cyc.cloudv.R;
import cyc.cloudv.custom.CircleImageView;


/**
 * Created by 47420 on 2017/7/17.
 */

public class SortAdapter extends RecyclerView.Adapter<SortAdapter.SortViewHolder> {
    private Context mContext;

    public SortAdapter(Context context) {
        mContext = context;
    }

    @Override
    public SortViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_video,parent,false);
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

        public SortViewHolder(View itemView) {
            super(itemView);


        }
    }
}
