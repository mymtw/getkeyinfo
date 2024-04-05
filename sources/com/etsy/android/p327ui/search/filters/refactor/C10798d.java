package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.filters.refactor.d */
public final class C10798d {

    /* renamed from: a */
    public final String f23919a;

    /* renamed from: b */
    public final String f23920b;

    /* renamed from: c */
    public final String f23921c;

    /* renamed from: d */
    public final boolean f23922d;

    /* renamed from: e */
    public final boolean f23923e;

    public /* synthetic */ C10798d(String str, String str2, boolean z) {
        this(C0069a.m174e("randomUUID().toString()"), str, str2, z, true);
    }

    /* renamed from: a */
    public static C10798d m18802a(C10798d dVar, boolean z) {
        String str = dVar.f23919a;
        String str2 = dVar.f23920b;
        String str3 = dVar.f23921c;
        boolean z2 = dVar.f23923e;
        dVar.getClass();
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str2, "groupId");
        C19383o.m32797g(str3, "title");
        return new C10798d(str, str2, str3, z, z2);
    }

    /* renamed from: b */
    public final String mo35889b() {
        return this.f23920b;
    }

    /* renamed from: c */
    public final String mo35890c() {
        return this.f23919a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10798d)) {
            return false;
        }
        C10798d dVar = (C10798d) obj;
        return C19383o.m32792b(this.f23919a, dVar.f23919a) && C19383o.m32792b(this.f23920b, dVar.f23920b) && C19383o.m32792b(this.f23921c, dVar.f23921c) && this.f23922d == dVar.f23922d && this.f23923e == dVar.f23923e;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f23921c, C0023f.m105e(this.f23920b, this.f23919a.hashCode() * 31, 31), 31);
        boolean z = this.f23922d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        boolean z3 = this.f23923e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FiltersSelectItem(id=");
        h.append(this.f23919a);
        h.append(", groupId=");
        h.append(this.f23920b);
        h.append(", title=");
        h.append(this.f23921c);
        h.append(", selected=");
        h.append(this.f23922d);
        h.append(", enabled=");
        return C0391c.m1058d(h, this.f23923e, ')');
    }

    public C10798d(String str, String str2, String str3, boolean z, boolean z2) {
        C19383o.m32797g(str, "id");
        this.f23919a = str;
        this.f23920b = str2;
        this.f23921c = str3;
        this.f23922d = z;
        this.f23923e = z2;
    }
}
