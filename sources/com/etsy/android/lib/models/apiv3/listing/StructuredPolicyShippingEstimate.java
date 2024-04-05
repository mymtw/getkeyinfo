package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class StructuredPolicyShippingEstimate {
    public static final int $stable = 0;
    private final Integer countryId;
    private final String displayName;
    private final Integer max;
    private final Integer min;
    private final String region;
    private final String regionCode;
    private final String type;
    private final String unit;

    public StructuredPolicyShippingEstimate(@C17402n(name = "display_name") String str, @C17402n(name = "region") String str2, @C17402n(name = "region_code") String str3, @C17402n(name = "type") String str4, @C17402n(name = "min") Integer num, @C17402n(name = "max") Integer num2, @C17402n(name = "unit") String str5, @C17402n(name = "country_id") Integer num3) {
        this.displayName = str;
        this.region = str2;
        this.regionCode = str3;
        this.type = str4;
        this.min = num;
        this.max = num2;
        this.unit = str5;
        this.countryId = num3;
    }

    public static /* synthetic */ StructuredPolicyShippingEstimate copy$default(StructuredPolicyShippingEstimate structuredPolicyShippingEstimate, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Integer num3, int i, Object obj) {
        StructuredPolicyShippingEstimate structuredPolicyShippingEstimate2 = structuredPolicyShippingEstimate;
        int i2 = i;
        return structuredPolicyShippingEstimate.copy((i2 & 1) != 0 ? structuredPolicyShippingEstimate2.displayName : str, (i2 & 2) != 0 ? structuredPolicyShippingEstimate2.region : str2, (i2 & 4) != 0 ? structuredPolicyShippingEstimate2.regionCode : str3, (i2 & 8) != 0 ? structuredPolicyShippingEstimate2.type : str4, (i2 & 16) != 0 ? structuredPolicyShippingEstimate2.min : num, (i2 & 32) != 0 ? structuredPolicyShippingEstimate2.max : num2, (i2 & 64) != 0 ? structuredPolicyShippingEstimate2.unit : str5, (i2 & 128) != 0 ? structuredPolicyShippingEstimate2.countryId : num3);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.region;
    }

    public final String component3() {
        return this.regionCode;
    }

    public final String component4() {
        return this.type;
    }

    public final Integer component5() {
        return this.min;
    }

    public final Integer component6() {
        return this.max;
    }

    public final String component7() {
        return this.unit;
    }

    public final Integer component8() {
        return this.countryId;
    }

    public final StructuredPolicyShippingEstimate copy(@C17402n(name = "display_name") String str, @C17402n(name = "region") String str2, @C17402n(name = "region_code") String str3, @C17402n(name = "type") String str4, @C17402n(name = "min") Integer num, @C17402n(name = "max") Integer num2, @C17402n(name = "unit") String str5, @C17402n(name = "country_id") Integer num3) {
        return new StructuredPolicyShippingEstimate(str, str2, str3, str4, num, num2, str5, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StructuredPolicyShippingEstimate)) {
            return false;
        }
        StructuredPolicyShippingEstimate structuredPolicyShippingEstimate = (StructuredPolicyShippingEstimate) obj;
        return C19383o.m32792b(this.displayName, structuredPolicyShippingEstimate.displayName) && C19383o.m32792b(this.region, structuredPolicyShippingEstimate.region) && C19383o.m32792b(this.regionCode, structuredPolicyShippingEstimate.regionCode) && C19383o.m32792b(this.type, structuredPolicyShippingEstimate.type) && C19383o.m32792b(this.min, structuredPolicyShippingEstimate.min) && C19383o.m32792b(this.max, structuredPolicyShippingEstimate.max) && C19383o.m32792b(this.unit, structuredPolicyShippingEstimate.unit) && C19383o.m32792b(this.countryId, structuredPolicyShippingEstimate.countryId);
    }

    public final Integer getCountryId() {
        return this.countryId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Integer getMax() {
        return this.max;
    }

    public final Integer getMin() {
        return this.min;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        String str = this.displayName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.region;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.min;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.max;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.unit;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.countryId;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("StructuredPolicyShippingEstimate(displayName=");
        h.append(this.displayName);
        h.append(", region=");
        h.append(this.region);
        h.append(", regionCode=");
        h.append(this.regionCode);
        h.append(", type=");
        h.append(this.type);
        h.append(", min=");
        h.append(this.min);
        h.append(", max=");
        h.append(this.max);
        h.append(", unit=");
        h.append(this.unit);
        h.append(", countryId=");
        return C0023f.m109j(h, this.countryId, ')');
    }
}
