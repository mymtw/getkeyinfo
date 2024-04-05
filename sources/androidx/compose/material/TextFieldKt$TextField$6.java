package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.text.C0953g;
import androidx.compose.foundation.text.C0954h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.input.C2006x;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class TextFieldKt$TextField$6 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C0953g $keyboardActions;
    public final /* synthetic */ C0954h $keyboardOptions;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<TextFieldValue, C19394m> $onValueChange;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $placeholder;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C2023s $textStyle;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;
    public final /* synthetic */ TextFieldValue $value;
    public final /* synthetic */ C2006x $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$6(TextFieldValue textFieldValue, C19857l<? super TextFieldValue, C19394m> lVar, C1436d dVar, boolean z, boolean z2, C2023s sVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, boolean z3, C2006x xVar, C0954h hVar, C0953g gVar, boolean z4, int i, C0640j jVar, C1530k0 k0Var, C1166a2 a2Var, int i2, int i3, int i4) {
        super(2);
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$textStyle = sVar;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$isError = z3;
        this.$visualTransformation = xVar;
        this.$keyboardOptions = hVar;
        this.$keyboardActions = gVar;
        this.$singleLine = z4;
        this.$maxLines = i;
        this.$interactionSource = jVar;
        this.$shape = k0Var;
        this.$colors = a2Var;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e0, code lost:
        if (r0.mo5408I(r7) != false) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r61, int r62) {
        /*
            r60 = this;
            r0 = r60
            androidx.compose.ui.text.input.TextFieldValue r15 = r0.$value
            kq.l<androidx.compose.ui.text.input.TextFieldValue, kotlin.m> r14 = r0.$onValueChange
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            boolean r3 = r0.$readOnly
            androidx.compose.ui.text.s r4 = r0.$textStyle
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r5 = r0.$label
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r6 = r0.$placeholder
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r7 = r0.$leadingIcon
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r8 = r0.$trailingIcon
            boolean r9 = r0.$isError
            androidx.compose.ui.text.input.x r10 = r0.$visualTransformation
            androidx.compose.foundation.text.h r11 = r0.$keyboardOptions
            androidx.compose.foundation.text.g r12 = r0.$keyboardActions
            boolean r13 = r0.$singleLine
            r16 = r13
            int r13 = r0.$maxLines
            r17 = r13
            androidx.compose.foundation.interaction.j r13 = r0.$interactionSource
            r18 = r13
            androidx.compose.ui.graphics.k0 r13 = r0.$shape
            r19 = r13
            androidx.compose.material.a2 r13 = r0.$colors
            r20 = r13
            int r13 = r0.$$changed
            r21 = 1
            r13 = r13 | 1
            r22 = r12
            int r12 = r0.$$changed1
            r23 = r11
            int r11 = r0.$$default
            float r24 = androidx.compose.material.TextFieldKt.f2334a
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = -1576622884(0xffffffffa206a4dc, float:-1.8247662E-18)
            r24 = r10
            r10 = r61
            androidx.compose.runtime.ComposerImpl r0 = r10.mo5440h(r0)
            r10 = r11 & 1
            r25 = 2
            r26 = 4
            if (r10 == 0) goto L_0x0062
            r10 = r13 | 6
            goto L_0x0074
        L_0x0062:
            r10 = r13 & 14
            if (r10 != 0) goto L_0x0073
            boolean r10 = r0.mo5408I(r15)
            if (r10 == 0) goto L_0x006f
            r10 = r26
            goto L_0x0071
        L_0x006f:
            r10 = r25
        L_0x0071:
            r10 = r10 | r13
            goto L_0x0074
        L_0x0073:
            r10 = r13
        L_0x0074:
            r27 = r11 & 2
            r28 = 16
            r29 = 32
            if (r27 == 0) goto L_0x007f
            r10 = r10 | 48
            goto L_0x0090
        L_0x007f:
            r27 = r13 & 112(0x70, float:1.57E-43)
            if (r27 != 0) goto L_0x0090
            boolean r27 = r0.mo5408I(r14)
            if (r27 == 0) goto L_0x008c
            r27 = r29
            goto L_0x008e
        L_0x008c:
            r27 = r28
        L_0x008e:
            r10 = r10 | r27
        L_0x0090:
            r27 = r11 & 4
            r30 = 128(0x80, float:1.794E-43)
            r31 = 256(0x100, float:3.59E-43)
            if (r27 == 0) goto L_0x009d
            r10 = r10 | 384(0x180, float:5.38E-43)
            r62 = r14
            goto L_0x00af
        L_0x009d:
            r62 = r14
            r14 = r13 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x00af
            boolean r14 = r0.mo5408I(r1)
            if (r14 == 0) goto L_0x00ac
            r14 = r31
            goto L_0x00ae
        L_0x00ac:
            r14 = r30
        L_0x00ae:
            r10 = r10 | r14
        L_0x00af:
            r14 = r11 & 8
            r32 = 2048(0x800, float:2.87E-42)
            r33 = 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x00bc
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            r34 = r1
            goto L_0x00cf
        L_0x00bc:
            r34 = r1
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x00cf
            boolean r1 = r0.mo5427a(r2)
            if (r1 == 0) goto L_0x00cb
            r1 = r32
            goto L_0x00cd
        L_0x00cb:
            r1 = r33
        L_0x00cd:
            r1 = r1 | r10
            goto L_0x00d0
        L_0x00cf:
            r1 = r10
        L_0x00d0:
            r10 = r11 & 16
            r37 = 57344(0xe000, float:8.0356E-41)
            r35 = 16384(0x4000, float:2.2959E-41)
            r36 = 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x00de
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ef
        L_0x00de:
            r38 = r13 & r37
            if (r38 != 0) goto L_0x00ef
            boolean r38 = r0.mo5427a(r3)
            if (r38 == 0) goto L_0x00eb
            r38 = r35
            goto L_0x00ed
        L_0x00eb:
            r38 = r36
        L_0x00ed:
            r1 = r1 | r38
        L_0x00ef:
            r38 = 458752(0x70000, float:6.42848E-40)
            r39 = r13 & r38
            r40 = 65536(0x10000, float:9.18355E-41)
            r41 = 131072(0x20000, float:1.83671E-40)
            if (r39 != 0) goto L_0x010a
            r39 = r11 & 32
            if (r39 != 0) goto L_0x0106
            boolean r39 = r0.mo5408I(r4)
            if (r39 == 0) goto L_0x0106
            r39 = r41
            goto L_0x0108
        L_0x0106:
            r39 = r40
        L_0x0108:
            r1 = r1 | r39
        L_0x010a:
            r39 = r11 & 64
            r42 = 3670016(0x380000, float:5.142788E-39)
            if (r39 == 0) goto L_0x0113
            r43 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x0122
        L_0x0113:
            r43 = r13 & r42
            if (r43 != 0) goto L_0x0124
            boolean r43 = r0.mo5408I(r5)
            if (r43 == 0) goto L_0x0120
            r43 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0122
        L_0x0120:
            r43 = 524288(0x80000, float:7.34684E-40)
        L_0x0122:
            r1 = r1 | r43
        L_0x0124:
            r43 = r2
            r2 = r11 & 128(0x80, float:1.794E-43)
            r44 = 29360128(0x1c00000, float:7.052966E-38)
            if (r2 == 0) goto L_0x012f
            r45 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x013e
        L_0x012f:
            r45 = r13 & r44
            if (r45 != 0) goto L_0x0140
            boolean r45 = r0.mo5408I(r6)
            if (r45 == 0) goto L_0x013c
            r45 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x013e
        L_0x013c:
            r45 = 4194304(0x400000, float:5.877472E-39)
        L_0x013e:
            r1 = r1 | r45
        L_0x0140:
            r45 = r3
            r3 = r11 & 256(0x100, float:3.59E-43)
            r46 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x014b
            r47 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x015a
        L_0x014b:
            r47 = r13 & r46
            if (r47 != 0) goto L_0x015c
            boolean r47 = r0.mo5408I(r7)
            if (r47 == 0) goto L_0x0158
            r47 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x015a
        L_0x0158:
            r47 = 33554432(0x2000000, float:9.403955E-38)
        L_0x015a:
            r1 = r1 | r47
        L_0x015c:
            r47 = r4
            r4 = r11 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0165
            r48 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x0176
        L_0x0165:
            r48 = 1879048192(0x70000000, float:1.58456325E29)
            r48 = r13 & r48
            if (r48 != 0) goto L_0x0178
            boolean r48 = r0.mo5408I(r8)
            if (r48 == 0) goto L_0x0174
            r48 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0176
        L_0x0174:
            r48 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0176:
            r1 = r1 | r48
        L_0x0178:
            r48 = r5
            r5 = r11 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0181
            r25 = r12 | 6
            goto L_0x0192
        L_0x0181:
            r49 = r12 & 14
            if (r49 != 0) goto L_0x0190
            boolean r49 = r0.mo5427a(r9)
            if (r49 == 0) goto L_0x018d
            r25 = r26
        L_0x018d:
            r25 = r12 | r25
            goto L_0x0192
        L_0x0190:
            r25 = r12
        L_0x0192:
            r26 = r6
            r6 = r11 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x019b
            r25 = r25 | 48
            goto L_0x01ae
        L_0x019b:
            r49 = r12 & 112(0x70, float:1.57E-43)
            if (r49 != 0) goto L_0x01ae
            r49 = r7
            r7 = r24
            boolean r24 = r0.mo5408I(r7)
            if (r24 == 0) goto L_0x01ab
            r28 = r29
        L_0x01ab:
            r24 = r25 | r28
            goto L_0x01b4
        L_0x01ae:
            r49 = r7
            r7 = r24
            r24 = r25
        L_0x01b4:
            r25 = r7
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x01ce
            r7 = r11 & 4096(0x1000, float:5.74E-42)
            if (r7 != 0) goto L_0x01c9
            r7 = r23
            boolean r23 = r0.mo5408I(r7)
            if (r23 == 0) goto L_0x01cb
            r30 = r31
            goto L_0x01cb
        L_0x01c9:
            r7 = r23
        L_0x01cb:
            r24 = r24 | r30
            goto L_0x01d0
        L_0x01ce:
            r7 = r23
        L_0x01d0:
            r23 = r7
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x01eb
            r7 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r7 != 0) goto L_0x01e3
            r7 = r22
            boolean r22 = r0.mo5408I(r7)
            if (r22 == 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e3:
            r7 = r22
        L_0x01e5:
            r32 = r33
        L_0x01e7:
            r24 = r24 | r32
            r22 = r7
        L_0x01eb:
            r7 = r24
            r24 = r8
            r8 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x01f6
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x020a
        L_0x01f6:
            r28 = r12 & r37
            if (r28 != 0) goto L_0x020a
            r28 = r9
            r9 = r16
            boolean r16 = r0.mo5427a(r9)
            if (r16 == 0) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            r35 = r36
        L_0x0207:
            r7 = r7 | r35
            goto L_0x020e
        L_0x020a:
            r28 = r9
            r9 = r16
        L_0x020e:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r11 & r16
            if (r16 == 0) goto L_0x021a
            r29 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r29
            goto L_0x0230
        L_0x021a:
            r29 = r12 & r38
            if (r29 != 0) goto L_0x0230
            r29 = r9
            r9 = r17
            boolean r17 = r0.mo5432d(r9)
            if (r17 == 0) goto L_0x022b
            r17 = r41
            goto L_0x022d
        L_0x022b:
            r17 = r40
        L_0x022d:
            r7 = r7 | r17
            goto L_0x0234
        L_0x0230:
            r29 = r9
            r9 = r17
        L_0x0234:
            r17 = r11 & r40
            if (r17 == 0) goto L_0x023d
            r30 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r30
            goto L_0x0253
        L_0x023d:
            r30 = r12 & r42
            if (r30 != 0) goto L_0x0253
            r30 = r9
            r9 = r18
            boolean r18 = r0.mo5408I(r9)
            if (r18 == 0) goto L_0x024e
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0250
        L_0x024e:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x0250:
            r7 = r7 | r18
            goto L_0x0257
        L_0x0253:
            r30 = r9
            r9 = r18
        L_0x0257:
            r18 = r12 & r44
            if (r18 != 0) goto L_0x0275
            r18 = r11 & r41
            if (r18 != 0) goto L_0x026c
            r18 = r9
            r9 = r19
            boolean r19 = r0.mo5408I(r9)
            if (r19 == 0) goto L_0x0270
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0272
        L_0x026c:
            r18 = r9
            r9 = r19
        L_0x0270:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0272:
            r7 = r7 | r19
            goto L_0x0279
        L_0x0275:
            r18 = r9
            r9 = r19
        L_0x0279:
            r19 = r12 & r46
            r31 = 262144(0x40000, float:3.67342E-40)
            if (r19 != 0) goto L_0x0299
            r19 = r11 & r31
            if (r19 != 0) goto L_0x0290
            r19 = r9
            r9 = r20
            boolean r20 = r0.mo5408I(r9)
            if (r20 == 0) goto L_0x0294
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0296
        L_0x0290:
            r19 = r9
            r9 = r20
        L_0x0294:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0296:
            r7 = r7 | r20
            goto L_0x029d
        L_0x0299:
            r19 = r9
            r9 = r20
        L_0x029d:
            r20 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r32 = r9
            r9 = r1 & r20
            r38 = r12
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r12) goto L_0x02e5
            r9 = 191739611(0xb6db6db, float:4.5782105E-32)
            r9 = r9 & r7
            r12 = 38347922(0x2492492, float:1.4777643E-37)
            if (r9 != r12) goto L_0x02e5
            boolean r9 = r0.mo5442i()
            if (r9 != 0) goto L_0x02bb
            goto L_0x02e5
        L_0x02bb:
            r0.mo5396C()
            r57 = r62
            r55 = r11
            r56 = r13
            r2 = r15
            r15 = r22
            r14 = r23
            r11 = r24
            r13 = r25
            r9 = r26
            r12 = r28
            r16 = r29
            r17 = r30
            r20 = r32
            r4 = r34
            r5 = r43
            r6 = r45
            r7 = r47
            r8 = r48
            r10 = r49
            goto L_0x053c
        L_0x02e5:
            r0.mo5466u0()
            r9 = r13 & 1
            r12 = 0
            if (r9 == 0) goto L_0x033c
            boolean r9 = r0.mo5425Y()
            if (r9 == 0) goto L_0x02f4
            goto L_0x033c
        L_0x02f4:
            r0.mo5396C()
            r2 = r11 & 32
            if (r2 == 0) goto L_0x02ff
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x02ff:
            r2 = r11 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0305
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0305:
            r2 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x030b
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x030b:
            r2 = r11 & r41
            if (r2 == 0) goto L_0x0313
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r2
        L_0x0313:
            r2 = r11 & r31
            if (r2 == 0) goto L_0x031b
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r2
        L_0x031b:
            r10 = r1
            r16 = r7
            r4 = r18
            r5 = r19
            r40 = r22
            r39 = r23
            r35 = r24
            r36 = r25
            r7 = r28
            r41 = r29
            r6 = r32
            r14 = r34
            r9 = r43
            r8 = r47
            r34 = r26
            r43 = r30
            goto L_0x0422
        L_0x033c:
            if (r27 == 0) goto L_0x0341
            androidx.compose.ui.d$a r9 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0343
        L_0x0341:
            r9 = r34
        L_0x0343:
            if (r14 == 0) goto L_0x0347
            r43 = r21
        L_0x0347:
            if (r10 == 0) goto L_0x034b
            r45 = r12
        L_0x034b:
            r10 = r11 & 32
            if (r10 == 0) goto L_0x035d
            androidx.compose.runtime.t r10 = androidx.compose.material.TextKt.f2342a
            java.lang.Object r10 = r0.mo5410J(r10)
            androidx.compose.ui.text.s r10 = (androidx.compose.p015ui.text.C2023s) r10
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r14
            r47 = r10
        L_0x035d:
            r10 = 0
            if (r39 == 0) goto L_0x0362
            r48 = r10
        L_0x0362:
            if (r2 == 0) goto L_0x0366
            r2 = r10
            goto L_0x0368
        L_0x0366:
            r2 = r26
        L_0x0368:
            if (r3 == 0) goto L_0x036c
            r49 = r10
        L_0x036c:
            if (r4 == 0) goto L_0x0370
            r24 = r10
        L_0x0370:
            if (r5 == 0) goto L_0x0374
            r3 = r12
            goto L_0x0376
        L_0x0374:
            r3 = r28
        L_0x0376:
            if (r6 == 0) goto L_0x037b
            a9.b r4 = androidx.compose.p015ui.text.input.C2006x.C2007a.f4530a
            goto L_0x037d
        L_0x037b:
            r4 = r25
        L_0x037d:
            r5 = r11 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x0386
            androidx.compose.foundation.text.h r5 = androidx.compose.foundation.text.C0954h.f1985e
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0388
        L_0x0386:
            r5 = r23
        L_0x0388:
            r6 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0397
            androidx.compose.foundation.text.g r6 = new androidx.compose.foundation.text.g
            r14 = 63
            r6.<init>(r10, r14)
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
            r22 = r6
        L_0x0397:
            if (r8 == 0) goto L_0x039b
            r6 = r12
            goto L_0x039d
        L_0x039b:
            r6 = r29
        L_0x039d:
            if (r16 == 0) goto L_0x03a3
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x03a5
        L_0x03a3:
            r8 = r30
        L_0x03a5:
            if (r17 == 0) goto L_0x03c0
            r10 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r10)
            java.lang.Object r10 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r14 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r10 != r14) goto L_0x03b9
            androidx.compose.foundation.interaction.k r10 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x03b9:
            r0.mo5418R(r12)
            androidx.compose.foundation.interaction.j r10 = (androidx.compose.foundation.interaction.C0640j) r10
            r18 = r10
        L_0x03c0:
            r10 = r11 & r41
            if (r10 == 0) goto L_0x03e6
            androidx.compose.material.TextFieldDefaults r10 = androidx.compose.material.TextFieldDefaults.f2324a
            androidx.compose.runtime.l1 r10 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r10 = r0.mo5410J(r10)
            androidx.compose.material.q1 r10 = (androidx.compose.material.C1225q1) r10
            p.a r10 = r10.f2547a
            r26 = 0
            r27 = 0
            p.c$a r29 = p202p.C7640c.f16938a
            r30 = 3
            r25 = r10
            r28 = r29
            p.a r10 = p202p.C7638a.m14651c(r25, r26, r27, r28, r29, r30)
            r14 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r14
            r19 = r10
        L_0x03e6:
            r10 = r11 & r31
            if (r10 == 0) goto L_0x0405
            androidx.compose.material.TextFieldDefaults r10 = androidx.compose.material.TextFieldDefaults.f2324a
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r36 = 2097151(0x1fffff, float:2.938734E-39)
            r35 = r0
            androidx.compose.material.g0 r10 = androidx.compose.material.TextFieldDefaults.m2263f(r25, r27, r29, r31, r33, r35, r36)
            r14 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r14
            r32 = r10
        L_0x0405:
            r10 = r1
            r34 = r2
            r36 = r4
            r39 = r5
            r41 = r6
            r16 = r7
            r14 = r9
            r4 = r18
            r5 = r19
            r40 = r22
            r35 = r24
            r6 = r32
            r9 = r43
            r7 = r3
            r43 = r8
            r8 = r47
        L_0x0422:
            r0.mo5419S()
            r1 = -833020145(0xffffffffce591f0f, float:-9.1067283E8)
            r0.mo5465u(r1)
            long r1 = r8.mo7758b()
            long r17 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x0436
            goto L_0x0438
        L_0x0436:
            r21 = r12
        L_0x0438:
            if (r21 == 0) goto L_0x043b
            goto L_0x0447
        L_0x043b:
            androidx.compose.runtime.j0 r1 = r6.mo5224c(r9, r0)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.s r1 = (androidx.compose.p015ui.graphics.C1545s) r1
            long r1 = r1.f3366a
        L_0x0447:
            r18 = r1
            r0.mo5418R(r12)
            androidx.compose.ui.text.s r1 = new androidx.compose.ui.text.s
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 262142(0x3fffe, float:3.67339E-40)
            r17 = r1
            r17.<init>(r18, r20, r22, r23, r24, r25, r27, r28, r29, r31)
            androidx.compose.ui.text.s r20 = r8.mo7759c(r1)
            androidx.compose.material.TextFieldDefaults r1 = androidx.compose.material.TextFieldDefaults.f2324a
            androidx.compose.runtime.j0 r1 = r6.mo5229j(r0)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.s r1 = (androidx.compose.p015ui.graphics.C1545s) r1
            long r1 = r1.f3366a
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.C0761x.m1655A(r14, r1, r5)
            androidx.compose.ui.d r1 = androidx.compose.material.TextFieldDefaults.m2261d(r1, r9, r7, r4, r6)
            float r2 = androidx.compose.material.TextFieldDefaults.f2326c
            float r3 = androidx.compose.material.TextFieldDefaults.f2325b
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.SizeKt.m1483c(r1, r2, r3)
            androidx.compose.ui.graphics.l0 r1 = new androidx.compose.ui.graphics.l0
            r28 = r1
            androidx.compose.runtime.j0 r2 = r6.mo5228i(r7, r0)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r2 = r2.f3366a
            r1.<init>(r2)
            r26 = 0
            androidx.compose.material.TextFieldKt$TextField$5 r12 = new androidx.compose.material.TextFieldKt$TextField$5
            r1 = r12
            r2 = r15
            r3 = r9
            r47 = r4
            r4 = r41
            r50 = r5
            r5 = r36
            r51 = r6
            r6 = r47
            r52 = r7
            r53 = r8
            r8 = r48
            r54 = r9
            r9 = r34
            r61 = r10
            r10 = r49
            r55 = r11
            r11 = r35
            r18 = r15
            r15 = r12
            r12 = r51
            r56 = r13
            r13 = r61
            r57 = r62
            r58 = r14
            r14 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -2078585677(0xffffffff841b4cb3, float:-1.8255381E-36)
            androidx.compose.runtime.internal.ComposableLambdaImpl r29 = p628nj.C18263b.m30805A(r0, r1, r15)
            r1 = r61
            r2 = r1 & 14
            r3 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r1 = r1 & r37
            r1 = r1 | r2
            int r2 = r16 << 12
            r3 = r2 & r42
            r1 = r1 | r3
            androidx.compose.foundation.text.g r3 = androidx.compose.foundation.text.C0953g.f1978g
            r1 = r1 | 0
            r3 = r2 & r44
            r1 = r1 | r3
            r3 = r2 & r46
            r1 = r1 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r31 = r1 | r2
            int r1 = r16 >> 3
            r1 = r1 & 14
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            int r2 = r16 >> 12
            r2 = r2 & 896(0x380, float:1.256E-42)
            r32 = r1 | r2
            r33 = 2048(0x800, float:2.87E-42)
            r2 = r18
            r15 = r2
            r16 = r57
            r18 = r54
            r19 = r45
            r21 = r39
            r22 = r40
            r23 = r41
            r24 = r43
            r25 = r36
            r27 = r47
            r30 = r0
            androidx.compose.foundation.text.BasicTextFieldKt.m1951a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r13 = r36
            r14 = r39
            r15 = r40
            r16 = r41
            r17 = r43
            r6 = r45
            r18 = r47
            r19 = r50
            r20 = r51
            r12 = r52
            r7 = r53
            r5 = r54
            r4 = r58
        L_0x053c:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x0543
            goto L_0x0557
        L_0x0543:
            androidx.compose.material.TextFieldKt$TextField$6 r3 = new androidx.compose.material.TextFieldKt$TextField$6
            r1 = r3
            r59 = r3
            r3 = r57
            r21 = r56
            r22 = r38
            r23 = r55
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r59
            r0.f3081d = r1
        L_0x0557:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt$TextField$6.invoke(androidx.compose.runtime.d, int):void");
    }
}
