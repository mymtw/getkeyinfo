package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0426g;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20052d;
import p764pq.C20053e;

public final class SliderKt$RangeSlider$2$gestureEndAction$1 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ Ref$FloatRef $maxPx;
    public final /* synthetic */ Ref$FloatRef $minPx;
    public final /* synthetic */ C19846a<C19394m> $onValueChangeFinished;
    public final /* synthetic */ C1342k1<C19857l<C20053e<Float>, C19394m>> $onValueChangeState;
    public final /* synthetic */ C1338j0<Float> $rawOffsetEnd;
    public final /* synthetic */ C1338j0<Float> $rawOffsetStart;
    public final /* synthetic */ C19525d0 $scope;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ C20053e<Float> $valueRange;

    @C19060c(mo70540c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", mo70541f = "Slider.kt", mo70542l = {352}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1 */
    public static final class C11151 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C11151(floatValue, g, aVar2, z2, j0Var, j0Var2, k1Var, ref$FloatRef, ref$FloatRef2, eVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C11151) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                Animatable m = C19421p.m32945m(floatValue);
                Float f = new Float(g);
                C0433j0<Float> j0Var = SliderKt.f2264g;
                Float f2 = new Float(0.0f);
                final boolean z = z2;
                final C1338j0<Float> j0Var2 = j0Var;
                final C1338j0<Float> j0Var3 = j0Var2;
                final C1342k1<C19857l<C20053e<Float>, C19394m>> k1Var = k1Var;
                final Ref$FloatRef ref$FloatRef = ref$FloatRef;
                final Ref$FloatRef ref$FloatRef2 = ref$FloatRef2;
                final C20053e<Float> eVar = eVar;
                C11161 r8 = new C19857l<Animatable<Float, C0426g>, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Animatable<Float, C0426g>) (Animatable) obj);
                        return C19394m.f43287a;
                    }

                    public final void invoke(Animatable<Float, C0426g> animatable) {
                        C19383o.m32797g(animatable, "$this$animateTo");
                        (z ? j0Var2 : j0Var3).setValue(animatable.mo3375e());
                        k1Var.getValue().invoke(SliderKt$RangeSlider$2.access$invoke$scaleToUserValue(ref$FloatRef, ref$FloatRef2, eVar, new C20052d(j0Var2.getValue().floatValue(), j0Var3.getValue().floatValue())));
                    }
                };
                this.label = 1;
                if (m.mo3374c(f, j0Var, f2, r8, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C19846a<C19394m> aVar = aVar2;
            if (aVar != null) {
                aVar.invoke();
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$gestureEndAction$1(C1338j0<Float> j0Var, C1338j0<Float> j0Var2, List<Float> list, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, C19846a<C19394m> aVar, C19525d0 d0Var, C1342k1<? extends C19857l<? super C20053e<Float>, C19394m>> k1Var, C20053e<Float> eVar) {
        super(1);
        this.$rawOffsetStart = j0Var;
        this.$rawOffsetEnd = j0Var2;
        this.$tickFractions = list;
        this.$minPx = ref$FloatRef;
        this.$maxPx = ref$FloatRef2;
        this.$onValueChangeFinished = aVar;
        this.$scope = d0Var;
        this.$onValueChangeState = k1Var;
        this.$valueRange = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        final float floatValue = (z ? this.$rawOffsetStart : this.$rawOffsetEnd).getValue().floatValue();
        final float g = SliderKt.m2218g(floatValue, this.$tickFractions, this.$minPx.element, this.$maxPx.element);
        if (floatValue == g) {
            C19846a<C19394m> aVar = this.$onValueChangeFinished;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        C19525d0 d0Var = this.$scope;
        final C19846a<C19394m> aVar2 = this.$onValueChangeFinished;
        final C1338j0<Float> j0Var = this.$rawOffsetStart;
        final C1338j0<Float> j0Var2 = this.$rawOffsetEnd;
        final C1342k1<C19857l<C20053e<Float>, C19394m>> k1Var = this.$onValueChangeState;
        final Ref$FloatRef ref$FloatRef = this.$minPx;
        final Ref$FloatRef ref$FloatRef2 = this.$maxPx;
        final C20053e<Float> eVar = this.$valueRange;
        final boolean z2 = z;
        C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C11151((C19340c<? super C11151>) null), 3);
    }
}
