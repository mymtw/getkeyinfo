package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShippingUpgradeResults {
    public static final int $stable = 8;
    private final List<ShippingUpgrade> domestic;
    private final Boolean hasDomestic;
    private final Boolean hasInternational;
    private final List<ShippingUpgrade> international;

    public ShippingUpgradeResults(@C17402n(name = "domestic") List<ShippingUpgrade> list, @C17402n(name = "has_domestic") Boolean bool, @C17402n(name = "has_international") Boolean bool2, @C17402n(name = "international") List<ShippingUpgrade> list2) {
        this.domestic = list;
        this.hasDomestic = bool;
        this.hasInternational = bool2;
        this.international = list2;
    }

    public static /* synthetic */ ShippingUpgradeResults copy$default(ShippingUpgradeResults shippingUpgradeResults, List<ShippingUpgrade> list, Boolean bool, Boolean bool2, List<ShippingUpgrade> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shippingUpgradeResults.domestic;
        }
        if ((i & 2) != 0) {
            bool = shippingUpgradeResults.hasDomestic;
        }
        if ((i & 4) != 0) {
            bool2 = shippingUpgradeResults.hasInternational;
        }
        if ((i & 8) != 0) {
            list2 = shippingUpgradeResults.international;
        }
        return shippingUpgradeResults.copy(list, bool, bool2, list2);
    }

    public final List<ShippingUpgrade> component1() {
        return this.domestic;
    }

    public final Boolean component2() {
        return this.hasDomestic;
    }

    public final Boolean component3() {
        return this.hasInternational;
    }

    public final List<ShippingUpgrade> component4() {
        return this.international;
    }

    public final ShippingUpgradeResults copy(@C17402n(name = "domestic") List<ShippingUpgrade> list, @C17402n(name = "has_domestic") Boolean bool, @C17402n(name = "has_international") Boolean bool2, @C17402n(name = "international") List<ShippingUpgrade> list2) {
        return new ShippingUpgradeResults(list, bool, bool2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingUpgradeResults)) {
            return false;
        }
        ShippingUpgradeResults shippingUpgradeResults = (ShippingUpgradeResults) obj;
        return C19383o.m32792b(this.domestic, shippingUpgradeResults.domestic) && C19383o.m32792b(this.hasDomestic, shippingUpgradeResults.hasDomestic) && C19383o.m32792b(this.hasInternational, shippingUpgradeResults.hasInternational) && C19383o.m32792b(this.international, shippingUpgradeResults.international);
    }

    public final List<ShippingUpgrade> getDomestic() {
        return this.domestic;
    }

    public final Boolean getHasDomestic() {
        return this.hasDomestic;
    }

    public final Boolean getHasInternational() {
        return this.hasInternational;
    }

    public final List<ShippingUpgrade> getInternational() {
        return this.international;
    }

    public int hashCode() {
        List<ShippingUpgrade> list = this.domestic;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasDomestic;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasInternational;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<ShippingUpgrade> list2 = this.international;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShippingUpgradeResults(domestic=");
        h.append(this.domestic);
        h.append(", hasDomestic=");
        h.append(this.hasDomestic);
        h.append(", hasInternational=");
        h.append(this.hasInternational);
        h.append(", international=");
        return C0070b.m186i(h, this.international, ')');
    }
}
