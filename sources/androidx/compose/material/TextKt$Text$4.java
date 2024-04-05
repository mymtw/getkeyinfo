package androidx.compose.material;

import androidx.compose.foundation.text.C0947a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.runtime.C1302d;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class TextKt$Text$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1952g $fontFamily;
    public final /* synthetic */ long $fontSize;
    public final /* synthetic */ C1957k $fontStyle;
    public final /* synthetic */ C1959m $fontWeight;
    public final /* synthetic */ Map<String, C0947a> $inlineContent;
    public final /* synthetic */ long $letterSpacing;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C2021q, C19394m> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C2023s $style;
    public final /* synthetic */ C1913a $text;
    public final /* synthetic */ C2029d $textAlign;
    public final /* synthetic */ C2030e $textDecoration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextKt$Text$4(C1913a aVar, C1436d dVar, long j, long j2, C1957k kVar, C1959m mVar, C1952g gVar, long j3, C2030e eVar, C2029d dVar2, long j4, int i, boolean z, int i2, Map<String, C0947a> map, C19857l<? super C2021q, C19394m> lVar, C2023s sVar, int i3, int i4, int i5) {
        super(2);
        this.$text = aVar;
        this.$modifier = dVar;
        this.$color = j;
        this.$fontSize = j2;
        this.$fontStyle = kVar;
        this.$fontWeight = mVar;
        this.$fontFamily = gVar;
        this.$letterSpacing = j3;
        this.$textDecoration = eVar;
        this.$textAlign = dVar2;
        this.$lineHeight = j4;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$inlineContent = map;
        this.$onTextLayout = lVar;
        this.$style = sVar;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r63, int r64) {
        /*
            r62 = this;
            r0 = r62
            androidx.compose.ui.text.a r12 = r0.$text
            androidx.compose.ui.d r1 = r0.$modifier
            long r2 = r0.$color
            long r4 = r0.$fontSize
            androidx.compose.ui.text.font.k r6 = r0.$fontStyle
            androidx.compose.ui.text.font.m r7 = r0.$fontWeight
            androidx.compose.ui.text.font.g r8 = r0.$fontFamily
            long r9 = r0.$letterSpacing
            androidx.compose.ui.text.style.e r11 = r0.$textDecoration
            androidx.compose.ui.text.style.d r13 = r0.$textAlign
            long r14 = r0.$lineHeight
            r16 = r14
            int r14 = r0.$overflow
            boolean r15 = r0.$softWrap
            r18 = r15
            int r15 = r0.$maxLines
            r19 = r15
            java.util.Map<java.lang.String, androidx.compose.foundation.text.a> r15 = r0.$inlineContent
            r20 = r15
            kq.l<androidx.compose.ui.text.q, kotlin.m> r15 = r0.$onTextLayout
            r21 = r15
            androidx.compose.ui.text.s r15 = r0.$style
            r22 = r15
            int r15 = r0.$$changed
            r23 = 1
            r15 = r15 | 1
            r24 = r14
            int r14 = r0.$$changed1
            r25 = r14
            int r14 = r0.$$default
            androidx.compose.runtime.t r26 = androidx.compose.material.TextKt.f2342a
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            r0 = -422393234(0xffffffffe6d2ca6e, float:-4.9771557E23)
            r26 = r13
            r13 = r63
            androidx.compose.runtime.ComposerImpl r0 = r13.mo5440h(r0)
            r13 = r14 & 1
            r27 = 2
            r28 = 4
            if (r13 == 0) goto L_0x005b
            r13 = r15 | 6
            goto L_0x006d
        L_0x005b:
            r13 = r15 & 14
            if (r13 != 0) goto L_0x006c
            boolean r13 = r0.mo5408I(r12)
            if (r13 == 0) goto L_0x0068
            r13 = r28
            goto L_0x006a
        L_0x0068:
            r13 = r27
        L_0x006a:
            r13 = r13 | r15
            goto L_0x006d
        L_0x006c:
            r13 = r15
        L_0x006d:
            r29 = r14 & 2
            r30 = 16
            r31 = 32
            if (r29 == 0) goto L_0x0078
            r13 = r13 | 48
            goto L_0x0089
        L_0x0078:
            r32 = r15 & 112(0x70, float:1.57E-43)
            if (r32 != 0) goto L_0x0089
            boolean r32 = r0.mo5408I(r1)
            if (r32 == 0) goto L_0x0085
            r32 = r31
            goto L_0x0087
        L_0x0085:
            r32 = r30
        L_0x0087:
            r13 = r13 | r32
        L_0x0089:
            r32 = r14 & 4
            r33 = 128(0x80, float:1.794E-43)
            r34 = 256(0x100, float:3.59E-43)
            if (r32 == 0) goto L_0x0096
            r13 = r13 | 384(0x180, float:5.38E-43)
            r64 = r1
            goto L_0x00a8
        L_0x0096:
            r64 = r1
            r1 = r15 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x00a8
            boolean r1 = r0.mo5434e(r2)
            if (r1 == 0) goto L_0x00a5
            r1 = r34
            goto L_0x00a7
        L_0x00a5:
            r1 = r33
        L_0x00a7:
            r13 = r13 | r1
        L_0x00a8:
            r1 = r14 & 8
            r35 = 2048(0x800, float:2.87E-42)
            r36 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x00b5
            r13 = r13 | 3072(0xc00, float:4.305E-42)
            r37 = r2
            goto L_0x00c7
        L_0x00b5:
            r37 = r2
            r2 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x00c7
            boolean r2 = r0.mo5434e(r4)
            if (r2 == 0) goto L_0x00c4
            r2 = r35
            goto L_0x00c6
        L_0x00c4:
            r2 = r36
        L_0x00c6:
            r13 = r13 | r2
        L_0x00c7:
            r2 = r14 & 16
            if (r2 == 0) goto L_0x00ce
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00e2
        L_0x00ce:
            r39 = 57344(0xe000, float:8.0356E-41)
            r40 = r15 & r39
            if (r40 != 0) goto L_0x00e2
            boolean r39 = r0.mo5408I(r6)
            if (r39 == 0) goto L_0x00de
            r39 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00e0
        L_0x00de:
            r39 = 8192(0x2000, float:1.14794E-41)
        L_0x00e0:
            r13 = r13 | r39
        L_0x00e2:
            r39 = r14 & 32
            r40 = 458752(0x70000, float:6.42848E-40)
            r41 = 65536(0x10000, float:9.18355E-41)
            r42 = 131072(0x20000, float:1.83671E-40)
            r43 = 196608(0x30000, float:2.75506E-40)
            if (r39 == 0) goto L_0x00f1
            r13 = r13 | r43
            goto L_0x0102
        L_0x00f1:
            r44 = r15 & r40
            if (r44 != 0) goto L_0x0102
            boolean r44 = r0.mo5408I(r7)
            if (r44 == 0) goto L_0x00fe
            r44 = r42
            goto L_0x0100
        L_0x00fe:
            r44 = r41
        L_0x0100:
            r13 = r13 | r44
        L_0x0102:
            r44 = r14 & 64
            r45 = 3670016(0x380000, float:5.142788E-39)
            r46 = 524288(0x80000, float:7.34684E-40)
            if (r44 == 0) goto L_0x010d
            r47 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x011c
        L_0x010d:
            r47 = r15 & r45
            if (r47 != 0) goto L_0x011e
            boolean r47 = r0.mo5408I(r8)
            if (r47 == 0) goto L_0x011a
            r47 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x011c
        L_0x011a:
            r47 = r46
        L_0x011c:
            r13 = r13 | r47
        L_0x011e:
            r3 = r14 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0125
            r48 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x0136
        L_0x0125:
            r48 = 29360128(0x1c00000, float:7.052966E-38)
            r48 = r15 & r48
            if (r48 != 0) goto L_0x0138
            boolean r48 = r0.mo5434e(r9)
            if (r48 == 0) goto L_0x0134
            r48 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0136
        L_0x0134:
            r48 = 4194304(0x400000, float:5.877472E-39)
        L_0x0136:
            r13 = r13 | r48
        L_0x0138:
            r48 = r4
            r4 = r14 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0141
            r5 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x0151
        L_0x0141:
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r15
            if (r5 != 0) goto L_0x0152
            boolean r5 = r0.mo5408I(r11)
            if (r5 == 0) goto L_0x014f
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0151
        L_0x014f:
            r5 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0151:
            r13 = r13 | r5
        L_0x0152:
            r5 = r14 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x015b
            r50 = 805306368(0x30000000, float:4.656613E-10)
            r13 = r13 | r50
            goto L_0x0173
        L_0x015b:
            r50 = 1879048192(0x70000000, float:1.58456325E29)
            r50 = r15 & r50
            if (r50 != 0) goto L_0x0173
            r50 = r6
            r6 = r26
            boolean r26 = r0.mo5408I(r6)
            if (r26 == 0) goto L_0x016e
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0170
        L_0x016e:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0170:
            r13 = r13 | r26
            goto L_0x0177
        L_0x0173:
            r50 = r6
            r6 = r26
        L_0x0177:
            r26 = r6
            r6 = r14 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0186
            r27 = r25 | 6
            r51 = r7
            r52 = r8
            r7 = r16
            goto L_0x01a3
        L_0x0186:
            r51 = r25 & 14
            if (r51 != 0) goto L_0x019b
            r51 = r7
            r52 = r8
            r7 = r16
            boolean r16 = r0.mo5434e(r7)
            if (r16 == 0) goto L_0x0198
            r27 = r28
        L_0x0198:
            r27 = r25 | r27
            goto L_0x01a3
        L_0x019b:
            r51 = r7
            r52 = r8
            r7 = r16
            r27 = r25
        L_0x01a3:
            r16 = r7
            r7 = r14 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x01ac
            r27 = r27 | 48
            goto L_0x01be
        L_0x01ac:
            r8 = r25 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x01be
            r8 = r24
            boolean r24 = r0.mo5432d(r8)
            if (r24 == 0) goto L_0x01ba
            r30 = r31
        L_0x01ba:
            r27 = r27 | r30
            r24 = r8
        L_0x01be:
            r8 = r27
            r27 = r9
            r9 = r14 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x01cd
            r8 = r8 | 384(0x180, float:5.38E-43)
            r10 = r25
            r25 = r11
            goto L_0x01e2
        L_0x01cd:
            r10 = r25
            r25 = r11
            r11 = r10 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x01e2
            r11 = r18
            boolean r18 = r0.mo5427a(r11)
            if (r18 == 0) goto L_0x01df
            r33 = r34
        L_0x01df:
            r8 = r8 | r33
            goto L_0x01e4
        L_0x01e2:
            r11 = r18
        L_0x01e4:
            r18 = r11
            r11 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x01ef
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            r30 = r12
            goto L_0x0203
        L_0x01ef:
            r30 = r12
            r12 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0203
            r12 = r19
            boolean r19 = r0.mo5432d(r12)
            if (r19 == 0) goto L_0x01fe
            goto L_0x0200
        L_0x01fe:
            r35 = r36
        L_0x0200:
            r8 = r8 | r35
            goto L_0x0205
        L_0x0203:
            r12 = r19
        L_0x0205:
            r19 = r12
            r12 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x020d
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
        L_0x020d:
            r31 = 32768(0x8000, float:4.5918E-41)
            r31 = r14 & r31
            if (r31 == 0) goto L_0x0217
            r8 = r8 | r43
            goto L_0x022b
        L_0x0217:
            r33 = r10 & r40
            if (r33 != 0) goto L_0x022b
            r33 = r11
            r11 = r21
            boolean r21 = r0.mo5408I(r11)
            if (r21 == 0) goto L_0x0226
            goto L_0x0228
        L_0x0226:
            r42 = r41
        L_0x0228:
            r8 = r8 | r42
            goto L_0x022f
        L_0x022b:
            r33 = r11
            r11 = r21
        L_0x022f:
            r21 = r10 & r45
            if (r21 != 0) goto L_0x024d
            r21 = r14 & r41
            if (r21 != 0) goto L_0x0244
            r21 = r10
            r10 = r22
            boolean r22 = r0.mo5408I(r10)
            if (r22 == 0) goto L_0x0248
            r46 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0248
        L_0x0244:
            r21 = r10
            r10 = r22
        L_0x0248:
            r8 = r8 | r46
            r22 = r10
            goto L_0x024f
        L_0x024d:
            r21 = r10
        L_0x024f:
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r10) goto L_0x0287
            r10 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r10 = r10 & r13
            r34 = r11
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r11) goto L_0x0289
            r10 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r10 & r8
            r11 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r11) goto L_0x0289
            boolean r10 = r0.mo5442i()
            if (r10 != 0) goto L_0x026e
            goto L_0x0289
        L_0x026e:
            r0.mo5396C()
            r3 = r64
            r31 = r16
            r17 = r24
            r13 = r25
            r11 = r27
            r4 = r37
            r6 = r48
            r8 = r50
            r9 = r51
            r10 = r52
            goto L_0x03f3
        L_0x0287:
            r34 = r11
        L_0x0289:
            r0.mo5466u0()
            r10 = r15 & 1
            if (r10 == 0) goto L_0x02c0
            boolean r10 = r0.mo5425Y()
            if (r10 == 0) goto L_0x0297
            goto L_0x02c0
        L_0x0297:
            r0.mo5396C()
            if (r12 == 0) goto L_0x02a0
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r1
        L_0x02a0:
            r1 = r14 & r41
            if (r1 == 0) goto L_0x02a8
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r1
        L_0x02a8:
            r12 = r64
            r31 = r16
            r29 = r18
            r33 = r19
            r11 = r22
            r35 = r37
            r16 = r48
            r18 = r50
            r19 = r51
            r22 = r20
            r20 = r52
            goto L_0x0346
        L_0x02c0:
            if (r29 == 0) goto L_0x02c5
            androidx.compose.ui.d$a r10 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x02c7
        L_0x02c5:
            r10 = r64
        L_0x02c7:
            if (r32 == 0) goto L_0x02cc
            long r35 = androidx.compose.p015ui.graphics.C1545s.f3364i
            goto L_0x02ce
        L_0x02cc:
            r35 = r37
        L_0x02ce:
            if (r1 == 0) goto L_0x02d4
            long r37 = p174m0.C7292j.f16173c
            r48 = r37
        L_0x02d4:
            r1 = 0
            if (r2 == 0) goto L_0x02d9
            r50 = r1
        L_0x02d9:
            if (r39 == 0) goto L_0x02dd
            r51 = r1
        L_0x02dd:
            if (r44 == 0) goto L_0x02e1
            r52 = r1
        L_0x02e1:
            if (r3 == 0) goto L_0x02e6
            long r2 = p174m0.C7292j.f16173c
            goto L_0x02e8
        L_0x02e6:
            r2 = r27
        L_0x02e8:
            if (r4 == 0) goto L_0x02ec
            r11 = r1
            goto L_0x02ee
        L_0x02ec:
            r11 = r25
        L_0x02ee:
            if (r5 == 0) goto L_0x02f1
            goto L_0x02f3
        L_0x02f1:
            r1 = r26
        L_0x02f3:
            if (r6 == 0) goto L_0x02f9
            long r4 = p174m0.C7292j.f16173c
            r16 = r4
        L_0x02f9:
            if (r7 == 0) goto L_0x02fd
            r24 = r23
        L_0x02fd:
            if (r9 == 0) goto L_0x0301
            r18 = r23
        L_0x0301:
            if (r33 == 0) goto L_0x0308
            r4 = 2147483647(0x7fffffff, float:NaN)
            r19 = r4
        L_0x0308:
            if (r12 == 0) goto L_0x0314
            java.util.Map r4 = kotlin.collections.C19294b0.m32559p0()
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r5
            r20 = r4
        L_0x0314:
            if (r31 == 0) goto L_0x031a
            androidx.compose.material.TextKt$Text$3 r4 = androidx.compose.material.TextKt$Text$3.INSTANCE
            r34 = r4
        L_0x031a:
            r4 = r14 & r41
            if (r4 == 0) goto L_0x032c
            androidx.compose.runtime.t r4 = androidx.compose.material.TextKt.f2342a
            java.lang.Object r4 = r0.mo5410J(r4)
            androidx.compose.ui.text.s r4 = (androidx.compose.p015ui.text.C2023s) r4
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r8
            r8 = r5
            goto L_0x032e
        L_0x032c:
            r4 = r22
        L_0x032e:
            r26 = r1
            r27 = r2
            r12 = r10
            r25 = r11
            r31 = r16
            r29 = r18
            r33 = r19
            r22 = r20
            r16 = r48
            r18 = r50
            r19 = r51
            r20 = r52
            r11 = r4
        L_0x0346:
            r0.mo5419S()
            r1 = 1557618192(0x5cd75e10, float:4.84964342E17)
            r0.mo5465u(r1)
            long r1 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r3 = (r35 > r1 ? 1 : (r35 == r1 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L_0x0359
            r3 = r23
            goto L_0x035a
        L_0x0359:
            r3 = r4
        L_0x035a:
            if (r3 == 0) goto L_0x035f
            r47 = r35
            goto L_0x0389
        L_0x035f:
            long r5 = r11.mo7758b()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0368
            goto L_0x036a
        L_0x0368:
            r23 = r4
        L_0x036a:
            if (r23 == 0) goto L_0x036d
            goto L_0x0387
        L_0x036d:
            androidx.compose.runtime.t r1 = androidx.compose.material.ContentColorKt.f2199a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.ui.graphics.s r1 = (androidx.compose.p015ui.graphics.C1545s) r1
            long r1 = r1.f3366a
            androidx.compose.runtime.t r3 = androidx.compose.material.ContentAlphaKt.f2198a
            java.lang.Object r3 = r0.mo5410J(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            long r5 = androidx.compose.p015ui.graphics.C1545s.m3356b(r1, r3)
        L_0x0387:
            r47 = r5
        L_0x0389:
            r0.mo5418R(r4)
            androidx.compose.ui.text.s r1 = new androidx.compose.ui.text.s
            r60 = 175952(0x2af50, float:2.46561E-40)
            r46 = r1
            r49 = r16
            r51 = r19
            r52 = r18
            r53 = r20
            r54 = r27
            r56 = r25
            r57 = r26
            r58 = r31
            r46.<init>(r47, r49, r51, r52, r53, r54, r56, r57, r58, r60)
            androidx.compose.ui.text.s r3 = r11.mo7759c(r1)
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r13 & 14
            r1 = r1 | r2
            r2 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r8 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r8 << 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r2
            r1 = r1 | r4
            r4 = r2 & r40
            r1 = r1 | r4
            r2 = r2 & r45
            r10 = r1 | r2
            r13 = 0
            r1 = r30
            r2 = r12
            r4 = r34
            r5 = r24
            r6 = r29
            r7 = r33
            r8 = r22
            r9 = r0
            r23 = r11
            r11 = r13
            androidx.compose.foundation.text.BasicTextKt.m1953a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = r12
            r6 = r16
            r8 = r18
            r9 = r19
            r10 = r20
            r20 = r22
            r22 = r23
            r17 = r24
            r13 = r25
            r11 = r27
            r18 = r29
            r19 = r33
            r4 = r35
        L_0x03f3:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x03fa
            goto L_0x0414
        L_0x03fa:
            androidx.compose.material.TextKt$Text$4 r2 = new androidx.compose.material.TextKt$Text$4
            r1 = r2
            r61 = r2
            r2 = r30
            r25 = r14
            r24 = r21
            r14 = r26
            r23 = r15
            r15 = r31
            r21 = r34
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r61
            r0.f3081d = r1
        L_0x0414:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt$Text$4.invoke(androidx.compose.runtime.d, int):void");
    }
}
