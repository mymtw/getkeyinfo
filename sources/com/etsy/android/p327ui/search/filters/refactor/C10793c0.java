package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.c0 */
public final class C10793c0 {

    /* renamed from: a */
    public final String f23907a;

    /* renamed from: b */
    public final String f23908b;

    /* renamed from: c */
    public final boolean f23909c;

    /* renamed from: d */
    public final String f23910d;

    public C10793c0(String str, String str2, boolean z, String str3) {
        C19383o.m32797g(str, "id");
        this.f23907a = str;
        this.f23908b = str2;
        this.f23909c = z;
        this.f23910d = str3;
    }

    /* renamed from: a */
    public static C10793c0 m18798a(C10793c0 c0Var, boolean z, String str, int i) {
        String str2 = null;
        String str3 = (i & 1) != 0 ? c0Var.f23907a : null;
        if ((i & 2) != 0) {
            str2 = c0Var.f23908b;
        }
        if ((i & 4) != 0) {
            z = c0Var.f23909c;
        }
        if ((i & 8) != 0) {
            str = c0Var.f23910d;
        }
        c0Var.getClass();
        C19383o.m32797g(str3, "id");
        C19383o.m32797g(str2, "title");
        return new C10793c0(str3, str2, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10793c0)) {
            return false;
        }
        C10793c0 c0Var = (C10793c0) obj;
        return C19383o.m32792b(this.f23907a, c0Var.f23907a) && C19383o.m32792b(this.f23908b, c0Var.f23908b) && this.f23909c == c0Var.f23909c && C19383o.m32792b(this.f23910d, c0Var.f23910d);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23908b, this.f23907a.hashCode() * 31, 31);
        boolean z = this.f23909c;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        String str = this.f23910d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopLocationInputItem(id=");
        h.append(this.f23907a);
        h.append(", title=");
        h.append(this.f23908b);
        h.append(", selected=");
        h.append(this.f23909c);
        h.append(", input=");
        return C0391c.m1057c(h, this.f23910d, ')');
    }
}
