package com.etsy.android.p327ui.favorites;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.a0 */
public final class C9743a0 {

    /* renamed from: a */
    public String f21539a;

    /* renamed from: b */
    public String f21540b;

    /* renamed from: c */
    public String f21541c;

    public C9743a0(String str, String str2, String str3) {
        this.f21539a = str;
        this.f21540b = str2;
        this.f21541c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9743a0)) {
            return false;
        }
        C9743a0 a0Var = (C9743a0) obj;
        return C19383o.m32792b(this.f21539a, a0Var.f21539a) && C19383o.m32792b(this.f21540b, a0Var.f21540b) && C19383o.m32792b(this.f21541c, a0Var.f21541c);
    }

    public final int hashCode() {
        int hashCode = this.f21539a.hashCode() * 31;
        String str = this.f21540b;
        return this.f21541c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("UpdateCollectionSpecs(key=");
        h.append(this.f21539a);
        h.append(", name=");
        h.append(this.f21540b);
        h.append(", privacyLevel=");
        return C0391c.m1057c(h, this.f21541c, ')');
    }
}
