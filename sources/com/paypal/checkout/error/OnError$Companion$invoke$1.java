package com.paypal.checkout.error;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class OnError$Companion$invoke$1 implements OnError {
    public final /* synthetic */ C19857l<ErrorInfo, C19394m> $onError;

    public OnError$Companion$invoke$1(C19857l<? super ErrorInfo, C19394m> lVar) {
        this.$onError = lVar;
    }

    public void onError(ErrorInfo errorInfo) {
        C19383o.m32797g(errorInfo, "errorInfo");
        this.$onError.invoke(errorInfo);
    }
}
