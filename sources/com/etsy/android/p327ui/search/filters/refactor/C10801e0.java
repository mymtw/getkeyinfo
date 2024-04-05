package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.e0 */
public final class C10801e0 {

    /* renamed from: a */
    public final String f23928a;

    /* renamed from: b */
    public final String f23929b;

    /* renamed from: c */
    public final boolean f23930c;

    /* renamed from: d */
    public final String f23931d;

    public C10801e0(String str, String str2, boolean z, String str3) {
        C19383o.m32797g(str, "id");
        this.f23928a = str;
        this.f23929b = str2;
        this.f23930c = z;
        this.f23931d = str3;
    }

    /* renamed from: a */
    public static C10801e0 m18807a(C10801e0 e0Var, boolean z) {
        String str = e0Var.f23928a;
        String str2 = e0Var.f23929b;
        String str3 = e0Var.f23931d;
        e0Var.getClass();
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "title");
        C19383o.m32797g(str3, "countryCode");
        return new C10801e0(str, str2, z, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10801e0)) {
            return false;
        }
        C10801e0 e0Var = (C10801e0) obj;
        return C19383o.m32792b(this.f23928a, e0Var.f23928a) && C19383o.m32792b(this.f23929b, e0Var.f23929b) && this.f23930c == e0Var.f23930c && C19383o.m32792b(this.f23931d, e0Var.f23931d);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23929b, this.f23928a.hashCode() * 31, 31);
        boolean z = this.f23930c;
        if (z) {
            z = true;
        }
        return this.f23931d.hashCode() + ((e + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopLocationUserCountryItem(id=");
        h.append(this.f23928a);
        h.append(", title=");
        h.append(this.f23929b);
        h.append(", selected=");
        h.append(this.f23930c);
        h.append(", countryCode=");
        return C0391c.m1057c(h, this.f23931d, ')');
    }
}
