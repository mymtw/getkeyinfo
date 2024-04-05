package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShippingProfileEntryBasic {
    public static final int $stable = 0;
    private final String name;
    private final ShippingCost primaryCost;
    private final ShippingCost secondaryCost;

    public ShippingProfileEntryBasic() {
        this((String) null, (ShippingCost) null, (ShippingCost) null, 7, (DefaultConstructorMarker) null);
    }

    public ShippingProfileEntryBasic(@C17402n(name = "name") String str, @C17402n(name = "primary_cost") ShippingCost shippingCost, @C17402n(name = "secondary_cost") ShippingCost shippingCost2) {
        this.name = str;
        this.primaryCost = shippingCost;
        this.secondaryCost = shippingCost2;
    }

    public static /* synthetic */ ShippingProfileEntryBasic copy$default(ShippingProfileEntryBasic shippingProfileEntryBasic, String str, ShippingCost shippingCost, ShippingCost shippingCost2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingProfileEntryBasic.name;
        }
        if ((i & 2) != 0) {
            shippingCost = shippingProfileEntryBasic.primaryCost;
        }
        if ((i & 4) != 0) {
            shippingCost2 = shippingProfileEntryBasic.secondaryCost;
        }
        return shippingProfileEntryBasic.copy(str, shippingCost, shippingCost2);
    }

    public final String component1() {
        return this.name;
    }

    public final ShippingCost component2() {
        return this.primaryCost;
    }

    public final ShippingCost component3() {
        return this.secondaryCost;
    }

    public final ShippingProfileEntryBasic copy(@C17402n(name = "name") String str, @C17402n(name = "primary_cost") ShippingCost shippingCost, @C17402n(name = "secondary_cost") ShippingCost shippingCost2) {
        return new ShippingProfileEntryBasic(str, shippingCost, shippingCost2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingProfileEntryBasic)) {
            return false;
        }
        ShippingProfileEntryBasic shippingProfileEntryBasic = (ShippingProfileEntryBasic) obj;
        return C19383o.m32792b(this.name, shippingProfileEntryBasic.name) && C19383o.m32792b(this.primaryCost, shippingProfileEntryBasic.primaryCost) && C19383o.m32792b(this.secondaryCost, shippingProfileEntryBasic.secondaryCost);
    }

    public final String getName() {
        return this.name;
    }

    public final ShippingCost getPrimaryCost() {
        return this.primaryCost;
    }

    public final ShippingCost getSecondaryCost() {
        return this.secondaryCost;
    }

    public int hashCode() {
        String str = this.name;
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
        StringBuilder h = C0072d.m201h("ShippingProfileEntryBasic(name=");
        h.append(this.name);
        h.append(", primaryCost=");
        h.append(this.primaryCost);
        h.append(", secondaryCost=");
        h.append(this.secondaryCost);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingProfileEntryBasic(String str, ShippingCost shippingCost, ShippingCost shippingCost2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : shippingCost, (i & 4) != 0 ? null : shippingCost2);
    }
}
