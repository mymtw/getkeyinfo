package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;

public final class TextFieldDefaults {

    /* renamed from: a */
    public static final TextFieldDefaults f2324a = new TextFieldDefaults();

    /* renamed from: b */
    public static final float f2325b = ((float) 56);

    /* renamed from: c */
    public static final float f2326c = ((float) 280);

    /* renamed from: d */
    public static final float f2327d = ((float) 1);

    /* renamed from: e */
    public static final float f2328e = ((float) 2);

    /* renamed from: d */
    public static C1436d m2261d(C1436d dVar, boolean z, boolean z2, C0640j jVar, C1166a2 a2Var) {
        float f = f2328e;
        float f2 = f2327d;
        C19383o.m32797g(dVar, "$this$indicatorLine");
        C19383o.m32797g(jVar, "interactionSource");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new TextFieldDefaults$indicatorLine$2(z, z2, jVar, a2Var, f, f2));
    }

    /* renamed from: e */
    public static C1186g0 m2262e(C1302d dVar) {
        C1302d dVar2 = dVar;
        dVar2.mo5465u(1762667317);
        long b = C1545s.m3356b(((C1545s) dVar2.mo5410J(ContentColorKt.f2199a)).f3366a, ((Number) dVar2.mo5410J(ContentAlphaKt.f2198a)).floatValue());
        long b2 = C1545s.m3356b(b, C19543e0.m33299P(dVar));
        long j = C1545s.f3363h;
        C1345l1 l1Var = ColorsKt.f2187a;
        long f = ((C1259v) dVar2.mo5410J(l1Var)).mo5359f();
        long b3 = ((C1259v) dVar2.mo5410J(l1Var)).mo5355b();
        long b4 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5359f(), C19543e0.m33301S(dVar));
        long b5 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), C19543e0.m33299P(dVar));
        long b6 = C1545s.m3356b(b5, C19543e0.m33299P(dVar));
        long b7 = ((C1259v) dVar2.mo5410J(l1Var)).mo5355b();
        long j2 = b5;
        long b8 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), 0.54f);
        long b9 = C1545s.m3356b(b8, C19543e0.m33299P(dVar));
        long j3 = b8;
        long b10 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), 0.54f);
        long b11 = C1545s.m3356b(b10, C19543e0.m33299P(dVar));
        long b12 = ((C1259v) dVar2.mo5410J(l1Var)).mo5355b();
        long j4 = b10;
        long b13 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5359f(), C19543e0.m33301S(dVar));
        long b14 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), C19543e0.m33302T(dVar));
        long b15 = C1545s.m3356b(b14, C19543e0.m33299P(dVar));
        long b16 = ((C1259v) dVar2.mo5410J(l1Var)).mo5355b();
        long b17 = C1545s.m3356b(((C1259v) dVar2.mo5410J(l1Var)).mo5358e(), C19543e0.m33302T(dVar));
        C1186g0 g0Var = new C1186g0(b, b2, f, b3, b4, j2, b7, b6, j3, b9, j3, j4, b11, b12, j, b13, b14, b15, b16, b17, C1545s.m3356b(b17, C19543e0.m33299P(dVar)));
        dVar.mo5406H();
        return g0Var;
    }

    /* renamed from: f */
    public static C1186g0 m2263f(long j, long j2, long j3, long j4, long j5, C1302d dVar, int i) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        C1302d dVar2 = dVar;
        int i2 = i;
        dVar2.mo5465u(231892599);
        long b = (i2 & 1) != 0 ? C1545s.m3356b(((C1545s) dVar2.mo5410J(ContentColorKt.f2199a)).f3366a, ((Number) dVar2.mo5410J(ContentAlphaKt.f2198a)).floatValue()) : j;
        long b2 = (i2 & 2) != 0 ? C1545s.m3356b(b, C19543e0.m33299P(dVar)) : 0;
        long b3 = (i2 & 4) != 0 ? C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5358e(), 0.12f) : j2;
        long f = (i2 & 8) != 0 ? ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5359f() : j3;
        long b4 = (i2 & 16) != 0 ? ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5355b() : 0;
        long b5 = (i2 & 32) != 0 ? C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5359f(), C19543e0.m33301S(dVar)) : j4;
        long b6 = (i2 & 64) != 0 ? C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5358e(), 0.42f) : j5;
        long b7 = (i2 & 128) != 0 ? C1545s.m3356b(b6, C19543e0.m33299P(dVar)) : 0;
        long b8 = (i2 & 256) != 0 ? ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5355b() : 0;
        if ((i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
            j6 = b6;
            j7 = C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5358e(), 0.54f);
        } else {
            j6 = b6;
            j7 = 0;
        }
        long b9 = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? C1545s.m3356b(j7, C19543e0.m33299P(dVar)) : 0;
        long j16 = (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? j7 : 0;
        if ((i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            j8 = j7;
            j9 = C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5358e(), 0.54f);
        } else {
            j8 = j7;
            j9 = 0;
        }
        long b10 = (i2 & 8192) != 0 ? C1545s.m3356b(j9, C19543e0.m33299P(dVar)) : 0;
        long b11 = (i2 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5355b() : 0;
        if ((32768 & i2) != 0) {
            j10 = j9;
            j11 = C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5359f(), C19543e0.m33301S(dVar));
        } else {
            j10 = j9;
            j11 = 0;
        }
        if ((65536 & i2) != 0) {
            j12 = j11;
            j13 = C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5358e(), C19543e0.m33302T(dVar));
        } else {
            j12 = j11;
            j13 = 0;
        }
        long b12 = (131072 & i2) != 0 ? C1545s.m3356b(j13, C19543e0.m33299P(dVar)) : 0;
        long b13 = (262144 & i2) != 0 ? ((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5355b() : 0;
        if ((524288 & i2) != 0) {
            j14 = j13;
            j15 = C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5358e(), C19543e0.m33302T(dVar));
        } else {
            j14 = j13;
            j15 = 0;
        }
        C1186g0 g0Var = new C1186g0(b, b2, f, b4, b5, j6, b8, b7, j8, b9, j16, j10, b10, b11, b3, j12, j14, b12, b13, j15, (i2 & 1048576) != 0 ? C1545s.m3356b(j15, C19543e0.m33299P(dVar)) : 0);
        dVar.mo5406H();
        return g0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0132, code lost:
        if ((r11 & 64) != 0) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5164a(boolean r20, boolean r21, androidx.compose.foundation.interaction.C0639i r22, androidx.compose.material.C1166a2 r23, androidx.compose.p015ui.graphics.C1530k0 r24, float r25, float r26, androidx.compose.runtime.C1302d r27, int r28, int r29) {
        /*
            r19 = this;
            r8 = r22
            r9 = r23
            r10 = r28
            r11 = r29
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = 943754022(0x38408b26, float:4.590596E-5)
            r1 = r27
            androidx.compose.runtime.ComposerImpl r12 = r1.mo5440h(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r10 | 6
            r13 = r20
            goto L_0x0036
        L_0x0024:
            r0 = r10 & 14
            r13 = r20
            if (r0 != 0) goto L_0x0035
            boolean r0 = r12.mo5427a(r13)
            if (r0 == 0) goto L_0x0032
            r0 = 4
            goto L_0x0033
        L_0x0032:
            r0 = 2
        L_0x0033:
            r0 = r0 | r10
            goto L_0x0036
        L_0x0035:
            r0 = r10
        L_0x0036:
            r1 = r11 & 2
            if (r1 == 0) goto L_0x003f
            r0 = r0 | 48
            r14 = r21
            goto L_0x0051
        L_0x003f:
            r1 = r10 & 112(0x70, float:1.57E-43)
            r14 = r21
            if (r1 != 0) goto L_0x0051
            boolean r1 = r12.mo5427a(r14)
            if (r1 == 0) goto L_0x004e
            r1 = 32
            goto L_0x0050
        L_0x004e:
            r1 = 16
        L_0x0050:
            r0 = r0 | r1
        L_0x0051:
            r1 = r11 & 4
            if (r1 == 0) goto L_0x0058
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r1 = r10 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0068
            boolean r1 = r12.mo5408I(r8)
            if (r1 == 0) goto L_0x0065
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r0 = r0 | r1
        L_0x0068:
            r1 = r11 & 8
            if (r1 == 0) goto L_0x006f
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r1 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x007f
            boolean r1 = r12.mo5408I(r9)
            if (r1 == 0) goto L_0x007c
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r0 = r0 | r1
        L_0x007f:
            r1 = 57344(0xe000, float:8.0356E-41)
            r2 = r10 & r1
            if (r2 != 0) goto L_0x009b
            r2 = r11 & 16
            if (r2 != 0) goto L_0x0095
            r2 = r24
            boolean r3 = r12.mo5408I(r2)
            if (r3 == 0) goto L_0x0097
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0095:
            r2 = r24
        L_0x0097:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r0 = r0 | r3
            goto L_0x009d
        L_0x009b:
            r2 = r24
        L_0x009d:
            r3 = 458752(0x70000, float:6.42848E-40)
            r4 = r10 & r3
            if (r4 != 0) goto L_0x00b8
            r4 = r11 & 32
            if (r4 != 0) goto L_0x00b2
            r4 = r25
            boolean r5 = r12.mo5428b(r4)
            if (r5 == 0) goto L_0x00b4
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b2:
            r4 = r25
        L_0x00b4:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r0 = r0 | r5
            goto L_0x00ba
        L_0x00b8:
            r4 = r25
        L_0x00ba:
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r10
            if (r5 != 0) goto L_0x00d4
            r5 = r11 & 64
            if (r5 != 0) goto L_0x00ce
            r5 = r26
            boolean r6 = r12.mo5428b(r5)
            if (r6 == 0) goto L_0x00d0
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00ce:
            r5 = r26
        L_0x00d0:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r0 = r0 | r6
            goto L_0x00d6
        L_0x00d4:
            r5 = r26
        L_0x00d6:
            r6 = r11 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00df
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r15 = r19
            goto L_0x00f1
        L_0x00df:
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r10
            r15 = r19
            if (r6 != 0) goto L_0x00f2
            boolean r6 = r12.mo5408I(r15)
            if (r6 == 0) goto L_0x00ef
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r0 = r0 | r6
        L_0x00f2:
            r6 = 23967451(0x16db6db, float:4.3661218E-38)
            r6 = r6 & r0
            r7 = 4793490(0x492492, float:6.71711E-39)
            if (r6 != r7) goto L_0x010a
            boolean r6 = r12.mo5442i()
            if (r6 != 0) goto L_0x0102
            goto L_0x010a
        L_0x0102:
            r12.mo5396C()
            r6 = r2
            r7 = r4
            r8 = r5
            goto L_0x0195
        L_0x010a:
            r12.mo5466u0()
            r6 = r10 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r6 == 0) goto L_0x0135
            boolean r6 = r12.mo5425Y()
            if (r6 == 0) goto L_0x0121
            goto L_0x0135
        L_0x0121:
            r12.mo5396C()
            r6 = r11 & 16
            if (r6 == 0) goto L_0x012a
            r0 = r0 & r17
        L_0x012a:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0130
            r0 = r0 & r16
        L_0x0130:
            r6 = r11 & 64
            if (r6 == 0) goto L_0x0154
            goto L_0x0153
        L_0x0135:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0145
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r2 = r12.mo5410J(r2)
            androidx.compose.material.q1 r2 = (androidx.compose.material.C1225q1) r2
            p.a r2 = r2.f2547a
            r0 = r0 & r17
        L_0x0145:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x014d
            float r4 = f2328e
            r0 = r0 & r16
        L_0x014d:
            r6 = r11 & 64
            if (r6 == 0) goto L_0x0154
            float r5 = f2327d
        L_0x0153:
            r0 = r0 & r7
        L_0x0154:
            r7 = r2
            r16 = r4
            r17 = r5
            r12.mo5419S()
            r2 = r0 & 14
            r4 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            r4 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r0 = r0 >> 3
            r1 = r1 & r0
            r1 = r1 | r2
            r0 = r0 & r3
            r18 = r1 | r0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r16
            r5 = r17
            r6 = r12
            r8 = r7
            r7 = r18
            androidx.compose.runtime.j0 r0 = com.google.android.play.core.assetpacks.C15588c1.m25349u(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.g r0 = (androidx.compose.foundation.C0556g) r0
            androidx.compose.ui.d r0 = androidx.compose.foundation.C0555f.m1342a(r0, r8)
            r1 = 0
            androidx.compose.foundation.layout.BoxKt.m1455a(r0, r12, r1)
            r6 = r8
            r7 = r16
            r8 = r17
        L_0x0195:
            androidx.compose.runtime.v0 r12 = r12.mo5421U()
            if (r12 != 0) goto L_0x019c
            goto L_0x01b3
        L_0x019c:
            androidx.compose.material.TextFieldDefaults$BorderBox$1 r5 = new androidx.compose.material.TextFieldDefaults$BorderBox$1
            r0 = r5
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r13 = r5
            r5 = r23
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.f3081d = r13
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.mo5164a(boolean, boolean, androidx.compose.foundation.interaction.i, androidx.compose.material.a2, androidx.compose.ui.graphics.k0, float, float, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5165b(java.lang.String r34, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r35, boolean r36, boolean r37, androidx.compose.p015ui.text.input.C2006x r38, androidx.compose.foundation.interaction.C0639i r39, boolean r40, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r41, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r42, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r43, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r44, androidx.compose.material.C1166a2 r45, androidx.compose.foundation.layout.C0759v r46, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r47, androidx.compose.runtime.C1302d r48, int r49, int r50, int r51) {
        /*
            r33 = this;
            r15 = r34
            r14 = r35
            r13 = r38
            r12 = r39
            r11 = r49
            r10 = r50
            r9 = r51
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            r0 = -1280721485(0xffffffffb3a9bdb3, float:-7.904182E-8)
            r1 = r48
            androidx.compose.runtime.ComposerImpl r8 = r1.mo5440h(r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x0032
            r0 = r11 | 6
            goto L_0x0042
        L_0x0032:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x0041
            boolean r0 = r8.mo5408I(r15)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x003e:
            r0 = 2
        L_0x003f:
            r0 = r0 | r11
            goto L_0x0042
        L_0x0041:
            r0 = r11
        L_0x0042:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0049
            r0 = r0 | 48
            goto L_0x0059
        L_0x0049:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0059
            boolean r3 = r8.mo5408I(r14)
            if (r3 == 0) goto L_0x0056
            r3 = 32
            goto L_0x0058
        L_0x0056:
            r3 = 16
        L_0x0058:
            r0 = r0 | r3
        L_0x0059:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0060
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0060:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0074
            r3 = r36
            boolean r16 = r8.mo5427a(r3)
            if (r16 == 0) goto L_0x006f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r0 = r0 | r16
            goto L_0x0076
        L_0x0074:
            r3 = r36
        L_0x0076:
            r16 = r9 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0081
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0095
        L_0x0081:
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0095
            r1 = r37
            boolean r16 = r8.mo5427a(r1)
            if (r16 == 0) goto L_0x0090
            r16 = r18
            goto L_0x0092
        L_0x0090:
            r16 = r17
        L_0x0092:
            r0 = r0 | r16
            goto L_0x0097
        L_0x0095:
            r1 = r37
        L_0x0097:
            r16 = r9 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r16 == 0) goto L_0x00a5
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b6
        L_0x00a5:
            r16 = r11 & r19
            if (r16 != 0) goto L_0x00b6
            boolean r16 = r8.mo5408I(r13)
            if (r16 == 0) goto L_0x00b2
            r16 = r21
            goto L_0x00b4
        L_0x00b2:
            r16 = r20
        L_0x00b4:
            r0 = r0 | r16
        L_0x00b6:
            r16 = r9 & 32
            r22 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00bf
            r16 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00ce
        L_0x00bf:
            r16 = r11 & r22
            if (r16 != 0) goto L_0x00d0
            boolean r16 = r8.mo5408I(r12)
            if (r16 == 0) goto L_0x00cc
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ce
        L_0x00cc:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ce:
            r0 = r0 | r16
        L_0x00d0:
            r16 = r9 & 64
            r23 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00dd
            r24 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r24
            r2 = r40
            goto L_0x00f0
        L_0x00dd:
            r24 = r11 & r23
            r2 = r40
            if (r24 != 0) goto L_0x00f0
            boolean r25 = r8.mo5427a(r2)
            if (r25 == 0) goto L_0x00ec
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ee
        L_0x00ec:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00ee:
            r0 = r0 | r25
        L_0x00f0:
            r4 = r9 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x00fb
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r26
            r5 = r41
            goto L_0x0110
        L_0x00fb:
            r26 = 29360128(0x1c00000, float:7.052966E-38)
            r26 = r11 & r26
            r5 = r41
            if (r26 != 0) goto L_0x0110
            boolean r27 = r8.mo5408I(r5)
            if (r27 == 0) goto L_0x010c
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010e
        L_0x010c:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x010e:
            r0 = r0 | r27
        L_0x0110:
            r6 = r9 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x011b
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r28
            r7 = r42
            goto L_0x0130
        L_0x011b:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r11 & r28
            r7 = r42
            if (r28 != 0) goto L_0x0130
            boolean r29 = r8.mo5408I(r7)
            if (r29 == 0) goto L_0x012c
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012e
        L_0x012c:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012e:
            r0 = r0 | r29
        L_0x0130:
            r1 = r9 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x013b
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r29
            r2 = r43
            goto L_0x0150
        L_0x013b:
            r29 = 1879048192(0x70000000, float:1.58456325E29)
            r29 = r11 & r29
            r2 = r43
            if (r29 != 0) goto L_0x0150
            boolean r29 = r8.mo5408I(r2)
            if (r29 == 0) goto L_0x014c
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014e
        L_0x014c:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014e:
            r0 = r0 | r29
        L_0x0150:
            r29 = r0
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x015b
            r24 = r10 | 6
            r2 = r44
            goto L_0x0171
        L_0x015b:
            r30 = r10 & 14
            r2 = r44
            if (r30 != 0) goto L_0x016f
            boolean r30 = r8.mo5408I(r2)
            if (r30 == 0) goto L_0x016a
            r24 = 4
            goto L_0x016c
        L_0x016a:
            r24 = 2
        L_0x016c:
            r24 = r10 | r24
            goto L_0x0171
        L_0x016f:
            r24 = r10
        L_0x0171:
            r30 = r10 & 112(0x70, float:1.57E-43)
            if (r30 != 0) goto L_0x018b
            r2 = r9 & 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0184
            r2 = r45
            boolean r30 = r8.mo5408I(r2)
            if (r30 == 0) goto L_0x0186
            r25 = 32
            goto L_0x0188
        L_0x0184:
            r2 = r45
        L_0x0186:
            r25 = 16
        L_0x0188:
            r24 = r24 | r25
            goto L_0x018d
        L_0x018b:
            r2 = r45
        L_0x018d:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x01a7
            r2 = r9 & 4096(0x1000, float:5.74E-42)
            if (r2 != 0) goto L_0x01a0
            r2 = r46
            boolean r25 = r8.mo5408I(r2)
            if (r25 == 0) goto L_0x01a2
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x01a4
        L_0x01a0:
            r2 = r46
        L_0x01a2:
            r27 = 128(0x80, float:1.794E-43)
        L_0x01a4:
            r24 = r24 | r27
            goto L_0x01a9
        L_0x01a7:
            r2 = r46
        L_0x01a9:
            r2 = r24
            r3 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01b2
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x01c3
        L_0x01b2:
            r5 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x01c3
            r5 = r47
            boolean r24 = r8.mo5408I(r5)
            if (r24 == 0) goto L_0x01c0
            r17 = r18
        L_0x01c0:
            r2 = r2 | r17
            goto L_0x01c5
        L_0x01c3:
            r5 = r47
        L_0x01c5:
            r5 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x01cc
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01dd
        L_0x01cc:
            r5 = r10 & r19
            if (r5 != 0) goto L_0x01dd
            r5 = r33
            boolean r17 = r8.mo5408I(r5)
            if (r17 == 0) goto L_0x01da
            r20 = r21
        L_0x01da:
            r2 = r2 | r20
            goto L_0x01df
        L_0x01dd:
            r5 = r33
        L_0x01df:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r5 = r29 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x020f
            r5 = 46811(0xb6db, float:6.5596E-41)
            r5 = r5 & r2
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r7) goto L_0x020f
            boolean r5 = r8.mo5442i()
            if (r5 != 0) goto L_0x01f8
            goto L_0x020f
        L_0x01f8:
            r8.mo5396C()
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            r13 = r45
            r14 = r46
            r15 = r47
            r19 = r8
            r8 = r40
            goto L_0x032a
        L_0x020f:
            r8.mo5466u0()
            r5 = r11 & 1
            if (r5 == 0) goto L_0x023e
            boolean r5 = r8.mo5425Y()
            if (r5 == 0) goto L_0x021d
            goto L_0x023e
        L_0x021d:
            r8.mo5396C()
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0226
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0226:
            r0 = r9 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x022c
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x022c:
            r20 = r40
            r21 = r41
            r24 = r42
            r25 = r43
            r26 = r44
            r27 = r45
            r28 = r46
            r30 = r47
            goto L_0x02af
        L_0x023e:
            if (r16 == 0) goto L_0x0242
            r5 = 0
            goto L_0x0244
        L_0x0242:
            r5 = r40
        L_0x0244:
            r7 = 0
            if (r4 == 0) goto L_0x0249
            r4 = r7
            goto L_0x024b
        L_0x0249:
            r4 = r41
        L_0x024b:
            if (r6 == 0) goto L_0x024f
            r6 = r7
            goto L_0x0251
        L_0x024f:
            r6 = r42
        L_0x0251:
            if (r1 == 0) goto L_0x0255
            r1 = r7
            goto L_0x0257
        L_0x0255:
            r1 = r43
        L_0x0257:
            if (r0 == 0) goto L_0x025a
            goto L_0x025c
        L_0x025a:
            r7 = r44
        L_0x025c:
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0267
            androidx.compose.material.g0 r0 = m2262e(r8)
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0269
        L_0x0267:
            r0 = r45
        L_0x0269:
            r48 = r1
            r1 = r9 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x027c
            float r1 = androidx.compose.material.TextFieldImplKt.f2330b
            r16 = r4
            androidx.compose.foundation.layout.w r4 = new androidx.compose.foundation.layout.w
            r4.<init>(r1, r1, r1, r1)
            r1 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            r2 = r1
            goto L_0x0280
        L_0x027c:
            r16 = r4
            r4 = r46
        L_0x0280:
            if (r3 == 0) goto L_0x029d
            androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1 r1 = new androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
            r40 = r1
            r41 = r36
            r42 = r5
            r43 = r39
            r44 = r0
            r45 = r29
            r46 = r2
            r40.<init>(r41, r42, r43, r44, r45, r46)
            r3 = 1261916269(0x4b37506d, float:1.2013677E7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = p628nj.C18263b.m30805A(r8, r3, r1)
            goto L_0x029f
        L_0x029d:
            r1 = r47
        L_0x029f:
            r25 = r48
            r27 = r0
            r30 = r1
            r28 = r4
            r20 = r5
            r24 = r6
            r26 = r7
            r21 = r16
        L_0x02af:
            r8.mo5419S()
            androidx.compose.material.TextFieldType r0 = androidx.compose.material.TextFieldType.Outlined
            int r1 = r29 << 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r29 >> 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            int r3 = r29 >> 9
            r4 = r3 & r19
            r1 = r1 | r4
            r4 = r3 & r22
            r1 = r1 | r4
            r3 = r3 & r23
            r1 = r1 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            int r4 = r2 << 21
            r3 = r3 & r4
            r1 = r1 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            int r4 = r29 << 15
            r3 = r3 & r4
            r1 = r1 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            int r4 = r29 << 21
            r3 = r3 & r4
            r16 = r1 | r3
            int r1 = r29 >> 18
            r1 = r1 & 14
            int r3 = r29 >> 12
            r3 = r3 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r2 << 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            int r2 = r2 << 3
            r2 = r2 & r19
            r17 = r1 | r2
            r18 = 0
            r1 = r34
            r2 = r35
            r3 = r38
            r4 = r21
            r5 = r24
            r6 = r25
            r7 = r26
            r19 = r8
            r8 = r37
            r9 = r36
            r10 = r20
            r11 = r39
            r12 = r28
            r13 = r27
            r14 = r30
            r15 = r19
            androidx.compose.material.TextFieldImplKt.m2267a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8 = r20
            r9 = r21
            r10 = r24
            r11 = r25
            r12 = r26
            r14 = r28
            r15 = r30
        L_0x032a:
            androidx.compose.runtime.v0 r7 = r19.mo5421U()
            if (r7 != 0) goto L_0x0331
            goto L_0x0355
        L_0x0331:
            androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2 r6 = new androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
            r0 = r6
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r31 = r6
            r6 = r38
            r32 = r7
            r7 = r39
            r16 = r49
            r17 = r50
            r18 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r31
            r1 = r32
            r1.f3081d = r0
        L_0x0355:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.mo5165b(java.lang.String, kq.p, boolean, boolean, androidx.compose.ui.text.input.x, androidx.compose.foundation.interaction.i, boolean, kq.p, kq.p, kq.p, kq.p, androidx.compose.material.a2, androidx.compose.foundation.layout.v, kq.p, androidx.compose.runtime.d, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0139  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5166c(java.lang.String r38, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r39, boolean r40, boolean r41, androidx.compose.p015ui.text.input.C2006x r42, androidx.compose.foundation.interaction.C0639i r43, boolean r44, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r45, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r46, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r47, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r48, androidx.compose.material.C1166a2 r49, androidx.compose.foundation.layout.C0759v r50, androidx.compose.runtime.C1302d r51, int r52, int r53, int r54) {
        /*
            r37 = this;
            r15 = r38
            r13 = r39
            r12 = r42
            r11 = r43
            r10 = r52
            r9 = r53
            r8 = r54
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "innerTextField"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r0 = 1171040065(0x45cca741, float:6548.9067)
            r1 = r51
            androidx.compose.runtime.ComposerImpl r7 = r1.mo5440h(r0)
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0032
            r0 = r10 | 6
            goto L_0x0042
        L_0x0032:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0041
            boolean r0 = r7.mo5408I(r15)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x003e:
            r0 = 2
        L_0x003f:
            r0 = r0 | r10
            goto L_0x0042
        L_0x0041:
            r0 = r10
        L_0x0042:
            r3 = r8 & 2
            if (r3 == 0) goto L_0x0049
            r0 = r0 | 48
            goto L_0x0059
        L_0x0049:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0059
            boolean r3 = r7.mo5408I(r13)
            if (r3 == 0) goto L_0x0056
            r3 = 32
            goto L_0x0058
        L_0x0056:
            r3 = 16
        L_0x0058:
            r0 = r0 | r3
        L_0x0059:
            r3 = r8 & 4
            if (r3 == 0) goto L_0x0060
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0060:
            r3 = r10 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0074
            r3 = r40
            boolean r16 = r7.mo5427a(r3)
            if (r16 == 0) goto L_0x006f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r0 = r0 | r16
            goto L_0x0076
        L_0x0074:
            r3 = r40
        L_0x0076:
            r16 = r8 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0081
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0095
        L_0x0081:
            r1 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0095
            r1 = r41
            boolean r16 = r7.mo5427a(r1)
            if (r16 == 0) goto L_0x0090
            r16 = r18
            goto L_0x0092
        L_0x0090:
            r16 = r17
        L_0x0092:
            r0 = r0 | r16
            goto L_0x0097
        L_0x0095:
            r1 = r41
        L_0x0097:
            r16 = r8 & 16
            r28 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x00a1
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b2
        L_0x00a1:
            r16 = r10 & r28
            if (r16 != 0) goto L_0x00b2
            boolean r16 = r7.mo5408I(r12)
            if (r16 == 0) goto L_0x00ae
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b0
        L_0x00ae:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00b0:
            r0 = r0 | r16
        L_0x00b2:
            r16 = r8 & 32
            r29 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00bb
            r16 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00ca
        L_0x00bb:
            r16 = r10 & r29
            if (r16 != 0) goto L_0x00cc
            boolean r16 = r7.mo5408I(r11)
            if (r16 == 0) goto L_0x00c8
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r0 = r0 | r16
        L_0x00cc:
            r16 = r8 & 64
            r30 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00d9
            r19 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r19
            r2 = r44
            goto L_0x00ec
        L_0x00d9:
            r19 = r10 & r30
            r2 = r44
            if (r19 != 0) goto L_0x00ec
            boolean r20 = r7.mo5427a(r2)
            if (r20 == 0) goto L_0x00e8
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ea
        L_0x00e8:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00ea:
            r0 = r0 | r20
        L_0x00ec:
            r4 = r8 & 128(0x80, float:1.794E-43)
            r31 = 29360128(0x1c00000, float:7.052966E-38)
            if (r4 == 0) goto L_0x00f9
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r21
            r5 = r45
            goto L_0x010c
        L_0x00f9:
            r21 = r10 & r31
            r5 = r45
            if (r21 != 0) goto L_0x010c
            boolean r22 = r7.mo5408I(r5)
            if (r22 == 0) goto L_0x0108
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r0 = r0 | r22
        L_0x010c:
            r6 = r8 & 256(0x100, float:3.59E-43)
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            if (r6 == 0) goto L_0x0119
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r23
            r14 = r46
            goto L_0x012c
        L_0x0119:
            r23 = r10 & r32
            r14 = r46
            if (r23 != 0) goto L_0x012c
            boolean r24 = r7.mo5408I(r14)
            if (r24 == 0) goto L_0x0128
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r0 = r0 | r24
        L_0x012c:
            r1 = r8 & 512(0x200, float:7.175E-43)
            r33 = 1879048192(0x70000000, float:1.58456325E29)
            if (r1 == 0) goto L_0x0139
            r24 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r24
            r2 = r47
            goto L_0x014c
        L_0x0139:
            r24 = r10 & r33
            r2 = r47
            if (r24 != 0) goto L_0x014c
            boolean r24 = r7.mo5408I(r2)
            if (r24 == 0) goto L_0x0148
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014a
        L_0x0148:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014a:
            r0 = r0 | r24
        L_0x014c:
            r34 = r0
            r0 = r8 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0157
            r19 = r9 | 6
            r2 = r48
            goto L_0x016d
        L_0x0157:
            r24 = r9 & 14
            r2 = r48
            if (r24 != 0) goto L_0x016b
            boolean r24 = r7.mo5408I(r2)
            if (r24 == 0) goto L_0x0166
            r19 = 4
            goto L_0x0168
        L_0x0166:
            r19 = 2
        L_0x0168:
            r19 = r9 | r19
            goto L_0x016d
        L_0x016b:
            r19 = r9
        L_0x016d:
            r24 = r9 & 112(0x70, float:1.57E-43)
            if (r24 != 0) goto L_0x0187
            r2 = r8 & 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0180
            r2 = r49
            boolean r24 = r7.mo5408I(r2)
            if (r24 == 0) goto L_0x0182
            r20 = 32
            goto L_0x0184
        L_0x0180:
            r2 = r49
        L_0x0182:
            r20 = 16
        L_0x0184:
            r19 = r19 | r20
            goto L_0x0189
        L_0x0187:
            r2 = r49
        L_0x0189:
            r2 = r9 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x01a3
            r2 = r8 & 4096(0x1000, float:5.74E-42)
            if (r2 != 0) goto L_0x019c
            r2 = r50
            boolean r20 = r7.mo5408I(r2)
            if (r20 == 0) goto L_0x019e
            r22 = 256(0x100, float:3.59E-43)
            goto L_0x01a0
        L_0x019c:
            r2 = r50
        L_0x019e:
            r22 = 128(0x80, float:1.794E-43)
        L_0x01a0:
            r19 = r19 | r22
            goto L_0x01a5
        L_0x01a3:
            r2 = r50
        L_0x01a5:
            r2 = r19
            r3 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01ae
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bf
        L_0x01ae:
            r3 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x01bf
            r3 = r37
            boolean r19 = r7.mo5408I(r3)
            if (r19 == 0) goto L_0x01bc
            r17 = r18
        L_0x01bc:
            r2 = r2 | r17
            goto L_0x01c1
        L_0x01bf:
            r3 = r37
        L_0x01c1:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r34 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x01ec
            r3 = r2 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r3 != r5) goto L_0x01ec
            boolean r3 = r7.mo5442i()
            if (r3 != 0) goto L_0x01d8
            goto L_0x01ec
        L_0x01d8:
            r7.mo5396C()
            r8 = r44
            r9 = r45
            r11 = r47
            r12 = r48
            r13 = r49
            r26 = r7
            r10 = r14
            r14 = r50
            goto L_0x0304
        L_0x01ec:
            r7.mo5466u0()
            r3 = r10 & 1
            if (r3 == 0) goto L_0x0219
            boolean r3 = r7.mo5425Y()
            if (r3 == 0) goto L_0x01fa
            goto L_0x0219
        L_0x01fa:
            r7.mo5396C()
            r0 = r8 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0203
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0203:
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0209
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0209:
            r19 = r44
            r20 = r45
            r22 = r47
            r23 = r48
            r24 = r49
            r25 = r50
        L_0x0215:
            r21 = r14
            goto L_0x0294
        L_0x0219:
            if (r16 == 0) goto L_0x021d
            r3 = 0
            goto L_0x021f
        L_0x021d:
            r3 = r44
        L_0x021f:
            r5 = 0
            if (r4 == 0) goto L_0x0224
            r4 = r5
            goto L_0x0226
        L_0x0224:
            r4 = r45
        L_0x0226:
            if (r6 == 0) goto L_0x0229
            r14 = r5
        L_0x0229:
            if (r1 == 0) goto L_0x022d
            r1 = r5
            goto L_0x022f
        L_0x022d:
            r1 = r47
        L_0x022f:
            if (r0 == 0) goto L_0x0232
            goto L_0x0234
        L_0x0232:
            r5 = r48
        L_0x0234:
            r0 = r8 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x024e
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r27 = 2097151(0x1fffff, float:2.938734E-39)
            r26 = r7
            androidx.compose.material.g0 r0 = m2263f(r16, r18, r20, r22, r24, r26, r27)
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0250
        L_0x024e:
            r0 = r49
        L_0x0250:
            r6 = r8 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0281
            if (r4 != 0) goto L_0x0264
            float r6 = androidx.compose.material.TextFieldImplKt.f2330b
            r44 = r0
            androidx.compose.foundation.layout.w r0 = new androidx.compose.foundation.layout.w
            r0.<init>(r6, r6, r6, r6)
            r45 = r1
            r51 = r3
            goto L_0x0276
        L_0x0264:
            r44 = r0
            float r0 = androidx.compose.material.TextFieldImplKt.f2330b
            float r6 = androidx.compose.material.TextFieldKt.f2334a
            r45 = r1
            float r1 = androidx.compose.material.TextFieldKt.f2335b
            r51 = r3
            androidx.compose.foundation.layout.w r3 = new androidx.compose.foundation.layout.w
            r3.<init>(r0, r6, r0, r1)
            r0 = r3
        L_0x0276:
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            r24 = r44
            r22 = r45
            r19 = r51
            r25 = r0
            goto L_0x028f
        L_0x0281:
            r44 = r0
            r45 = r1
            r51 = r3
            r24 = r44
            r22 = r45
            r25 = r50
            r19 = r51
        L_0x028f:
            r20 = r4
            r23 = r5
            goto L_0x0215
        L_0x0294:
            r7.mo5419S()
            androidx.compose.material.TextFieldType r0 = androidx.compose.material.TextFieldType.Filled
            r14 = 0
            int r1 = r34 << 3
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r34 >> 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            int r3 = r34 >> 9
            r4 = r3 & r28
            r1 = r1 | r4
            r4 = r3 & r29
            r1 = r1 | r4
            r3 = r3 & r30
            r1 = r1 | r3
            int r3 = r2 << 21
            r3 = r3 & r31
            r1 = r1 | r3
            int r3 = r34 << 15
            r3 = r3 & r32
            r1 = r1 | r3
            int r3 = r34 << 21
            r3 = r3 & r33
            r16 = r1 | r3
            int r1 = r34 >> 18
            r1 = r1 & 14
            int r3 = r34 >> 12
            r3 = r3 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r2 = r2 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r17 = r1 | r2
            r18 = 16384(0x4000, float:2.2959E-41)
            r1 = r38
            r2 = r39
            r3 = r42
            r4 = r20
            r5 = r21
            r6 = r22
            r26 = r7
            r7 = r23
            r8 = r41
            r9 = r40
            r10 = r19
            r11 = r43
            r12 = r25
            r13 = r24
            r15 = r26
            androidx.compose.material.TextFieldImplKt.m2267a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r14 = r25
        L_0x0304:
            androidx.compose.runtime.v0 r15 = r26.mo5421U()
            if (r15 != 0) goto L_0x030b
            goto L_0x032f
        L_0x030b:
            androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1 r7 = new androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
            r0 = r7
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r35 = r7
            r7 = r43
            r36 = r15
            r15 = r52
            r16 = r53
            r17 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r35
            r1 = r36
            r1.f3081d = r0
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.mo5166c(java.lang.String, kq.p, boolean, boolean, androidx.compose.ui.text.input.x, androidx.compose.foundation.interaction.i, boolean, kq.p, kq.p, kq.p, kq.p, androidx.compose.material.a2, androidx.compose.foundation.layout.v, androidx.compose.runtime.d, int, int, int):void");
    }
}
