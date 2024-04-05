package com.paypal.pyplcheckout.utils;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
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

public final class DebounceUtils$throttleLatestUnique$1 extends Lambda implements C19857l<T, C19394m> {
    public final /* synthetic */ C19857l<T, C19394m> $callback;
    public final /* synthetic */ C19525d0 $coroutineScope;
    public final /* synthetic */ long $intervalMs;
    public final /* synthetic */ Ref$ObjectRef<T> $latestParam;
    public final /* synthetic */ Ref$ObjectRef<C19699g1> $throttleJob;

    @C19060c(mo70540c = "com.paypal.pyplcheckout.utils.DebounceUtils$throttleLatestUnique$1$1", mo70541f = "DebounceUtils.kt", mo70542l = {103}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.pyplcheckout.utils.DebounceUtils$throttleLatestUnique$1$1 */
    public static final class C172761 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C172761(j, ref$ObjectRef2, lVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C172761) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
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
            T t = ref$ObjectRef2.element;
            if (t != null) {
                lVar.invoke(t);
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebounceUtils$throttleLatestUnique$1(Ref$ObjectRef<T> ref$ObjectRef, Ref$ObjectRef<C19699g1> ref$ObjectRef2, C19525d0 d0Var, long j, C19857l<? super T, C19394m> lVar) {
        super(1);
        this.$latestParam = ref$ObjectRef;
        this.$throttleJob = ref$ObjectRef2;
        this.$coroutineScope = d0Var;
        this.$intervalMs = j;
        this.$callback = lVar;
    }

    public final void invoke(T t) {
        if (!C19383o.m32792b(t, this.$latestParam.element)) {
            this.$latestParam.element = t;
            C19699g1 g1Var = (C19699g1) this.$throttleJob.element;
            boolean z = false;
            if (g1Var != null && !g1Var.mo72395f()) {
                z = true;
            }
            if (!z) {
                Ref$ObjectRef<C19699g1> ref$ObjectRef = this.$throttleJob;
                C19525d0 d0Var = this.$coroutineScope;
                final long j = this.$intervalMs;
                final Ref$ObjectRef<T> ref$ObjectRef2 = this.$latestParam;
                final C19857l<T, C19394m> lVar = this.$callback;
                ref$ObjectRef.element = C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C172761((C19340c<? super C172761>) null), 3);
            }
        }
    }
}
