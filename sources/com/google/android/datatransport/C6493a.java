package com.google.android.datatransport;

import android.support.p013v4.media.C0072d;
import p003a2.C0023f;

/* renamed from: com.google.android.datatransport.a */
public final class C6493a {

    /* renamed from: a */
    public final String f14398a;

    public C6493a(String str) {
        if (str != null) {
            this.f14398a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6493a)) {
            return false;
        }
        return this.f14398a.equals(((C6493a) obj).f14398a);
    }

    public final int hashCode() {
        return this.f14398a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0023f.m110k(C0072d.m201h("Encoding{name=\""), this.f14398a, "\"}");
    }
}
