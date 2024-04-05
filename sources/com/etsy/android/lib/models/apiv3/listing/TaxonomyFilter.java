package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyFilter {
    public static final int $stable = 8;
    private final Long attribute;
    private final String displayName;
    private final List<TaxonomyAttributeValue> values;

    public TaxonomyFilter(@C17402n(name = "attribute") Long l, @C17402n(name = "displayName") String str, @C17402n(name = "values") List<TaxonomyAttributeValue> list) {
        this.attribute = l;
        this.displayName = str;
        this.values = list;
    }

    public static /* synthetic */ TaxonomyFilter copy$default(TaxonomyFilter taxonomyFilter, Long l, String str, List<TaxonomyAttributeValue> list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = taxonomyFilter.attribute;
        }
        if ((i & 2) != 0) {
            str = taxonomyFilter.displayName;
        }
        if ((i & 4) != 0) {
            list = taxonomyFilter.values;
        }
        return taxonomyFilter.copy(l, str, list);
    }

    public final Long component1() {
        return this.attribute;
    }

    public final String component2() {
        return this.displayName;
    }

    public final List<TaxonomyAttributeValue> component3() {
        return this.values;
    }

    public final TaxonomyFilter copy(@C17402n(name = "attribute") Long l, @C17402n(name = "displayName") String str, @C17402n(name = "values") List<TaxonomyAttributeValue> list) {
        return new TaxonomyFilter(l, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyFilter)) {
            return false;
        }
        TaxonomyFilter taxonomyFilter = (TaxonomyFilter) obj;
        return C19383o.m32792b(this.attribute, taxonomyFilter.attribute) && C19383o.m32792b(this.displayName, taxonomyFilter.displayName) && C19383o.m32792b(this.values, taxonomyFilter.values);
    }

    public final Long getAttribute() {
        return this.attribute;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<TaxonomyAttributeValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        Long l = this.attribute;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.displayName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<TaxonomyAttributeValue> list = this.values;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyFilter(attribute=");
        h.append(this.attribute);
        h.append(", displayName=");
        h.append(this.displayName);
        h.append(", values=");
        return C0070b.m186i(h, this.values, ')');
    }
}
