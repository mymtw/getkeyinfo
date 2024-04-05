package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0422e;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", mo70541f = "ScrollExtensions.kt", mo70542l = {41}, mo70543m = "invokeSuspend")
public final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements C19861p<C0614l, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ Ref$FloatRef $previousValue;
    public final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f, C0422e<Float> eVar, Ref$FloatRef ref$FloatRef, C19340c<? super ScrollExtensionsKt$animateScrollBy$2> cVar) {
        super(2, cVar);
        this.$value = f;
        this.$animationSpec = eVar;
        this.$previousValue = ref$FloatRef;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, cVar);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    public final Object invoke(C0614l lVar, C19340c<? super C19394m> cVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(lVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C0614l lVar = (C0614l) this.L$0;
            float f = this.$value;
            C0422e<Float> eVar = this.$animationSpec;
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            C05791 r4 = new C19861p<Float, Float, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C19394m.f43287a;
                }

                public final void invoke(float f, float f2) {
                    Ref$FloatRef ref$FloatRef = ref$FloatRef;
                    float f3 = ref$FloatRef.element;
                    ref$FloatRef.element = lVar.mo3737a(f - f3) + f3;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m1071b(f, eVar, r4, this) == coroutineSingletons) {
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
