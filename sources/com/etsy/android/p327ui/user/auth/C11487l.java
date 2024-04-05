package com.etsy.android.p327ui.user.auth;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.auth.l */
public final class C11487l {

    /* renamed from: a */
    public final String f25336a;

    /* renamed from: b */
    public final String f25337b;

    public C11487l() {
        this((String) null, (String) null, 3);
    }

    public C11487l(String str, String str2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.f25336a = str;
        this.f25337b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11487l)) {
            return false;
        }
        C11487l lVar = (C11487l) obj;
        return C19383o.m32792b(this.f25336a, lVar.f25336a) && C19383o.m32792b(this.f25337b, lVar.f25337b);
    }

    public final int hashCode() {
        String str = this.f25336a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25337b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SignInToken(signInAs=");
        h.append(this.f25336a);
        h.append(", magicLink=");
        return C0391c.m1057c(h, this.f25337b, ')');
    }
}
