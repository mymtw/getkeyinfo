package com.etsy.collagecompose;

import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.TestTagKt;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.collagecompose.C12152g;
import com.etsy.collagecompose.C12155h;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class CheckboxKt {

    /* renamed from: a */
    public static final float f27020a = ((float) 30);

    /* renamed from: b */
    public static final float f27021b = ((float) 18);

    /* renamed from: c */
    public static final float f27022c;

    /* renamed from: d */
    public static final float f27023d;

    /* renamed from: e */
    public static final float f27024e = ((float) 1.5d);

    /* renamed from: f */
    public static final float f27025f = ((float) 6);

    /* renamed from: g */
    public static final float f27026g = ((float) 4);

    /* renamed from: com.etsy.collagecompose.CheckboxKt$a */
    public /* synthetic */ class C12119a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27027a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            f27027a = iArr;
        }
    }

    static {
        float f = (float) 2;
        f27022c = f;
        f27023d = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m19947a(java.lang.String r43, boolean r44, p753kq.C19857l<? super java.lang.Boolean, kotlin.C19394m> r45, androidx.compose.p015ui.C1436d r46, java.lang.String r47, java.lang.String r48, com.etsy.collagecompose.C12155h r49, com.etsy.collagecompose.C12152g r50, boolean r51, androidx.compose.runtime.C1302d r52, int r53, int r54) {
        /*
            r15 = r43
            r14 = r45
            r2 = r53
            r3 = r54
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 1244450324(0x4a2cce14, float:2831237.0)
            r1 = r52
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r2 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r2 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r0.mo5408I(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r2
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            r4 = r3 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            r13 = r44
            goto L_0x004d
        L_0x003b:
            r4 = r2 & 112(0x70, float:1.57E-43)
            r13 = r44
            if (r4 != 0) goto L_0x004d
            boolean r4 = r0.mo5427a(r13)
            if (r4 == 0) goto L_0x004a
            r4 = 32
            goto L_0x004c
        L_0x004a:
            r4 = 16
        L_0x004c:
            r1 = r1 | r4
        L_0x004d:
            r4 = r3 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r4 = r2 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0064
            boolean r4 = r0.mo5408I(r14)
            if (r4 == 0) goto L_0x0061
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r4
        L_0x0064:
            r4 = r3 & 8
            if (r4 == 0) goto L_0x006b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006b:
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007e
            r5 = r46
            boolean r6 = r0.mo5408I(r5)
            if (r6 == 0) goto L_0x007a
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r6
            goto L_0x0080
        L_0x007e:
            r5 = r46
        L_0x0080:
            r6 = r3 & 16
            if (r6 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x0087:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r2
            if (r7 != 0) goto L_0x009c
            r7 = r47
            boolean r8 = r0.mo5408I(r7)
            if (r8 == 0) goto L_0x0098
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r8
            goto L_0x009e
        L_0x009c:
            r7 = r47
        L_0x009e:
            r8 = r3 & 32
            if (r8 == 0) goto L_0x00a6
            r9 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r9
            goto L_0x00ba
        L_0x00a6:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r2
            if (r9 != 0) goto L_0x00ba
            r9 = r48
            boolean r10 = r0.mo5408I(r9)
            if (r10 == 0) goto L_0x00b6
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r10
            goto L_0x00bc
        L_0x00ba:
            r9 = r48
        L_0x00bc:
            r10 = r3 & 64
            if (r10 == 0) goto L_0x00c4
            r11 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r11
            goto L_0x00d8
        L_0x00c4:
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r2
            if (r11 != 0) goto L_0x00d8
            r11 = r49
            boolean r12 = r0.mo5408I(r11)
            if (r12 == 0) goto L_0x00d4
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r12
            goto L_0x00da
        L_0x00d8:
            r11 = r49
        L_0x00da:
            r12 = r3 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x00e5
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r16
            r5 = r50
            goto L_0x00fa
        L_0x00e5:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r2 & r16
            r5 = r50
            if (r16 != 0) goto L_0x00fa
            boolean r16 = r0.mo5408I(r5)
            if (r16 == 0) goto L_0x00f6
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r1 = r1 | r16
        L_0x00fa:
            r5 = r3 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0105
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r16
            r2 = r51
            goto L_0x011a
        L_0x0105:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r2 & r16
            r2 = r51
            if (r16 != 0) goto L_0x011a
            boolean r16 = r0.mo5427a(r2)
            if (r16 == 0) goto L_0x0116
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r1 = r1 | r16
        L_0x011a:
            r29 = r1
            r1 = 191739611(0xb6db6db, float:4.5782105E-32)
            r1 = r29 & r1
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r2) goto L_0x013b
            boolean r1 = r0.mo5442i()
            if (r1 != 0) goto L_0x012d
            goto L_0x013b
        L_0x012d:
            r0.mo5396C()
            r4 = r46
            r8 = r50
            r5 = r7
            r6 = r9
            r7 = r11
            r9 = r51
            goto L_0x04e7
        L_0x013b:
            if (r4 == 0) goto L_0x0142
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r30 = r1
            goto L_0x0144
        L_0x0142:
            r30 = r46
        L_0x0144:
            if (r6 == 0) goto L_0x014a
            r1 = 0
            r31 = r1
            goto L_0x014c
        L_0x014a:
            r31 = r7
        L_0x014c:
            if (r8 == 0) goto L_0x0152
            r1 = 0
            r32 = r1
            goto L_0x0154
        L_0x0152:
            r32 = r9
        L_0x0154:
            if (r10 == 0) goto L_0x015a
            com.etsy.collagecompose.h$a r1 = com.etsy.collagecompose.C12155h.C12156a.f27093a
            r2 = r1
            goto L_0x015b
        L_0x015a:
            r2 = r11
        L_0x015b:
            if (r12 == 0) goto L_0x0161
            com.etsy.collagecompose.g$b r1 = com.etsy.collagecompose.C12152g.C12154b.f27092a
            r12 = r1
            goto L_0x0163
        L_0x0161:
            r12 = r50
        L_0x0163:
            r1 = 1
            if (r5 == 0) goto L_0x0169
            r33 = r1
            goto L_0x016b
        L_0x0169:
            r33 = r51
        L_0x016b:
            com.etsy.collagecompose.h$a r4 = com.etsy.collagecompose.C12155h.C12156a.f27093a
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r2, r4)
            r6 = 1890540985(0x70af5db9, float:4.3418544E29)
            r7 = 0
            if (r5 == 0) goto L_0x018d
            r5 = 1890544656(0x70af6c10, float:4.3432413E29)
            r0.mo5465u(r5)
            androidx.compose.runtime.l1 r5 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r5 = r0.mo5410J(r5)
            com.etsy.collagecompose.k r5 = (com.etsy.collagecompose.C12160k) r5
            androidx.compose.ui.text.s r5 = r5.f27199e
            r0.mo5418R(r7)
        L_0x018a:
            r34 = r5
            goto L_0x01a9
        L_0x018d:
            com.etsy.collagecompose.h$b r5 = com.etsy.collagecompose.C12155h.C12157b.f27094a
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r2, r5)
            if (r5 == 0) goto L_0x0523
            r5 = 1890544719(0x70af6c4f, float:4.343265E29)
            r0.mo5465u(r5)
            androidx.compose.runtime.l1 r5 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r5 = r0.mo5410J(r5)
            com.etsy.collagecompose.k r5 = (com.etsy.collagecompose.C12160k) r5
            androidx.compose.ui.text.s r5 = r5.f27200f
            r0.mo5418R(r7)
            goto L_0x018a
        L_0x01a9:
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r2, r4)
            if (r4 == 0) goto L_0x01c5
            r4 = 1890544832(0x70af6cc0, float:4.3433078E29)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.k r4 = (com.etsy.collagecompose.C12160k) r4
            androidx.compose.ui.text.s r4 = r4.f27197c
            r0.mo5418R(r7)
        L_0x01c2:
            r35 = r4
            goto L_0x01e1
        L_0x01c5:
            com.etsy.collagecompose.h$b r4 = com.etsy.collagecompose.C12155h.C12157b.f27094a
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r2, r4)
            if (r4 == 0) goto L_0x0517
            r4 = 1890544896(0x70af6d00, float:4.343332E29)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.k r4 = (com.etsy.collagecompose.C12160k) r4
            androidx.compose.ui.text.s r4 = r4.f27198d
            r0.mo5418R(r7)
            goto L_0x01c2
        L_0x01e1:
            if (r33 == 0) goto L_0x01f7
            r4 = 1890544957(0x70af6d3d, float:4.343355E29)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r4 = r4.f27121a
            r0.mo5418R(r7)
            goto L_0x020a
        L_0x01f7:
            r4 = 1890545016(0x70af6d78, float:4.3433773E29)
            r0.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.i r4 = (com.etsy.collagecompose.C12158i) r4
            long r4 = r4.f27131f
            r0.mo5418R(r7)
        L_0x020a:
            r36 = r4
            androidx.compose.runtime.l1 r11 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r4 = r0.mo5410J(r11)
            com.etsy.collagecompose.j r4 = (com.etsy.collagecompose.C12159j) r4
            float r4 = r4.f27179g
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r5)
            java.lang.Object r5 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r6 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r5 != r6) goto L_0x0228
            androidx.compose.foundation.interaction.k r5 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x0228:
            r0.mo5418R(r7)
            androidx.compose.foundation.interaction.j r5 = (androidx.compose.foundation.interaction.C0640j) r5
            androidx.compose.ui.b$b r6 = androidx.compose.p015ui.C1428a.C1429a.f3114j
            androidx.compose.foundation.layout.d$f r7 = androidx.compose.foundation.layout.C0718d.f1482g
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 3
            r46 = r8
            r47 = r9
            r48 = r36
            r50 = r0
            r51 = r10
            r52 = r16
            androidx.compose.material.ripple.c r8 = androidx.compose.material.ripple.C1244j.m2369a(r46, r47, r48, r50, r51, r52)
            androidx.compose.ui.semantics.g r9 = new androidx.compose.ui.semantics.g
            r9.<init>(r1)
            r46 = r30
            r47 = r44
            r48 = r5
            r49 = r8
            r50 = r33
            r51 = r9
            r52 = r45
            androidx.compose.ui.d r5 = androidx.compose.foundation.selection.C0893a.m1946a(r46, r47, r48, r49, r50, r51, r52)
            r8 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.SizeKt.m1487g(r5)
            java.lang.Object r9 = r0.mo5410J(r11)
            com.etsy.collagecompose.j r9 = (com.etsy.collagecompose.C12159j) r9
            float r9 = r9.f27173a
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1484d(r5, r9, r1)
            r5 = 2
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25283H0(r1, r4, r8, r5)
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r0.mo5465u(r4)
            androidx.compose.ui.layout.v r4 = androidx.compose.foundation.layout.RowKt.m1480a(r7, r6, r0)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r5)
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r6 = r0.mo5410J(r5)
            m0.b r6 = (p174m0.C7282b) r6
            androidx.compose.runtime.l1 r7 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r8 = r0.mo5410J(r7)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p015ui.unit.LayoutDirection) r8
            androidx.compose.runtime.l1 r9 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r10 = r0.mo5410J(r9)
            androidx.compose.ui.platform.j1 r10 = (androidx.compose.p015ui.platform.C1843j1) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r16.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c<?> r13 = r0.f2715a
            boolean r13 = r13 instanceof androidx.compose.runtime.C1299c
            if (r13 == 0) goto L_0x0512
            r0.mo5392A()
            boolean r13 = r0.f2702K
            if (r13 == 0) goto L_0x02b7
            r0.mo5450m(r3)
            goto L_0x02ba
        L_0x02b7:
            r0.mo5452n()
        L_0x02ba:
            r13 = 0
            r0.f2738x = r13
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r0, r4, r13)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r4 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r0, r6, r4)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r0, r8, r6)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r8 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r10 = p504ai.C13983i.m21490i(r0, r10, r8, r0)
            r16 = 0
            r17 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r18 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r46 = r16
            r47 = r1
            r48 = r10
            r49 = r0
            r50 = r17
            r51 = r18
            androidx.appcompat.widget.C0326j.m868m(r46, r47, r48, r49, r50, r51)
            r1 = 2142612445(0x7fb5abdd, float:NaN)
            r0.mo5465u(r1)
            boolean r1 = r12 instanceof com.etsy.collagecompose.C12152g.C12154b
            if (r1 == 0) goto L_0x033b
            androidx.compose.ui.state.ToggleableState r1 = kotlin.reflect.C19421p.m32953r(r44)
            androidx.compose.ui.d$a r10 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r16 = 0
            r17 = 0
            java.lang.Object r18 = r0.mo5410J(r11)
            r38 = r11
            r11 = r18
            com.etsy.collagecompose.j r11 = (com.etsy.collagecompose.C12159j) r11
            float r11 = r11.f27177e
            r18 = 0
            r19 = 11
            r46 = r10
            r47 = r16
            r48 = r17
            r49 = r11
            r50 = r18
            r51 = r19
            androidx.compose.ui.d r10 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r46, r47, r48, r49, r50, r51)
            int r11 = r29 >> 24
            r11 = r11 & 14
            r39 = r12
            int r12 = r29 >> 9
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 0
            r46 = r33
            r47 = r1
            r48 = r10
            r49 = r2
            r50 = r0
            r51 = r11
            r52 = r12
            m19948b(r46, r47, r48, r49, r50, r51, r52)
            goto L_0x033f
        L_0x033b:
            r38 = r11
            r39 = r12
        L_0x033f:
            r1 = 0
            r0.mo5418R(r1)
            androidx.compose.ui.d$a r12 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r1 = 1065353216(0x3f800000, float:1.0)
            double r10 = (double) r1
            r16 = 0
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0350
            r10 = 1
            goto L_0x0351
        L_0x0350:
            r10 = 0
        L_0x0351:
            if (r10 == 0) goto L_0x0506
            androidx.compose.foundation.layout.s r10 = new androidx.compose.foundation.layout.s
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r11 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            r11 = 1
            r10.<init>(r1, r11)
            r12.mo6148i0(r10)
            r1 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r0.mo5465u(r1)
            androidx.compose.foundation.layout.d$j r1 = androidx.compose.foundation.layout.C0718d.f1478c
            androidx.compose.ui.b$a r11 = androidx.compose.p015ui.C1428a.C1429a.f3116l
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.ColumnKt.m1461a(r1, r11, r0)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r1)
            java.lang.Object r1 = r0.mo5410J(r5)
            r20 = r1
            m0.b r20 = (p174m0.C7282b) r20
            java.lang.Object r1 = r0.mo5410J(r7)
            r23 = r1
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r1 = r0.mo5410J(r9)
            r26 = r1
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.p015ui.layout.C1700o.m3617a(r10)
            androidx.compose.runtime.c<?> r5 = r0.f2715a
            boolean r5 = r5 instanceof androidx.compose.runtime.C1299c
            if (r5 == 0) goto L_0x0501
            r0.mo5392A()
            boolean r5 = r0.f2702K
            if (r5 == 0) goto L_0x039f
            r0.mo5450m(r3)
            goto L_0x03a2
        L_0x039f:
            r0.mo5452n()
        L_0x03a2:
            r3 = 0
            r0.f2738x = r3
            r16 = r0
            r18 = r13
            r19 = r0
            r21 = r4
            r22 = r0
            r24 = r6
            r25 = r0
            r27 = r8
            r28 = r0
            androidx.compose.runtime.a1 r4 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6 = -1163856341(0xffffffffbaa0f62b, float:-0.0012280395)
            r46 = r3
            r47 = r1
            r48 = r4
            r49 = r0
            r50 = r5
            r51 = r6
            androidx.appcompat.widget.C0326j.m868m(r46, r47, r48, r49, r50, r51)
            r1 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = r38
            r11 = r3
            r20 = r12
            r40 = r39
            r12 = r3
            r3 = 0
            r41 = r13
            r13 = r3
            r16 = r29 & 14
            r17 = 0
            r18 = 4090(0xffa, float:5.731E-42)
            r3 = r0
            r0 = r43
            r22 = r2
            r21 = r3
            r2 = r36
            r14 = r34
            r15 = r21
            com.etsy.collagecompose.TextKt.m19958a(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 2142613149(0x7fb5ae9d, float:NaN)
            r1 = r21
            r1.mo5465u(r0)
            if (r31 != 0) goto L_0x0406
            r0 = r1
            goto L_0x0437
        L_0x0406:
            androidx.compose.runtime.l1 r0 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r0 = r1.mo5410J(r0)
            com.etsy.collagecompose.k r0 = (com.etsy.collagecompose.C12160k) r0
            androidx.compose.ui.text.s r15 = r0.f27200f
            androidx.compose.runtime.l1 r0 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r0 = r1.mo5410J(r0)
            com.etsy.collagecompose.i r0 = (com.etsy.collagecompose.C12158i) r0
            long r3 = r0.f27131f
            r2 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            int r0 = r29 >> 12
            r17 = r0 & 14
            r18 = 0
            r19 = 4090(0xffa, float:5.731E-42)
            r0 = r1
            r1 = r31
            r16 = r0
            com.etsy.collagecompose.TextKt.m19958a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x0437:
            r1 = 0
            r2 = 1
            android.support.p013v4.media.session.C0087d.m238h(r0, r1, r1, r1, r2)
            r0.mo5418R(r1)
            r0.mo5418R(r1)
            r1 = 2142613412(0x7fb5afa4, float:NaN)
            r0.mo5465u(r1)
            if (r32 != 0) goto L_0x044d
            r42 = r41
            goto L_0x048d
        L_0x044d:
            r15 = r41
            java.lang.Object r1 = r0.mo5410J(r15)
            com.etsy.collagecompose.j r1 = (com.etsy.collagecompose.C12159j) r1
            float r1 = r1.f27177e
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r46 = r20
            r47 = r1
            r48 = r2
            r49 = r3
            r50 = r4
            r51 = r5
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r46, r47, r48, r49, r50, r51)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            int r1 = r29 >> 15
            r17 = r1 & 14
            r18 = 0
            r19 = 4088(0xff8, float:5.729E-42)
            r1 = r32
            r3 = r36
            r42 = r15
            r15 = r35
            r16 = r0
            com.etsy.collagecompose.TextKt.m19958a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x048d:
            r1 = 0
            r0.mo5418R(r1)
            r2 = r40
            boolean r3 = r2 instanceof com.etsy.collagecompose.C12152g.C12153a
            if (r3 == 0) goto L_0x04d5
            androidx.compose.ui.state.ToggleableState r3 = kotlin.reflect.C19421p.m32953r(r44)
            r4 = r42
            java.lang.Object r4 = r0.mo5410J(r4)
            com.etsy.collagecompose.j r4 = (com.etsy.collagecompose.C12159j) r4
            float r4 = r4.f27177e
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 14
            r46 = r20
            r47 = r4
            r48 = r5
            r49 = r6
            r50 = r7
            r51 = r8
            androidx.compose.ui.d r4 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r46, r47, r48, r49, r50, r51)
            int r5 = r29 >> 24
            r5 = r5 & 14
            int r6 = r29 >> 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            r6 = 0
            r46 = r33
            r47 = r3
            r48 = r4
            r49 = r22
            r50 = r0
            r51 = r5
            r52 = r6
            m19948b(r46, r47, r48, r49, r50, r51, r52)
        L_0x04d5:
            r3 = 1
            android.support.p013v4.media.session.C0087d.m238h(r0, r1, r1, r3, r1)
            r0.mo5418R(r1)
            r8 = r2
            r7 = r22
            r4 = r30
            r5 = r31
            r6 = r32
            r9 = r33
        L_0x04e7:
            androidx.compose.runtime.v0 r12 = r0.mo5421U()
            if (r12 != 0) goto L_0x04ee
            goto L_0x0500
        L_0x04ee:
            com.etsy.collagecompose.CheckboxKt$Checkbox$2 r13 = new com.etsy.collagecompose.CheckboxKt$Checkbox$2
            r0 = r13
            r1 = r43
            r2 = r44
            r3 = r45
            r10 = r53
            r11 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f3081d = r13
        L_0x0500:
            return
        L_0x0501:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        L_0x0506:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid weight 1.0; must be greater than zero"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0512:
            r0 = 0
            p001a0.C0005b.m45j0()
            throw r0
        L_0x0517:
            r0.mo5465u(r6)
            r0.mo5418R(r7)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0523:
            r0.mo5465u(r6)
            r0.mo5418R(r7)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.CheckboxKt.m19947a(java.lang.String, boolean, kq.l, androidx.compose.ui.d, java.lang.String, java.lang.String, com.etsy.collagecompose.h, com.etsy.collagecompose.g, boolean, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v42, resolved type: com.etsy.collagecompose.CheckboxKt$CheckboxAnimated$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: com.etsy.collagecompose.CheckboxKt$CheckboxAnimated$1$1} */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m19948b(boolean r18, androidx.compose.p015ui.state.ToggleableState r19, androidx.compose.p015ui.C1436d r20, com.etsy.collagecompose.C12155h r21, androidx.compose.runtime.C1302d r22, int r23, int r24) {
        /*
            r1 = r18
            r2 = r19
            r5 = r23
            r0 = 1096539650(0x415bde02, float:13.741701)
            r3 = r22
            androidx.compose.runtime.ComposerImpl r0 = r3.mo5440h(r0)
            r3 = r24 & 1
            r6 = 2
            if (r3 == 0) goto L_0x0017
            r3 = r5 | 6
            goto L_0x0027
        L_0x0017:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0026
            boolean r3 = r0.mo5427a(r1)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = r6
        L_0x0024:
            r3 = r3 | r5
            goto L_0x0027
        L_0x0026:
            r3 = r5
        L_0x0027:
            r7 = r24 & 2
            if (r7 == 0) goto L_0x002e
            r3 = r3 | 48
            goto L_0x003e
        L_0x002e:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x003e
            boolean r7 = r0.mo5408I(r2)
            if (r7 == 0) goto L_0x003b
            r7 = 32
            goto L_0x003d
        L_0x003b:
            r7 = 16
        L_0x003d:
            r3 = r3 | r7
        L_0x003e:
            r7 = r24 & 4
            if (r7 == 0) goto L_0x0045
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0058
        L_0x0045:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0058
            r8 = r20
            boolean r9 = r0.mo5408I(r8)
            if (r9 == 0) goto L_0x0054
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r3 = r3 | r9
            goto L_0x005a
        L_0x0058:
            r8 = r20
        L_0x005a:
            r9 = r24 & 8
            if (r9 == 0) goto L_0x0061
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0074
        L_0x0061:
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0074
            r10 = r21
            boolean r11 = r0.mo5408I(r10)
            if (r11 == 0) goto L_0x0070
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r3 = r3 | r11
            goto L_0x0076
        L_0x0074:
            r10 = r21
        L_0x0076:
            r3 = r3 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r3 != r11) goto L_0x008a
            boolean r3 = r0.mo5442i()
            if (r3 != 0) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            r0.mo5396C()
            r3 = r8
            r4 = r10
            goto L_0x0224
        L_0x008a:
            if (r7 == 0) goto L_0x008f
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0090
        L_0x008f:
            r3 = r8
        L_0x0090:
            if (r9 == 0) goto L_0x0095
            com.etsy.collagecompose.h$a r7 = com.etsy.collagecompose.C12155h.C12156a.f27093a
            goto L_0x0096
        L_0x0095:
            r7 = r10
        L_0x0096:
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r8)
            java.lang.Object r8 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r9 = androidx.compose.runtime.C1302d.C1303a.f2828a
            r15 = 0
            if (r8 != r9) goto L_0x00ad
            com.etsy.collagecompose.f r8 = new com.etsy.collagecompose.f
            r8.<init>(r15)
            r0.mo5407H0(r8)
        L_0x00ad:
            r0.mo5418R(r15)
            r16 = r8
            com.etsy.collagecompose.f r16 = (com.etsy.collagecompose.C12151f) r16
            int[] r8 = com.etsy.collagecompose.CheckboxKt.C12119a.f27027a
            int r9 = r19.ordinal()
            r9 = r8[r9]
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 3
            r12 = 1
            if (r9 == r12) goto L_0x00ce
            if (r9 == r6) goto L_0x00cd
            if (r9 != r11) goto L_0x00c7
            goto L_0x00ce
        L_0x00c7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00cd:
            r10 = 0
        L_0x00ce:
            r9 = 300(0x12c, float:4.2E-43)
            r13 = 0
            r14 = 6
            androidx.compose.animation.core.j0 r9 = androidx.compose.foundation.layout.C0761x.m1706Z0(r9, r15, r13, r14)
            r4 = 12
            r13 = 48
            androidx.compose.animation.core.f r4 = androidx.compose.animation.core.C0411a.m1106b(r10, r9, r0, r13, r4)
            androidx.compose.runtime.l1 r9 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r10 = r0.mo5410J(r9)
            com.etsy.collagecompose.i r10 = (com.etsy.collagecompose.C12158i) r10
            long r13 = r10.f27127d
            if (r1 != 0) goto L_0x00fe
            r8 = -1579660863(0xffffffffa1d849c1, float:-1.4656252E-18)
            r0.mo5465u(r8)
            java.lang.Object r8 = r0.mo5410J(r9)
            com.etsy.collagecompose.i r8 = (com.etsy.collagecompose.C12158i) r8
            r17 = r7
            long r6 = r8.f27124b0
            r0.mo5418R(r15)
            goto L_0x015a
        L_0x00fe:
            r17 = r7
            r6 = -1579660788(0xffffffffa1d84a0c, float:-1.4656329E-18)
            r0.mo5465u(r6)
            int r6 = r19.ordinal()
            r6 = r8[r6]
            if (r6 == r12) goto L_0x0146
            r7 = 2
            if (r6 == r7) goto L_0x0134
            if (r6 != r11) goto L_0x0125
            r6 = -1579660508(0xffffffffa1d84b24, float:-1.4656619E-18)
            r0.mo5465u(r6)
            java.lang.Object r6 = r0.mo5410J(r9)
            com.etsy.collagecompose.i r6 = (com.etsy.collagecompose.C12158i) r6
            long r6 = r6.f27122a0
            r0.mo5418R(r15)
            goto L_0x0157
        L_0x0125:
            r1 = -1579667882(0xffffffffa1d82e56, float:-1.4648994E-18)
            r0.mo5465u(r1)
            r0.mo5418R(r15)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0134:
            r6 = -1579660613(0xffffffffa1d84abb, float:-1.465651E-18)
            r0.mo5465u(r6)
            java.lang.Object r6 = r0.mo5410J(r9)
            com.etsy.collagecompose.i r6 = (com.etsy.collagecompose.C12158i) r6
            long r6 = r6.f27122a0
            r0.mo5418R(r15)
            goto L_0x0157
        L_0x0146:
            r6 = -1579660706(0xffffffffa1d84a5e, float:-1.4656414E-18)
            r0.mo5465u(r6)
            java.lang.Object r6 = r0.mo5410J(r9)
            com.etsy.collagecompose.i r6 = (com.etsy.collagecompose.C12158i) r6
            long r6 = r6.f27120Z
            r0.mo5418R(r15)
        L_0x0157:
            r0.mo5418R(r15)
        L_0x015a:
            r8 = -1579660416(0xffffffffa1d84b80, float:-1.4656714E-18)
            r0.mo5465u(r8)
            androidx.compose.ui.state.ToggleableState r8 = androidx.compose.p015ui.state.ToggleableState.On
            if (r2 != r8) goto L_0x018a
            if (r1 != 0) goto L_0x0178
            r8 = -1579660335(0xffffffffa1d84bd1, float:-1.4656798E-18)
            r0.mo5465u(r8)
            java.lang.Object r8 = r0.mo5410J(r9)
            com.etsy.collagecompose.i r8 = (com.etsy.collagecompose.C12158i) r8
            long r8 = r8.f27124b0
            r0.mo5418R(r15)
            goto L_0x0197
        L_0x0178:
            r8 = -1579660244(0xffffffffa1d84c2c, float:-1.4656892E-18)
            r0.mo5465u(r8)
            java.lang.Object r8 = r0.mo5410J(r9)
            com.etsy.collagecompose.i r8 = (com.etsy.collagecompose.C12158i) r8
            long r8 = r8.f27120Z
            r0.mo5418R(r15)
            goto L_0x0197
        L_0x018a:
            androidx.compose.ui.state.ToggleableState r8 = androidx.compose.p015ui.state.ToggleableState.Off
            if (r2 != r8) goto L_0x0191
            long r8 = androidx.compose.p015ui.graphics.C1545s.f3363h
            goto L_0x0197
        L_0x0191:
            androidx.compose.ui.state.ToggleableState r8 = androidx.compose.p015ui.state.ToggleableState.Indeterminate
            if (r2 != r8) goto L_0x0242
            long r8 = androidx.compose.p015ui.graphics.C1545s.f3363h
        L_0x0197:
            r0.mo5418R(r15)
            r10 = 200(0xc8, float:2.8E-43)
            r11 = 0
            r12 = 6
            androidx.compose.animation.core.j0 r1 = androidx.compose.foundation.layout.C0761x.m1706Z0(r10, r15, r11, r12)
            r2 = 48
            androidx.compose.animation.core.f r1 = androidx.compose.animation.C0483r.m1263a(r6, r1, r0, r2)
            androidx.compose.animation.core.j0 r6 = androidx.compose.foundation.layout.C0761x.m1706Z0(r10, r15, r11, r12)
            androidx.compose.animation.core.f r9 = androidx.compose.animation.C0483r.m1263a(r8, r6, r0, r2)
            androidx.compose.ui.b r2 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.SizeKt.m1497q(r3, r2)
            com.etsy.collagecompose.h$a r6 = com.etsy.collagecompose.C12155h.C12156a.f27093a
            r7 = r17
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r7, r6)
            if (r6 == 0) goto L_0x01c3
            float r6 = f27020a
            goto L_0x01cd
        L_0x01c3:
            com.etsy.collagecompose.h$b r6 = com.etsy.collagecompose.C12155h.C12157b.f27094a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r7, r6)
            if (r6 == 0) goto L_0x023c
            float r6 = f27021b
        L_0x01cd:
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.SizeKt.m1490j(r2, r6)
            r6 = 6
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r15] = r9
            r6 = 1
            r8[r6] = r1
            r6 = 2
            r8[r6] = r7
            r6 = 3
            r8[r6] = r4
            androidx.compose.ui.graphics.s r6 = new androidx.compose.ui.graphics.s
            r6.<init>(r13)
            r10 = 4
            r8[r10] = r6
            r6 = 5
            r8[r6] = r16
            r6 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.mo5465u(r6)
            r6 = r15
            r10 = r6
            r11 = 6
        L_0x01f3:
            if (r6 >= r11) goto L_0x01ff
            r12 = r8[r6]
            boolean r12 = r0.mo5408I(r12)
            r10 = r10 | r12
            int r6 = r6 + 1
            goto L_0x01f3
        L_0x01ff:
            java.lang.Object r6 = r0.mo5431c0()
            if (r10 != 0) goto L_0x020c
            androidx.compose.runtime.d$a$a r8 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r6 != r8) goto L_0x020a
            goto L_0x020c
        L_0x020a:
            r1 = r15
            goto L_0x021b
        L_0x020c:
            com.etsy.collagecompose.CheckboxKt$CheckboxAnimated$1$1 r6 = new com.etsy.collagecompose.CheckboxKt$CheckboxAnimated$1$1
            r8 = r6
            r10 = r1
            r11 = r7
            r12 = r4
            r1 = r15
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r15)
            r0.mo5407H0(r6)
        L_0x021b:
            r0.mo5418R(r1)
            kq.l r6 = (p753kq.C19857l) r6
            androidx.compose.foundation.CanvasKt.m1294a(r2, r6, r0, r1)
            r4 = r7
        L_0x0224:
            androidx.compose.runtime.v0 r7 = r0.mo5421U()
            if (r7 != 0) goto L_0x022b
            goto L_0x023b
        L_0x022b:
            com.etsy.collagecompose.CheckboxKt$CheckboxAnimated$2 r8 = new com.etsy.collagecompose.CheckboxKt$CheckboxAnimated$2
            r0 = r8
            r1 = r18
            r2 = r19
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f3081d = r8
        L_0x023b:
            return
        L_0x023c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0242:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.CheckboxKt.m19948b(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.d, com.etsy.collagecompose.h, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final void m19949c(C12155h hVar, C12152g gVar, C1302d dVar, int i) {
        int i2;
        ComposerImpl composerImpl;
        String str;
        String str2;
        String str3;
        C12155h hVar2 = hVar;
        C12152g gVar2 = gVar;
        int i3 = i;
        ComposerImpl h = dVar.mo5440h(876401970);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(hVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(gVar2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !h.mo5442i()) {
            C12155h.C12156a aVar = C12155h.C12156a.f27093a;
            if (C19383o.m32792b(hVar2, aVar)) {
                str = gVar2 instanceof C12152g.C12153a ? "Checkboxes with check at end" : "Checkboxes";
            } else if (C19383o.m32792b(hVar2, C12155h.C12157b.f27094a)) {
                str = gVar2 instanceof C12152g.C12153a ? "Small checkboxes with check at end" : "Small checkboxes";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String str4 = str;
            C2023s sVar = ((C12160k) h.mo5410J(TypographyKt.f27060a)).f27195a;
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            C1345l1 l1Var = DimensKt.f27051e;
            TextKt.m19958a(str4, C15588c1.m25285I0(aVar2, ((C12159j) h.mo5410J(l1Var)).f27179g, ((C12159j) h.mo5410J(l1Var)).f27178f, ((C12159j) h.mo5410J(l1Var)).f27179g, ((C12159j) h.mo5410J(l1Var)).f27177e), 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, sVar, h, 0, 0, 4092);
            if (C19383o.m32792b(hVar2, aVar)) {
                str2 = "Base";
            } else if (C19383o.m32792b(hVar2, C12155h.C12157b.f27094a)) {
                str2 = "Small";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String str5 = str2;
            if (C19383o.m32792b(gVar2, C12152g.C12153a.f27091a)) {
                str3 = "End";
            } else if (C19383o.m32792b(gVar2, C12152g.C12154b.f27092a)) {
                str3 = "Start";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String str6 = str3;
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            Object obj = C1302d.C1303a.f2828a;
            if (c0 == obj) {
                c0 = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C1338j0 j0Var = (C1338j0) c0;
            boolean booleanValue = ((Boolean) j0Var.getValue()).booleanValue();
            C1436d a = TestTagKt.m3948a(aVar2, str5 + str6);
            h.mo5465u(1157296644);
            boolean I = h.mo5408I(j0Var);
            Object c02 = h.mo5431c0();
            if (I || c02 == obj) {
                c02 = new CheckboxKt$CheckboxSection$1$1(j0Var);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            int i4 = i2 << 18;
            int i5 = i4 & 3670016;
            int i6 = i4 & 29360128;
            int i7 = i5;
            String str7 = str6;
            C1436d.C1437a aVar3 = aVar2;
            composerImpl = h;
            m19947a(str5, booleanValue, (C19857l) c02, a, (String) null, (String) null, hVar, gVar, false, h, i5 | i6, 304);
            composerImpl.mo5465u(-492369756);
            Object c03 = composerImpl.mo5431c0();
            Object obj2 = obj;
            if (c03 == obj2) {
                c03 = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
                composerImpl.mo5407H0(c03);
            }
            composerImpl.mo5418R(false);
            C1338j0 j0Var2 = (C1338j0) c03;
            boolean booleanValue2 = ((Boolean) j0Var2.getValue()).booleanValue();
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            String str8 = str7;
            sb.append(str8);
            sb.append("WithDescription");
            C1436d.C1437a aVar4 = aVar3;
            C1436d a2 = TestTagKt.m3948a(aVar4, sb.toString());
            composerImpl.mo5465u(1157296644);
            boolean I2 = composerImpl.mo5408I(j0Var2);
            Object c04 = composerImpl.mo5431c0();
            if (I2 || c04 == obj2) {
                c04 = new CheckboxKt$CheckboxSection$2$1(j0Var2);
                composerImpl.mo5407H0(c04);
            }
            composerImpl.mo5418R(false);
            int i8 = i7;
            int i9 = i8;
            C1436d.C1437a aVar5 = aVar4;
            String str9 = str8;
            m19947a(str5, booleanValue2, (C19857l) c04, a2, "With description", (String) null, hVar, gVar, false, composerImpl, i8 | 24576 | i6, 288);
            composerImpl.mo5465u(-492369756);
            Object c05 = composerImpl.mo5431c0();
            Object obj3 = obj2;
            if (c05 == obj3) {
                c05 = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
                composerImpl.mo5407H0(c05);
            }
            composerImpl.mo5418R(false);
            C1338j0 j0Var3 = (C1338j0) c05;
            boolean booleanValue3 = ((Boolean) j0Var3.getValue()).booleanValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            String str10 = str9;
            sb2.append(str10);
            sb2.append("WithMeta");
            C1436d.C1437a aVar6 = aVar5;
            C1436d a3 = TestTagKt.m3948a(aVar6, sb2.toString());
            composerImpl.mo5465u(1157296644);
            boolean I3 = composerImpl.mo5408I(j0Var3);
            Object c06 = composerImpl.mo5431c0();
            if (I3 || c06 == obj3) {
                c06 = new CheckboxKt$CheckboxSection$3$1(j0Var3);
                composerImpl.mo5407H0(c06);
            }
            composerImpl.mo5418R(false);
            C12155h hVar3 = hVar;
            C12152g gVar3 = gVar;
            ComposerImpl composerImpl2 = composerImpl;
            C1436d.C1437a aVar7 = aVar6;
            m19947a(str5, booleanValue3, (C19857l) c06, a3, (String) null, "Meta", hVar3, gVar3, false, composerImpl2, i9 | 196608 | i6, 272);
            String i10 = C0326j.m864i(str5, " disabled");
            int i11 = i9 | 100663728 | i6;
            m19947a(i10, false, CheckboxKt$CheckboxSection$4.INSTANCE, TestTagKt.m3948a(aVar7, str5 + str10 + "Disabled"), (String) null, (String) null, hVar3, gVar3, false, composerImpl2, i11, 48);
            String i12 = C0326j.m864i(str5, " disabled selected");
            m19947a(i12, true, CheckboxKt$CheckboxSection$5.INSTANCE, TestTagKt.m3948a(aVar7, str5 + str10 + "DisabledSelected"), (String) null, (String) null, hVar3, gVar3, false, composerImpl2, i11, 48);
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new CheckboxKt$CheckboxSection$6(hVar, gVar, i);
        }
    }
}
