package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.l0 */
public final class C11426l0 {

    /* renamed from: a */
    public final int f25208a;

    /* renamed from: b */
    public final String f25209b = null;

    /* renamed from: c */
    public final int f25210c = R.string.phone_number;

    /* renamed from: d */
    public final boolean f25211d;

    /* renamed from: e */
    public final FieldViewType f25212e;

    /* renamed from: f */
    public String f25213f;

    /* renamed from: g */
    public String f25214g;

    /* renamed from: h */
    public Boolean f25215h;

    public C11426l0(int i, boolean z, FieldViewType fieldViewType) {
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25208a = i;
        this.f25211d = z;
        this.f25212e = fieldViewType;
        this.f25215h = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11426l0)) {
            return false;
        }
        C11426l0 l0Var = (C11426l0) obj;
        return this.f25208a == l0Var.f25208a && C19383o.m32792b(this.f25209b, l0Var.f25209b) && this.f25210c == l0Var.f25210c && this.f25211d == l0Var.f25211d && this.f25212e == l0Var.f25212e;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25208a) * 31;
        String str = this.f25209b;
        int a = C0069a.m170a(this.f25210c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f25211d;
        if (z) {
            z = true;
        }
        return this.f25212e.hashCode() + ((a + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PhoneNumberData(id=");
        h.append(this.f25208a);
        h.append(", label=");
        h.append(this.f25209b);
        h.append(", labelRes=");
        h.append(this.f25210c);
        h.append(", required=");
        h.append(this.f25211d);
        h.append(", viewType=");
        h.append(this.f25212e);
        h.append(')');
        return h.toString();
    }
}
