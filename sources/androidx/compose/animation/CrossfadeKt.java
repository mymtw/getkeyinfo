package androidx.compose.animation;

public final class CrossfadeKt {
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m1031a(androidx.compose.animation.core.Transition<T> r18, androidx.compose.p015ui.C1436d r19, androidx.compose.animation.core.C0454t<java.lang.Float> r20, p753kq.C19857l<? super T, ? extends java.lang.Object> r21, p753kq.C19862q<? super T, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r22, androidx.compose.runtime.C1302d r23, int r24, int r25) {
        /*
            r6 = r18
            r7 = r22
            r8 = r24
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r0 = 679005231(0x2878cc2f, float:1.3811041E-14)
            r1 = r23
            androidx.compose.runtime.ComposerImpl r9 = r1.mo5440h(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r25 & r0
            r1 = 2
            if (r0 == 0) goto L_0x0023
            r0 = r8 | 6
            goto L_0x0033
        L_0x0023:
            r0 = r8 & 14
            if (r0 != 0) goto L_0x0032
            boolean r0 = r9.mo5408I(r6)
            if (r0 == 0) goto L_0x002f
            r0 = 4
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            r0 = r0 | r8
            goto L_0x0033
        L_0x0032:
            r0 = r8
        L_0x0033:
            r2 = r25 & 1
            if (r2 == 0) goto L_0x003a
            r0 = r0 | 48
            goto L_0x004d
        L_0x003a:
            r3 = r8 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r19
            boolean r4 = r9.mo5408I(r3)
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r0 = r0 | r4
            goto L_0x004f
        L_0x004d:
            r3 = r19
        L_0x004f:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x0055
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x0055:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x005c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x006f
        L_0x005c:
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x006f
            r10 = r21
            boolean r11 = r9.mo5408I(r10)
            if (r11 == 0) goto L_0x006b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r0 = r0 | r11
            goto L_0x0071
        L_0x006f:
            r10 = r21
        L_0x0071:
            r11 = r25 & 8
            if (r11 == 0) goto L_0x0078
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008a
        L_0x0078:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r8
            if (r11 != 0) goto L_0x008a
            boolean r11 = r9.mo5408I(r7)
            if (r11 == 0) goto L_0x0087
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r0 = r0 | r11
        L_0x008a:
            r11 = r0
            if (r4 != r1) goto L_0x00a5
            r0 = 46811(0xb6db, float:6.5596E-41)
            r0 = r0 & r11
            r1 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r1) goto L_0x00a5
            boolean r0 = r9.mo5442i()
            if (r0 != 0) goto L_0x009c
            goto L_0x00a5
        L_0x009c:
            r9.mo5396C()
            r2 = r3
            r4 = r10
            r3 = r20
            goto L_0x02b7
        L_0x00a5:
            if (r2 == 0) goto L_0x00ab
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r12 = r0
            goto L_0x00ac
        L_0x00ab:
            r12 = r3
        L_0x00ac:
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L_0x00b7
            r2 = 7
            androidx.compose.animation.core.j0 r0 = androidx.compose.foundation.layout.C0761x.m1706Z0(r1, r1, r0, r2)
            r13 = r0
            goto L_0x00b9
        L_0x00b7:
            r13 = r20
        L_0x00b9:
            if (r5 == 0) goto L_0x00be
            androidx.compose.animation.CrossfadeKt$Crossfade$2 r0 = androidx.compose.animation.CrossfadeKt$Crossfade$2.INSTANCE
            r10 = r0
        L_0x00be:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.mo5465u(r0)
            java.lang.Object r2 = r9.mo5431c0()
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x00dd
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = new androidx.compose.runtime.snapshots.SnapshotStateList
            r2.<init>()
            java.lang.Object r4 = r18.mo3410b()
            r2.add(r4)
            kotlin.m r4 = kotlin.C19394m.f43287a
            r9.mo5407H0(r2)
        L_0x00dd:
            r9.mo5418R(r1)
            r14 = r2
            androidx.compose.runtime.snapshots.SnapshotStateList r14 = (androidx.compose.runtime.snapshots.SnapshotStateList) r14
            r9.mo5465u(r0)
            java.lang.Object r0 = r9.mo5431c0()
            if (r0 != r3) goto L_0x00f4
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9.mo5407H0(r0)
        L_0x00f4:
            r9.mo5418R(r1)
            r15 = r0
            java.util.Map r15 = (java.util.Map) r15
            r0 = -1621449801(0xffffffff9f5aa3b7, float:-4.6298717E-20)
            r9.mo5465u(r0)
            java.lang.Object r0 = r18.mo3410b()
            java.lang.Object r2 = r18.mo3412d()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
            r2 = 1
            if (r0 == 0) goto L_0x0148
            int r0 = r14.size()
            if (r0 != r2) goto L_0x0123
            java.lang.Object r0 = r14.get(r1)
            java.lang.Object r2 = r18.mo3412d()
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
            if (r0 != 0) goto L_0x0148
        L_0x0123:
            r0 = 1157296644(0x44faf204, float:2007.563)
            r9.mo5465u(r0)
            boolean r0 = r9.mo5408I(r6)
            java.lang.Object r2 = r9.mo5431c0()
            if (r0 != 0) goto L_0x0135
            if (r2 != r3) goto L_0x013d
        L_0x0135:
            androidx.compose.animation.CrossfadeKt$Crossfade$3$1 r2 = new androidx.compose.animation.CrossfadeKt$Crossfade$3$1
            r2.<init>(r6)
            r9.mo5407H0(r2)
        L_0x013d:
            r9.mo5418R(r1)
            kq.l r2 = (p753kq.C19857l) r2
            kotlin.collections.C19324q.m32631M0(r2, r14)
            r15.clear()
        L_0x0148:
            r9.mo5418R(r1)
            java.lang.Object r0 = r18.mo3412d()
            boolean r0 = r15.containsKey(r0)
            if (r0 != 0) goto L_0x01c9
            java.util.ListIterator r0 = r14.listIterator()
            r2 = r1
        L_0x015a:
            r3 = r0
            androidx.compose.runtime.snapshots.q r3 = (androidx.compose.runtime.snapshots.C1400q) r3
            boolean r4 = r3.hasNext()
            r5 = -1
            if (r4 == 0) goto L_0x017e
            java.lang.Object r3 = r3.next()
            java.lang.Object r3 = r10.invoke(r3)
            java.lang.Object r4 = r18.mo3412d()
            java.lang.Object r4 = r10.invoke(r4)
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x017b
            goto L_0x017f
        L_0x017b:
            int r2 = r2 + 1
            goto L_0x015a
        L_0x017e:
            r2 = r5
        L_0x017f:
            if (r2 != r5) goto L_0x0189
            java.lang.Object r0 = r18.mo3412d()
            r14.add(r0)
            goto L_0x0190
        L_0x0189:
            java.lang.Object r0 = r18.mo3412d()
            r14.set(r2, r0)
        L_0x0190:
            r15.clear()
            int r5 = r14.size()
            r4 = r1
        L_0x0198:
            if (r4 >= r5) goto L_0x01c9
            java.lang.Object r3 = r14.get(r4)
            r2 = -1426421288(0xffffffffaafa89d8, float:-4.450457E-13)
            androidx.compose.animation.CrossfadeKt$Crossfade$4$1 r1 = new androidx.compose.animation.CrossfadeKt$Crossfade$4$1
            r0 = r1
            r6 = r1
            r1 = r18
            r7 = r2
            r2 = r11
            r19 = r3
            r3 = r13
            r16 = r4
            r4 = r19
            r17 = r5
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r9, r7, r6)
            r1 = r19
            r15.put(r1, r0)
            int r4 = r16 + 1
            r6 = r18
            r7 = r22
            r5 = r17
            goto L_0x0198
        L_0x01c9:
            int r0 = r11 >> 3
            r0 = r0 & 14
            r1 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r9.mo5465u(r1)
            androidx.compose.ui.b r1 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r2 = 0
            androidx.compose.ui.layout.v r1 = androidx.compose.foundation.layout.BoxKt.m1457c(r1, r2, r9)
            int r2 = r0 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 1376089335(0x520574f7, float:1.43298249E11)
            r9.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r3 = r9.mo5410J(r3)
            m0.b r3 = (p174m0.C7282b) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r4 = r9.mo5410J(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p015ui.unit.LayoutDirection) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r5.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r6 = androidx.compose.p015ui.layout.C1700o.m3617a(r12)
            int r2 = r2 << 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            androidx.compose.runtime.c<?> r7 = r9.f2715a
            boolean r7 = r7 instanceof androidx.compose.runtime.C1299c
            if (r7 == 0) goto L_0x02cf
            r9.mo5392A()
            boolean r7 = r9.f2702K
            if (r7 == 0) goto L_0x0214
            r9.mo5450m(r5)
            goto L_0x0217
        L_0x0214:
            r9.mo5452n()
        L_0x0217:
            r5 = 0
            r9.f2738x = r5
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r9, r1, r5)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r9, r3, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r9, r4, r1)
            r9.mo5430c()
            androidx.compose.runtime.a1 r1 = new androidx.compose.runtime.a1
            r1.<init>(r9)
            int r3 = r2 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.invoke(r1, r9, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.mo5465u(r1)
            int r1 = r2 >> 9
            r1 = r1 & 14
            r2 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r9.mo5465u(r2)
            r1 = r1 & 11
            r1 = r1 ^ 2
            if (r1 != 0) goto L_0x025e
            boolean r1 = r9.mo5442i()
            if (r1 != 0) goto L_0x0259
            goto L_0x025e
        L_0x0259:
            r9.mo5396C()
            r0 = 0
            goto L_0x02ad
        L_0x025e:
            int r0 = r0 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            r1 = 1930908853(0x731754b5, float:1.1989668E31)
            r9.mo5465u(r1)
            r0 = r0 & 81
            r1 = 16
            if (r0 != r1) goto L_0x027b
            boolean r0 = r9.mo5442i()
            if (r0 != 0) goto L_0x0277
            goto L_0x027b
        L_0x0277:
            r9.mo5396C()
            goto L_0x02a9
        L_0x027b:
            int r0 = r14.size()
            r1 = 0
        L_0x0280:
            if (r1 >= r0) goto L_0x02a9
            java.lang.Object r2 = r14.get(r1)
            r3 = -450541954(0xffffffffe525467e, float:-4.8780676E22)
            java.lang.Object r4 = r10.invoke(r2)
            r9.mo5475z(r3, r4)
            java.lang.Object r2 = r15.get(r2)
            kq.p r2 = (p753kq.C19861p) r2
            r3 = 0
            if (r2 != 0) goto L_0x029a
            goto L_0x02a3
        L_0x029a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.invoke(r9, r4)
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x02a3:
            r9.mo5418R(r3)
            int r1 = r1 + 1
            goto L_0x0280
        L_0x02a9:
            r0 = 0
            r9.mo5418R(r0)
        L_0x02ad:
            r1 = 1
            android.support.p013v4.media.session.C0087d.m238h(r9, r0, r0, r1, r0)
            r9.mo5418R(r0)
            r4 = r10
            r2 = r12
            r3 = r13
        L_0x02b7:
            androidx.compose.runtime.v0 r9 = r9.mo5421U()
            if (r9 != 0) goto L_0x02be
            goto L_0x02ce
        L_0x02be:
            androidx.compose.animation.CrossfadeKt$Crossfade$6 r10 = new androidx.compose.animation.CrossfadeKt$Crossfade$6
            r0 = r10
            r1 = r18
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f3081d = r10
        L_0x02ce:
            return
        L_0x02cf:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.m1031a(androidx.compose.animation.core.Transition, androidx.compose.ui.d, androidx.compose.animation.core.t, kq.l, kq.q, androidx.compose.runtime.d, int, int):void");
    }
}
