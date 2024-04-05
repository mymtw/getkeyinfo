package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.g0 */
public final class C11415g0 {

    /* renamed from: a */
    public final int f25153a;

    /* renamed from: b */
    public String f25154b = null;

    /* renamed from: c */
    public final int f25155c = R.string.country;

    /* renamed from: d */
    public final FieldViewType f25156d;

    /* renamed from: e */
    public String f25157e;

    public C11415g0(int i, FieldViewType fieldViewType) {
        C19383o.m32797g(fieldViewType, "viewType");
        this.f25153a = i;
        this.f25156d = fieldViewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11415g0)) {
            return false;
        }
        C11415g0 g0Var = (C11415g0) obj;
        return this.f25153a == g0Var.f25153a && C19383o.m32792b(this.f25154b, g0Var.f25154b) && this.f25155c == g0Var.f25155c && this.f25156d == g0Var.f25156d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f25153a) * 31;
        String str = this.f25154b;
        return this.f25156d.hashCode() + C0069a.m170a(this.f25155c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CountryData(id=");
        h.append(this.f25153a);
        h.append(", label=");
        h.append(this.f25154b);
        h.append(", labelRes=");
        h.append(this.f25155c);
        h.append(", viewType=");
        h.append(this.f25156d);
        h.append(')');
        return h.toString();
    }
}
