package com.etsy.android.lib.models;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class GiftCardDesigns {
    public static final int $stable = 8;
    private List<GiftCardDesign> results;

    public GiftCardDesigns(List<GiftCardDesign> list) {
        C19383o.m32797g(list, ResponseConstants.RESULTS);
        this.results = list;
    }

    public static /* synthetic */ GiftCardDesigns copy$default(GiftCardDesigns giftCardDesigns, List<GiftCardDesign> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftCardDesigns.results;
        }
        return giftCardDesigns.copy(list);
    }

    public final List<GiftCardDesign> component1() {
        return this.results;
    }

    public final GiftCardDesigns copy(List<GiftCardDesign> list) {
        C19383o.m32797g(list, ResponseConstants.RESULTS);
        return new GiftCardDesigns(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftCardDesigns) && C19383o.m32792b(this.results, ((GiftCardDesigns) obj).results);
    }

    public final List<GiftCardDesign> getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.results.hashCode();
    }

    public final void setResults(List<GiftCardDesign> list) {
        C19383o.m32797g(list, "<set-?>");
        this.results = list;
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("GiftCardDesigns(results="), this.results, ')');
    }
}
