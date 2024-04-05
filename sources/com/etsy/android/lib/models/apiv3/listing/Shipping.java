package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class Shipping {
    public static final int $stable = 8;
    private final Boolean hasProcessingTimeRange;
    private final String locationText;
    private final Integer processingMax;
    private final Integer processingMin;
    private final String processingTimeRange;
    private final Integer profileType;
    private final QuickDelivery quickDelivery;
    private final Integer sellerGeonamesCountryId;
    private final String shippingCost;
    private final Boolean shipsEverywhere;
    private final String shipsFrom;
    private final String shipsFromCity;
    private final Integer shipsFromCountryId;
    private final String shipsFromPostalCode;
    private final String shipsFromState;
    private final List<ShippingProfileEntryBasic> shipsTo;
    private final ShippingUpgradeResults upgrades;

    public Shipping() {
        this((Boolean) null, (String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (List) null, (ShippingUpgradeResults) null, (QuickDelivery) null, 131071, (DefaultConstructorMarker) null);
    }

    public Shipping(@C17402n(name = "has_processing_time_range") Boolean bool, @C17402n(name = "location_text") String str, @C17402n(name = "processing_max") Integer num, @C17402n(name = "processing_min") Integer num2, @C17402n(name = "processing_time_range") String str2, @C17402n(name = "profile_type") Integer num3, @C17402n(name = "seller_geonames_country_id") Integer num4, @C17402n(name = "shipping_cost") String str3, @C17402n(name = "ships_everywhere") Boolean bool2, @C17402n(name = "ships_from") String str4, @C17402n(name = "ships_from_city") String str5, @C17402n(name = "ships_from_country_id") Integer num5, @C17402n(name = "ships_from_postal_code") String str6, @C17402n(name = "ships_from_state") String str7, @C17402n(name = "ships_to") List<ShippingProfileEntryBasic> list, @C17402n(name = "upgrades") ShippingUpgradeResults shippingUpgradeResults, @C17402n(name = "quick_delivery") QuickDelivery quickDelivery2) {
        this.hasProcessingTimeRange = bool;
        this.locationText = str;
        this.processingMax = num;
        this.processingMin = num2;
        this.processingTimeRange = str2;
        this.profileType = num3;
        this.sellerGeonamesCountryId = num4;
        this.shippingCost = str3;
        this.shipsEverywhere = bool2;
        this.shipsFrom = str4;
        this.shipsFromCity = str5;
        this.shipsFromCountryId = num5;
        this.shipsFromPostalCode = str6;
        this.shipsFromState = str7;
        this.shipsTo = list;
        this.upgrades = shippingUpgradeResults;
        this.quickDelivery = quickDelivery2;
    }

    public static /* synthetic */ Shipping copy$default(Shipping shipping, Boolean bool, String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, String str3, Boolean bool2, String str4, String str5, Integer num5, String str6, String str7, List list, ShippingUpgradeResults shippingUpgradeResults, QuickDelivery quickDelivery2, int i, Object obj) {
        Shipping shipping2 = shipping;
        int i2 = i;
        return shipping.copy((i2 & 1) != 0 ? shipping2.hasProcessingTimeRange : bool, (i2 & 2) != 0 ? shipping2.locationText : str, (i2 & 4) != 0 ? shipping2.processingMax : num, (i2 & 8) != 0 ? shipping2.processingMin : num2, (i2 & 16) != 0 ? shipping2.processingTimeRange : str2, (i2 & 32) != 0 ? shipping2.profileType : num3, (i2 & 64) != 0 ? shipping2.sellerGeonamesCountryId : num4, (i2 & 128) != 0 ? shipping2.shippingCost : str3, (i2 & 256) != 0 ? shipping2.shipsEverywhere : bool2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shipping2.shipsFrom : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shipping2.shipsFromCity : str5, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shipping2.shipsFromCountryId : num5, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shipping2.shipsFromPostalCode : str6, (i2 & 8192) != 0 ? shipping2.shipsFromState : str7, (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shipping2.shipsTo : list, (i2 & 32768) != 0 ? shipping2.upgrades : shippingUpgradeResults, (i2 & 65536) != 0 ? shipping2.quickDelivery : quickDelivery2);
    }

    public final Boolean component1() {
        return this.hasProcessingTimeRange;
    }

    public final String component10() {
        return this.shipsFrom;
    }

    public final String component11() {
        return this.shipsFromCity;
    }

    public final Integer component12() {
        return this.shipsFromCountryId;
    }

    public final String component13() {
        return this.shipsFromPostalCode;
    }

    public final String component14() {
        return this.shipsFromState;
    }

    public final List<ShippingProfileEntryBasic> component15() {
        return this.shipsTo;
    }

    public final ShippingUpgradeResults component16() {
        return this.upgrades;
    }

    public final QuickDelivery component17() {
        return this.quickDelivery;
    }

    public final String component2() {
        return this.locationText;
    }

    public final Integer component3() {
        return this.processingMax;
    }

    public final Integer component4() {
        return this.processingMin;
    }

    public final String component5() {
        return this.processingTimeRange;
    }

    public final Integer component6() {
        return this.profileType;
    }

    public final Integer component7() {
        return this.sellerGeonamesCountryId;
    }

    public final String component8() {
        return this.shippingCost;
    }

    public final Boolean component9() {
        return this.shipsEverywhere;
    }

    public final Shipping copy(@C17402n(name = "has_processing_time_range") Boolean bool, @C17402n(name = "location_text") String str, @C17402n(name = "processing_max") Integer num, @C17402n(name = "processing_min") Integer num2, @C17402n(name = "processing_time_range") String str2, @C17402n(name = "profile_type") Integer num3, @C17402n(name = "seller_geonames_country_id") Integer num4, @C17402n(name = "shipping_cost") String str3, @C17402n(name = "ships_everywhere") Boolean bool2, @C17402n(name = "ships_from") String str4, @C17402n(name = "ships_from_city") String str5, @C17402n(name = "ships_from_country_id") Integer num5, @C17402n(name = "ships_from_postal_code") String str6, @C17402n(name = "ships_from_state") String str7, @C17402n(name = "ships_to") List<ShippingProfileEntryBasic> list, @C17402n(name = "upgrades") ShippingUpgradeResults shippingUpgradeResults, @C17402n(name = "quick_delivery") QuickDelivery quickDelivery2) {
        return new Shipping(bool, str, num, num2, str2, num3, num4, str3, bool2, str4, str5, num5, str6, str7, list, shippingUpgradeResults, quickDelivery2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shipping)) {
            return false;
        }
        Shipping shipping = (Shipping) obj;
        return C19383o.m32792b(this.hasProcessingTimeRange, shipping.hasProcessingTimeRange) && C19383o.m32792b(this.locationText, shipping.locationText) && C19383o.m32792b(this.processingMax, shipping.processingMax) && C19383o.m32792b(this.processingMin, shipping.processingMin) && C19383o.m32792b(this.processingTimeRange, shipping.processingTimeRange) && C19383o.m32792b(this.profileType, shipping.profileType) && C19383o.m32792b(this.sellerGeonamesCountryId, shipping.sellerGeonamesCountryId) && C19383o.m32792b(this.shippingCost, shipping.shippingCost) && C19383o.m32792b(this.shipsEverywhere, shipping.shipsEverywhere) && C19383o.m32792b(this.shipsFrom, shipping.shipsFrom) && C19383o.m32792b(this.shipsFromCity, shipping.shipsFromCity) && C19383o.m32792b(this.shipsFromCountryId, shipping.shipsFromCountryId) && C19383o.m32792b(this.shipsFromPostalCode, shipping.shipsFromPostalCode) && C19383o.m32792b(this.shipsFromState, shipping.shipsFromState) && C19383o.m32792b(this.shipsTo, shipping.shipsTo) && C19383o.m32792b(this.upgrades, shipping.upgrades) && C19383o.m32792b(this.quickDelivery, shipping.quickDelivery);
    }

    public final Boolean getHasProcessingTimeRange() {
        return this.hasProcessingTimeRange;
    }

    public final String getLocationText() {
        return this.locationText;
    }

    public final Integer getProcessingMax() {
        return this.processingMax;
    }

    public final Integer getProcessingMin() {
        return this.processingMin;
    }

    public final String getProcessingTimeRange() {
        return this.processingTimeRange;
    }

    public final Integer getProfileType() {
        return this.profileType;
    }

    public final QuickDelivery getQuickDelivery() {
        return this.quickDelivery;
    }

    public final Integer getSellerGeonamesCountryId() {
        return this.sellerGeonamesCountryId;
    }

    public final String getShippingCost() {
        return this.shippingCost;
    }

    public final Boolean getShipsEverywhere() {
        return this.shipsEverywhere;
    }

    public final String getShipsFrom() {
        return this.shipsFrom;
    }

    public final String getShipsFromCity() {
        return this.shipsFromCity;
    }

    public final Integer getShipsFromCountryId() {
        return this.shipsFromCountryId;
    }

    public final String getShipsFromPostalCode() {
        return this.shipsFromPostalCode;
    }

    public final String getShipsFromState() {
        return this.shipsFromState;
    }

    public final List<ShippingProfileEntryBasic> getShipsTo() {
        return this.shipsTo;
    }

    public final ShippingUpgradeResults getUpgrades() {
        return this.upgrades;
    }

    public int hashCode() {
        Boolean bool = this.hasProcessingTimeRange;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.locationText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.processingMax;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.processingMin;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.processingTimeRange;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.profileType;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sellerGeonamesCountryId;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.shippingCost;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.shipsEverywhere;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.shipsFrom;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shipsFromCity;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.shipsFromCountryId;
        int hashCode12 = (hashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.shipsFromPostalCode;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shipsFromState;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<ShippingProfileEntryBasic> list = this.shipsTo;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        ShippingUpgradeResults shippingUpgradeResults = this.upgrades;
        int hashCode16 = (hashCode15 + (shippingUpgradeResults == null ? 0 : shippingUpgradeResults.hashCode())) * 31;
        QuickDelivery quickDelivery2 = this.quickDelivery;
        if (quickDelivery2 != null) {
            i = quickDelivery2.hashCode();
        }
        return hashCode16 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Shipping(hasProcessingTimeRange=");
        h.append(this.hasProcessingTimeRange);
        h.append(", locationText=");
        h.append(this.locationText);
        h.append(", processingMax=");
        h.append(this.processingMax);
        h.append(", processingMin=");
        h.append(this.processingMin);
        h.append(", processingTimeRange=");
        h.append(this.processingTimeRange);
        h.append(", profileType=");
        h.append(this.profileType);
        h.append(", sellerGeonamesCountryId=");
        h.append(this.sellerGeonamesCountryId);
        h.append(", shippingCost=");
        h.append(this.shippingCost);
        h.append(", shipsEverywhere=");
        h.append(this.shipsEverywhere);
        h.append(", shipsFrom=");
        h.append(this.shipsFrom);
        h.append(", shipsFromCity=");
        h.append(this.shipsFromCity);
        h.append(", shipsFromCountryId=");
        h.append(this.shipsFromCountryId);
        h.append(", shipsFromPostalCode=");
        h.append(this.shipsFromPostalCode);
        h.append(", shipsFromState=");
        h.append(this.shipsFromState);
        h.append(", shipsTo=");
        h.append(this.shipsTo);
        h.append(", upgrades=");
        h.append(this.upgrades);
        h.append(", quickDelivery=");
        h.append(this.quickDelivery);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Shipping(java.lang.Boolean r19, java.lang.String r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.String r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.String r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, java.util.List r33, com.etsy.android.lib.models.apiv3.listing.ShippingUpgradeResults r34, com.etsy.android.lib.models.apiv3.listing.QuickDelivery r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r23
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r24
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r25
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r26
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r27
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r28
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r29
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r30
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r31
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r32
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r33
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r34
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x008e
            r0 = 0
            goto L_0x0090
        L_0x008e:
            r0 = r35
        L_0x0090:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.Shipping.<init>(java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, com.etsy.android.lib.models.apiv3.listing.ShippingUpgradeResults, com.etsy.android.lib.models.apiv3.listing.QuickDelivery, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
