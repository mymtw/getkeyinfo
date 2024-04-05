package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.apiv3.filters.AttributeFacet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.b */
public final class C10985b {

    /* renamed from: a */
    public final AttributeFacet f24367a;

    /* renamed from: b */
    public final String f24368b;

    /* renamed from: c */
    public final C10990e f24369c;

    /* renamed from: d */
    public final C11016s f24370d;

    /* renamed from: e */
    public final int f24371e;

    /* renamed from: f */
    public final int f24372f;

    public C10985b(AttributeFacet attributeFacet, String str, C10990e eVar, C11016s sVar, int i, int i2) {
        this.f24367a = attributeFacet;
        this.f24368b = str;
        this.f24369c = eVar;
        this.f24370d = sVar;
        this.f24371e = i;
        this.f24372f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10985b)) {
            return false;
        }
        C10985b bVar = (C10985b) obj;
        return C19383o.m32792b(this.f24367a, bVar.f24367a) && C19383o.m32792b(this.f24368b, bVar.f24368b) && C19383o.m32792b(this.f24369c, bVar.f24369c) && C19383o.m32792b(this.f24370d, bVar.f24370d) && this.f24371e == bVar.f24371e && this.f24372f == bVar.f24372f;
    }

    public final int hashCode() {
        int hashCode = this.f24367a.hashCode() * 31;
        String str = this.f24368b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.f24369c.hashCode();
        return Integer.hashCode(this.f24372f) + C0069a.m170a(this.f24371e, (this.f24370d.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FilterDetail(facet=");
        h.append(this.f24367a);
        h.append(", id=");
        h.append(this.f24368b);
        h.append(", name=");
        h.append(this.f24369c);
        h.append(", selectedOption=");
        h.append(this.f24370d);
        h.append(", action=");
        h.append(this.f24371e);
        h.append(", position=");
        return C0073e.m208h(h, this.f24372f, ')');
    }
}
