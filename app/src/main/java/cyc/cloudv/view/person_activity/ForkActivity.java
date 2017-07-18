package cyc.cloudv.view.person_activity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cyc.cloudv.R;
import cyc.cloudv.base.BaseActivity;
import cyc.cloudv.utils.ToastUtil;
import cyc.cloudv.view.person_activity.adapter.ForkAdapter;

/**
 * Created by 47420 on 2017/7/18.
 */

public class ForkActivity extends BaseActivity implements View.OnClickListener{
    private Button btn_ok,btn_back;
    private TextView tv_academy;//选择的学院
    private RecyclerView recycler_view_fork;

    @Override
    public int getLayoutId() {
        return R.layout.activity_fork;
    }

    @Override
    public void initViews() {
        btn_ok = (Button) findViewById(R.id.btn_ok_activity_fork);
        btn_back = (Button) findViewById(R.id.btn_back_activity_fork);
        tv_academy = (TextView) findViewById(R.id.tv_academy_fork_activity);
        recycler_view_fork = (RecyclerView) findViewById(R.id.recycler_view_fork_activity);
        recycler_view_fork.setAdapter(new ForkAdapter(this));
        recycler_view_fork.setLayoutManager(new GridLayoutManager(this,2,
                LinearLayoutManager.VERTICAL,false));
        btn_back.setOnClickListener(this);
        btn_ok.setOnClickListener(this);
    }

    @Override
    public void setupView(Bundle bundle) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_back_activity_fork:
                finish();
                break;
            case R.id.btn_ok_activity_fork:

                ToastUtil.ShowToast("确定");
                finish();
                break;
            default:
                break;
        }
    }
}
