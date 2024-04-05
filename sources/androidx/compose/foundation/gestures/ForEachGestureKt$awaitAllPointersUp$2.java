package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", mo70541f = "ForEachGesture.kt", mo70542l = {70}, mo70543m = "invokeSuspend")
final class ForEachGestureKt$awaitAllPointersUp$2 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public int label;

    public ForEachGestureKt$awaitAllPointersUp$2(C19340c<? super ForEachGestureKt$awaitAllPointersUp$2> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(cVar);
        forEachGestureKt$awaitAllPointersUp$2.L$0 = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.label = 1;
            if (ForEachGestureKt.m1377a((C1631c) this.L$0, this) == coroutineSingletons) {
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
