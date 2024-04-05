package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0735g;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19862q;
import p764pq.C20052d;
import p764pq.C20053e;

final class SliderKt$RangeSlider$2 extends Lambda implements C19862q<C0735g, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C1228r1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $endInteractionSource;
    public final /* synthetic */ C19846a<C19394m> $onValueChangeFinished;
    public final /* synthetic */ C1342k1<C19857l<C20053e<Float>, C19394m>> $onValueChangeState;
    public final /* synthetic */ C0640j $startInteractionSource;
    public final /* synthetic */ int $steps;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ C20053e<Float> $valueRange;
    public final /* synthetic */ C20053e<Float> $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2(C20053e<Float> eVar, C20053e<Float> eVar2, int i, C1342k1<? extends C19857l<? super C20053e<Float>, C19394m>> k1Var, C0640j jVar, C0640j jVar2, boolean z, List<Float> list, int i2, C1228r1 r1Var, C19846a<C19394m> aVar) {
        super(3);
        this.$valueRange = eVar;
        this.$values = eVar2;
        this.$$dirty = i;
        this.$onValueChangeState = k1Var;
        this.$startInteractionSource = jVar;
        this.$endInteractionSource = jVar2;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$steps = i2;
        this.$colors = r1Var;
        this.$onValueChangeFinished = aVar;
    }

    /* renamed from: a */
    public static final float m2223a(Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, C20053e eVar, float f) {
        return SliderKt.m2220i(((Number) eVar.mo74309c()).floatValue(), ((Number) eVar.mo74311g()).floatValue(), f, ref$FloatRef.element, ref$FloatRef2.element);
    }

    public static final C20053e access$invoke$scaleToUserValue(Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, C20053e eVar, C20053e eVar2) {
        float f = ref$FloatRef.element;
        float f2 = ref$FloatRef2.element;
        float floatValue = ((Number) eVar.mo74309c()).floatValue();
        float floatValue2 = ((Number) eVar.mo74311g()).floatValue();
        float f3 = SliderKt.f2258a;
        return new C20052d(SliderKt.m2220i(f, f2, ((Number) eVar2.mo74309c()).floatValue(), floatValue, floatValue2), SliderKt.m2220i(f, f2, ((Number) eVar2.mo74311g()).floatValue(), floatValue, floatValue2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C0735g) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01c7, code lost:
        if (r2 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x01c9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.foundation.layout.C0735g r31, androidx.compose.runtime.C1302d r32, int r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r12 = r32
            java.lang.String r2 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r2 = r33 & 14
            if (r2 != 0) goto L_0x001b
            boolean r2 = r12.mo5408I(r1)
            if (r2 == 0) goto L_0x0017
            r2 = 4
            goto L_0x0018
        L_0x0017:
            r2 = 2
        L_0x0018:
            r2 = r33 | r2
            goto L_0x001d
        L_0x001b:
            r2 = r33
        L_0x001d:
            r2 = r2 & 91
            r3 = 18
            if (r2 != r3) goto L_0x002f
            boolean r2 = r32.mo5442i()
            if (r2 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r32.mo5396C()
            goto L_0x038d
        L_0x002f:
            androidx.compose.runtime.l1 r2 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r2 = r12.mo5410J(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.p015ui.unit.LayoutDirection.Rtl
            r10 = 0
            r11 = 1
            if (r2 != r3) goto L_0x003e
            r19 = r11
            goto L_0x0040
        L_0x003e:
            r19 = r10
        L_0x0040:
            long r1 = r31.mo4120b()
            int r1 = p174m0.C7280a.m13963h(r1)
            float r15 = (float) r1
            kotlin.jvm.internal.Ref$FloatRef r14 = new kotlin.jvm.internal.Ref$FloatRef
            r14.<init>()
            kotlin.jvm.internal.Ref$FloatRef r13 = new kotlin.jvm.internal.Ref$FloatRef
            r13.<init>()
            androidx.compose.runtime.l1 r1 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r1 = r12.mo5410J(r1)
            m0.b r1 = (p174m0.C7282b) r1
            float r2 = androidx.compose.material.SliderKt.f2258a
            float r3 = r1.mo3789B0(r2)
            float r3 = r15 - r3
            r14.element = r3
            float r1 = r1.mo3789B0(r2)
            r13.element = r1
            kotlin.m r1 = kotlin.C19394m.f43287a
            pq.e<java.lang.Float> r1 = r0.$values
            pq.e<java.lang.Float> r2 = r0.$valueRange
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo5465u(r7)
            java.lang.Object r3 = r32.mo5467v()
            androidx.compose.runtime.d$a$a r6 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r6) goto L_0x0098
            java.lang.Comparable r1 = r1.mo74309c()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = m2223a(r13, r14, r2, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = androidx.compose.foundation.layout.C0761x.m1751w0(r1, androidx.compose.runtime.C1351n1.f2948a)
            r12.mo5454o(r3)
        L_0x0098:
            r32.mo5406H()
            r16 = r3
            androidx.compose.runtime.j0 r16 = (androidx.compose.runtime.C1338j0) r16
            pq.e<java.lang.Float> r1 = r0.$values
            pq.e<java.lang.Float> r2 = r0.$valueRange
            r12.mo5465u(r7)
            java.lang.Object r3 = r32.mo5467v()
            if (r3 != r6) goto L_0x00c5
            java.lang.Comparable r1 = r1.mo74311g()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = m2223a(r13, r14, r2, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = androidx.compose.foundation.layout.C0761x.m1751w0(r1, androidx.compose.runtime.C1351n1.f2948a)
            r12.mo5454o(r3)
        L_0x00c5:
            r32.mo5406H()
            r17 = r3
            androidx.compose.runtime.j0 r17 = (androidx.compose.runtime.C1338j0) r17
            androidx.compose.material.SliderKt$RangeSlider$2$2 r1 = new androidx.compose.material.SliderKt$RangeSlider$2$2
            pq.e<java.lang.Float> r2 = r0.$valueRange
            r1.<init>(r2, r13, r14)
            pq.e<java.lang.Float> r2 = r0.$valueRange
            float r3 = r13.element
            float r4 = r14.element
            pq.d r5 = new pq.d
            r5.<init>(r3, r4)
            pq.e<java.lang.Float> r3 = r0.$values
            java.lang.Comparable r3 = r3.mo74309c()
            java.lang.Number r3 = (java.lang.Number) r3
            float r18 = r3.floatValue()
            int r3 = r0.$$dirty
            int r3 = r3 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = r3 | 3072(0xc00, float:4.305E-42)
            r3 = r5
            r20 = r4
            r4 = r16
            r5 = r18
            r8 = r6
            r6 = r32
            r9 = r7
            r7 = r20
            androidx.compose.material.SliderKt.m2214c(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.material.SliderKt$RangeSlider$2$3 r1 = new androidx.compose.material.SliderKt$RangeSlider$2$3
            pq.e<java.lang.Float> r2 = r0.$valueRange
            r1.<init>(r2, r13, r14)
            pq.e<java.lang.Float> r2 = r0.$valueRange
            float r3 = r13.element
            float r4 = r14.element
            pq.d r5 = new pq.d
            r5.<init>(r3, r4)
            pq.e<java.lang.Float> r3 = r0.$values
            java.lang.Comparable r3 = r3.mo74311g()
            java.lang.Number r3 = (java.lang.Number) r3
            float r6 = r3.floatValue()
            int r3 = r0.$$dirty
            int r3 = r3 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r7 = r3 | 3072(0xc00, float:4.305E-42)
            r3 = r5
            r4 = r17
            r5 = r6
            r6 = r32
            androidx.compose.material.SliderKt.m2214c(r1, r2, r3, r4, r5, r6, r7)
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r12.mo5465u(r1)
            r12.mo5465u(r9)
            java.lang.Object r1 = r32.mo5467v()
            if (r1 != r8) goto L_0x014f
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.internal.f r1 = androidx.compose.runtime.C1415u.m3034h(r1, r12)
            androidx.compose.runtime.m r2 = new androidx.compose.runtime.m
            r2.<init>(r1)
            r12.mo5454o(r2)
            r1 = r2
        L_0x014f:
            r32.mo5406H()
            androidx.compose.runtime.m r1 = (androidx.compose.runtime.C1346m) r1
            kotlinx.coroutines.d0 r1 = r1.f2939b
            r32.mo5406H()
            androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1 r2 = new androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1
            java.util.List<java.lang.Float> r3 = r0.$tickFractions
            kq.a<kotlin.m> r4 = r0.$onValueChangeFinished
            androidx.compose.runtime.k1<kq.l<pq.e<java.lang.Float>, kotlin.m>> r5 = r0.$onValueChangeState
            pq.e<java.lang.Float> r6 = r0.$valueRange
            r20 = r2
            r21 = r16
            r22 = r17
            r23 = r3
            r24 = r13
            r25 = r14
            r26 = r4
            r27 = r1
            r28 = r5
            r29 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.runtime.j0 r1 = androidx.compose.foundation.layout.C0761x.m1664E0(r2, r12)
            r2 = 7
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r16
            r3[r11] = r17
            pq.e<java.lang.Float> r4 = r0.$valueRange
            r5 = 2
            r3[r5] = r4
            float r4 = r13.element
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            float r4 = r14.element
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r6 = 4
            r3[r6] = r4
            pq.e<java.lang.Float> r4 = r0.$values
            r6 = 5
            r3[r6] = r4
            r7 = 6
            androidx.compose.runtime.k1<kq.l<pq.e<java.lang.Float>, kotlin.m>> r8 = r0.$onValueChangeState
            r3[r7] = r8
            pq.e<java.lang.Float> r7 = r0.$valueRange
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r12.mo5465u(r9)
            r9 = r10
            r20 = r9
        L_0x01b1:
            if (r9 >= r2) goto L_0x01bf
            r2 = r3[r9]
            boolean r2 = r12.mo5408I(r2)
            r20 = r20 | r2
            int r9 = r9 + 1
            r2 = 7
            goto L_0x01b1
        L_0x01bf:
            java.lang.Object r2 = r32.mo5467v()
            if (r20 != 0) goto L_0x01c9
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x01e1
        L_0x01c9:
            androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1 r2 = new androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
            r20 = r2
            r21 = r16
            r22 = r17
            r23 = r4
            r24 = r13
            r25 = r14
            r26 = r8
            r27 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r12.mo5454o(r2)
        L_0x01e1:
            r32.mo5406H()
            androidx.compose.runtime.j0 r2 = androidx.compose.foundation.layout.C0761x.m1664E0(r2, r12)
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.foundation.interaction.j r4 = r0.$startInteractionSource
            androidx.compose.foundation.interaction.j r7 = r0.$endInteractionSource
            boolean r8 = r0.$enabled
            pq.e<java.lang.Float> r9 = r0.$valueRange
            if (r8 == 0) goto L_0x0223
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r10] = r4
            r6[r11] = r7
            java.lang.Float r8 = java.lang.Float.valueOf(r15)
            r10 = 2
            r6[r10] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r19)
            r6[r5] = r8
            r5 = 4
            r6[r5] = r9
            androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1 r5 = new androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1
            r22 = 0
            r8 = r13
            r13 = r5
            r9 = r14
            r14 = r4
            r4 = r15
            r15 = r7
            r18 = r2
            r20 = r4
            r21 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.ui.d r1 = androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt.m3485c(r3, r6, r5)
            r10 = r1
            goto L_0x0226
        L_0x0223:
            r8 = r13
            r9 = r14
            r10 = r3
        L_0x0226:
            pq.e<java.lang.Float> r1 = r0.$values
            java.lang.Comparable r1 = r1.mo74309c()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            pq.e<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.mo74309c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            pq.e<java.lang.Float> r4 = r0.$values
            java.lang.Comparable r4 = r4.mo74311g()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r1 = kotlin.jvm.internal.C19388s.m32831L(r1, r2, r4)
            pq.e<java.lang.Float> r2 = r0.$values
            java.lang.Comparable r2 = r2.mo74311g()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            pq.e<java.lang.Float> r4 = r0.$values
            java.lang.Comparable r4 = r4.mo74309c()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            pq.e<java.lang.Float> r5 = r0.$valueRange
            java.lang.Comparable r5 = r5.mo74311g()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r2 = kotlin.jvm.internal.C19388s.m32831L(r2, r4, r5)
            pq.e<java.lang.Float> r4 = r0.$valueRange
            java.lang.Comparable r4 = r4.mo74309c()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            pq.e<java.lang.Float> r5 = r0.$valueRange
            java.lang.Comparable r5 = r5.mo74311g()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r4 = androidx.compose.material.SliderKt.m2219h(r4, r5, r1)
            pq.e<java.lang.Float> r5 = r0.$valueRange
            java.lang.Comparable r5 = r5.mo74309c()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            pq.e<java.lang.Float> r6 = r0.$valueRange
            java.lang.Comparable r6 = r6.mo74311g()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r5 = androidx.compose.material.SliderKt.m2219h(r5, r6, r2)
            java.util.List<java.lang.Float> r6 = r0.$tickFractions
            boolean r7 = r0.$enabled
            androidx.compose.runtime.k1<kq.l<pq.e<java.lang.Float>, kotlin.m>> r11 = r0.$onValueChangeState
            java.lang.Float r13 = java.lang.Float.valueOf(r2)
            androidx.compose.runtime.k1<kq.l<pq.e<java.lang.Float>, kotlin.m>> r14 = r0.$onValueChangeState
            r15 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.mo5465u(r15)
            boolean r11 = r12.mo5408I(r11)
            boolean r13 = r12.mo5408I(r13)
            r11 = r11 | r13
            java.lang.Object r13 = r32.mo5467v()
            if (r11 != 0) goto L_0x02d3
            androidx.compose.runtime.d$a$a r11 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r13 != r11) goto L_0x02db
        L_0x02d3:
            androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1 r13 = new androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
            r13.<init>(r14, r2)
            r12.mo5454o(r13)
        L_0x02db:
            r32.mo5406H()
            r24 = r13
            kq.l r24 = (p753kq.C19857l) r24
            pq.e<java.lang.Float> r11 = r0.$valueRange
            java.lang.Comparable r11 = r11.mo74309c()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            pq.d r13 = new pq.d
            r13.<init>(r11, r2)
            int r11 = r0.$steps
            r20 = r3
            r21 = r1
            r22 = r6
            r23 = r7
            r25 = r13
            r26 = r11
            androidx.compose.ui.d r11 = androidx.compose.material.SliderKt.m2221j(r20, r21, r22, r23, r24, r25, r26)
            java.util.List<java.lang.Float> r6 = r0.$tickFractions
            boolean r7 = r0.$enabled
            androidx.compose.runtime.k1<kq.l<pq.e<java.lang.Float>, kotlin.m>> r13 = r0.$onValueChangeState
            java.lang.Float r14 = java.lang.Float.valueOf(r1)
            r31 = r11
            androidx.compose.runtime.k1<kq.l<pq.e<java.lang.Float>, kotlin.m>> r11 = r0.$onValueChangeState
            r12.mo5465u(r15)
            boolean r13 = r12.mo5408I(r13)
            boolean r14 = r12.mo5408I(r14)
            r13 = r13 | r14
            java.lang.Object r14 = r32.mo5467v()
            if (r13 != 0) goto L_0x0329
            androidx.compose.runtime.d$a$a r13 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r14 != r13) goto L_0x0331
        L_0x0329:
            androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1 r14 = new androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
            r14.<init>(r11, r1)
            r12.mo5454o(r14)
        L_0x0331:
            r32.mo5406H()
            r24 = r14
            kq.l r24 = (p753kq.C19857l) r24
            pq.e<java.lang.Float> r11 = r0.$valueRange
            java.lang.Comparable r11 = r11.mo74311g()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            pq.d r13 = new pq.d
            r13.<init>(r1, r11)
            int r1 = r0.$steps
            r20 = r3
            r21 = r2
            r22 = r6
            r23 = r7
            r25 = r13
            r26 = r1
            androidx.compose.ui.d r11 = androidx.compose.material.SliderKt.m2221j(r20, r21, r22, r23, r24, r25, r26)
            boolean r1 = r0.$enabled
            java.util.List<java.lang.Float> r6 = r0.$tickFractions
            androidx.compose.material.r1 r7 = r0.$colors
            float r2 = r9.element
            float r3 = r8.element
            float r8 = r2 - r3
            androidx.compose.foundation.interaction.j r9 = r0.$startInteractionSource
            androidx.compose.foundation.interaction.j r13 = r0.$endInteractionSource
            r2 = 14159872(0xd81000, float:1.9842207E-38)
            int r3 = r0.$$dirty
            int r3 = r3 >> 9
            r14 = r3 & 14
            r2 = r2 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r14
            r14 = r2 | r3
            r15 = 0
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r13
            r9 = r10
            r10 = r31
            r12 = r32
            r13 = r14
            r14 = r15
            androidx.compose.material.SliderKt.m2215d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x038d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$RangeSlider$2.invoke(androidx.compose.foundation.layout.g, androidx.compose.runtime.d, int):void");
    }
}
