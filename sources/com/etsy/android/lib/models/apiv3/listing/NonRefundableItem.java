package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class NonRefundableItem {
    public static final int $stable = 0;
    private final String name;
    private final Boolean nonRefundable;
    private final String type;

    public NonRefundableItem(@C17402n(name = "name") String str, @C17402n(name = "non_refundable") Boolean bool, @C17402n(name = "type") String str2) {
        this.name = str;
        this.nonRefundable = bool;
        this.type = str2;
    }

    public static /* synthetic */ NonRefundableItem copy$default(NonRefundableItem nonRefundableItem, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nonRefundableItem.name;
        }
        if ((i & 2) != 0) {
            bool = nonRefundableItem.nonRefundable;
        }
        if ((i & 4) != 0) {
            str2 = nonRefundableItem.type;
        }
        return nonRefundableItem.copy(str, bool, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final Boolean component2() {
        return this.nonRefundable;
    }

    public final String component3() {
        return this.type;
    }

    public final NonRefundableItem copy(@C17402n(name = "name") String str, @C17402n(name = "non_refundable") Boolean bool, @C17402n(name = "type") String str2) {
        return new NonRefundableItem(str, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonRefundableItem)) {
            return false;
        }
        NonRefundableItem nonRefundableItem = (NonRefundableItem) obj;
        return C19383o.m32792b(this.name, nonRefundableItem.name) && C19383o.m32792b(this.nonRefundable, nonRefundableItem.nonRefundable) && C19383o.m32792b(this.type, nonRefundableItem.type);
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getNonRefundable() {
        return this.nonRefundable;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.nonRefundable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("NonRefundableItem(name=");
        h.append(this.name);
        h.append(", nonRefundable=");
        h.append(this.nonRefundable);
        h.append(", type=");
        return C0391c.m1057c(h, this.type, ')');
    }
}
