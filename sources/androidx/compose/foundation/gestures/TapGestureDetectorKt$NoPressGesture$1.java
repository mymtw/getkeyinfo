package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", mo70541f = "TapGestureDetector.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object> {
    public int label;

    public TapGestureDetectorKt$NoPressGesture$1(C19340c<? super TapGestureDetectorKt$NoPressGesture$1> cVar) {
        super(3, cVar);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m34679invoked4ec7I((C0612j) obj, ((C8343c) obj2).f18299a, (C19340c) obj3);
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final Object m34679invoked4ec7I(C0612j jVar, long j, C19340c<? super C19394m> cVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(cVar).invokeSuspend(C19394m.f43287a);
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
