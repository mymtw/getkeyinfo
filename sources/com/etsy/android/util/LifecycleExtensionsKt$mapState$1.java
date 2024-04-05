package com.etsy.android.util;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.util.LifecycleExtensionsKt$mapState$1", mo70541f = "LifecycleExtensions.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class LifecycleExtensionsKt$mapState$1 extends SuspendLambda implements C19861p<Object, C19340c<Object>, Object> {
    public final /* synthetic */ C19857l<Object, Object> $transform;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleExtensionsKt$mapState$1(C19857l<Object, Object> lVar, C19340c<? super LifecycleExtensionsKt$mapState$1> cVar) {
        super(2, cVar);
        this.$transform = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        LifecycleExtensionsKt$mapState$1 lifecycleExtensionsKt$mapState$1 = new LifecycleExtensionsKt$mapState$1(this.$transform, cVar);
        lifecycleExtensionsKt$mapState$1.L$0 = obj;
        return lifecycleExtensionsKt$mapState$1;
    }

    public final Object invoke(Object obj, C19340c<Object> cVar) {
        return ((LifecycleExtensionsKt$mapState$1) create(obj, cVar)).invokeSuspend(C19394m.f43287a);
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
