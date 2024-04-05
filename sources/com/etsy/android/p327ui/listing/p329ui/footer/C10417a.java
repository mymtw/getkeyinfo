package com.etsy.android.p327ui.listing.p329ui.footer;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p498zc.C13949d;

/* renamed from: com.etsy.android.ui.listing.ui.footer.a */
public final class C10417a extends C10423j implements C13949d {

    /* renamed from: a */
    public final String f22855a;

    /* renamed from: b */
    public final String f22856b;

    /* renamed from: c */
    public final String f22857c;

    public C10417a(String str, String str2, String str3) {
        C19383o.m32797g(str, "listingId");
        this.f22855a = str;
        this.f22856b = str2;
        this.f22857c = str3;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.FOOTER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10417a)) {
            return false;
        }
        C10417a aVar = (C10417a) obj;
        return C19383o.m32792b(this.f22855a, aVar.f22855a) && C19383o.m32792b(this.f22856b, aVar.f22856b) && C19383o.m32792b(this.f22857c, aVar.f22857c);
    }

    public final int hashCode() {
        int hashCode = this.f22855a.hashCode() * 31;
        String str = this.f22856b;
        return this.f22857c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingFooter(listingId=");
        h.append(this.f22855a);
        h.append(", listingUrl=");
        h.append(this.f22856b);
        h.append(", itemListedOnDateText=");
        return C0391c.m1057c(h, this.f22857c, ')');
    }
}
