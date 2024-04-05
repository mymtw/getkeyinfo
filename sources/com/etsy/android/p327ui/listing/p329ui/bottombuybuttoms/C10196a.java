package com.etsy.android.p327ui.listing.p329ui.bottombuybuttoms;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.bottombuybuttoms.a */
public final class C10196a extends C10423j {

    /* renamed from: a */
    public final C10423j f22404a;

    /* renamed from: b */
    public final C10225a f22405b;

    public C10196a() {
        this((C10423j) null, (C10225a) null);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.HORIZONTAL_BUY_BUTTONS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10196a)) {
            return false;
        }
        C10196a aVar = (C10196a) obj;
        return C19383o.m32792b(this.f22404a, aVar.f22404a) && C19383o.m32792b(this.f22405b, aVar.f22405b);
    }

    public final int hashCode() {
        C10423j jVar = this.f22404a;
        int i = 0;
        int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        C10225a aVar = this.f22405b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HorizontalBuyButtons(expressCheckout=");
        h.append(this.f22404a);
        h.append(", cartButton=");
        h.append(this.f22405b);
        h.append(')');
        return h.toString();
    }

    public C10196a(C10423j jVar, C10225a aVar) {
        this.f22404a = jVar;
        this.f22405b = aVar;
    }
}
