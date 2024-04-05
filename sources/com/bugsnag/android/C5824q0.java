package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.q0 */
public final class C5824q0 implements C5748g1.C5749a {

    /* renamed from: b */
    public final List<C5759i2> f12455b;

    /* renamed from: c */
    public String f12456c;

    /* renamed from: d */
    public String f12457d;

    /* renamed from: e */
    public ErrorType f12458e;

    public C5824q0(String str, String str2, C5776j2 j2Var, ErrorType errorType) {
        C19383o.m32798h(str, "errorClass");
        C19383o.m32798h(errorType, "type");
        this.f12456c = str;
        this.f12457d = str2;
        this.f12458e = errorType;
        this.f12455b = j2Var.f12370b;
    }

    public final void toStream(C5748g1 g1Var) {
        C19383o.m32798h(g1Var, "writer");
        g1Var.mo16522d();
        g1Var.mo16514B("errorClass");
        g1Var.mo16530k(this.f12456c);
        g1Var.mo16514B("message");
        g1Var.mo16530k(this.f12457d);
        g1Var.mo16514B("type");
        g1Var.mo16530k(this.f12458e.getDesc$bugsnag_android_core_release());
        g1Var.mo16514B("stacktrace");
        g1Var.mo16516M(this.f12455b, false);
        g1Var.mo16526g();
    }
}
