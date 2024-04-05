package dagger.android;

import android.app.Application;
import android.content.ContentProvider;
import androidx.compose.foundation.layout.C0761x;
import p643op.C18335a;

public abstract class DaggerContentProvider extends ContentProvider {
    public boolean onCreate() {
        Application application = (Application) getContext().getApplicationContext();
        if (application instanceof C18335a) {
            C0761x.m1735n0(this, (C18335a) application);
            return true;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C18335a.class.getCanonicalName()}));
    }
}
