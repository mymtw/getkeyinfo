package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.widgets.e */
public final class C2221e extends C2226h {

    /* renamed from: C0 */
    public int f5280C0 = -1;

    /* renamed from: D0 */
    public int f5281D0 = -1;

    /* renamed from: E0 */
    public int f5282E0 = -1;

    /* renamed from: F0 */
    public int f5283F0 = -1;

    /* renamed from: G0 */
    public int f5284G0 = -1;

    /* renamed from: H0 */
    public int f5285H0 = -1;

    /* renamed from: I0 */
    public float f5286I0 = 0.5f;

    /* renamed from: J0 */
    public float f5287J0 = 0.5f;

    /* renamed from: K0 */
    public float f5288K0 = 0.5f;

    /* renamed from: L0 */
    public float f5289L0 = 0.5f;

    /* renamed from: M0 */
    public float f5290M0 = 0.5f;

    /* renamed from: N0 */
    public float f5291N0 = 0.5f;

    /* renamed from: O0 */
    public int f5292O0 = 0;

    /* renamed from: P0 */
    public int f5293P0 = 0;

    /* renamed from: Q0 */
    public int f5294Q0 = 2;

    /* renamed from: R0 */
    public int f5295R0 = 2;

    /* renamed from: S0 */
    public int f5296S0 = 0;

    /* renamed from: T0 */
    public int f5297T0 = -1;

    /* renamed from: U0 */
    public int f5298U0 = 0;

    /* renamed from: V0 */
    public ArrayList<C2222a> f5299V0 = new ArrayList<>();

    /* renamed from: W0 */
    public ConstraintWidget[] f5300W0 = null;

    /* renamed from: X0 */
    public ConstraintWidget[] f5301X0 = null;

    /* renamed from: Y0 */
    public int[] f5302Y0 = null;

    /* renamed from: Z0 */
    public ConstraintWidget[] f5303Z0;

    /* renamed from: a1 */
    public int f5304a1 = 0;

    /* renamed from: androidx.constraintlayout.solver.widgets.e$a */
    public class C2222a {

        /* renamed from: a */
        public int f5305a;

        /* renamed from: b */
        public ConstraintWidget f5306b = null;

        /* renamed from: c */
        public int f5307c = 0;

        /* renamed from: d */
        public ConstraintAnchor f5308d;

        /* renamed from: e */
        public ConstraintAnchor f5309e;

        /* renamed from: f */
        public ConstraintAnchor f5310f;

        /* renamed from: g */
        public ConstraintAnchor f5311g;

        /* renamed from: h */
        public int f5312h = 0;

        /* renamed from: i */
        public int f5313i = 0;

        /* renamed from: j */
        public int f5314j = 0;

        /* renamed from: k */
        public int f5315k = 0;

        /* renamed from: l */
        public int f5316l = 0;

        /* renamed from: m */
        public int f5317m = 0;

        /* renamed from: n */
        public int f5318n = 0;

        /* renamed from: o */
        public int f5319o = 0;

        /* renamed from: p */
        public int f5320p = 0;

        /* renamed from: q */
        public int f5321q = 0;

        public C2222a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f5305a = i;
            this.f5308d = constraintAnchor;
            this.f5309e = constraintAnchor2;
            this.f5310f = constraintAnchor3;
            this.f5311g = constraintAnchor4;
            this.f5312h = C2221e.this.f5337v0;
            this.f5313i = C2221e.this.f5333r0;
            this.f5314j = C2221e.this.f5338w0;
            this.f5315k = C2221e.this.f5334s0;
            this.f5321q = i2;
        }

        /* renamed from: a */
        public final void mo8347a(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.f5305a == 0) {
                int S = C2221e.this.mo8346S(constraintWidget, this.f5321q);
                if (constraintWidget.f5125P[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f5320p++;
                    S = 0;
                }
                C2221e eVar = C2221e.this;
                int i2 = eVar.f5292O0;
                if (constraintWidget.f5143d0 != 8) {
                    i = i2;
                }
                this.f5316l = S + i + this.f5316l;
                int R = eVar.mo8345R(constraintWidget, this.f5321q);
                if (this.f5306b == null || this.f5307c < R) {
                    this.f5306b = constraintWidget;
                    this.f5307c = R;
                    this.f5317m = R;
                }
            } else {
                int S2 = C2221e.this.mo8346S(constraintWidget, this.f5321q);
                int R2 = C2221e.this.mo8345R(constraintWidget, this.f5321q);
                if (constraintWidget.f5125P[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f5320p++;
                    R2 = 0;
                }
                int i3 = C2221e.this.f5293P0;
                if (constraintWidget.f5143d0 != 8) {
                    i = i3;
                }
                this.f5317m = R2 + i + this.f5317m;
                if (this.f5306b == null || this.f5307c < S2) {
                    this.f5306b = constraintWidget;
                    this.f5307c = S2;
                    this.f5316l = S2;
                }
            }
            this.f5319o++;
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo8348b(int r18, boolean r19, boolean r20) {
            /*
                r17 = this;
                r0 = r17
                int r1 = r0.f5319o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x001e
                int r4 = r0.f5318n
                int r4 = r4 + r3
                androidx.constraintlayout.solver.widgets.e r5 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r6 = r5.f5304a1
                if (r4 < r6) goto L_0x0012
                goto L_0x001e
            L_0x0012:
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = r5.f5303Z0
                r4 = r5[r4]
                if (r4 == 0) goto L_0x001b
                r4.mo8264D()
            L_0x001b:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x001e:
                if (r1 == 0) goto L_0x02da
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.f5306b
                if (r3 != 0) goto L_0x0026
                goto L_0x02da
            L_0x0026:
                if (r20 == 0) goto L_0x002c
                if (r18 != 0) goto L_0x002c
                r4 = 1
                goto L_0x002d
            L_0x002c:
                r4 = r2
            L_0x002d:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x0031:
                if (r6 >= r1) goto L_0x0053
                if (r19 == 0) goto L_0x0039
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x003a
            L_0x0039:
                r9 = r6
            L_0x003a:
                int r10 = r0.f5318n
                int r10 = r10 + r9
                androidx.constraintlayout.solver.widgets.e r9 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r11 = r9.f5304a1
                if (r10 < r11) goto L_0x0044
                goto L_0x0053
            L_0x0044:
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r9 = r9.f5303Z0
                r9 = r9[r10]
                int r9 = r9.f5143d0
                if (r9 != 0) goto L_0x0050
                if (r7 != r5) goto L_0x004f
                r7 = r6
            L_0x004f:
                r8 = r6
            L_0x0050:
                int r6 = r6 + 1
                goto L_0x0031
            L_0x0053:
                int r6 = r0.f5305a
                r9 = 0
                if (r6 != 0) goto L_0x0196
                androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r0.f5306b
                androidx.constraintlayout.solver.widgets.e r10 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r11 = r10.f5281D0
                r6.f5151h0 = r11
                int r11 = r0.f5313i
                if (r18 <= 0) goto L_0x0067
                int r10 = r10.f5293P0
                int r11 = r11 + r10
            L_0x0067:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r6.f5115F
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.f5309e
                r10.mo8248a(r12, r11)
                if (r20 == 0) goto L_0x0079
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r6.f5117H
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.f5311g
                int r12 = r0.f5315k
                r10.mo8248a(r11, r12)
            L_0x0079:
                if (r18 <= 0) goto L_0x0086
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.f5309e
                androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r10.f5103d
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.f5117H
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r6.f5115F
                r10.mo8248a(r11, r2)
            L_0x0086:
                androidx.constraintlayout.solver.widgets.e r10 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r10 = r10.f5295R0
                r11 = 3
                if (r10 != r11) goto L_0x00b1
                boolean r10 = r6.f5176z
                if (r10 != 0) goto L_0x00b1
                r10 = r2
            L_0x0092:
                if (r10 >= r1) goto L_0x00b1
                if (r19 == 0) goto L_0x009a
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x009b
            L_0x009a:
                r12 = r10
            L_0x009b:
                int r13 = r0.f5318n
                int r13 = r13 + r12
                androidx.constraintlayout.solver.widgets.e r12 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r14 = r12.f5304a1
                if (r13 < r14) goto L_0x00a5
                goto L_0x00b1
            L_0x00a5:
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r12 = r12.f5303Z0
                r12 = r12[r13]
                boolean r13 = r12.f5176z
                if (r13 == 0) goto L_0x00ae
                goto L_0x00b2
            L_0x00ae:
                int r10 = r10 + 1
                goto L_0x0092
            L_0x00b1:
                r12 = r6
            L_0x00b2:
                r10 = r2
            L_0x00b3:
                if (r10 >= r1) goto L_0x02da
                if (r19 == 0) goto L_0x00bb
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00bc
            L_0x00bb:
                r13 = r10
            L_0x00bc:
                int r14 = r0.f5318n
                int r14 = r14 + r13
                androidx.constraintlayout.solver.widgets.e r15 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r11 = r15.f5304a1
                if (r14 < r11) goto L_0x00c7
                goto L_0x02da
            L_0x00c7:
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r11 = r15.f5303Z0
                r11 = r11[r14]
                if (r10 != 0) goto L_0x00d6
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r14 = r11.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r0.f5308d
                int r3 = r0.f5312h
                r11.mo8280i(r14, r15, r3)
            L_0x00d6:
                if (r13 != 0) goto L_0x00f8
                androidx.constraintlayout.solver.widgets.e r3 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r13 = r3.f5280C0
                float r14 = r3.f5286I0
                int r15 = r0.f5318n
                if (r15 != 0) goto L_0x00eb
                int r15 = r3.f5282E0
                if (r15 == r5) goto L_0x00eb
                float r3 = r3.f5288K0
            L_0x00e8:
                r14 = r3
                r13 = r15
                goto L_0x00f4
            L_0x00eb:
                if (r20 == 0) goto L_0x00f4
                int r15 = r3.f5284G0
                if (r15 == r5) goto L_0x00f4
                float r3 = r3.f5290M0
                goto L_0x00e8
            L_0x00f4:
                r11.f5149g0 = r13
                r11.f5137a0 = r14
            L_0x00f8:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x0105
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r0.f5310f
                int r14 = r0.f5314j
                r11.mo8280i(r3, r13, r14)
            L_0x0105:
                if (r9 == 0) goto L_0x0138
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r9.f5116G
                androidx.constraintlayout.solver.widgets.e r14 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r14 = r14.f5292O0
                r3.mo8248a(r13, r14)
                if (r10 != r7) goto L_0x0120
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5114E
                int r13 = r0.f5312h
                boolean r14 = r3.mo8255h()
                if (r14 == 0) goto L_0x0120
                r3.f5107h = r13
            L_0x0120:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r9.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r11.f5114E
                r3.mo8248a(r13, r2)
                r3 = 1
                int r13 = r8 + 1
                if (r10 != r13) goto L_0x0138
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r9.f5116G
                int r9 = r0.f5314j
                boolean r13 = r3.mo8255h()
                if (r13 == 0) goto L_0x0138
                r3.f5107h = r9
            L_0x0138:
                if (r11 == r6) goto L_0x018c
                androidx.constraintlayout.solver.widgets.e r3 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r3 = r3.f5295R0
                r9 = 3
                if (r3 != r9) goto L_0x0153
                boolean r13 = r12.f5176z
                if (r13 == 0) goto L_0x0153
                if (r11 == r12) goto L_0x0153
                boolean r13 = r11.f5176z
                if (r13 == 0) goto L_0x0153
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5118I
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r12.f5118I
                r3.mo8248a(r13, r2)
                goto L_0x018d
            L_0x0153:
                if (r3 == 0) goto L_0x0184
                r13 = 1
                if (r3 == r13) goto L_0x017c
                if (r4 == 0) goto L_0x016d
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5115F
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r0.f5309e
                int r14 = r0.f5313i
                r3.mo8248a(r13, r14)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5117H
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r0.f5311g
                int r14 = r0.f5315k
                r3.mo8248a(r13, r14)
                goto L_0x018d
            L_0x016d:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5115F
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r6.f5115F
                r3.mo8248a(r13, r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5117H
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r6.f5117H
                r3.mo8248a(r13, r2)
                goto L_0x018d
            L_0x017c:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5117H
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r6.f5117H
                r3.mo8248a(r13, r2)
                goto L_0x018d
            L_0x0184:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r11.f5115F
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r6.f5115F
                r3.mo8248a(r13, r2)
                goto L_0x018d
            L_0x018c:
                r9 = 3
            L_0x018d:
                int r10 = r10 + 1
                r16 = r11
                r11 = r9
                r9 = r16
                goto L_0x00b3
            L_0x0196:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.f5306b
                androidx.constraintlayout.solver.widgets.e r6 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r10 = r6.f5280C0
                r3.f5149g0 = r10
                int r10 = r0.f5312h
                if (r18 <= 0) goto L_0x01a5
                int r6 = r6.f5292O0
                int r10 = r10 + r6
            L_0x01a5:
                if (r19 == 0) goto L_0x01c7
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.f5310f
                r6.mo8248a(r11, r10)
                if (r20 == 0) goto L_0x01b9
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.f5308d
                int r11 = r0.f5314j
                r6.mo8248a(r10, r11)
            L_0x01b9:
                if (r18 <= 0) goto L_0x01e6
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r0.f5310f
                androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.f5103d
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.f5116G
                r6.mo8248a(r10, r2)
                goto L_0x01e6
            L_0x01c7:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.f5308d
                r6.mo8248a(r11, r10)
                if (r20 == 0) goto L_0x01d9
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r3.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r0.f5310f
                int r11 = r0.f5314j
                r6.mo8248a(r10, r11)
            L_0x01d9:
                if (r18 <= 0) goto L_0x01e6
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r0.f5308d
                androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r6.f5103d
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r3.f5114E
                r6.mo8248a(r10, r2)
            L_0x01e6:
                r6 = r2
            L_0x01e7:
                if (r6 >= r1) goto L_0x02da
                int r10 = r0.f5318n
                int r10 = r10 + r6
                androidx.constraintlayout.solver.widgets.e r11 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r12 = r11.f5304a1
                if (r10 < r12) goto L_0x01f4
                goto L_0x02da
            L_0x01f4:
                androidx.constraintlayout.solver.widgets.ConstraintWidget[] r11 = r11.f5303Z0
                r10 = r11[r10]
                if (r6 != 0) goto L_0x0223
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.f5115F
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.f5309e
                int r13 = r0.f5313i
                r10.mo8280i(r11, r12, r13)
                androidx.constraintlayout.solver.widgets.e r11 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r12 = r11.f5281D0
                float r13 = r11.f5287J0
                int r14 = r0.f5318n
                if (r14 != 0) goto L_0x0216
                int r14 = r11.f5283F0
                if (r14 == r5) goto L_0x0216
                float r11 = r11.f5289L0
            L_0x0213:
                r13 = r11
                r12 = r14
                goto L_0x021f
            L_0x0216:
                if (r20 == 0) goto L_0x021f
                int r14 = r11.f5285H0
                if (r14 == r5) goto L_0x021f
                float r11 = r11.f5291N0
                goto L_0x0213
            L_0x021f:
                r10.f5151h0 = r12
                r10.f5139b0 = r13
            L_0x0223:
                int r11 = r1 + -1
                if (r6 != r11) goto L_0x0230
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.f5117H
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r0.f5311g
                int r13 = r0.f5315k
                r10.mo8280i(r11, r12, r13)
            L_0x0230:
                if (r9 == 0) goto L_0x0263
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.f5115F
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r9.f5117H
                androidx.constraintlayout.solver.widgets.e r13 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r13 = r13.f5293P0
                r11.mo8248a(r12, r13)
                if (r6 != r7) goto L_0x024b
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r10.f5115F
                int r12 = r0.f5313i
                boolean r13 = r11.mo8255h()
                if (r13 == 0) goto L_0x024b
                r11.f5107h = r12
            L_0x024b:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5117H
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r10.f5115F
                r11.mo8248a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r6 != r12) goto L_0x0263
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.f5117H
                int r11 = r0.f5315k
                boolean r12 = r9.mo8255h()
                if (r12 == 0) goto L_0x0263
                r9.f5107h = r11
            L_0x0263:
                if (r10 == r3) goto L_0x02d4
                r9 = 2
                if (r19 == 0) goto L_0x0293
                androidx.constraintlayout.solver.widgets.e r11 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r11 = r11.f5294Q0
                if (r11 == 0) goto L_0x028b
                r12 = 1
                if (r11 == r12) goto L_0x0283
                if (r11 == r9) goto L_0x0274
                goto L_0x02d4
            L_0x0274:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.f5114E
                r9.mo8248a(r11, r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.f5116G
                r9.mo8248a(r11, r2)
                goto L_0x02d4
            L_0x0283:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.f5114E
                r9.mo8248a(r11, r2)
                goto L_0x02d4
            L_0x028b:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.f5116G
                r9.mo8248a(r11, r2)
                goto L_0x02d4
            L_0x0293:
                androidx.constraintlayout.solver.widgets.e r11 = androidx.constraintlayout.solver.widgets.C2221e.this
                int r11 = r11.f5294Q0
                if (r11 == 0) goto L_0x02cb
                r12 = 1
                if (r11 == r12) goto L_0x02c3
                if (r11 == r9) goto L_0x029f
                goto L_0x02d5
            L_0x029f:
                if (r4 == 0) goto L_0x02b4
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.f5308d
                int r13 = r0.f5312h
                r9.mo8248a(r11, r13)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r0.f5310f
                int r13 = r0.f5314j
                r9.mo8248a(r11, r13)
                goto L_0x02d5
            L_0x02b4:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.f5114E
                r9.mo8248a(r11, r2)
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.f5116G
                r9.mo8248a(r11, r2)
                goto L_0x02d5
            L_0x02c3:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5116G
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.f5116G
                r9.mo8248a(r11, r2)
                goto L_0x02d5
            L_0x02cb:
                r12 = 1
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r10.f5114E
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r3.f5114E
                r9.mo8248a(r11, r2)
                goto L_0x02d5
            L_0x02d4:
                r12 = 1
            L_0x02d5:
                int r6 = r6 + 1
                r9 = r10
                goto L_0x01e7
            L_0x02da:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C2221e.C2222a.mo8348b(int, boolean, boolean):void");
        }

        /* renamed from: c */
        public final int mo8349c() {
            return this.f5305a == 1 ? this.f5317m - C2221e.this.f5293P0 : this.f5317m;
        }

        /* renamed from: d */
        public final int mo8350d() {
            return this.f5305a == 0 ? this.f5316l - C2221e.this.f5292O0 : this.f5316l;
        }

        /* renamed from: e */
        public final void mo8351e(int i) {
            int i2 = this.f5320p;
            if (i2 != 0) {
                int i3 = this.f5319o;
                int i4 = i / i2;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = this.f5318n;
                    int i7 = i6 + i5;
                    C2221e eVar = C2221e.this;
                    if (i7 >= eVar.f5304a1) {
                        break;
                    }
                    ConstraintWidget constraintWidget = eVar.f5303Z0[i6 + i5];
                    if (this.f5305a == 0) {
                        if (constraintWidget != null) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f5125P;
                            if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f5160m == 0) {
                                eVar.mo8355Q(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, dimensionBehaviourArr[1], constraintWidget.mo8286o());
                            }
                        }
                    } else if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.f5125P;
                        if (dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f5162n == 0) {
                            eVar.mo8355Q(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.mo8289r(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                        }
                    }
                }
                this.f5316l = 0;
                this.f5317m = 0;
                this.f5306b = null;
                this.f5307c = 0;
                int i8 = this.f5319o;
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = this.f5318n + i9;
                    C2221e eVar2 = C2221e.this;
                    if (i10 < eVar2.f5304a1) {
                        ConstraintWidget constraintWidget2 = eVar2.f5303Z0[i10];
                        if (this.f5305a == 0) {
                            int r = constraintWidget2.mo8289r();
                            C2221e eVar3 = C2221e.this;
                            int i11 = eVar3.f5292O0;
                            if (constraintWidget2.f5143d0 == 8) {
                                i11 = 0;
                            }
                            this.f5316l = r + i11 + this.f5316l;
                            int R = eVar3.mo8345R(constraintWidget2, this.f5321q);
                            if (this.f5306b == null || this.f5307c < R) {
                                this.f5306b = constraintWidget2;
                                this.f5307c = R;
                                this.f5317m = R;
                            }
                        } else {
                            int S = eVar2.mo8346S(constraintWidget2, this.f5321q);
                            int R2 = C2221e.this.mo8345R(constraintWidget2, this.f5321q);
                            int i12 = C2221e.this.f5293P0;
                            if (constraintWidget2.f5143d0 == 8) {
                                i12 = 0;
                            }
                            this.f5317m = R2 + i12 + this.f5317m;
                            if (this.f5306b == null || this.f5307c < S) {
                                this.f5306b = constraintWidget2;
                                this.f5307c = S;
                                this.f5316l = S;
                            }
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: f */
        public final void mo8352f(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f5305a = i;
            this.f5308d = constraintAnchor;
            this.f5309e = constraintAnchor2;
            this.f5310f = constraintAnchor3;
            this.f5311g = constraintAnchor4;
            this.f5312h = i2;
            this.f5313i = i3;
            this.f5314j = i4;
            this.f5315k = i5;
            this.f5321q = i6;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05f2  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0620  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8344P(int r34, int r35, int r36, int r37) {
        /*
            r33 = this;
            r8 = r33
            int r0 = r8.f16943q0
            r9 = 1
            r10 = 0
            if (r0 <= 0) goto L_0x0090
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5126Q
            if (r0 == 0) goto L_0x0011
            androidx.constraintlayout.solver.widgets.d r0 = (androidx.constraintlayout.solver.widgets.C2220d) r0
            androidx.constraintlayout.solver.widgets.analyzer.b$b r0 = r0.f5272s0
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0017
            r0 = r10
            goto L_0x0087
        L_0x0017:
            r2 = r10
        L_0x0018:
            int r3 = r8.f16943q0
            if (r2 >= r3) goto L_0x0086
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r3 = r8.f16942p0
            r3 = r3[r2]
            if (r3 != 0) goto L_0x0023
            goto L_0x0083
        L_0x0023:
            boolean r4 = r3 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r4 == 0) goto L_0x0028
            goto L_0x0083
        L_0x0028:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r3.mo8285n(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r3.mo8285n(r9)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0040
            int r7 = r3.f5160m
            if (r7 == r9) goto L_0x0040
            if (r5 != r6) goto L_0x0040
            int r7 = r3.f5162n
            if (r7 == r9) goto L_0x0040
            r7 = r9
            goto L_0x0041
        L_0x0040:
            r7 = r10
        L_0x0041:
            if (r7 == 0) goto L_0x0044
            goto L_0x0083
        L_0x0044:
            if (r4 != r6) goto L_0x0048
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x0048:
            if (r5 != r6) goto L_0x004c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x004c:
            androidx.constraintlayout.solver.widgets.analyzer.b$a r6 = r8.f5331A0
            r6.f5209a = r4
            r6.f5210b = r5
            int r4 = r3.mo8289r()
            r6.f5211c = r4
            androidx.constraintlayout.solver.widgets.analyzer.b$a r4 = r8.f5331A0
            int r5 = r3.mo8286o()
            r4.f5212d = r5
            androidx.constraintlayout.solver.widgets.analyzer.b$a r4 = r8.f5331A0
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = (androidx.constraintlayout.widget.ConstraintLayout.C2235b) r5
            r5.mo8460b(r3, r4)
            androidx.constraintlayout.solver.widgets.analyzer.b$a r4 = r8.f5331A0
            int r4 = r4.f5213e
            r3.mo8272L(r4)
            androidx.constraintlayout.solver.widgets.analyzer.b$a r4 = r8.f5331A0
            int r4 = r4.f5214f
            r3.mo8269I(r4)
            androidx.constraintlayout.solver.widgets.analyzer.b$a r4 = r8.f5331A0
            int r4 = r4.f5215g
            r3.f5133X = r4
            if (r4 <= 0) goto L_0x0080
            r4 = r9
            goto L_0x0081
        L_0x0080:
            r4 = r10
        L_0x0081:
            r3.f5176z = r4
        L_0x0083:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0086:
            r0 = r9
        L_0x0087:
            if (r0 != 0) goto L_0x0090
            r8.f5340y0 = r10
            r8.f5341z0 = r10
            r8.f5339x0 = r10
            return
        L_0x0090:
            int r11 = r8.f5337v0
            int r12 = r8.f5338w0
            int r13 = r8.f5333r0
            int r14 = r8.f5334s0
            r0 = 2
            int[] r15 = new int[r0]
            int r2 = r35 - r11
            int r2 = r2 - r12
            int r3 = r8.f5298U0
            if (r3 != r9) goto L_0x00a5
            int r2 = r37 - r13
            int r2 = r2 - r14
        L_0x00a5:
            r7 = r2
            r2 = -1
            if (r3 != 0) goto L_0x00b6
            int r3 = r8.f5280C0
            if (r3 != r2) goto L_0x00af
            r8.f5280C0 = r10
        L_0x00af:
            int r3 = r8.f5281D0
            if (r3 != r2) goto L_0x00c2
            r8.f5281D0 = r10
            goto L_0x00c2
        L_0x00b6:
            int r3 = r8.f5280C0
            if (r3 != r2) goto L_0x00bc
            r8.f5280C0 = r10
        L_0x00bc:
            int r3 = r8.f5281D0
            if (r3 != r2) goto L_0x00c2
            r8.f5281D0 = r10
        L_0x00c2:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = r8.f16942p0
            r3 = r10
            r4 = r3
        L_0x00c6:
            int r5 = r8.f16943q0
            r6 = 8
            if (r3 >= r5) goto L_0x00d9
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r5 = r8.f16942p0
            r5 = r5[r3]
            int r5 = r5.f5143d0
            if (r5 != r6) goto L_0x00d6
            int r4 = r4 + 1
        L_0x00d6:
            int r3 = r3 + 1
            goto L_0x00c6
        L_0x00d9:
            if (r4 <= 0) goto L_0x00f4
            int r5 = r5 - r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r2 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r5]
            r3 = r10
            r5 = r3
        L_0x00e0:
            int r4 = r8.f16943q0
            if (r3 >= r4) goto L_0x00f4
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = r8.f16942p0
            r4 = r4[r3]
            int r10 = r4.f5143d0
            if (r10 == r6) goto L_0x00f0
            r2[r5] = r4
            int r5 = r5 + 1
        L_0x00f0:
            int r3 = r3 + 1
            r10 = 0
            goto L_0x00e0
        L_0x00f4:
            r10 = r2
            r6 = r5
            r8.f5303Z0 = r10
            r8.f5304a1 = r6
            int r2 = r8.f5296S0
            if (r2 == 0) goto L_0x0528
            if (r2 == r9) goto L_0x02cf
            if (r2 == r0) goto L_0x010e
            r27 = r11
            r28 = r12
            r29 = r13
            r31 = r14
            r32 = r15
            goto L_0x053a
        L_0x010e:
            int r2 = r8.f5298U0
            if (r2 != 0) goto L_0x0136
            int r3 = r8.f5297T0
            if (r3 > 0) goto L_0x0134
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0119:
            if (r3 >= r6) goto L_0x0133
            if (r3 <= 0) goto L_0x0120
            int r1 = r8.f5292O0
            int r4 = r4 + r1
        L_0x0120:
            r1 = r10[r3]
            if (r1 != 0) goto L_0x0125
            goto L_0x0130
        L_0x0125:
            int r1 = r8.mo8346S(r1, r7)
            int r1 = r1 + r4
            if (r1 <= r7) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            int r5 = r5 + 1
            r4 = r1
        L_0x0130:
            int r3 = r3 + 1
            goto L_0x0119
        L_0x0133:
            r3 = r5
        L_0x0134:
            r1 = 0
            goto L_0x0159
        L_0x0136:
            int r1 = r8.f5297T0
            if (r1 > 0) goto L_0x0158
            r1 = 0
            r3 = 0
            r4 = 0
        L_0x013d:
            if (r1 >= r6) goto L_0x0157
            if (r1 <= 0) goto L_0x0144
            int r5 = r8.f5293P0
            int r3 = r3 + r5
        L_0x0144:
            r5 = r10[r1]
            if (r5 != 0) goto L_0x0149
            goto L_0x0154
        L_0x0149:
            int r5 = r8.mo8345R(r5, r7)
            int r5 = r5 + r3
            if (r5 <= r7) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            int r4 = r4 + 1
            r3 = r5
        L_0x0154:
            int r1 = r1 + 1
            goto L_0x013d
        L_0x0157:
            r1 = r4
        L_0x0158:
            r3 = 0
        L_0x0159:
            int[] r4 = r8.f5302Y0
            if (r4 != 0) goto L_0x0161
            int[] r0 = new int[r0]
            r8.f5302Y0 = r0
        L_0x0161:
            if (r1 != 0) goto L_0x0165
            if (r2 == r9) goto L_0x0169
        L_0x0165:
            if (r3 != 0) goto L_0x0187
            if (r2 != 0) goto L_0x0187
        L_0x0169:
            r0 = r34
            r4 = r37
            r5 = r1
            r21 = r6
            r20 = r8
            r17 = r15
            r18 = r17
            r1 = r35
            r6 = r2
            r2 = r9
            r15 = r14
            r9 = r20
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            r7 = r3
            r3 = r36
            goto L_0x02a6
        L_0x0187:
            r0 = r34
            r4 = r1
            r5 = r2
            r9 = r8
            r20 = r9
            r17 = r15
            r18 = r17
            r19 = 0
            r1 = r35
            r2 = r36
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            r7 = r6
            r6 = r3
            r3 = r37
        L_0x01a2:
            if (r19 != 0) goto L_0x02b1
            if (r5 != 0) goto L_0x01b6
            float r4 = (float) r7
            r34 = r0
            float r0 = (float) r6
            float r4 = r4 / r0
            r35 = r1
            double r0 = (double) r4
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = r0
            r0 = r6
            goto L_0x01c4
        L_0x01b6:
            r34 = r0
            r35 = r1
            float r0 = (float) r7
            float r1 = (float) r4
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r1 = r4
        L_0x01c4:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = r9.f5301X0
            if (r4 == 0) goto L_0x01d1
            int r6 = r4.length
            if (r6 >= r0) goto L_0x01cc
            goto L_0x01d1
        L_0x01cc:
            r6 = 0
            java.util.Arrays.fill(r4, r6)
            goto L_0x01d6
        L_0x01d1:
            r6 = 0
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r0]
            r9.f5301X0 = r4
        L_0x01d6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = r9.f5300W0
            if (r4 == 0) goto L_0x01e3
            int r6 = r4.length
            if (r6 >= r1) goto L_0x01de
            goto L_0x01e3
        L_0x01de:
            r6 = 0
            java.util.Arrays.fill(r4, r6)
            goto L_0x01e7
        L_0x01e3:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = new androidx.constraintlayout.solver.widgets.ConstraintWidget[r1]
            r9.f5300W0 = r4
        L_0x01e7:
            r4 = 0
        L_0x01e8:
            if (r4 >= r0) goto L_0x0245
            r6 = 0
        L_0x01eb:
            if (r6 >= r1) goto L_0x023c
            int r21 = r6 * r0
            int r21 = r21 + r4
            r36 = r2
            r2 = 1
            if (r5 != r2) goto L_0x01fa
            int r2 = r4 * r1
            int r21 = r2 + r6
        L_0x01fa:
            r37 = r3
            r2 = r21
            int r3 = r11.length
            if (r2 < r3) goto L_0x0202
            goto L_0x0206
        L_0x0202:
            r2 = r11[r2]
            if (r2 != 0) goto L_0x0209
        L_0x0206:
            r21 = r7
            goto L_0x0233
        L_0x0209:
            int r3 = r9.mo8346S(r2, r10)
            r21 = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r9.f5301X0
            r7 = r7[r4]
            if (r7 == 0) goto L_0x021b
            int r7 = r7.mo8289r()
            if (r7 >= r3) goto L_0x021f
        L_0x021b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r3 = r9.f5301X0
            r3[r4] = r2
        L_0x021f:
            int r3 = r9.mo8345R(r2, r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r7 = r9.f5300W0
            r7 = r7[r6]
            if (r7 == 0) goto L_0x022f
            int r7 = r7.mo8286o()
            if (r7 >= r3) goto L_0x0233
        L_0x022f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r3 = r9.f5300W0
            r3[r6] = r2
        L_0x0233:
            int r6 = r6 + 1
            r2 = r36
            r3 = r37
            r7 = r21
            goto L_0x01eb
        L_0x023c:
            r36 = r2
            r37 = r3
            r21 = r7
            int r4 = r4 + 1
            goto L_0x01e8
        L_0x0245:
            r36 = r2
            r37 = r3
            r21 = r7
            r2 = 0
            r3 = 0
        L_0x024d:
            if (r2 >= r0) goto L_0x0263
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r4 = r9.f5301X0
            r4 = r4[r2]
            if (r4 == 0) goto L_0x0260
            if (r2 <= 0) goto L_0x025a
            int r6 = r9.f5292O0
            int r3 = r3 + r6
        L_0x025a:
            int r4 = r9.mo8346S(r4, r10)
            int r4 = r4 + r3
            r3 = r4
        L_0x0260:
            int r2 = r2 + 1
            goto L_0x024d
        L_0x0263:
            r2 = 0
            r4 = 0
        L_0x0265:
            if (r2 >= r1) goto L_0x027b
            androidx.constraintlayout.solver.widgets.ConstraintWidget[] r6 = r9.f5300W0
            r6 = r6[r2]
            if (r6 == 0) goto L_0x0278
            if (r2 <= 0) goto L_0x0272
            int r7 = r9.f5293P0
            int r4 = r4 + r7
        L_0x0272:
            int r6 = r9.mo8345R(r6, r10)
            int r6 = r6 + r4
            r4 = r6
        L_0x0278:
            int r2 = r2 + 1
            goto L_0x0265
        L_0x027b:
            r2 = 0
            r18[r2] = r3
            r2 = 1
            r18[r2] = r4
            if (r5 != 0) goto L_0x028a
            if (r3 <= r10) goto L_0x029b
            if (r0 <= r2) goto L_0x029b
            int r0 = r0 + -1
            goto L_0x0290
        L_0x028a:
            if (r4 <= r10) goto L_0x029b
            if (r1 <= r2) goto L_0x029b
            int r1 = r1 + -1
        L_0x0290:
            r6 = r0
            r4 = r1
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            goto L_0x02ad
        L_0x029b:
            r3 = r36
            r4 = r37
            r7 = r0
            r6 = r5
            r0 = r34
            r5 = r1
            r1 = r35
        L_0x02a6:
            r19 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
        L_0x02ad:
            r7 = r21
            goto L_0x01a2
        L_0x02b1:
            r34 = r0
            r35 = r1
            r36 = r2
            r37 = r3
            r2 = 1
            int[] r0 = r9.f5302Y0
            r1 = 0
            r0[r1] = r6
            r0[r2] = r4
            r0 = r34
            r1 = r35
            r2 = r36
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r17
            goto L_0x054e
        L_0x02cf:
            int r9 = r8.f5298U0
            if (r6 != 0) goto L_0x02df
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            r20 = r8
            goto L_0x054e
        L_0x02df:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r0 = r8.f5299V0
            r0.clear()
            androidx.constraintlayout.solver.widgets.e$a r5 = new androidx.constraintlayout.solver.widgets.e$a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r8.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r8.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r8.f5117H
            r0 = r5
            r16 = r1
            r1 = r33
            r17 = r2
            r2 = r9
            r27 = r11
            r11 = r5
            r5 = r17
            r28 = r12
            r12 = r6
            r6 = r16
            r29 = r7
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r0 = r8.f5299V0
            r0.add(r11)
            if (r9 != 0) goto L_0x039b
            r5 = r11
            r0 = 0
            r1 = 0
            r11 = 0
        L_0x0310:
            if (r11 >= r12) goto L_0x0393
            r7 = r10[r11]
            r6 = r29
            int r16 = r8.mo8346S(r7, r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r7.f5125P
            r3 = 0
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x0325
            int r0 = r0 + 1
        L_0x0325:
            r17 = r0
            if (r1 == r6) goto L_0x0330
            int r0 = r8.f5292O0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r6) goto L_0x0336
        L_0x0330:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.f5306b
            if (r0 == 0) goto L_0x0336
            r0 = 1
            goto L_0x0337
        L_0x0336:
            r0 = 0
        L_0x0337:
            if (r0 != 0) goto L_0x0344
            if (r11 <= 0) goto L_0x0344
            int r2 = r8.f5297T0
            if (r2 <= 0) goto L_0x0344
            int r2 = r11 % r2
            if (r2 != 0) goto L_0x0344
            r0 = 1
        L_0x0344:
            if (r0 == 0) goto L_0x0372
            androidx.constraintlayout.solver.widgets.e$a r5 = new androidx.constraintlayout.solver.widgets.e$a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r8.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r8.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r8.f5117H
            r0 = r5
            r18 = r1
            r1 = r33
            r19 = r2
            r2 = r9
            r29 = r13
            r13 = r5
            r5 = r19
            r30 = r6
            r6 = r18
            r31 = r14
            r14 = r7
            r7 = r30
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r13.f5318n = r11
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r0 = r8.f5299V0
            r0.add(r13)
            r5 = r13
            goto L_0x0382
        L_0x0372:
            r30 = r6
            r29 = r13
            r31 = r14
            r14 = r7
            if (r11 <= 0) goto L_0x0382
            int r0 = r8.f5292O0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0384
        L_0x0382:
            r1 = r16
        L_0x0384:
            r5.mo8347a(r14)
            int r11 = r11 + 1
            r0 = r17
            r13 = r29
            r29 = r30
            r14 = r31
            goto L_0x0310
        L_0x0393:
            r31 = r14
            r30 = r29
            r29 = r13
            goto L_0x0412
        L_0x039b:
            r31 = r14
            r30 = r29
            r29 = r13
            r5 = r11
            r0 = 0
            r1 = 0
            r11 = 0
        L_0x03a5:
            if (r11 >= r12) goto L_0x0412
            r13 = r10[r11]
            r14 = r30
            int r16 = r8.mo8345R(r13, r14)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r13.f5125P
            r3 = 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x03ba
            int r0 = r0 + 1
        L_0x03ba:
            r17 = r0
            if (r1 == r14) goto L_0x03c5
            int r0 = r8.f5293P0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r14) goto L_0x03cb
        L_0x03c5:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r5.f5306b
            if (r0 == 0) goto L_0x03cb
            r0 = 1
            goto L_0x03cc
        L_0x03cb:
            r0 = 0
        L_0x03cc:
            if (r0 != 0) goto L_0x03d9
            if (r11 <= 0) goto L_0x03d9
            int r2 = r8.f5297T0
            if (r2 <= 0) goto L_0x03d9
            int r2 = r11 % r2
            if (r2 != 0) goto L_0x03d9
            r0 = 1
        L_0x03d9:
            if (r0 == 0) goto L_0x03f9
            androidx.constraintlayout.solver.widgets.e$a r7 = new androidx.constraintlayout.solver.widgets.e$a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r8.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r8.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r8.f5117H
            r0 = r7
            r1 = r33
            r2 = r9
            r30 = r10
            r10 = r7
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.f5318n = r11
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r0 = r8.f5299V0
            r0.add(r10)
            r5 = r10
            goto L_0x0404
        L_0x03f9:
            r30 = r10
            if (r11 <= 0) goto L_0x0404
            int r0 = r8.f5293P0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0406
        L_0x0404:
            r1 = r16
        L_0x0406:
            r5.mo8347a(r13)
            int r11 = r11 + 1
            r0 = r17
            r10 = r30
            r30 = r14
            goto L_0x03a5
        L_0x0412:
            r14 = r30
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r1 = r8.f5299V0
            int r1 = r1.size()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r8.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r8.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r8.f5117H
            int r6 = r8.f5337v0
            int r7 = r8.f5333r0
            int r10 = r8.f5338w0
            int r11 = r8.f5334s0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r8.f5125P
            r16 = r2
            r13 = 0
            r2 = r12[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 == r13) goto L_0x043d
            r2 = 1
            r12 = r12[r2]
            if (r12 != r13) goto L_0x043b
            goto L_0x043d
        L_0x043b:
            r2 = 0
            goto L_0x043e
        L_0x043d:
            r2 = 1
        L_0x043e:
            if (r0 <= 0) goto L_0x0465
            if (r2 == 0) goto L_0x0465
            r0 = 0
        L_0x0443:
            if (r0 >= r1) goto L_0x0465
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r2 = r8.f5299V0
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.solver.widgets.e$a r2 = (androidx.constraintlayout.solver.widgets.C2221e.C2222a) r2
            if (r9 != 0) goto L_0x0459
            int r12 = r2.mo8350d()
            int r12 = r14 - r12
            r2.mo8351e(r12)
            goto L_0x0462
        L_0x0459:
            int r12 = r2.mo8349c()
            int r12 = r14 - r12
            r2.mo8351e(r12)
        L_0x0462:
            int r0 = r0 + 1
            goto L_0x0443
        L_0x0465:
            r0 = r16
            r2 = 0
            r12 = 0
            r13 = 0
        L_0x046a:
            if (r2 >= r1) goto L_0x051f
            r32 = r15
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r15 = r8.f5299V0
            java.lang.Object r15 = r15.get(r2)
            androidx.constraintlayout.solver.widgets.e$a r15 = (androidx.constraintlayout.solver.widgets.C2221e.C2222a) r15
            if (r9 != 0) goto L_0x04c8
            int r5 = r1 + -1
            if (r2 >= r5) goto L_0x048e
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r5 = r8.f5299V0
            int r11 = r2 + 1
            java.lang.Object r5 = r5.get(r11)
            androidx.constraintlayout.solver.widgets.e$a r5 = (androidx.constraintlayout.solver.widgets.C2221e.C2222a) r5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r5.f5306b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r5.f5115F
            r30 = r1
            r11 = 0
            goto L_0x0494
        L_0x048e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r8.f5117H
            int r11 = r8.f5334s0
            r30 = r1
        L_0x0494:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r15.f5306b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.f5117H
            r16 = r15
            r17 = r9
            r18 = r0
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r10
            r25 = r11
            r26 = r14
            r16.mo8352f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r15.mo8350d()
            int r3 = java.lang.Math.max(r12, r3)
            int r7 = r15.mo8349c()
            int r7 = r7 + r13
            if (r2 <= 0) goto L_0x04c3
            int r12 = r8.f5293P0
            int r7 = r7 + r12
        L_0x04c3:
            r12 = r3
            r13 = r7
            r7 = 0
            r3 = r1
            goto L_0x0517
        L_0x04c8:
            r30 = r1
            int r1 = r30 + -1
            if (r2 >= r1) goto L_0x04de
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r1 = r8.f5299V0
            int r4 = r2 + 1
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.solver.widgets.e$a r1 = (androidx.constraintlayout.solver.widgets.C2221e.C2222a) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.f5306b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.f5114E
            r4 = 0
            goto L_0x04e2
        L_0x04de:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r8.f5116G
            int r4 = r8.f5338w0
        L_0x04e2:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r15.f5306b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.f5116G
            r16 = r15
            r17 = r9
            r18 = r0
            r19 = r3
            r20 = r1
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r4
            r25 = r11
            r26 = r14
            r16.mo8352f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r0 = r15.mo8350d()
            int r0 = r0 + r12
            int r6 = r15.mo8349c()
            int r6 = java.lang.Math.max(r13, r6)
            if (r2 <= 0) goto L_0x0511
            int r12 = r8.f5292O0
            int r0 = r0 + r12
        L_0x0511:
            r12 = r0
            r13 = r6
            r0 = r10
            r6 = 0
            r10 = r4
            r4 = r1
        L_0x0517:
            int r2 = r2 + 1
            r1 = r30
            r15 = r32
            goto L_0x046a
        L_0x051f:
            r32 = r15
            r0 = 0
            r32[r0] = r12
            r0 = 1
            r32[r0] = r13
            goto L_0x053a
        L_0x0528:
            r30 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r31 = r14
            r32 = r15
            r12 = r6
            r14 = r7
            int r2 = r8.f5298U0
            if (r12 != 0) goto L_0x0557
        L_0x053a:
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            r20 = r8
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r31
            r15 = r32
        L_0x054e:
            r4 = r2
            r5 = r3
            r6 = r20
            r2 = 0
            r3 = r1
            r1 = 1
            goto L_0x05e4
        L_0x0557:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r0 = r8.f5299V0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0576
            androidx.constraintlayout.solver.widgets.e$a r9 = new androidx.constraintlayout.solver.widgets.e$a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r8.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r8.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r8.f5117H
            r0 = r9
            r1 = r33
            r7 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r0 = r8.f5299V0
            r0.add(r9)
            goto L_0x05b8
        L_0x0576:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.e$a> r0 = r8.f5299V0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            androidx.constraintlayout.solver.widgets.e$a r9 = (androidx.constraintlayout.solver.widgets.C2221e.C2222a) r9
            r9.f5307c = r1
            r0 = 0
            r9.f5306b = r0
            r9.f5316l = r1
            r9.f5317m = r1
            r9.f5318n = r1
            r9.f5319o = r1
            r9.f5320p = r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r8.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r8.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r8.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r8.f5117H
            int r5 = r8.f5337v0
            int r6 = r8.f5333r0
            int r7 = r8.f5338w0
            int r10 = r8.f5334s0
            r16 = r9
            r17 = r2
            r18 = r0
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r10
            r26 = r14
            r16.mo8352f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x05b8:
            r2 = 0
        L_0x05b9:
            if (r2 >= r12) goto L_0x05c3
            r0 = r30[r2]
            r9.mo8347a(r0)
            int r2 = r2 + 1
            goto L_0x05b9
        L_0x05c3:
            int r0 = r9.mo8350d()
            r2 = 0
            r32[r2] = r0
            int r0 = r9.mo8349c()
            r1 = 1
            r32[r1] = r0
            r0 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r8
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r31
            r15 = r32
        L_0x05e4:
            r7 = r15[r2]
            int r7 = r7 + r11
            int r7 = r7 + r12
            r9 = r15[r1]
            int r9 = r9 + r13
            int r9 = r9 + r14
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r0 != r11) goto L_0x05f4
            r0 = r3
            goto L_0x0600
        L_0x05f4:
            if (r0 != r10) goto L_0x05fb
            int r0 = java.lang.Math.min(r7, r3)
            goto L_0x0600
        L_0x05fb:
            if (r0 != 0) goto L_0x05ff
            r0 = r7
            goto L_0x0600
        L_0x05ff:
            r0 = r2
        L_0x0600:
            if (r4 != r11) goto L_0x0604
            r3 = r5
            goto L_0x0610
        L_0x0604:
            if (r4 != r10) goto L_0x060b
            int r3 = java.lang.Math.min(r9, r5)
            goto L_0x0610
        L_0x060b:
            if (r4 != 0) goto L_0x060f
            r3 = r9
            goto L_0x0610
        L_0x060f:
            r3 = r2
        L_0x0610:
            r6.f5340y0 = r0
            r6.f5341z0 = r3
            r6.mo8272L(r0)
            r6.mo8269I(r3)
            int r0 = r6.f16943q0
            if (r0 <= 0) goto L_0x0620
            r9 = r1
            goto L_0x0621
        L_0x0620:
            r9 = r2
        L_0x0621:
            r6.f5339x0 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C2221e.mo8344P(int, int, int, int):void");
    }

    /* renamed from: R */
    public final int mo8345R(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f5125P[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f5162n;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f5171u * ((float) i));
                if (i3 != constraintWidget.mo8286o()) {
                    constraintWidget.f5148g = true;
                    mo8355Q(constraintWidget, constraintWidget.f5125P[0], constraintWidget.mo8289r(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.mo8286o();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.mo8289r()) * constraintWidget.f5129T) + 0.5f);
                }
            }
        }
        return constraintWidget.mo8286o();
    }

    /* renamed from: S */
    public final int mo8346S(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f5125P[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f5160m;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f5168r * ((float) i));
                if (i3 != constraintWidget.mo8289r()) {
                    constraintWidget.f5148g = true;
                    mo8355Q(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.f5125P[1], constraintWidget.mo8286o());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.mo8289r();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.mo8286o()) * constraintWidget.f5129T) + 0.5f);
                }
            }
        }
        return constraintWidget.mo8289r();
    }

    /* renamed from: e */
    public final void mo8276e(C2190c cVar, boolean z) {
        ConstraintWidget constraintWidget;
        super.mo8276e(cVar, z);
        ConstraintWidget constraintWidget2 = this.f5126Q;
        boolean z2 = constraintWidget2 != null ? ((C2220d) constraintWidget2).f5273t0 : false;
        int i = this.f5296S0;
        if (i != 0) {
            if (i == 1) {
                int size = this.f5299V0.size();
                int i2 = 0;
                while (i2 < size) {
                    this.f5299V0.get(i2).mo8348b(i2, z2, i2 == size + -1);
                    i2++;
                }
            } else if (!(i != 2 || this.f5302Y0 == null || this.f5301X0 == null || this.f5300W0 == null)) {
                for (int i3 = 0; i3 < this.f5304a1; i3++) {
                    this.f5303Z0[i3].mo8264D();
                }
                int[] iArr = this.f5302Y0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                ConstraintWidget constraintWidget3 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    ConstraintWidget constraintWidget4 = this.f5301X0[z2 ? (i4 - i6) - 1 : i6];
                    if (!(constraintWidget4 == null || constraintWidget4.f5143d0 == 8)) {
                        if (i6 == 0) {
                            constraintWidget4.mo8280i(constraintWidget4.f5114E, this.f5114E, this.f5337v0);
                            constraintWidget4.f5149g0 = this.f5280C0;
                            constraintWidget4.f5137a0 = this.f5286I0;
                        }
                        if (i6 == i4 - 1) {
                            constraintWidget4.mo8280i(constraintWidget4.f5116G, this.f5116G, this.f5338w0);
                        }
                        if (i6 > 0) {
                            constraintWidget4.mo8280i(constraintWidget4.f5114E, constraintWidget3.f5116G, this.f5292O0);
                            constraintWidget3.mo8280i(constraintWidget3.f5116G, constraintWidget4.f5114E, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    ConstraintWidget constraintWidget5 = this.f5300W0[i7];
                    if (!(constraintWidget5 == null || constraintWidget5.f5143d0 == 8)) {
                        if (i7 == 0) {
                            constraintWidget5.mo8280i(constraintWidget5.f5115F, this.f5115F, this.f5333r0);
                            constraintWidget5.f5151h0 = this.f5281D0;
                            constraintWidget5.f5139b0 = this.f5287J0;
                        }
                        if (i7 == i5 - 1) {
                            constraintWidget5.mo8280i(constraintWidget5.f5117H, this.f5117H, this.f5334s0);
                        }
                        if (i7 > 0) {
                            constraintWidget5.mo8280i(constraintWidget5.f5115F, constraintWidget3.f5117H, this.f5293P0);
                            constraintWidget3.mo8280i(constraintWidget3.f5117H, constraintWidget5.f5115F, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.f5298U0 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f5303Z0;
                        if (!(i10 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i10]) == null || constraintWidget.f5143d0 == 8)) {
                            ConstraintWidget constraintWidget6 = this.f5301X0[i8];
                            ConstraintWidget constraintWidget7 = this.f5300W0[i9];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.mo8280i(constraintWidget.f5114E, constraintWidget6.f5114E, 0);
                                constraintWidget.mo8280i(constraintWidget.f5116G, constraintWidget6.f5116G, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.mo8280i(constraintWidget.f5115F, constraintWidget7.f5115F, 0);
                                constraintWidget.mo8280i(constraintWidget.f5117H, constraintWidget7.f5117H, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.f5299V0.size() > 0) {
            this.f5299V0.get(0).mo8348b(0, z2, true);
        }
        this.f5339x0 = false;
    }

    /* renamed from: j */
    public final void mo8281j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo8281j(constraintWidget, hashMap);
        C2221e eVar = (C2221e) constraintWidget;
        this.f5280C0 = eVar.f5280C0;
        this.f5281D0 = eVar.f5281D0;
        this.f5282E0 = eVar.f5282E0;
        this.f5283F0 = eVar.f5283F0;
        this.f5284G0 = eVar.f5284G0;
        this.f5285H0 = eVar.f5285H0;
        this.f5286I0 = eVar.f5286I0;
        this.f5287J0 = eVar.f5287J0;
        this.f5288K0 = eVar.f5288K0;
        this.f5289L0 = eVar.f5289L0;
        this.f5290M0 = eVar.f5290M0;
        this.f5291N0 = eVar.f5291N0;
        this.f5292O0 = eVar.f5292O0;
        this.f5293P0 = eVar.f5293P0;
        this.f5294Q0 = eVar.f5294Q0;
        this.f5295R0 = eVar.f5295R0;
        this.f5296S0 = eVar.f5296S0;
        this.f5297T0 = eVar.f5297T0;
        this.f5298U0 = eVar.f5298U0;
    }
}
