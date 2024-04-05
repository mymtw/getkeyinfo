package com.etsy.android.p327ui.home.tabs;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.tabs.m */
public final class C10067m {

    /* renamed from: a */
    public final List<C10065l> f22185a;

    public C10067m(List<? extends C10065l> list) {
        C19383o.m32797g(list, "sideEffects");
        this.f22185a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10067m) && C19383o.m32792b(this.f22185a, ((C10067m) obj).f22185a);
    }

    public final int hashCode() {
        return this.f22185a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("HomePagerState(sideEffects="), this.f22185a, ')');
    }
}
