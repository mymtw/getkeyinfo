package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5", mo70541f = "ProduceState.kt", mo70542l = {222}, mo70543m = "invokeSuspend")
final class SnapshotStateKt__ProduceStateKt$produceState$5 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C1357q0<Object>, C19340c<? super C19394m>, Object> $producer;
    public final /* synthetic */ C1338j0<Object> $result;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$5(C19861p<? super C1357q0<Object>, ? super C19340c<? super C19394m>, ? extends Object> pVar, C1338j0<Object> j0Var, C19340c<? super SnapshotStateKt__ProduceStateKt$produceState$5> cVar) {
        super(2, cVar);
        this.$producer = pVar;
        this.$result = j0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SnapshotStateKt__ProduceStateKt$produceState$5 snapshotStateKt__ProduceStateKt$produceState$5 = new SnapshotStateKt__ProduceStateKt$produceState$5(this.$producer, this.$result, cVar);
        snapshotStateKt__ProduceStateKt$produceState$5.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$5;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$5) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19861p<C1357q0<Object>, C19340c<? super C19394m>, Object> pVar = this.$producer;
            C1359r0 r0Var = new C1359r0(this.$result, ((C19525d0) this.L$0).getCoroutineContext());
            this.label = 1;
            if (pVar.invoke(r0Var, this) == coroutineSingletons) {
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
