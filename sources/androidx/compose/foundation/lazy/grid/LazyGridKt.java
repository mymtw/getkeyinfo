package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;

public final class LazyGridKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1811a(androidx.compose.p015ui.C1436d r26, androidx.compose.foundation.lazy.grid.LazyGridState r27, p753kq.C19861p<? super p174m0.C7282b, ? super p174m0.C7280a, ? extends java.util.List<java.lang.Integer>> r28, androidx.compose.foundation.layout.C0759v r29, boolean r30, boolean r31, androidx.compose.foundation.gestures.C0608f r32, boolean r33, androidx.compose.foundation.layout.C0718d.C0729k r34, androidx.compose.foundation.layout.C0718d.C0722d r35, p753kq.C19857l<java.lang.Object, kotlin.C19394m> r36, androidx.compose.runtime.C1302d r37, int r38, int r39, int r40) {
        /*
            r0 = r27
            r12 = r28
            r13 = r31
            r14 = r33
            r15 = r34
            r11 = r35
            r10 = r36
            r9 = r38
            r8 = r40
            java.lang.String r1 = "state"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.lang.String r1 = "slotSizesSums"
            kotlin.jvm.internal.C19383o.m32797g(r12, r1)
            java.lang.String r1 = "verticalArrangement"
            kotlin.jvm.internal.C19383o.m32797g(r15, r1)
            java.lang.String r1 = "horizontalArrangement"
            kotlin.jvm.internal.C19383o.m32797g(r11, r1)
            java.lang.String r1 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r10, r1)
            r1 = 152645664(0x9193020, float:1.8439333E-33)
            r2 = r37
            androidx.compose.runtime.ComposerImpl r7 = r2.mo5440h(r1)
            r1 = r8 & 1
            r16 = 4
            if (r1 == 0) goto L_0x0040
            r2 = r9 | 6
            r3 = r2
            r2 = r26
            goto L_0x0055
        L_0x0040:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x0052
            r2 = r26
            boolean r3 = r7.mo5408I(r2)
            if (r3 == 0) goto L_0x004f
            r3 = r16
            goto L_0x0050
        L_0x004f:
            r3 = 2
        L_0x0050:
            r3 = r3 | r9
            goto L_0x0055
        L_0x0052:
            r2 = r26
            r3 = r9
        L_0x0055:
            r4 = r8 & 2
            if (r4 == 0) goto L_0x005c
            r3 = r3 | 48
            goto L_0x006c
        L_0x005c:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x006c
            boolean r4 = r7.mo5408I(r0)
            if (r4 == 0) goto L_0x0069
            r4 = 32
            goto L_0x006b
        L_0x0069:
            r4 = 16
        L_0x006b:
            r3 = r3 | r4
        L_0x006c:
            r4 = r8 & 4
            if (r4 == 0) goto L_0x0073
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0083
        L_0x0073:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0083
            boolean r4 = r7.mo5408I(r12)
            if (r4 == 0) goto L_0x0080
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0082
        L_0x0080:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0082:
            r3 = r3 | r4
        L_0x0083:
            r4 = r8 & 8
            if (r4 == 0) goto L_0x008a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x009e
        L_0x008a:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x009e
            r5 = r29
            boolean r17 = r7.mo5408I(r5)
            if (r17 == 0) goto L_0x0099
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x009b
        L_0x0099:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x009b:
            r3 = r3 | r17
            goto L_0x00a0
        L_0x009e:
            r5 = r29
        L_0x00a0:
            r17 = r8 & 16
            if (r17 == 0) goto L_0x00a9
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r6 = r30
            goto L_0x00bf
        L_0x00a9:
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r9 & r18
            r6 = r30
            if (r18 != 0) goto L_0x00bf
            boolean r18 = r7.mo5427a(r6)
            if (r18 == 0) goto L_0x00bb
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00bd
        L_0x00bb:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00bd:
            r3 = r3 | r18
        L_0x00bf:
            r18 = r8 & 32
            if (r18 == 0) goto L_0x00c6
            r18 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00d7
        L_0x00c6:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r9 & r18
            if (r18 != 0) goto L_0x00d9
            boolean r18 = r7.mo5427a(r13)
            if (r18 == 0) goto L_0x00d5
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d7
        L_0x00d5:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00d7:
            r3 = r3 | r18
        L_0x00d9:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r9 & r18
            if (r18 != 0) goto L_0x00f3
            r18 = r8 & 64
            r2 = r32
            if (r18 != 0) goto L_0x00ee
            boolean r18 = r7.mo5408I(r2)
            if (r18 == 0) goto L_0x00ee
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f0
        L_0x00ee:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00f0:
            r3 = r3 | r18
            goto L_0x00f5
        L_0x00f3:
            r2 = r32
        L_0x00f5:
            r2 = r8 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00fc
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x010c
        L_0x00fc:
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r9
            if (r2 != 0) goto L_0x010d
            boolean r2 = r7.mo5427a(r14)
            if (r2 == 0) goto L_0x010a
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r3 = r3 | r2
        L_0x010d:
            r2 = r8 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0114
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x0124
        L_0x0114:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r9
            if (r2 != 0) goto L_0x0125
            boolean r2 = r7.mo5408I(r15)
            if (r2 == 0) goto L_0x0122
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0124
        L_0x0122:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0124:
            r3 = r3 | r2
        L_0x0125:
            r2 = r8 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x012c
            r2 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x013c
        L_0x012c:
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r9
            if (r2 != 0) goto L_0x013d
            boolean r2 = r7.mo5408I(r11)
            if (r2 == 0) goto L_0x013a
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r3 = r3 | r2
        L_0x013d:
            r2 = r8 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0144
            r2 = r39 | 6
            goto L_0x0157
        L_0x0144:
            r2 = r39 & 14
            if (r2 != 0) goto L_0x0155
            boolean r2 = r7.mo5408I(r10)
            if (r2 == 0) goto L_0x0151
            r2 = r16
            goto L_0x0152
        L_0x0151:
            r2 = 2
        L_0x0152:
            r2 = r39 | r2
            goto L_0x0157
        L_0x0155:
            r2 = r39
        L_0x0157:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r3 & r18
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x017c
            r2 = r2 & 11
            r5 = 2
            if (r2 != r5) goto L_0x017c
            boolean r2 = r7.mo5442i()
            if (r2 != 0) goto L_0x016d
            goto L_0x017c
        L_0x016d:
            r7.mo5396C()
            r2 = r26
            r5 = r29
            r6 = r30
            r8 = r32
            r12 = r7
            r10 = r13
            goto L_0x0473
        L_0x017c:
            r7.mo5466u0()
            r2 = r9 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r6 = 0
            if (r2 == 0) goto L_0x019f
            boolean r2 = r7.mo5425Y()
            if (r2 == 0) goto L_0x018e
            goto L_0x019f
        L_0x018e:
            r7.mo5396C()
            r1 = r8 & 64
            if (r1 == 0) goto L_0x0196
            r3 = r3 & r5
        L_0x0196:
            r5 = r26
            r17 = r29
            r4 = r30
            r18 = r32
            goto L_0x01ca
        L_0x019f:
            if (r1 == 0) goto L_0x01a4
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x01a6
        L_0x01a4:
            r1 = r26
        L_0x01a6:
            if (r4 == 0) goto L_0x01af
            float r2 = (float) r6
            androidx.compose.foundation.layout.w r4 = new androidx.compose.foundation.layout.w
            r4.<init>(r2, r2, r2, r2)
            goto L_0x01b1
        L_0x01af:
            r4 = r29
        L_0x01b1:
            if (r17 == 0) goto L_0x01b5
            r2 = r6
            goto L_0x01b7
        L_0x01b5:
            r2 = r30
        L_0x01b7:
            r17 = r8 & 64
            if (r17 == 0) goto L_0x01c4
            androidx.compose.foundation.gestures.a r17 = kotlin.reflect.C19421p.m32919I(r7)
            r3 = r3 & r5
            r5 = r1
            r18 = r17
            goto L_0x01c7
        L_0x01c4:
            r18 = r32
            r5 = r1
        L_0x01c7:
            r17 = r4
            r4 = r2
        L_0x01ca:
            r7.mo5419S()
            androidx.compose.foundation.w r2 = kotlin.reflect.C19421p.m32934b0(r7)
            r19 = 3
            r1 = 1895482293(0x70fac3b5, float:6.208628E29)
            r7.mo5465u(r1)
            androidx.compose.runtime.j0 r1 = androidx.compose.foundation.layout.C0761x.m1664E0(r10, r7)
            r6 = 1157296644(0x44faf204, float:2007.563)
            r7.mo5465u(r6)
            boolean r21 = r7.mo5408I(r0)
            java.lang.Object r6 = r7.mo5431c0()
            if (r21 != 0) goto L_0x01f5
            androidx.compose.runtime.d$a$a r14 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r6 != r14) goto L_0x01f2
            goto L_0x01f5
        L_0x01f2:
            r30 = r5
            goto L_0x022d
        L_0x01f5:
            androidx.compose.runtime.j1 r6 = androidx.compose.runtime.snapshots.SnapshotKt.f2988b
            java.lang.Object r6 = r6.mo5886c()
            androidx.compose.runtime.snapshots.f r6 = (androidx.compose.runtime.snapshots.C1385f) r6
            r30 = r5
            r5 = 0
            r14 = 0
            androidx.compose.runtime.snapshots.f r6 = androidx.compose.runtime.snapshots.SnapshotKt.m2908g(r6, r14, r5)
            androidx.compose.runtime.snapshots.f r5 = r6.mo6001i()     // Catch:{ all -> 0x04a1 }
            int r14 = r27.mo4313e()     // Catch:{ all -> 0x049c }
            int r14 = r14 / 90
            int r14 = r14 * 90
            int r8 = r14 + -200
            r9 = 0
            int r8 = java.lang.Math.max(r8, r9)     // Catch:{ all -> 0x049c }
            int r14 = r14 + 90
            int r14 = r14 + 200
            pq.i r8 = kotlin.jvm.internal.C19388s.m32816D0(r8, r14)     // Catch:{ all -> 0x049c }
            androidx.compose.runtime.snapshots.C1385f.m2974o(r5)     // Catch:{ all -> 0x04a1 }
            r6.mo5930c()
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = androidx.compose.foundation.layout.C0761x.m1751w0(r8, androidx.compose.runtime.C1351n1.f2948a)
            r7.mo5407H0(r6)
        L_0x022d:
            r5 = 0
            r7.mo5418R(r5)
            androidx.compose.runtime.j0 r6 = (androidx.compose.runtime.C1338j0) r6
            androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1 r5 = new androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1
            r14 = 0
            r5.<init>(r0, r6, r14)
            androidx.compose.runtime.C1415u.m3031e(r6, r5, r7)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r7.mo5465u(r5)
            boolean r5 = r7.mo5408I(r6)
            java.lang.Object r8 = r7.mo5431c0()
            if (r5 != 0) goto L_0x0250
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r8 != r5) goto L_0x0261
        L_0x0250:
            androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl r8 = new androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl
            androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$2$1 r5 = new androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$2$1
            r5.<init>(r1, r6)
            androidx.compose.runtime.DerivedSnapshotState r1 = androidx.compose.foundation.layout.C0761x.m1687Q(r5)
            r8.<init>(r1)
            r7.mo5407H0(r8)
        L_0x0261:
            r1 = 0
            r7.mo5418R(r1)
            r9 = r8
            androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl r9 = (androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl) r9
            r7.mo5418R(r1)
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r7.mo5465u(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo5465u(r1)
            java.lang.Object r1 = r7.mo5431c0()
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r5) goto L_0x028e
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.internal.f r1 = androidx.compose.runtime.C1415u.m3034h(r1, r7)
            androidx.compose.runtime.m r6 = new androidx.compose.runtime.m
            r6.<init>(r1)
            r7.mo5407H0(r6)
            r1 = r6
        L_0x028e:
            r6 = 0
            r7.mo5418R(r6)
            androidx.compose.runtime.m r1 = (androidx.compose.runtime.C1346m) r1
            kotlinx.coroutines.d0 r8 = r1.f2939b
            r7.mo5418R(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r31)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.mo5465u(r6)
            boolean r6 = r7.mo5408I(r0)
            boolean r1 = r7.mo5408I(r1)
            r1 = r1 | r6
            java.lang.Object r6 = r7.mo5431c0()
            if (r1 != 0) goto L_0x02b4
            if (r6 != r5) goto L_0x02bc
        L_0x02b4:
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r6 = new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator
            r6.<init>(r8, r13)
            r7.mo5407H0(r6)
        L_0x02bc:
            r1 = 0
            r7.mo5418R(r1)
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r6 = (androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator) r6
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r0.f1689q
            r1.setValue(r6)
            r5 = r3 & 112(0x70, float:1.57E-43)
            r1 = 1958911962(0x74c29fda, float:1.2335788E32)
            r7.mo5465u(r1)
            r1 = 9
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r20 = 0
            r3[r20] = r0
            r21 = 1
            r3[r21] = r2
            r22 = 2
            r3[r22] = r12
            r3[r19] = r17
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r4)
            r3[r16] = r23
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r31)
            r14 = 5
            r3[r14] = r23
            r23 = 6
            r3[r23] = r11
            r23 = 7
            r3[r23] = r15
            r23 = 8
            r3[r23] = r6
            r14 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r7.mo5465u(r14)
            r14 = r20
            r23 = r14
        L_0x0304:
            if (r14 >= r1) goto L_0x0313
            r1 = r3[r14]
            boolean r1 = r7.mo5408I(r1)
            r23 = r23 | r1
            int r14 = r14 + 1
            r1 = 9
            goto L_0x0304
        L_0x0313:
            java.lang.Object r1 = r7.mo5431c0()
            if (r23 != 0) goto L_0x0328
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r3) goto L_0x031e
            goto L_0x0328
        L_0x031e:
            r37 = r2
            r23 = r4
            r15 = r5
            r12 = r7
            r24 = r8
            r13 = r9
            goto L_0x0353
        L_0x0328:
            androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1 r14 = new androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
            r1 = r14
            r3 = r2
            r2 = r31
            r37 = r3
            r3 = r17
            r23 = r4
            r12 = r30
            r15 = r5
            r5 = r27
            r12 = r20
            r20 = r6
            r6 = r9
            r12 = r7
            r7 = r28
            r24 = r8
            r8 = r34
            r13 = r9
            r9 = r35
            r10 = r20
            r11 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.mo5407H0(r14)
            r1 = r14
        L_0x0353:
            r2 = 0
            r12.mo5418R(r2)
            r9 = r1
            kq.p r9 = (p753kq.C19861p) r9
            r12.mo5418R(r2)
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r0.f1679g
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r31)
            r1.setValue(r2)
            m1812b(r13, r0, r12, r15)
            r10 = r31
            r11 = r13
            if (r10 == 0) goto L_0x0371
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0373
        L_0x0371:
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0373:
            r8 = r1
            androidx.compose.foundation.lazy.grid.LazyGridState$a r1 = r0.f1686n
            r13 = r30
            androidx.compose.ui.d r1 = r13.mo6148i0(r1)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r2 = r0.f1687o
            androidx.compose.ui.d r14 = r1.mo6148i0(r2)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r14, r1)
            java.lang.String r1 = "itemProvider"
            kotlin.jvm.internal.C19383o.m32797g(r11, r1)
            java.lang.String r1 = "coroutineScope"
            r2 = r24
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            r1 = 1364424801(0x51537861, float:5.6766108E10)
            r12.mo5465u(r1)
            r1 = 5
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r11
            r3[r21] = r0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r31)
            r3[r22] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r23)
            r3[r19] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r33)
            r3[r16] = r4
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r12.mo5465u(r4)
            r4 = 0
            r6 = 0
        L_0x03bb:
            if (r6 >= r1) goto L_0x03c7
            r5 = r3[r6]
            boolean r5 = r12.mo5408I(r5)
            r4 = r4 | r5
            int r6 = r6 + 1
            goto L_0x03bb
        L_0x03c7:
            java.lang.Object r1 = r12.mo5431c0()
            if (r4 != 0) goto L_0x03d8
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r3) goto L_0x03d2
            goto L_0x03d8
        L_0x03d2:
            r30 = r13
            r15 = r23
            r2 = 0
            goto L_0x041d
        L_0x03d8:
            androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1 r3 = new androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$indexForKeyMapping$1
            r3.<init>(r11)
            androidx.compose.ui.semantics.h r4 = new androidx.compose.ui.semantics.h
            androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1 r1 = new androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$1
            r1.<init>(r0)
            androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2 r5 = new androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$accessibilityScrollState$2
            r5.<init>(r0, r11)
            r15 = r23
            r4.<init>(r1, r5, r15)
            r1 = 0
            if (r33 == 0) goto L_0x03f7
            androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1 r5 = new androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollByAction$1
            r5.<init>(r10, r2, r0)
            goto L_0x03f8
        L_0x03f7:
            r5 = r1
        L_0x03f8:
            if (r33 == 0) goto L_0x03ff
            androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1 r1 = new androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$scrollToIndexAction$1
            r1.<init>(r0, r2)
        L_0x03ff:
            r6 = r1
            androidx.compose.ui.semantics.b r7 = new androidx.compose.ui.semantics.b
            r1 = -1
            r7.<init>(r1, r1)
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$1 r1 = new androidx.compose.foundation.lazy.grid.LazySemanticsKt$lazyGridSemantics$1$1
            r26 = r1
            r30 = r13
            r13 = r2
            r2 = r3
            r3 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2 = 0
            androidx.compose.ui.d r1 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r13, r2, r1)
            r12.mo5407H0(r1)
        L_0x041d:
            r12.mo5418R(r2)
            androidx.compose.ui.d r1 = (androidx.compose.p015ui.C1436d) r1
            androidx.compose.ui.d r1 = r14.mo6148i0(r1)
            r12.mo5418R(r2)
            androidx.compose.ui.d r1 = androidx.compose.foundation.C0621i.m1438a(r1, r8)
            r4 = r37
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25275D0(r1, r4)
            r2 = -1163690407(0xffffffffbaa37e59, float:-0.0012473568)
            r12.mo5465u(r2)
            r2 = r15 ^ 1
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r3 = r12.mo5410J(r3)
            androidx.compose.ui.unit.LayoutDirection r5 = androidx.compose.p015ui.unit.LayoutDirection.Rtl
            if (r3 != r5) goto L_0x0448
            r6 = r21
            goto L_0x0449
        L_0x0448:
            r6 = 0
        L_0x0449:
            if (r6 == 0) goto L_0x044f
            if (r10 != 0) goto L_0x044f
            r2 = r2 ^ 1
        L_0x044f:
            r6 = r2
            r2 = 0
            r12.mo5418R(r2)
            androidx.compose.foundation.interaction.k r13 = r0.f1675c
            r2 = r27
            r3 = r8
            r5 = r33
            r7 = r18
            r8 = r13
            androidx.compose.ui.d r3 = androidx.compose.foundation.gestures.ScrollableKt.m1398b(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.foundation.lazy.layout.h r4 = r0.f1692t
            r7 = 0
            r8 = 0
            r2 = r11
            r5 = r9
            r6 = r12
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.m1863a(r2, r3, r4, r5, r6, r7, r8)
            r2 = r30
            r6 = r15
            r5 = r17
            r8 = r18
        L_0x0473:
            androidx.compose.runtime.v0 r15 = r12.mo5421U()
            if (r15 != 0) goto L_0x047a
            goto L_0x049b
        L_0x047a:
            androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$2 r14 = new androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$2
            r1 = r14
            r3 = r27
            r4 = r28
            r7 = r31
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r38
            r0 = r14
            r14 = r39
            r25 = r15
            r15 = r40
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r25
            r1.f3081d = r0
        L_0x049b:
            return
        L_0x049c:
            r0 = move-exception
            androidx.compose.runtime.snapshots.C1385f.m2974o(r5)     // Catch:{ all -> 0x04a1 }
            throw r0     // Catch:{ all -> 0x04a1 }
        L_0x04a1:
            r0 = move-exception
            r6.mo5930c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.m1811a(androidx.compose.ui.d, androidx.compose.foundation.lazy.grid.LazyGridState, kq.p, androidx.compose.foundation.layout.v, boolean, boolean, androidx.compose.foundation.gestures.f, boolean, androidx.compose.foundation.layout.d$k, androidx.compose.foundation.layout.d$d, kq.l, androidx.compose.runtime.d, int, int, int):void");
    }

    /* renamed from: b */
    public static final void m1812b(C0807i iVar, LazyGridState lazyGridState, C1302d dVar, int i) {
        int i2;
        ComposerImpl h = dVar.mo5440h(950944068);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(lazyGridState) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.mo5442i()) {
            h.mo5396C();
        } else if (iVar.getItemCount() > 0) {
            lazyGridState.mo4317i(iVar);
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LazyGridKt$ScrollPositionUpdater$1(iVar, lazyGridState, i);
        }
    }
}
