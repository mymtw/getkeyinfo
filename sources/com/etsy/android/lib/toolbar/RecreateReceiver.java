package com.etsy.android.lib.toolbar;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;

public final class RecreateReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        int i = C8860a.f19556m;
        WeakReference<Activity> weakReference = C8860a.f19557n;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null) {
            activity.recreate();
        }
    }
}
