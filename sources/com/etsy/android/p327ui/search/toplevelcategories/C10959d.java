package com.etsy.android.p327ui.search.toplevelcategories;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.toplevelcategories.d */
public final class C10959d {

    /* renamed from: a */
    public final C10960e f24306a;

    /* renamed from: b */
    public final List<C10958c> f24307b;

    public C10959d(C10960e eVar, List<? extends C10958c> list) {
        C19383o.m32797g(list, "sideEffects");
        this.f24306a = eVar;
        this.f24307b = list;
    }

    /* renamed from: a */
    public static C10959d m18945a(C10959d dVar, C10960e eVar, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            eVar = dVar.f24306a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = dVar.f24307b;
        }
        dVar.getClass();
        C19383o.m32797g(eVar, "uiState");
        C19383o.m32797g(list, "sideEffects");
        return new C10959d(eVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10959d)) {
            return false;
        }
        C10959d dVar = (C10959d) obj;
        return C19383o.m32792b(this.f24306a, dVar.f24306a) && C19383o.m32792b(this.f24307b, dVar.f24307b);
    }

    public final int hashCode() {
        return this.f24307b.hashCode() + (this.f24306a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TopLevelCategoriesState(uiState=");
        h.append(this.f24306a);
        h.append(", sideEffects=");
        return C0070b.m186i(h, this.f24307b, ')');
    }
}
