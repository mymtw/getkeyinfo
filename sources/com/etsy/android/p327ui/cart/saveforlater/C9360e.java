package com.etsy.android.p327ui.cart.saveforlater;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p308ac.C8498b;

/* renamed from: com.etsy.android.ui.cart.saveforlater.e */
public final class C9360e {

    /* renamed from: a */
    public final C8498b f20644a;

    /* renamed from: b */
    public final List<C9358d> f20645b;

    public C9360e(C8498b bVar, List<? extends C9358d> list) {
        C19383o.m32797g(list, "sideEffects");
        this.f20644a = bVar;
        this.f20645b = list;
    }

    /* renamed from: a */
    public static C9360e m17717a(C9360e eVar, C8498b bVar, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            bVar = eVar.f20644a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = eVar.f20645b;
        }
        eVar.getClass();
        C19383o.m32797g(bVar, "viewState");
        C19383o.m32797g(list, "sideEffects");
        return new C9360e(bVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9360e)) {
            return false;
        }
        C9360e eVar = (C9360e) obj;
        return C19383o.m32792b(this.f20644a, eVar.f20644a) && C19383o.m32792b(this.f20645b, eVar.f20645b);
    }

    public final int hashCode() {
        return this.f20645b.hashCode() + (this.f20644a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveForLaterState(viewState=");
        h.append(this.f20644a);
        h.append(", sideEffects=");
        return C0070b.m186i(h, this.f20645b, ')');
    }
}
