package com.etsy.android.p327ui.conversation.details.ccm;

import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.n */
public final /* synthetic */ class C9509n implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ C9510o f21084b;

    /* renamed from: c */
    public final /* synthetic */ long f21085c;

    public /* synthetic */ C9509n(C9510o oVar, long j) {
        this.f21084b = oVar;
        this.f21085c = j;
    }

    public final void accept(Object obj) {
        C9510o oVar = this.f21084b;
        long j = this.f21085c;
        Throwable th = (Throwable) obj;
        C19383o.m32797g(oVar, "this$0");
        oVar.f21087b.mo31973e(j, "", true);
    }
}
