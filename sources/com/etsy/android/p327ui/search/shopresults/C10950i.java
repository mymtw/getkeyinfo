package com.etsy.android.p327ui.search.shopresults;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.shopresults.i */
public final class C10950i {

    /* renamed from: a */
    public final String f24297a;

    /* renamed from: b */
    public final int f24298b = 30;

    /* renamed from: c */
    public final int f24299c;

    /* renamed from: d */
    public final LinkedHashMap f24300d;

    public C10950i(String str, int i) {
        this.f24297a = str;
        this.f24299c = i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("query", str);
        }
        linkedHashMap.put("limit", String.valueOf(30));
        linkedHashMap.put("offset", String.valueOf(i));
        linkedHashMap.put("max_shop_listings", "6");
        this.f24300d = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10950i)) {
            return false;
        }
        C10950i iVar = (C10950i) obj;
        return C19383o.m32792b(this.f24297a, iVar.f24297a) && this.f24298b == iVar.f24298b && this.f24299c == iVar.f24299c;
    }

    public final int hashCode() {
        String str = this.f24297a;
        return Integer.hashCode(this.f24299c) + C0069a.m170a(this.f24298b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchShopsSpecs(query=");
        h.append(this.f24297a);
        h.append(", batchSize=");
        h.append(this.f24298b);
        h.append(", offset=");
        return C0073e.m208h(h, this.f24299c, ')');
    }
}
