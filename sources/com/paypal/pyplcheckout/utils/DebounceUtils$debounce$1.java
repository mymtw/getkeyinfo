package com.paypal.pyplcheckout.utils;

import androidx.compose.foundation.layout.C0761x;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

public final class DebounceUtils$debounce$1 extends Lambda implements C19857l<T, C19394m> {
    public final /* synthetic */ C19857l<T, C19394m> $callback;
    public final /* synthetic */ C19525d0 $coroutineScope;
    public final /* synthetic */ Ref$ObjectRef<C19699g1> $debounceJob;
    public final /* synthetic */ long $waitMs;

    @C19060c(mo70540c = "com.paypal.pyplcheckout.utils.DebounceUtils$debounce$1$1", mo70541f = "DebounceUtils.kt", mo70542l = {47}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.pyplcheckout.utils.DebounceUtils$debounce$1$1 */
    public static final class C172741 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C172741(j, lVar, t2, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C172741) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                long j = j;
                this.label = 1;
                if (C18263b.m30814I(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar.invoke(t2);
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebounceUtils$debounce$1(Ref$ObjectRef<C19699g1> ref$ObjectRef, C19525d0 d0Var, long j, C19857l<? super T, C19394m> lVar) {
        super(1);
        this.$debounceJob = ref$ObjectRef;
        this.$coroutineScope = d0Var;
        this.$waitMs = j;
        this.$callback = lVar;
    }

    public final void invoke(T t) {
        C19699g1 g1Var = (C19699g1) this.$debounceJob.element;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
        Ref$ObjectRef<C19699g1> ref$ObjectRef = this.$debounceJob;
        C19525d0 d0Var = this.$coroutineScope;
        final long j = this.$waitMs;
        final C19857l<T, C19394m> lVar = this.$callback;
        final T t2 = t;
        ref$ObjectRef.element = C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C172741((C19340c<? super C172741>) null), 3);
    }
}
