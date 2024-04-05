package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1", mo70541f = "Transformable.kt", mo70542l = {71}, mo70543m = "invokeSuspend")
public final class TransformableKt$transformable$2$block$1$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1342k1<Boolean> $updatePanZoomLock;
    public final /* synthetic */ C1342k1<C0619q> $updatedState;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1", mo70541f = "Transformable.kt", mo70542l = {72}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1 */
    public static final class C05951 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C05951 r0 = new C05951(k1Var, k1Var2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
            return ((C05951) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C1342k1<Boolean> k1Var = k1Var;
                C1342k1<C0619q> k1Var2 = k1Var2;
                this.label = 1;
                if (C0618p.m1435b((C1652w) this.L$0, k1Var, k1Var2, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$2$block$1$1(C1342k1<Boolean> k1Var, C1342k1<? extends C0619q> k1Var2, C19340c<? super TransformableKt$transformable$2$block$1$1> cVar) {
        super(2, cVar);
        this.$updatePanZoomLock = k1Var;
        this.$updatedState = k1Var2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TransformableKt$transformable$2$block$1$1 transformableKt$transformable$2$block$1$1 = new TransformableKt$transformable$2$block$1$1(this.$updatePanZoomLock, this.$updatedState, cVar);
        transformableKt$transformable$2$block$1$1.L$0 = obj;
        return transformableKt$transformable$2$block$1$1;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((TransformableKt$transformable$2$block$1$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C1342k1<Boolean> k1Var = this.$updatePanZoomLock;
            final C1342k1<C0619q> k1Var2 = this.$updatedState;
            C05951 r1 = new C05951((C19340c<? super C05951>) null);
            this.label = 1;
            if (ForEachGestureKt.m1378b((C1652w) this.L$0, r1, this) == coroutineSingletons) {
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
