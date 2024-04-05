package androidx.compose.material;

public final class SnackbarHostKt {

    /* renamed from: androidx.compose.material.SnackbarHostKt$a */
    public /* synthetic */ class C1132a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2266a;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            iArr[SnackbarDuration.Long.ordinal()] = 2;
            iArr[SnackbarDuration.Short.ordinal()] = 3;
            f2266a = iArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2225a(androidx.compose.material.C1251s1 r16, androidx.compose.p015ui.C1436d r17, p753kq.C19862q<? super androidx.compose.material.C1251s1, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r18, androidx.compose.runtime.C1302d r19, int r20, int r21) {
        /*
            r1 = r16
            r3 = r18
            r4 = r20
            r0 = 2036134589(0x795cf2bd, float:7.170179E34)
            r2 = r19
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r21 & 1
            if (r2 == 0) goto L_0x0016
            r2 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0025
            boolean r2 = r0.mo5408I(r1)
            if (r2 == 0) goto L_0x0022
            r2 = 4
            goto L_0x0023
        L_0x0022:
            r2 = 2
        L_0x0023:
            r2 = r2 | r4
            goto L_0x0026
        L_0x0025:
            r2 = r4
        L_0x0026:
            r5 = r21 & 2
            if (r5 == 0) goto L_0x002d
            r2 = r2 | 48
            goto L_0x0040
        L_0x002d:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0040
            r6 = r17
            boolean r7 = r0.mo5408I(r6)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r2 = r2 | r7
            goto L_0x0042
        L_0x0040:
            r6 = r17
        L_0x0042:
            r7 = r21 & 4
            if (r7 == 0) goto L_0x0049
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0049:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0059
            boolean r7 = r0.mo5408I(r3)
            if (r7 == 0) goto L_0x0056
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r2 = r2 | r7
        L_0x0059:
            r7 = r2 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x006c
            boolean r7 = r0.mo5442i()
            if (r7 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r0.mo5396C()
            r2 = r6
            goto L_0x01fd
        L_0x006c:
            if (r5 == 0) goto L_0x0071
            androidx.compose.ui.d$a r5 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0072
        L_0x0071:
            r5 = r6
        L_0x0072:
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r6)
            java.lang.Object r6 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r7 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r6 != r7) goto L_0x0088
            androidx.compose.material.u0 r6 = new androidx.compose.material.u0
            r6.<init>()
            r0.mo5407H0(r6)
        L_0x0088:
            r7 = 0
            r0.mo5418R(r7)
            androidx.compose.material.u0 r6 = (androidx.compose.material.C1257u0) r6
            java.lang.Object r8 = r6.f2627a
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r1, r8)
            if (r8 != 0) goto L_0x00f8
            r6.f2627a = r1
            java.util.ArrayList r8 = r6.f2628b
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.C19322o.m32624F0(r8)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L_0x00a7:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00bb
            java.lang.Object r10 = r8.next()
            androidx.compose.material.t0 r10 = (androidx.compose.material.C1253t0) r10
            T r10 = r10.f2614a
            androidx.compose.material.s1 r10 = (androidx.compose.material.C1251s1) r10
            r9.add(r10)
            goto L_0x00a7
        L_0x00bb:
            java.util.ArrayList r8 = kotlin.collections.C19327t.m32661q1(r9)
            boolean r9 = r8.contains(r1)
            if (r9 != 0) goto L_0x00c8
            r8.add(r1)
        L_0x00c8:
            java.util.ArrayList r9 = r6.f2628b
            r9.clear()
            java.util.ArrayList r9 = kotlin.collections.C19327t.m32636R0(r8)
            java.util.ArrayList r10 = r6.f2628b
            java.util.Iterator r9 = r9.iterator()
        L_0x00d7:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00f8
            java.lang.Object r11 = r9.next()
            androidx.compose.material.s1 r11 = (androidx.compose.material.C1251s1) r11
            androidx.compose.material.t0 r12 = new androidx.compose.material.t0
            r13 = -94104314(0xfffffffffa641506, float:-2.9606752E35)
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1 r14 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
            r14.<init>(r11, r1, r8, r6)
            androidx.compose.runtime.internal.ComposableLambdaImpl r13 = p628nj.C18263b.m30805A(r0, r13, r14)
            r12.<init>(r11, r13)
            r10.add(r12)
            goto L_0x00d7
        L_0x00f8:
            int r8 = r2 >> 3
            r8 = r8 & 14
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo5465u(r9)
            androidx.compose.ui.b r9 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            androidx.compose.ui.layout.v r7 = androidx.compose.foundation.layout.BoxKt.m1457c(r9, r7, r0)
            int r9 = r8 << 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r10)
            androidx.compose.runtime.l1 r10 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r10 = r0.mo5410J(r10)
            m0.b r10 = (p174m0.C7282b) r10
            androidx.compose.runtime.l1 r11 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r11 = r0.mo5410J(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p015ui.unit.LayoutDirection) r11
            androidx.compose.runtime.l1 r12 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r12 = r0.mo5410J(r12)
            androidx.compose.ui.platform.j1 r12 = (androidx.compose.p015ui.platform.C1843j1) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r13.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r14 = androidx.compose.p015ui.layout.C1700o.m3617a(r5)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | 6
            androidx.compose.runtime.c<?> r15 = r0.f2715a
            boolean r15 = r15 instanceof androidx.compose.runtime.C1299c
            if (r15 == 0) goto L_0x0221
            r0.mo5392A()
            boolean r15 = r0.f2702K
            if (r15 == 0) goto L_0x014c
            r0.mo5450m(r13)
            goto L_0x014f
        L_0x014c:
            r0.mo5452n()
        L_0x014f:
            r13 = 0
            r0.f2738x = r13
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r0, r7, r13)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r7 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r0, r10, r7)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r7 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r0, r11, r7)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r7 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r7 = p504ai.C13983i.m21490i(r0, r12, r7, r0)
            int r10 = r9 >> 3
            r10 = r10 & 112(0x70, float:1.57E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14.invoke(r7, r0, r10)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.mo5465u(r7)
            int r7 = r9 >> 9
            r7 = r7 & 14
            r9 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r0.mo5465u(r9)
            r7 = r7 & 11
            r9 = 2
            if (r7 != r9) goto L_0x0193
            boolean r7 = r0.mo5442i()
            if (r7 != 0) goto L_0x018e
            goto L_0x0193
        L_0x018e:
            r0.mo5396C()
            r2 = 0
            goto L_0x01f5
        L_0x0193:
            int r7 = r8 >> 6
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r7 | 6
            r8 = -1788016521(0xffffffff956d0877, float:-4.7868446E-26)
            r0.mo5465u(r8)
            r7 = r7 & 81
            r8 = 16
            if (r7 != r8) goto L_0x01b0
            boolean r7 = r0.mo5442i()
            if (r7 != 0) goto L_0x01ac
            goto L_0x01b0
        L_0x01ac:
            r0.mo5396C()
            goto L_0x01f1
        L_0x01b0:
            androidx.compose.runtime.v0 r7 = r0.mo5461s()
            if (r7 == 0) goto L_0x0215
            r0.mo5398D(r7)
            r6.f2629c = r7
            java.util.ArrayList r6 = r6.f2628b
            int r7 = r6.size()
            r8 = 0
        L_0x01c2:
            if (r8 >= r7) goto L_0x01f1
            java.lang.Object r9 = r6.get(r8)
            androidx.compose.material.t0 r9 = (androidx.compose.material.C1253t0) r9
            T r10 = r9.f2614a
            androidx.compose.material.s1 r10 = (androidx.compose.material.C1251s1) r10
            kq.q<kq.p<? super androidx.compose.runtime.d, ? super java.lang.Integer, kotlin.m>, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r9 = r9.f2615b
            r11 = -208579897(0xfffffffff39152c7, float:-2.3027404E31)
            r0.mo5475z(r11, r10)
            r11 = 2041982076(0x79b62c7c, float:1.1823753E35)
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 r12 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
            r12.<init>(r3, r10, r2)
            androidx.compose.runtime.internal.ComposableLambdaImpl r10 = p628nj.C18263b.m30805A(r0, r11, r12)
            r11 = 6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r9.invoke(r10, r0, r12)
            r9 = 0
            r0.mo5418R(r9)
            int r8 = r8 + 1
            goto L_0x01c2
        L_0x01f1:
            r2 = 0
            r0.mo5418R(r2)
        L_0x01f5:
            r6 = 1
            android.support.p013v4.media.session.C0087d.m238h(r0, r2, r2, r6, r2)
            r0.mo5418R(r2)
            r2 = r5
        L_0x01fd:
            androidx.compose.runtime.v0 r6 = r0.mo5421U()
            if (r6 != 0) goto L_0x0204
            goto L_0x0214
        L_0x0204:
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3 r7 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
            r0 = r7
            r1 = r16
            r3 = r18
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f3081d = r7
        L_0x0214:
            return
        L_0x0215:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no recompose scope found"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0221:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.m2225a(androidx.compose.material.s1, androidx.compose.ui.d, kq.q, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2226b(androidx.compose.material.C1254t1 r12, androidx.compose.p015ui.C1436d r13, p753kq.C19862q<? super androidx.compose.material.C1251s1, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r14, androidx.compose.runtime.C1302d r15, int r16, int r17) {
        /*
            r1 = r12
            r4 = r16
            java.lang.String r0 = "hostState"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            r0 = 431012348(0x19b0b9fc, float:1.8273092E-23)
            r2 = r15
            androidx.compose.runtime.ComposerImpl r0 = r15.mo5440h(r0)
            r2 = r17 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r4 | 6
            goto L_0x0027
        L_0x0017:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0026
            boolean r2 = r0.mo5408I(r12)
            if (r2 == 0) goto L_0x0023
            r2 = 4
            goto L_0x0024
        L_0x0023:
            r2 = 2
        L_0x0024:
            r2 = r2 | r4
            goto L_0x0027
        L_0x0026:
            r2 = r4
        L_0x0027:
            r3 = r17 & 2
            if (r3 == 0) goto L_0x002e
            r2 = r2 | 48
            goto L_0x0040
        L_0x002e:
            r5 = r4 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0040
            r5 = r13
            boolean r6 = r0.mo5408I(r13)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r2 = r2 | r6
            goto L_0x0041
        L_0x0040:
            r5 = r13
        L_0x0041:
            r6 = r17 & 4
            if (r6 == 0) goto L_0x0048
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x0048:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005a
            r7 = r14
            boolean r8 = r0.mo5408I(r14)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r2 = r2 | r8
            goto L_0x005b
        L_0x005a:
            r7 = r14
        L_0x005b:
            r8 = r2 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x006e
            boolean r8 = r0.mo5442i()
            if (r8 != 0) goto L_0x0068
            goto L_0x006e
        L_0x0068:
            r0.mo5396C()
            r2 = r5
            r3 = r7
            goto L_0x00ab
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0074
        L_0x0073:
            r3 = r5
        L_0x0074:
            if (r6 == 0) goto L_0x007a
            androidx.compose.runtime.internal.ComposableLambdaImpl r5 = androidx.compose.material.ComposableSingletons$SnackbarHostKt.f2195a
            r11 = r5
            goto L_0x007b
        L_0x007a:
            r11 = r7
        L_0x007b:
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = r1.f2617b
            java.lang.Object r5 = r5.getValue()
            androidx.compose.material.s1 r5 = (androidx.compose.material.C1251s1) r5
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4015a
            java.lang.Object r6 = r0.mo5410J(r6)
            androidx.compose.ui.platform.h r6 = (androidx.compose.p015ui.platform.C1835h) r6
            androidx.compose.material.SnackbarHostKt$SnackbarHost$1 r7 = new androidx.compose.material.SnackbarHostKt$SnackbarHost$1
            r8 = 0
            r7.<init>(r5, r6, r8)
            androidx.compose.runtime.C1415u.m3031e(r5, r7, r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = r1.f2617b
            java.lang.Object r5 = r5.getValue()
            androidx.compose.material.s1 r5 = (androidx.compose.material.C1251s1) r5
            r6 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 & 896(0x380, float:1.256E-42)
            r9 = r6 | r2
            r10 = 0
            r6 = r3
            r7 = r11
            r8 = r0
            m2225a(r5, r6, r7, r8, r9, r10)
            r2 = r3
            r3 = r11
        L_0x00ab:
            androidx.compose.runtime.v0 r6 = r0.mo5421U()
            if (r6 != 0) goto L_0x00b2
            goto L_0x00bf
        L_0x00b2:
            androidx.compose.material.SnackbarHostKt$SnackbarHost$2 r7 = new androidx.compose.material.SnackbarHostKt$SnackbarHost$2
            r0 = r7
            r1 = r12
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f3081d = r7
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.m2226b(androidx.compose.material.t1, androidx.compose.ui.d, kq.q, androidx.compose.runtime.d, int, int):void");
    }
}
