package com.etsy.android.config.flags.events;

import android.support.p013v4.media.C0072d;
import com.etsy.android.config.flags.p073ui.C6403c;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.l */
public final class C6365l implements C6350c {

    /* renamed from: a */
    public final HashMap<String, C6403c> f14189a;

    public C6365l(HashMap<String, C6403c> hashMap) {
        this.f14189a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6365l) && C19383o.m32792b(this.f14189a, ((C6365l) obj).f14189a);
    }

    public final int hashCode() {
        return this.f14189a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LogGrafanaEvents(configFlagsMap=");
        h.append(this.f14189a);
        h.append(')');
        return h.toString();
    }
}
