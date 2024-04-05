package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.i0 */
public final class C11419i0 {

    /* renamed from: a */
    public final int f25168a;

    /* renamed from: b */
    public String f25169b = null;

    /* renamed from: c */
    public final int f25170c = R.string.street_address;

    /* renamed from: d */
    public final boolean f25171d;

    /* renamed from: e */
    public final boolean f25172e;

    /* renamed from: f */
    public final FieldViewType f25173f;

    /* renamed from: g */
    public String f25174g;

    /* renamed from: h */
    public String f25175h;

    /* renamed from: i */
    public Boolean f25176i;

    public C11419i0(int i, boolean z, boolean z2, FieldViewType fieldViewType) {
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25168a = i;
        this.f25171d = z;
        this.f25172e = z2;
        this.f25173f = fieldViewType;
        this.f25176i = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11419i0)) {
            return false;
        }
        C11419i0 i0Var = (C11419i0) obj;
        return this.f25168a == i0Var.f25168a && C19383o.m32792b(this.f25169b, i0Var.f25169b) && this.f25170c == i0Var.f25170c && this.f25171d == i0Var.f25171d && this.f25172e == i0Var.f25172e && this.f25173f == i0Var.f25173f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25168a) * 31;
        String str = this.f25169b;
        int a = C0069a.m170a(this.f25170c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f25171d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25172e;
        if (!z3) {
            z2 = z3;
        }
        return this.f25173f.hashCode() + ((i + (z2 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FirstLineData(id=");
        h.append(this.f25168a);
        h.append(", label=");
        h.append(this.f25169b);
        h.append(", labelRes=");
        h.append(this.f25170c);
        h.append(", required=");
        h.append(this.f25171d);
        h.append(", upperCaseField=");
        h.append(this.f25172e);
        h.append(", viewType=");
        h.append(this.f25173f);
        h.append(')');
        return h.toString();
    }
}
