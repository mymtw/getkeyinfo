package androidx.room;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19747k;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", mo70541f = "RoomDatabase.kt", mo70542l = {124}, mo70543m = "invokeSuspend")
final class RoomDatabaseKt$acquireTransactionThread$2$2$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19747k<C19341d> $continuation;
    public final /* synthetic */ C19699g1 $controlJob;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$acquireTransactionThread$2$2$1(C19747k<? super C19341d> kVar, C19699g1 g1Var, C19340c<? super RoomDatabaseKt$acquireTransactionThread$2$2$1> cVar) {
        super(2, cVar);
        this.$continuation = kVar;
        this.$controlJob = g1Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        RoomDatabaseKt$acquireTransactionThread$2$2$1 roomDatabaseKt$acquireTransactionThread$2$2$1 = new RoomDatabaseKt$acquireTransactionThread$2$2$1(this.$continuation, this.$controlJob, cVar);
        roomDatabaseKt$acquireTransactionThread$2$2$1.L$0 = obj;
        return roomDatabaseKt$acquireTransactionThread$2$2$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((RoomDatabaseKt$acquireTransactionThread$2$2$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19747k<C19341d> kVar = this.$continuation;
            CoroutineContext coroutineContext = ((C19525d0) this.L$0).getCoroutineContext();
            int i2 = C19341d.f43194b1;
            CoroutineContext.C19335a aVar = coroutineContext.get(C19341d.C19342a.f43195b);
            C19383o.m32794d(aVar);
            kVar.resumeWith(Result.m35480constructorimpl(aVar));
            C19699g1 g1Var = this.$controlJob;
            this.label = 1;
            if (g1Var.mo72394c0(this) == coroutineSingletons) {
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
