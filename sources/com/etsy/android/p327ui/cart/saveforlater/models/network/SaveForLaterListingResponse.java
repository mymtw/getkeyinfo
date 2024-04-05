package com.etsy.android.p327ui.cart.saveforlater.models.network;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterListingResponse */
public final class SaveForLaterListingResponse {

    /* renamed from: a */
    public final Long f20651a;

    /* renamed from: b */
    public final Long f20652b;

    /* renamed from: c */
    public final String f20653c;

    /* renamed from: d */
    public final Integer f20654d;

    /* renamed from: e */
    public final String f20655e;

    /* renamed from: f */
    public final String f20656f;

    /* renamed from: g */
    public final String f20657g;

    /* renamed from: h */
    public final ListingImage f20658h;

    /* renamed from: i */
    public final Boolean f20659i;

    /* renamed from: j */
    public final Boolean f20660j;

    /* renamed from: k */
    public final Boolean f20661k;

    /* renamed from: l */
    public final List<SaveForLaterVariationResponse> f20662l;

    public SaveForLaterListingResponse() {
        this((Long) null, (Long) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (ListingImage) null, (Boolean) null, (Boolean) null, (Boolean) null, (List) null, 4095, (DefaultConstructorMarker) null);
    }

    public SaveForLaterListingResponse(@C17402n(name = "cart_id") Long l, @C17402n(name = "listing_id") Long l2, @C17402n(name = "title") String str, @C17402n(name = "purchase_quantity") Integer num, @C17402n(name = "buyer_display_price") String str2, @C17402n(name = "discount_description") String str3, @C17402n(name = "discount_price") String str4, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "is_digital") Boolean bool, @C17402n(name = "is_favorite") Boolean bool2, @C17402n(name = "can_move_to_cart") Boolean bool3, @C17402n(name = "selected_variations") List<SaveForLaterVariationResponse> list) {
        this.f20651a = l;
        this.f20652b = l2;
        this.f20653c = str;
        this.f20654d = num;
        this.f20655e = str2;
        this.f20656f = str3;
        this.f20657g = str4;
        this.f20658h = listingImage;
        this.f20659i = bool;
        this.f20660j = bool2;
        this.f20661k = bool3;
        this.f20662l = list;
    }

    public final SaveForLaterListingResponse copy(@C17402n(name = "cart_id") Long l, @C17402n(name = "listing_id") Long l2, @C17402n(name = "title") String str, @C17402n(name = "purchase_quantity") Integer num, @C17402n(name = "buyer_display_price") String str2, @C17402n(name = "discount_description") String str3, @C17402n(name = "discount_price") String str4, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "is_digital") Boolean bool, @C17402n(name = "is_favorite") Boolean bool2, @C17402n(name = "can_move_to_cart") Boolean bool3, @C17402n(name = "selected_variations") List<SaveForLaterVariationResponse> list) {
        return new SaveForLaterListingResponse(l, l2, str, num, str2, str3, str4, listingImage, bool, bool2, bool3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveForLaterListingResponse)) {
            return false;
        }
        SaveForLaterListingResponse saveForLaterListingResponse = (SaveForLaterListingResponse) obj;
        return C19383o.m32792b(this.f20651a, saveForLaterListingResponse.f20651a) && C19383o.m32792b(this.f20652b, saveForLaterListingResponse.f20652b) && C19383o.m32792b(this.f20653c, saveForLaterListingResponse.f20653c) && C19383o.m32792b(this.f20654d, saveForLaterListingResponse.f20654d) && C19383o.m32792b(this.f20655e, saveForLaterListingResponse.f20655e) && C19383o.m32792b(this.f20656f, saveForLaterListingResponse.f20656f) && C19383o.m32792b(this.f20657g, saveForLaterListingResponse.f20657g) && C19383o.m32792b(this.f20658h, saveForLaterListingResponse.f20658h) && C19383o.m32792b(this.f20659i, saveForLaterListingResponse.f20659i) && C19383o.m32792b(this.f20660j, saveForLaterListingResponse.f20660j) && C19383o.m32792b(this.f20661k, saveForLaterListingResponse.f20661k) && C19383o.m32792b(this.f20662l, saveForLaterListingResponse.f20662l);
    }

    public final int hashCode() {
        Long l = this.f20651a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f20652b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f20653c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f20654d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f20655e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20656f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20657g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ListingImage listingImage = this.f20658h;
        int hashCode8 = (hashCode7 + (listingImage == null ? 0 : listingImage.hashCode())) * 31;
        Boolean bool = this.f20659i;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f20660j;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f20661k;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<SaveForLaterVariationResponse> list = this.f20662l;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveForLaterListingResponse(cartId=");
        h.append(this.f20651a);
        h.append(", listingId=");
        h.append(this.f20652b);
        h.append(", title=");
        h.append(this.f20653c);
        h.append(", purchaseQuantity=");
        h.append(this.f20654d);
        h.append(", displayPrice=");
        h.append(this.f20655e);
        h.append(", discountDescription=");
        h.append(this.f20656f);
        h.append(", displayDiscountPrice=");
        h.append(this.f20657g);
        h.append(", image=");
        h.append(this.f20658h);
        h.append(", isDigital=");
        h.append(this.f20659i);
        h.append(", isFavorite=");
        h.append(this.f20660j);
        h.append(", canMoveToCart=");
        h.append(this.f20661k);
        h.append(", selectedVariations=");
        return C0070b.m186i(h, this.f20662l, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SaveForLaterListingResponse(java.lang.Long r14, java.lang.Long r15, java.lang.String r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.etsy.android.lib.models.apiv3.listing.ListingImage r21, java.lang.Boolean r22, java.lang.Boolean r23, java.lang.Boolean r24, java.util.List r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r15
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0019
        L_0x0017:
            r4 = r16
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r22
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r2
            goto L_0x0051
        L_0x004f:
            r11 = r23
        L_0x0051:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0057
            r12 = r2
            goto L_0x0059
        L_0x0057:
            r12 = r24
        L_0x0059:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r2 = r25
        L_0x0060:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.saveforlater.models.network.SaveForLaterListingResponse.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.ListingImage, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
