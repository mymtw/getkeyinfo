package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import p193o.C7494b;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C14920a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f33255b;

    /* renamed from: c */
    public final /* synthetic */ long f33256c;

    /* renamed from: d */
    public final /* synthetic */ C14985h1 f33257d;

    public C14920a(C14985h1 h1Var, String str, long j) {
        this.f33257d = h1Var;
        this.f33255b = str;
        this.f33256c = j;
    }

    public final void run() {
        C14985h1 h1Var = this.f33257d;
        String str = this.f33255b;
        long j = this.f33256c;
        h1Var.mo51995g();
        Preconditions.checkNotEmpty(str);
        if (h1Var.f33551d.isEmpty()) {
            h1Var.f33552e = j;
        }
        Integer num = (Integer) h1Var.f33551d.getOrDefault(str, null);
        if (num != null) {
            h1Var.f33551d.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        C7494b bVar = h1Var.f33551d;
        if (bVar.f16745d >= 100) {
            ((C15103u3) h1Var.f33681b).mo52016b().f33727j.mo52237a("Too many ads visible");
            return;
        }
        bVar.put(str, 1);
        h1Var.f33550c.put(str, Long.valueOf(j));
    }
}
