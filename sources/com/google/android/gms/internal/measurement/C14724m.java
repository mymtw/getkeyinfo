package com.google.android.gms.internal.measurement;

import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.m */
public class C14724m implements C14763p, C14711l {

    /* renamed from: b */
    public final HashMap f32939b = new HashMap();

    /* renamed from: a */
    public final Iterator<C14763p> mo50482a() {
        return new C14698k(this.f32939b.keySet().iterator());
    }

    /* renamed from: c */
    public final boolean mo50483c(String str) {
        return this.f32939b.containsKey(str);
    }

    /* renamed from: e */
    public final void mo50484e(String str, C14763p pVar) {
        if (pVar == null) {
            this.f32939b.remove(str);
        } else {
            this.f32939b.put(str, pVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14724m)) {
            return false;
        }
        return this.f32939b.equals(((C14724m) obj).f32939b);
    }

    /* renamed from: g */
    public C14763p mo50486g(String str, C14598c3 c3Var, ArrayList arrayList) {
        return "toString".equals(str) ? new C14813t(toString()) : C15588c1.m25309U0(this, new C14813t(str), c3Var, arrayList);
    }

    public final int hashCode() {
        return this.f32939b.hashCode();
    }

    /* renamed from: l */
    public final C14763p mo50489l(String str) {
        return this.f32939b.containsKey(str) ? (C14763p) this.f32939b.get(str) : C14763p.f33033g0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f32939b.isEmpty()) {
            for (String str : this.f32939b.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f32939b.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final C14763p zzd() {
        C14724m mVar = new C14724m();
        for (Map.Entry entry : this.f32939b.entrySet()) {
            if (entry.getValue() instanceof C14711l) {
                mVar.f32939b.put((String) entry.getKey(), (C14763p) entry.getValue());
            } else {
                mVar.f32939b.put((String) entry.getKey(), ((C14763p) entry.getValue()).zzd());
            }
        }
        return mVar;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return "[object Object]";
    }
}
