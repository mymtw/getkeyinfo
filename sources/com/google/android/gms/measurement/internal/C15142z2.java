package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.measurement.internal.z2 */
public final class C15142z2 {
    @VisibleForTesting

    /* renamed from: a */
    public final String f34004a;

    /* renamed from: b */
    public final String f34005b;

    /* renamed from: c */
    public final String f34006c;

    /* renamed from: d */
    public final long f34007d;

    /* renamed from: e */
    public final /* synthetic */ C14942c3 f34008e;

    public /* synthetic */ C15142z2(C14942c3 c3Var, long j) {
        this.f34008e = c3Var;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j > 0);
        this.f34004a = "health_monitor:start";
        this.f34005b = "health_monitor:count";
        this.f34006c = "health_monitor:value";
        this.f34007d = j;
    }

    /* renamed from: a */
    public final void mo52372a() {
        this.f34008e.mo51995g();
        long currentTimeMillis = ((C15103u3) this.f34008e.f33681b).f33885o.currentTimeMillis();
        SharedPreferences.Editor edit = this.f34008e.mo51953k().edit();
        edit.remove(this.f34005b);
        edit.remove(this.f34006c);
        edit.putLong(this.f34004a, currentTimeMillis);
        edit.apply();
    }
}
