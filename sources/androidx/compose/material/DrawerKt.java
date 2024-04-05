package androidx.compose.material;

import androidx.compose.animation.core.C0411a;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.saveable.C1366b;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.logging.type.LogSeverity;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class DrawerKt {

    /* renamed from: a */
    public static final float f2203a = ((float) 56);

    /* renamed from: b */
    public static final float f2204b = ((float) LogSeverity.WARNING_VALUE);

    /* renamed from: c */
    public static final C0433j0<Float> f2205c = new C0433j0<>(256, (C0448r) null, 6);

    /* JADX WARNING: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0117  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2178a(p753kq.C19862q<? super androidx.compose.foundation.layout.C0739i, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r34, androidx.compose.p015ui.C1436d r35, androidx.compose.material.C1206k0 r36, boolean r37, androidx.compose.p015ui.graphics.C1530k0 r38, float r39, long r40, long r42, long r44, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r46, androidx.compose.runtime.C1302d r47, int r48, int r49) {
        /*
            r15 = r34
            r14 = r46
            r13 = r48
            r12 = r49
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 1305806945(0x4dd50861, float:4.46762016E8)
            r1 = r47
            androidx.compose.runtime.ComposerImpl r11 = r1.mo5440h(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.mo5408I(r15)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r13
            goto L_0x0032
        L_0x0031:
            r0 = r13
        L_0x0032:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r35
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
            r2 = r35
        L_0x004e:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0067
            r3 = r12 & 4
            if (r3 != 0) goto L_0x0061
            r3 = r36
            boolean r4 = r11.mo5408I(r3)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r3 = r36
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r4
            goto L_0x0069
        L_0x0067:
            r3 = r36
        L_0x0069:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0070
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0083
            r5 = r37
            boolean r6 = r11.mo5427a(r5)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r0 = r0 | r6
            goto L_0x0085
        L_0x0083:
            r5 = r37
        L_0x0085:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00a0
            r6 = r12 & 16
            if (r6 != 0) goto L_0x009a
            r6 = r38
            boolean r7 = r11.mo5408I(r6)
            if (r7 == 0) goto L_0x009c
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r6 = r38
        L_0x009c:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r0 = r0 | r7
            goto L_0x00a2
        L_0x00a0:
            r6 = r38
        L_0x00a2:
            r7 = r12 & 32
            if (r7 == 0) goto L_0x00aa
            r8 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r8
            goto L_0x00be
        L_0x00aa:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00be
            r8 = r39
            boolean r9 = r11.mo5428b(r8)
            if (r9 == 0) goto L_0x00ba
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r0 = r0 | r9
            goto L_0x00c0
        L_0x00be:
            r8 = r39
        L_0x00c0:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00db
            r9 = r12 & 64
            if (r9 != 0) goto L_0x00d4
            r9 = r40
            boolean r16 = r11.mo5434e(r9)
            if (r16 == 0) goto L_0x00d6
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d4:
            r9 = r40
        L_0x00d6:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r0 = r0 | r16
            goto L_0x00dd
        L_0x00db:
            r9 = r40
        L_0x00dd:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00f9
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f2
            r2 = r42
            boolean r16 = r11.mo5434e(r2)
            if (r16 == 0) goto L_0x00f4
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f2:
            r2 = r42
        L_0x00f4:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r0 = r0 | r16
            goto L_0x00fb
        L_0x00f9:
            r2 = r42
        L_0x00fb:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x0117
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0110
            r2 = r44
            boolean r16 = r11.mo5434e(r2)
            if (r16 == 0) goto L_0x0112
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0110:
            r2 = r44
        L_0x0112:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r0 = r0 | r16
            goto L_0x0119
        L_0x0117:
            r2 = r44
        L_0x0119:
            r2 = r12 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0120
            r2 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x0130
        L_0x0120:
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r13
            if (r2 != 0) goto L_0x0131
            boolean r2 = r11.mo5408I(r14)
            if (r2 == 0) goto L_0x012e
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x012e:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0130:
            r0 = r0 | r2
        L_0x0131:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r0
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x0153
            boolean r2 = r11.mo5442i()
            if (r2 != 0) goto L_0x0141
            goto L_0x0153
        L_0x0141:
            r11.mo5396C()
            r2 = r35
            r3 = r36
            r4 = r5
            r5 = r6
            r6 = r8
            r7 = r9
            r1 = r11
            r9 = r42
            r11 = r44
            goto L_0x0292
        L_0x0153:
            r11.mo5466u0()
            r2 = r13 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r2 == 0) goto L_0x01a0
            boolean r2 = r11.mo5425Y()
            if (r2 == 0) goto L_0x016d
            goto L_0x01a0
        L_0x016d:
            r11.mo5396C()
            r1 = r12 & 4
            if (r1 == 0) goto L_0x0176
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0176:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x017c
            r0 = r0 & r17
        L_0x017c:
            r1 = r12 & 64
            if (r1 == 0) goto L_0x0182
            r0 = r0 & r16
        L_0x0182:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0187
            r0 = r0 & r3
        L_0x0187:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x018d
            r0 = r0 & r18
        L_0x018d:
            r16 = r35
            r17 = r36
            r23 = r42
            r25 = r44
            r3 = r0
            r18 = r5
            r19 = r6
            r20 = r8
            r21 = r9
            goto L_0x0211
        L_0x01a0:
            if (r1 == 0) goto L_0x01a5
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x01a7
        L_0x01a5:
            r1 = r35
        L_0x01a7:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x01b4
            androidx.compose.material.DrawerValue r2 = androidx.compose.material.DrawerValue.Closed
            androidx.compose.material.k0 r2 = m2181d(r2, r11)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01b6
        L_0x01b4:
            r2 = r36
        L_0x01b6:
            if (r4 == 0) goto L_0x01ba
            r4 = 1
            goto L_0x01bb
        L_0x01ba:
            r4 = r5
        L_0x01bb:
            r5 = r12 & 16
            if (r5 == 0) goto L_0x01cc
            androidx.compose.runtime.l1 r5 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r5 = r11.mo5410J(r5)
            androidx.compose.material.q1 r5 = (androidx.compose.material.C1225q1) r5
            p.a r5 = r5.f2549c
            r0 = r0 & r17
            goto L_0x01cd
        L_0x01cc:
            r5 = r6
        L_0x01cd:
            if (r7 == 0) goto L_0x01d2
            float r6 = androidx.compose.material.C1203j0.f2505a
            goto L_0x01d3
        L_0x01d2:
            r6 = r8
        L_0x01d3:
            r7 = r12 & 64
            if (r7 == 0) goto L_0x01e6
            androidx.compose.runtime.l1 r7 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r7 = r11.mo5410J(r7)
            androidx.compose.material.v r7 = (androidx.compose.material.C1259v) r7
            long r7 = r7.mo5363j()
            r0 = r0 & r16
            goto L_0x01e7
        L_0x01e6:
            r7 = r9
        L_0x01e7:
            r9 = r12 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01f1
            long r9 = androidx.compose.material.ColorsKt.m2174b(r7, r11)
            r0 = r0 & r3
            goto L_0x01f3
        L_0x01f1:
            r9 = r42
        L_0x01f3:
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x01fe
            long r16 = androidx.compose.material.C1203j0.m2333a(r11)
            r0 = r0 & r18
            goto L_0x0200
        L_0x01fe:
            r16 = r44
        L_0x0200:
            r3 = r0
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r23 = r9
            r25 = r16
            r16 = r1
            r17 = r2
        L_0x0211:
            r11.mo5419S()
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r11.mo5465u(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r0)
            java.lang.Object r0 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r1) goto L_0x0237
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.internal.f r0 = androidx.compose.runtime.C1415u.m3034h(r0, r11)
            androidx.compose.runtime.m r1 = new androidx.compose.runtime.m
            r1.<init>(r0)
            r11.mo5407H0(r1)
            r0 = r1
        L_0x0237:
            r1 = 0
            r11.mo5418R(r1)
            androidx.compose.runtime.m r0 = (androidx.compose.runtime.C1346m) r0
            kotlinx.coroutines.d0 r9 = r0.f2939b
            r11.mo5418R(r1)
            androidx.compose.ui.d r27 = androidx.compose.foundation.layout.SizeKt.m1486f(r16)
            r28 = 0
            r29 = 0
            androidx.compose.material.DrawerKt$ModalDrawer$1 r10 = new androidx.compose.material.DrawerKt$ModalDrawer$1
            r0 = r10
            r1 = r17
            r2 = r18
            r4 = r25
            r6 = r19
            r7 = r21
            r30 = r9
            r15 = r10
            r9 = r23
            r31 = r11
            r11 = r20
            r12 = r46
            r13 = r30
            r14 = r34
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r12, r13, r14)
            r0 = 816674999(0x30ad78b7, float:1.2621716E-9)
            r1 = r31
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r1, r0, r15)
            r2 = 3072(0xc00, float:4.305E-42)
            r3 = 6
            r35 = r27
            r36 = r28
            r37 = r29
            r38 = r0
            r39 = r1
            r40 = r2
            r41 = r3
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m1460a(r35, r36, r37, r38, r39, r40, r41)
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r11 = r25
        L_0x0292:
            androidx.compose.runtime.v0 r15 = r1.mo5421U()
            if (r15 != 0) goto L_0x0299
            goto L_0x02b1
        L_0x0299:
            androidx.compose.material.DrawerKt$ModalDrawer$2 r14 = new androidx.compose.material.DrawerKt$ModalDrawer$2
            r0 = r14
            r1 = r34
            r13 = r46
            r32 = r14
            r14 = r48
            r33 = r15
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r0 = r32
            r1 = r33
            r1.f3081d = r0
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m2178a(kq.q, androidx.compose.ui.d, androidx.compose.material.k0, boolean, androidx.compose.ui.graphics.k0, float, long, long, long, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: b */
    public static final void m2179b(long j, C19846a aVar, boolean z, C1302d dVar, int i) {
        int i2;
        C1436d dVar2;
        ComposerImpl h = dVar.mo5440h(-513067266);
        if ((i & 14) == 0) {
            i2 = (h.mo5434e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(aVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5427a(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            if (j != C1545s.f3364i) {
                float f = 0.0f;
                if (z) {
                    f = 1.0f;
                }
                C0424f b = C0411a.m1106b(f, new C0433j0(0, (C0448r) null, 7), h, 0, 12);
                String K = C1993m.m4350K(1, h);
                h.mo5465u(-1298949409);
                if (z) {
                    C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
                    h.mo5465u(1157296644);
                    boolean I = h.mo5408I(aVar);
                    Object c0 = h.mo5431c0();
                    if (I || c0 == C1302d.C1303a.f2828a) {
                        c0 = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(aVar, (C19340c<? super DrawerKt$BottomDrawerScrim$dismissModifier$1$1>) null);
                        h.mo5407H0(c0);
                    }
                    h.mo5418R(false);
                    C1436d b2 = SuspendingPointerInputFilterKt.m3484b(aVar2, aVar, (C19861p) c0);
                    h.mo5465u(511388516);
                    boolean I2 = h.mo5408I(K) | h.mo5408I(aVar);
                    Object c02 = h.mo5431c0();
                    if (I2 || c02 == C1302d.C1303a.f2828a) {
                        c02 = new DrawerKt$BottomDrawerScrim$dismissModifier$2$1(K, aVar);
                        h.mo5407H0(c02);
                    }
                    h.mo5418R(false);
                    dVar2 = SemanticsModifierKt.m4174a(b2, true, (C19857l) c02);
                } else {
                    dVar2 = C1436d.C1437a.f3125b;
                }
                h.mo5418R(false);
                C1436d i0 = SizeKt.m1486f(C1436d.C1437a.f3125b).mo6148i0(dVar2);
                C1545s sVar = new C1545s(j);
                h.mo5465u(511388516);
                boolean I3 = h.mo5408I(sVar) | h.mo5408I(b);
                Object c03 = h.mo5431c0();
                if (I3 || c03 == C1302d.C1303a.f2828a) {
                    c03 = new DrawerKt$BottomDrawerScrim$1$1(j, b);
                    h.mo5407H0(c03);
                }
                h.mo5418R(false);
                CanvasKt.m1294a(i0, (C19857l) c03, h, 0);
            }
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new DrawerKt$BottomDrawerScrim$2(j, aVar, z, i);
        }
    }

    /* renamed from: c */
    public static final void m2180c(boolean z, C19846a aVar, C19846a aVar2, long j, C1302d dVar, int i) {
        int i2;
        C1436d dVar2;
        ComposerImpl h = dVar.mo5440h(1983403750);
        if ((i & 14) == 0) {
            i2 = (h.mo5427a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(aVar) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.mo5408I(aVar2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.mo5434e(j) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            String K = C1993m.m4350K(1, h);
            h.mo5465u(1010554047);
            if (z) {
                C1436d.C1437a aVar3 = C1436d.C1437a.f3125b;
                h.mo5465u(1157296644);
                boolean I = h.mo5408I(aVar);
                Object c0 = h.mo5431c0();
                if (I || c0 == C1302d.C1303a.f2828a) {
                    c0 = new DrawerKt$Scrim$dismissDrawer$1$1(aVar, (C19340c<? super DrawerKt$Scrim$dismissDrawer$1$1>) null);
                    h.mo5407H0(c0);
                }
                h.mo5418R(false);
                C1436d b = SuspendingPointerInputFilterKt.m3484b(aVar3, aVar, (C19861p) c0);
                h.mo5465u(511388516);
                boolean I2 = h.mo5408I(K) | h.mo5408I(aVar);
                Object c02 = h.mo5431c0();
                if (I2 || c02 == C1302d.C1303a.f2828a) {
                    c02 = new DrawerKt$Scrim$dismissDrawer$2$1(K, aVar);
                    h.mo5407H0(c02);
                }
                h.mo5418R(false);
                dVar2 = SemanticsModifierKt.m4174a(b, true, (C19857l) c02);
            } else {
                dVar2 = C1436d.C1437a.f3125b;
            }
            h.mo5418R(false);
            C1436d i0 = SizeKt.m1486f(C1436d.C1437a.f3125b).mo6148i0(dVar2);
            C1545s sVar = new C1545s(j);
            h.mo5465u(511388516);
            boolean I3 = h.mo5408I(sVar) | h.mo5408I(aVar2);
            Object c03 = h.mo5431c0();
            if (I3 || c03 == C1302d.C1303a.f2828a) {
                c03 = new DrawerKt$Scrim$1$1(j, aVar2);
                h.mo5407H0(c03);
            }
            h.mo5418R(false);
            CanvasKt.m1294a(i0, (C19857l) c03, h, 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new DrawerKt$Scrim$2(z, aVar, aVar2, j, i);
        }
    }

    /* renamed from: d */
    public static final C1206k0 m2181d(DrawerValue drawerValue, C1302d dVar) {
        C19383o.m32797g(drawerValue, "initialValue");
        dVar.mo5465u(-1435874229);
        DrawerKt$rememberDrawerState$1 drawerKt$rememberDrawerState$1 = DrawerKt$rememberDrawerState$1.INSTANCE;
        C19383o.m32797g(drawerKt$rememberDrawerState$1, "confirmStateChange");
        C1206k0 k0Var = (C1206k0) C1366b.m2863a(new Object[0], SaverKt.m2861a(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(drawerKt$rememberDrawerState$1)), new DrawerKt$rememberDrawerState$2(drawerValue, drawerKt$rememberDrawerState$1), dVar, 4);
        dVar.mo5406H();
        return k0Var;
    }
}
