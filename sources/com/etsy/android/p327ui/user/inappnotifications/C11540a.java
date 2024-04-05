package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.inappnotifications.a */
public final class C11540a {

    /* renamed from: a */
    public final String f25529a;

    /* renamed from: b */
    public final Long f25530b;

    /* renamed from: c */
    public final String f25531c;

    /* renamed from: d */
    public final Long f25532d;

    /* renamed from: e */
    public final Long f25533e;

    /* renamed from: f */
    public final Boolean f25534f;

    /* renamed from: g */
    public final String f25535g;

    /* renamed from: h */
    public final String f25536h;

    public C11540a(String str, Long l, String str2, Long l2, Long l3, Boolean bool, String str3, String str4, int i) {
        l2 = (i & 8) != 0 ? null : l2;
        l3 = (i & 16) != 0 ? null : l3;
        bool = (i & 32) != 0 ? null : bool;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        C19383o.m32797g(str2, "feedId");
        this.f25529a = str;
        this.f25530b = l;
        this.f25531c = str2;
        this.f25532d = l2;
        this.f25533e = l3;
        this.f25534f = bool;
        this.f25535g = str3;
        this.f25536h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11540a)) {
            return false;
        }
        C11540a aVar = (C11540a) obj;
        return C19383o.m32792b(this.f25529a, aVar.f25529a) && C19383o.m32792b(this.f25530b, aVar.f25530b) && C19383o.m32792b(this.f25531c, aVar.f25531c) && C19383o.m32792b(this.f25532d, aVar.f25532d) && C19383o.m32792b(this.f25533e, aVar.f25533e) && C19383o.m32792b(this.f25534f, aVar.f25534f) && C19383o.m32792b(this.f25535g, aVar.f25535g) && C19383o.m32792b(this.f25536h, aVar.f25536h);
    }

    public final int hashCode() {
        int hashCode = this.f25529a.hashCode() * 31;
        Long l = this.f25530b;
        int i = 0;
        int e = C0023f.m105e(this.f25531c, (hashCode + (l == null ? 0 : l.hashCode())) * 31, 31);
        Long l2 = this.f25532d;
        int hashCode2 = (e + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f25533e;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.f25534f;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f25535g;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25536h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AnalyticsDependencies(eventName=");
        h.append(this.f25529a);
        h.append(", feedIndex=");
        h.append(this.f25530b);
        h.append(", feedId=");
        h.append(this.f25531c);
        h.append(", listingId=");
        h.append(this.f25532d);
        h.append(", shopId=");
        h.append(this.f25533e);
        h.append(", shopRecsHighlightedState=");
        h.append(this.f25534f);
        h.append(", eventType=");
        h.append(this.f25535g);
        h.append(", landingScreen=");
        return C0391c.m1057c(h, this.f25536h, ')');
    }
}
