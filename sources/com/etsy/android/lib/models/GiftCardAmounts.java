package com.etsy.android.lib.models;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class GiftCardAmounts {
    public static final int $stable = 8;
    private final List<GiftCardAmountValues> results;

    public GiftCardAmounts(List<GiftCardAmountValues> list) {
        C19383o.m32797g(list, ResponseConstants.RESULTS);
        this.results = list;
    }

    public static /* synthetic */ GiftCardAmounts copy$default(GiftCardAmounts giftCardAmounts, List<GiftCardAmountValues> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftCardAmounts.results;
        }
        return giftCardAmounts.copy(list);
    }

    public final List<GiftCardAmountValues> component1() {
        return this.results;
    }

    public final GiftCardAmounts copy(List<GiftCardAmountValues> list) {
        C19383o.m32797g(list, ResponseConstants.RESULTS);
        return new GiftCardAmounts(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftCardAmounts) && C19383o.m32792b(this.results, ((GiftCardAmounts) obj).results);
    }

    public final List<GiftCardAmountValues> getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.results.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("GiftCardAmounts(results="), this.results, ')');
    }
}
