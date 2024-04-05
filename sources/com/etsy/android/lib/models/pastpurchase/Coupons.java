package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Coupons {
    public static final int $stable = 0;
    private final String coupons;

    public Coupons(@C17402n(name = "coupons") String str) {
        this.coupons = str;
    }

    public static /* synthetic */ Coupons copy$default(Coupons coupons2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coupons2.coupons;
        }
        return coupons2.copy(str);
    }

    public final String component1() {
        return this.coupons;
    }

    public final Coupons copy(@C17402n(name = "coupons") String str) {
        return new Coupons(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Coupons) && C19383o.m32792b(this.coupons, ((Coupons) obj).coupons);
    }

    public final String getCoupons() {
        return this.coupons;
    }

    public int hashCode() {
        String str = this.coupons;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("Coupons(coupons="), this.coupons, ')');
    }
}
