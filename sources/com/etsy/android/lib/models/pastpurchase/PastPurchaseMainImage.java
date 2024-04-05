package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class PastPurchaseMainImage {
    public static final int $stable = 0;
    private final String url170x135;

    public PastPurchaseMainImage() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public PastPurchaseMainImage(@C17402n(name = "url_170x135") String str) {
        this.url170x135 = str;
    }

    public static /* synthetic */ PastPurchaseMainImage copy$default(PastPurchaseMainImage pastPurchaseMainImage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pastPurchaseMainImage.url170x135;
        }
        return pastPurchaseMainImage.copy(str);
    }

    public final String component1() {
        return this.url170x135;
    }

    public final PastPurchaseMainImage copy(@C17402n(name = "url_170x135") String str) {
        return new PastPurchaseMainImage(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PastPurchaseMainImage) && C19383o.m32792b(this.url170x135, ((PastPurchaseMainImage) obj).url170x135);
    }

    public final String getUrl170x135() {
        return this.url170x135;
    }

    public int hashCode() {
        String str = this.url170x135;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("PastPurchaseMainImage(url170x135="), this.url170x135, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PastPurchaseMainImage(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
