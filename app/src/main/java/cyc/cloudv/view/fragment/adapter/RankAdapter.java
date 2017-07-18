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

public class RankAdapter extends RecyclerView.Adapter<RankAdapter.RankViewHolder> {
    private Context mContext;

    public RankAdapter(Context context) {
        mContext = context;
    }

    @Override
    public RankViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_rank,parent,false);
        RankViewHolder sortViewHolder = new RankViewHolder(view);
        return sortViewHolder;
    }

    @Override
    public void onBindViewHolder(RankViewHolder holder, int position) {
        //获取数据后进行操作
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class RankViewHolder extends RecyclerView.ViewHolder {
        TextView tv_num;
        TextView tv_name;
        TextView tv_time;
        CircleImageView mCircleImageView;
        public RankViewHolder(View itemView) {
            super(itemView);
            tv_num = itemView.findViewById(R.id.tv_num_item_rank);
            tv_name = itemView.findViewById(R.id.tv_name_item_rank);
            tv_time = itemView.findViewById(R.id.tv_time_item_rank);
            mCircleImageView = itemView.findViewById(R.id.image_view_item_rank);

        }
    }
}
