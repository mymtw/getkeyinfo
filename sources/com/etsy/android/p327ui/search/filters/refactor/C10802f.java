package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.math.BigDecimal;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.f */
public final class C10802f {

    /* renamed from: a */
    public final BigDecimal f23932a;

    /* renamed from: b */
    public final BigDecimal f23933b;

    /* renamed from: c */
    public final boolean f23934c;

    /* renamed from: d */
    public final boolean f23935d;

    public C10802f(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, boolean z2) {
        this.f23932a = bigDecimal;
        this.f23933b = bigDecimal2;
        this.f23934c = z;
        this.f23935d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10802f)) {
            return false;
        }
        C10802f fVar = (C10802f) obj;
        return C19383o.m32792b(this.f23932a, fVar.f23932a) && C19383o.m32792b(this.f23933b, fVar.f23933b) && this.f23934c == fVar.f23934c && this.f23935d == fVar.f23935d;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f23932a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f23933b;
        if (bigDecimal2 != null) {
            i = bigDecimal2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f23934c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f23935d;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PriceInput(min=");
        h.append(this.f23932a);
        h.append(", max=");
        h.append(this.f23933b);
        h.append(", userSpecifiedMin=");
        h.append(this.f23934c);
        h.append(", userSpecifiedMax=");
        return C0391c.m1058d(h, this.f23935d, ')');
    }
}
