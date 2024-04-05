package com.paypal.pyplcheckout.services.api.interceptor;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import okhttp3.C20000q;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor$intercept$1", mo70541f = "NetworkRetryInterceptor.kt", mo70542l = {55}, mo70543m = "invokeSuspend")
public final class NetworkRetryInterceptor$intercept$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super Pair<? extends C20018z, ? extends Throwable>>, Object> {
    public final /* synthetic */ C20000q.C20001a $chain;
    public final /* synthetic */ Ref$ObjectRef<C20011u> $request;
    public final /* synthetic */ NetworkRetryInterceptor.RetryConfiguration $retryConfig;
    public int label;
    public final /* synthetic */ NetworkRetryInterceptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkRetryInterceptor$intercept$1(NetworkRetryInterceptor networkRetryInterceptor, Ref$ObjectRef<C20011u> ref$ObjectRef, C20000q.C20001a aVar, NetworkRetryInterceptor.RetryConfiguration retryConfiguration, C19340c<? super NetworkRetryInterceptor$intercept$1> cVar) {
        super(2, cVar);
        this.this$0 = networkRetryInterceptor;
        this.$request = ref$ObjectRef;
        this.$chain = aVar;
        this.$retryConfig = retryConfiguration;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new NetworkRetryInterceptor$intercept$1(this.this$0, this.$request, this.$chain, this.$retryConfig, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super Pair<C20018z, ? extends Throwable>> cVar) {
        return ((NetworkRetryInterceptor$intercept$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C20000q.C20001a aVar = this.$chain;
            NetworkRetryInterceptor.RetryConfiguration retryConfiguration = this.$retryConfig;
            this.label = 1;
            obj = this.this$0.retry((C20011u) this.$request.element, aVar, retryConfiguration, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
