package com.etsy.android.p327ui.home.landingpage;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.landingpage.h */
public final class C10035h {

    /* renamed from: a */
    public final List<C10027f> f22091a;

    public C10035h(List<? extends C10027f> list) {
        C19383o.m32797g(list, "sideEffects");
        this.f22091a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10035h) && C19383o.m32792b(this.f22091a, ((C10035h) obj).f22091a);
    }

    public final int hashCode() {
        return this.f22091a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("LandingPageState(sideEffects="), this.f22091a, ')');
    }
}
