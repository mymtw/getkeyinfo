package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShippingDisplay {
    public static final int $stable = 0;
    private final String primaryText;
    private final String secondaryText;

    public ShippingDisplay() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public ShippingDisplay(@C17402n(name = "primary_text") String str, @C17402n(name = "secondary_text") String str2) {
        this.primaryText = str;
        this.secondaryText = str2;
    }

    public static /* synthetic */ ShippingDisplay copy$default(ShippingDisplay shippingDisplay, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingDisplay.primaryText;
        }
        if ((i & 2) != 0) {
            str2 = shippingDisplay.secondaryText;
        }
        return shippingDisplay.copy(str, str2);
    }

    public final String component1() {
        return this.primaryText;
    }

    public final String component2() {
        return this.secondaryText;
    }

    public final ShippingDisplay copy(@C17402n(name = "primary_text") String str, @C17402n(name = "secondary_text") String str2) {
        return new ShippingDisplay(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingDisplay)) {
            return false;
        }
        ShippingDisplay shippingDisplay = (ShippingDisplay) obj;
        return C19383o.m32792b(this.primaryText, shippingDisplay.primaryText) && C19383o.m32792b(this.secondaryText, shippingDisplay.secondaryText);
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        String str = this.primaryText;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondaryText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShippingDisplay(primaryText=");
        h.append(this.primaryText);
        h.append(", secondaryText=");
        return C0391c.m1057c(h, this.secondaryText, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingDisplay(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
