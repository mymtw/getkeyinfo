package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", mo70541f = "TransformableState.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class TransformableStateKt$rotateBy$2 extends SuspendLambda implements C19861p<C0617o, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ float $degrees;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$rotateBy$2(float f, C19340c<? super TransformableStateKt$rotateBy$2> cVar) {
        super(2, cVar);
        this.$degrees = f;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TransformableStateKt$rotateBy$2 transformableStateKt$rotateBy$2 = new TransformableStateKt$rotateBy$2(this.$degrees, cVar);
        transformableStateKt$rotateBy$2.L$0 = obj;
        return transformableStateKt$rotateBy$2;
    }

    public final Object invoke(C0617o oVar, C19340c<? super C19394m> cVar) {
        return ((TransformableStateKt$rotateBy$2) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            int i = C8343c.f18298e;
            ((C0617o) this.L$0).mo3862b();
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
