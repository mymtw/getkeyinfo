package com.etsy.android.p327ui.navigation.bottom;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: com.etsy.android.ui.navigation.bottom.c */
public final class C10681c {

    /* renamed from: a */
    public final int f23551a;

    /* renamed from: b */
    public final int f23552b;

    /* renamed from: c */
    public final int f23553c;

    public C10681c() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10681c)) {
            return false;
        }
        C10681c cVar = (C10681c) obj;
        return this.f23551a == cVar.f23551a && this.f23552b == cVar.f23552b && this.f23553c == cVar.f23553c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23553c) + C0069a.m170a(this.f23552b, Integer.hashCode(this.f23551a) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BadgeResponse(notification=");
        h.append(this.f23551a);
        h.append(", feedback=");
        h.append(this.f23552b);
        h.append(", conversationCount=");
        return C0073e.m208h(h, this.f23553c, ')');
    }

    public C10681c(int i, int i2, int i3) {
        this.f23551a = i;
        this.f23552b = i2;
        this.f23553c = i3;
    }
}
