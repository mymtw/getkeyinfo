package com.etsy.android.p327ui.listing.p329ui.productwarninginfo;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ProductSafetyNoticeMessage;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p498zc.C13949d;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.listing.ui.productwarninginfo.a */
public final class C10621a extends C10423j implements C13949d {

    /* renamed from: a */
    public final String f23310a;

    /* renamed from: b */
    public final List<ProductSafetyNoticeMessage> f23311b;

    /* renamed from: c */
    public boolean f23312c;

    public C10621a(boolean z, String str, List list) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(list, ResponseConstants.MESSAGES);
        this.f23310a = str;
        this.f23311b = list;
        this.f23312c = z;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.PRODUCT_WARNING_INFO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10621a)) {
            return false;
        }
        C10621a aVar = (C10621a) obj;
        return C19383o.m32792b(this.f23310a, aVar.f23310a) && C19383o.m32792b(this.f23311b, aVar.f23311b) && this.f23312c == aVar.f23312c;
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f23311b, this.f23310a.hashCode() * 31, 31);
        boolean z = this.f23312c;
        if (z) {
            z = true;
        }
        return g + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ProductWarningInfo(title=");
        h.append(this.f23310a);
        h.append(", messages=");
        h.append(this.f23311b);
        h.append(", hasBeenTracked=");
        return C0391c.m1058d(h, this.f23312c, ')');
    }
}
