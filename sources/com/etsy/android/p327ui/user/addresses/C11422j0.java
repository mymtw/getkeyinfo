package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.j0 */
public final class C11422j0 {

    /* renamed from: a */
    public final int f25178a;

    /* renamed from: b */
    public String f25179b = null;

    /* renamed from: c */
    public final int f25180c = R.string.full_name;

    /* renamed from: d */
    public final boolean f25181d;

    /* renamed from: e */
    public final boolean f25182e;

    /* renamed from: f */
    public final FieldViewType f25183f;

    /* renamed from: g */
    public String f25184g;

    /* renamed from: h */
    public String f25185h;

    /* renamed from: i */
    public Boolean f25186i;

    public C11422j0(int i, boolean z, boolean z2, FieldViewType fieldViewType) {
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25178a = i;
        this.f25181d = z;
        this.f25182e = z2;
        this.f25183f = fieldViewType;
        this.f25186i = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11422j0)) {
            return false;
        }
        C11422j0 j0Var = (C11422j0) obj;
        return this.f25178a == j0Var.f25178a && C19383o.m32792b(this.f25179b, j0Var.f25179b) && this.f25180c == j0Var.f25180c && this.f25181d == j0Var.f25181d && this.f25182e == j0Var.f25182e && this.f25183f == j0Var.f25183f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25178a) * 31;
        String str = this.f25179b;
        int a = C0069a.m170a(this.f25180c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f25181d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25182e;
        if (!z3) {
            z2 = z3;
        }
        return this.f25183f.hashCode() + ((i + (z2 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FullNameData(id=");
        h.append(this.f25178a);
        h.append(", label=");
        h.append(this.f25179b);
        h.append(", labelRes=");
        h.append(this.f25180c);
        h.append(", required=");
        h.append(this.f25181d);
        h.append(", upperCaseField=");
        h.append(this.f25182e);
        h.append(", viewType=");
        h.append(this.f25183f);
        h.append(')');
        return h.toString();
    }
}
