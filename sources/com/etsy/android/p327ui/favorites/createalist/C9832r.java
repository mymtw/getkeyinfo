package com.etsy.android.p327ui.favorites.createalist;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.r */
public final class C9832r {

    /* renamed from: a */
    public final C9826o f21731a;

    /* renamed from: b */
    public final int f21732b;

    public C9832r(C9826o oVar, int i) {
        this.f21731a = oVar;
        this.f21732b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9832r)) {
            return false;
        }
        C9832r rVar = (C9832r) obj;
        return C19383o.m32792b(this.f21731a, rVar.f21731a) && this.f21732b == rVar.f21732b;
    }

    public final int hashCode() {
        C9826o oVar = this.f21731a;
        return Integer.hashCode(this.f21732b) + ((oVar == null ? 0 : oVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("NameAListViewState(listingCoverImage=");
        h.append(this.f21731a);
        h.append(", placeholderImageVisibility=");
        return C0073e.m208h(h, this.f21732b, ')');
    }
}
