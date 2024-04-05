package com.bugsnag.android;

import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.m2 */
public final class C5809m2 implements C5934x1 {

    /* renamed from: a */
    public final String f12425a;

    public C5809m2(String str) {
        this.f12425a = str;
    }

    /* renamed from: a */
    public final void mo16417a(C5908s0 s0Var) {
        C19383o.m32798h(s0Var, "event");
        s0Var.mo16669b(Severity.INFO);
        C5918u0 u0Var = s0Var.f12603b;
        u0Var.getClass();
        C5750g2 g2Var = u0Var.f12647b;
        Severity severity = g2Var.f12263f;
        boolean z = g2Var.f12264g;
        u0Var.f12647b = new C5750g2("strictMode", severity, z, z != g2Var.f12265h, g2Var.f12261d, g2Var.f12260c);
        List<C5819p0> list = s0Var.f12603b.f12658m;
        C19383o.m32793c(list, "event.errors");
        C5819p0 p0Var = (C5819p0) C19327t.m32640V0(list);
        if (p0Var != null) {
            p0Var.f12445b.f12457d = this.f12425a;
        }
    }
}
