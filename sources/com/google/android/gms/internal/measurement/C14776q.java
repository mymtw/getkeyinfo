package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.q */
public final class C14776q implements C14763p {

    /* renamed from: b */
    public final String f33049b;

    /* renamed from: c */
    public final ArrayList<C14763p> f33050c;

    public C14776q(String str, ArrayList arrayList) {
        this.f33049b = str;
        ArrayList<C14763p> arrayList2 = new ArrayList<>();
        this.f33050c = arrayList2;
        arrayList2.addAll(arrayList);
    }

    /* renamed from: a */
    public final Iterator<C14763p> mo50482a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14776q)) {
            return false;
        }
        C14776q qVar = (C14776q) obj;
        String str = this.f33049b;
        if (str == null ? qVar.f33049b == null : str.equals(qVar.f33049b)) {
            return this.f33050c.equals(qVar.f33050c);
        }
        return false;
    }

    /* renamed from: g */
    public final C14763p mo50486g(String str, C14598c3 c3Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.f33049b;
        return this.f33050c.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final C14763p zzd() {
        return this;
    }

    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}
