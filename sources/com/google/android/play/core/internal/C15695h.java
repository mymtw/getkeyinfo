package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.core.internal.h */
public final class C15695h implements ServiceConnection {

    /* renamed from: b */
    public final /* synthetic */ C15697i f35458b;

    public /* synthetic */ C15695h(C15697i iVar) {
        this.f35458b = iVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f35458b.f35462b.mo52245e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C15697i iVar = this.f35458b;
        iVar.mo55522a().post(new C15691f(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f35458b.f35462b.mo52245e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C15697i iVar = this.f35458b;
        iVar.mo55522a().post(new C15693g(this));
    }
}
