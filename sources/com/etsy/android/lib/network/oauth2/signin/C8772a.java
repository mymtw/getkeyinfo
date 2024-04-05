package com.etsy.android.lib.network.oauth2.signin;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.a */
public final class C8772a {

    /* renamed from: a */
    public final String f19308a;

    /* renamed from: b */
    public final String f19309b;

    public C8772a(String str, String str2) {
        C19383o.m32797g(str2, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        this.f19308a = str;
        this.f19309b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8772a)) {
            return false;
        }
        C8772a aVar = (C8772a) obj;
        return C19383o.m32792b(this.f19308a, aVar.f19308a) && C19383o.m32792b(this.f19309b, aVar.f19309b);
    }

    public final int hashCode() {
        return this.f19309b.hashCode() + (this.f19308a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("EmailAndToken(email=");
        h.append(this.f19308a);
        h.append(", token=");
        return C0391c.m1057c(h, this.f19309b, ')');
    }
}
