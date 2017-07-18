package cyc.cloudv.application;

import android.app.Application;
import android.content.Context;

/**
 * Created by 47420 on 2017/7/17.
 */

public class App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

    }

    public static Context getContext() {
        return context;
    }
}
