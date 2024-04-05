package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class PastPurchasesGiftCardDesign {
    public static final int $stable = 0;
    private final String url150x119;

    public PastPurchasesGiftCardDesign() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public PastPurchasesGiftCardDesign(@C17402n(name = "url_150x119") String str) {
        this.url150x119 = str;
    }

    public static /* synthetic */ PastPurchasesGiftCardDesign copy$default(PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pastPurchasesGiftCardDesign.url150x119;
        }
        return pastPurchasesGiftCardDesign.copy(str);
    }

    public final String component1() {
        return this.url150x119;
    }

    public final PastPurchasesGiftCardDesign copy(@C17402n(name = "url_150x119") String str) {
        return new PastPurchasesGiftCardDesign(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PastPurchasesGiftCardDesign) && C19383o.m32792b(this.url150x119, ((PastPurchasesGiftCardDesign) obj).url150x119);
    }

    public final String getUrl150x119() {
        return this.url150x119;
    }

    public int hashCode() {
        String str = this.url150x119;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0391c.m1057c(C0072d.m201h("PastPurchasesGiftCardDesign(url150x119="), this.url150x119, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PastPurchasesGiftCardDesign(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
