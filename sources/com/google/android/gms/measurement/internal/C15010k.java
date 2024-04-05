package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

/* renamed from: com.google.android.gms.measurement.internal.k */
public abstract class C15010k {

    /* renamed from: d */
    public static volatile zzby f33620d;

    /* renamed from: a */
    public final C15051o4 f33621a;

    /* renamed from: b */
    public final C15001j f33622b;

    /* renamed from: c */
    public volatile long f33623c;

    public C15010k(C15051o4 o4Var) {
        Preconditions.checkNotNull(o4Var);
        this.f33621a = o4Var;
        this.f33622b = new C15001j(0, this, o4Var);
    }

    /* renamed from: a */
    public final void mo52168a() {
        this.f33623c = 0;
        mo52170d().removeCallbacks(this.f33622b);
    }

    /* renamed from: b */
    public abstract void mo51941b();

    /* renamed from: c */
    public final void mo52169c(long j) {
        mo52168a();
        if (j >= 0) {
            this.f33623c = this.f33621a.mo52017c().currentTimeMillis();
            if (!mo52170d().postDelayed(this.f33622b, j)) {
                this.f33621a.mo52016b().f33724g.mo52238b(Long.valueOf(j), "Failed to schedule delayed post. time");
            }
        }
    }

    /* renamed from: d */
    public final Handler mo52170d() {
        zzby zzby;
        if (f33620d != null) {
            return f33620d;
        }
        synchronized (C15010k.class) {
            if (f33620d == null) {
                f33620d = new zzby(this.f33621a.mo52020f().getMainLooper());
            }
            zzby = f33620d;
        }
        return zzby;
    }
}
