package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class StructuredPolicyShipping {
    public static final int $stable = 8;
    private final List<StructuredPolicyShippingEstimate> estimates;
    private final Boolean hasShippingUpgrades;
    private final String processingTimeText;
    private final Boolean shipsInternational;

    public StructuredPolicyShipping() {
        this((List) null, (Boolean) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    public StructuredPolicyShipping(@C17402n(name = "estimates") List<StructuredPolicyShippingEstimate> list, @C17402n(name = "has_shipping_upgrades") Boolean bool, @C17402n(name = "processing_time_text") String str, @C17402n(name = "ships_international") Boolean bool2) {
        this.estimates = list;
        this.hasShippingUpgrades = bool;
        this.processingTimeText = str;
        this.shipsInternational = bool2;
    }

    public static /* synthetic */ StructuredPolicyShipping copy$default(StructuredPolicyShipping structuredPolicyShipping, List<StructuredPolicyShippingEstimate> list, Boolean bool, String str, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = structuredPolicyShipping.estimates;
        }
        if ((i & 2) != 0) {
            bool = structuredPolicyShipping.hasShippingUpgrades;
        }
        if ((i & 4) != 0) {
            str = structuredPolicyShipping.processingTimeText;
        }
        if ((i & 8) != 0) {
            bool2 = structuredPolicyShipping.shipsInternational;
        }
        return structuredPolicyShipping.copy(list, bool, str, bool2);
    }

    public final List<StructuredPolicyShippingEstimate> component1() {
        return this.estimates;
    }

    public final Boolean component2() {
        return this.hasShippingUpgrades;
    }

    public final String component3() {
        return this.processingTimeText;
    }

    public final Boolean component4() {
        return this.shipsInternational;
    }

    public final StructuredPolicyShipping copy(@C17402n(name = "estimates") List<StructuredPolicyShippingEstimate> list, @C17402n(name = "has_shipping_upgrades") Boolean bool, @C17402n(name = "processing_time_text") String str, @C17402n(name = "ships_international") Boolean bool2) {
        return new StructuredPolicyShipping(list, bool, str, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StructuredPolicyShipping)) {
            return false;
        }
        StructuredPolicyShipping structuredPolicyShipping = (StructuredPolicyShipping) obj;
        return C19383o.m32792b(this.estimates, structuredPolicyShipping.estimates) && C19383o.m32792b(this.hasShippingUpgrades, structuredPolicyShipping.hasShippingUpgrades) && C19383o.m32792b(this.processingTimeText, structuredPolicyShipping.processingTimeText) && C19383o.m32792b(this.shipsInternational, structuredPolicyShipping.shipsInternational);
    }

    public final List<StructuredPolicyShippingEstimate> getEstimates() {
        return this.estimates;
    }

    public final Boolean getHasShippingUpgrades() {
        return this.hasShippingUpgrades;
    }

    public final String getProcessingTimeText() {
        return this.processingTimeText;
    }

    public final Boolean getShipsInternational() {
        return this.shipsInternational;
    }

    public int hashCode() {
        List<StructuredPolicyShippingEstimate> list = this.estimates;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasShippingUpgrades;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.processingTimeText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.shipsInternational;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("StructuredPolicyShipping(estimates=");
        h.append(this.estimates);
        h.append(", hasShippingUpgrades=");
        h.append(this.hasShippingUpgrades);
        h.append(", processingTimeText=");
        h.append(this.processingTimeText);
        h.append(", shipsInternational=");
        h.append(this.shipsInternational);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StructuredPolicyShipping(List list, Boolean bool, String str, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool2);
    }
}
