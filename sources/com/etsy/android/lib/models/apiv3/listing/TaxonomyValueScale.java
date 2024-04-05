package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyValueScale {
    public static final int $stable = 8;
    private final Boolean active;
    private final String buyerShortName;
    private final String description;
    private final String displayName;
    private final String etsywebUnit;
    private final String etsywebUnitName;
    private final String format;

    /* renamed from: id */
    private final Long f19149id;
    private final List<Integer> legacyScale;
    private final Integer order;
    private final String version;

    public TaxonomyValueScale(@C17402n(name = "id") Long l, @C17402n(name = "etsywebUnit") String str, @C17402n(name = "order") Integer num, @C17402n(name = "active") Boolean bool, @C17402n(name = "legacyScale") List<Integer> list, @C17402n(name = "version") String str2, @C17402n(name = "displayName") String str3, @C17402n(name = "description") String str4, @C17402n(name = "format") String str5, @C17402n(name = "buyerShortName") String str6, @C17402n(name = "etsywebUnitName") String str7) {
        this.f19149id = l;
        this.etsywebUnit = str;
        this.order = num;
        this.active = bool;
        this.legacyScale = list;
        this.version = str2;
        this.displayName = str3;
        this.description = str4;
        this.format = str5;
        this.buyerShortName = str6;
        this.etsywebUnitName = str7;
    }

    public static /* synthetic */ TaxonomyValueScale copy$default(TaxonomyValueScale taxonomyValueScale, Long l, String str, Integer num, Boolean bool, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        TaxonomyValueScale taxonomyValueScale2 = taxonomyValueScale;
        int i2 = i;
        return taxonomyValueScale.copy((i2 & 1) != 0 ? taxonomyValueScale2.f19149id : l, (i2 & 2) != 0 ? taxonomyValueScale2.etsywebUnit : str, (i2 & 4) != 0 ? taxonomyValueScale2.order : num, (i2 & 8) != 0 ? taxonomyValueScale2.active : bool, (i2 & 16) != 0 ? taxonomyValueScale2.legacyScale : list, (i2 & 32) != 0 ? taxonomyValueScale2.version : str2, (i2 & 64) != 0 ? taxonomyValueScale2.displayName : str3, (i2 & 128) != 0 ? taxonomyValueScale2.description : str4, (i2 & 256) != 0 ? taxonomyValueScale2.format : str5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? taxonomyValueScale2.buyerShortName : str6, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? taxonomyValueScale2.etsywebUnitName : str7);
    }

    public final Long component1() {
        return this.f19149id;
    }

    public final String component10() {
        return this.buyerShortName;
    }

    public final String component11() {
        return this.etsywebUnitName;
    }

    public final String component2() {
        return this.etsywebUnit;
    }

    public final Integer component3() {
        return this.order;
    }

    public final Boolean component4() {
        return this.active;
    }

    public final List<Integer> component5() {
        return this.legacyScale;
    }

    public final String component6() {
        return this.version;
    }

    public final String component7() {
        return this.displayName;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.format;
    }

    public final TaxonomyValueScale copy(@C17402n(name = "id") Long l, @C17402n(name = "etsywebUnit") String str, @C17402n(name = "order") Integer num, @C17402n(name = "active") Boolean bool, @C17402n(name = "legacyScale") List<Integer> list, @C17402n(name = "version") String str2, @C17402n(name = "displayName") String str3, @C17402n(name = "description") String str4, @C17402n(name = "format") String str5, @C17402n(name = "buyerShortName") String str6, @C17402n(name = "etsywebUnitName") String str7) {
        return new TaxonomyValueScale(l, str, num, bool, list, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyValueScale)) {
            return false;
        }
        TaxonomyValueScale taxonomyValueScale = (TaxonomyValueScale) obj;
        return C19383o.m32792b(this.f19149id, taxonomyValueScale.f19149id) && C19383o.m32792b(this.etsywebUnit, taxonomyValueScale.etsywebUnit) && C19383o.m32792b(this.order, taxonomyValueScale.order) && C19383o.m32792b(this.active, taxonomyValueScale.active) && C19383o.m32792b(this.legacyScale, taxonomyValueScale.legacyScale) && C19383o.m32792b(this.version, taxonomyValueScale.version) && C19383o.m32792b(this.displayName, taxonomyValueScale.displayName) && C19383o.m32792b(this.description, taxonomyValueScale.description) && C19383o.m32792b(this.format, taxonomyValueScale.format) && C19383o.m32792b(this.buyerShortName, taxonomyValueScale.buyerShortName) && C19383o.m32792b(this.etsywebUnitName, taxonomyValueScale.etsywebUnitName);
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final String getBuyerShortName() {
        return this.buyerShortName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getEtsywebUnit() {
        return this.etsywebUnit;
    }

    public final String getEtsywebUnitName() {
        return this.etsywebUnitName;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Long getId() {
        return this.f19149id;
    }

    public final List<Integer> getLegacyScale() {
        return this.legacyScale;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        Long l = this.f19149id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.etsywebUnit;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.order;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.active;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list = this.legacyScale;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.version;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.format;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buyerShortName;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.etsywebUnitName;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyValueScale(id=");
        h.append(this.f19149id);
        h.append(", etsywebUnit=");
        h.append(this.etsywebUnit);
        h.append(", order=");
        h.append(this.order);
        h.append(", active=");
        h.append(this.active);
        h.append(", legacyScale=");
        h.append(this.legacyScale);
        h.append(", version=");
        h.append(this.version);
        h.append(", displayName=");
        h.append(this.displayName);
        h.append(", description=");
        h.append(this.description);
        h.append(", format=");
        h.append(this.format);
        h.append(", buyerShortName=");
        h.append(this.buyerShortName);
        h.append(", etsywebUnitName=");
        return C0391c.m1057c(h, this.etsywebUnitName, ')');
    }
}
