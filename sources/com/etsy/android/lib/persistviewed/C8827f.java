package com.etsy.android.lib.persistviewed;

import android.support.p013v4.media.C0072d;
import p003a2.C0015b;

/* renamed from: com.etsy.android.lib.persistviewed.f */
public final class C8827f {

    /* renamed from: a */
    public final long f19394a;

    /* renamed from: b */
    public final long f19395b;

    public C8827f(long j, long j2) {
        this.f19394a = j;
        this.f19395b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8827f)) {
            return false;
        }
        C8827f fVar = (C8827f) obj;
        return this.f19394a == fVar.f19394a && this.f19395b == fVar.f19395b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19395b) + (Long.hashCode(this.f19394a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PersistViewedDbModel(listingId=");
        h.append(this.f19394a);
        h.append(", timestamp=");
        return C0015b.m91j(h, this.f19395b, ')');
    }
}
