package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.m0 */
public final class C5806m0 implements C5748g1.C5749a {

    /* renamed from: c */
    public static final C5807a f12419c = new C5807a();

    /* renamed from: b */
    public final String f12420b;

    /* renamed from: com.bugsnag.android.m0$a */
    public static final class C5807a {
    }

    public C5806m0(String str) {
        this.f12420b = str;
    }

    public final void toStream(C5748g1 g1Var) {
        C19383o.m32798h(g1Var, "stream");
        g1Var.mo16522d();
        g1Var.mo16514B("id");
        g1Var.mo16530k(this.f12420b);
        g1Var.mo16526g();
    }
}
