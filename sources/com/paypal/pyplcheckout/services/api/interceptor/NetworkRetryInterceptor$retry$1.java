package com.paypal.pyplcheckout.services.api.interceptor;

import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.C20000q;
import okhttp3.C20011u;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor", mo70541f = "NetworkRetryInterceptor.kt", mo70542l = {91}, mo70543m = "retry")
public final class NetworkRetryInterceptor$retry$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NetworkRetryInterceptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkRetryInterceptor$retry$1(NetworkRetryInterceptor networkRetryInterceptor, C19340c<? super NetworkRetryInterceptor$retry$1> cVar) {
        super(cVar);
        this.this$0 = networkRetryInterceptor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retry((C20011u) null, (C20000q.C20001a) null, (NetworkRetryInterceptor.RetryConfiguration) null, this);
    }
}
