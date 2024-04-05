package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0450s;
import androidx.compose.foundation.layout.C0761x;
import androidx.core.widget.NestedScrollView;

public final class TabRowKt {

    /* renamed from: a */
    public static final float f2322a = ((float) 90);

    /* renamed from: b */
    public static final C0433j0 f2323b = C0761x.m1706Z0(NestedScrollView.ANIMATED_SCROLL_GAP, 0, C0450s.f1167a, 2);

    /* JADX WARNING: Removed duplicated region for block: B:112:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ee  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2260a(int r24, androidx.compose.p015ui.C1436d r25, long r26, long r28, p753kq.C19862q<? super java.util.List<androidx.compose.material.C1271y1>, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r30, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r31, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r32, androidx.compose.runtime.C1302d r33, int r34, int r35) {
        /*
            r1 = r24
            r9 = r32
            r10 = r34
            java.lang.String r0 = "tabs"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = -249175289(0xfffffffff125e307, float:-8.214318E29)
            r2 = r33
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0.mo5432d(r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r10
            goto L_0x002b
        L_0x002a:
            r2 = r10
        L_0x002b:
            r3 = r35 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r25
            boolean r5 = r0.mo5408I(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r2 = r2 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r25
        L_0x0047:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0060
            r5 = r35 & 4
            if (r5 != 0) goto L_0x005a
            r5 = r26
            boolean r7 = r0.mo5434e(r5)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r5 = r26
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r2 = r2 | r7
            goto L_0x0062
        L_0x0060:
            r5 = r26
        L_0x0062:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r35 & 8
            if (r7 != 0) goto L_0x0075
            r7 = r28
            boolean r11 = r0.mo5434e(r7)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0075:
            r7 = r28
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r11
            goto L_0x007d
        L_0x007b:
            r7 = r28
        L_0x007d:
            r11 = r35 & 16
            if (r11 == 0) goto L_0x0084
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0099
        L_0x0084:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x0099
            r12 = r30
            boolean r13 = r0.mo5408I(r12)
            if (r13 == 0) goto L_0x0095
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r2 = r2 | r13
            goto L_0x009b
        L_0x0099:
            r12 = r30
        L_0x009b:
            r13 = r35 & 32
            if (r13 == 0) goto L_0x00a3
            r14 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r14
            goto L_0x00b7
        L_0x00a3:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00b7
            r14 = r31
            boolean r15 = r0.mo5408I(r14)
            if (r15 == 0) goto L_0x00b3
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r2 = r2 | r15
            goto L_0x00b9
        L_0x00b7:
            r14 = r31
        L_0x00b9:
            r15 = r35 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00c2
            r2 = r2 | r16
            goto L_0x00d3
        L_0x00c2:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00d3
            boolean r15 = r0.mo5408I(r9)
            if (r15 == 0) goto L_0x00d0
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r2 = r2 | r15
        L_0x00d3:
            r15 = 2995931(0x2db6db, float:4.198194E-39)
            r15 = r15 & r2
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r4) goto L_0x00ee
            boolean r4 = r0.mo5442i()
            if (r4 != 0) goto L_0x00e3
            goto L_0x00ee
        L_0x00e3:
            r0.mo5396C()
            r2 = r25
            r3 = r5
            r5 = r7
            r7 = r12
            r8 = r14
            goto L_0x0187
        L_0x00ee:
            r0.mo5466u0()
            r4 = r10 & 1
            if (r4 == 0) goto L_0x0111
            boolean r4 = r0.mo5425Y()
            if (r4 == 0) goto L_0x00fc
            goto L_0x0111
        L_0x00fc:
            r0.mo5396C()
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0105
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0105:
            r3 = r35 & 8
            if (r3 == 0) goto L_0x010b
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x010b:
            r3 = r25
            r4 = r5
            r6 = r7
            r8 = r12
            goto L_0x0152
        L_0x0111:
            if (r3 == 0) goto L_0x0116
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0118
        L_0x0116:
            r3 = r25
        L_0x0118:
            r4 = r35 & 4
            if (r4 == 0) goto L_0x012b
            androidx.compose.runtime.l1 r4 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r4 = r0.mo5410J(r4)
            androidx.compose.material.v r4 = (androidx.compose.material.C1259v) r4
            long r4 = androidx.compose.material.ColorsKt.m2175c(r4)
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x012c
        L_0x012b:
            r4 = r5
        L_0x012c:
            r6 = r35 & 8
            if (r6 == 0) goto L_0x0137
            long r6 = androidx.compose.material.ColorsKt.m2174b(r4, r0)
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0138
        L_0x0137:
            r6 = r7
        L_0x0138:
            if (r11 == 0) goto L_0x0147
            r8 = -553782708(0xffffffffdefdf24c, float:-9.1493859E18)
            androidx.compose.material.TabRowKt$TabRow$1 r11 = new androidx.compose.material.TabRowKt$TabRow$1
            r11.<init>(r1)
            androidx.compose.runtime.internal.ComposableLambdaImpl r8 = p628nj.C18263b.m30805A(r0, r8, r11)
            goto L_0x0148
        L_0x0147:
            r8 = r12
        L_0x0148:
            if (r13 == 0) goto L_0x0152
            androidx.compose.runtime.internal.ComposableLambdaImpl r11 = androidx.compose.material.ComposableSingletons$TabRowKt.f2196a
            r23 = r11
            r11 = r2
            r2 = r23
            goto L_0x0154
        L_0x0152:
            r11 = r2
            r2 = r14
        L_0x0154:
            r0.mo5419S()
            androidx.compose.ui.d r12 = androidx.compose.foundation.selection.SelectableGroupKt.m1943a(r3)
            r17 = 0
            r18 = 0
            r13 = -1961746365(0xffffffff8b122043, float:-2.8142848E-32)
            androidx.compose.material.TabRowKt$TabRow$2 r14 = new androidx.compose.material.TabRowKt$TabRow$2
            r14.<init>(r9, r2, r8, r11)
            androidx.compose.runtime.internal.ComposableLambdaImpl r19 = p628nj.C18263b.m30805A(r0, r13, r14)
            r13 = r11 & 896(0x380, float:1.256E-42)
            r13 = r13 | r16
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r21 = r13 | r11
            r22 = 50
            r13 = 0
            r11 = r12
            r12 = r13
            r13 = r4
            r15 = r6
            r20 = r0
            androidx.compose.material.SurfaceKt.m2234a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            r23 = r8
            r8 = r2
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r23
        L_0x0187:
            androidx.compose.runtime.v0 r12 = r0.mo5421U()
            if (r12 != 0) goto L_0x018e
            goto L_0x019e
        L_0x018e:
            androidx.compose.material.TabRowKt$TabRow$3 r13 = new androidx.compose.material.TabRowKt$TabRow$3
            r0 = r13
            r1 = r24
            r9 = r32
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.f3081d = r13
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m2260a(int, androidx.compose.ui.d, long, long, kq.q, kq.p, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
