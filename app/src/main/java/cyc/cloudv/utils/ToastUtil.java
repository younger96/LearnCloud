package cyc.cloudv.utils;

import android.widget.Toast;

import cyc.cloudv.application.App;

/**
 * Created by 47420 on 2017/7/17.
 */

public class ToastUtil {
    public static void ShowToast(String content){
        Toast.makeText(App.getContext(),content,Toast.LENGTH_SHORT).show();
    }
}
