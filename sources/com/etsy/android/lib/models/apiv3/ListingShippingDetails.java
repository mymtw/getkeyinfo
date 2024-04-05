package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.apiv3.listing.EstimatedDeliveryDateNudge;
import com.etsy.android.lib.models.apiv3.listing.QuickDelivery;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingShippingDetails {
    public static final int $stable = 8;
    private final List<Country> countries;
    private final String eddPreview;
    private final EstimatedDeliveryDateNudge estimatedDeliveryDateNudge;
    private final String estimatedDeliveryDateRange;
    private final QuickDelivery quickDelivery;
    private final ShippingAddressPreference shippingAddress;
    private final ShippingDisplay shippingDisplay;
    private final ShippingOption shippingOption;

    public ListingShippingDetails() {
        this((List) null, (ShippingAddressPreference) null, (ShippingOption) null, (ShippingDisplay) null, (QuickDelivery) null, (String) null, (EstimatedDeliveryDateNudge) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public ListingShippingDetails(@C17402n(name = "countries") List<Country> list, @C17402n(name = "default_address") ShippingAddressPreference shippingAddressPreference, @C17402n(name = "standard_option") ShippingOption shippingOption2, @C17402n(name = "shipping_display") ShippingDisplay shippingDisplay2, @C17402n(name = "quick_delivery") QuickDelivery quickDelivery2, @C17402n(name = "estimated_delivery_date_preview") String str, @C17402n(name = "estimated_delivery_date_nudge") EstimatedDeliveryDateNudge estimatedDeliveryDateNudge2, @C17402n(name = "estimated_delivery_date_date_range") String str2) {
        this.countries = list;
        this.shippingAddress = shippingAddressPreference;
        this.shippingOption = shippingOption2;
        this.shippingDisplay = shippingDisplay2;
        this.quickDelivery = quickDelivery2;
        this.eddPreview = str;
        this.estimatedDeliveryDateNudge = estimatedDeliveryDateNudge2;
        this.estimatedDeliveryDateRange = str2;
    }

    public static /* synthetic */ ListingShippingDetails copy$default(ListingShippingDetails listingShippingDetails, List list, ShippingAddressPreference shippingAddressPreference, ShippingOption shippingOption2, ShippingDisplay shippingDisplay2, QuickDelivery quickDelivery2, String str, EstimatedDeliveryDateNudge estimatedDeliveryDateNudge2, String str2, int i, Object obj) {
        ListingShippingDetails listingShippingDetails2 = listingShippingDetails;
        int i2 = i;
        return listingShippingDetails.copy((i2 & 1) != 0 ? listingShippingDetails2.countries : list, (i2 & 2) != 0 ? listingShippingDetails2.shippingAddress : shippingAddressPreference, (i2 & 4) != 0 ? listingShippingDetails2.shippingOption : shippingOption2, (i2 & 8) != 0 ? listingShippingDetails2.shippingDisplay : shippingDisplay2, (i2 & 16) != 0 ? listingShippingDetails2.quickDelivery : quickDelivery2, (i2 & 32) != 0 ? listingShippingDetails2.eddPreview : str, (i2 & 64) != 0 ? listingShippingDetails2.estimatedDeliveryDateNudge : estimatedDeliveryDateNudge2, (i2 & 128) != 0 ? listingShippingDetails2.estimatedDeliveryDateRange : str2);
    }

    public final List<Country> component1() {
        return this.countries;
    }

    public final ShippingAddressPreference component2() {
        return this.shippingAddress;
    }

    public final ShippingOption component3() {
        return this.shippingOption;
    }

    public final ShippingDisplay component4() {
        return this.shippingDisplay;
    }

    public final QuickDelivery component5() {
        return this.quickDelivery;
    }

    public final String component6() {
        return this.eddPreview;
    }

    public final EstimatedDeliveryDateNudge component7() {
        return this.estimatedDeliveryDateNudge;
    }

    public final String component8() {
        return this.estimatedDeliveryDateRange;
    }

    public final ListingShippingDetails copy(@C17402n(name = "countries") List<Country> list, @C17402n(name = "default_address") ShippingAddressPreference shippingAddressPreference, @C17402n(name = "standard_option") ShippingOption shippingOption2, @C17402n(name = "shipping_display") ShippingDisplay shippingDisplay2, @C17402n(name = "quick_delivery") QuickDelivery quickDelivery2, @C17402n(name = "estimated_delivery_date_preview") String str, @C17402n(name = "estimated_delivery_date_nudge") EstimatedDeliveryDateNudge estimatedDeliveryDateNudge2, @C17402n(name = "estimated_delivery_date_date_range") String str2) {
        return new ListingShippingDetails(list, shippingAddressPreference, shippingOption2, shippingDisplay2, quickDelivery2, str, estimatedDeliveryDateNudge2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingShippingDetails)) {
            return false;
        }
        ListingShippingDetails listingShippingDetails = (ListingShippingDetails) obj;
        return C19383o.m32792b(this.countries, listingShippingDetails.countries) && C19383o.m32792b(this.shippingAddress, listingShippingDetails.shippingAddress) && C19383o.m32792b(this.shippingOption, listingShippingDetails.shippingOption) && C19383o.m32792b(this.shippingDisplay, listingShippingDetails.shippingDisplay) && C19383o.m32792b(this.quickDelivery, listingShippingDetails.quickDelivery) && C19383o.m32792b(this.eddPreview, listingShippingDetails.eddPreview) && C19383o.m32792b(this.estimatedDeliveryDateNudge, listingShippingDetails.estimatedDeliveryDateNudge) && C19383o.m32792b(this.estimatedDeliveryDateRange, listingShippingDetails.estimatedDeliveryDateRange);
    }

    public final List<Country> getCountries() {
        return this.countries;
    }

    public final String getEddPreview() {
        return this.eddPreview;
    }

    public final EstimatedDeliveryDateNudge getEstimatedDeliveryDateNudge() {
        return this.estimatedDeliveryDateNudge;
    }

    public final String getEstimatedDeliveryDateRange() {
        return this.estimatedDeliveryDateRange;
    }

    public final QuickDelivery getQuickDelivery() {
        return this.quickDelivery;
    }

    public final ShippingAddressPreference getShippingAddress() {
        return this.shippingAddress;
    }

    public final ShippingDisplay getShippingDisplay() {
        return this.shippingDisplay;
    }

    public final ShippingOption getShippingOption() {
        return this.shippingOption;
    }

    public int hashCode() {
        List<Country> list = this.countries;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ShippingAddressPreference shippingAddressPreference = this.shippingAddress;
        int hashCode2 = (hashCode + (shippingAddressPreference == null ? 0 : shippingAddressPreference.hashCode())) * 31;
        ShippingOption shippingOption2 = this.shippingOption;
        int hashCode3 = (hashCode2 + (shippingOption2 == null ? 0 : shippingOption2.hashCode())) * 31;
        ShippingDisplay shippingDisplay2 = this.shippingDisplay;
        int hashCode4 = (hashCode3 + (shippingDisplay2 == null ? 0 : shippingDisplay2.hashCode())) * 31;
        QuickDelivery quickDelivery2 = this.quickDelivery;
        int hashCode5 = (hashCode4 + (quickDelivery2 == null ? 0 : quickDelivery2.hashCode())) * 31;
        String str = this.eddPreview;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        EstimatedDeliveryDateNudge estimatedDeliveryDateNudge2 = this.estimatedDeliveryDateNudge;
        int hashCode7 = (hashCode6 + (estimatedDeliveryDateNudge2 == null ? 0 : estimatedDeliveryDateNudge2.hashCode())) * 31;
        String str2 = this.estimatedDeliveryDateRange;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingShippingDetails(countries=");
        h.append(this.countries);
        h.append(", shippingAddress=");
        h.append(this.shippingAddress);
        h.append(", shippingOption=");
        h.append(this.shippingOption);
        h.append(", shippingDisplay=");
        h.append(this.shippingDisplay);
        h.append(", quickDelivery=");
        h.append(this.quickDelivery);
        h.append(", eddPreview=");
        h.append(this.eddPreview);
        h.append(", estimatedDeliveryDateNudge=");
        h.append(this.estimatedDeliveryDateNudge);
        h.append(", estimatedDeliveryDateRange=");
        return C0391c.m1057c(h, this.estimatedDeliveryDateRange, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingShippingDetails(java.util.List r10, com.etsy.android.lib.models.apiv3.ShippingAddressPreference r11, com.etsy.android.lib.models.apiv3.ShippingOption r12, com.etsy.android.lib.models.apiv3.ShippingDisplay r13, com.etsy.android.lib.models.apiv3.listing.QuickDelivery r14, java.lang.String r15, com.etsy.android.lib.models.apiv3.listing.EstimatedDeliveryDateNudge r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.ListingShippingDetails.<init>(java.util.List, com.etsy.android.lib.models.apiv3.ShippingAddressPreference, com.etsy.android.lib.models.apiv3.ShippingOption, com.etsy.android.lib.models.apiv3.ShippingDisplay, com.etsy.android.lib.models.apiv3.listing.QuickDelivery, java.lang.String, com.etsy.android.lib.models.apiv3.listing.EstimatedDeliveryDateNudge, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
