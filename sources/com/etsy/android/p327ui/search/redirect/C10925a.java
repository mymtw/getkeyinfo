package com.etsy.android.p327ui.search.redirect;

import android.support.p013v4.media.C0072d;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.redirect.a */
public final class C10925a {

    /* renamed from: a */
    public final String f24256a;

    /* renamed from: b */
    public final HashMap<String, String> f24257b;

    public C10925a(String str, HashMap<String, String> hashMap) {
        this.f24256a = str;
        this.f24257b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10925a)) {
            return false;
        }
        C10925a aVar = (C10925a) obj;
        return C19383o.m32792b(this.f24256a, aVar.f24256a) && C19383o.m32792b(this.f24257b, aVar.f24257b);
    }

    public final int hashCode() {
        int hashCode = this.f24256a.hashCode() * 31;
        HashMap<String, String> hashMap = this.f24257b;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchCategoryPageRedirectSpecs(url=");
        h.append(this.f24256a);
        h.append(", queryParams=");
        h.append(this.f24257b);
        h.append(')');
        return h.toString();
    }
}
