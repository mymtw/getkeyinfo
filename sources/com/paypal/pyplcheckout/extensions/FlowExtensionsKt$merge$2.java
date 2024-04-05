package com.paypal.pyplcheckout.extensions;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19862q;
import p753kq.C19863r;

@C19060c(mo70540c = "com.paypal.pyplcheckout.extensions.FlowExtensionsKt$merge$2", mo70541f = "FlowExtensions.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class FlowExtensionsKt$merge$2 extends SuspendLambda implements C19863r<T1, T2, T3, C19340c<? super R>, Object> {
    public final /* synthetic */ C19862q<T1, T2, T3, R> $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$merge$2(C19862q<? super T1, ? super T2, ? super T3, ? extends R> qVar, C19340c<? super FlowExtensionsKt$merge$2> cVar) {
        super(4, cVar);
        this.$transform = qVar;
    }

    public final Object invoke(T1 t1, T2 t2, T3 t3, C19340c<? super R> cVar) {
        FlowExtensionsKt$merge$2 flowExtensionsKt$merge$2 = new FlowExtensionsKt$merge$2(this.$transform, cVar);
        flowExtensionsKt$merge$2.L$0 = t1;
        flowExtensionsKt$merge$2.L$1 = t2;
        flowExtensionsKt$merge$2.L$2 = t3;
        return flowExtensionsKt$merge$2.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return this.$transform.invoke(this.L$0, this.L$1, this.L$2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
