package androidx.compose.material;

import androidx.compose.foundation.gestures.C0607e;
import androidx.compose.foundation.gestures.C0612j;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.pointer.C1652w;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class SliderKt$sliderTapModifier$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C0607e $draggableState;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1342k1<C19857l<Float, C19394m>> $gestureEndAction;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ boolean $isRtl;
    public final /* synthetic */ float $maxPx;
    public final /* synthetic */ C1338j0<Float> $pressOffset;
    public final /* synthetic */ C1342k1<Float> $rawOffset;

    @C19060c(mo70540c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", mo70541f = "Slider.kt", mo70542l = {882}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1 */
    public static final class C11271 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C11271 r0 = new C11271(z, f, j0Var, k1Var, d0Var, eVar, k1Var2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
            return ((C11271) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                final boolean z = z;
                final float f = f;
                final C1338j0<Float> j0Var = j0Var;
                final C1342k1<Float> k1Var = k1Var;
                C11281 r3 = new C19862q<C0612j, C8343c, C19340c<? super C19394m>, Object>((C19340c<? super C11281>) null) {
                    public /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    public int label;

                    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m34757invoked4ec7I((C0612j) obj, ((C8343c) obj2).f18299a, (C19340c) obj3);
                    }

                    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
                    public final Object m34757invoked4ec7I(C0612j jVar, long j, C19340c<? super C19394m> cVar) {
                        C11281 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SliderKt$sliderTapModifier$2(boolean z, C0607e eVar, C0640j jVar, float f, boolean z2, C1338j0<Float> j0Var, C1342k1<Float> k1Var, C1342k1<? extends C19857l<? super Float, C19394m>> k1Var2) {
                            super(3);
                            this.$enabled = z;
                            this.$draggableState = eVar;
                            this.$interactionSource = jVar;
                            this.$maxPx = f;
                            this.$isRtl = z2;
                            this.$pressOffset = j0Var;
                            this.$rawOffset = k1Var;
                            this.$gestureEndAction = k1Var2;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
                        }

                        public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
                            C19383o.m32797g(dVar, "$this$composed");
                            dVar2.mo5465u(1945228890);
                            if (this.$enabled) {
                                dVar2.mo5465u(773894976);
                                dVar2.mo5465u(-492369756);
                                Object v = dVar2.mo5467v();
                                if (v == C1302d.C1303a.f2828a) {
                                    C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar2));
                                    dVar2.mo5454o(mVar);
                                    v = mVar;
                                }
                                dVar2.mo5406H();
                                final C19525d0 d0Var = ((C1346m) v).f2939b;
                                dVar2.mo5406H();
                                Object[] objArr = {this.$draggableState, this.$interactionSource, Float.valueOf(this.$maxPx), Boolean.valueOf(this.$isRtl)};
                                final boolean z = this.$isRtl;
                                final float f = this.$maxPx;
                                final C1338j0<Float> j0Var = this.$pressOffset;
                                final C1342k1<Float> k1Var = this.$rawOffset;
                                final C0607e eVar = this.$draggableState;
                                final C1342k1<C19857l<Float, C19394m>> k1Var2 = this.$gestureEndAction;
                                dVar = SuspendingPointerInputFilterKt.m3485c(dVar, objArr, new C11271((C19340c<? super C11271>) null));
                            }
                            dVar2.mo5406H();
                            return dVar;
                        }
                    }
