package com.etsy.android.p327ui.search.shopresults;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.shopresults.C10942g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.shopresults.f */
public final class C10941f {

    /* renamed from: a */
    public final List<C10939e> f24287a;

    /* renamed from: b */
    public final int f24288b;

    /* renamed from: c */
    public final String f24289c;

    /* renamed from: d */
    public final C10942g f24290d;

    public C10941f() {
        this(0);
    }

    public C10941f(int i) {
        this(EmptyList.INSTANCE, 0, (String) null, C10942g.C10945c.f24293a);
    }

    /* renamed from: a */
    public static C10941f m18941a(C10941f fVar, ArrayList arrayList, int i, String str, C10942g gVar, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = fVar.f24287a;
        }
        if ((i2 & 2) != 0) {
            i = fVar.f24288b;
        }
        if ((i2 & 4) != 0) {
            str = fVar.f24289c;
        }
        if ((i2 & 8) != 0) {
            gVar = fVar.f24290d;
        }
        fVar.getClass();
        C19383o.m32797g(list, "sideEffects");
        C19383o.m32797g(gVar, ResponseConstants.f19137UI);
        return new C10941f(list, i, str, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10941f)) {
            return false;
        }
        C10941f fVar = (C10941f) obj;
        return C19383o.m32792b(this.f24287a, fVar.f24287a) && this.f24288b == fVar.f24288b && C19383o.m32792b(this.f24289c, fVar.f24289c) && C19383o.m32792b(this.f24290d, fVar.f24290d);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f24288b, this.f24287a.hashCode() * 31, 31);
        String str = this.f24289c;
        return this.f24290d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchResultsShopsState(sideEffects=");
        h.append(this.f24287a);
        h.append(", offset=");
        h.append(this.f24288b);
        h.append(", query=");
        h.append(this.f24289c);
        h.append(", ui=");
        h.append(this.f24290d);
        h.append(')');
        return h.toString();
    }

    public C10941f(List<? extends C10939e> list, int i, String str, C10942g gVar) {
        C19383o.m32797g(list, "sideEffects");
        C19383o.m32797g(gVar, ResponseConstants.f19137UI);
        this.f24287a = list;
        this.f24288b = i;
        this.f24289c = str;
        this.f24290d = gVar;
    }
}
