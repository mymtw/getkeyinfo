package com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.estimateddelivery.a */
public final class C10253a extends C10423j {

    /* renamed from: a */
    public final String f22536a;

    /* renamed from: b */
    public final String f22537b;

    /* renamed from: c */
    public final String f22538c;

    public C10253a(String str, String str2, String str3) {
        this.f22536a = str;
        this.f22537b = str2;
        this.f22538c = str3;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.ESTIMATED_DELIVERY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10253a)) {
            return false;
        }
        C10253a aVar = (C10253a) obj;
        return C19383o.m32792b(this.f22536a, aVar.f22536a) && C19383o.m32792b(this.f22537b, aVar.f22537b) && C19383o.m32792b(this.f22538c, aVar.f22538c);
    }

    public final int hashCode() {
        return this.f22538c.hashCode() + C0023f.m105e(this.f22537b, this.f22536a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("EstimatedDelivery(estimatedDeliveryText=");
        h.append(this.f22536a);
        h.append(", underlinedText=");
        h.append(this.f22537b);
        h.append(", disclaimer=");
        return C0391c.m1057c(h, this.f22538c, ')');
    }
}
