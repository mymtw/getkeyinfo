package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.C0426g;
import androidx.compose.foundation.gestures.C0606d;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.reflect.C19421p;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", mo70541f = "Swipeable.kt", mo70542l = {223}, mo70543m = "invokeSuspend")
public final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements C19861p<C0606d, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0422e<Float> $spec;
    public final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f, C0422e<Float> eVar, C19340c<? super SwipeableState$animateInternalToOffset$2> cVar) {
        super(2, cVar);
        this.this$0 = swipeableState;
        this.$target = f;
        this.$spec = eVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, cVar);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    public final Object invoke(C0606d dVar, C19340c<? super C19394m> cVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(dVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C0606d dVar = (C0606d) this.L$0;
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            ref$FloatRef.element = ((Number) this.this$0.f2284g.getValue()).floatValue();
            this.this$0.f2285h.setValue(new Float(this.$target));
            this.this$0.f2281d.setValue(Boolean.TRUE);
            Animatable m = C19421p.m32945m(ref$FloatRef.element);
            Float f = new Float(this.$target);
            C0422e<Float> eVar = this.$spec;
            C11511 r9 = new C19857l<Animatable<Float, C0426g>, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Animatable<Float, C0426g>) (Animatable) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(Animatable<Float, C0426g> animatable) {
                    C19383o.m32797g(animatable, "$this$animateTo");
                    dVar.mo3734a(animatable.mo3375e().floatValue() - ref$FloatRef.element);
                    ref$FloatRef.element = animatable.mo3375e().floatValue();
                }
            };
            this.label = 1;
            if (Animatable.m1065d(m, f, eVar, (Float) null, r9, this, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                this.this$0.f2285h.setValue(null);
                this.this$0.f2281d.setValue(Boolean.FALSE);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f2285h.setValue(null);
        this.this$0.f2281d.setValue(Boolean.FALSE);
        return C19394m.f43287a;
    }
}
