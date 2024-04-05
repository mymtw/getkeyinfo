package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class FreeShippingData {
    public static final int $stable = 0;
    private final String freeShippingCopy;
    private final Boolean hasFreeShipping;
    private final Boolean hasMin;
    private final Boolean isEligible;
    private final Long promotionId;
    private final Integer promotionType;
    private final String tooltipCopy;

    public FreeShippingData(@C17402n(name = "free_shipping_copy") String str, @C17402n(name = "has_free_shipping") Boolean bool, @C17402n(name = "has_min") Boolean bool2, @C17402n(name = "is_eligible") Boolean bool3, @C17402n(name = "promotion_id") Long l, @C17402n(name = "promotion_type") Integer num, @C17402n(name = "tooltip_copy") String str2) {
        this.freeShippingCopy = str;
        this.hasFreeShipping = bool;
        this.hasMin = bool2;
        this.isEligible = bool3;
        this.promotionId = l;
        this.promotionType = num;
        this.tooltipCopy = str2;
    }

    public static /* synthetic */ FreeShippingData copy$default(FreeShippingData freeShippingData, String str, Boolean bool, Boolean bool2, Boolean bool3, Long l, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = freeShippingData.freeShippingCopy;
        }
        if ((i & 2) != 0) {
            bool = freeShippingData.hasFreeShipping;
        }
        Boolean bool4 = bool;
        if ((i & 4) != 0) {
            bool2 = freeShippingData.hasMin;
        }
        Boolean bool5 = bool2;
        if ((i & 8) != 0) {
            bool3 = freeShippingData.isEligible;
        }
        Boolean bool6 = bool3;
        if ((i & 16) != 0) {
            l = freeShippingData.promotionId;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            num = freeShippingData.promotionType;
        }
        Integer num2 = num;
        if ((i & 64) != 0) {
            str2 = freeShippingData.tooltipCopy;
        }
        return freeShippingData.copy(str, bool4, bool5, bool6, l2, num2, str2);
    }

    public final String component1() {
        return this.freeShippingCopy;
    }

    public final Boolean component2() {
        return this.hasFreeShipping;
    }

    public final Boolean component3() {
        return this.hasMin;
    }

    public final Boolean component4() {
        return this.isEligible;
    }

    public final Long component5() {
        return this.promotionId;
    }

    public final Integer component6() {
        return this.promotionType;
    }

    public final String component7() {
        return this.tooltipCopy;
    }

    public final FreeShippingData copy(@C17402n(name = "free_shipping_copy") String str, @C17402n(name = "has_free_shipping") Boolean bool, @C17402n(name = "has_min") Boolean bool2, @C17402n(name = "is_eligible") Boolean bool3, @C17402n(name = "promotion_id") Long l, @C17402n(name = "promotion_type") Integer num, @C17402n(name = "tooltip_copy") String str2) {
        return new FreeShippingData(str, bool, bool2, bool3, l, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeShippingData)) {
            return false;
        }
        FreeShippingData freeShippingData = (FreeShippingData) obj;
        return C19383o.m32792b(this.freeShippingCopy, freeShippingData.freeShippingCopy) && C19383o.m32792b(this.hasFreeShipping, freeShippingData.hasFreeShipping) && C19383o.m32792b(this.hasMin, freeShippingData.hasMin) && C19383o.m32792b(this.isEligible, freeShippingData.isEligible) && C19383o.m32792b(this.promotionId, freeShippingData.promotionId) && C19383o.m32792b(this.promotionType, freeShippingData.promotionType) && C19383o.m32792b(this.tooltipCopy, freeShippingData.tooltipCopy);
    }

    public final String getFreeShippingCopy() {
        return this.freeShippingCopy;
    }

    public final Boolean getHasFreeShipping() {
        return this.hasFreeShipping;
    }

    public final Boolean getHasMin() {
        return this.hasMin;
    }

    public final Long getPromotionId() {
        return this.promotionId;
    }

    public final Integer getPromotionType() {
        return this.promotionType;
    }

    public final String getTooltipCopy() {
        return this.tooltipCopy;
    }

    public int hashCode() {
        String str = this.freeShippingCopy;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasFreeShipping;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasMin;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isEligible;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.promotionId;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.promotionType;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.tooltipCopy;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode6 + i;
    }

    public final Boolean isEligible() {
        return this.isEligible;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("FreeShippingData(freeShippingCopy=");
        h.append(this.freeShippingCopy);
        h.append(", hasFreeShipping=");
        h.append(this.hasFreeShipping);
        h.append(", hasMin=");
        h.append(this.hasMin);
        h.append(", isEligible=");
        h.append(this.isEligible);
        h.append(", promotionId=");
        h.append(this.promotionId);
        h.append(", promotionType=");
        h.append(this.promotionType);
        h.append(", tooltipCopy=");
        return C0391c.m1057c(h, this.tooltipCopy, ')');
    }
}
