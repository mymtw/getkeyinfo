package com.google.accompanist.flowlayout;

import androidx.compose.animation.C0472h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1306d1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.C1424y0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.C19394m;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

public final class FlowKt {
    /* renamed from: a */
    public static final void m20294a(C1436d dVar, LayoutOrientation layoutOrientation, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f, FlowCrossAxisAlignment flowCrossAxisAlignment, float f2, MainAxisAlignment mainAxisAlignment2, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar2, int i) {
        int i2;
        int i3 = i;
        ComposerImpl h = dVar2.mo5440h(-1567419051);
        C1436d dVar3 = dVar;
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(dVar3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        LayoutOrientation layoutOrientation2 = layoutOrientation;
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(layoutOrientation2) ? 32 : 16;
        }
        SizeMode sizeMode2 = sizeMode;
        if ((i3 & 896) == 0) {
            i2 |= h.mo5408I(sizeMode2) ? 256 : 128;
        }
        MainAxisAlignment mainAxisAlignment3 = mainAxisAlignment;
        if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(mainAxisAlignment3) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        float f3 = f;
        if ((57344 & i3) == 0) {
            i2 |= h.mo5428b(f3) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        FlowCrossAxisAlignment flowCrossAxisAlignment2 = flowCrossAxisAlignment;
        if ((458752 & i3) == 0) {
            i2 |= h.mo5408I(flowCrossAxisAlignment2) ? 131072 : 65536;
        }
        float f4 = f2;
        if ((3670016 & i3) == 0) {
            i2 |= h.mo5428b(f4) ? 1048576 : 524288;
        }
        if ((29360128 & i3) == 0) {
            i2 |= h.mo5408I(mainAxisAlignment2) ? 8388608 : 4194304;
        } else {
            MainAxisAlignment mainAxisAlignment4 = mainAxisAlignment2;
        }
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = pVar;
        if ((234881024 & i3) == 0) {
            i2 |= h.mo5408I(pVar2) ? 67108864 : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !h.mo5442i()) {
            C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
            FlowKt$Flow$1 flowKt$Flow$1 = r11;
            FlowKt$Flow$1 flowKt$Flow$12 = new FlowKt$Flow$1(layoutOrientation, f, sizeMode, f2, mainAxisAlignment, mainAxisAlignment2, flowCrossAxisAlignment);
            h.mo5465u(-1323940314);
            C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
            LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
            C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
            ComposeUiNode.f3776c0.getClass();
            C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
            ComposableLambdaImpl a = C1700o.m3617a(dVar);
            int i4 = (((((i2 << 3) & 112) | ((i2 >> 24) & 14)) << 9) & 7168) | 6;
            if (h.f2715a instanceof C1299c) {
                h.mo5392A();
                if (h.f2702K) {
                    h.mo5450m(aVar);
                } else {
                    h.mo5452n();
                }
                h.f2738x = false;
                Updater.m2571b(h, flowKt$Flow$1, ComposeUiNode.Companion.f3781e);
                Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
                Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                a.invoke(C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, Integer.valueOf((i4 >> 3) & 112));
                h.mo5465u(2058660585);
                C0472h.m1247j((i4 >> 9) & 14, pVar, h, false, true, false);
            } else {
                C0005b.m45j0();
                throw null;
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new FlowKt$Flow$2(dVar, layoutOrientation, sizeMode, mainAxisAlignment, f, flowCrossAxisAlignment, f2, mainAxisAlignment2, pVar, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20295b(androidx.compose.p015ui.C1436d r25, com.google.accompanist.flowlayout.SizeMode r26, com.google.accompanist.flowlayout.MainAxisAlignment r27, float r28, com.google.accompanist.flowlayout.FlowCrossAxisAlignment r29, float r30, com.google.accompanist.flowlayout.MainAxisAlignment r31, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r32, androidx.compose.runtime.C1302d r33, int r34, int r35) {
        /*
            r11 = r32
            r12 = r34
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r0 = -137566119(0xfffffffff7cce859, float:-8.31204E33)
            r1 = r33
            androidx.compose.runtime.ComposerImpl r14 = r1.mo5440h(r0)
            r0 = r13 & 1
            if (r0 == 0) goto L_0x001e
            r1 = r12 | 6
            r2 = r1
            r1 = r25
            goto L_0x0032
        L_0x001e:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r25
            boolean r2 = r14.mo5408I(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r12
            goto L_0x0032
        L_0x002f:
            r1 = r25
            r2 = r12
        L_0x0032:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x0039
            r2 = r2 | 48
            goto L_0x004c
        L_0x0039:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            r4 = r26
            boolean r5 = r14.mo5408I(r4)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r2 = r2 | r5
            goto L_0x004e
        L_0x004c:
            r4 = r26
        L_0x004e:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x0055
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0068
            r6 = r27
            boolean r7 = r14.mo5408I(r6)
            if (r7 == 0) goto L_0x0064
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r2 = r2 | r7
            goto L_0x006a
        L_0x0068:
            r6 = r27
        L_0x006a:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0071
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0084
            r8 = r28
            boolean r9 = r14.mo5428b(r8)
            if (r9 == 0) goto L_0x0080
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r2 = r2 | r9
            goto L_0x0086
        L_0x0084:
            r8 = r28
        L_0x0086:
            r9 = r13 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x0090
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0090:
            r15 = r12 & r10
            if (r15 != 0) goto L_0x00a4
            r15 = r29
            boolean r16 = r14.mo5408I(r15)
            if (r16 == 0) goto L_0x009f
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r2 = r2 | r16
            goto L_0x00a6
        L_0x00a4:
            r15 = r29
        L_0x00a6:
            r16 = r13 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b3
            r18 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r18
            r10 = r30
            goto L_0x00c6
        L_0x00b3:
            r18 = r12 & r17
            r10 = r30
            if (r18 != 0) goto L_0x00c6
            boolean r18 = r14.mo5428b(r10)
            if (r18 == 0) goto L_0x00c2
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r2 = r2 | r18
        L_0x00c6:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r19 = r12 & r18
            if (r19 != 0) goto L_0x00e0
            r19 = r13 & 64
            r1 = r31
            if (r19 != 0) goto L_0x00db
            boolean r19 = r14.mo5408I(r1)
            if (r19 == 0) goto L_0x00db
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r2 = r2 | r19
            goto L_0x00e2
        L_0x00e0:
            r1 = r31
        L_0x00e2:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            if (r1 == 0) goto L_0x00eb
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00fa
        L_0x00eb:
            r1 = r12 & r19
            if (r1 != 0) goto L_0x00fb
            boolean r1 = r14.mo5408I(r11)
            if (r1 == 0) goto L_0x00f8
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r2 = r2 | r1
        L_0x00fb:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r2
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r4) goto L_0x011a
            boolean r1 = r14.mo5442i()
            if (r1 != 0) goto L_0x010b
            goto L_0x011a
        L_0x010b:
            r14.mo5396C()
            r1 = r25
            r2 = r26
            r7 = r31
            r3 = r6
            r4 = r8
            r6 = r10
            r5 = r15
            goto L_0x01b8
        L_0x011a:
            r14.mo5466u0()
            r1 = r12 & 1
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r1 == 0) goto L_0x0142
            boolean r1 = r14.mo5425Y()
            if (r1 == 0) goto L_0x012b
            goto L_0x0142
        L_0x012b:
            r14.mo5396C()
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0133
            r2 = r2 & r4
        L_0x0133:
            r16 = r26
            r24 = r31
            r20 = r6
            r21 = r8
            r23 = r10
            r22 = r15
            r15 = r25
            goto L_0x017e
        L_0x0142:
            if (r0 == 0) goto L_0x0147
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0149
        L_0x0147:
            r0 = r25
        L_0x0149:
            if (r3 == 0) goto L_0x014e
            com.google.accompanist.flowlayout.SizeMode r1 = com.google.accompanist.flowlayout.SizeMode.Wrap
            goto L_0x0150
        L_0x014e:
            r1 = r26
        L_0x0150:
            if (r5 == 0) goto L_0x0155
            com.google.accompanist.flowlayout.MainAxisAlignment r3 = com.google.accompanist.flowlayout.MainAxisAlignment.Start
            r6 = r3
        L_0x0155:
            r3 = 0
            if (r7 == 0) goto L_0x015a
            float r5 = (float) r3
            goto L_0x015b
        L_0x015a:
            r5 = r8
        L_0x015b:
            if (r9 == 0) goto L_0x0160
            com.google.accompanist.flowlayout.FlowCrossAxisAlignment r7 = com.google.accompanist.flowlayout.FlowCrossAxisAlignment.Start
            goto L_0x0161
        L_0x0160:
            r7 = r15
        L_0x0161:
            if (r16 == 0) goto L_0x0165
            float r3 = (float) r3
            r10 = r3
        L_0x0165:
            r3 = r13 & 64
            if (r3 == 0) goto L_0x016d
            r2 = r2 & r4
            r3 = r2
            r2 = r6
            goto L_0x0170
        L_0x016d:
            r3 = r2
            r2 = r31
        L_0x0170:
            r15 = r0
            r16 = r1
            r24 = r2
            r2 = r3
            r21 = r5
            r20 = r6
            r22 = r7
            r23 = r10
        L_0x017e:
            r14.mo5419S()
            kq.q<androidx.compose.runtime.c<?>, androidx.compose.runtime.d1, androidx.compose.runtime.y0, kotlin.m> r0 = androidx.compose.runtime.ComposerKt.f2748a
            com.google.accompanist.flowlayout.LayoutOrientation r1 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            r0 = r2 & 14
            r0 = r0 | 48
            int r2 = r2 << 3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = r2 & r17
            r0 = r0 | r3
            r3 = r2 & r18
            r0 = r0 | r3
            r3 = r2 & r19
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r10 = r0 | r2
            r0 = r15
            r2 = r16
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r32
            r9 = r14
            m20294a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r15
        L_0x01b8:
            androidx.compose.runtime.v0 r14 = r14.mo5421U()
            if (r14 != 0) goto L_0x01bf
            goto L_0x01cd
        L_0x01bf:
            com.google.accompanist.flowlayout.FlowKt$FlowRow$1 r15 = new com.google.accompanist.flowlayout.FlowKt$FlowRow$1
            r0 = r15
            r8 = r32
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.f3081d = r15
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.FlowKt.m20295b(androidx.compose.ui.d, com.google.accompanist.flowlayout.SizeMode, com.google.accompanist.flowlayout.MainAxisAlignment, float, com.google.accompanist.flowlayout.FlowCrossAxisAlignment, float, com.google.accompanist.flowlayout.MainAxisAlignment, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
