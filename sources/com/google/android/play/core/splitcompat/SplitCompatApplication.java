package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import p665rl.C18483a;

public class SplitCompatApplication extends Application {
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C18483a.m31187c(this, false);
    }
}
