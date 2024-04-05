package com.braze;

import android.content.Context;
import android.content.Intent;
import com.braze.Braze;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p030bo.app.C3853k1;
import p030bo.app.C3969n;
import p301z3.C8436f;

/* renamed from: com.braze.b */
public final class C5381b {
    /* renamed from: a */
    public static final void m10961a(Context context, String str, String str2) {
        Braze b = m10962b(context);
        b.mo15485B(new Braze.C5194f(str2, str), new Braze.C5202g(str, b, str2), true);
    }

    /* renamed from: b */
    public static Braze m10962b(Context context) {
        return Braze.f11170m.mo15515f(context);
    }

    /* renamed from: c */
    public static final void m10963c(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        Braze b = m10962b(context);
        b.mo15485B(Braze.C5210h0.f11302b, new Braze.C5214i0(intent, b), true);
    }

    /* renamed from: d */
    public static final void m10964d(Context context, C3969n nVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Braze b = m10962b(context);
        b.mo15485B(Braze.C5280t0.f11402b, new Braze.C5285u0(nVar, b), true);
    }

    /* renamed from: e */
    public static final void m10965e(Context context, String str, C3853k1 k1Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(k1Var, "transitionType");
        Braze b = m10962b(context);
        b.mo15485B(Braze.C5219j1.f11312b, new Braze.C5223k1(str, k1Var, b), true);
    }

    /* renamed from: f */
    public static final void m10966f(Context context, C3969n nVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Braze b = m10962b(context);
        b.mo15485B(Braze.C5297w1.f11429b, new Braze.C5301x1(nVar, b), true);
    }

    /* renamed from: g */
    public static final void m10967g(Context context, boolean z) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Braze b = m10962b(context);
        b.mo15485B(new Braze.C5309y1(z), new Braze.C5313z1(z), true);
    }

    /* renamed from: h */
    public static final void m10968h(Context context, C8436f fVar) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Braze b = m10962b(context);
        b.mo15485B(new Braze.C5220j2(fVar), new Braze.C5224k2(fVar), true);
    }
}
