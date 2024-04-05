package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.n0 */
public final class C11438n0 {

    /* renamed from: a */
    public final int f25248a;

    /* renamed from: b */
    public String f25249b = null;

    /* renamed from: c */
    public final int f25250c;

    /* renamed from: d */
    public final boolean f25251d;

    /* renamed from: e */
    public final boolean f25252e;

    /* renamed from: f */
    public final SecondLineType f25253f;

    /* renamed from: g */
    public final FieldViewType f25254g;

    /* renamed from: h */
    public String f25255h;

    /* renamed from: i */
    public String f25256i;

    /* renamed from: j */
    public Boolean f25257j;

    public C11438n0(int i, int i2, boolean z, boolean z2, SecondLineType secondLineType, FieldViewType fieldViewType) {
        C19383o.m32797g(secondLineType, "type");
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25248a = i;
        this.f25250c = i2;
        this.f25251d = z;
        this.f25252e = z2;
        this.f25253f = secondLineType;
        this.f25254g = fieldViewType;
        this.f25257j = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11438n0)) {
            return false;
        }
        C11438n0 n0Var = (C11438n0) obj;
        return this.f25248a == n0Var.f25248a && C19383o.m32792b(this.f25249b, n0Var.f25249b) && this.f25250c == n0Var.f25250c && this.f25251d == n0Var.f25251d && this.f25252e == n0Var.f25252e && this.f25253f == n0Var.f25253f && this.f25254g == n0Var.f25254g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25248a) * 31;
        String str = this.f25249b;
        int a = C0069a.m170a(this.f25250c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f25251d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25252e;
        if (!z3) {
            z2 = z3;
        }
        return this.f25254g.hashCode() + ((this.f25253f.hashCode() + ((i + (z2 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SecondLineData(id=");
        h.append(this.f25248a);
        h.append(", label=");
        h.append(this.f25249b);
        h.append(", labelRes=");
        h.append(this.f25250c);
        h.append(", required=");
        h.append(this.f25251d);
        h.append(", upperCaseField=");
        h.append(this.f25252e);
        h.append(", type=");
        h.append(this.f25253f);
        h.append(", viewType=");
        h.append(this.f25254g);
        h.append(')');
        return h.toString();
    }
}
