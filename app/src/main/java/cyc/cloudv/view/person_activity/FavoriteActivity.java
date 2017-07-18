package cyc.cloudv.view.person_activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import cyc.cloudv.R;
import cyc.cloudv.base.BaseActivity;
import cyc.cloudv.view.person_activity.adapter.FavoriteAdapter;

/**
 * Created by 47420 on 2017/7/18.收藏/喜欢界面
 */

public class FavoriteActivity extends BaseActivity {
    private Button btn_back;
    //正在下载和已经下载的Recyclerview
    private RecyclerView mRecyclerView_favorite;


    @Override
    public int getLayoutId() {
        return R.layout.activity_favorite;
    }

    @Override
    public void initViews() {
        btn_back = (Button) findViewById(R.id.btn_back_activity_favorite);
        mRecyclerView_favorite = (RecyclerView) findViewById(R.id.recycler_view_favorite);
        mRecyclerView_favorite.setAdapter(new FavoriteAdapter(this));
        mRecyclerView_favorite.setLayoutManager(new LinearLayoutManager(this));
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void setupView(Bundle bundle) {

    }
}
