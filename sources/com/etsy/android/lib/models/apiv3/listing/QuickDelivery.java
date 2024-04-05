package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class QuickDelivery {
    public static final int $stable = 0;
    private final String estimatedDeliveryDate;
    private final String quickDeliveryTitle;

    public QuickDelivery(@C17402n(name = "title") String str, @C17402n(name = "estimated_delivery_date") String str2) {
        C19383o.m32797g(str, "quickDeliveryTitle");
        C19383o.m32797g(str2, "estimatedDeliveryDate");
        this.quickDeliveryTitle = str;
        this.estimatedDeliveryDate = str2;
    }

    public static /* synthetic */ QuickDelivery copy$default(QuickDelivery quickDelivery, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quickDelivery.quickDeliveryTitle;
        }
        if ((i & 2) != 0) {
            str2 = quickDelivery.estimatedDeliveryDate;
        }
        return quickDelivery.copy(str, str2);
    }

    public final String component1() {
        return this.quickDeliveryTitle;
    }

    public final String component2() {
        return this.estimatedDeliveryDate;
    }

    public final QuickDelivery copy(@C17402n(name = "title") String str, @C17402n(name = "estimated_delivery_date") String str2) {
        C19383o.m32797g(str, "quickDeliveryTitle");
        C19383o.m32797g(str2, "estimatedDeliveryDate");
        return new QuickDelivery(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickDelivery)) {
            return false;
        }
        QuickDelivery quickDelivery = (QuickDelivery) obj;
        return C19383o.m32792b(this.quickDeliveryTitle, quickDelivery.quickDeliveryTitle) && C19383o.m32792b(this.estimatedDeliveryDate, quickDelivery.estimatedDeliveryDate);
    }

    public final String getEstimatedDeliveryDate() {
        return this.estimatedDeliveryDate;
    }

    public final String getQuickDeliveryTitle() {
        return this.quickDeliveryTitle;
    }

    public int hashCode() {
        return this.estimatedDeliveryDate.hashCode() + (this.quickDeliveryTitle.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("QuickDelivery(quickDeliveryTitle=");
        h.append(this.quickDeliveryTitle);
        h.append(", estimatedDeliveryDate=");
        return C0391c.m1057c(h, this.estimatedDeliveryDate, ')');
    }
}
