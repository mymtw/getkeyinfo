package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class SellerResponseTime {
    public static final int $stable = 0;
    private final double averageDays;
    private final String displayText;

    public SellerResponseTime(@C17402n(name = "display_text") String str, @C17402n(name = "average_days") double d) {
        this.displayText = str;
        this.averageDays = d;
    }

    public static /* synthetic */ SellerResponseTime copy$default(SellerResponseTime sellerResponseTime, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sellerResponseTime.displayText;
        }
        if ((i & 2) != 0) {
            d = sellerResponseTime.averageDays;
        }
        return sellerResponseTime.copy(str, d);
    }

    public final String component1() {
        return this.displayText;
    }

    public final double component2() {
        return this.averageDays;
    }

    public final SellerResponseTime copy(@C17402n(name = "display_text") String str, @C17402n(name = "average_days") double d) {
        return new SellerResponseTime(str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerResponseTime)) {
            return false;
        }
        SellerResponseTime sellerResponseTime = (SellerResponseTime) obj;
        return C19383o.m32792b(this.displayText, sellerResponseTime.displayText) && C19383o.m32792b(Double.valueOf(this.averageDays), Double.valueOf(sellerResponseTime.averageDays));
    }

    public final double getAverageDays() {
        return this.averageDays;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public int hashCode() {
        String str = this.displayText;
        return Double.hashCode(this.averageDays) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SellerResponseTime(displayText=");
        h.append(this.displayText);
        h.append(", averageDays=");
        h.append(this.averageDays);
        h.append(')');
        return h.toString();
    }
}
