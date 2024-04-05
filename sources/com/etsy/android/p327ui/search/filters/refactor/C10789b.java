package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.b */
public final class C10789b {

    /* renamed from: a */
    public final String f23890a;

    /* renamed from: b */
    public final String f23891b;

    /* renamed from: c */
    public final boolean f23892c;

    /* renamed from: d */
    public final String f23893d;

    /* renamed from: e */
    public final int f23894e;

    /* renamed from: f */
    public final String f23895f;

    public C10789b(String str, String str2, boolean z, String str3, int i, String str4) {
        this.f23890a = str;
        this.f23891b = str2;
        this.f23892c = z;
        this.f23893d = str3;
        this.f23894e = i;
        this.f23895f = str4;
    }

    /* renamed from: a */
    public final String mo35875a() {
        return this.f23890a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10789b)) {
            return false;
        }
        C10789b bVar = (C10789b) obj;
        return C19383o.m32792b(this.f23890a, bVar.f23890a) && C19383o.m32792b(this.f23891b, bVar.f23891b) && this.f23892c == bVar.f23892c && C19383o.m32792b(this.f23893d, bVar.f23893d) && this.f23894e == bVar.f23894e && C19383o.m32792b(this.f23895f, bVar.f23895f);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23891b, this.f23890a.hashCode() * 31, 31);
        boolean z = this.f23892c;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        String str = this.f23893d;
        int i2 = 0;
        int a = C0069a.m170a(this.f23894e, (i + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f23895f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return a + i2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FilterCategorySelectItem(id=");
        h.append(this.f23890a);
        h.append(", title=");
        h.append(this.f23891b);
        h.append(", selected=");
        h.append(this.f23892c);
        h.append(", networkId=");
        h.append(this.f23893d);
        h.append(", indentLevel=");
        h.append(this.f23894e);
        h.append(", description=");
        return C0391c.m1057c(h, this.f23895f, ')');
    }
}
