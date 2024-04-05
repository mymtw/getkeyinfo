package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0735g;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.C19525d0;
import p174m0.C7280a;
import p174m0.C7282b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;
import p764pq.C20052d;
import p764pq.C20053e;

final class SliderKt$Slider$3 extends Lambda implements C19862q<C0735g, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C1228r1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C19846a<C19394m> $onValueChangeFinished;
    public final /* synthetic */ C1342k1<C19857l<Float, C19394m>> $onValueChangeState;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $value;
    public final /* synthetic */ C20053e<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3(C20053e<Float> eVar, int i, float f, C0640j jVar, boolean z, List<Float> list, C1228r1 r1Var, C1342k1<? extends C19857l<? super Float, C19394m>> k1Var, C19846a<C19394m> aVar) {
        super(3);
        this.$valueRange = eVar;
        this.$$dirty = i;
        this.$value = f;
        this.$interactionSource = jVar;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = r1Var;
        this.$onValueChangeState = k1Var;
        this.$onValueChangeFinished = aVar;
    }

    /* renamed from: a */
    public static final float m2224a(Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, C20053e eVar, float f) {
        return SliderKt.m2220i(((Number) eVar.mo74309c()).floatValue(), ((Number) eVar.mo74311g()).floatValue(), f, ref$FloatRef.element, ref$FloatRef2.element);
    }

    public static final float access$invoke$scaleToUserValue(Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, C20053e eVar, float f) {
        return SliderKt.m2220i(ref$FloatRef.element, ref$FloatRef2.element, f, ((Number) eVar.mo74309c()).floatValue(), ((Number) eVar.mo74311g()).floatValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0735g) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C0735g gVar, C1302d dVar, int i) {
        int i2;
        C0735g gVar2 = gVar;
        C1302d dVar2 = dVar;
        C19383o.m32797g(gVar2, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (dVar2.mo5408I(gVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar.mo5442i()) {
            boolean z = false;
            if (dVar2.mo5410J(CompositionLocalsKt.f4025k) == LayoutDirection.Rtl) {
                z = true;
            }
            boolean z2 = z;
            float h = (float) C7280a.m13963h(gVar.mo4120b());
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
            float f = SliderKt.f2258a;
            ref$FloatRef.element = Math.max(h - bVar.mo3789B0(f), 0.0f);
            ref$FloatRef2.element = Math.min(bVar.mo3789B0(f), ref$FloatRef.element);
            dVar2.mo5465u(773894976);
            dVar2.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
            if (v == aVar) {
                C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar2));
                dVar2.mo5454o(mVar);
                v = mVar;
            }
            dVar.mo5406H();
            C19525d0 d0Var = ((C1346m) v).f2939b;
            dVar.mo5406H();
            float f2 = this.$value;
            C20053e<Float> eVar = this.$valueRange;
            dVar2.mo5465u(-492369756);
            Object v2 = dVar.mo5467v();
            if (v2 == aVar) {
                v2 = C0761x.m1751w0(Float.valueOf(m2224a(ref$FloatRef2, ref$FloatRef, eVar, f2)), C1351n1.f2948a);
                dVar2.mo5454o(v2);
            }
            dVar.mo5406H();
            C1338j0 j0Var = (C1338j0) v2;
            dVar2.mo5465u(-492369756);
            Object v3 = dVar.mo5467v();
            if (v3 == aVar) {
                v3 = C0761x.m1751w0(Float.valueOf(0.0f), C1351n1.f2948a);
                dVar2.mo5454o(v3);
            }
            dVar.mo5406H();
            C1338j0 j0Var2 = (C1338j0) v3;
            Float valueOf = Float.valueOf(ref$FloatRef2.element);
            Float valueOf2 = Float.valueOf(ref$FloatRef.element);
            C20053e<Float> eVar2 = this.$valueRange;
            C1342k1<C19857l<Float, C19394m>> k1Var = this.$onValueChangeState;
            dVar2.mo5465u(1618982084);
            boolean I = dVar2.mo5408I(valueOf) | dVar2.mo5408I(valueOf2) | dVar2.mo5408I(eVar2);
            Object v4 = dVar.mo5467v();
            if (I || v4 == aVar) {
                SliderKt$Slider$3$draggableState$1$1 sliderKt$Slider$3$draggableState$1$1 = r1;
                SliderKt$Slider$3$draggableState$1$1 sliderKt$Slider$3$draggableState$1$12 = new SliderKt$Slider$3$draggableState$1$1(j0Var, j0Var2, ref$FloatRef2, ref$FloatRef, k1Var, eVar2);
                SliderDraggableState sliderDraggableState = new SliderDraggableState(sliderKt$Slider$3$draggableState$1$1);
                dVar2.mo5454o(sliderDraggableState);
                v4 = sliderDraggableState;
            }
            dVar.mo5406H();
            SliderDraggableState sliderDraggableState2 = (SliderDraggableState) v4;
            final C20053e<Float> eVar3 = this.$valueRange;
            C11172 r1 = new C19857l<Float, Float>() {
                public final Float invoke(float f) {
                    return Float.valueOf(SliderKt$Slider$3.m2224a(ref$FloatRef2, ref$FloatRef, eVar3, f));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).floatValue());
                }
            };
            C20053e<Float> eVar4 = this.$valueRange;
            C20052d dVar3 = new C20052d(ref$FloatRef2.element, ref$FloatRef.element);
            float f3 = this.$value;
            int i3 = this.$$dirty;
            SliderKt.m2214c(r1, eVar4, dVar3, j0Var, f3, dVar, ((i3 >> 9) & 112) | 3072 | ((i3 << 12) & 57344));
            C1338j0 E0 = C0761x.m1664E0(new SliderKt$Slider$3$gestureEndAction$1(j0Var, this.$tickFractions, ref$FloatRef2, ref$FloatRef, d0Var, sliderDraggableState2, this.$onValueChangeFinished), dVar2);
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            SliderDraggableState sliderDraggableState3 = sliderDraggableState2;
            C1302d.C1303a.C1304a aVar3 = aVar;
            C0640j jVar = this.$interactionSource;
            Ref$FloatRef ref$FloatRef3 = ref$FloatRef2;
            Ref$FloatRef ref$FloatRef4 = ref$FloatRef;
            C1436d a = ComposedModifierKt.m3049a(aVar2, InspectableValueKt.f4032a, new SliderKt$sliderTapModifier$2(this.$enabled, sliderDraggableState2, jVar, h, z2, j0Var2, j0Var, E0));
            Orientation orientation = Orientation.Horizontal;
            boolean booleanValue = ((Boolean) sliderDraggableState3.f2254b.getValue()).booleanValue();
            boolean z3 = this.$enabled;
            C0640j jVar2 = this.$interactionSource;
            dVar2.mo5465u(1157296644);
            boolean I2 = dVar2.mo5408I(E0);
            Object v5 = dVar.mo5467v();
            if (I2 || v5 == aVar3) {
                v5 = new SliderKt$Slider$3$drag$1$1(E0, (C19340c<? super SliderKt$Slider$3$drag$1$1>) null);
                dVar2.mo5454o(v5);
            }
            dVar.mo5406H();
            C1436d d = DraggableKt.m1376d(sliderDraggableState3, orientation, z3, jVar2, booleanValue, (C19862q) v5, z2);
            float h2 = SliderKt.m2219h(this.$valueRange.mo74309c().floatValue(), this.$valueRange.mo74311g().floatValue(), C19388s.m32831L(this.$value, this.$valueRange.mo74309c().floatValue(), this.$valueRange.mo74311g().floatValue()));
            boolean z4 = this.$enabled;
            List<Float> list = this.$tickFractions;
            C1228r1 r1Var = this.$colors;
            float f4 = ref$FloatRef4.element - ref$FloatRef3.element;
            C0640j jVar3 = this.$interactionSource;
            C1436d i0 = a.mo6148i0(d);
            int i4 = this.$$dirty;
            SliderKt.m2216e(z4, h2, list, r1Var, f4, jVar3, i0, dVar, ((i4 >> 9) & 14) | RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN | ((i4 >> 15) & 7168) | ((i4 >> 6) & 458752));
            return;
        }
        dVar.mo5396C();
    }
}
