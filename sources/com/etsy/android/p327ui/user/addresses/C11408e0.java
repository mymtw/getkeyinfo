package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.e0 */
public final class C11408e0 {

    /* renamed from: a */
    public final int f25135a;

    /* renamed from: b */
    public String f25136b;

    /* renamed from: c */
    public final int f25137c;

    /* renamed from: d */
    public final boolean f25138d;

    /* renamed from: e */
    public final boolean f25139e;

    /* renamed from: f */
    public final AdministrativeAreaType f25140f;

    /* renamed from: g */
    public final Map<String, String> f25141g;

    /* renamed from: h */
    public final FieldViewType f25142h;

    /* renamed from: i */
    public String f25143i;

    /* renamed from: j */
    public String f25144j;

    /* renamed from: k */
    public Boolean f25145k;

    public C11408e0() {
        throw null;
    }

    public C11408e0(int i, int i2, boolean z, boolean z2, AdministrativeAreaType administrativeAreaType, Map map, FieldViewType fieldViewType) {
        C19383o.m32797g(administrativeAreaType, "type");
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25135a = i;
        this.f25136b = null;
        this.f25137c = i2;
        this.f25138d = z;
        this.f25139e = z2;
        this.f25140f = administrativeAreaType;
        this.f25141g = map;
        this.f25142h = fieldViewType;
        this.f25145k = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11408e0)) {
            return false;
        }
        C11408e0 e0Var = (C11408e0) obj;
        return this.f25135a == e0Var.f25135a && C19383o.m32792b(this.f25136b, e0Var.f25136b) && this.f25137c == e0Var.f25137c && this.f25138d == e0Var.f25138d && this.f25139e == e0Var.f25139e && this.f25140f == e0Var.f25140f && C19383o.m32792b(this.f25141g, e0Var.f25141g) && this.f25142h == e0Var.f25142h;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25135a) * 31;
        String str = this.f25136b;
        int a = C0069a.m170a(this.f25137c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f25138d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25139e;
        if (!z3) {
            z2 = z3;
        }
        return this.f25142h.hashCode() + ((this.f25141g.hashCode() + ((this.f25140f.hashCode() + ((i + (z2 ? 1 : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AdministrativeAreaData(id=");
        h.append(this.f25135a);
        h.append(", label=");
        h.append(this.f25136b);
        h.append(", labelRes=");
        h.append(this.f25137c);
        h.append(", required=");
        h.append(this.f25138d);
        h.append(", upperCaseField=");
        h.append(this.f25139e);
        h.append(", type=");
        h.append(this.f25140f);
        h.append(", administrativeAreas=");
        h.append(this.f25141g);
        h.append(", viewType=");
        h.append(this.f25142h);
        h.append(')');
        return h.toString();
    }
}
