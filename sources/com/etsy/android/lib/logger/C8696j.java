package com.etsy.android.lib.logger;

import android.support.p013v4.media.C0072d;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.logger.j */
public final class C8696j {

    /* renamed from: a */
    public final String f19098a;

    /* renamed from: b */
    public final Map<AnalyticsProperty, Object> f19099b;

    public C8696j(String str, Map<AnalyticsProperty, ? extends Object> map) {
        C19383o.m32797g(str, "eventName");
        this.f19098a = str;
        this.f19099b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8696j)) {
            return false;
        }
        C8696j jVar = (C8696j) obj;
        return C19383o.m32792b(this.f19098a, jVar.f19098a) && C19383o.m32792b(this.f19099b, jVar.f19099b);
    }

    public final int hashCode() {
        return this.f19099b.hashCode() + (this.f19098a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OnSeenTrackingData(eventName=");
        h.append(this.f19098a);
        h.append(", properties=");
        h.append(this.f19099b);
        h.append(')');
        return h.toString();
    }
}
