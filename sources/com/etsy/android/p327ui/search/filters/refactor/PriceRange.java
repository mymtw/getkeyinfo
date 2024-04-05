package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import java.math.BigDecimal;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.PriceRange */
public final class PriceRange {

    /* renamed from: a */
    public final BigDecimal f23786a;

    /* renamed from: b */
    public final BigDecimal f23787b;

    /* renamed from: com.etsy.android.ui.search.filters.refactor.PriceRange$CustomPriceType */
    public enum CustomPriceType {
        UNDER,
        OVER,
        RANGE,
        NONE
    }

    public PriceRange() {
        this((BigDecimal) null, (BigDecimal) null);
    }

    /* renamed from: a */
    public static PriceRange m18674a(PriceRange priceRange, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        if ((i & 1) != 0) {
            bigDecimal = priceRange.f23786a;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = priceRange.f23787b;
        }
        priceRange.getClass();
        return new PriceRange(bigDecimal, bigDecimal2);
    }

    /* renamed from: b */
    public final CustomPriceType mo35763b() {
        BigDecimal bigDecimal = this.f23786a;
        return (bigDecimal == null || this.f23787b != null) ? (bigDecimal != null || this.f23787b == null) ? (bigDecimal == null || this.f23787b == null) ? (bigDecimal == null && this.f23787b == null) ? CustomPriceType.NONE : CustomPriceType.NONE : CustomPriceType.RANGE : CustomPriceType.UNDER : CustomPriceType.OVER;
    }

    /* renamed from: c */
    public final BigDecimal mo35764c() {
        if (mo35763b() != CustomPriceType.RANGE) {
            return this.f23787b;
        }
        BigDecimal bigDecimal = this.f23786a;
        C19383o.m32794d(bigDecimal);
        return bigDecimal.compareTo(this.f23787b) > 0 ? this.f23786a : this.f23787b;
    }

    /* renamed from: d */
    public final BigDecimal mo35765d() {
        if (mo35763b() != CustomPriceType.RANGE) {
            return this.f23786a;
        }
        BigDecimal bigDecimal = this.f23786a;
        C19383o.m32794d(bigDecimal);
        return bigDecimal.compareTo(this.f23787b) > 0 ? this.f23787b : this.f23786a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRange)) {
            return false;
        }
        PriceRange priceRange = (PriceRange) obj;
        return C19383o.m32792b(this.f23786a, priceRange.f23786a) && C19383o.m32792b(this.f23787b, priceRange.f23787b);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f23786a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f23787b;
        if (bigDecimal2 != null) {
            i = bigDecimal2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PriceRange(min=");
        h.append(this.f23786a);
        h.append(", max=");
        h.append(this.f23787b);
        h.append(')');
        return h.toString();
    }

    public PriceRange(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.f23786a = bigDecimal;
        this.f23787b = bigDecimal2;
    }
}
