package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TaxonomyUserInputValidatorValueScaleBounds {
    public static final int $stable = 0;
    private final String max;
    private final String min;
    private final Long scaleId;

    public TaxonomyUserInputValidatorValueScaleBounds(@C17402n(name = "scaleId") Long l, @C17402n(name = "min") String str, @C17402n(name = "max") String str2) {
        this.scaleId = l;
        this.min = str;
        this.max = str2;
    }

    public static /* synthetic */ TaxonomyUserInputValidatorValueScaleBounds copy$default(TaxonomyUserInputValidatorValueScaleBounds taxonomyUserInputValidatorValueScaleBounds, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = taxonomyUserInputValidatorValueScaleBounds.scaleId;
        }
        if ((i & 2) != 0) {
            str = taxonomyUserInputValidatorValueScaleBounds.min;
        }
        if ((i & 4) != 0) {
            str2 = taxonomyUserInputValidatorValueScaleBounds.max;
        }
        return taxonomyUserInputValidatorValueScaleBounds.copy(l, str, str2);
    }

    public final Long component1() {
        return this.scaleId;
    }

    public final String component2() {
        return this.min;
    }

    public final String component3() {
        return this.max;
    }

    public final TaxonomyUserInputValidatorValueScaleBounds copy(@C17402n(name = "scaleId") Long l, @C17402n(name = "min") String str, @C17402n(name = "max") String str2) {
        return new TaxonomyUserInputValidatorValueScaleBounds(l, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyUserInputValidatorValueScaleBounds)) {
            return false;
        }
        TaxonomyUserInputValidatorValueScaleBounds taxonomyUserInputValidatorValueScaleBounds = (TaxonomyUserInputValidatorValueScaleBounds) obj;
        return C19383o.m32792b(this.scaleId, taxonomyUserInputValidatorValueScaleBounds.scaleId) && C19383o.m32792b(this.min, taxonomyUserInputValidatorValueScaleBounds.min) && C19383o.m32792b(this.max, taxonomyUserInputValidatorValueScaleBounds.max);
    }

    public final String getMax() {
        return this.max;
    }

    public final String getMin() {
        return this.min;
    }

    public final Long getScaleId() {
        return this.scaleId;
    }

    public int hashCode() {
        Long l = this.scaleId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.min;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.max;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyUserInputValidatorValueScaleBounds(scaleId=");
        h.append(this.scaleId);
        h.append(", min=");
        h.append(this.min);
        h.append(", max=");
        return C0391c.m1057c(h, this.max, ')');
    }
}
