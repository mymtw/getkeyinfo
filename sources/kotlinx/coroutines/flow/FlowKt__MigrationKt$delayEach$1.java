package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", mo70541f = "Migration.kt", mo70542l = {427}, mo70543m = "invokeSuspend")
final class FlowKt__MigrationKt$delayEach$1 extends SuspendLambda implements C19861p<Object, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $timeMillis;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$delayEach$1(long j, C19340c<? super FlowKt__MigrationKt$delayEach$1> cVar) {
        super(2, cVar);
        this.$timeMillis = j;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new FlowKt__MigrationKt$delayEach$1(this.$timeMillis, cVar);
    }

    public final Object invoke(Object obj, C19340c<? super C19394m> cVar) {
        return ((FlowKt__MigrationKt$delayEach$1) create(obj, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            long j = this.$timeMillis;
            this.label = 1;
            if (C18263b.m30814I(j, this) == coroutineSingletons) {
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
