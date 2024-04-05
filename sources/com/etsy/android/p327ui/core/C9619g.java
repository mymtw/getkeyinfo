package com.etsy.android.p327ui.core;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.core.g */
public final class C9619g {

    /* renamed from: a */
    public final String f21312a;

    /* renamed from: b */
    public final String f21313b;

    /* renamed from: c */
    public final String f21314c;

    /* renamed from: d */
    public final Integer f21315d;

    /* renamed from: e */
    public final Integer f21316e;

    /* renamed from: f */
    public final String f21317f;

    /* renamed from: g */
    public final Integer f21318g;

    /* renamed from: h */
    public final Integer f21319h;

    public C9619g() {
        this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9619g)) {
            return false;
        }
        C9619g gVar = (C9619g) obj;
        return C19383o.m32792b(this.f21312a, gVar.f21312a) && C19383o.m32792b(this.f21313b, gVar.f21313b) && C19383o.m32792b(this.f21314c, gVar.f21314c) && C19383o.m32792b(this.f21315d, gVar.f21315d) && C19383o.m32792b(this.f21316e, gVar.f21316e) && C19383o.m32792b(this.f21317f, gVar.f21317f) && C19383o.m32792b(this.f21318g, gVar.f21318g) && C19383o.m32792b(this.f21319h, gVar.f21319h);
    }

    public final int hashCode() {
        String str = this.f21312a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21313b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21314c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f21315d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21316e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f21317f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.f21318g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f21319h;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CollectionSpec(collectionKey=");
        h.append(this.f21312a);
        h.append(", collectionSlug=");
        h.append(this.f21313b);
        h.append(", creatorUsername=");
        h.append(this.f21314c);
        h.append(", offset=");
        h.append(this.f21315d);
        h.append(", limit=");
        h.append(this.f21316e);
        h.append(", query=");
        h.append(this.f21317f);
        h.append(", onSale=");
        h.append(this.f21318g);
        h.append(", available=");
        return C0023f.m109j(h, this.f21319h, ')');
    }

    public C9619g(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, Integer num4) {
        this.f21312a = str;
        this.f21313b = str2;
        this.f21314c = str3;
        this.f21315d = num;
        this.f21316e = num2;
        this.f21317f = str4;
        this.f21318g = num3;
        this.f21319h = num4;
    }
}
