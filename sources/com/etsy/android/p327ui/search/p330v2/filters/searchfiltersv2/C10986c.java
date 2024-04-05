package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.c */
public final class C10986c {

    /* renamed from: a */
    public final C10987d f24373a;

    /* renamed from: b */
    public final Map<AnalyticsProperty, Object> f24374b;

    /* renamed from: c */
    public final C11016s f24375c;

    /* renamed from: d */
    public final Boolean f24376d;

    public C10986c(C10987d dVar, LinkedHashMap linkedHashMap, C11016s sVar, Boolean bool) {
        this.f24373a = dVar;
        this.f24374b = linkedHashMap;
        this.f24375c = sVar;
        this.f24376d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10986c)) {
            return false;
        }
        C10986c cVar = (C10986c) obj;
        return C19383o.m32792b(this.f24373a, cVar.f24373a) && C19383o.m32792b(this.f24374b, cVar.f24374b) && C19383o.m32792b(this.f24375c, cVar.f24375c) && C19383o.m32792b(this.f24376d, cVar.f24376d);
    }

    public final int hashCode() {
        int hashCode = (this.f24374b.hashCode() + (this.f24373a.hashCode() * 31)) * 31;
        C11016s sVar = this.f24375c;
        int i = 0;
        int hashCode2 = (hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Boolean bool = this.f24376d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FilterEvent(filterIdentifier=");
        h.append(this.f24373a);
        h.append(", parametersMap=");
        h.append(this.f24374b);
        h.append(", selectedOption=");
        h.append(this.f24375c);
        h.append(", isChecked=");
        h.append(this.f24376d);
        h.append(')');
        return h.toString();
    }
}
