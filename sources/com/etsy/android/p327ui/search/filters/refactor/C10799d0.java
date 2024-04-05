package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.d0 */
public final class C10799d0 {

    /* renamed from: a */
    public final String f23924a;

    /* renamed from: b */
    public final String f23925b;

    /* renamed from: c */
    public final boolean f23926c;

    public C10799d0(String str, String str2, boolean z) {
        C19383o.m32797g(str, "id");
        this.f23924a = str;
        this.f23925b = str2;
        this.f23926c = z;
    }

    /* renamed from: a */
    public static C10799d0 m18805a(C10799d0 d0Var, boolean z) {
        String str = d0Var.f23924a;
        String str2 = d0Var.f23925b;
        d0Var.getClass();
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "title");
        return new C10799d0(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10799d0)) {
            return false;
        }
        C10799d0 d0Var = (C10799d0) obj;
        return C19383o.m32792b(this.f23924a, d0Var.f23924a) && C19383o.m32792b(this.f23925b, d0Var.f23925b) && this.f23926c == d0Var.f23926c;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23925b, this.f23924a.hashCode() * 31, 31);
        boolean z = this.f23926c;
        if (z) {
            z = true;
        }
        return e + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopLocationSelectItem(id=");
        h.append(this.f23924a);
        h.append(", title=");
        h.append(this.f23925b);
        h.append(", selected=");
        return C0391c.m1058d(h, this.f23926c, ')');
    }
}
