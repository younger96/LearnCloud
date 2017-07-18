package cyc.cloudv.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import cyc.cloudv.R;
import cyc.cloudv.base.BaseFragment;
import cyc.cloudv.utils.ToastUtil;
import cyc.cloudv.view.person_activity.DownloadActivity;
import cyc.cloudv.view.person_activity.FavoriteActivity;
import cyc.cloudv.view.person_activity.ForkActivity;

/**
 * Created by 47420 on 2017/7/17.主页中的个人界面
 */

public class PersonFragment extends BaseFragment implements View.OnClickListener {
    private static PersonFragment sPersonFragment;
    private TextView tv_name;
    private LinearLayout mLayout_download, mLayout_favorite, mLayout_fork;//下载，喜欢，和关注的区域设置成为按钮

    /**
     * 单例
     *
     * @return
     */
    public PersonFragment getInstanse() {
        if (sPersonFragment == null) {
            sPersonFragment = new PersonFragment();
        }
        return sPersonFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_person;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        tv_name = view.findViewById(R.id.tv_name_fragment_person);
        mLayout_download = view.findViewById(R.id.btn_download_fragment_person);
        mLayout_favorite = view.findViewById(R.id.btn_favorite_fragment_person);
        mLayout_fork = view.findViewById(R.id.btn_fork_fragment_person);

        mLayout_fork.setOnClickListener(this);
        mLayout_favorite.setOnClickListener(this);
        mLayout_download.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_download_fragment_person:
                //启动下载界面
                startActivity(new Intent(getActivity(), DownloadActivity.class));
                ToastUtil.ShowToast("1");
                break;
            case R.id.btn_favorite_fragment_person:
                startActivity(new Intent(getActivity(), FavoriteActivity.class));
                ToastUtil.ShowToast("2");
                break;
            case R.id.btn_fork_fragment_person:
                startActivity(new Intent(getActivity(), ForkActivity.class));
                ToastUtil.ShowToast("3");
                break;
            default:
                break;
        }
    }
}
