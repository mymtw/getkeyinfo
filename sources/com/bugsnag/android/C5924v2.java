package com.bugsnag.android;

import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.v2 */
public final class C5924v2 implements C5771f {

    /* renamed from: a */
    public final /* synthetic */ C5931w2 f12670a;

    public C5924v2(C5931w2 w2Var) {
        this.f12670a = w2Var;
    }

    public final void onStateChange(C5780k2 k2Var) {
        C19383o.m32798h(k2Var, "event");
        if (k2Var instanceof C5780k2.C5799s) {
            this.f12670a.mo16700a(((C5780k2.C5799s) k2Var).f12407a);
        }
    }
}
