package com.paypal.pyplcheckout.extensions;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.extensions.FlowExtensionsKt$mapState$1", mo70541f = "FlowExtensions.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class FlowExtensionsKt$mapState$1 extends SuspendLambda implements C19861p<T, C19340c<? super R>, Object> {
    public final /* synthetic */ C19857l<T, R> $transform;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$mapState$1(C19857l<? super T, ? extends R> lVar, C19340c<? super FlowExtensionsKt$mapState$1> cVar) {
        super(2, cVar);
        this.$transform = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowExtensionsKt$mapState$1 flowExtensionsKt$mapState$1 = new FlowExtensionsKt$mapState$1(this.$transform, cVar);
        flowExtensionsKt$mapState$1.L$0 = obj;
        return flowExtensionsKt$mapState$1;
    }

    public final Object invoke(T t, C19340c<? super R> cVar) {
        return ((FlowExtensionsKt$mapState$1) create(t, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return this.$transform.invoke(this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
