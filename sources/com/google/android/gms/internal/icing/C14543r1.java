package com.google.android.gms.internal.icing;

import android.support.p013v4.media.C0070b;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.icing.r1 */
public final class C14543r1 implements Map.Entry, Comparable<C14543r1> {

    /* renamed from: b */
    public final Comparable f32691b;

    /* renamed from: c */
    public Object f32692c;

    /* renamed from: d */
    public final /* synthetic */ C14552u1 f32693d;

    public C14543r1(C14552u1 u1Var, Comparable comparable, Object obj) {
        this.f32693d = u1Var;
        this.f32691b = comparable;
        this.f32692c = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f32691b.compareTo(((C14543r1) obj).f32691b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f32691b;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f32692c;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f32691b;
    }

    public final Object getValue() {
        return this.f32692c;
    }

    public final int hashCode() {
        Comparable comparable = this.f32691b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f32692c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        C14552u1 u1Var = this.f32693d;
        int i = C14552u1.f32709h;
        u1Var.mo49936e();
        Object obj2 = this.f32692c;
        this.f32692c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f32691b);
        String valueOf2 = String.valueOf(this.f32692c);
        return C0070b.m184f(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
