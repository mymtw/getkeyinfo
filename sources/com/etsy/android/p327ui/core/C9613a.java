package com.etsy.android.p327ui.core;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: com.etsy.android.ui.core.a */
public final class C9613a {

    /* renamed from: a */
    public final int f21304a;

    /* renamed from: b */
    public final int f21305b;

    public C9613a(int i, int i2) {
        this.f21304a = i;
        this.f21305b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9613a)) {
            return false;
        }
        C9613a aVar = (C9613a) obj;
        return this.f21304a == aVar.f21304a && this.f21305b == aVar.f21305b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21305b) + (Integer.hashCode(this.f21304a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AddToCartAnimEvent(x=");
        h.append(this.f21304a);
        h.append(", y=");
        return C0073e.m208h(h, this.f21305b, ')');
    }
}
