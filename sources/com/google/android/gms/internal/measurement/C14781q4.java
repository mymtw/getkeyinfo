package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0070b;

/* renamed from: com.google.android.gms.internal.measurement.q4 */
public final class C14781q4<T> implements C14768p4<T> {

    /* renamed from: b */
    public volatile C14768p4<T> f33054b;

    /* renamed from: c */
    public volatile boolean f33055c;

    /* renamed from: d */
    public T f33056d;

    public C14781q4(C14768p4<T> p4Var) {
        this.f33054b = p4Var;
    }

    public final String toString() {
        Object obj = this.f33054b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f33056d);
            obj = C0070b.m184f(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return C0070b.m184f(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }

    public final T zza() {
        if (!this.f33055c) {
            synchronized (this) {
                if (!this.f33055c) {
                    C14768p4<T> p4Var = this.f33054b;
                    p4Var.getClass();
                    T zza = p4Var.zza();
                    this.f33056d = zza;
                    this.f33055c = true;
                    this.f33054b = null;
                    return zza;
                }
            }
        }
        return this.f33056d;
    }
}
