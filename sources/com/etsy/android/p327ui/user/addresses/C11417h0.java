package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.h0 */
public final class C11417h0 {

    /* renamed from: a */
    public final int f25160a;

    /* renamed from: b */
    public String f25161b = null;

    /* renamed from: c */
    public final int f25162c = R.string.set_as_default_address;

    /* renamed from: d */
    public final Boolean f25163d;

    /* renamed from: e */
    public final FieldViewType f25164e;

    /* renamed from: f */
    public Boolean f25165f;

    public C11417h0(int i, Boolean bool, FieldViewType fieldViewType) {
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25160a = i;
        this.f25163d = bool;
        this.f25164e = fieldViewType;
        this.f25165f = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11417h0)) {
            return false;
        }
        C11417h0 h0Var = (C11417h0) obj;
        return this.f25160a == h0Var.f25160a && C19383o.m32792b(this.f25161b, h0Var.f25161b) && this.f25162c == h0Var.f25162c && C19383o.m32792b(this.f25163d, h0Var.f25163d) && this.f25164e == h0Var.f25164e;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25160a) * 31;
        String str = this.f25161b;
        int i = 0;
        int a = C0069a.m170a(this.f25162c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool = this.f25163d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return this.f25164e.hashCode() + ((a + i) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DefaultAddressData(id=");
        h.append(this.f25160a);
        h.append(", label=");
        h.append(this.f25161b);
        h.append(", labelRes=");
        h.append(this.f25162c);
        h.append(", isCurrentDefaultAddress=");
        h.append(this.f25163d);
        h.append(", viewType=");
        h.append(this.f25164e);
        h.append(')');
        return h.toString();
    }
}
