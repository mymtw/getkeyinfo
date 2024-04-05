package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ListItemKt$ListItem$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $overlineText;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $secondaryText;
    public final /* synthetic */ boolean $singleLineSecondaryText;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $text;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$1(C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, boolean z, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, C19861p<? super C1302d, ? super Integer, C19394m> pVar5, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$icon = pVar;
        this.$secondaryText = pVar2;
        this.$singleLineSecondaryText = z;
        this.$overlineText = pVar3;
        this.$trailing = pVar4;
        this.$text = pVar5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            androidx.compose.ui.d r1 = r0.$modifier
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r2 = r0.$icon
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r3 = r0.$secondaryText
            boolean r4 = r0.$singleLineSecondaryText
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r5 = r0.$overlineText
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r6 = r0.$trailing
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$text
            int r7 = r0.$$changed
            r8 = 1
            r15 = r7 | 1
            int r13 = r0.$$default
            java.lang.String r7 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r14, r7)
            r7 = -450923337(0xffffffffe51f74b7, float:-4.706308E22)
            r9 = r27
            androidx.compose.runtime.ComposerImpl r7 = r9.mo5440h(r7)
            r9 = r13 & 1
            if (r9 == 0) goto L_0x002c
            r10 = r15 | 6
            goto L_0x003c
        L_0x002c:
            r10 = r15 & 14
            if (r10 != 0) goto L_0x003b
            boolean r10 = r7.mo5408I(r1)
            if (r10 == 0) goto L_0x0038
            r10 = 4
            goto L_0x0039
        L_0x0038:
            r10 = 2
        L_0x0039:
            r10 = r10 | r15
            goto L_0x003c
        L_0x003b:
            r10 = r15
        L_0x003c:
            r11 = r13 & 2
            if (r11 == 0) goto L_0x0043
            r10 = r10 | 48
            goto L_0x0053
        L_0x0043:
            r12 = r15 & 112(0x70, float:1.57E-43)
            if (r12 != 0) goto L_0x0053
            boolean r12 = r7.mo5408I(r2)
            if (r12 == 0) goto L_0x0050
            r12 = 32
            goto L_0x0052
        L_0x0050:
            r12 = 16
        L_0x0052:
            r10 = r10 | r12
        L_0x0053:
            r12 = r13 & 4
            if (r12 == 0) goto L_0x005a
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x005a:
            r8 = r15 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006b
            boolean r8 = r7.mo5408I(r3)
            if (r8 == 0) goto L_0x0067
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r8 = r8 | r10
            goto L_0x006c
        L_0x006b:
            r8 = r10
        L_0x006c:
            r10 = r13 & 8
            if (r10 == 0) goto L_0x0073
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0073:
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0084
            boolean r0 = r7.mo5427a(r4)
            if (r0 == 0) goto L_0x0080
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r0 = r0 | r8
            goto L_0x0085
        L_0x0084:
            r0 = r8
        L_0x0085:
            r8 = r13 & 16
            if (r8 == 0) goto L_0x008c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008c:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00a0
            boolean r16 = r7.mo5408I(r5)
            if (r16 == 0) goto L_0x009c
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r0 = r0 | r16
        L_0x00a0:
            r16 = r13 & 32
            if (r16 == 0) goto L_0x00a7
            r17 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b8
        L_0x00a7:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x00ba
            boolean r17 = r7.mo5408I(r6)
            if (r17 == 0) goto L_0x00b6
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r0 = r0 | r17
        L_0x00ba:
            r17 = r13 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c3
            r0 = r0 | r18
            goto L_0x00d6
        L_0x00c3:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x00d6
            boolean r17 = r7.mo5408I(r14)
            if (r17 == 0) goto L_0x00d2
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r0 = r0 | r17
        L_0x00d6:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r19 = r1
            r1 = r0 & r17
            r17 = r2
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r2) goto L_0x00f7
            boolean r1 = r7.mo5442i()
            if (r1 != 0) goto L_0x00eb
            goto L_0x00f7
        L_0x00eb:
            r7.mo5396C()
            r10 = r3
            r11 = r4
            r12 = r5
            r9 = r17
            r8 = r19
            goto L_0x01a8
        L_0x00f7:
            if (r9 == 0) goto L_0x00fc
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x00fe
        L_0x00fc:
            r1 = r19
        L_0x00fe:
            r2 = 0
            if (r11 == 0) goto L_0x0103
            r9 = r2
            goto L_0x0105
        L_0x0103:
            r9 = r17
        L_0x0105:
            if (r12 == 0) goto L_0x0108
            r3 = r2
        L_0x0108:
            if (r10 == 0) goto L_0x010b
            r4 = 1
        L_0x010b:
            if (r8 == 0) goto L_0x010e
            r5 = r2
        L_0x010e:
            if (r16 == 0) goto L_0x0111
            r6 = r2
        L_0x0111:
            androidx.compose.runtime.l1 r2 = androidx.compose.material.TypographyKt.f2371a
            java.lang.Object r2 = r7.mo5410J(r2)
            androidx.compose.material.d2 r2 = (androidx.compose.material.C1178d2) r2
            androidx.compose.ui.text.s r8 = r2.f2408g
            float r10 = kotlinx.coroutines.C19543e0.m33301S(r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r19 = androidx.compose.material.C1270y0.m2408c(r10, r8, r14)
            kotlin.jvm.internal.C19383o.m32794d(r19)
            androidx.compose.ui.text.s r8 = r2.f2411j
            float r10 = kotlinx.coroutines.C19543e0.m33302T(r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r20 = androidx.compose.material.C1270y0.m2408c(r10, r8, r3)
            androidx.compose.ui.text.s r8 = r2.f2414m
            float r10 = kotlinx.coroutines.C19543e0.m33301S(r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r21 = androidx.compose.material.C1270y0.m2408c(r10, r8, r5)
            androidx.compose.ui.text.s r2 = r2.f2413l
            float r8 = kotlinx.coroutines.C19543e0.m33301S(r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r22 = androidx.compose.material.C1270y0.m2408c(r8, r2, r6)
            androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1 r2 = androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1.INSTANCE
            r8 = 1
            androidx.compose.ui.d r17 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r1, r8, r2)
            r2 = 0
            if (r20 != 0) goto L_0x016d
            if (r21 != 0) goto L_0x016d
            r8 = -210280579(0xfffffffff3775f7d, float:-1.9598908E31)
            r7.mo5465u(r8)
            androidx.compose.material.OneLine r16 = androidx.compose.material.OneLine.f2234a
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r23 = 0
            r18 = r9
            r20 = r22
            r21 = r7
            r22 = r0
            r16.mo4976a(r17, r18, r19, r20, r21, r22, r23)
            r7.mo5418R(r2)
            goto L_0x01a4
        L_0x016d:
            if (r21 != 0) goto L_0x0171
            if (r4 != 0) goto L_0x0173
        L_0x0171:
            if (r20 != 0) goto L_0x018c
        L_0x0173:
            r8 = -210280382(0xfffffffff3776042, float:-1.9599146E31)
            r7.mo5465u(r8)
            androidx.compose.material.TwoLine r16 = androidx.compose.material.TwoLine.f2356a
            r0 = r0 & 112(0x70, float:1.57E-43)
            r24 = r0 | r18
            r25 = 0
            r18 = r9
            r23 = r7
            r16.mo5216a(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7.mo5418R(r2)
            goto L_0x01a4
        L_0x018c:
            r8 = -210280168(0xfffffffff3776118, float:-1.9599405E31)
            r7.mo5465u(r8)
            androidx.compose.material.ThreeLine r16 = androidx.compose.material.ThreeLine.f2343a
            r0 = r0 & 112(0x70, float:1.57E-43)
            r24 = r0 | r18
            r25 = 0
            r18 = r9
            r23 = r7
            r16.mo5211a(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7.mo5418R(r2)
        L_0x01a4:
            r8 = r1
            r10 = r3
            r11 = r4
            r12 = r5
        L_0x01a8:
            androidx.compose.runtime.v0 r0 = r7.mo5421U()
            if (r0 != 0) goto L_0x01af
            goto L_0x01bb
        L_0x01af:
            androidx.compose.material.ListItemKt$ListItem$1 r1 = new androidx.compose.material.ListItemKt$ListItem$1
            r7 = r1
            r2 = r13
            r13 = r6
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.f3081d = r1
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt$ListItem$1.invoke(androidx.compose.runtime.d, int):void");
    }
}
