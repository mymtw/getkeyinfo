package com.etsy.android.lib.models.pastpurchase;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class PastPurchaseReviewCarouselResult {
    public static final int $stable = 8;
    private final List<ReviewCarouselItem> items;

    public PastPurchaseReviewCarouselResult(@C17402n(name = "items_for_review") List<ReviewCarouselItem> list) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        this.items = list;
    }

    public static /* synthetic */ PastPurchaseReviewCarouselResult copy$default(PastPurchaseReviewCarouselResult pastPurchaseReviewCarouselResult, List<ReviewCarouselItem> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pastPurchaseReviewCarouselResult.items;
        }
        return pastPurchaseReviewCarouselResult.copy(list);
    }

    public final List<ReviewCarouselItem> component1() {
        return this.items;
    }

    public final PastPurchaseReviewCarouselResult copy(@C17402n(name = "items_for_review") List<ReviewCarouselItem> list) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        return new PastPurchaseReviewCarouselResult(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PastPurchaseReviewCarouselResult) && C19383o.m32792b(this.items, ((PastPurchaseReviewCarouselResult) obj).items);
    }

    public final List<ReviewCarouselItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("PastPurchaseReviewCarouselResult(items="), this.items, ')');
    }
}
