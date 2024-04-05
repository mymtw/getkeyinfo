package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.EnhancedIntentService;
import p605kk.C18124h;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
public final /* synthetic */ class C15111v3 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33909b;

    /* renamed from: c */
    public /* synthetic */ Object f33910c;

    /* renamed from: d */
    public /* synthetic */ Object f33911d;

    /* renamed from: e */
    public /* synthetic */ Object f33912e;

    public /* synthetic */ C15111v3(Object obj, int i, Object obj2, Object obj3) {
        this.f33909b = i;
        this.f33910c = obj;
        this.f33911d = obj2;
        this.f33912e = obj3;
    }

    public final void run() {
        switch (this.f33909b) {
            case 0:
                ((zzgn) this.f33910c).zzx((String) this.f33911d, (Bundle) this.f33912e);
                return;
            default:
                ((EnhancedIntentService) this.f33910c).mo59147x624ce8b2((Intent) this.f33911d, (C18124h) this.f33912e);
                return;
        }
    }
}
