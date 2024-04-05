package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.a3 */
public final class C14924a3 {

    /* renamed from: a */
    public final String f33262a;

    /* renamed from: b */
    public boolean f33263b;

    /* renamed from: c */
    public String f33264c;

    /* renamed from: d */
    public final /* synthetic */ C14942c3 f33265d;

    public C14924a3(C14942c3 c3Var, String str) {
        this.f33265d = c3Var;
        Preconditions.checkNotEmpty(str);
        this.f33262a = str;
    }

    /* renamed from: a */
    public final String mo51937a() {
        if (!this.f33263b) {
            this.f33263b = true;
            this.f33264c = this.f33265d.mo51953k().getString(this.f33262a, (String) null);
        }
        return this.f33264c;
    }

    /* renamed from: b */
    public final void mo51938b(String str) {
        SharedPreferences.Editor edit = this.f33265d.mo51953k().edit();
        edit.putString(this.f33262a, str);
        edit.apply();
        this.f33264c = str;
    }
}
