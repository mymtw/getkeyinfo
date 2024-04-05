package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ListingGiftInfo;
import com.etsy.android.lib.models.apiv3.listing.extensions.ImageExtensionsKt;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g */
public final class C10564g {

    /* renamed from: a */
    public final String f23167a;

    /* renamed from: b */
    public final boolean f23168b;

    /* renamed from: c */
    public final boolean f23169c;

    /* renamed from: d */
    public final String f23170d;

    /* renamed from: e */
    public final Image f23171e;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.g$a */
    public static final class C10565a {
        /* renamed from: a */
        public static C10564g m18516a(ListingFetch listingFetch) {
            ListingGiftInfo giftInfo = listingFetch.getGiftInfo();
            boolean z = false;
            if (giftInfo == null) {
                return new C10564g(0);
            }
            String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(giftInfo.getShopName());
            String str = unescapeHtml4 == null ? "" : unescapeHtml4;
            Boolean isEligible = giftInfo.isEligible();
            boolean booleanValue = isEligible != null ? isEligible.booleanValue() : false;
            Boolean offersGiftMessage = giftInfo.getOffersGiftMessage();
            if (offersGiftMessage != null) {
                z = offersGiftMessage.booleanValue();
            }
            String unescapeHtml42 = StringEscapeUtils.unescapeHtml4(giftInfo.getDescription());
            String str2 = unescapeHtml42 == null ? "" : unescapeHtml42;
            com.etsy.android.lib.models.apiv3.listing.Image previewImage = giftInfo.getPreviewImage();
            return new C10564g(str, booleanValue, z, str2, previewImage != null ? ImageExtensionsKt.convertToV2Image(previewImage) : null);
        }
    }

    public C10564g() {
        this(0);
    }

    public /* synthetic */ C10564g(int i) {
        this((String) null, false, false, (String) null, (Image) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10564g)) {
            return false;
        }
        C10564g gVar = (C10564g) obj;
        return C19383o.m32792b(this.f23167a, gVar.f23167a) && this.f23168b == gVar.f23168b && this.f23169c == gVar.f23169c && C19383o.m32792b(this.f23170d, gVar.f23170d) && C19383o.m32792b(this.f23171e, gVar.f23171e);
    }

    public final int hashCode() {
        String str = this.f23167a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f23168b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f23169c;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str2 = this.f23170d;
        int hashCode2 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.f23171e;
        if (image != null) {
            i = image.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GiftInfo(shopName=");
        h.append(this.f23167a);
        h.append(", isGiftWrapAvailable=");
        h.append(this.f23168b);
        h.append(", isGiftMessageAvailable=");
        h.append(this.f23169c);
        h.append(", description=");
        h.append(this.f23170d);
        h.append(", previewImage=");
        h.append(this.f23171e);
        h.append(')');
        return h.toString();
    }

    public C10564g(String str, boolean z, boolean z2, String str2, Image image) {
        this.f23167a = str;
        this.f23168b = z;
        this.f23169c = z2;
        this.f23170d = str2;
        this.f23171e = image;
    }
}
