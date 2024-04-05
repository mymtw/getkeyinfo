package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", mo70541f = "Draggable.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class DraggableKt$draggable$7 extends SuspendLambda implements C19862q<C19525d0, Float, C19340c<? super C19394m>, Object> {
    public int label;

    public DraggableKt$draggable$7(C19340c<? super DraggableKt$draggable$7> cVar) {
        super(3, cVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C19525d0) obj, ((Number) obj2).floatValue(), (C19340c<? super C19394m>) (C19340c) obj3);
    }

    public final Object invoke(C19525d0 d0Var, float f, C19340c<? super C19394m> cVar) {
        return new DraggableKt$draggable$7(cVar).invokeSuspend(C19394m.f43287a);
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
