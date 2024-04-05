package com.etsy.android.p327ui.search.interstitial;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.interstitial.d */
public final class C10882d {

    /* renamed from: a */
    public final List<C10877c> f24139a;

    public C10882d() {
        this(0);
    }

    public C10882d(List<? extends C10877c> list) {
        C19383o.m32797g(list, "sideEffects");
        this.f24139a = list;
    }

    /* renamed from: a */
    public final C10882d mo36117a(C10877c cVar) {
        return new C10882d((List<? extends C10877c>) C19327t.m32651g1(this.f24139a, cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10882d) && C19383o.m32792b(this.f24139a, ((C10882d) obj).f24139a);
    }

    public final int hashCode() {
        return this.f24139a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("SearchInterstitialState(sideEffects="), this.f24139a, ')');
    }

    public C10882d(int i) {
        this((List<? extends C10877c>) EmptyList.INSTANCE);
    }
}
