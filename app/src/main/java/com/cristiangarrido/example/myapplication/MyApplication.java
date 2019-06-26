package com.cristiangarrido.example.myapplication;

import android.os.Handler;
import android.util.Log;
import androidx.multidex.MultiDexApplication;


public class MyApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        new Handler().post(() -> Log.d("From lambda", "It logs!"));
    }
}
