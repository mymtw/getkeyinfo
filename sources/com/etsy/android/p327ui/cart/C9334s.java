package com.etsy.android.p327ui.cart;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.s */
public final class C9334s {

    /* renamed from: a */
    public final String f20607a;

    /* renamed from: b */
    public final boolean f20608b;

    /* renamed from: c */
    public final boolean f20609c;

    /* renamed from: d */
    public final EtsyAssociativeArray f20610d;

    /* renamed from: e */
    public final String f20611e;

    public C9334s(String str, boolean z, boolean z2, EtsyAssociativeArray etsyAssociativeArray, String str2) {
        C19383o.m32797g(str, "apiUrl");
        C19383o.m32797g(str2, "requestMethod");
        this.f20607a = str;
        this.f20608b = z;
        this.f20609c = z2;
        this.f20610d = etsyAssociativeArray;
        this.f20611e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9334s)) {
            return false;
        }
        C9334s sVar = (C9334s) obj;
        return C19383o.m32792b(this.f20607a, sVar.f20607a) && this.f20608b == sVar.f20608b && this.f20609c == sVar.f20609c && C19383o.m32792b(this.f20610d, sVar.f20610d) && C19383o.m32792b(this.f20611e, sVar.f20611e);
    }

    public final int hashCode() {
        int hashCode = this.f20607a.hashCode() * 31;
        boolean z = this.f20608b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f20609c;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        EtsyAssociativeArray etsyAssociativeArray = this.f20610d;
        return this.f20611e.hashCode() + ((i2 + (etsyAssociativeArray == null ? 0 : etsyAssociativeArray.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MultiShopCartActionSpecs(apiUrl=");
        h.append(this.f20607a);
        h.append(", isGooglePaySupported=");
        h.append(this.f20608b);
        h.append(", isSignedIn=");
        h.append(this.f20609c);
        h.append(", params=");
        h.append(this.f20610d);
        h.append(", requestMethod=");
        return C0391c.m1057c(h, this.f20611e, ')');
    }
}
