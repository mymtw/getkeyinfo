package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.a */
public final class C10984a {

    /* renamed from: a */
    public final String f24365a;

    /* renamed from: b */
    public final C11016s f24366b;

    public C10984a(String str, C11016s sVar) {
        C19383o.m32797g(sVar, "selectedValue");
        this.f24365a = str;
        this.f24366b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10984a)) {
            return false;
        }
        C10984a aVar = (C10984a) obj;
        return C19383o.m32792b(this.f24365a, aVar.f24365a) && C19383o.m32792b(this.f24366b, aVar.f24366b);
    }

    public final int hashCode() {
        String str = this.f24365a;
        return this.f24366b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BreadcrumbDetail(filterId=");
        h.append(this.f24365a);
        h.append(", selectedValue=");
        h.append(this.f24366b);
        h.append(')');
        return h.toString();
    }
}
