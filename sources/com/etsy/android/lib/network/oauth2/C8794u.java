package com.etsy.android.lib.network.oauth2;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.network.oauth2.u */
public final class C8794u {

    /* renamed from: a */
    public final String f19346a;

    /* renamed from: b */
    public final String f19347b;

    public C8794u(String str, String str2) {
        this.f19346a = str;
        this.f19347b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8794u)) {
            return false;
        }
        C8794u uVar = (C8794u) obj;
        return C19383o.m32792b(this.f19346a, uVar.f19346a) && C19383o.m32792b(this.f19347b, uVar.f19347b);
    }

    public final int hashCode() {
        return this.f19347b.hashCode() + (this.f19346a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PKCEPair(codeVerifier=");
        h.append(this.f19346a);
        h.append(", codeChallenge=");
        return C0391c.m1057c(h, this.f19347b, ')');
    }
}
