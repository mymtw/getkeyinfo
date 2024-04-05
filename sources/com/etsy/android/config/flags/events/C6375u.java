package com.etsy.android.config.flags.events;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.u */
public final class C6375u implements C6350c {

    /* renamed from: a */
    public final String f14200a;

    /* renamed from: b */
    public final String f14201b;

    public C6375u(String str, String str2) {
        C19383o.m32797g(str, "flagName");
        this.f14200a = str;
        this.f14201b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6375u)) {
            return false;
        }
        C6375u uVar = (C6375u) obj;
        return C19383o.m32792b(this.f14200a, uVar.f14200a) && C19383o.m32792b(this.f14201b, uVar.f14201b);
    }

    public final int hashCode() {
        int hashCode = this.f14200a.hashCode() * 31;
        String str = this.f14201b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextConfigFlagValueChanged(flagName=");
        h.append(this.f14200a);
        h.append(", flagValue=");
        return C0391c.m1057c(h, this.f14201b, ')');
    }
}
