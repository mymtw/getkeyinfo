package com.etsy.android.util;

import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p402n9.C13084d;
import p426qa.C13276b;

/* renamed from: com.etsy.android.util.l */
public final class C12053l implements C13276b {

    /* renamed from: a */
    public final C12043f f26877a;

    /* renamed from: b */
    public final C13084d f26878b;

    public C12053l(C12043f fVar, C13084d dVar) {
        this.f26877a = fVar;
        this.f26878b = dVar;
    }

    /* renamed from: a */
    public final void mo38928a(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        for (C13276b a : C19382n.m32704D0(this.f26877a, this.f26878b)) {
            a.mo38928a(str);
        }
    }
}
