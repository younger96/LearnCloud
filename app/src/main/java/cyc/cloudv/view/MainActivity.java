package cyc.cloudv.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import cyc.cloudv.R;
import cyc.cloudv.base.SingleFragmentActivity;
import cyc.cloudv.view.fragment.PersonFragment;
import cyc.cloudv.view.fragment.RankFragment;
import cyc.cloudv.view.fragment.SortFragment;

public class MainActivity extends SingleFragmentActivity {

    private TextView mTextMessage;

    @Override
    protected Fragment createFragment() {
        return new SortFragment().getInstanse();
    }


    @Override
    protected void init() {


    }

}
