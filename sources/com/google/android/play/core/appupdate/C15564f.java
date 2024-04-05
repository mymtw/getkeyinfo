package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.measurement.internal.C15032m3;
import p622ml.C18245b;
import p639ol.C18316c;

/* renamed from: com.google.android.play.core.appupdate.f */
public final class C15564f extends C18316c {
    public C15564f(Context context) {
        super(new C15032m3("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* renamed from: a */
    public final void mo55341a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f40209a.mo52242b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
            return;
        }
        this.f40209a.mo52242b("List of extras in received intent:", new Object[0]);
        for (String next : intent.getExtras().keySet()) {
            this.f40209a.mo52242b("Key: %s; value: %s", next, intent.getExtras().get(next));
        }
        C15032m3 m3Var = this.f40209a;
        m3Var.mo52242b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        m3Var.mo52242b("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        m3Var.mo52242b("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        C18245b bVar = new C18245b(intent2.getIntExtra("install.status", 0), intent2.getIntExtra("error.code", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getStringExtra("package.name"));
        this.f40209a.mo52242b("ListenerRegistryBroadcastReceiver.onReceive: %s", bVar);
        mo69856e(bVar);
    }
}
