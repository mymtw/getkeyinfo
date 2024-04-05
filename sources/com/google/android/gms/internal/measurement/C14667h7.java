package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0070b;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.h7 */
public final class C14667h7 implements Map.Entry, Comparable<C14667h7> {

    /* renamed from: b */
    public final Comparable f32869b;

    /* renamed from: c */
    public Object f32870c;

    /* renamed from: d */
    public final /* synthetic */ C14706k7 f32871d;

    public C14667h7(C14706k7 k7Var, Comparable comparable, Object obj) {
        this.f32871d = k7Var;
        this.f32869b = comparable;
        this.f32870c = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f32869b.compareTo(((C14667h7) obj).f32869b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f32869b;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f32870c;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.f32869b;
    }

    public final Object getValue() {
        return this.f32870c;
    }

    public final int hashCode() {
        Comparable comparable = this.f32869b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f32870c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        C14706k7 k7Var = this.f32871d;
        int i = C14706k7.f32912h;
        k7Var.mo50639f();
        Object obj2 = this.f32870c;
        this.f32870c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f32869b);
        String valueOf2 = String.valueOf(this.f32870c);
        return C0070b.m184f(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
