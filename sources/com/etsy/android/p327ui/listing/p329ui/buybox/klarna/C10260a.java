package com.etsy.android.p327ui.listing.p329ui.buybox.klarna;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.KlarnaOnSiteMessaging;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.klarna.a */
public final class C10260a extends C10423j {

    /* renamed from: a */
    public final KlarnaOnSiteMessaging f22552a;

    public C10260a(KlarnaOnSiteMessaging klarnaOnSiteMessaging) {
        this.f22552a = klarnaOnSiteMessaging;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.KLARNA_INFO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10260a) && C19383o.m32792b(this.f22552a, ((C10260a) obj).f22552a);
    }

    public final int hashCode() {
        return this.f22552a.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("KlarnaInfo(kosm=");
        h.append(this.f22552a);
        h.append(')');
        return h.toString();
    }
}
