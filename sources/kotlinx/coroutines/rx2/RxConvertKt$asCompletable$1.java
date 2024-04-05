package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19699g1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxConvertKt$asCompletable$1", mo70541f = "RxConvert.kt", mo70542l = {30}, mo70543m = "invokeSuspend")
final class RxConvertKt$asCompletable$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19699g1 $this_asCompletable;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asCompletable$1(C19699g1 g1Var, C19340c<? super RxConvertKt$asCompletable$1> cVar) {
        super(2, cVar);
        this.$this_asCompletable = g1Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new RxConvertKt$asCompletable$1(this.$this_asCompletable, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((RxConvertKt$asCompletable$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19699g1 g1Var = this.$this_asCompletable;
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
