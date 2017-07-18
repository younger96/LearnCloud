package cyc.cloudv.view.person_activity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import cyc.cloudv.R;


/**
 * Created by 47420 on 2017/7/17.
 */

public class ForkAdapter extends RecyclerView.Adapter<ForkAdapter.ForkViewHolder> {
    private Context mContext;

    public ForkAdapter(Context context) {
        mContext = context;
    }

    @Override
    public ForkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_fork,parent,false);
        ForkViewHolder mForkViewHolder = new ForkViewHolder(view);
        return mForkViewHolder;
    }

    @Override
    public void onBindViewHolder(ForkViewHolder holder, int position) {
        //获取数据后进行操作
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public static class ForkViewHolder extends RecyclerView.ViewHolder {
        CheckBox mCheckBox;
        TextView mTextView;
        public ForkViewHolder(View itemView) {
            super(itemView);
            mCheckBox = itemView.findViewById(R.id.checkbox_item_fork);
            mTextView = itemView.findViewById(R.id.tv_item_fork);
        }
    }
}
