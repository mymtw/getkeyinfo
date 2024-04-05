package androidx.compose.material;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19865t;

public final class TextFieldImplKt$CommonDecorationBox$3 extends Lambda implements C19865t<Float, C1545s, C1545s, Float, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $border;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $innerTextField;
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $placeholder;
    public final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;
    public final /* synthetic */ String $transformedText;
    public final /* synthetic */ TextFieldType $type;

    /* renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$a */
    public /* synthetic */ class C1159a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2333a;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            iArr[TextFieldType.Filled.ordinal()] = 1;
            iArr[TextFieldType.Outlined.ordinal()] = 2;
            f2333a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, String str, boolean z, int i, C1166a2 a2Var, boolean z2, C0639i iVar, int i2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, TextFieldType textFieldType, C19861p<? super C1302d, ? super Integer, C19394m> pVar5, boolean z3, C0759v vVar, boolean z4, C19861p<? super C1302d, ? super Integer, C19394m> pVar6) {
        super(6);
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$transformedText = str;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$colors = a2Var;
        this.$enabled = z2;
        this.$interactionSource = iVar;
        this.$$dirty = i2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$type = textFieldType;
        this.$innerTextField = pVar5;
        this.$singleLine = z3;
        this.$contentPadding = vVar;
        this.$shouldOverrideTextStyleColor = z4;
        this.$border = pVar6;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        m34763invokeRIQooxk(((Number) obj).floatValue(), ((C1545s) obj2).f3366a, ((C1545s) obj3).f3366a, ((Number) obj4).floatValue(), (C1302d) obj5, ((Number) obj6).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0244  */
    /* renamed from: invoke-RIQooxk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m34763invokeRIQooxk(float r18, long r19, long r21, float r23, androidx.compose.runtime.C1302d r24, int r25) {
        /*
            r17 = this;
            r0 = r17
            r10 = r18
            r15 = r24
            r1 = r25
            r2 = r1 & 14
            if (r2 != 0) goto L_0x0017
            boolean r2 = r15.mo5428b(r10)
            if (r2 == 0) goto L_0x0014
            r2 = 4
            goto L_0x0015
        L_0x0014:
            r2 = 2
        L_0x0015:
            r2 = r2 | r1
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r8 = r19
            if (r3 != 0) goto L_0x002a
            boolean r3 = r15.mo5434e(r8)
            if (r3 == 0) goto L_0x0027
            r3 = 32
            goto L_0x0029
        L_0x0027:
            r3 = 16
        L_0x0029:
            r2 = r2 | r3
        L_0x002a:
            r3 = r1 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x003d
            r3 = r21
            boolean r5 = r15.mo5434e(r3)
            if (r5 == 0) goto L_0x0039
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x003b
        L_0x0039:
            r5 = 128(0x80, float:1.794E-43)
        L_0x003b:
            r2 = r2 | r5
            goto L_0x003f
        L_0x003d:
            r3 = r21
        L_0x003f:
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r12 = r23
            if (r1 != 0) goto L_0x0051
            boolean r1 = r15.mo5428b(r12)
            if (r1 == 0) goto L_0x004e
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0050
        L_0x004e:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0050:
            r2 = r2 | r1
        L_0x0051:
            r13 = r2
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r13
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r2) goto L_0x0066
            boolean r1 = r24.mo5442i()
            if (r1 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r24.mo5396C()
            goto L_0x027d
        L_0x0066:
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r5 = r0.$label
            r16 = 0
            if (r5 == 0) goto L_0x0086
            boolean r7 = r0.$shouldOverrideTextStyleColor
            r6 = 362863774(0x15a0dc9e, float:6.497156E-26)
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 r2 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
            r1 = r2
            r11 = r2
            r2 = r18
            r3 = r21
            r14 = r6
            r6 = r13
            r8 = r19
            r1.<init>(r2, r3, r5, r6, r7, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = p628nj.C18263b.m30805A(r15, r14, r11)
            r11 = r1
            goto L_0x0088
        L_0x0086:
            r11 = r16
        L_0x0088:
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r1 = r0.$placeholder
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            java.lang.String r1 = r0.$transformedText
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0097
            r1 = 1
            goto L_0x0098
        L_0x0097:
            r1 = r2
        L_0x0098:
            if (r1 == 0) goto L_0x00b5
            r1 = 1120552650(0x42ca46ca, float:101.13826)
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 r14 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
            androidx.compose.material.a2 r5 = r0.$colors
            boolean r6 = r0.$enabled
            int r7 = r0.$$dirty
            int r8 = r0.$$dirty1
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r9 = r0.$placeholder
            r3 = r14
            r4 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9)
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = p628nj.C18263b.m30805A(r15, r1, r14)
            r4 = r1
            goto L_0x00b7
        L_0x00b5:
            r4 = r16
        L_0x00b7:
            r1 = 3
            java.lang.String r1 = androidx.compose.p015ui.text.input.C1993m.m4350K(r1, r15)
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            boolean r5 = r0.$isError
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r6 = r0.$isError
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.mo5465u(r7)
            boolean r5 = r15.mo5408I(r5)
            boolean r8 = r15.mo5408I(r1)
            r5 = r5 | r8
            java.lang.Object r8 = r24.mo5467v()
            if (r5 != 0) goto L_0x00df
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r8 != r5) goto L_0x00e7
        L_0x00df:
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1 r8 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
            r8.<init>(r6, r1)
            r15.mo5454o(r8)
        L_0x00e7:
            r24.mo5406H()
            kq.l r8 = (p753kq.C19857l) r8
            androidx.compose.ui.d r1 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r3, r2, r8)
            androidx.compose.material.a2 r2 = r0.$colors
            boolean r2 = r2 instanceof androidx.compose.material.C1170b2
            if (r2 == 0) goto L_0x0110
            r2 = -1083197894(0xffffffffbf6fb63a, float:-0.9363743)
            r15.mo5465u(r2)
            androidx.compose.material.a2 r2 = r0.$colors
            androidx.compose.material.b2 r2 = (androidx.compose.material.C1170b2) r2
            androidx.compose.runtime.k1 r2 = r2.mo5231f()
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r2 = r2.f3366a
            r24.mo5406H()
            goto L_0x012b
        L_0x0110:
            r2 = -1083197798(0xffffffffbf6fb69a, float:-0.93638)
            r15.mo5465u(r2)
            androidx.compose.material.a2 r2 = r0.$colors
            boolean r3 = r0.$enabled
            boolean r5 = r0.$isError
            androidx.compose.runtime.j0 r2 = r2.mo5222a(r3, r5, r15)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r2 = r2.f3366a
            r24.mo5406H()
        L_0x012b:
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r5 = r0.$leadingIcon
            if (r5 == 0) goto L_0x013d
            r6 = 1505327088(0x59b977f0, float:6.5255929E15)
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1 r8 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
            r8.<init>(r2, r5)
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = p628nj.C18263b.m30805A(r15, r6, r8)
            r5 = r2
            goto L_0x013f
        L_0x013d:
            r5 = r16
        L_0x013f:
            androidx.compose.material.a2 r2 = r0.$colors
            boolean r2 = r2 instanceof androidx.compose.material.C1170b2
            if (r2 == 0) goto L_0x015f
            r2 = -1083197452(0xffffffffbf6fb7f4, float:-0.93640065)
            r15.mo5465u(r2)
            androidx.compose.material.a2 r2 = r0.$colors
            androidx.compose.material.b2 r2 = (androidx.compose.material.C1170b2) r2
            androidx.compose.runtime.k1 r2 = r2.mo5232h()
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r2 = r2.f3366a
            r24.mo5406H()
            goto L_0x017a
        L_0x015f:
            r2 = -1083197355(0xffffffffbf6fb855, float:-0.93640643)
            r15.mo5465u(r2)
            androidx.compose.material.a2 r2 = r0.$colors
            boolean r3 = r0.$enabled
            boolean r6 = r0.$isError
            androidx.compose.runtime.j0 r2 = r2.mo5227g(r3, r6, r15)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r2 = r2.f3366a
            r24.mo5406H()
        L_0x017a:
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r6 = r0.$trailingIcon
            if (r6 == 0) goto L_0x018c
            r8 = -1894727196(0xffffffff8f10c1e4, float:-7.13709E-30)
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1 r9 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
            r9.<init>(r2, r6)
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = p628nj.C18263b.m30805A(r15, r8, r9)
            r6 = r2
            goto L_0x018e
        L_0x018c:
            r6 = r16
        L_0x018e:
            androidx.compose.material.TextFieldType r2 = r0.$type
            int[] r3 = androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.C1159a.f2333a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r9 = 1
            if (r2 == r9) goto L_0x0244
            r9 = 2
            if (r2 == r9) goto L_0x01ab
            r1 = -1083194976(0xffffffffbf6fc1a0, float:-0.93654823)
            r15.mo5465u(r1)
            r24.mo5406H()
            kotlin.m r1 = kotlin.C19394m.f43287a
            goto L_0x027d
        L_0x01ab:
            r2 = -1083196463(0xffffffffbf6fbbd1, float:-0.9364596)
            r15.mo5465u(r2)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo5465u(r2)
            java.lang.Object r2 = r24.mo5467v()
            androidx.compose.runtime.d$a$a r9 = androidx.compose.runtime.C1302d.C1303a.f2828a
            r19 = r4
            if (r2 != r9) goto L_0x01cf
            long r3 = p288y.C8347f.f18313b
            y.f r2 = new y.f
            r2.<init>(r3)
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = androidx.compose.foundation.layout.C0761x.m1751w0(r2, androidx.compose.runtime.C1351n1.f2948a)
            r15.mo5454o(r2)
        L_0x01cf:
            r24.mo5406H()
            androidx.compose.runtime.j0 r2 = (androidx.compose.runtime.C1338j0) r2
            r3 = 139886979(0x8568183, float:6.4550523E-34)
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1 r4 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
            androidx.compose.foundation.layout.v r12 = r0.$contentPadding
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$border
            int r8 = r0.$$dirty1
            r4.<init>(r2, r12, r14, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r12 = p628nj.C18263b.m30805A(r15, r3, r4)
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r3 = r0.$innerTextField
            boolean r8 = r0.$singleLine
            java.lang.Float r4 = java.lang.Float.valueOf(r18)
            r15.mo5465u(r7)
            boolean r4 = r15.mo5408I(r4)
            boolean r7 = r15.mo5408I(r2)
            r4 = r4 | r7
            java.lang.Object r7 = r24.mo5467v()
            if (r4 != 0) goto L_0x0202
            if (r7 != r9) goto L_0x020a
        L_0x0202:
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1 r7 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
            r7.<init>(r10, r2)
            r15.mo5454o(r7)
        L_0x020a:
            r24.mo5406H()
            r9 = r7
            kq.l r9 = (p753kq.C19857l) r9
            androidx.compose.foundation.layout.v r14 = r0.$contentPadding
            r2 = 805306368(0x30000000, float:4.656613E-10)
            int r4 = r0.$$dirty
            int r7 = r4 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r2 = r2 | r7
            int r4 = r4 >> 6
            r7 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r7
            r2 = r2 | r4
            int r4 = r13 << 21
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r7
            r13 = r2 | r4
            int r2 = r0.$$dirty1
            int r2 = r2 >> 6
            r16 = r2 & 14
            r2 = r3
            r3 = r19
            r4 = r11
            r7 = r8
            r8 = r18
            r10 = r12
            r11 = r14
            r12 = r24
            r14 = r16
            androidx.compose.material.OutlinedTextFieldKt.m2199b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r24.mo5406H()
            kotlin.m r1 = kotlin.C19394m.f43287a
            goto L_0x027d
        L_0x0244:
            r19 = r4
            r2 = -1083197019(0xffffffffbf6fb9a5, float:-0.93642646)
            r15.mo5465u(r2)
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r2 = r0.$innerTextField
            boolean r7 = r0.$singleLine
            androidx.compose.foundation.layout.v r9 = r0.$contentPadding
            int r3 = r0.$$dirty
            int r4 = r3 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            int r3 = r3 >> 6
            r8 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r8
            r3 = r3 | r4
            int r4 = r13 << 21
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r8
            r3 = r3 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            int r8 = r0.$$dirty1
            int r8 = r8 << 18
            r4 = r4 & r8
            r12 = r3 | r4
            r3 = r11
            r4 = r19
            r8 = r18
            r10 = r24
            r11 = r12
            androidx.compose.material.TextFieldKt.m2272a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r24.mo5406H()
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x027d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.m34763invokeRIQooxk(float, long, long, float, androidx.compose.runtime.d, int):void");
    }
}
