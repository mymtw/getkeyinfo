package com.paypal.pyplcheckout.extensions;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19863r;
import p753kq.C19864s;

@C19060c(mo70540c = "com.paypal.pyplcheckout.extensions.FlowExtensionsKt$merge$3", mo70541f = "FlowExtensions.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class FlowExtensionsKt$merge$3 extends SuspendLambda implements C19864s<T1, T2, T3, T4, C19340c<? super R>, Object> {
    public final /* synthetic */ C19863r<T1, T2, T3, T4, R> $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public /* synthetic */ Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$merge$3(C19863r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar, C19340c<? super FlowExtensionsKt$merge$3> cVar) {
        super(5, cVar);
        this.$transform = rVar;
    }

    public final Object invoke(T1 t1, T2 t2, T3 t3, T4 t4, C19340c<? super R> cVar) {
        FlowExtensionsKt$merge$3 flowExtensionsKt$merge$3 = new FlowExtensionsKt$merge$3(this.$transform, cVar);
        flowExtensionsKt$merge$3.L$0 = t1;
        flowExtensionsKt$merge$3.L$1 = t2;
        flowExtensionsKt$merge$3.L$2 = t3;
        flowExtensionsKt$merge$3.L$3 = t4;
        return flowExtensionsKt$merge$3.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return this.$transform.invoke(this.L$0, this.L$1, this.L$2, this.L$3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
