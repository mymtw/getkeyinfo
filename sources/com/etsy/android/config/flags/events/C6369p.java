package com.etsy.android.config.flags.events;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.p */
public final class C6369p implements C6350c {

    /* renamed from: a */
    public final String f14194a;

    /* renamed from: b */
    public final String f14195b;

    public C6369p(String str, String str2) {
        C19383o.m32797g(str, "flagName");
        this.f14194a = str;
        this.f14195b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6369p)) {
            return false;
        }
        C6369p pVar = (C6369p) obj;
        return C19383o.m32792b(this.f14194a, pVar.f14194a) && C19383o.m32792b(this.f14195b, pVar.f14195b);
    }

    public final int hashCode() {
        return this.f14195b.hashCode() + (this.f14194a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SetOverrideFromConfigsMenu(flagName=");
        h.append(this.f14194a);
        h.append(", flagValue=");
        return C0391c.m1057c(h, this.f14195b, ')');
    }
}
