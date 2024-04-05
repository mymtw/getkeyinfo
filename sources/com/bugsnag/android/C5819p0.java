package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.io.IOException;

/* renamed from: com.bugsnag.android.p0 */
public final class C5819p0 implements C5748g1.C5749a {

    /* renamed from: b */
    public final C5824q0 f12445b;

    /* renamed from: c */
    public final C5816o1 f12446c;

    public C5819p0(C5824q0 q0Var, C5816o1 o1Var) {
        this.f12445b = q0Var;
        this.f12446c = o1Var;
    }

    /* renamed from: a */
    public final void mo16610a(String str) {
        if (str != null) {
            C5824q0 q0Var = this.f12445b;
            q0Var.getClass();
            q0Var.f12456c = str;
            return;
        }
        this.f12446c.mo16605e("Invalid null value supplied to error.errorClass, ignoring");
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        this.f12445b.toStream(g1Var);
    }
}
