package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0419d;
import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0428h;
import androidx.compose.animation.core.C0432j;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$LongRef;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", mo70541f = "TransformableState.kt", mo70542l = {182}, mo70543m = "invokeSuspend")
final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements C19861p<C0617o, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0422e<C8343c> $animationSpec;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Ref$LongRef $previous;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(Ref$LongRef ref$LongRef, long j, C0422e<C8343c> eVar, C19340c<? super TransformableStateKt$animatePanBy$2> cVar) {
        super(2, cVar);
        this.$previous = ref$LongRef;
        this.$offset = j;
        this.$animationSpec = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, cVar);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    public final Object invoke(C0617o oVar, C19340c<? super C19394m> cVar) {
        return ((TransformableStateKt$animatePanBy$2) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C0617o oVar = (C0617o) this.L$0;
            int i2 = C8343c.f18298e;
            C0424f fVar = new C0424f(VectorConvertersKt.f1081f, new C8343c(this.$previous.element), (C0432j) null, 60);
            C8343c cVar = new C8343c(this.$offset);
            C0422e<C8343c> eVar = this.$animationSpec;
            final Ref$LongRef ref$LongRef = this.$previous;
            C05961 r7 = new C19857l<C0419d<C8343c, C0428h>, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C0419d<C8343c, C0428h>) (C0419d) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(C0419d<C8343c, C0428h> dVar) {
                    C19383o.m32797g(dVar, "$this$animateTo");
                    C0617o.m1432a(oVar, 0.0f, C8343c.m16644e(dVar.mo3481b().f18299a, ref$LongRef.element), 0.0f, 5);
                    ref$LongRef.element = dVar.mo3481b().f18299a;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m1074e(fVar, cVar, eVar, false, r7, this, 4) == coroutineSingletons) {
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
