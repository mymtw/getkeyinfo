package com.etsy.android.config.flags.events;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.t */
public final class C6374t implements C6350c {

    /* renamed from: a */
    public final String f14198a;

    /* renamed from: b */
    public final String f14199b;

    public C6374t(String str, String str2) {
        C19383o.m32797g(str, "flagName");
        this.f14198a = str;
        this.f14199b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6374t)) {
            return false;
        }
        C6374t tVar = (C6374t) obj;
        return C19383o.m32792b(this.f14198a, tVar.f14198a) && C19383o.m32792b(this.f14199b, tVar.f14199b);
    }

    public final int hashCode() {
        int hashCode = this.f14198a.hashCode() * 31;
        String str = this.f14199b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextConfigFlagClicked(flagName=");
        h.append(this.f14198a);
        h.append(", flagValue=");
        return C0391c.m1057c(h, this.f14199b, ')');
    }
}
