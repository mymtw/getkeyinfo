package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", mo70541f = "ScrollableState.kt", mo70542l = {147}, mo70543m = "invokeSuspend")
public final class DefaultScrollableState$scroll$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C0614l, C19340c<? super C19394m>, Object> $block;
    public final /* synthetic */ MutatePriority $scrollPriority;
    public int label;
    public final /* synthetic */ DefaultScrollableState this$0;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", mo70541f = "ScrollableState.kt", mo70542l = {150}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1 */
    public static final class C05601 extends SuspendLambda implements C19861p<C0614l, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05601 r0 = new C05601(defaultScrollableState, pVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C0614l lVar, C19340c<? super C19394m> cVar) {
            return ((C05601) create(lVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C0614l lVar = (C0614l) this.L$0;
                defaultScrollableState.f1323d.setValue(Boolean.TRUE);
                C19861p<C0614l, C19340c<? super C19394m>, Object> pVar = pVar;
                this.label = 1;
                if (pVar.invoke(lVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                try {
                    C0761x.m1684O0(obj);
                } catch (Throwable th) {
                    defaultScrollableState.f1323d.setValue(Boolean.FALSE);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultScrollableState.f1323d.setValue(Boolean.FALSE);
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, C19861p<? super C0614l, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super DefaultScrollableState$scroll$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultScrollableState;
        this.$scrollPriority = mutatePriority;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DefaultScrollableState$scroll$2(this.this$0, this.$scrollPriority, this.$block, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DefaultScrollableState$scroll$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final DefaultScrollableState defaultScrollableState = this.this$0;
            MutatorMutex mutatorMutex = defaultScrollableState.f1322c;
            DefaultScrollableState.C0559a aVar = defaultScrollableState.f1321b;
            MutatePriority mutatePriority = this.$scrollPriority;
            final C19861p<C0614l, C19340c<? super C19394m>, Object> pVar = this.$block;
            C05601 r5 = new C05601((C19340c<? super C05601>) null);
            this.label = 1;
            if (mutatorMutex.mo3680b(aVar, mutatePriority, r5, this) == coroutineSingletons) {
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
