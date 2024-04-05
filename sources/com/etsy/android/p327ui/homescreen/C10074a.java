package com.etsy.android.p327ui.homescreen;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.homescreen.a */
public final class C10074a {

    /* renamed from: a */
    public final long f22203a;

    /* renamed from: b */
    public final Long f22204b;

    public C10074a(Long l, long j) {
        this.f22203a = j;
        this.f22204b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10074a)) {
            return false;
        }
        C10074a aVar = (C10074a) obj;
        return this.f22203a == aVar.f22203a && C19383o.m32792b(this.f22204b, aVar.f22204b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f22203a) * 31;
        Long l = this.f22204b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OrderInfoSpec(receiptId=");
        h.append(this.f22203a);
        h.append(", trackingId=");
        h.append(this.f22204b);
        h.append(')');
        return h.toString();
    }
}
