package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", mo70541f = "Recomposer.kt", mo70542l = {69, 71}, mo70543m = "invokeSuspend")
final class RecomposerKt$withRunningRecomposer$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {
    public final /* synthetic */ C19862q<C19525d0, Recomposer, C19340c<Object>, Object> $block;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", mo70541f = "Recomposer.kt", mo70542l = {68}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1 */
    public static final class C12871 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C12871(recomposer, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C12871) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                Recomposer recomposer = recomposer;
                this.label = 1;
                if (recomposer.mo5574E(this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecomposerKt$withRunningRecomposer$2(C19862q<? super C19525d0, ? super Recomposer, ? super C19340c<Object>, ? extends Object> qVar, C19340c<? super RecomposerKt$withRunningRecomposer$2> cVar) {
        super(2, cVar);
        this.$block = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, cVar);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
        return ((RecomposerKt$withRunningRecomposer$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        final Recomposer recomposer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            recomposer = new Recomposer(d0Var.getCoroutineContext());
            C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C12871((C19340c<? super C12871>) null), 3);
            C19862q<C19525d0, Recomposer, C19340c<Object>, Object> qVar = this.$block;
            this.L$0 = recomposer;
            this.label = 1;
            obj = qVar.invoke(d0Var, recomposer, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            recomposer = (Recomposer) this.L$0;
            C0761x.m1684O0(obj);
        } else if (i == 2) {
            Object obj2 = this.L$0;
            C0761x.m1684O0(obj);
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C19707i1 i1Var = recomposer.f2773b;
        i1Var.getClass();
        if (i1Var.mo72524n0(C19394m.f43287a)) {
            synchronized (recomposer.f2775d) {
                recomposer.f2787p = true;
            }
        }
        this.L$0 = obj;
        this.label = 2;
        return recomposer.mo5572B(this) == coroutineSingletons ? coroutineSingletons : obj;
    }
}
