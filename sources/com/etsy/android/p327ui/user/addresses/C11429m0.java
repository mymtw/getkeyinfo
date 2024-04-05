package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.addresses.m0 */
public final class C11429m0 {

    /* renamed from: a */
    public final int f25226a;

    /* renamed from: b */
    public String f25227b = null;

    /* renamed from: c */
    public final int f25228c;

    /* renamed from: d */
    public final boolean f25229d;

    /* renamed from: e */
    public final boolean f25230e;

    /* renamed from: f */
    public final PostalCodeType f25231f;

    /* renamed from: g */
    public final String f25232g;

    /* renamed from: h */
    public final FieldViewType f25233h;

    /* renamed from: i */
    public String f25234i;

    /* renamed from: j */
    public String f25235j;

    /* renamed from: k */
    public Boolean f25236k;

    public C11429m0(int i, int i2, boolean z, boolean z2, PostalCodeType postalCodeType, String str, FieldViewType fieldViewType) {
        C19383o.m32797g(postalCodeType, "type");
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25226a = i;
        this.f25228c = i2;
        this.f25229d = z;
        this.f25230e = z2;
        this.f25231f = postalCodeType;
        this.f25232g = str;
        this.f25233h = fieldViewType;
        this.f25236k = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11429m0)) {
            return false;
        }
        C11429m0 m0Var = (C11429m0) obj;
        return this.f25226a == m0Var.f25226a && C19383o.m32792b(this.f25227b, m0Var.f25227b) && this.f25228c == m0Var.f25228c && this.f25229d == m0Var.f25229d && this.f25230e == m0Var.f25230e && this.f25231f == m0Var.f25231f && C19383o.m32792b(this.f25232g, m0Var.f25232g) && this.f25233h == m0Var.f25233h;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25226a) * 31;
        String str = this.f25227b;
        int a = C0069a.m170a(this.f25228c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f25229d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25230e;
        if (!z3) {
            z2 = z3;
        }
        return this.f25233h.hashCode() + C0023f.m105e(this.f25232g, (this.f25231f.hashCode() + ((i + (z2 ? 1 : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PostalCodeData(id=");
        h.append(this.f25226a);
        h.append(", label=");
        h.append(this.f25227b);
        h.append(", labelRes=");
        h.append(this.f25228c);
        h.append(", required=");
        h.append(this.f25229d);
        h.append(", upperCaseField=");
        h.append(this.f25230e);
        h.append(", type=");
        h.append(this.f25231f);
        h.append(", pattern=");
        h.append(this.f25232g);
        h.append(", viewType=");
        h.append(this.f25233h);
        h.append(')');
        return h.toString();
    }
}
