package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShippingUpgrade {
    public static final int $stable = 0;
    private final String destination;
    private final ShippingCost primaryCost;
    private final ShippingCost secondaryCost;

    public ShippingUpgrade(@C17402n(name = "destination") String str, @C17402n(name = "primary_cost") ShippingCost shippingCost, @C17402n(name = "secondary_cost") ShippingCost shippingCost2) {
        this.destination = str;
        this.primaryCost = shippingCost;
        this.secondaryCost = shippingCost2;
    }

    public static /* synthetic */ ShippingUpgrade copy$default(ShippingUpgrade shippingUpgrade, String str, ShippingCost shippingCost, ShippingCost shippingCost2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingUpgrade.destination;
        }
        if ((i & 2) != 0) {
            shippingCost = shippingUpgrade.primaryCost;
        }
        if ((i & 4) != 0) {
            shippingCost2 = shippingUpgrade.secondaryCost;
        }
        return shippingUpgrade.copy(str, shippingCost, shippingCost2);
    }

    public final String component1() {
        return this.destination;
    }

    public final ShippingCost component2() {
        return this.primaryCost;
    }

    public final ShippingCost component3() {
        return this.secondaryCost;
    }

    public final ShippingUpgrade copy(@C17402n(name = "destination") String str, @C17402n(name = "primary_cost") ShippingCost shippingCost, @C17402n(name = "secondary_cost") ShippingCost shippingCost2) {
        return new ShippingUpgrade(str, shippingCost, shippingCost2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingUpgrade)) {
            return false;
        }
        ShippingUpgrade shippingUpgrade = (ShippingUpgrade) obj;
        return C19383o.m32792b(this.destination, shippingUpgrade.destination) && C19383o.m32792b(this.primaryCost, shippingUpgrade.primaryCost) && C19383o.m32792b(this.secondaryCost, shippingUpgrade.secondaryCost);
    }

    public final String getDestination() {
        return this.destination;
    }

    public final ShippingCost getPrimaryCost() {
        return this.primaryCost;
    }

    public final ShippingCost getSecondaryCost() {
        return this.secondaryCost;
    }

    public int hashCode() {
        String str = this.destination;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ShippingCost shippingCost = this.primaryCost;
        int hashCode2 = (hashCode + (shippingCost == null ? 0 : shippingCost.hashCode())) * 31;
        ShippingCost shippingCost2 = this.secondaryCost;
        if (shippingCost2 != null) {
            i = shippingCost2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShippingUpgrade(destination=");
        h.append(this.destination);
        h.append(", primaryCost=");
        h.append(this.primaryCost);
        h.append(", secondaryCost=");
        h.append(this.secondaryCost);
        h.append(')');
        return h.toString();
    }
}
