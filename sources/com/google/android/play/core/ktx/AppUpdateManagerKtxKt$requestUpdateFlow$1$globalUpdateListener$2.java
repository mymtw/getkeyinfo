package com.google.android.play.core.ktx;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C19513o;
import p753kq.C19857l;

public final class AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2 extends Lambda implements C19857l<C15728a, C19394m> {
    public final /* synthetic */ C19513o $this_callbackFlow;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(C19513o oVar) {
        super(1);
        this.$this_callbackFlow = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15728a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C15728a aVar) {
        C19383o.m32798h(aVar, "$receiver");
        this.$this_callbackFlow.mo72187C((Throwable) null);
    }
}
