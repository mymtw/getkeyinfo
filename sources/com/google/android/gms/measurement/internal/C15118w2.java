package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.w2 */
public final class C15118w2 {

    /* renamed from: a */
    public final String f33940a;

    /* renamed from: b */
    public final boolean f33941b;

    /* renamed from: c */
    public boolean f33942c;

    /* renamed from: d */
    public boolean f33943d;

    /* renamed from: e */
    public final /* synthetic */ C14942c3 f33944e;

    public C15118w2(C14942c3 c3Var, String str, boolean z) {
        this.f33944e = c3Var;
        Preconditions.checkNotEmpty(str);
        this.f33940a = str;
        this.f33941b = z;
    }

    /* renamed from: a */
    public final void mo52353a(boolean z) {
        SharedPreferences.Editor edit = this.f33944e.mo51953k().edit();
        edit.putBoolean(this.f33940a, z);
        edit.apply();
        this.f33943d = z;
    }

    /* renamed from: b */
    public final boolean mo52354b() {
        if (!this.f33942c) {
            this.f33942c = true;
            this.f33943d = this.f33944e.mo51953k().getBoolean(this.f33940a, this.f33941b);
        }
        return this.f33943d;
    }
}
