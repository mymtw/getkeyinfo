package com.bugsnag.android;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.e */
public final class C5735e extends C5724c {

    /* renamed from: j */
    public Number f12209j;

    /* renamed from: k */
    public Number f12210k;

    /* renamed from: l */
    public Boolean f12211l;

    /* renamed from: m */
    public Boolean f12212m;

    public C5735e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l, Long l2, Boolean bool, Boolean bool2) {
        super(str, str2, str3, str4, str5, str6, str7, num);
        this.f12209j = l;
        this.f12210k = l2;
        this.f12211l = bool;
        this.f12212m = bool2;
    }

    /* renamed from: a */
    public final void mo16484a(C5748g1 g1Var) {
        C19383o.m32798h(g1Var, "writer");
        super.mo16484a(g1Var);
        g1Var.mo16514B("duration");
        g1Var.mo16533t(this.f12209j);
        g1Var.mo16514B("durationInForeground");
        g1Var.mo16533t(this.f12210k);
        g1Var.mo16514B("inForeground");
        g1Var.mo16532r(this.f12211l);
        g1Var.mo16514B("isLaunching");
        g1Var.mo16532r(this.f12212m);
    }
}
