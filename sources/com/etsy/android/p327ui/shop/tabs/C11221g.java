package com.etsy.android.p327ui.shop.tabs;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.g */
public final class C11221g {

    /* renamed from: a */
    public final C11224i f24802a;

    /* renamed from: b */
    public final List<C11219f> f24803b;

    public C11221g(C11224i iVar, List<? extends C11219f> list) {
        C19383o.m32797g(iVar, "shopUi");
        C19383o.m32797g(list, "sideEffects");
        this.f24802a = iVar;
        this.f24803b = list;
    }

    /* renamed from: a */
    public static C11221g m19147a(C11221g gVar, C11224i iVar, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            iVar = gVar.f24802a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = gVar.f24803b;
        }
        gVar.getClass();
        C19383o.m32797g(iVar, "shopUi");
        C19383o.m32797g(list, "sideEffects");
        return new C11221g(iVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11221g)) {
            return false;
        }
        C11221g gVar = (C11221g) obj;
        return C19383o.m32792b(this.f24802a, gVar.f24802a) && C19383o.m32792b(this.f24803b, gVar.f24803b);
    }

    public final int hashCode() {
        return this.f24803b.hashCode() + (this.f24802a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopState(shopUi=");
        h.append(this.f24802a);
        h.append(", sideEffects=");
        return C0070b.m186i(h, this.f24803b, ')');
    }
}
