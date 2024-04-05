package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class IANShopRating {
    public static final int $stable = 0;
    private final Float rating;
    private final int ratingCount;

    public IANShopRating(@C17402n(name = "count") int i, @C17402n(name = "rating") Float f) {
        this.ratingCount = i;
        this.rating = f;
    }

    public static /* synthetic */ IANShopRating copy$default(IANShopRating iANShopRating, int i, Float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iANShopRating.ratingCount;
        }
        if ((i2 & 2) != 0) {
            f = iANShopRating.rating;
        }
        return iANShopRating.copy(i, f);
    }

    public final int component1() {
        return this.ratingCount;
    }

    public final Float component2() {
        return this.rating;
    }

    public final IANShopRating copy(@C17402n(name = "count") int i, @C17402n(name = "rating") Float f) {
        return new IANShopRating(i, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IANShopRating)) {
            return false;
        }
        IANShopRating iANShopRating = (IANShopRating) obj;
        return this.ratingCount == iANShopRating.ratingCount && C19383o.m32792b(this.rating, iANShopRating.rating);
    }

    public final Float getRating() {
        return this.rating;
    }

    public final int getRatingCount() {
        return this.ratingCount;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.ratingCount) * 31;
        Float f = this.rating;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("IANShopRating(ratingCount=");
        h.append(this.ratingCount);
        h.append(", rating=");
        h.append(this.rating);
        h.append(')');
        return h.toString();
    }
}
