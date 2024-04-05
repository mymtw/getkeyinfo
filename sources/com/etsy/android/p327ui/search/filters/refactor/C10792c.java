package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.c */
public final class C10792c {

    /* renamed from: a */
    public final String f23901a;

    /* renamed from: b */
    public final String f23902b;

    /* renamed from: c */
    public final String f23903c;

    /* renamed from: d */
    public final boolean f23904d;

    /* renamed from: e */
    public final C10804h f23905e;

    /* renamed from: f */
    public final boolean f23906f;

    public C10792c(String str, String str2, String str3, boolean z, C10804h hVar, boolean z2) {
        this.f23901a = str;
        this.f23902b = str2;
        this.f23903c = str3;
        this.f23904d = z;
        this.f23905e = hVar;
        this.f23906f = z2;
    }

    /* renamed from: a */
    public static C10792c m18795a(C10792c cVar, boolean z) {
        String str = cVar.f23901a;
        String str2 = cVar.f23902b;
        String str3 = cVar.f23903c;
        C10804h hVar = cVar.f23905e;
        boolean z2 = cVar.f23906f;
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "groupId");
        C19383o.m32797g(str3, "title");
        C19383o.m32797g(hVar, "color");
        return new C10792c(str, str2, str3, z, hVar, z2);
    }

    /* renamed from: b */
    public final String mo35879b() {
        return this.f23902b;
    }

    /* renamed from: c */
    public final String mo35880c() {
        return this.f23901a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10792c)) {
            return false;
        }
        C10792c cVar = (C10792c) obj;
        return C19383o.m32792b(this.f23901a, cVar.f23901a) && C19383o.m32792b(this.f23902b, cVar.f23902b) && C19383o.m32792b(this.f23903c, cVar.f23903c) && this.f23904d == cVar.f23904d && C19383o.m32792b(this.f23905e, cVar.f23905e) && this.f23906f == cVar.f23906f;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23903c, C0023f.m105e(this.f23902b, this.f23901a.hashCode() * 31, 31), 31);
        boolean z = this.f23904d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode = (this.f23905e.hashCode() + ((e + (z ? 1 : 0)) * 31)) * 31;
        boolean z3 = this.f23906f;
        if (!z3) {
            z2 = z3;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FilterColorSelectItem(id=");
        h.append(this.f23901a);
        h.append(", groupId=");
        h.append(this.f23902b);
        h.append(", title=");
        h.append(this.f23903c);
        h.append(", selected=");
        h.append(this.f23904d);
        h.append(", color=");
        h.append(this.f23905e);
        h.append(", enabled=");
        return C0391c.m1058d(h, this.f23906f, ')');
    }
}
