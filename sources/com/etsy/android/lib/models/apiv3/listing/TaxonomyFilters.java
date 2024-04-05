package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyFilters {
    public static final int $stable = 8;
    private final List<TaxonomyFilter> buyer;
    private final List<TaxonomyFilter> byCraft;

    public TaxonomyFilters(@C17402n(name = "buyer") List<TaxonomyFilter> list, @C17402n(name = "byCraft") List<TaxonomyFilter> list2) {
        this.buyer = list;
        this.byCraft = list2;
    }

    public static /* synthetic */ TaxonomyFilters copy$default(TaxonomyFilters taxonomyFilters, List<TaxonomyFilter> list, List<TaxonomyFilter> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taxonomyFilters.buyer;
        }
        if ((i & 2) != 0) {
            list2 = taxonomyFilters.byCraft;
        }
        return taxonomyFilters.copy(list, list2);
    }

    public final List<TaxonomyFilter> component1() {
        return this.buyer;
    }

    public final List<TaxonomyFilter> component2() {
        return this.byCraft;
    }

    public final TaxonomyFilters copy(@C17402n(name = "buyer") List<TaxonomyFilter> list, @C17402n(name = "byCraft") List<TaxonomyFilter> list2) {
        return new TaxonomyFilters(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyFilters)) {
            return false;
        }
        TaxonomyFilters taxonomyFilters = (TaxonomyFilters) obj;
        return C19383o.m32792b(this.buyer, taxonomyFilters.buyer) && C19383o.m32792b(this.byCraft, taxonomyFilters.byCraft);
    }

    public final List<TaxonomyFilter> getBuyer() {
        return this.buyer;
    }

    public final List<TaxonomyFilter> getByCraft() {
        return this.byCraft;
    }

    public int hashCode() {
        List<TaxonomyFilter> list = this.buyer;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TaxonomyFilter> list2 = this.byCraft;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyFilters(buyer=");
        h.append(this.buyer);
        h.append(", byCraft=");
        return C0070b.m186i(h, this.byCraft, ')');
    }
}
