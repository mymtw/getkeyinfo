package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C15035m6;

/* renamed from: com.google.android.gms.measurement.internal.n6 */
public final class C15044n6<T extends Context & C15035m6> {

    /* renamed from: a */
    public final T f33709a;

    public C15044n6(T t) {
        Preconditions.checkNotNull(t);
        this.f33709a = t;
    }

    /* renamed from: a */
    public final void mo52266a(Intent intent) {
        if (intent == null) {
            mo52268c().f33724g.mo52237a("onRebind called with null intent");
            return;
        }
        mo52268c().f33732o.mo52238b(intent.getAction(), "onRebind called. action");
    }

    /* renamed from: b */
    public final void mo52267b(Intent intent) {
        if (intent == null) {
            mo52268c().f33724g.mo52237a("onUnbind called with null intent");
            return;
        }
        mo52268c().f33732o.mo52238b(intent.getAction(), "onUnbind called for intent. action");
    }

    /* renamed from: c */
    public final C15049o2 mo52268c() {
        return C15103u3.m24641r(this.f33709a, (zzcl) null, (Long) null).mo52016b();
    }
}
