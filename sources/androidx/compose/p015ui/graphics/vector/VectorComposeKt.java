package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.C1494c0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1534m0;
import androidx.compose.p015ui.graphics.C1536n0;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;

/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt */
public final class VectorComposeKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0113  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3385a(java.lang.String r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, java.util.List<? extends androidx.compose.p015ui.graphics.vector.C1556d> r26, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r27, androidx.compose.runtime.C1302d r28, int r29, int r30) {
        /*
            r10 = r27
            r11 = r29
            r12 = r30
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            r0 = -213417674(0xfffffffff3478136, float:-1.5806393E31)
            r1 = r28
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r11 | 6
            r3 = r2
            r2 = r18
            goto L_0x0032
        L_0x001e:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r18
            boolean r3 = r0.mo5408I(r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r11
            goto L_0x0032
        L_0x002f:
            r2 = r18
            r3 = r11
        L_0x0032:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r19
            boolean r6 = r0.mo5428b(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r19
        L_0x004e:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r11 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r20
            boolean r8 = r0.mo5428b(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r20
        L_0x006a:
            r8 = r12 & 8
            if (r8 == 0) goto L_0x0071
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r9 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0084
            r9 = r21
            boolean r13 = r0.mo5428b(r9)
            if (r13 == 0) goto L_0x0080
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r13
            goto L_0x0086
        L_0x0084:
            r9 = r21
        L_0x0086:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x008d
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008d:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00a2
            r14 = r22
            boolean r15 = r0.mo5428b(r14)
            if (r15 == 0) goto L_0x009e
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r15
            goto L_0x00a4
        L_0x00a2:
            r14 = r22
        L_0x00a4:
            r15 = r12 & 32
            if (r15 == 0) goto L_0x00af
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r2 = r23
            goto L_0x00c4
        L_0x00af:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r16
            r2 = r23
            if (r16 != 0) goto L_0x00c4
            boolean r16 = r0.mo5428b(r2)
            if (r16 == 0) goto L_0x00c0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r3 = r3 | r16
        L_0x00c4:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x00cf
            r17 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r17
            r2 = r24
            goto L_0x00e4
        L_0x00cf:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r11 & r17
            r2 = r24
            if (r17 != 0) goto L_0x00e4
            boolean r17 = r0.mo5428b(r2)
            if (r17 == 0) goto L_0x00e0
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r3 = r3 | r17
        L_0x00e4:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00ef
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r17
            r5 = r25
            goto L_0x0104
        L_0x00ef:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r11 & r17
            r5 = r25
            if (r17 != 0) goto L_0x0104
            boolean r17 = r0.mo5428b(r5)
            if (r17 == 0) goto L_0x0100
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r3 = r3 | r17
        L_0x0104:
            r5 = r12 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x010c
            r17 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r17
        L_0x010c:
            r7 = r12 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x0113
            r7 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x0123
        L_0x0113:
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r11
            if (r7 != 0) goto L_0x0124
            boolean r7 = r0.mo5408I(r10)
            if (r7 == 0) goto L_0x0121
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0123
        L_0x0121:
            r7 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0123:
            r3 = r3 | r7
        L_0x0124:
            r7 = 256(0x100, float:3.59E-43)
            if (r5 != r7) goto L_0x014e
            r7 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r7 = r7 & r3
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r9) goto L_0x014e
            boolean r7 = r0.mo5442i()
            if (r7 != 0) goto L_0x0138
            goto L_0x014e
        L_0x0138:
            r0.mo5396C()
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r5 = r14
            goto L_0x0238
        L_0x014e:
            r0.mo5466u0()
            r7 = r11 & 1
            r9 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r7 == 0) goto L_0x0174
            boolean r7 = r0.mo5425Y()
            if (r7 == 0) goto L_0x015f
            goto L_0x0174
        L_0x015f:
            r0.mo5396C()
            if (r5 == 0) goto L_0x0165
            r3 = r3 & r9
        L_0x0165:
            r1 = r18
            r4 = r19
            r6 = r20
            r8 = r21
            r17 = r23
            r13 = r24
            r7 = r25
            goto L_0x01aa
        L_0x0174:
            if (r1 == 0) goto L_0x0179
            java.lang.String r1 = ""
            goto L_0x017b
        L_0x0179:
            r1 = r18
        L_0x017b:
            r7 = 0
            if (r4 == 0) goto L_0x0180
            r4 = r7
            goto L_0x0182
        L_0x0180:
            r4 = r19
        L_0x0182:
            if (r6 == 0) goto L_0x0186
            r6 = r7
            goto L_0x0188
        L_0x0186:
            r6 = r20
        L_0x0188:
            if (r8 == 0) goto L_0x018c
            r8 = r7
            goto L_0x018e
        L_0x018c:
            r8 = r21
        L_0x018e:
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0194
            r14 = r17
        L_0x0194:
            if (r15 == 0) goto L_0x0197
            goto L_0x0199
        L_0x0197:
            r17 = r23
        L_0x0199:
            if (r16 == 0) goto L_0x019d
            r13 = r7
            goto L_0x019f
        L_0x019d:
            r13 = r24
        L_0x019f:
            if (r2 == 0) goto L_0x01a2
            goto L_0x01a4
        L_0x01a2:
            r7 = r25
        L_0x01a4:
            if (r5 == 0) goto L_0x01aa
            kotlin.collections.EmptyList r2 = androidx.compose.p015ui.graphics.vector.C1583j.f3538a
            r3 = r3 & r9
            goto L_0x01ac
        L_0x01aa:
            r2 = r26
        L_0x01ac:
            r0.mo5419S()
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 r5 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$1.INSTANCE
            r9 = -548224868(0xffffffffdf52c09c, float:-1.518631E19)
            r0.mo5465u(r9)
            androidx.compose.runtime.c<?> r9 = r0.f2715a
            boolean r9 = r9 instanceof androidx.compose.p015ui.graphics.vector.C1579g
            if (r9 == 0) goto L_0x024e
            r0.mo5470w0()
            boolean r9 = r0.f2702K
            if (r9 == 0) goto L_0x01c8
            r0.mo5450m(r5)
            goto L_0x01cb
        L_0x01c8:
            r0.mo5452n()
        L_0x01cb:
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1 r5 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$1.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r1, r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2 r9 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$2.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r5, r9)
            java.lang.Float r5 = java.lang.Float.valueOf(r6)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3 r9 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$3.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r5, r9)
            java.lang.Float r5 = java.lang.Float.valueOf(r8)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4 r9 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$4.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r5, r9)
            java.lang.Float r5 = java.lang.Float.valueOf(r14)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5 r9 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$5.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r5, r9)
            java.lang.Float r5 = java.lang.Float.valueOf(r17)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6 r9 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$6.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r5, r9)
            java.lang.Float r5 = java.lang.Float.valueOf(r13)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7 r9 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$7.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r5, r9)
            java.lang.Float r5 = java.lang.Float.valueOf(r7)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8 r9 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$8.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r5, r9)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9 r5 = androidx.compose.p015ui.graphics.vector.VectorComposeKt$Group$2$9.INSTANCE
            androidx.compose.runtime.Updater.m2571b(r0, r2, r5)
            r5 = -983907633(0xffffffffc55ac2cf, float:-3500.1755)
            r0.mo5465u(r5)
            int r3 = r3 >> 27
            r3 = r3 & 14
            r5 = 0
            r9 = 1
            r18 = r3
            r19 = r27
            r20 = r0
            r21 = r5
            r22 = r9
            r23 = r5
            androidx.compose.animation.C0472h.m1247j(r18, r19, r20, r21, r22, r23)
            r9 = r2
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r14
            r6 = r17
            r8 = r7
            r7 = r13
        L_0x0238:
            androidx.compose.runtime.v0 r13 = r0.mo5421U()
            if (r13 != 0) goto L_0x023f
            goto L_0x024d
        L_0x023f:
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4 r14 = new androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
            r0 = r14
            r10 = r27
            r11 = r29
            r12 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f3081d = r14
        L_0x024d:
            return
        L_0x024e:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.vector.VectorComposeKt.m3385a(java.lang.String, float, float, float, float, float, float, float, java.util.List, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: b */
    public static final void m3386b(List<? extends C1556d> list, int i, String str, C1533m mVar, float f, C1533m mVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, C1302d dVar, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        List<? extends C1556d> list2 = list;
        int i10 = i6;
        C19383o.m32797g(list2, "pathData");
        ComposerImpl h = dVar.mo5440h(-1478270750);
        if ((i10 & 2) != 0) {
            EmptyList emptyList = C1583j.f3538a;
            i7 = 0;
        } else {
            i7 = i;
        }
        String str2 = (i10 & 4) != 0 ? "" : str;
        C1533m mVar3 = (i10 & 8) != 0 ? null : mVar;
        float f8 = (i10 & 16) != 0 ? 1.0f : f;
        C1533m mVar4 = (i10 & 32) != 0 ? null : mVar2;
        float f9 = (i10 & 64) != 0 ? 1.0f : f2;
        float f10 = (i10 & 128) != 0 ? 0.0f : f3;
        if ((i10 & 256) != 0) {
            EmptyList emptyList2 = C1583j.f3538a;
            i8 = 0;
        } else {
            i8 = i2;
        }
        if ((i10 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
            EmptyList emptyList3 = C1583j.f3538a;
            i9 = 0;
        } else {
            i9 = i3;
        }
        float f11 = (i10 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? 4.0f : f4;
        float f12 = (i10 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? 0.0f : f5;
        float f13 = (i10 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 1.0f : f6;
        float f14 = (i10 & 8192) != 0 ? 0.0f : f7;
        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = VectorComposeKt$Path$1.INSTANCE;
        h.mo5465u(1886828752);
        if (h.f2715a instanceof C1579g) {
            h.mo5470w0();
            if (h.f2702K) {
                h.mo5450m(new VectorComposeKt$Path9cdaXJ4$$inlined$ComposeNode$1(vectorComposeKt$Path$1));
            } else {
                h.mo5452n();
            }
            Updater.m2571b(h, str2, VectorComposeKt$Path$2$1.INSTANCE);
            Updater.m2571b(h, list2, VectorComposeKt$Path$2$2.INSTANCE);
            Updater.m2571b(h, new C1494c0(i7), VectorComposeKt$Path$2$3.INSTANCE);
            Updater.m2571b(h, mVar3, VectorComposeKt$Path$2$4.INSTANCE);
            Updater.m2571b(h, Float.valueOf(f8), VectorComposeKt$Path$2$5.INSTANCE);
            Updater.m2571b(h, mVar4, VectorComposeKt$Path$2$6.INSTANCE);
            Updater.m2571b(h, Float.valueOf(f9), VectorComposeKt$Path$2$7.INSTANCE);
            Updater.m2571b(h, Float.valueOf(f10), VectorComposeKt$Path$2$8.INSTANCE);
            Updater.m2571b(h, new C1536n0(i9), VectorComposeKt$Path$2$9.INSTANCE);
            Updater.m2571b(h, new C1534m0(i8), VectorComposeKt$Path$2$10.INSTANCE);
            Updater.m2571b(h, Float.valueOf(f11), VectorComposeKt$Path$2$11.INSTANCE);
            Updater.m2571b(h, Float.valueOf(f12), VectorComposeKt$Path$2$12.INSTANCE);
            Updater.m2571b(h, Float.valueOf(f13), VectorComposeKt$Path$2$13.INSTANCE);
            Updater.m2571b(h, Float.valueOf(f14), VectorComposeKt$Path$2$14.INSTANCE);
            h.mo5418R(true);
            h.mo5418R(false);
            C1418v0 U = h.mo5421U();
            if (U != null) {
                U.f3081d = new VectorComposeKt$Path$3(list, i7, str2, mVar3, f8, mVar4, f9, f10, i8, i9, f11, f12, f13, f14, i4, i5, i6);
                return;
            }
            return;
        }
        C0005b.m45j0();
        throw null;
    }
}
