package androidx.compose.animation;

public final class AnimatedContentKt {
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0128, code lost:
        if (r4 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void m1008a(androidx.compose.animation.core.Transition<S> r22, androidx.compose.p015ui.C1436d r23, p753kq.C19857l<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.C0471g> r24, androidx.compose.p015ui.C1428a r25, p753kq.C19857l<? super S, ? extends java.lang.Object> r26, p753kq.C19863r<? super androidx.compose.animation.C0468d, ? super S, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r27, androidx.compose.runtime.C1302d r28, int r29, int r30) {
        /*
            r8 = r22
            r9 = r27
            r10 = r29
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = -114689412(0xfffffffff929fa7c, float:-5.516116E34)
            r1 = r28
            androidx.compose.runtime.ComposerImpl r11 = r1.mo5440h(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r30 & r0
            if (r0 == 0) goto L_0x0022
            r0 = r10 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.mo5408I(r8)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r10
            goto L_0x0032
        L_0x0031:
            r0 = r10
        L_0x0032:
            r1 = r30 & 1
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r23
            boolean r3 = r11.mo5408I(r2)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
            goto L_0x004e
        L_0x004c:
            r2 = r23
        L_0x004e:
            r3 = r30 & 2
            if (r3 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0068
            r4 = r24
            boolean r5 = r11.mo5408I(r4)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r5
            goto L_0x006a
        L_0x0068:
            r4 = r24
        L_0x006a:
            r5 = r30 & 4
            if (r5 == 0) goto L_0x0071
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0084
            r6 = r25
            boolean r7 = r11.mo5408I(r6)
            if (r7 == 0) goto L_0x0080
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r0 = r0 | r7
            goto L_0x0086
        L_0x0084:
            r6 = r25
        L_0x0086:
            r7 = r30 & 8
            if (r7 == 0) goto L_0x008d
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008d:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00a2
            r12 = r26
            boolean r13 = r11.mo5408I(r12)
            if (r13 == 0) goto L_0x009e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r0 = r0 | r13
            goto L_0x00a4
        L_0x00a2:
            r12 = r26
        L_0x00a4:
            r13 = r30 & 16
            if (r13 == 0) goto L_0x00ab
            r13 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00bb
        L_0x00ab:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00bc
            boolean r13 = r11.mo5408I(r9)
            if (r13 == 0) goto L_0x00b9
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r13
        L_0x00bc:
            r13 = r0
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r0 & r13
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r14) goto L_0x00d5
            boolean r0 = r11.mo5442i()
            if (r0 != 0) goto L_0x00cd
            goto L_0x00d5
        L_0x00cd:
            r11.mo5396C()
            r3 = r4
            r4 = r6
            r5 = r12
            goto L_0x03fe
        L_0x00d5:
            if (r1 == 0) goto L_0x00db
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r14 = r0
            goto L_0x00dc
        L_0x00db:
            r14 = r2
        L_0x00dc:
            if (r3 == 0) goto L_0x00e2
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$3 r0 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$3.INSTANCE
            r15 = r0
            goto L_0x00e3
        L_0x00e2:
            r15 = r4
        L_0x00e3:
            if (r5 == 0) goto L_0x00e8
            androidx.compose.ui.b r0 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r6 = r0
        L_0x00e8:
            if (r7 == 0) goto L_0x00ed
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$4 r0 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$4.INSTANCE
            r12 = r0
        L_0x00ed:
            androidx.compose.runtime.l1 r0 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r0 = r11.mo5410J(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p015ui.unit.LayoutDirection) r0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r11.mo5465u(r1)
            boolean r2 = r11.mo5408I(r8)
            java.lang.Object r3 = r11.mo5431c0()
            if (r2 != 0) goto L_0x0109
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r2) goto L_0x0111
        L_0x0109:
            androidx.compose.animation.AnimatedContentScope r3 = new androidx.compose.animation.AnimatedContentScope
            r3.<init>(r8, r6, r0)
            r11.mo5407H0(r3)
        L_0x0111:
            r2 = 0
            r11.mo5418R(r2)
            r7 = r3
            androidx.compose.animation.AnimatedContentScope r7 = (androidx.compose.animation.AnimatedContentScope) r7
            r11.mo5465u(r1)
            boolean r3 = r11.mo5408I(r8)
            java.lang.Object r4 = r11.mo5431c0()
            r5 = 1
            if (r3 != 0) goto L_0x012a
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r3) goto L_0x0141
        L_0x012a:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Object r4 = r22.mo3410b()
            r3[r2] = r4
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = new androidx.compose.runtime.snapshots.SnapshotStateList
            r4.<init>()
            java.util.List r3 = kotlin.collections.C19318k.m32620l1(r3)
            r4.addAll(r3)
            r11.mo5407H0(r4)
        L_0x0141:
            r11.mo5418R(r2)
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = (androidx.compose.runtime.snapshots.SnapshotStateList) r4
            r11.mo5465u(r1)
            boolean r1 = r11.mo5408I(r8)
            java.lang.Object r3 = r11.mo5431c0()
            if (r1 != 0) goto L_0x0157
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r1) goto L_0x015f
        L_0x0157:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r11.mo5407H0(r3)
        L_0x015f:
            r11.mo5418R(r2)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r22.mo3410b()
            java.lang.Object r2 = r22.mo3412d()
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r1 == 0) goto L_0x01b1
            int r1 = r4.size()
            if (r1 != r5) goto L_0x0187
            r1 = 0
            java.lang.Object r1 = r4.get(r1)
            java.lang.Object r2 = r22.mo3410b()
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r1 != 0) goto L_0x0191
        L_0x0187:
            r4.clear()
            java.lang.Object r1 = r22.mo3410b()
            r4.add(r1)
        L_0x0191:
            int r1 = r3.size()
            if (r1 != r5) goto L_0x01a1
            java.lang.Object r1 = r22.mo3410b()
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x01a4
        L_0x01a1:
            r3.clear()
        L_0x01a4:
            r7.getClass()
            java.lang.String r1 = "<set-?>"
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)
            r7.f965b = r6
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
        L_0x01b1:
            java.lang.Object r0 = r22.mo3410b()
            java.lang.Object r1 = r22.mo3412d()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            if (r0 != 0) goto L_0x0205
            java.lang.Object r0 = r22.mo3412d()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0205
            java.util.ListIterator r0 = r4.listIterator()
            r1 = 0
        L_0x01ce:
            r2 = r0
            androidx.compose.runtime.snapshots.q r2 = (androidx.compose.runtime.snapshots.C1400q) r2
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x01f2
            java.lang.Object r2 = r2.next()
            java.lang.Object r2 = r12.invoke(r2)
            java.lang.Object r5 = r22.mo3412d()
            java.lang.Object r5 = r12.invoke(r5)
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r5)
            if (r2 == 0) goto L_0x01ef
            r0 = -1
            goto L_0x01f4
        L_0x01ef:
            int r1 = r1 + 1
            goto L_0x01ce
        L_0x01f2:
            r0 = -1
            r1 = -1
        L_0x01f4:
            if (r1 != r0) goto L_0x01fe
            java.lang.Object r0 = r22.mo3412d()
            r4.add(r0)
            goto L_0x0205
        L_0x01fe:
            java.lang.Object r0 = r22.mo3412d()
            r4.set(r1, r0)
        L_0x0205:
            java.lang.Object r0 = r22.mo3412d()
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x025c
            r3.clear()
            int r5 = r4.size()
            r0 = 0
            r2 = r0
        L_0x0218:
            if (r2 >= r5) goto L_0x025c
            java.lang.Object r1 = r4.get(r2)
            r0 = 963631013(0x396fd7a5, float:2.287315E-4)
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1 r8 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
            r9 = r0
            r0 = r8
            r23 = r1
            r1 = r22
            r16 = r2
            r2 = r23
            r17 = r3
            r3 = r13
            r18 = r4
            r4 = r15
            r19 = r5
            r5 = r7
            r20 = r6
            r6 = r27
            r21 = r7
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r11, r9, r8)
            r1 = r23
            r7 = r17
            r7.put(r1, r0)
            int r2 = r16 + 1
            r8 = r22
            r9 = r27
            r3 = r7
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            goto L_0x0218
        L_0x025c:
            r18 = r4
            r20 = r6
            r21 = r7
            r7 = r3
            androidx.compose.animation.core.Transition$b r0 = r22.mo3411c()
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.mo5465u(r1)
            r3 = r21
            boolean r1 = r11.mo5408I(r3)
            boolean r0 = r11.mo5408I(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r11.mo5431c0()
            if (r0 != 0) goto L_0x0282
            androidx.compose.runtime.d$a$a r0 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r0) goto L_0x028c
        L_0x0282:
            java.lang.Object r0 = r15.invoke(r3)
            r1 = r0
            androidx.compose.animation.g r1 = (androidx.compose.animation.C0471g) r1
            r11.mo5407H0(r1)
        L_0x028c:
            r0 = 0
            r11.mo5418R(r0)
            androidx.compose.animation.g r1 = (androidx.compose.animation.C0471g) r1
            r3.getClass()
            java.lang.String r2 = "contentTransform"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r2 = -1349251863(0xffffffffaf940ce9, float:-2.6930216E-10)
            r11.mo5465u(r2)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r11.mo5465u(r2)
            boolean r4 = r11.mo5408I(r3)
            java.lang.Object r5 = r11.mo5431c0()
            if (r4 != 0) goto L_0x02b4
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r5 != r4) goto L_0x02bd
        L_0x02b4:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = androidx.compose.foundation.layout.C0761x.m1751w0(r4, androidx.compose.runtime.C1351n1.f2948a)
            r11.mo5407H0(r5)
        L_0x02bd:
            r11.mo5418R(r0)
            androidx.compose.runtime.j0 r5 = (androidx.compose.runtime.C1338j0) r5
            androidx.compose.animation.s r1 = r1.f1214d
            androidx.compose.runtime.j0 r1 = androidx.compose.foundation.layout.C0761x.m1664E0(r1, r11)
            androidx.compose.animation.core.Transition<S> r4 = r3.f964a
            java.lang.Object r4 = r4.mo3410b()
            androidx.compose.animation.core.Transition<S> r6 = r3.f964a
            java.lang.Object r6 = r6.mo3412d()
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r6)
            if (r4 == 0) goto L_0x02e0
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r5.setValue(r4)
            goto L_0x02eb
        L_0x02e0:
            java.lang.Object r4 = r1.getValue()
            if (r4 == 0) goto L_0x02eb
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r5.setValue(r4)
        L_0x02eb:
            java.lang.Object r4 = r5.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 == 0) goto L_0x033e
            androidx.compose.animation.core.Transition<S> r4 = r3.f964a
            androidx.compose.animation.core.l0 r6 = androidx.compose.animation.core.VectorConvertersKt.f1083h
            r8 = 2
            androidx.compose.animation.core.Transition$a r4 = androidx.compose.animation.core.TransitionKt.m1100b(r4, r6, r5, r11, r8)
            r11.mo5465u(r2)
            boolean r2 = r11.mo5408I(r4)
            java.lang.Object r6 = r11.mo5431c0()
            if (r2 != 0) goto L_0x0312
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r6 != r2) goto L_0x0338
        L_0x0312:
            java.lang.Object r2 = r1.getValue()
            androidx.compose.animation.s r2 = (androidx.compose.animation.C0484s) r2
            if (r2 == 0) goto L_0x0322
            boolean r2 = r2.mo3569b()
            if (r2 != 0) goto L_0x0322
            r2 = 1
            goto L_0x0323
        L_0x0322:
            r2 = r0
        L_0x0323:
            androidx.compose.ui.d$a r6 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            if (r2 == 0) goto L_0x0328
            goto L_0x032c
        L_0x0328:
            androidx.compose.ui.d r6 = kotlinx.coroutines.C19543e0.m33287C(r6)
        L_0x032c:
            androidx.compose.animation.AnimatedContentScope$SizeModifier r2 = new androidx.compose.animation.AnimatedContentScope$SizeModifier
            r2.<init>(r3, r4, r1)
            androidx.compose.ui.d r6 = r6.mo6148i0(r2)
            r11.mo5407H0(r6)
        L_0x0338:
            r11.mo5418R(r0)
            androidx.compose.ui.d r6 = (androidx.compose.p015ui.C1436d) r6
            goto L_0x0342
        L_0x033e:
            r3.f968e = r5
            androidx.compose.ui.d$a r6 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x0342:
            r11.mo5418R(r0)
            androidx.compose.ui.d r1 = r14.mo6148i0(r6)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r2)
            java.lang.Object r2 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r4) goto L_0x035f
            androidx.compose.animation.AnimatedContentMeasurePolicy r2 = new androidx.compose.animation.AnimatedContentMeasurePolicy
            r2.<init>(r3)
            r11.mo5407H0(r2)
        L_0x035f:
            r11.mo5418R(r0)
            androidx.compose.animation.AnimatedContentMeasurePolicy r2 = (androidx.compose.animation.AnimatedContentMeasurePolicy) r2
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r3 = r11.mo5410J(r3)
            m0.b r3 = (p174m0.C7282b) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r4 = r11.mo5410J(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p015ui.unit.LayoutDirection) r4
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r6 = r11.mo5410J(r6)
            androidx.compose.ui.platform.j1 r6 = (androidx.compose.p015ui.platform.C1843j1) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r8.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r8 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r9 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c<?> r1 = r11.f2715a
            boolean r1 = r1 instanceof androidx.compose.runtime.C1299c
            if (r1 == 0) goto L_0x0416
            r11.mo5392A()
            boolean r1 = r11.f2702K
            if (r1 == 0) goto L_0x039e
            r11.mo5450m(r8)
            goto L_0x03a1
        L_0x039e:
            r11.mo5452n()
        L_0x03a1:
            r11.f2738x = r0
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r11, r2, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r11, r3, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r11, r4, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r3 = p504ai.C13983i.m21490i(r11, r6, r1, r11)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6 = -451584589(0xffffffffe5155db3, float:-4.4085066E22)
            r1 = r0
            r2 = r9
            r4 = r11
            androidx.appcompat.widget.C0326j.m868m(r1, r2, r3, r4, r5, r6)
            java.util.ListIterator r1 = r18.listIterator()
        L_0x03c8:
            r2 = r1
            androidx.compose.runtime.snapshots.q r2 = (androidx.compose.runtime.snapshots.C1400q) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03f5
            java.lang.Object r2 = r2.next()
            r3 = -1739565921(0xffffffff9850549f, float:-2.6926093E-24)
            java.lang.Object r4 = r12.invoke(r2)
            r11.mo5475z(r3, r4)
            java.lang.Object r2 = r7.get(r2)
            kq.p r2 = (p753kq.C19861p) r2
            if (r2 != 0) goto L_0x03e8
            goto L_0x03f1
        L_0x03e8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.invoke(r11, r3)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x03f1:
            r11.mo5418R(r0)
            goto L_0x03c8
        L_0x03f5:
            r1 = 1
            android.support.p013v4.media.session.C0087d.m238h(r11, r0, r0, r1, r0)
            r5 = r12
            r2 = r14
            r3 = r15
            r4 = r20
        L_0x03fe:
            androidx.compose.runtime.v0 r9 = r11.mo5421U()
            if (r9 != 0) goto L_0x0405
            goto L_0x0415
        L_0x0405:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$8 r11 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$8
            r0 = r11
            r1 = r22
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f3081d = r11
        L_0x0415:
            return
        L_0x0416:
            p001a0.C0005b.m45j0()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.m1008a(androidx.compose.animation.core.Transition, androidx.compose.ui.d, kq.l, androidx.compose.ui.a, kq.l, kq.r, androidx.compose.runtime.d, int, int):void");
    }
}
