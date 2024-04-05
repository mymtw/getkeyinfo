package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", mo70541f = "TransformableState.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class TransformableStateKt$stopTransformation$2 extends SuspendLambda implements C19861p<C0617o, C19340c<? super C19394m>, Object> {
    public int label;

    public TransformableStateKt$stopTransformation$2(C19340c<? super TransformableStateKt$stopTransformation$2> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new TransformableStateKt$stopTransformation$2(cVar);
    }

    public final Object invoke(C0617o oVar, C19340c<? super C19394m> cVar) {
        return ((TransformableStateKt$stopTransformation$2) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
