package com.google.android.gms.internal.measurement;

import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j */
public abstract class C14685j implements C14763p, C14711l {

    /* renamed from: b */
    public final String f32890b;

    /* renamed from: c */
    public final HashMap f32891c = new HashMap();

    public C14685j(String str) {
        this.f32890b = str;
    }

    /* renamed from: a */
    public final Iterator<C14763p> mo50482a() {
        return new C14698k(this.f32891c.keySet().iterator());
    }

    /* renamed from: b */
    public abstract C14763p mo50553b(C14598c3 c3Var, List<C14763p> list);

    /* renamed from: c */
    public final boolean mo50483c(String str) {
        return this.f32891c.containsKey(str);
    }

    /* renamed from: e */
    public final void mo50484e(String str, C14763p pVar) {
        if (pVar == null) {
            this.f32891c.remove(str);
        } else {
            this.f32891c.put(str, pVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14685j)) {
            return false;
        }
        C14685j jVar = (C14685j) obj;
        String str = this.f32890b;
        if (str != null) {
            return str.equals(jVar.f32890b);
        }
        return false;
    }

    /* renamed from: g */
    public final C14763p mo50486g(String str, C14598c3 c3Var, ArrayList arrayList) {
        return "toString".equals(str) ? new C14813t(this.f32890b) : C15588c1.m25309U0(this, new C14813t(str), c3Var, arrayList);
    }

    public final int hashCode() {
        String str = this.f32890b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: l */
    public final C14763p mo50489l(String str) {
        return this.f32891c.containsKey(str) ? (C14763p) this.f32891c.get(str) : C14763p.f33033g0;
    }

    public C14763p zzd() {
        return this;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return this.f32890b;
    }
}
