package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyAttributeValue {
    public static final int $stable = 8;
    private final Boolean active;
    private final List<Long> eqTo;

    /* renamed from: id */
    private final Long f19147id;
    private final String name;
    private final Integer order;
    private final Long scale;
    private final String value;
    private final String version;

    public TaxonomyAttributeValue(@C17402n(name = "id") Long l, @C17402n(name = "active") Boolean bool, @C17402n(name = "name") String str, @C17402n(name = "version") String str2, @C17402n(name = "scale") Long l2, @C17402n(name = "order") Integer num, @C17402n(name = "eqTo") List<Long> list, @C17402n(name = "value") String str3) {
        this.f19147id = l;
        this.active = bool;
        this.name = str;
        this.version = str2;
        this.scale = l2;
        this.order = num;
        this.eqTo = list;
        this.value = str3;
    }

    public static /* synthetic */ TaxonomyAttributeValue copy$default(TaxonomyAttributeValue taxonomyAttributeValue, Long l, Boolean bool, String str, String str2, Long l2, Integer num, List list, String str3, int i, Object obj) {
        TaxonomyAttributeValue taxonomyAttributeValue2 = taxonomyAttributeValue;
        int i2 = i;
        return taxonomyAttributeValue.copy((i2 & 1) != 0 ? taxonomyAttributeValue2.f19147id : l, (i2 & 2) != 0 ? taxonomyAttributeValue2.active : bool, (i2 & 4) != 0 ? taxonomyAttributeValue2.name : str, (i2 & 8) != 0 ? taxonomyAttributeValue2.version : str2, (i2 & 16) != 0 ? taxonomyAttributeValue2.scale : l2, (i2 & 32) != 0 ? taxonomyAttributeValue2.order : num, (i2 & 64) != 0 ? taxonomyAttributeValue2.eqTo : list, (i2 & 128) != 0 ? taxonomyAttributeValue2.value : str3);
    }

    public final Long component1() {
        return this.f19147id;
    }

    public final Boolean component2() {
        return this.active;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.version;
    }

    public final Long component5() {
        return this.scale;
    }

    public final Integer component6() {
        return this.order;
    }

    public final List<Long> component7() {
        return this.eqTo;
    }

    public final String component8() {
        return this.value;
    }

    public final TaxonomyAttributeValue copy(@C17402n(name = "id") Long l, @C17402n(name = "active") Boolean bool, @C17402n(name = "name") String str, @C17402n(name = "version") String str2, @C17402n(name = "scale") Long l2, @C17402n(name = "order") Integer num, @C17402n(name = "eqTo") List<Long> list, @C17402n(name = "value") String str3) {
        return new TaxonomyAttributeValue(l, bool, str, str2, l2, num, list, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyAttributeValue)) {
            return false;
        }
        TaxonomyAttributeValue taxonomyAttributeValue = (TaxonomyAttributeValue) obj;
        return C19383o.m32792b(this.f19147id, taxonomyAttributeValue.f19147id) && C19383o.m32792b(this.active, taxonomyAttributeValue.active) && C19383o.m32792b(this.name, taxonomyAttributeValue.name) && C19383o.m32792b(this.version, taxonomyAttributeValue.version) && C19383o.m32792b(this.scale, taxonomyAttributeValue.scale) && C19383o.m32792b(this.order, taxonomyAttributeValue.order) && C19383o.m32792b(this.eqTo, taxonomyAttributeValue.eqTo) && C19383o.m32792b(this.value, taxonomyAttributeValue.value);
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final List<Long> getEqTo() {
        return this.eqTo;
    }

    public final Long getId() {
        return this.f19147id;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final Long getScale() {
        return this.scale;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        Long l = this.f19147id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.active;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.scale;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.order;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<Long> list = this.eqTo;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.value;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyAttributeValue(id=");
        h.append(this.f19147id);
        h.append(", active=");
        h.append(this.active);
        h.append(", name=");
        h.append(this.name);
        h.append(", version=");
        h.append(this.version);
        h.append(", scale=");
        h.append(this.scale);
        h.append(", order=");
        h.append(this.order);
        h.append(", eqTo=");
        h.append(this.eqTo);
        h.append(", value=");
        return C0391c.m1057c(h, this.value, ')');
    }
}
