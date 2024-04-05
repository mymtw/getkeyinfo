package com.paypal.pyplcheckout.services;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class Repository$upgradeAccessToken$2$2 extends Lambda implements C19857l<Exception, C19394m> {
    public final /* synthetic */ C19340c<C19394m> $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Repository$upgradeAccessToken$2$2(C19340c<? super C19394m> cVar) {
        super(1);
        this.$continuation = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Exception) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Exception exc) {
        C19383o.m32797g(exc, "exception");
        this.$continuation.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(exc)));
    }
}
