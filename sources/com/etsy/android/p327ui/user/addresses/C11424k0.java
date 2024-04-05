package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.k0 */
public final class C11424k0 {

    /* renamed from: a */
    public final int f25188a;

    /* renamed from: b */
    public String f25189b = null;

    /* renamed from: c */
    public final int f25190c;

    /* renamed from: d */
    public final boolean f25191d;

    /* renamed from: e */
    public final boolean f25192e;

    /* renamed from: f */
    public final LocalityType f25193f;

    /* renamed from: g */
    public final FieldViewType f25194g;

    /* renamed from: h */
    public String f25195h;

    /* renamed from: i */
    public String f25196i;

    /* renamed from: j */
    public Boolean f25197j;

    public C11424k0(int i, int i2, boolean z, boolean z2, LocalityType localityType, FieldViewType fieldViewType) {
        C19383o.m32797g(localityType, "type");
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25188a = i;
        this.f25190c = i2;
        this.f25191d = z;
        this.f25192e = z2;
        this.f25193f = localityType;
        this.f25194g = fieldViewType;
        this.f25197j = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11424k0)) {
            return false;
        }
        C11424k0 k0Var = (C11424k0) obj;
        return this.f25188a == k0Var.f25188a && C19383o.m32792b(this.f25189b, k0Var.f25189b) && this.f25190c == k0Var.f25190c && this.f25191d == k0Var.f25191d && this.f25192e == k0Var.f25192e && this.f25193f == k0Var.f25193f && this.f25194g == k0Var.f25194g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25188a) * 31;
        String str = this.f25189b;
        int a = C0069a.m170a(this.f25190c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f25191d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25192e;
        if (!z3) {
            z2 = z3;
        }
        return this.f25194g.hashCode() + ((this.f25193f.hashCode() + ((i + (z2 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LocalityData(id=");
        h.append(this.f25188a);
        h.append(", label=");
        h.append(this.f25189b);
        h.append(", labelRes=");
        h.append(this.f25190c);
        h.append(", required=");
        h.append(this.f25191d);
        h.append(", upperCaseField=");
        h.append(this.f25192e);
        h.append(", type=");
        h.append(this.f25193f);
        h.append(", viewType=");
        h.append(this.f25194g);
        h.append(')');
        return h.toString();
    }
}
