package com.bugsnag.android;

import java.util.Collections;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: com.bugsnag.android.s */
public final class C5907s implements C19861p<Boolean, Integer, C19394m> {

    /* renamed from: b */
    public final /* synthetic */ C5917u f12602b;

    public C5907s(C5917u uVar) {
        this.f12602b = uVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Integer num = (Integer) obj2;
        this.f12602b.f12632k.f12459b = Boolean.TRUE.equals((Boolean) obj);
        C5825q1 q1Var = this.f12602b.f12632k;
        if (C19383o.m32792b(q1Var.f12460c, num)) {
            z = false;
        } else {
            q1Var.f12460c = num;
            z = true;
        }
        if (z) {
            C5917u uVar = this.f12602b;
            uVar.mo16682a(BreadcrumbType.STATE, "Trim Memory", Collections.singletonMap("trimLevel", uVar.f12632k.mo16613b()));
        }
        this.f12602b.f12632k.mo16612a();
        return null;
    }
}
