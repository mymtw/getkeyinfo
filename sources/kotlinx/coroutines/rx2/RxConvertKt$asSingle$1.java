package kotlinx.coroutines.rx2;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19703h0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.rx2.RxConvertKt$asSingle$1", mo70541f = "RxConvert.kt", mo70542l = {62}, mo70543m = "invokeSuspend")
final class RxConvertKt$asSingle$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {
    public final /* synthetic */ C19703h0<Object> $this_asSingle;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RxConvertKt$asSingle$1(C19703h0<Object> h0Var, C19340c<? super RxConvertKt$asSingle$1> cVar) {
        super(2, cVar);
        this.$this_asSingle = h0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new RxConvertKt$asSingle$1(this.$this_asSingle, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
        return ((RxConvertKt$asSingle$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19703h0<Object> h0Var = this.$this_asSingle;
            this.label = 1;
            obj = h0Var.mo72405n(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
