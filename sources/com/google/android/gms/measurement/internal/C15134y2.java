package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.y2 */
public final class C15134y2 {

    /* renamed from: a */
    public final String f33983a;

    /* renamed from: b */
    public final long f33984b;

    /* renamed from: c */
    public boolean f33985c;

    /* renamed from: d */
    public long f33986d;

    /* renamed from: e */
    public final /* synthetic */ C14942c3 f33987e;

    public C15134y2(C14942c3 c3Var, String str, long j) {
        this.f33987e = c3Var;
        Preconditions.checkNotEmpty(str);
        this.f33983a = str;
        this.f33984b = j;
    }

    /* renamed from: a */
    public final long mo52363a() {
        if (!this.f33985c) {
            this.f33985c = true;
            this.f33986d = this.f33987e.mo51953k().getLong(this.f33983a, this.f33984b);
        }
        return this.f33986d;
    }

    /* renamed from: b */
    public final void mo52364b(long j) {
        SharedPreferences.Editor edit = this.f33987e.mo51953k().edit();
        edit.putLong(this.f33983a, j);
        edit.apply();
        this.f33986d = j;
    }
}
