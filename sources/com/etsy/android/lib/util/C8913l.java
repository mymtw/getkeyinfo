package com.etsy.android.lib.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.etsy.android.lib.util.l */
public final class C8913l extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ CrashUtil f19668a;

    public C8913l(CrashUtil crashUtil) {
        this.f19668a = crashUtil;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "com.etsy.etsyconfig.updated".equals(intent.getAction())) {
            this.f19668a.mo30459d(context.getApplicationContext());
        }
    }
}
