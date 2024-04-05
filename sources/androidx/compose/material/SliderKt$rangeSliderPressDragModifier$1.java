package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", mo70541f = "Slider.kt", mo70542l = {955}, mo70543m = "invokeSuspend")
final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0640j $endInteractionSource;
    public final /* synthetic */ C1342k1<C19857l<Boolean, C19394m>> $gestureEndAction;
    public final /* synthetic */ boolean $isRtl;
    public final /* synthetic */ float $maxPx;
    public final /* synthetic */ C1342k1<C19861p<Boolean, Float, C19394m>> $onDrag;
    public final /* synthetic */ C1342k1<Float> $rawOffsetEnd;
    public final /* synthetic */ C1342k1<Float> $rawOffsetStart;
    public final /* synthetic */ C0640j $startInteractionSource;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", mo70541f = "Slider.kt", mo70542l = {956}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1 */
    public static final class C11211 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C11211 r0 = new C11211(wVar, z, f, l1Var2, k1Var, k1Var2, k1Var3, k1Var4, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C11211) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final C19525d0 d0Var = (C19525d0) this.L$0;
                C1652w wVar = wVar;
                final boolean z = z;
                final float f = f;
                final C1210l1 l1Var = l1Var2;
                final C1342k1<Float> k1Var = k1Var;
                final C1342k1<C19857l<Boolean, C19394m>> k1Var2 = k1Var2;
                final C1342k1<Float> k1Var3 = k1Var3;
                final C1342k1<C19861p<Boolean, Float, C19394m>> k1Var4 = k1Var4;
                C11221 r3 = new C19861p<C1652w, C19340c<? super C19394m>, Object>((C19340c<? super C11221>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        C11221 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SliderKt$rangeSliderPressDragModifier$1(C0640j jVar, C0640j jVar2, C1342k1<Float> k1Var, C1342k1<Float> k1Var2, C1342k1<? extends C19861p<? super Boolean, ? super Float, C19394m>> k1Var3, boolean z, float f, C1342k1<? extends C19857l<? super Boolean, C19394m>> k1Var4, C19340c<? super SliderKt$rangeSliderPressDragModifier$1> cVar) {
                            super(2, cVar);
                            this.$startInteractionSource = jVar;
                            this.$endInteractionSource = jVar2;
                            this.$rawOffsetStart = k1Var;
                            this.$rawOffsetEnd = k1Var2;
                            this.$onDrag = k1Var3;
                            this.$isRtl = z;
                            this.$maxPx = f;
                            this.$gestureEndAction = k1Var4;
                        }

                        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                            SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, cVar);
                            sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
                            return sliderKt$rangeSliderPressDragModifier$1;
                        }

                        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
                            return ((SliderKt$rangeSliderPressDragModifier$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C0761x.m1684O0(obj);
                                final C1652w wVar = (C1652w) this.L$0;
                                C1210l1 l1Var = new C1210l1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag);
                                final boolean z = this.$isRtl;
                                final float f = this.$maxPx;
                                final C1342k1<Float> k1Var = this.$rawOffsetStart;
                                final C1342k1<C19857l<Boolean, C19394m>> k1Var2 = this.$gestureEndAction;
                                final C1342k1<Float> k1Var3 = this.$rawOffsetEnd;
                                final C1342k1<C19861p<Boolean, Float, C19394m>> k1Var4 = this.$onDrag;
                                final C1210l1 l1Var2 = l1Var;
                                C11211 r3 = new C11211((C19340c<? super C11211>) null);
                                this.label = 1;
                                if (C19697g.m33466d(r3, this) == coroutineSingletons) {
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
