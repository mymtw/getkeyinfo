package com.etsy.android.p327ui.util;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19671s1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.util.FlowEventDispatcher$dispatch$1", mo70541f = "FlowEventDispatcher.kt", mo70542l = {18}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.util.FlowEventDispatcher$dispatch$1 */
public final class FlowEventDispatcher$dispatch$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ T $event;
    public int label;
    public final /* synthetic */ FlowEventDispatcher<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowEventDispatcher$dispatch$1(FlowEventDispatcher<T> flowEventDispatcher, T t, C19340c<? super FlowEventDispatcher$dispatch$1> cVar) {
        super(2, cVar);
        this.this$0 = flowEventDispatcher;
        this.$event = t;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new FlowEventDispatcher$dispatch$1(this.this$0, this.$event, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((FlowEventDispatcher$dispatch$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19671s1 s1Var = this.this$0.f26218b;
            T t = this.$event;
            this.label = 1;
            if (s1Var.emit(t, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
