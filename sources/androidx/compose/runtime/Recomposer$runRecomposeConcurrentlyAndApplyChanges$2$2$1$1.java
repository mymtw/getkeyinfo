package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19747k;
import p219r.C7731c;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1", mo70541f = "Recomposer.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1349n $composition;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(Recomposer recomposer, C1349n nVar, C19340c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1> cVar) {
        super(2, cVar);
        this.this$0 = recomposer;
        this.$composition = nVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(this.this$0, this.$composition, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19747k<C19394m> z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C1349n u = Recomposer.m2545u(this.this$0, this.$composition, (C7731c) null);
            Recomposer recomposer = this.this$0;
            synchronized (recomposer.f2775d) {
                if (u != null) {
                    recomposer.f2781j.add(u);
                }
                recomposer.f2786o--;
                z = recomposer.mo5576z();
            }
            if (z != null) {
                z.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
