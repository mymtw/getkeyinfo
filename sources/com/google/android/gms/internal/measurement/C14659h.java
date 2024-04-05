package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C14659h implements C14763p {

    /* renamed from: b */
    public final C14763p f32857b;

    /* renamed from: c */
    public final String f32858c;

    public C14659h() {
        throw null;
    }

    public C14659h(String str) {
        this.f32857b = C14763p.f33033g0;
        this.f32858c = str;
    }

    public C14659h(String str, C14763p pVar) {
        this.f32857b = pVar;
        this.f32858c = str;
    }

    /* renamed from: a */
    public final Iterator<C14763p> mo50482a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14659h)) {
            return false;
        }
        C14659h hVar = (C14659h) obj;
        return this.f32858c.equals(hVar.f32858c) && this.f32857b.equals(hVar.f32857b);
    }

    /* renamed from: g */
    public final C14763p mo50486g(String str, C14598c3 c3Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return this.f32857b.hashCode() + (this.f32858c.hashCode() * 31);
    }

    public final C14763p zzd() {
        return new C14659h(this.f32858c, this.f32857b.zzd());
    }

    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }
}
