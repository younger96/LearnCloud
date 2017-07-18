package cyc.cloudv.view.person_activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import cyc.cloudv.R;
import cyc.cloudv.base.BaseActivity;

/**
 * Created by 47420 on 2017/7/18.下载界面
 */

public class DownloadActivity extends BaseActivity {
    private Button btn_back;
    //正在下载和已经下载的Recyclerview
    private RecyclerView mRecyclerView_downloading,mRecyclerView_downloaded;
    @Override
    public int getLayoutId() {
        return R.layout.activity_download;
    }

    @Override
    public void initViews() {
        btn_back = (Button) findViewById(R.id.btn_back_activity_download);
        mRecyclerView_downloaded = (RecyclerView) findViewById(R.id.recycler_view_downloaded_activity);
        mRecyclerView_downloading = (RecyclerView) findViewById(R.id.recycler_view_downloading_activity);
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
