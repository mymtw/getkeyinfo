package com.etsy.android.p327ui.listing.p329ui.buybox.freeshipping;

import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.freeshipping.a */
public final class C10258a extends C10423j {

    /* renamed from: a */
    public final String f22547a;

    /* renamed from: b */
    public final Spanned f22548b;

    public C10258a(Spanned spanned, String str) {
        this.f22547a = str;
        this.f22548b = spanned;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.FREE_SHIPPING;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10258a)) {
            return false;
        }
        C10258a aVar = (C10258a) obj;
        return C19383o.m32792b(this.f22547a, aVar.f22547a) && C19383o.m32792b(this.f22548b, aVar.f22548b);
    }

    public final int hashCode() {
        String str = this.f22547a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Spanned spanned = this.f22548b;
        if (spanned != null) {
            i = spanned.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FreeShipping(title=");
        h.append(this.f22547a);
        h.append(", body=");
        h.append(this.f22548b);
        h.append(')');
        return h.toString();
    }
}
