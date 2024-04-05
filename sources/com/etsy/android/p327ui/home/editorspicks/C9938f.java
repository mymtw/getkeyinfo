package com.etsy.android.p327ui.home.editorspicks;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.editorspicks.f */
public final class C9938f {

    /* renamed from: a */
    public final List<C9930e> f21895a;

    public C9938f(List<? extends C9930e> list) {
        C19383o.m32797g(list, "sideEffects");
        this.f21895a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9938f) && C19383o.m32792b(this.f21895a, ((C9938f) obj).f21895a);
    }

    public final int hashCode() {
        return this.f21895a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("EditorsPicksState(sideEffects="), this.f21895a, ')');
    }
}
