package androidx.compose.foundation.lazy;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;

public final class LazyListKt {
    /* JADX WARNING: type inference failed for: r6v11, types: [kq.l] */
    /* JADX WARNING: type inference failed for: r1v49, types: [androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0129  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1784a(androidx.compose.p015ui.C1436d r29, androidx.compose.foundation.lazy.LazyListState r30, androidx.compose.foundation.layout.C0759v r31, boolean r32, boolean r33, androidx.compose.foundation.gestures.C0608f r34, boolean r35, androidx.compose.p015ui.C1428a.C1430b r36, androidx.compose.foundation.layout.C0718d.C0729k r37, androidx.compose.p015ui.C1428a.C1431c r38, androidx.compose.foundation.layout.C0718d.C0722d r39, p753kq.C19857l<? super androidx.compose.foundation.lazy.C0859r, kotlin.C19394m> r40, androidx.compose.runtime.C1302d r41, int r42, int r43, int r44) {
        /*
            r0 = r29
            r14 = r30
            r15 = r31
            r13 = r32
            r12 = r33
            r11 = r34
            r10 = r35
            r9 = r40
            r8 = r42
            r7 = r44
            java.lang.String r1 = "modifier"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.lang.String r1 = "state"
            kotlin.jvm.internal.C19383o.m32797g(r14, r1)
            java.lang.String r1 = "contentPadding"
            kotlin.jvm.internal.C19383o.m32797g(r15, r1)
            java.lang.String r1 = "flingBehavior"
            kotlin.jvm.internal.C19383o.m32797g(r11, r1)
            java.lang.String r1 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r9, r1)
            r1 = 955299798(0x38f0b7d6, float:1.1478334E-4)
            r2 = r41
            androidx.compose.runtime.ComposerImpl r6 = r2.mo5440h(r1)
            r1 = r7 & 1
            r16 = 2
            if (r1 == 0) goto L_0x003f
            r1 = r8 | 6
            goto L_0x0050
        L_0x003f:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x004f
            boolean r1 = r6.mo5408I(r0)
            if (r1 == 0) goto L_0x004b
            r1 = 4
            goto L_0x004d
        L_0x004b:
            r1 = r16
        L_0x004d:
            r1 = r1 | r8
            goto L_0x0050
        L_0x004f:
            r1 = r8
        L_0x0050:
            r2 = r7 & 2
            if (r2 == 0) goto L_0x0057
            r1 = r1 | 48
            goto L_0x0067
        L_0x0057:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0067
            boolean r2 = r6.mo5408I(r14)
            if (r2 == 0) goto L_0x0064
            r2 = 32
            goto L_0x0066
        L_0x0064:
            r2 = 16
        L_0x0066:
            r1 = r1 | r2
        L_0x0067:
            r2 = r7 & 4
            if (r2 == 0) goto L_0x006e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x007e
        L_0x006e:
            r2 = r8 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x007e
            boolean r2 = r6.mo5408I(r15)
            if (r2 == 0) goto L_0x007b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x007d
        L_0x007b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x007d:
            r1 = r1 | r2
        L_0x007e:
            r2 = r7 & 8
            if (r2 == 0) goto L_0x0085
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0095
        L_0x0085:
            r2 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0095
            boolean r2 = r6.mo5427a(r13)
            if (r2 == 0) goto L_0x0092
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0094
        L_0x0092:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0094:
            r1 = r1 | r2
        L_0x0095:
            r2 = r7 & 16
            if (r2 == 0) goto L_0x009c
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ae
        L_0x009c:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00ae
            boolean r2 = r6.mo5427a(r12)
            if (r2 == 0) goto L_0x00ab
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ad
        L_0x00ab:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00ad:
            r1 = r1 | r2
        L_0x00ae:
            r2 = r7 & 32
            if (r2 == 0) goto L_0x00b5
            r2 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00c5
        L_0x00b5:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00c6
            boolean r2 = r6.mo5408I(r11)
            if (r2 == 0) goto L_0x00c3
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r1 = r1 | r2
        L_0x00c6:
            r2 = r7 & 64
            if (r2 == 0) goto L_0x00cd
            r2 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00dd
        L_0x00cd:
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r8
            if (r2 != 0) goto L_0x00de
            boolean r2 = r6.mo5427a(r10)
            if (r2 == 0) goto L_0x00db
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r1 = r1 | r2
        L_0x00de:
            r2 = r7 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00e9
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r17
            r3 = r36
            goto L_0x00fe
        L_0x00e9:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r8 & r17
            r3 = r36
            if (r17 != 0) goto L_0x00fe
            boolean r17 = r6.mo5408I(r3)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r17
        L_0x00fe:
            r4 = r7 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0109
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r18
            r5 = r37
            goto L_0x011e
        L_0x0109:
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r18 = r8 & r18
            r5 = r37
            if (r18 != 0) goto L_0x011e
            boolean r19 = r6.mo5408I(r5)
            if (r19 == 0) goto L_0x011a
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r1 = r1 | r19
        L_0x011e:
            r3 = r7 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0129
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r19
            r5 = r38
            goto L_0x013e
        L_0x0129:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r8 & r19
            r5 = r38
            if (r19 != 0) goto L_0x013e
            boolean r19 = r6.mo5408I(r5)
            if (r19 == 0) goto L_0x013a
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r1 = r1 | r19
        L_0x013e:
            r5 = r7 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0147
            r19 = r43 | 6
            r8 = r39
            goto L_0x015d
        L_0x0147:
            r19 = r43 & 14
            r8 = r39
            if (r19 != 0) goto L_0x015b
            boolean r19 = r6.mo5408I(r8)
            if (r19 == 0) goto L_0x0156
            r19 = 4
            goto L_0x0158
        L_0x0156:
            r19 = r16
        L_0x0158:
            r19 = r43 | r19
            goto L_0x015d
        L_0x015b:
            r19 = r43
        L_0x015d:
            r8 = r7 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0164
            r19 = r19 | 48
            goto L_0x0175
        L_0x0164:
            r8 = r43 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0175
            boolean r8 = r6.mo5408I(r9)
            if (r8 == 0) goto L_0x0171
            r17 = 32
            goto L_0x0173
        L_0x0171:
            r17 = 16
        L_0x0173:
            r19 = r19 | r17
        L_0x0175:
            r8 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r8 & r1
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r7) goto L_0x019c
            r7 = r19 & 91
            r8 = 18
            if (r7 != r8) goto L_0x019c
            boolean r7 = r6.mo5442i()
            if (r7 != 0) goto L_0x018b
            goto L_0x019c
        L_0x018b:
            r6.mo5396C()
            r9 = r36
            r19 = r37
            r11 = r38
            r0 = r12
            r15 = r13
            r10 = r14
            r12 = r39
            r14 = r6
            goto L_0x0530
        L_0x019c:
            r8 = 0
            if (r2 == 0) goto L_0x01a2
            r17 = r8
            goto L_0x01a4
        L_0x01a2:
            r17 = r36
        L_0x01a4:
            if (r4 == 0) goto L_0x01a9
            r19 = r8
            goto L_0x01ab
        L_0x01a9:
            r19 = r37
        L_0x01ab:
            if (r3 == 0) goto L_0x01b0
            r20 = r8
            goto L_0x01b2
        L_0x01b0:
            r20 = r38
        L_0x01b2:
            if (r5 == 0) goto L_0x01b7
            r21 = r8
            goto L_0x01b9
        L_0x01b7:
            r21 = r39
        L_0x01b9:
            androidx.compose.foundation.w r7 = kotlin.reflect.C19421p.m32934b0(r6)
            r2 = -619676707(0xffffffffdb107bdd, float:-4.0668586E16)
            r6.mo5465u(r2)
            r22 = 3
            androidx.compose.runtime.j0 r2 = androidx.compose.foundation.layout.C0761x.m1664E0(r9, r6)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r6.mo5465u(r3)
            boolean r4 = r6.mo5408I(r14)
            java.lang.Object r5 = r6.mo5431c0()
            r3 = 0
            if (r4 != 0) goto L_0x01de
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r5 != r4) goto L_0x0211
        L_0x01de:
            androidx.compose.runtime.j1 r4 = androidx.compose.runtime.snapshots.SnapshotKt.f2988b
            java.lang.Object r4 = r4.mo5886c()
            androidx.compose.runtime.snapshots.f r4 = (androidx.compose.runtime.snapshots.C1385f) r4
            androidx.compose.runtime.snapshots.f r4 = androidx.compose.runtime.snapshots.SnapshotKt.m2908g(r4, r8, r3)
            androidx.compose.runtime.snapshots.f r5 = r4.mo6001i()     // Catch:{ all -> 0x0563 }
            int r23 = r30.mo4224e()     // Catch:{ all -> 0x055e }
            int r23 = r23 / 30
            int r23 = r23 * 30
            int r8 = r23 + -100
            int r8 = java.lang.Math.max(r8, r3)     // Catch:{ all -> 0x055e }
            int r23 = r23 + 30
            int r3 = r23 + 100
            pq.i r3 = kotlin.jvm.internal.C19388s.m32816D0(r8, r3)     // Catch:{ all -> 0x055e }
            androidx.compose.runtime.snapshots.C1385f.m2974o(r5)     // Catch:{ all -> 0x0563 }
            r4.mo5930c()
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = androidx.compose.foundation.layout.C0761x.m1751w0(r3, androidx.compose.runtime.C1351n1.f2948a)
            r6.mo5407H0(r5)
        L_0x0211:
            r3 = 0
            r6.mo5418R(r3)
            androidx.compose.runtime.j0 r5 = (androidx.compose.runtime.C1338j0) r5
            androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1 r3 = new androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$1
            r8 = 0
            r3.<init>(r14, r5, r8)
            androidx.compose.runtime.C1415u.m3031e(r5, r3, r6)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r6.mo5465u(r3)
            boolean r3 = r6.mo5408I(r5)
            java.lang.Object r4 = r6.mo5431c0()
            if (r3 != 0) goto L_0x0234
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r3) goto L_0x0245
        L_0x0234:
            androidx.compose.foundation.lazy.LazyListItemProviderImpl r4 = new androidx.compose.foundation.lazy.LazyListItemProviderImpl
            androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$2$1 r3 = new androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$2$1
            r3.<init>(r2, r5)
            androidx.compose.runtime.DerivedSnapshotState r2 = androidx.compose.foundation.layout.C0761x.m1687Q(r3)
            r4.<init>(r2)
            r6.mo5407H0(r4)
        L_0x0245:
            r2 = 0
            r6.mo5418R(r2)
            r5 = r4
            androidx.compose.foundation.lazy.LazyListItemProviderImpl r5 = (androidx.compose.foundation.lazy.LazyListItemProviderImpl) r5
            r6.mo5418R(r2)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo5465u(r2)
            java.lang.Object r3 = r6.mo5431c0()
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r4) goto L_0x0265
            androidx.compose.foundation.lazy.f r3 = new androidx.compose.foundation.lazy.f
            r3.<init>()
            r6.mo5407H0(r3)
        L_0x0265:
            r8 = 0
            r6.mo5418R(r8)
            r8 = r3
            androidx.compose.foundation.lazy.f r8 = (androidx.compose.foundation.lazy.C0779f) r8
            r3 = 773894976(0x2e20b340, float:3.6538994E-11)
            r6.mo5465u(r3)
            r6.mo5465u(r2)
            java.lang.Object r2 = r6.mo5431c0()
            if (r2 != r4) goto L_0x028a
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.internal.f r2 = androidx.compose.runtime.C1415u.m3034h(r2, r6)
            androidx.compose.runtime.m r3 = new androidx.compose.runtime.m
            r3.<init>(r2)
            r6.mo5407H0(r3)
            r2 = r3
        L_0x028a:
            r3 = 0
            r6.mo5418R(r3)
            androidx.compose.runtime.m r2 = (androidx.compose.runtime.C1346m) r2
            kotlinx.coroutines.d0 r2 = r2.f2939b
            r6.mo5418R(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r33)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.mo5465u(r0)
            boolean r23 = r6.mo5408I(r14)
            boolean r3 = r6.mo5408I(r3)
            r3 = r23 | r3
            java.lang.Object r0 = r6.mo5431c0()
            if (r3 != 0) goto L_0x02b1
            if (r0 != r4) goto L_0x02b9
        L_0x02b1:
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r0 = new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator
            r0.<init>(r2, r12)
            r6.mo5407H0(r0)
        L_0x02b9:
            r3 = 0
            r6.mo5418R(r3)
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r0 = (androidx.compose.foundation.lazy.LazyListItemPlacementAnimator) r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r14.f1614n
            r3.setValue(r0)
            r4 = r1 & 112(0x70, float:1.57E-43)
            r1 = -1404987696(0xffffffffac4196d0, float:-2.7510667E-12)
            r6.mo5465u(r1)
            r1 = 11
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r23 = 0
            r3[r23] = r14
            r24 = 1
            r3[r24] = r8
            r3[r16] = r7
            r3[r22] = r15
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r32)
            r18 = 4
            r3[r18] = r25
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r33)
            r1 = 5
            r3[r1] = r25
            r25 = 6
            r3[r25] = r17
            r25 = 7
            r3[r25] = r20
            r25 = 8
            r3[r25] = r21
            r25 = 9
            r3[r25] = r19
            r25 = 10
            r3[r25] = r0
            r15 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r6.mo5465u(r15)
            r1 = r23
            r25 = r1
        L_0x0309:
            r15 = 11
            if (r1 >= r15) goto L_0x0318
            r15 = r3[r1]
            boolean r15 = r6.mo5408I(r15)
            r25 = r25 | r15
            int r1 = r1 + 1
            goto L_0x0309
        L_0x0318:
            java.lang.Object r1 = r6.mo5431c0()
            if (r25 != 0) goto L_0x0332
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r3) goto L_0x0323
            goto L_0x0332
        L_0x0323:
            r26 = r2
            r27 = r4
            r38 = r5
            r14 = r6
            r39 = r7
            r41 = r8
            r0 = r12
            r18 = 0
            goto L_0x0364
        L_0x0332:
            androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1 r15 = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
            r3 = 5
            r1 = r15
            r26 = r2
            r2 = r33
            r14 = r23
            r3 = r31
            r27 = r4
            r4 = r32
            r38 = r5
            r5 = r30
            r14 = r6
            r6 = r38
            r39 = r7
            r7 = r19
            r41 = r8
            r18 = 0
            r8 = r21
            r9 = r0
            r10 = r41
            r11 = r17
            r0 = r12
            r12 = r20
            r13 = r39
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.mo5407H0(r15)
            r1 = r15
        L_0x0364:
            r2 = 0
            r14.mo5418R(r2)
            r9 = r1
            kq.p r9 = (p753kq.C19861p) r9
            r14.mo5418R(r2)
            r10 = r30
            r11 = r38
            r8 = r2
            r1 = r27
            m1785b(r11, r10, r14, r1)
            if (r0 == 0) goto L_0x037d
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x037f
        L_0x037d:
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x037f:
            r12 = r1
            androidx.compose.foundation.lazy.LazyListState$a r1 = r10.f1612l
            r15 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13 = r29
            androidx.compose.ui.d r1 = r13.mo6148i0(r1)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r2 = r10.f1613m
            androidx.compose.ui.d r7 = r1.mo6148i0(r2)
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r7, r6)
            java.lang.String r1 = "itemProvider"
            kotlin.jvm.internal.C19383o.m32797g(r11, r1)
            java.lang.String r1 = "coroutineScope"
            r2 = r26
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            r1 = -1728067365(0xffffffff98ffc8db, float:-6.6118767E-24)
            r14.mo5465u(r1)
            r1 = 5
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r8] = r11
            r3[r24] = r10
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r33)
            r3[r16] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r32)
            r3[r22] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r35)
            r5 = 4
            r3[r5] = r4
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.mo5465u(r4)
            r4 = r8
            r23 = r4
        L_0x03cb:
            if (r4 >= r1) goto L_0x03d9
            r1 = r3[r4]
            boolean r1 = r14.mo5408I(r1)
            r23 = r23 | r1
            int r4 = r4 + 1
            r1 = 5
            goto L_0x03cb
        L_0x03d9:
            java.lang.Object r1 = r14.mo5431c0()
            if (r23 != 0) goto L_0x03ec
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r3) goto L_0x03e4
            goto L_0x03ec
        L_0x03e4:
            r15 = r32
            r13 = r6
            r2 = r8
            r18 = r9
            r9 = r7
            goto L_0x0449
        L_0x03ec:
            androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1 r3 = new androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1
            r3.<init>(r11)
            androidx.compose.ui.semantics.h r4 = new androidx.compose.ui.semantics.h
            androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1 r1 = new androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1
            r1.<init>(r10)
            androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2 r5 = new androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2
            r5.<init>(r10, r11)
            r15 = r32
            r4.<init>(r1, r5, r15)
            if (r35 == 0) goto L_0x040b
            androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1 r1 = new androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1
            r1.<init>(r0, r2, r10)
            r5 = r1
            goto L_0x040d
        L_0x040b:
            r5 = r18
        L_0x040d:
            if (r35 == 0) goto L_0x0416
            androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1 r1 = new androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1
            r1.<init>(r10, r2)
            r18 = r1
        L_0x0416:
            androidx.compose.ui.semantics.b r2 = new androidx.compose.ui.semantics.b
            if (r0 == 0) goto L_0x041c
            r1 = -1
            goto L_0x041e
        L_0x041c:
            r1 = r24
        L_0x041e:
            if (r0 == 0) goto L_0x0423
            r8 = r24
            goto L_0x0427
        L_0x0423:
            r23 = -1
            r8 = r23
        L_0x0427:
            r2.<init>(r1, r8)
            androidx.compose.ui.d$a r8 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$1 r1 = new androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$1
            r23 = r1
            r25 = r2
            r2 = r3
            r3 = r33
            r13 = 4
            r13 = r6
            r6 = r18
            r18 = r9
            r9 = r7
            r7 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2 = 0
            androidx.compose.ui.d r1 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r8, r2, r1)
            r14.mo5407H0(r1)
        L_0x0449:
            r14.mo5418R(r2)
            androidx.compose.ui.d r1 = (androidx.compose.p015ui.C1436d) r1
            androidx.compose.ui.d r1 = r9.mo6148i0(r1)
            r14.mo5418R(r2)
            androidx.compose.ui.d r1 = androidx.compose.foundation.C0621i.m1438a(r1, r12)
            kotlin.jvm.internal.C19383o.m32797g(r1, r13)
            java.lang.String r2 = "beyondBoundsInfo"
            r3 = r41
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            r2 = 1245943849(0x4a439829, float:3204618.2)
            r14.mo5465u(r2)
            androidx.compose.runtime.l1 r2 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r2 = r14.mo5410J(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p015ui.unit.LayoutDirection) r2
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r10
            r5[r24] = r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r32)
            r5[r16] = r6
            r5[r22] = r2
            r6 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.mo5465u(r6)
            r6 = 0
            r7 = 0
        L_0x0489:
            if (r6 >= r4) goto L_0x0495
            r8 = r5[r6]
            boolean r8 = r14.mo5408I(r8)
            r7 = r7 | r8
            int r6 = r6 + 1
            goto L_0x0489
        L_0x0495:
            java.lang.Object r4 = r14.mo5431c0()
            if (r7 != 0) goto L_0x049f
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r5) goto L_0x04a7
        L_0x049f:
            androidx.compose.foundation.lazy.g r4 = new androidx.compose.foundation.lazy.g
            r4.<init>(r10, r3, r15, r2)
            r14.mo5407H0(r4)
        L_0x04a7:
            r2 = 0
            r14.mo5418R(r2)
            androidx.compose.ui.d r4 = (androidx.compose.p015ui.C1436d) r4
            androidx.compose.ui.d r1 = r1.mo6148i0(r4)
            r14.mo5418R(r2)
            kotlin.jvm.internal.C19383o.m32797g(r1, r13)
            r2 = 854917725(0x32f5025d, float:2.8522829E-8)
            r14.mo5465u(r2)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.mo5465u(r2)
            boolean r2 = r14.mo5408I(r10)
            boolean r4 = r14.mo5408I(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r14.mo5431c0()
            if (r2 != 0) goto L_0x04d6
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r2) goto L_0x04de
        L_0x04d6:
            androidx.compose.foundation.lazy.o r4 = new androidx.compose.foundation.lazy.o
            r4.<init>(r10, r3)
            r14.mo5407H0(r4)
        L_0x04de:
            r2 = 0
            r14.mo5418R(r2)
            androidx.compose.ui.d r4 = (androidx.compose.p015ui.C1436d) r4
            androidx.compose.ui.d r1 = r1.mo6148i0(r4)
            r14.mo5418R(r2)
            r4 = r39
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25275D0(r1, r4)
            r2 = -908836175(0xffffffffc9d442b1, float:-1738838.1)
            r14.mo5465u(r2)
            r2 = r15 ^ 1
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r3 = r14.mo5410J(r3)
            androidx.compose.ui.unit.LayoutDirection r5 = androidx.compose.p015ui.unit.LayoutDirection.Rtl
            if (r3 != r5) goto L_0x0506
            r3 = r24
            goto L_0x0507
        L_0x0506:
            r3 = 0
        L_0x0507:
            if (r3 == 0) goto L_0x050d
            if (r0 != 0) goto L_0x050d
            r2 = r2 ^ 1
        L_0x050d:
            r6 = r2
            r2 = 0
            r14.mo5418R(r2)
            androidx.compose.foundation.interaction.k r8 = r10.f1603c
            r2 = r30
            r3 = r12
            r5 = r35
            r7 = r34
            androidx.compose.ui.d r3 = androidx.compose.foundation.gestures.ScrollableKt.m1398b(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.foundation.lazy.layout.h r4 = r10.f1618r
            r7 = 0
            r8 = 0
            r2 = r11
            r5 = r18
            r6 = r14
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.m1863a(r2, r3, r4, r5, r6, r7, r8)
            r9 = r17
            r11 = r20
            r12 = r21
        L_0x0530:
            androidx.compose.runtime.v0 r14 = r14.mo5421U()
            if (r14 != 0) goto L_0x0537
            goto L_0x055d
        L_0x0537:
            androidx.compose.foundation.lazy.LazyListKt$LazyList$2 r13 = new androidx.compose.foundation.lazy.LazyListKt$LazyList$2
            r1 = r13
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r10 = r19
            r0 = r13
            r13 = r40
            r15 = r14
            r14 = r42
            r28 = r15
            r15 = r43
            r16 = r44
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r28
            r1.f3081d = r0
        L_0x055d:
            return
        L_0x055e:
            r0 = move-exception
            androidx.compose.runtime.snapshots.C1385f.m2974o(r5)     // Catch:{ all -> 0x0563 }
            throw r0     // Catch:{ all -> 0x0563 }
        L_0x0563:
            r0 = move-exception
            r4.mo5930c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.m1784a(androidx.compose.ui.d, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.v, boolean, boolean, androidx.compose.foundation.gestures.f, boolean, androidx.compose.ui.a$b, androidx.compose.foundation.layout.d$k, androidx.compose.ui.a$c, androidx.compose.foundation.layout.d$d, kq.l, androidx.compose.runtime.d, int, int, int):void");
    }

    /* renamed from: b */
    public static final void m1785b(C0829l lVar, LazyListState lazyListState, C1302d dVar, int i) {
        int i2;
        ComposerImpl h = dVar.mo5440h(3173830);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(lazyListState) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.mo5442i()) {
            h.mo5396C();
        } else if (lVar.getItemCount() > 0) {
            lazyListState.mo4228i(lVar);
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LazyListKt$ScrollPositionUpdater$1(lVar, lazyListState, i);
        }
    }
}
