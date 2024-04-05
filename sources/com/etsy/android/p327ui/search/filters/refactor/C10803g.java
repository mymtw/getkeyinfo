package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.math.BigDecimal;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.g */
public final class C10803g {

    /* renamed from: a */
    public final String f23936a;

    /* renamed from: b */
    public final String f23937b;

    /* renamed from: c */
    public final boolean f23938c;

    /* renamed from: d */
    public final BigDecimal f23939d;

    /* renamed from: e */
    public final BigDecimal f23940e;

    /* renamed from: f */
    public final PriceSelectType f23941f;

    /* renamed from: g */
    public final boolean f23942g;

    public C10803g() {
        this((String) null, false, (BigDecimal) null, (BigDecimal) null, (PriceSelectType) null, 127);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10803g(String str, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, PriceSelectType priceSelectType, int i) {
        this((i & 1) != 0 ? C0069a.m174e("randomUUID().toString()") : null, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : bigDecimal, (i & 16) != 0 ? null : bigDecimal2, (i & 32) != 0 ? PriceSelectType.PRICE_RANGE : priceSelectType, (i & 64) != 0);
    }

    /* renamed from: a */
    public static C10803g m18808a(C10803g gVar, boolean z, boolean z2, int i) {
        PriceSelectType priceSelectType = null;
        String str = (i & 1) != 0 ? gVar.f23936a : null;
        String str2 = (i & 2) != 0 ? gVar.f23937b : null;
        if ((i & 4) != 0) {
            z = gVar.f23938c;
        }
        boolean z3 = z;
        BigDecimal bigDecimal = (i & 8) != 0 ? gVar.f23939d : null;
        BigDecimal bigDecimal2 = (i & 16) != 0 ? gVar.f23940e : null;
        if ((i & 32) != 0) {
            priceSelectType = gVar.f23941f;
        }
        PriceSelectType priceSelectType2 = priceSelectType;
        if ((i & 64) != 0) {
            z2 = gVar.f23942g;
        }
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "title");
        C19383o.m32797g(priceSelectType2, "type");
        return new C10803g(str, str2, z3, bigDecimal, bigDecimal2, priceSelectType2, z2);
    }

    /* renamed from: b */
    public final String mo35903b() {
        return this.f23936a;
    }

    /* renamed from: c */
    public final String mo35904c() {
        return this.f23937b;
    }

    /* renamed from: d */
    public final boolean mo35905d() {
        return this.f23941f == PriceSelectType.CUSTOM_PRICE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10803g)) {
            return false;
        }
        C10803g gVar = (C10803g) obj;
        return C19383o.m32792b(this.f23936a, gVar.f23936a) && C19383o.m32792b(this.f23937b, gVar.f23937b) && this.f23938c == gVar.f23938c && C19383o.m32792b(this.f23939d, gVar.f23939d) && C19383o.m32792b(this.f23940e, gVar.f23940e) && this.f23941f == gVar.f23941f && this.f23942g == gVar.f23942g;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23937b, this.f23936a.hashCode() * 31, 31);
        boolean z = this.f23938c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        BigDecimal bigDecimal = this.f23939d;
        int i2 = 0;
        int hashCode = (i + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f23940e;
        if (bigDecimal2 != null) {
            i2 = bigDecimal2.hashCode();
        }
        int hashCode2 = (this.f23941f.hashCode() + ((hashCode + i2) * 31)) * 31;
        boolean z3 = this.f23942g;
        if (!z3) {
            z2 = z3;
        }
        return hashCode2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PriceSelectItem(id=");
        h.append(this.f23936a);
        h.append(", title=");
        h.append(this.f23937b);
        h.append(", selected=");
        h.append(this.f23938c);
        h.append(", min=");
        h.append(this.f23939d);
        h.append(", max=");
        h.append(this.f23940e);
        h.append(", type=");
        h.append(this.f23941f);
        h.append(", isSelectable=");
        return C0391c.m1058d(h, this.f23942g, ')');
    }

    public C10803g(String str, String str2, boolean z, BigDecimal bigDecimal, BigDecimal bigDecimal2, PriceSelectType priceSelectType, boolean z2) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "title");
        C19383o.m32797g(priceSelectType, "type");
        this.f23936a = str;
        this.f23937b = str2;
        this.f23938c = z;
        this.f23939d = bigDecimal;
        this.f23940e = bigDecimal2;
        this.f23941f = priceSelectType;
        this.f23942g = z2;
    }
}
