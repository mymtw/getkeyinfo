package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyUserInputValidator {
    public static final int $stable = 8;
    private final TaxonomyValueScale canonicalScale;
    private final String max;
    private final String min;
    private final TaxonomyValueScale minMaxScale;
    private final List<TaxonomyUserInputValidatorValueScaleBounds> scaleBounds;
    private final TaxonomyValueScale scales;
    private final String type;

    public TaxonomyUserInputValidator(@C17402n(name = "type") String str, @C17402n(name = "min") String str2, @C17402n(name = "max") String str3, @C17402n(name = "scales") TaxonomyValueScale taxonomyValueScale, @C17402n(name = "minMaxScale") TaxonomyValueScale taxonomyValueScale2, @C17402n(name = "canonicalScale") TaxonomyValueScale taxonomyValueScale3, @C17402n(name = "scalesBounds") List<TaxonomyUserInputValidatorValueScaleBounds> list) {
        this.type = str;
        this.min = str2;
        this.max = str3;
        this.scales = taxonomyValueScale;
        this.minMaxScale = taxonomyValueScale2;
        this.canonicalScale = taxonomyValueScale3;
        this.scaleBounds = list;
    }

    public static /* synthetic */ TaxonomyUserInputValidator copy$default(TaxonomyUserInputValidator taxonomyUserInputValidator, String str, String str2, String str3, TaxonomyValueScale taxonomyValueScale, TaxonomyValueScale taxonomyValueScale2, TaxonomyValueScale taxonomyValueScale3, List<TaxonomyUserInputValidatorValueScaleBounds> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxonomyUserInputValidator.type;
        }
        if ((i & 2) != 0) {
            str2 = taxonomyUserInputValidator.min;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = taxonomyUserInputValidator.max;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            taxonomyValueScale = taxonomyUserInputValidator.scales;
        }
        TaxonomyValueScale taxonomyValueScale4 = taxonomyValueScale;
        if ((i & 16) != 0) {
            taxonomyValueScale2 = taxonomyUserInputValidator.minMaxScale;
        }
        TaxonomyValueScale taxonomyValueScale5 = taxonomyValueScale2;
        if ((i & 32) != 0) {
            taxonomyValueScale3 = taxonomyUserInputValidator.canonicalScale;
        }
        TaxonomyValueScale taxonomyValueScale6 = taxonomyValueScale3;
        if ((i & 64) != 0) {
            list = taxonomyUserInputValidator.scaleBounds;
        }
        return taxonomyUserInputValidator.copy(str, str4, str5, taxonomyValueScale4, taxonomyValueScale5, taxonomyValueScale6, list);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.min;
    }

    public final String component3() {
        return this.max;
    }

    public final TaxonomyValueScale component4() {
        return this.scales;
    }

    public final TaxonomyValueScale component5() {
        return this.minMaxScale;
    }

    public final TaxonomyValueScale component6() {
        return this.canonicalScale;
    }

    public final List<TaxonomyUserInputValidatorValueScaleBounds> component7() {
        return this.scaleBounds;
    }

    public final TaxonomyUserInputValidator copy(@C17402n(name = "type") String str, @C17402n(name = "min") String str2, @C17402n(name = "max") String str3, @C17402n(name = "scales") TaxonomyValueScale taxonomyValueScale, @C17402n(name = "minMaxScale") TaxonomyValueScale taxonomyValueScale2, @C17402n(name = "canonicalScale") TaxonomyValueScale taxonomyValueScale3, @C17402n(name = "scalesBounds") List<TaxonomyUserInputValidatorValueScaleBounds> list) {
        return new TaxonomyUserInputValidator(str, str2, str3, taxonomyValueScale, taxonomyValueScale2, taxonomyValueScale3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyUserInputValidator)) {
            return false;
        }
        TaxonomyUserInputValidator taxonomyUserInputValidator = (TaxonomyUserInputValidator) obj;
        return C19383o.m32792b(this.type, taxonomyUserInputValidator.type) && C19383o.m32792b(this.min, taxonomyUserInputValidator.min) && C19383o.m32792b(this.max, taxonomyUserInputValidator.max) && C19383o.m32792b(this.scales, taxonomyUserInputValidator.scales) && C19383o.m32792b(this.minMaxScale, taxonomyUserInputValidator.minMaxScale) && C19383o.m32792b(this.canonicalScale, taxonomyUserInputValidator.canonicalScale) && C19383o.m32792b(this.scaleBounds, taxonomyUserInputValidator.scaleBounds);
    }

    public final TaxonomyValueScale getCanonicalScale() {
        return this.canonicalScale;
    }

    public final String getMax() {
        return this.max;
    }

    public final String getMin() {
        return this.min;
    }

    public final TaxonomyValueScale getMinMaxScale() {
        return this.minMaxScale;
    }

    public final List<TaxonomyUserInputValidatorValueScaleBounds> getScaleBounds() {
        return this.scaleBounds;
    }

    public final TaxonomyValueScale getScales() {
        return this.scales;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.min;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.max;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TaxonomyValueScale taxonomyValueScale = this.scales;
        int hashCode4 = (hashCode3 + (taxonomyValueScale == null ? 0 : taxonomyValueScale.hashCode())) * 31;
        TaxonomyValueScale taxonomyValueScale2 = this.minMaxScale;
        int hashCode5 = (hashCode4 + (taxonomyValueScale2 == null ? 0 : taxonomyValueScale2.hashCode())) * 31;
        TaxonomyValueScale taxonomyValueScale3 = this.canonicalScale;
        int hashCode6 = (hashCode5 + (taxonomyValueScale3 == null ? 0 : taxonomyValueScale3.hashCode())) * 31;
        List<TaxonomyUserInputValidatorValueScaleBounds> list = this.scaleBounds;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyUserInputValidator(type=");
        h.append(this.type);
        h.append(", min=");
        h.append(this.min);
        h.append(", max=");
        h.append(this.max);
        h.append(", scales=");
        h.append(this.scales);
        h.append(", minMaxScale=");
        h.append(this.minMaxScale);
        h.append(", canonicalScale=");
        h.append(this.canonicalScale);
        h.append(", scaleBounds=");
        return C0070b.m186i(h, this.scaleBounds, ')');
    }
}
