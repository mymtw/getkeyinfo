package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class Variation {
    public static final int $stable = 8;
    private final String name;
    private final Long propertyId;
    private VariationValue selectedValue;
    private final List<VariationValue> values;

    public Variation() {
        this((Long) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public Variation(@C17402n(name = "property_id") Long l, @C17402n(name = "name") String str, @C17402n(name = "values") List<VariationValue> list) {
        this.propertyId = l;
        this.name = str;
        this.values = list;
    }

    public static /* synthetic */ Variation copy$default(Variation variation, Long l, String str, List<VariationValue> list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = variation.propertyId;
        }
        if ((i & 2) != 0) {
            str = variation.name;
        }
        if ((i & 4) != 0) {
            list = variation.values;
        }
        return variation.copy(l, str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4((r0 = r0.getValue()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String formattedSelectedValue() {
        /*
            r1 = this;
            com.etsy.android.lib.models.apiv3.listing.VariationValue r0 = r1.selectedValue
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.getValue()
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r0)
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = ""
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.Variation.formattedSelectedValue():java.lang.String");
    }

    public final Long component1() {
        return this.propertyId;
    }

    public final String component2() {
        return this.name;
    }

    public final List<VariationValue> component3() {
        return this.values;
    }

    public final Variation copy(@C17402n(name = "property_id") Long l, @C17402n(name = "name") String str, @C17402n(name = "values") List<VariationValue> list) {
        return new Variation(l, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Variation)) {
            return false;
        }
        Variation variation = (Variation) obj;
        return C19383o.m32792b(this.propertyId, variation.propertyId) && C19383o.m32792b(this.name, variation.name) && C19383o.m32792b(this.values, variation.values);
    }

    public final String getName() {
        return this.name;
    }

    public final Long getPropertyId() {
        return this.propertyId;
    }

    public final VariationValue getSelectedValue() {
        return this.selectedValue;
    }

    public final List<VariationValue> getValues() {
        return this.values;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r1.getValueId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasOptionSet() {
        /*
            r6 = this;
            java.lang.String r0 = r6.formattedSelectedValue()
            com.etsy.android.lib.models.apiv3.listing.VariationValue r1 = r6.selectedValue
            r2 = 0
            if (r1 == 0) goto L_0x0015
            java.lang.Long r1 = r1.getValueId()
            if (r1 == 0) goto L_0x0015
            long r4 = r1.longValue()
            goto L_0x0016
        L_0x0015:
            r4 = r2
        L_0x0016:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0028
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0024
            r0 = r2
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            if (r0 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r2 = r3
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.Variation.hasOptionSet():boolean");
    }

    public final boolean hasPriceDifference() {
        List<VariationValue> list = this.values;
        if (list == null) {
            return false;
        }
        for (VariationValue hasPriceDifference : list) {
            if (hasPriceDifference.hasPriceDifference()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Long l = this.propertyId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<VariationValue> list = this.values;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setSelectedValue(VariationValue variationValue) {
        this.selectedValue = variationValue;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Variation(propertyId=");
        h.append(this.propertyId);
        h.append(", name=");
        h.append(this.name);
        h.append(", values=");
        return C0070b.m186i(h, this.values, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Variation(Long l, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
