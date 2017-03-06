package net.smartbetter.demo.application;

import android.app.Application;

import net.smartbetter.utilslibrary.LogUtils;

/**
 * Created by gc on 2017/2/21.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.setDebug(true); //Open Log Debug.
    }
}
