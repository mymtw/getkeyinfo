package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.currency.EtsyMoney;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

@C17403o(generateAdapter = true)
public final class ListingPartial {
    public static final int $stable = 8;
    private final String imageUrl170;
    private String legacyCurrencyCode;
    private String legacyCurrencySymbol;
    private final String legacyPrice;
    private final long listingId;
    private final EtsyMoney price;
    private Integer status;
    private String statusValue;
    private final String title;
    private final String url;

    public ListingPartial(@C17402n(name = "listing_id") long j, @C17402n(name = "url") String str, @C17402n(name = "title") String str2, @C17402n(name = "image170") String str3, @C17402n(name = "discounted_price") EtsyMoney etsyMoney, @C17402n(name = "status") Integer num, @C17402n(name = "status_value") String str4, @C17402n(name = "price") String str5, @C17402n(name = "currency_code") String str6, @C17402n(name = "currency_symbol") String str7) {
        C0048b.m167f(str, "url", str2, "title", str3, "imageUrl170");
        this.listingId = j;
        this.url = str;
        this.title = str2;
        this.imageUrl170 = str3;
        this.price = etsyMoney;
        this.status = num;
        this.statusValue = str4;
        this.legacyPrice = str5;
        this.legacyCurrencyCode = str6;
        this.legacyCurrencySymbol = str7;
    }

    public static /* synthetic */ ListingPartial copy$default(ListingPartial listingPartial, long j, String str, String str2, String str3, EtsyMoney etsyMoney, Integer num, String str4, String str5, String str6, String str7, int i, Object obj) {
        ListingPartial listingPartial2 = listingPartial;
        int i2 = i;
        return listingPartial.copy((i2 & 1) != 0 ? listingPartial2.listingId : j, (i2 & 2) != 0 ? listingPartial2.url : str, (i2 & 4) != 0 ? listingPartial2.title : str2, (i2 & 8) != 0 ? listingPartial2.imageUrl170 : str3, (i2 & 16) != 0 ? listingPartial2.price : etsyMoney, (i2 & 32) != 0 ? listingPartial2.status : num, (i2 & 64) != 0 ? listingPartial2.statusValue : str4, (i2 & 128) != 0 ? listingPartial2.legacyPrice : str5, (i2 & 256) != 0 ? listingPartial2.legacyCurrencyCode : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingPartial2.legacyCurrencySymbol : str7);
    }

    public final long component1() {
        return this.listingId;
    }

    public final String component10() {
        return this.legacyCurrencySymbol;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.imageUrl170;
    }

    public final EtsyMoney component5() {
        return this.price;
    }

    public final Integer component6() {
        return this.status;
    }

    public final String component7() {
        return this.statusValue;
    }

    public final String component8() {
        return this.legacyPrice;
    }

    public final String component9() {
        return this.legacyCurrencyCode;
    }

    public final ListingPartial copy(@C17402n(name = "listing_id") long j, @C17402n(name = "url") String str, @C17402n(name = "title") String str2, @C17402n(name = "image170") String str3, @C17402n(name = "discounted_price") EtsyMoney etsyMoney, @C17402n(name = "status") Integer num, @C17402n(name = "status_value") String str4, @C17402n(name = "price") String str5, @C17402n(name = "currency_code") String str6, @C17402n(name = "currency_symbol") String str7) {
        String str8 = str;
        C19383o.m32797g(str8, "url");
        String str9 = str2;
        C19383o.m32797g(str9, "title");
        String str10 = str3;
        C19383o.m32797g(str10, "imageUrl170");
        return new ListingPartial(j, str8, str9, str10, etsyMoney, num, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingPartial)) {
            return false;
        }
        ListingPartial listingPartial = (ListingPartial) obj;
        return this.listingId == listingPartial.listingId && C19383o.m32792b(this.url, listingPartial.url) && C19383o.m32792b(this.title, listingPartial.title) && C19383o.m32792b(this.imageUrl170, listingPartial.imageUrl170) && C19383o.m32792b(this.price, listingPartial.price) && C19383o.m32792b(this.status, listingPartial.status) && C19383o.m32792b(this.statusValue, listingPartial.statusValue) && C19383o.m32792b(this.legacyPrice, listingPartial.legacyPrice) && C19383o.m32792b(this.legacyCurrencyCode, listingPartial.legacyCurrencyCode) && C19383o.m32792b(this.legacyCurrencySymbol, listingPartial.legacyCurrencySymbol);
    }

    public final String getImageUrl170() {
        return this.imageUrl170;
    }

    public final String getLegacyCurrencyCode() {
        return this.legacyCurrencyCode;
    }

    public final String getLegacyCurrencySymbol() {
        return this.legacyCurrencySymbol;
    }

    public final String getLegacyPrice() {
        return this.legacyPrice;
    }

    public final long getListingId() {
        return this.listingId;
    }

    public final EtsyMoney getPrice() {
        return this.price;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusValue() {
        return this.statusValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.imageUrl170, C0023f.m105e(this.title, C0023f.m105e(this.url, Long.hashCode(this.listingId) * 31, 31), 31), 31);
        EtsyMoney etsyMoney = this.price;
        int i = 0;
        int hashCode = (e + (etsyMoney == null ? 0 : etsyMoney.hashCode())) * 31;
        Integer num = this.status;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusValue;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.legacyPrice;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.legacyCurrencyCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.legacyCurrencySymbol;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public final void setLegacyCurrencyCode(String str) {
        this.legacyCurrencyCode = str;
    }

    public final void setLegacyCurrencySymbol(String str) {
        this.legacyCurrencySymbol = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setStatusValue(String str) {
        this.statusValue = str;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingPartial(listingId=");
        h.append(this.listingId);
        h.append(", url=");
        h.append(this.url);
        h.append(", title=");
        h.append(this.title);
        h.append(", imageUrl170=");
        h.append(this.imageUrl170);
        h.append(", price=");
        h.append(this.price);
        h.append(", status=");
        h.append(this.status);
        h.append(", statusValue=");
        h.append(this.statusValue);
        h.append(", legacyPrice=");
        h.append(this.legacyPrice);
        h.append(", legacyCurrencyCode=");
        h.append(this.legacyCurrencyCode);
        h.append(", legacyCurrencySymbol=");
        return C0391c.m1057c(h, this.legacyCurrencySymbol, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingPartial(long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.etsy.android.lib.currency.EtsyMoney r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r6 = r2
            goto L_0x000c
        L_0x000a:
            r6 = r18
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0012
            r7 = r2
            goto L_0x0014
        L_0x0012:
            r7 = r19
        L_0x0014:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001a
            r8 = r2
            goto L_0x001c
        L_0x001a:
            r8 = r20
        L_0x001c:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0023
            r9 = r2
            goto L_0x0025
        L_0x0023:
            r9 = r21
        L_0x0025:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            r10 = r2
            goto L_0x002d
        L_0x002b:
            r10 = r22
        L_0x002d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            r11 = r2
            goto L_0x0035
        L_0x0033:
            r11 = r23
        L_0x0035:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            r12 = r2
            goto L_0x003d
        L_0x003b:
            r12 = r24
        L_0x003d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0043
            r13 = r2
            goto L_0x0045
        L_0x0043:
            r13 = r25
        L_0x0045:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004b
            r14 = r2
            goto L_0x004d
        L_0x004b:
            r14 = r26
        L_0x004d:
            r3 = r15
            r4 = r16
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ListingPartial.<init>(long, java.lang.String, java.lang.String, java.lang.String, com.etsy.android.lib.currency.EtsyMoney, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
