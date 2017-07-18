package cyc.cloudv.view.person_activity.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import cyc.cloudv.R;
import cyc.cloudv.utils.ToastUtil;

/**
 * Created by 47420 on 2017/7/17.
 */

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.FavortiteViewHolder>
        implements View.OnClickListener{
    private Context mContext;
    private static boolean isFavorite = true;//判断是否点击了收藏，在此页面默认为收藏。

    public FavoriteAdapter(Context context) {
        mContext = context;
    }

    @Override
    public FavortiteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_favorite,parent,false);
        FavortiteViewHolder favortiteViewHolder = new FavortiteViewHolder(view);
        return favortiteViewHolder;
    }

    @Override
    public void onBindViewHolder(final FavortiteViewHolder holder, int position) {
        //获取数据后进行操作

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_item_favorite:
                ToastUtil.ShowToast("播放视频");
                break;
            case R.id.btn_favorite_item_favorite:
                ToastUtil.ShowToast("取消喜欢，或者喜欢");
                break;
            case R.id.btn_download_item_favorite:
                ToastUtil.ShowToast("下载");
                break;
            default:
                break;
        }
    }

    public static class FavortiteViewHolder extends RecyclerView.ViewHolder {
        ImageView img_play;//播放视频的照片
        TextView  tv_title;//视频的名称
        TextView tv_content;//视频的简介
        Button btn_favorite;//点击收藏的按钮
        Button btn_download;//点击下载的按钮

        public FavortiteViewHolder(View itemView) {
            super(itemView);
            img_play = itemView.findViewById(R.id.img_item_favorite);
            tv_title = itemView.findViewById(R.id.tv_title_item_favorite);
            tv_content = itemView.findViewById(R.id.tv_content_item_favorite);
            btn_favorite = itemView.findViewById(R.id.btn_favorite_item_favorite);
            btn_download = itemView.findViewById(R.id.btn_download_item_favorite);

        }
    }
}
