package androidx.compose.animation;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1700o;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1299c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import p001a0.C0005b;
import p174m0.C7282b;
import p504ai.C13983i;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class AnimatedVisibilityKt {
    /* renamed from: a */
    public static final <T> void m1025a(Transition<T> transition, C19857l<? super T, Boolean> lVar, C1436d dVar, C0473i iVar, C0475k kVar, C19862q<? super C0468d, ? super C1302d, ? super Integer, C19394m> qVar, C1302d dVar2, int i) {
        int i2;
        Transition<T> transition2 = transition;
        C19857l<? super T, Boolean> lVar2 = lVar;
        C1436d dVar3 = dVar;
        C19862q<? super C0468d, ? super C1302d, ? super Integer, C19394m> qVar2 = qVar;
        int i3 = i;
        ComposerImpl h = dVar2.mo5440h(808253933);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(transition2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(lVar2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5408I(dVar3) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(iVar) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        } else {
            C0473i iVar2 = iVar;
        }
        C0475k kVar2 = kVar;
        if ((57344 & i3) == 0) {
            i2 |= h.mo5408I(kVar2) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((458752 & i3) == 0) {
            i2 |= h.mo5408I(qVar2) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !h.mo5442i()) {
            int i4 = i2 & 14;
            h.mo5465u(1157296644);
            boolean I = h.mo5408I(transition2);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = C0761x.m1751w0(lVar2.invoke(transition.mo3410b()), C1351n1.f2948a);
                h.mo5407H0(c0);
            }
            boolean z = false;
            h.mo5418R(false);
            C1338j0 j0Var = (C1338j0) c0;
            if (lVar2.invoke(transition.mo3412d()).booleanValue() || ((Boolean) j0Var.getValue()).booleanValue() || transition.mo3413e()) {
                int i5 = i4 | 48;
                h.mo5465u(1215497572);
                int i6 = i5 & 14;
                h.mo5465u(1157296644);
                boolean I2 = h.mo5408I(transition2);
                T c02 = h.mo5431c0();
                if (I2 || c02 == C1302d.C1303a.f2828a) {
                    c02 = transition.mo3410b();
                    h.mo5407H0(c02);
                }
                h.mo5418R(false);
                if (transition.mo3413e()) {
                    c02 = transition.mo3410b();
                }
                h.mo5465u(-1220581778);
                EnterExitState e = m1029e(transition2, lVar2, c02, h);
                h.mo5418R(false);
                T d = transition.mo3412d();
                h.mo5465u(-1220581778);
                EnterExitState e2 = m1029e(transition2, lVar2, d, h);
                h.mo5418R(false);
                Transition a = TransitionKt.m1099a(transition2, e, e2, h, ((i5 << 6) & 7168) | i6);
                h.mo5418R(false);
                h.mo5465u(511388516);
                boolean I3 = h.mo5408I(a) | h.mo5408I(j0Var);
                Object c03 = h.mo5431c0();
                if (I3 || c03 == C1302d.C1303a.f2828a) {
                    c03 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(a, j0Var, (C19340c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1>) null);
                    h.mo5407H0(c03);
                }
                h.mo5418R(false);
                C1415u.m3031e(a, (C19861p) c03, h);
                int i7 = i2 >> 3;
                int i8 = (i7 & 57344) | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                h.mo5465u(-1967270694);
                Object b = a.mo3410b();
                EnterExitState enterExitState = EnterExitState.Visible;
                if (b == enterExitState || a.mo3412d() == enterExitState) {
                    int i9 = i8 & 14;
                    h.mo5465u(1157296644);
                    boolean I4 = h.mo5408I(a);
                    Object c04 = h.mo5431c0();
                    if (I4 || c04 == C1302d.C1303a.f2828a) {
                        c04 = new C0469e(a);
                        h.mo5407H0(c04);
                    }
                    h.mo5418R(false);
                    int i10 = i8 >> 3;
                    C0469e eVar = (C0469e) c04;
                    C1436d i0 = dVar3.mo6148i0(EnterExitTransitionKt.m1032a(a, iVar, kVar, "Built-in", h, i9 | 3072 | (i10 & 112) | (i10 & 896)));
                    h.mo5465u(-492369756);
                    Object c05 = h.mo5431c0();
                    if (c05 == C1302d.C1303a.f2828a) {
                        c05 = new AnimatedEnterExitMeasurePolicy(eVar);
                        h.mo5407H0(c05);
                    }
                    h.mo5418R(false);
                    C1711v vVar = (C1711v) c05;
                    h.mo5465u(-1323940314);
                    C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
                    LayoutDirection layoutDirection = (LayoutDirection) h.mo5410J(CompositionLocalsKt.f4025k);
                    C1843j1 j1Var = (C1843j1) h.mo5410J(CompositionLocalsKt.f4029o);
                    ComposeUiNode.f3776c0.getClass();
                    C19846a<ComposeUiNode> aVar = ComposeUiNode.Companion.f3778b;
                    ComposableLambdaImpl a2 = C1700o.m3617a(i0);
                    if (h.f2715a instanceof C1299c) {
                        h.mo5392A();
                        if (h.f2702K) {
                            h.mo5450m(aVar);
                        } else {
                            h.mo5452n();
                        }
                        h.f2738x = false;
                        Updater.m2571b(h, vVar, ComposeUiNode.Companion.f3781e);
                        Updater.m2571b(h, bVar, ComposeUiNode.Companion.f3780d);
                        Updater.m2571b(h, layoutDirection, ComposeUiNode.Companion.f3782f);
                        C0326j.m868m(0, a2, C13983i.m21490i(h, j1Var, ComposeUiNode.Companion.f3783g, h), h, 2058660585, 1797450476);
                        qVar2.invoke(eVar, h, Integer.valueOf(((i8 >> 9) & 112) | 8));
                        z = false;
                        h.mo5418R(false);
                        h.mo5418R(false);
                        h.mo5418R(true);
                        h.mo5418R(false);
                    } else {
                        C0005b.m45j0();
                        throw null;
                    }
                }
                h.mo5418R(z);
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AnimatedVisibilityKt$AnimatedEnterExitImpl$2(transition, lVar, dVar, iVar, kVar, qVar, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1026b(androidx.compose.animation.core.C0418c0<java.lang.Boolean> r17, androidx.compose.p015ui.C1436d r18, androidx.compose.animation.C0473i r19, androidx.compose.animation.C0475k r20, java.lang.String r21, p753kq.C19862q<? super androidx.compose.animation.C0468d, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r22, androidx.compose.runtime.C1302d r23, int r24, int r25) {
        /*
            r1 = r17
            r10 = r22
            r11 = r24
            java.lang.String r0 = "visibleState"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            r0 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            r2 = r23
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002f
            boolean r2 = r0.mo5408I(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r11
            goto L_0x0030
        L_0x002f:
            r2 = r11
        L_0x0030:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x004a
        L_0x0037:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r18
            boolean r5 = r0.mo5408I(r4)
            if (r5 == 0) goto L_0x0046
            r5 = 32
            goto L_0x0048
        L_0x0046:
            r5 = 16
        L_0x0048:
            r2 = r2 | r5
            goto L_0x004c
        L_0x004a:
            r4 = r18
        L_0x004c:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x0053
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0066
            r6 = r19
            boolean r7 = r0.mo5408I(r6)
            if (r7 == 0) goto L_0x0062
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r2 = r2 | r7
            goto L_0x0068
        L_0x0066:
            r6 = r19
        L_0x0068:
            r7 = r25 & 8
            if (r7 == 0) goto L_0x006f
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r20
            boolean r9 = r0.mo5408I(r8)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r2 = r2 | r9
            goto L_0x0084
        L_0x0082:
            r8 = r20
        L_0x0084:
            r9 = r25 & 16
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008e:
            r13 = r11 & r12
            if (r13 != 0) goto L_0x00a1
            r13 = r21
            boolean r14 = r0.mo5408I(r13)
            if (r14 == 0) goto L_0x009d
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r14
            goto L_0x00a3
        L_0x00a1:
            r13 = r21
        L_0x00a3:
            r14 = r25 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00ac
            r14 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00bb
        L_0x00ac:
            r14 = r11 & r15
            if (r14 != 0) goto L_0x00bc
            boolean r14 = r0.mo5408I(r10)
            if (r14 == 0) goto L_0x00b9
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r2 = r2 | r14
        L_0x00bc:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r2
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d5
            boolean r14 = r0.mo5442i()
            if (r14 != 0) goto L_0x00cc
            goto L_0x00d5
        L_0x00cc:
            r0.mo5396C()
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r13
            goto L_0x012e
        L_0x00d5:
            if (r3 == 0) goto L_0x00db
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r14 = r3
            goto L_0x00dc
        L_0x00db:
            r14 = r4
        L_0x00dc:
            r3 = 0
            r4 = 3
            if (r5 == 0) goto L_0x00ee
            androidx.compose.animation.j r5 = androidx.compose.animation.EnterExitTransitionKt.m1037f(r3, r4)
            androidx.compose.animation.j r6 = androidx.compose.animation.EnterExitTransitionKt.m1035d()
            androidx.compose.animation.j r5 = r5.mo3547b(r6)
            r15 = r5
            goto L_0x00ef
        L_0x00ee:
            r15 = r6
        L_0x00ef:
            if (r7 == 0) goto L_0x0100
            androidx.compose.animation.l r3 = androidx.compose.animation.EnterExitTransitionKt.m1038g(r3, r4)
            androidx.compose.animation.l r4 = androidx.compose.animation.EnterExitTransitionKt.m1042k()
            androidx.compose.animation.l r3 = r3.mo3551b(r4)
            r16 = r3
            goto L_0x0102
        L_0x0100:
            r16 = r8
        L_0x0102:
            if (r9 == 0) goto L_0x0107
            java.lang.String r3 = "AnimatedVisibility"
            r13 = r3
        L_0x0107:
            androidx.compose.animation.core.Transition r3 = androidx.compose.animation.core.TransitionKt.m1102d(r1, r13, r0)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7 r4 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7.INSTANCE
            int r5 = r2 << 3
            r6 = r5 & 896(0x380, float:1.256E-42)
            r6 = r6 | 48
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            r5 = r5 & r12
            r5 = r5 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r6
            r9 = r5 | r2
            r2 = r3
            r3 = r4
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r22
            r8 = r0
            m1025a(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r13
            r2 = r14
            r3 = r15
            r4 = r16
        L_0x012e:
            androidx.compose.runtime.v0 r9 = r0.mo5421U()
            if (r9 != 0) goto L_0x0135
            goto L_0x0145
        L_0x0135:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
            r0 = r12
            r1 = r17
            r6 = r22
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f3081d = r12
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m1026b(androidx.compose.animation.core.c0, androidx.compose.ui.d, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, kq.q, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m1027c(androidx.compose.animation.core.Transition<T> r17, p753kq.C19857l<? super T, java.lang.Boolean> r18, androidx.compose.p015ui.C1436d r19, androidx.compose.animation.C0473i r20, androidx.compose.animation.C0475k r21, p753kq.C19862q<? super androidx.compose.animation.C0468d, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r22, androidx.compose.runtime.C1302d r23, int r24, int r25) {
        /*
            r8 = r17
            r9 = r18
            r10 = r22
            r11 = r24
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "visible"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            r0 = 1031950689(0x3d825161, float:0.06363178)
            r1 = r23
            androidx.compose.runtime.ComposerImpl r12 = r1.mo5440h(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r25 & r0
            if (r0 == 0) goto L_0x0029
            r0 = r11 | 6
            goto L_0x0039
        L_0x0029:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x0038
            boolean r0 = r12.mo5408I(r8)
            if (r0 == 0) goto L_0x0035
            r0 = 4
            goto L_0x0036
        L_0x0035:
            r0 = 2
        L_0x0036:
            r0 = r0 | r11
            goto L_0x0039
        L_0x0038:
            r0 = r11
        L_0x0039:
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0040
            r0 = r0 | 48
            goto L_0x0050
        L_0x0040:
            r1 = r11 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0050
            boolean r1 = r12.mo5408I(r9)
            if (r1 == 0) goto L_0x004d
            r1 = 32
            goto L_0x004f
        L_0x004d:
            r1 = 16
        L_0x004f:
            r0 = r0 | r1
        L_0x0050:
            r1 = r25 & 2
            if (r1 == 0) goto L_0x0057
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006a
            r2 = r19
            boolean r3 = r12.mo5408I(r2)
            if (r3 == 0) goto L_0x0066
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r0 = r0 | r3
            goto L_0x006c
        L_0x006a:
            r2 = r19
        L_0x006c:
            r3 = r25 & 4
            if (r3 == 0) goto L_0x0073
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0086
            r4 = r20
            boolean r5 = r12.mo5408I(r4)
            if (r5 == 0) goto L_0x0082
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r0 = r0 | r5
            goto L_0x0088
        L_0x0086:
            r4 = r20
        L_0x0088:
            r5 = r25 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r5 == 0) goto L_0x0092
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r7 = r11 & r6
            if (r7 != 0) goto L_0x00a5
            r7 = r21
            boolean r13 = r12.mo5408I(r7)
            if (r13 == 0) goto L_0x00a1
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r0 = r0 | r13
            goto L_0x00a7
        L_0x00a5:
            r7 = r21
        L_0x00a7:
            r13 = r25 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x00b0
            r13 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00bf
        L_0x00b0:
            r13 = r11 & r14
            if (r13 != 0) goto L_0x00c0
            boolean r13 = r12.mo5408I(r10)
            if (r13 == 0) goto L_0x00bd
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r0 = r0 | r13
        L_0x00c0:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r0
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r15) goto L_0x00d6
            boolean r13 = r12.mo5442i()
            if (r13 != 0) goto L_0x00d0
            goto L_0x00d6
        L_0x00d0:
            r12.mo5396C()
            r3 = r2
            r5 = r7
            goto L_0x0126
        L_0x00d6:
            if (r1 == 0) goto L_0x00dc
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r13 = r1
            goto L_0x00dd
        L_0x00dc:
            r13 = r2
        L_0x00dd:
            r1 = 3
            r2 = 0
            if (r3 == 0) goto L_0x00ef
            androidx.compose.animation.j r3 = androidx.compose.animation.EnterExitTransitionKt.m1037f(r2, r1)
            androidx.compose.animation.j r4 = androidx.compose.animation.EnterExitTransitionKt.m1035d()
            androidx.compose.animation.j r3 = r3.mo3547b(r4)
            r15 = r3
            goto L_0x00f0
        L_0x00ef:
            r15 = r4
        L_0x00f0:
            if (r5 == 0) goto L_0x0101
            androidx.compose.animation.l r3 = androidx.compose.animation.EnterExitTransitionKt.m1042k()
            androidx.compose.animation.l r1 = androidx.compose.animation.EnterExitTransitionKt.m1038g(r2, r1)
            androidx.compose.animation.l r1 = r3.mo3551b(r1)
            r16 = r1
            goto L_0x0103
        L_0x0101:
            r16 = r7
        L_0x0103:
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r6
            r1 = r1 | r2
            r0 = r0 & r14
            r7 = r1 | r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r22
            r6 = r12
            m1025a(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = r13
            r4 = r15
            r5 = r16
        L_0x0126:
            androidx.compose.runtime.v0 r12 = r12.mo5421U()
            if (r12 != 0) goto L_0x012d
            goto L_0x013f
        L_0x012d:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
            r0 = r13
            r1 = r17
            r2 = r18
            r6 = r22
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.f3081d = r13
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m1027c(androidx.compose.animation.core.Transition, kq.l, androidx.compose.ui.d, androidx.compose.animation.i, androidx.compose.animation.k, kq.q, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1028d(boolean r17, androidx.compose.p015ui.C1436d r18, androidx.compose.animation.C0473i r19, androidx.compose.animation.C0475k r20, java.lang.String r21, p753kq.C19862q<? super androidx.compose.animation.C0468d, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r22, androidx.compose.runtime.C1302d r23, int r24, int r25) {
        /*
            r8 = r22
            r9 = r24
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r1 = r23
            androidx.compose.runtime.ComposerImpl r10 = r1.mo5440h(r0)
            r0 = r25 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r9 | 6
            r11 = r17
            goto L_0x002d
        L_0x001b:
            r0 = r9 & 14
            r11 = r17
            if (r0 != 0) goto L_0x002c
            boolean r0 = r10.mo5427a(r11)
            if (r0 == 0) goto L_0x0029
            r0 = 4
            goto L_0x002a
        L_0x0029:
            r0 = 2
        L_0x002a:
            r0 = r0 | r9
            goto L_0x002d
        L_0x002c:
            r0 = r9
        L_0x002d:
            r1 = r25 & 2
            if (r1 == 0) goto L_0x0034
            r0 = r0 | 48
            goto L_0x0047
        L_0x0034:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0047
            r2 = r18
            boolean r3 = r10.mo5408I(r2)
            if (r3 == 0) goto L_0x0043
            r3 = 32
            goto L_0x0045
        L_0x0043:
            r3 = 16
        L_0x0045:
            r0 = r0 | r3
            goto L_0x0049
        L_0x0047:
            r2 = r18
        L_0x0049:
            r3 = r25 & 4
            if (r3 == 0) goto L_0x0050
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            r4 = r19
            boolean r5 = r10.mo5408I(r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r0 = r0 | r5
            goto L_0x0065
        L_0x0063:
            r4 = r19
        L_0x0065:
            r5 = r25 & 8
            if (r5 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007f
            r6 = r20
            boolean r7 = r10.mo5408I(r6)
            if (r7 == 0) goto L_0x007b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r0 = r0 | r7
            goto L_0x0081
        L_0x007f:
            r6 = r20
        L_0x0081:
            r7 = r25 & 16
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008b
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r13 = r9 & r12
            if (r13 != 0) goto L_0x009e
            r13 = r21
            boolean r14 = r10.mo5408I(r13)
            if (r14 == 0) goto L_0x009a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r0 = r0 | r14
            goto L_0x00a0
        L_0x009e:
            r13 = r21
        L_0x00a0:
            r14 = r25 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00a9
            r14 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b8
        L_0x00a9:
            r14 = r9 & r15
            if (r14 != 0) goto L_0x00b9
            boolean r14 = r10.mo5408I(r8)
            if (r14 == 0) goto L_0x00b6
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r0 = r0 | r14
        L_0x00b9:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r0
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00d1
            boolean r14 = r10.mo5442i()
            if (r14 != 0) goto L_0x00c9
            goto L_0x00d1
        L_0x00c9:
            r10.mo5396C()
            r3 = r4
            r4 = r6
        L_0x00ce:
            r5 = r13
            goto L_0x0132
        L_0x00d1:
            if (r1 == 0) goto L_0x00d7
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r14 = r1
            goto L_0x00d8
        L_0x00d7:
            r14 = r2
        L_0x00d8:
            r1 = 0
            r2 = 3
            if (r3 == 0) goto L_0x00ea
            androidx.compose.animation.j r3 = androidx.compose.animation.EnterExitTransitionKt.m1037f(r1, r2)
            androidx.compose.animation.j r4 = androidx.compose.animation.EnterExitTransitionKt.m1035d()
            androidx.compose.animation.j r3 = r3.mo3547b(r4)
            r15 = r3
            goto L_0x00eb
        L_0x00ea:
            r15 = r4
        L_0x00eb:
            if (r5 == 0) goto L_0x00fc
            androidx.compose.animation.l r3 = androidx.compose.animation.EnterExitTransitionKt.m1042k()
            androidx.compose.animation.l r1 = androidx.compose.animation.EnterExitTransitionKt.m1038g(r1, r2)
            androidx.compose.animation.l r1 = r3.mo3551b(r1)
            r16 = r1
            goto L_0x00fe
        L_0x00fc:
            r16 = r6
        L_0x00fe:
            if (r7 == 0) goto L_0x0103
            java.lang.String r1 = "AnimatedVisibility"
            r13 = r1
        L_0x0103:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            r2 = r0 & 14
            int r3 = r0 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.m1103e(r1, r13, r10, r2, r3)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1 r2 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1.INSTANCE
            int r3 = r0 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r3 = r3 & r12
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r4
            r7 = r3 | r0
            r0 = r1
            r1 = r2
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r22
            r6 = r10
            m1025a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00ce
        L_0x0132:
            androidx.compose.runtime.v0 r10 = r10.mo5421U()
            if (r10 != 0) goto L_0x0139
            goto L_0x0149
        L_0x0139:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
            r0 = r12
            r1 = r17
            r6 = r22
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.f3081d = r12
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.m1028d(boolean, androidx.compose.ui.d, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, kq.q, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: e */
    public static final EnterExitState m1029e(Transition transition, C19857l lVar, Object obj, C1302d dVar) {
        EnterExitState enterExitState;
        dVar.mo5465u(361571134);
        dVar.mo5475z(-721837481, transition);
        if (transition.mo3413e()) {
            enterExitState = ((Boolean) lVar.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) lVar.invoke(transition.mo3410b())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            dVar.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            if (v == C1302d.C1303a.f2828a) {
                v = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            C1338j0 j0Var = (C1338j0) v;
            if (((Boolean) lVar.invoke(transition.mo3410b())).booleanValue()) {
                j0Var.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) lVar.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) j0Var.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        }
        dVar.mo5404G();
        dVar.mo5406H();
        return enterExitState;
    }
}
