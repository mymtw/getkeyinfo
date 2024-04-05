package com.etsy.android.p327ui.shop.viewholder;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.ShopV3;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.viewholder.k */
public final class C11283k {

    /* renamed from: a */
    public final ShopV3 f24907a;

    /* renamed from: b */
    public boolean f24908b;

    public C11283k(ShopV3 shopV3, boolean z) {
        this.f24907a = shopV3;
        this.f24908b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11283k)) {
            return false;
        }
        C11283k kVar = (C11283k) obj;
        return C19383o.m32792b(this.f24907a, kVar.f24907a) && this.f24908b == kVar.f24908b;
    }

    public final int hashCode() {
        ShopV3 shopV3 = this.f24907a;
        int hashCode = (shopV3 == null ? 0 : shopV3.hashCode()) * 31;
        boolean z = this.f24908b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopHomeInfo(shop=");
        h.append(this.f24907a);
        h.append(", favorited=");
        return C0391c.m1058d(h, this.f24908b, ')');
    }
}
