package com.paypal.pyplcheckout.extensions;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "com.paypal.pyplcheckout.extensions.FlowExtensionsKt$merge$1", mo70541f = "FlowExtensions.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class FlowExtensionsKt$merge$1 extends SuspendLambda implements C19862q<T1, T2, C19340c<? super R>, Object> {
    public final /* synthetic */ C19861p<T1, T2, R> $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$merge$1(C19861p<? super T1, ? super T2, ? extends R> pVar, C19340c<? super FlowExtensionsKt$merge$1> cVar) {
        super(3, cVar);
        this.$transform = pVar;
    }

    public final Object invoke(T1 t1, T2 t2, C19340c<? super R> cVar) {
        FlowExtensionsKt$merge$1 flowExtensionsKt$merge$1 = new FlowExtensionsKt$merge$1(this.$transform, cVar);
        flowExtensionsKt$merge$1.L$0 = t1;
        flowExtensionsKt$merge$1.L$1 = t2;
        return flowExtensionsKt$merge$1.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return this.$transform.invoke(this.L$0, this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
