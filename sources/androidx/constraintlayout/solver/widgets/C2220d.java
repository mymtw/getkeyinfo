package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.C2200b;
import androidx.constraintlayout.solver.widgets.analyzer.C2205e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p203p0.C7648c;

/* renamed from: androidx.constraintlayout.solver.widgets.d */
public final class C2220d extends C7648c {

    /* renamed from: A0 */
    public C2219c[] f5261A0 = new C2219c[4];

    /* renamed from: B0 */
    public int f5262B0 = 257;

    /* renamed from: C0 */
    public boolean f5263C0 = false;

    /* renamed from: D0 */
    public boolean f5264D0 = false;

    /* renamed from: E0 */
    public WeakReference<ConstraintAnchor> f5265E0 = null;

    /* renamed from: F0 */
    public WeakReference<ConstraintAnchor> f5266F0 = null;

    /* renamed from: G0 */
    public WeakReference<ConstraintAnchor> f5267G0 = null;

    /* renamed from: H0 */
    public WeakReference<ConstraintAnchor> f5268H0 = null;

    /* renamed from: I0 */
    public C2200b.C2201a f5269I0 = new C2200b.C2201a();

    /* renamed from: q0 */
    public C2200b f5270q0 = new C2200b(this);

    /* renamed from: r0 */
    public C2205e f5271r0 = new C2205e(this);

    /* renamed from: s0 */
    public C2200b.C2202b f5272s0 = null;

    /* renamed from: t0 */
    public boolean f5273t0 = false;

    /* renamed from: u0 */
    public C2190c f5274u0 = new C2190c();

    /* renamed from: v0 */
    public int f5275v0;

    /* renamed from: w0 */
    public int f5276w0;

    /* renamed from: x0 */
    public int f5277x0 = 0;

    /* renamed from: y0 */
    public int f5278y0 = 0;

    /* renamed from: z0 */
    public C2219c[] f5279z0 = new C2219c[4];

    /* renamed from: T */
    public static void m4876T(ConstraintWidget constraintWidget, C2200b.C2202b bVar, C2200b.C2201a aVar) {
        int i;
        int i2;
        if (bVar != null) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f5125P;
            aVar.f5209a = dimensionBehaviourArr[0];
            boolean z = true;
            aVar.f5210b = dimensionBehaviourArr[1];
            aVar.f5211c = constraintWidget.mo8289r();
            aVar.f5212d = constraintWidget.mo8286o();
            aVar.f5217i = false;
            aVar.f5218j = 0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f5209a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z2 = dimensionBehaviour == dimensionBehaviour2;
            boolean z3 = aVar.f5210b == dimensionBehaviour2;
            boolean z4 = z2 && constraintWidget.f5129T > 0.0f;
            boolean z5 = z3 && constraintWidget.f5129T > 0.0f;
            if (z2 && constraintWidget.mo8293u(0) && constraintWidget.f5160m == 0 && !z4) {
                aVar.f5209a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z3 && constraintWidget.f5162n == 0) {
                    aVar.f5209a = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z2 = false;
            }
            if (z3 && constraintWidget.mo8293u(1) && constraintWidget.f5162n == 0 && !z5) {
                aVar.f5210b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z2 && constraintWidget.f5160m == 0) {
                    aVar.f5210b = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z3 = false;
            }
            if (constraintWidget.mo8261A()) {
                aVar.f5209a = ConstraintWidget.DimensionBehaviour.FIXED;
                z2 = false;
            }
            if (constraintWidget.mo8262B()) {
                aVar.f5210b = ConstraintWidget.DimensionBehaviour.FIXED;
                z3 = false;
            }
            if (z4) {
                if (constraintWidget.f5164o[0] == 4) {
                    aVar.f5209a = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z3) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f5210b;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                        i2 = aVar.f5212d;
                    } else {
                        aVar.f5209a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ((ConstraintLayout.C2235b) bVar).mo8460b(constraintWidget, aVar);
                        i2 = aVar.f5214f;
                    }
                    aVar.f5209a = dimensionBehaviour4;
                    int i3 = constraintWidget.f5130U;
                    if (i3 == 0 || i3 == -1) {
                        aVar.f5211c = (int) (constraintWidget.f5129T * ((float) i2));
                    } else {
                        aVar.f5211c = (int) (constraintWidget.f5129T / ((float) i2));
                    }
                }
            }
            if (z5) {
                if (constraintWidget.f5164o[1] == 4) {
                    aVar.f5210b = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z2) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f5209a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                        i = aVar.f5211c;
                    } else {
                        aVar.f5210b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ((ConstraintLayout.C2235b) bVar).mo8460b(constraintWidget, aVar);
                        i = aVar.f5213e;
                    }
                    aVar.f5210b = dimensionBehaviour6;
                    int i4 = constraintWidget.f5130U;
                    if (i4 == 0 || i4 == -1) {
                        aVar.f5212d = (int) (((float) i) / constraintWidget.f5129T);
                    } else {
                        aVar.f5212d = (int) (((float) i) * constraintWidget.f5129T);
                    }
                }
            }
            ((ConstraintLayout.C2235b) bVar).mo8460b(constraintWidget, aVar);
            constraintWidget.mo8272L(aVar.f5213e);
            constraintWidget.mo8269I(aVar.f5214f);
            constraintWidget.f5176z = aVar.f5216h;
            int i5 = aVar.f5215g;
            constraintWidget.f5133X = i5;
            if (i5 <= 0) {
                z = false;
            }
            constraintWidget.f5176z = z;
            aVar.f5218j = 0;
        }
    }

    /* renamed from: C */
    public final void mo8263C() {
        this.f5274u0.mo8240s();
        this.f5275v0 = 0;
        this.f5276w0 = 0;
        super.mo8263C();
    }

    /* renamed from: M */
    public final void mo8273M(boolean z, boolean z2) {
        super.mo8273M(z, z2);
        int size = this.f16944p0.size();
        for (int i = 0; i < size; i++) {
            this.f16944p0.get(i).mo8273M(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r12v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0270, code lost:
        r22 = r0;
        r20 = r3;
        r23 = r5;
        r21 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x05db, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0642  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0651 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0790  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x07ba  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x07df  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x083c  */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x084d  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0869  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0876  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0879  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x08bd  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8338O() {
        /*
            r24 = this;
            r1 = r24
            r2 = 0
            r1.f5131V = r2
            r1.f5132W = r2
            r1.f5263C0 = r2
            r1.f5264D0 = r2
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r0 = r1.f16944p0
            int r3 = r0.size()
            int r0 = r24.mo8289r()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r24.mo8286o()
            int r4 = java.lang.Math.max(r2, r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f5125P
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f5262B0
            boolean r8 = androidx.constraintlayout.solver.widgets.C2225g.m4906b(r8, r6)
            if (r8 == 0) goto L_0x0231
            androidx.constraintlayout.solver.widgets.analyzer.b$b r8 = r1.f5272s0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r9 = r1.f5125P
            r10 = r9[r2]
            r9 = r9[r6]
            r24.mo8265E()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r11 = r1.f16944p0
            int r12 = r11.size()
            r13 = r2
        L_0x0042:
            if (r13 >= r12) goto L_0x0050
            java.lang.Object r14 = r11.get(r13)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r14
            r14.mo8265E()
            int r13 = r13 + 1
            goto L_0x0042
        L_0x0050:
            boolean r13 = r1.f5273t0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 != r14) goto L_0x005e
            int r10 = r24.mo8289r()
            r1.mo8267G(r2, r10)
            goto L_0x0065
        L_0x005e:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r1.f5114E
            r10.mo8259l(r2)
            r1.f5131V = r2
        L_0x0065:
            r10 = r2
            r14 = r10
            r15 = r14
        L_0x0068:
            r16 = 1056964608(0x3f000000, float:0.5)
            if (r10 >= r12) goto L_0x00cb
            java.lang.Object r18 = r11.get(r10)
            r2 = r18
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            boolean r6 = r2 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r6 == 0) goto L_0x00b5
            androidx.constraintlayout.solver.widgets.f r2 = (androidx.constraintlayout.solver.widgets.C2223f) r2
            int r6 = r2.f5327t0
            r19 = r4
            r4 = 1
            if (r6 != r4) goto L_0x00c4
            int r4 = r2.f5324q0
            r6 = -1
            if (r4 == r6) goto L_0x008a
            r2.mo8353O(r4)
            goto L_0x00b3
        L_0x008a:
            int r4 = r2.f5325r0
            if (r4 == r6) goto L_0x009f
            boolean r4 = r24.mo8261A()
            if (r4 == 0) goto L_0x009f
            int r4 = r24.mo8289r()
            int r6 = r2.f5325r0
            int r4 = r4 - r6
            r2.mo8353O(r4)
            goto L_0x00b3
        L_0x009f:
            boolean r4 = r24.mo8261A()
            if (r4 == 0) goto L_0x00b3
            float r4 = r2.f5323p0
            int r6 = r24.mo8289r()
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r16
            int r4 = (int) r4
            r2.mo8353O(r4)
        L_0x00b3:
            r14 = 1
            goto L_0x00c4
        L_0x00b5:
            r19 = r4
            boolean r4 = r2 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r4 == 0) goto L_0x00c4
            androidx.constraintlayout.solver.widgets.a r2 = (androidx.constraintlayout.solver.widgets.C2197a) r2
            int r2 = r2.mo8300Q()
            if (r2 != 0) goto L_0x00c4
            r15 = 1
        L_0x00c4:
            int r10 = r10 + 1
            r4 = r19
            r2 = 0
            r6 = 1
            goto L_0x0068
        L_0x00cb:
            r19 = r4
            if (r14 == 0) goto L_0x00e9
            r2 = 0
        L_0x00d0:
            if (r2 >= r12) goto L_0x00e9
            java.lang.Object r4 = r11.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            boolean r6 = r4 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r6 == 0) goto L_0x00e6
            androidx.constraintlayout.solver.widgets.f r4 = (androidx.constraintlayout.solver.widgets.C2223f) r4
            int r6 = r4.f5327t0
            r10 = 1
            if (r6 != r10) goto L_0x00e6
            androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4836b(r4, r8, r13)
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x00d0
        L_0x00e9:
            androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4836b(r1, r8, r13)
            if (r15 == 0) goto L_0x010f
            r2 = 0
        L_0x00ef:
            if (r2 >= r12) goto L_0x010f
            java.lang.Object r4 = r11.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            boolean r6 = r4 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r6 == 0) goto L_0x010c
            androidx.constraintlayout.solver.widgets.a r4 = (androidx.constraintlayout.solver.widgets.C2197a) r4
            int r6 = r4.mo8300Q()
            if (r6 != 0) goto L_0x010c
            boolean r6 = r4.mo8299P()
            if (r6 == 0) goto L_0x010c
            androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4836b(r4, r8, r13)
        L_0x010c:
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x010f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 != r2) goto L_0x011c
            int r2 = r24.mo8286o()
            r4 = 0
            r1.mo8268H(r4, r2)
            goto L_0x0124
        L_0x011c:
            r4 = 0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.f5115F
            r2.mo8259l(r4)
            r1.f5132W = r4
        L_0x0124:
            r2 = 0
            r4 = 0
            r6 = 0
        L_0x0127:
            if (r2 >= r12) goto L_0x0181
            java.lang.Object r9 = r11.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r9
            boolean r10 = r9 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r10 == 0) goto L_0x016f
            androidx.constraintlayout.solver.widgets.f r9 = (androidx.constraintlayout.solver.widgets.C2223f) r9
            int r10 = r9.f5327t0
            if (r10 != 0) goto L_0x016d
            int r4 = r9.f5324q0
            r10 = -1
            if (r4 == r10) goto L_0x0142
            r9.mo8353O(r4)
            goto L_0x016b
        L_0x0142:
            int r4 = r9.f5325r0
            if (r4 == r10) goto L_0x0157
            boolean r4 = r24.mo8262B()
            if (r4 == 0) goto L_0x0157
            int r4 = r24.mo8286o()
            int r14 = r9.f5325r0
            int r4 = r4 - r14
            r9.mo8353O(r4)
            goto L_0x016b
        L_0x0157:
            boolean r4 = r24.mo8262B()
            if (r4 == 0) goto L_0x016b
            float r4 = r9.f5323p0
            int r14 = r24.mo8286o()
            float r14 = (float) r14
            float r4 = r4 * r14
            float r4 = r4 + r16
            int r4 = (int) r4
            r9.mo8353O(r4)
        L_0x016b:
            r4 = 1
            goto L_0x017e
        L_0x016d:
            r10 = -1
            goto L_0x017e
        L_0x016f:
            r10 = -1
            boolean r14 = r9 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r14 == 0) goto L_0x017e
            androidx.constraintlayout.solver.widgets.a r9 = (androidx.constraintlayout.solver.widgets.C2197a) r9
            int r9 = r9.mo8300Q()
            r14 = 1
            if (r9 != r14) goto L_0x017e
            r6 = 1
        L_0x017e:
            int r2 = r2 + 1
            goto L_0x0127
        L_0x0181:
            if (r4 == 0) goto L_0x019c
            r2 = 0
        L_0x0184:
            if (r2 >= r12) goto L_0x019c
            java.lang.Object r4 = r11.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            boolean r9 = r4 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r9 == 0) goto L_0x0199
            androidx.constraintlayout.solver.widgets.f r4 = (androidx.constraintlayout.solver.widgets.C2223f) r4
            int r9 = r4.f5327t0
            if (r9 != 0) goto L_0x0199
            androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4841g(r4, r8)
        L_0x0199:
            int r2 = r2 + 1
            goto L_0x0184
        L_0x019c:
            androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4841g(r1, r8)
            if (r6 == 0) goto L_0x01c3
            r2 = 0
        L_0x01a2:
            if (r2 >= r12) goto L_0x01c3
            java.lang.Object r4 = r11.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            boolean r6 = r4 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r6 == 0) goto L_0x01c0
            androidx.constraintlayout.solver.widgets.a r4 = (androidx.constraintlayout.solver.widgets.C2197a) r4
            int r6 = r4.mo8300Q()
            r9 = 1
            if (r6 != r9) goto L_0x01c0
            boolean r6 = r4.mo8299P()
            if (r6 == 0) goto L_0x01c0
            androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4841g(r4, r8)
        L_0x01c0:
            int r2 = r2 + 1
            goto L_0x01a2
        L_0x01c3:
            r2 = 0
        L_0x01c4:
            if (r2 >= r12) goto L_0x01e6
            java.lang.Object r4 = r11.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            boolean r6 = r4.mo8298z()
            if (r6 == 0) goto L_0x01e3
            boolean r6 = androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4835a(r4)
            if (r6 == 0) goto L_0x01e3
            androidx.constraintlayout.solver.widgets.analyzer.b$a r6 = androidx.constraintlayout.solver.widgets.analyzer.C2207g.f5230a
            m4876T(r4, r8, r6)
            androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4836b(r4, r8, r13)
            androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4841g(r4, r8)
        L_0x01e3:
            int r2 = r2 + 1
            goto L_0x01c4
        L_0x01e6:
            r2 = 0
        L_0x01e7:
            if (r2 >= r3) goto L_0x0233
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4 = r1.f16944p0
            java.lang.Object r4 = r4.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            boolean r6 = r4.mo8298z()
            if (r6 == 0) goto L_0x022e
            boolean r6 = r4 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r6 != 0) goto L_0x022e
            boolean r6 = r4 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r6 != 0) goto L_0x022e
            boolean r6 = r4 instanceof androidx.constraintlayout.solver.widgets.C2226h
            if (r6 != 0) goto L_0x022e
            boolean r6 = r4.f5111B
            if (r6 != 0) goto L_0x022e
            r6 = 0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = r4.mo8285n(r6)
            r6 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = r4.mo8285n(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r10) goto L_0x0221
            int r8 = r4.f5160m
            if (r8 == r6) goto L_0x0221
            if (r9 != r10) goto L_0x0221
            int r8 = r4.f5162n
            if (r8 == r6) goto L_0x0221
            r6 = 1
            goto L_0x0222
        L_0x0221:
            r6 = 0
        L_0x0222:
            if (r6 != 0) goto L_0x022e
            androidx.constraintlayout.solver.widgets.analyzer.b$a r6 = new androidx.constraintlayout.solver.widgets.analyzer.b$a
            r6.<init>()
            androidx.constraintlayout.solver.widgets.analyzer.b$b r8 = r1.f5272s0
            m4876T(r4, r8, r6)
        L_0x022e:
            int r2 = r2 + 1
            goto L_0x01e7
        L_0x0231:
            r19 = r4
        L_0x0233:
            r2 = 2
            if (r3 <= r2) goto L_0x0627
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r6) goto L_0x023c
            if (r7 != r6) goto L_0x0627
        L_0x023c:
            int r6 = r1.f5262B0
            r8 = 1024(0x400, float:1.435E-42)
            boolean r6 = androidx.constraintlayout.solver.widgets.C2225g.m4906b(r6, r8)
            if (r6 == 0) goto L_0x0627
            androidx.constraintlayout.solver.widgets.analyzer.b$b r6 = r1.f5272s0
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r1.f16944p0
            int r9 = r8.size()
            r10 = 0
        L_0x024f:
            if (r10 >= r9) goto L_0x027e
            java.lang.Object r11 = r8.get(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r11
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r1.f5125P
            r13 = 0
            r14 = r12[r13]
            r15 = 1
            r12 = r12[r15]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r11.f5125P
            r4 = r2[r13]
            r2 = r2[r15]
            boolean r2 = androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4843b(r14, r12, r4, r2)
            if (r2 != 0) goto L_0x026c
            goto L_0x0270
        L_0x026c:
            boolean r2 = r11 instanceof androidx.constraintlayout.solver.widgets.C2221e
            if (r2 == 0) goto L_0x027a
        L_0x0270:
            r22 = r0
            r20 = r3
            r23 = r5
            r21 = r7
            goto L_0x05db
        L_0x027a:
            int r10 = r10 + 1
            r2 = 2
            goto L_0x024f
        L_0x027e:
            r2 = 0
            r4 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0285:
            if (r2 >= r9) goto L_0x0364
            java.lang.Object r15 = r8.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            r20 = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r1.f5125P
            r21 = r7
            r17 = 0
            r7 = r3[r17]
            r18 = 1
            r3 = r3[r18]
            r22 = r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f5125P
            r23 = r5
            r5 = r0[r17]
            r0 = r0[r18]
            boolean r0 = androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4843b(r7, r3, r5, r0)
            if (r0 != 0) goto L_0x02b0
            androidx.constraintlayout.solver.widgets.analyzer.b$a r0 = r1.f5269I0
            m4876T(r15, r6, r0)
        L_0x02b0:
            boolean r0 = r15 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r0 == 0) goto L_0x02d5
            r3 = r15
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C2223f) r3
            int r5 = r3.f5327t0
            if (r5 != 0) goto L_0x02c6
            if (r11 != 0) goto L_0x02c3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r11 = r5
        L_0x02c3:
            r11.add(r3)
        L_0x02c6:
            int r5 = r3.f5327t0
            r7 = 1
            if (r5 != r7) goto L_0x02d5
            if (r4 != 0) goto L_0x02d2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x02d2:
            r4.add(r3)
        L_0x02d5:
            boolean r3 = r15 instanceof p203p0.C7647b
            if (r3 == 0) goto L_0x031a
            boolean r3 = r15 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r3 == 0) goto L_0x0303
            r3 = r15
            androidx.constraintlayout.solver.widgets.a r3 = (androidx.constraintlayout.solver.widgets.C2197a) r3
            int r5 = r3.mo8300Q()
            if (r5 != 0) goto L_0x02f1
            if (r10 != 0) goto L_0x02ee
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r10 = r5
        L_0x02ee:
            r10.add(r3)
        L_0x02f1:
            int r5 = r3.mo8300Q()
            r7 = 1
            if (r5 != r7) goto L_0x031a
            if (r12 != 0) goto L_0x02ff
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x02ff:
            r12.add(r3)
            goto L_0x031a
        L_0x0303:
            r3 = r15
            p0.b r3 = (p203p0.C7647b) r3
            if (r10 != 0) goto L_0x030d
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x030d:
            r10.add(r3)
            if (r12 != 0) goto L_0x0317
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0317:
            r12.add(r3)
        L_0x031a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5105f
            if (r3 != 0) goto L_0x0336
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5105f
            if (r3 != 0) goto L_0x0336
            if (r0 != 0) goto L_0x0336
            boolean r3 = r15 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r3 != 0) goto L_0x0336
            if (r13 != 0) goto L_0x0333
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0333:
            r13.add(r15)
        L_0x0336:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5105f
            if (r3 != 0) goto L_0x0358
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5117H
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5105f
            if (r3 != 0) goto L_0x0358
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.f5118I
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5105f
            if (r3 != 0) goto L_0x0358
            if (r0 != 0) goto L_0x0358
            boolean r0 = r15 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r0 != 0) goto L_0x0358
            if (r14 != 0) goto L_0x0355
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0355:
            r14.add(r15)
        L_0x0358:
            int r2 = r2 + 1
            r3 = r20
            r7 = r21
            r0 = r22
            r5 = r23
            goto L_0x0285
        L_0x0364:
            r22 = r0
            r20 = r3
            r23 = r5
            r21 = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L_0x0389
            java.util.Iterator r2 = r4.iterator()
        L_0x0377:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0389
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C2223f) r3
            r4 = 0
            r5 = 0
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x0377
        L_0x0389:
            r4 = 0
            r5 = 0
            if (r10 == 0) goto L_0x03aa
            java.util.Iterator r2 = r10.iterator()
        L_0x0391:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03aa
            java.lang.Object r3 = r2.next()
            p0.b r3 = (p203p0.C7647b) r3
            androidx.constraintlayout.solver.widgets.analyzer.n r6 = androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            r3.mo20058O(r5, r6, r0)
            r6.mo8334b(r0)
            r4 = 0
            r5 = 0
            goto L_0x0391
        L_0x03aa:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mo8284m(r2)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r2.f5100a
            if (r2 == 0) goto L_0x03cc
            java.util.Iterator r2 = r2.iterator()
        L_0x03b8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03cc
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.f5103d
            r4 = 0
            r5 = 0
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x03b8
        L_0x03cc:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mo8284m(r2)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r2.f5100a
            if (r2 == 0) goto L_0x03ee
            java.util.Iterator r2 = r2.iterator()
        L_0x03da:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ee
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.f5103d
            r4 = 0
            r5 = 0
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x03da
        L_0x03ee:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mo8284m(r2)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r2.f5100a
            if (r2 == 0) goto L_0x0410
            java.util.Iterator r2 = r2.iterator()
        L_0x03fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0410
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.f5103d
            r4 = 0
            r5 = 0
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x03fc
        L_0x0410:
            r4 = 0
            r5 = 0
            if (r13 == 0) goto L_0x0428
            java.util.Iterator r2 = r13.iterator()
        L_0x0418:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0428
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x0418
        L_0x0428:
            if (r11 == 0) goto L_0x043f
            java.util.Iterator r2 = r11.iterator()
        L_0x042e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x043f
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C2223f) r3
            r5 = 1
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x042e
        L_0x043f:
            r5 = 1
            if (r12 == 0) goto L_0x045f
            java.util.Iterator r2 = r12.iterator()
        L_0x0446:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x045f
            java.lang.Object r3 = r2.next()
            p0.b r3 = (p203p0.C7647b) r3
            androidx.constraintlayout.solver.widgets.analyzer.n r6 = androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            r3.mo20058O(r5, r6, r0)
            r6.mo8334b(r0)
            r4 = 0
            r5 = 1
            goto L_0x0446
        L_0x045f:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mo8284m(r2)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r2.f5100a
            if (r2 == 0) goto L_0x0481
            java.util.Iterator r2 = r2.iterator()
        L_0x046d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0481
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.f5103d
            r4 = 0
            r5 = 1
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x046d
        L_0x0481:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mo8284m(r2)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r2.f5100a
            if (r2 == 0) goto L_0x04a3
            java.util.Iterator r2 = r2.iterator()
        L_0x048f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04a3
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.f5103d
            r4 = 0
            r5 = 1
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x048f
        L_0x04a3:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mo8284m(r2)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r2.f5100a
            if (r2 == 0) goto L_0x04c5
            java.util.Iterator r2 = r2.iterator()
        L_0x04b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c5
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.f5103d
            r4 = 0
            r5 = 1
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x04b1
        L_0x04c5:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.mo8284m(r2)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r2 = r2.f5100a
            if (r2 == 0) goto L_0x04e7
            java.util.Iterator r2 = r2.iterator()
        L_0x04d3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04e7
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r3.f5103d
            r4 = 0
            r5 = 1
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x04d3
        L_0x04e7:
            r4 = 0
            r5 = 1
            if (r14 == 0) goto L_0x04ff
            java.util.Iterator r2 = r14.iterator()
        L_0x04ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04ff
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4842a(r3, r5, r0, r4)
            goto L_0x04ef
        L_0x04ff:
            r2 = 0
        L_0x0500:
            if (r2 >= r9) goto L_0x055c
            java.lang.Object r3 = r8.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r3.f5125P
            r5 = 0
            r6 = r4[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r5) goto L_0x0518
            r6 = 1
            r4 = r4[r6]
            if (r4 != r5) goto L_0x0518
            r4 = 1
            goto L_0x0519
        L_0x0518:
            r4 = 0
        L_0x0519:
            if (r4 == 0) goto L_0x0559
            int r4 = r3.f5163n0
            int r5 = r0.size()
            r6 = 0
        L_0x0522:
            if (r6 >= r5) goto L_0x0532
            java.lang.Object r7 = r0.get(r6)
            androidx.constraintlayout.solver.widgets.analyzer.n r7 = (androidx.constraintlayout.solver.widgets.analyzer.C2216n) r7
            int r10 = r7.f5240b
            if (r4 != r10) goto L_0x052f
            goto L_0x0533
        L_0x052f:
            int r6 = r6 + 1
            goto L_0x0522
        L_0x0532:
            r7 = 0
        L_0x0533:
            int r3 = r3.f5165o0
            int r4 = r0.size()
            r5 = 0
        L_0x053a:
            if (r5 >= r4) goto L_0x054a
            java.lang.Object r6 = r0.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.n r6 = (androidx.constraintlayout.solver.widgets.analyzer.C2216n) r6
            int r10 = r6.f5240b
            if (r3 != r10) goto L_0x0547
            goto L_0x054b
        L_0x0547:
            int r5 = r5 + 1
            goto L_0x053a
        L_0x054a:
            r6 = 0
        L_0x054b:
            if (r7 == 0) goto L_0x0559
            if (r6 == 0) goto L_0x0559
            r3 = 0
            r7.mo8336d(r3, r6)
            r3 = 2
            r6.f5241c = r3
            r0.remove(r7)
        L_0x0559:
            int r2 = r2 + 1
            goto L_0x0500
        L_0x055c:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x0565
            goto L_0x05db
        L_0x0565:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.f5125P
            r3 = 0
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x059d
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x0574:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0592
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.solver.widgets.analyzer.n r5 = (androidx.constraintlayout.solver.widgets.analyzer.C2216n) r5
            int r6 = r5.f5241c
            r7 = 1
            if (r6 != r7) goto L_0x0586
            goto L_0x0574
        L_0x0586:
            androidx.constraintlayout.solver.c r6 = r1.f5274u0
            r7 = 0
            int r6 = r5.mo8335c(r6, r7)
            if (r6 <= r3) goto L_0x0574
            r4 = r5
            r3 = r6
            goto L_0x0574
        L_0x0592:
            if (r4 == 0) goto L_0x059d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.mo8270J(r2)
            r1.mo8272L(r3)
            goto L_0x059e
        L_0x059d:
            r4 = 0
        L_0x059e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.f5125P
            r3 = 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x05d5
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x05ad:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05ca
            java.lang.Object r5 = r0.next()
            androidx.constraintlayout.solver.widgets.analyzer.n r5 = (androidx.constraintlayout.solver.widgets.analyzer.C2216n) r5
            int r6 = r5.f5241c
            if (r6 != 0) goto L_0x05be
            goto L_0x05ad
        L_0x05be:
            androidx.constraintlayout.solver.c r6 = r1.f5274u0
            r7 = 1
            int r6 = r5.mo8335c(r6, r7)
            if (r6 <= r2) goto L_0x05ad
            r3 = r5
            r2 = r6
            goto L_0x05ad
        L_0x05ca:
            if (r3 == 0) goto L_0x05d5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.mo8271K(r0)
            r1.mo8269I(r2)
            goto L_0x05d6
        L_0x05d5:
            r3 = 0
        L_0x05d6:
            if (r4 != 0) goto L_0x05dd
            if (r3 == 0) goto L_0x05db
            goto L_0x05dd
        L_0x05db:
            r0 = 0
            goto L_0x05de
        L_0x05dd:
            r0 = 1
        L_0x05de:
            if (r0 == 0) goto L_0x061e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r2 = r23
            if (r2 != r0) goto L_0x05fc
            int r3 = r24.mo8289r()
            r4 = r22
            if (r4 >= r3) goto L_0x05f7
            if (r4 <= 0) goto L_0x05f7
            r1.mo8272L(r4)
            r3 = 1
            r1.f5263C0 = r3
            goto L_0x05fe
        L_0x05f7:
            int r3 = r24.mo8289r()
            goto L_0x05ff
        L_0x05fc:
            r4 = r22
        L_0x05fe:
            r3 = r4
        L_0x05ff:
            r5 = r21
            if (r5 != r0) goto L_0x0619
            int r0 = r24.mo8286o()
            r6 = r19
            if (r6 >= r0) goto L_0x0614
            if (r6 <= 0) goto L_0x0614
            r1.mo8269I(r6)
            r4 = 1
            r1.f5264D0 = r4
            goto L_0x061b
        L_0x0614:
            int r4 = r24.mo8286o()
            goto L_0x061c
        L_0x0619:
            r6 = r19
        L_0x061b:
            r4 = r6
        L_0x061c:
            r0 = 1
            goto L_0x0631
        L_0x061e:
            r6 = r19
            r5 = r21
            r4 = r22
            r2 = r23
            goto L_0x062e
        L_0x0627:
            r4 = r0
            r20 = r3
            r2 = r5
            r5 = r7
            r6 = r19
        L_0x062e:
            r3 = r4
            r4 = r6
            r0 = 0
        L_0x0631:
            r6 = 64
            boolean r7 = r1.mo8343U(r6)
            if (r7 != 0) goto L_0x0644
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.mo8343U(r7)
            if (r7 == 0) goto L_0x0642
            goto L_0x0644
        L_0x0642:
            r7 = 0
            goto L_0x0645
        L_0x0644:
            r7 = 1
        L_0x0645:
            androidx.constraintlayout.solver.c r8 = r1.f5274u0
            r8.getClass()
            r9 = 0
            r8.f5085g = r9
            int r10 = r1.f5262B0
            if (r10 == 0) goto L_0x0657
            if (r7 == 0) goto L_0x0657
            r7 = 1
            r8.f5085g = r7
            goto L_0x0658
        L_0x0657:
            r7 = 1
        L_0x0658:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r8 = r1.f16944p0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r1.f5125P
            r11 = r10[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r12) goto L_0x0669
            r10 = r10[r7]
            if (r10 != r12) goto L_0x0667
            goto L_0x0669
        L_0x0667:
            r7 = r9
            goto L_0x066a
        L_0x0669:
            r7 = 1
        L_0x066a:
            r1.f5277x0 = r9
            r1.f5278y0 = r9
            r10 = r20
            r9 = 0
        L_0x0671:
            if (r9 >= r10) goto L_0x0687
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r11 = r1.f16944p0
            java.lang.Object r11 = r11.get(r9)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r11
            boolean r12 = r11 instanceof p203p0.C7648c
            if (r12 == 0) goto L_0x0684
            p0.c r11 = (p203p0.C7648c) r11
            r11.mo8338O()
        L_0x0684:
            int r9 = r9 + 1
            goto L_0x0671
        L_0x0687:
            boolean r9 = r1.mo8343U(r6)
            r11 = r0
            r0 = 0
            r12 = 1
        L_0x068e:
            if (r12 == 0) goto L_0x08b9
            r13 = 1
            int r14 = r0 + 1
            androidx.constraintlayout.solver.c r0 = r1.f5274u0     // Catch:{ Exception -> 0x0773 }
            r0.mo8240s()     // Catch:{ Exception -> 0x0773 }
            r13 = 0
            r1.f5277x0 = r13     // Catch:{ Exception -> 0x0773 }
            r1.f5278y0 = r13     // Catch:{ Exception -> 0x0773 }
            androidx.constraintlayout.solver.c r0 = r1.f5274u0     // Catch:{ Exception -> 0x0773 }
            r1.mo8282k(r0)     // Catch:{ Exception -> 0x0773 }
            r0 = 0
        L_0x06a3:
            if (r0 >= r10) goto L_0x06b5
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r13 = r1.f16944p0     // Catch:{ Exception -> 0x0773 }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x0773 }
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r13     // Catch:{ Exception -> 0x0773 }
            androidx.constraintlayout.solver.c r15 = r1.f5274u0     // Catch:{ Exception -> 0x0773 }
            r13.mo8282k(r15)     // Catch:{ Exception -> 0x0773 }
            int r0 = r0 + 1
            goto L_0x06a3
        L_0x06b5:
            androidx.constraintlayout.solver.c r0 = r1.f5274u0     // Catch:{ Exception -> 0x0773 }
            r1.mo8340Q(r0)     // Catch:{ Exception -> 0x0773 }
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5265E0     // Catch:{ Exception -> 0x0766 }
            r12 = 5
            if (r0 == 0) goto L_0x06e7
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06e5 }
            if (r0 == 0) goto L_0x06e7
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5265E0     // Catch:{ Exception -> 0x06e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r13 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r1.f5115F     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.SolverVariable r13 = r13.mo8233k(r15)     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r15 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.SolverVariable r0 = r15.mo8233k(r0)     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r15 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            r6 = 0
            r15.mo8228f(r0, r13, r6, r12)     // Catch:{ Exception -> 0x06e5 }
            r6 = 0
            r1.f5265E0 = r6     // Catch:{ Exception -> 0x0766 }
            goto L_0x06e7
        L_0x06e5:
            r0 = move-exception
            goto L_0x073a
        L_0x06e7:
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5267G0     // Catch:{ Exception -> 0x0766 }
            if (r0 == 0) goto L_0x0710
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06e5 }
            if (r0 == 0) goto L_0x0710
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5267G0     // Catch:{ Exception -> 0x06e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r6 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r1.f5117H     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mo8233k(r13)     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r13 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.SolverVariable r0 = r13.mo8233k(r0)     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r13 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            r15 = 0
            r13.mo8228f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x06e5 }
            r6 = 0
            r1.f5267G0 = r6     // Catch:{ Exception -> 0x0766 }
        L_0x0710:
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5266F0     // Catch:{ Exception -> 0x0766 }
            if (r0 == 0) goto L_0x073c
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06e5 }
            if (r0 == 0) goto L_0x073c
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5266F0     // Catch:{ Exception -> 0x06e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r6 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r1.f5114E     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mo8233k(r13)     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r13 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.SolverVariable r0 = r13.mo8233k(r0)     // Catch:{ Exception -> 0x06e5 }
            androidx.constraintlayout.solver.c r13 = r1.f5274u0     // Catch:{ Exception -> 0x06e5 }
            r15 = 0
            r13.mo8228f(r0, r6, r15, r12)     // Catch:{ Exception -> 0x06e5 }
            r6 = 0
            r1.f5266F0 = r6     // Catch:{ Exception -> 0x0766 }
            goto L_0x073c
        L_0x073a:
            r6 = 0
            goto L_0x0771
        L_0x073c:
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5268H0     // Catch:{ Exception -> 0x0766 }
            if (r0 == 0) goto L_0x0768
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0766 }
            if (r0 == 0) goto L_0x0768
            java.lang.ref.WeakReference<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5268H0     // Catch:{ Exception -> 0x0766 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0766 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x0766 }
            androidx.constraintlayout.solver.c r6 = r1.f5274u0     // Catch:{ Exception -> 0x0766 }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r1.f5116G     // Catch:{ Exception -> 0x0766 }
            androidx.constraintlayout.solver.SolverVariable r6 = r6.mo8233k(r13)     // Catch:{ Exception -> 0x0766 }
            androidx.constraintlayout.solver.c r13 = r1.f5274u0     // Catch:{ Exception -> 0x0766 }
            androidx.constraintlayout.solver.SolverVariable r0 = r13.mo8233k(r0)     // Catch:{ Exception -> 0x0766 }
            androidx.constraintlayout.solver.c r13 = r1.f5274u0     // Catch:{ Exception -> 0x0766 }
            r15 = 0
            r13.mo8228f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0766 }
            r6 = 0
            r1.f5268H0 = r6     // Catch:{ Exception -> 0x0770 }
            goto L_0x0769
        L_0x0766:
            r0 = move-exception
            goto L_0x073a
        L_0x0768:
            r6 = 0
        L_0x0769:
            androidx.constraintlayout.solver.c r0 = r1.f5274u0     // Catch:{ Exception -> 0x0770 }
            r0.mo8237p()     // Catch:{ Exception -> 0x0770 }
            r12 = 1
            goto L_0x078e
        L_0x0770:
            r0 = move-exception
        L_0x0771:
            r12 = 1
            goto L_0x0775
        L_0x0773:
            r0 = move-exception
            r6 = 0
        L_0x0775:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "EXCEPTION : "
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r13.println(r0)
        L_0x078e:
            if (r12 == 0) goto L_0x07ba
            androidx.constraintlayout.solver.c r0 = r1.f5274u0
            boolean[] r6 = androidx.constraintlayout.solver.widgets.C2225g.f5330a
            r12 = 2
            r13 = 0
            r6[r12] = r13
            r6 = 64
            boolean r12 = r1.mo8343U(r6)
            r1.mo8274N(r0, r12)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r13 = r1.f16944p0
            int r13 = r13.size()
            r15 = 0
        L_0x07a8:
            if (r15 >= r13) goto L_0x07d2
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r6 = r1.f16944p0
            java.lang.Object r6 = r6.get(r15)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r6
            r6.mo8274N(r0, r12)
            int r15 = r15 + 1
            r6 = 64
            goto L_0x07a8
        L_0x07ba:
            androidx.constraintlayout.solver.c r0 = r1.f5274u0
            r1.mo8274N(r0, r9)
            r0 = 0
        L_0x07c0:
            if (r0 >= r10) goto L_0x07d2
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r6 = r1.f16944p0
            java.lang.Object r6 = r6.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r6
            androidx.constraintlayout.solver.c r12 = r1.f5274u0
            r6.mo8274N(r12, r9)
            int r0 = r0 + 1
            goto L_0x07c0
        L_0x07d2:
            if (r7 == 0) goto L_0x083c
            r0 = 8
            if (r14 >= r0) goto L_0x083c
            boolean[] r0 = androidx.constraintlayout.solver.widgets.C2225g.f5330a
            r6 = 2
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x083c
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x07e2:
            if (r0 >= r10) goto L_0x0807
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r15 = r1.f16944p0
            java.lang.Object r15 = r15.get(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r15 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r15
            int r6 = r15.f5131V
            int r20 = r15.mo8289r()
            int r6 = r20 + r6
            int r12 = java.lang.Math.max(r12, r6)
            int r6 = r15.f5132W
            int r15 = r15.mo8286o()
            int r15 = r15 + r6
            int r13 = java.lang.Math.max(r13, r15)
            int r0 = r0 + 1
            r6 = 2
            goto L_0x07e2
        L_0x0807:
            int r0 = r1.f5134Y
            int r0 = java.lang.Math.max(r0, r12)
            int r6 = r1.f5135Z
            int r6 = java.lang.Math.max(r6, r13)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r12) goto L_0x0828
            int r13 = r24.mo8289r()
            if (r13 >= r0) goto L_0x0828
            r1.mo8272L(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f5125P
            r11 = 0
            r0[r11] = r12
            r0 = 1
            r11 = 1
            goto L_0x0829
        L_0x0828:
            r0 = 0
        L_0x0829:
            if (r5 != r12) goto L_0x083d
            int r13 = r24.mo8286o()
            if (r13 >= r6) goto L_0x083d
            r1.mo8269I(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f5125P
            r6 = 1
            r0[r6] = r12
            r0 = 1
            r11 = 1
            goto L_0x083d
        L_0x083c:
            r0 = 0
        L_0x083d:
            int r6 = r1.f5134Y
            int r12 = r24.mo8289r()
            int r6 = java.lang.Math.max(r6, r12)
            int r12 = r24.mo8289r()
            if (r6 <= r12) goto L_0x0859
            r1.mo8272L(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f5125P
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r11 = 0
            r0[r11] = r6
            r0 = 1
            r11 = 1
        L_0x0859:
            int r6 = r1.f5135Z
            int r12 = r24.mo8286o()
            int r6 = java.lang.Math.max(r6, r12)
            int r12 = r24.mo8286o()
            if (r6 <= r12) goto L_0x0876
            r1.mo8269I(r6)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f5125P
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r12 = 1
            r0[r12] = r6
            r0 = r12
            r11 = r0
            goto L_0x0877
        L_0x0876:
            r12 = 1
        L_0x0877:
            if (r11 != 0) goto L_0x08b3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r1.f5125P
            r13 = 0
            r6 = r6[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r15) goto L_0x0897
            if (r3 <= 0) goto L_0x0897
            int r6 = r24.mo8289r()
            if (r6 <= r3) goto L_0x0897
            r1.f5263C0 = r12
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f5125P
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r13] = r6
            r1.mo8272L(r3)
            r0 = r12
            r11 = r0
        L_0x0897:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r1.f5125P
            r6 = r6[r12]
            if (r6 != r15) goto L_0x08b3
            if (r4 <= 0) goto L_0x08b3
            int r6 = r24.mo8286o()
            if (r6 <= r4) goto L_0x08b3
            r1.f5264D0 = r12
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f5125P
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r12] = r6
            r1.mo8269I(r4)
            r11 = 1
            r12 = 1
            goto L_0x08b4
        L_0x08b3:
            r12 = r0
        L_0x08b4:
            r0 = r14
            r6 = 64
            goto L_0x068e
        L_0x08b9:
            r1.f16944p0 = r8
            if (r11 == 0) goto L_0x08c5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f5125P
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r5
        L_0x08c5:
            androidx.constraintlayout.solver.c r0 = r1.f5274u0
            o0.a r0 = r0.f5090l
            r1.mo8266F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C2220d.mo8338O():void");
    }

    /* renamed from: P */
    public final void mo8339P(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.f5277x0 + 1;
            C2219c[] cVarArr = this.f5261A0;
            if (i2 >= cVarArr.length) {
                this.f5261A0 = (C2219c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            C2219c[] cVarArr2 = this.f5261A0;
            int i3 = this.f5277x0;
            cVarArr2[i3] = new C2219c(constraintWidget, 0, this.f5273t0);
            this.f5277x0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.f5278y0 + 1;
            C2219c[] cVarArr3 = this.f5279z0;
            if (i4 >= cVarArr3.length) {
                this.f5279z0 = (C2219c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            C2219c[] cVarArr4 = this.f5279z0;
            int i5 = this.f5278y0;
            cVarArr4[i5] = new C2219c(constraintWidget, 1, this.f5273t0);
            this.f5278y0 = i5 + 1;
        }
    }

    /* renamed from: Q */
    public final void mo8340Q(C2190c cVar) {
        boolean U = mo8343U(64);
        mo8276e(cVar, U);
        int size = this.f16944p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f16944p0.get(i);
            boolean[] zArr = constraintWidget.f5124O;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof C2197a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.f16944p0.get(i2);
                if (constraintWidget2 instanceof C2197a) {
                    C2197a aVar = (C2197a) constraintWidget2;
                    for (int i3 = 0; i3 < aVar.f16943q0; i3++) {
                        ConstraintWidget constraintWidget3 = aVar.f16942p0[i3];
                        int i4 = aVar.f5179r0;
                        if (i4 == 0 || i4 == 1) {
                            constraintWidget3.f5124O[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            constraintWidget3.f5124O[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = this.f16944p0.get(i5);
            constraintWidget4.getClass();
            if ((constraintWidget4 instanceof C2226h) || (constraintWidget4 instanceof C2223f)) {
                constraintWidget4.mo8276e(cVar, U);
            }
        }
        if (C2190c.f5077p) {
            HashSet hashSet = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = this.f16944p0.get(i6);
                constraintWidget5.getClass();
                if (!((constraintWidget5 instanceof C2226h) || (constraintWidget5 instanceof C2223f))) {
                    hashSet.add(constraintWidget5);
                }
            }
            mo8275d(this, cVar, hashSet, this.f5125P[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) it.next();
                C2225g.m4905a(this, cVar, constraintWidget6);
                constraintWidget6.mo8276e(cVar, U);
            }
        } else {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget7 = this.f16944p0.get(i7);
                if (constraintWidget7 instanceof C2220d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.f5125P;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.mo8270J(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.mo8271K(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget7.mo8276e(cVar, U);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.mo8270J(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.mo8271K(dimensionBehaviour2);
                    }
                } else {
                    C2225g.m4905a(this, cVar, constraintWidget7);
                    if (!((constraintWidget7 instanceof C2226h) || (constraintWidget7 instanceof C2223f))) {
                        constraintWidget7.mo8276e(cVar, U);
                    }
                }
            }
        }
        if (this.f5277x0 > 0) {
            C2218b.m4875a(this, cVar, (ArrayList<ConstraintWidget>) null, 0);
        }
        if (this.f5278y0 > 0) {
            C2218b.m4875a(this, cVar, (ArrayList<ConstraintWidget>) null, 1);
        }
    }

    /* renamed from: R */
    public final void mo8341R(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f5265E0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo8251d() > this.f5265E0.get().mo8251d()) {
            this.f5265E0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0140 A[EDGE_INSN: B:76:0x0140->B:62:0x0140 ?: BREAK  , SYNTHETIC] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8342S(int r11, boolean r12) {
        /*
            r10 = this;
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r10.f5271r0
            r1 = 1
            r12 = r12 & r1
            androidx.constraintlayout.solver.widgets.d r2 = r0.f5221a
            r3 = 0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.mo8285n(r3)
            androidx.constraintlayout.solver.widgets.d r4 = r0.f5221a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r4.mo8285n(r1)
            androidx.constraintlayout.solver.widgets.d r5 = r0.f5221a
            int r5 = r5.mo8290s()
            androidx.constraintlayout.solver.widgets.d r6 = r0.f5221a
            int r6 = r6.mo8291t()
            if (r12 == 0) goto L_0x008b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 == r7) goto L_0x0025
            if (r4 != r7) goto L_0x008b
        L_0x0025:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r7 = r0.f5225e
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0042
            java.lang.Object r8 = r7.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r8
            int r9 = r8.f5200f
            if (r9 != r11) goto L_0x002b
            boolean r8 = r8.mo8312k()
            if (r8 != 0) goto L_0x002b
            r12 = r3
        L_0x0042:
            if (r11 != 0) goto L_0x0068
            if (r12 == 0) goto L_0x008b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r12) goto L_0x008b
            androidx.constraintlayout.solver.widgets.d r12 = r0.f5221a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r12.mo8270J(r7)
            androidx.constraintlayout.solver.widgets.d r12 = r0.f5221a
            int r7 = r0.mo8323d(r12, r3)
            r12.mo8272L(r7)
            androidx.constraintlayout.solver.widgets.d r12 = r0.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.k r7 = r12.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r7 = r7.f5199e
            int r12 = r12.mo8289r()
            r7.mo8304d(r12)
            goto L_0x008b
        L_0x0068:
            if (r12 == 0) goto L_0x008b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != r12) goto L_0x008b
            androidx.constraintlayout.solver.widgets.d r12 = r0.f5221a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r12.mo8271K(r7)
            androidx.constraintlayout.solver.widgets.d r12 = r0.f5221a
            int r7 = r0.mo8323d(r12, r1)
            r12.mo8269I(r7)
            androidx.constraintlayout.solver.widgets.d r12 = r0.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r7 = r12.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r7 = r7.f5199e
            int r12 = r12.mo8286o()
            r7.mo8304d(r12)
        L_0x008b:
            if (r11 != 0) goto L_0x00b4
            androidx.constraintlayout.solver.widgets.d r12 = r0.f5221a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r12.f5125P
            r6 = r6[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x009b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r6 != r7) goto L_0x00c3
        L_0x009b:
            int r12 = r12.mo8289r()
            int r12 = r12 + r5
            androidx.constraintlayout.solver.widgets.d r6 = r0.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.k r6 = r6.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r6 = r6.f5203i
            r6.mo8304d(r12)
            androidx.constraintlayout.solver.widgets.d r6 = r0.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.k r6 = r6.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r6 = r6.f5199e
            int r12 = r12 - r5
            r6.mo8304d(r12)
            goto L_0x00dd
        L_0x00b4:
            androidx.constraintlayout.solver.widgets.d r12 = r0.f5221a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r12.f5125P
            r5 = r5[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r7) goto L_0x00c5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r7) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r12 = r3
            goto L_0x00de
        L_0x00c5:
            int r12 = r12.mo8286o()
            int r12 = r12 + r6
            androidx.constraintlayout.solver.widgets.d r5 = r0.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r5 = r5.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.f5203i
            r5.mo8304d(r12)
            androidx.constraintlayout.solver.widgets.d r5 = r0.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r5 = r5.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r5 = r5.f5199e
            int r12 = r12 - r6
            r5.mo8304d(r12)
        L_0x00dd:
            r12 = r1
        L_0x00de:
            r0.mo8326g()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r5 = r0.f5225e
            java.util.Iterator r5 = r5.iterator()
        L_0x00e7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0107
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r6 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r6
            int r7 = r6.f5200f
            if (r7 == r11) goto L_0x00f8
            goto L_0x00e7
        L_0x00f8:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.f5196b
            androidx.constraintlayout.solver.widgets.d r8 = r0.f5221a
            if (r7 != r8) goto L_0x0103
            boolean r7 = r6.f5201g
            if (r7 != 0) goto L_0x0103
            goto L_0x00e7
        L_0x0103:
            r6.mo8308e()
            goto L_0x00e7
        L_0x0107:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r5 = r0.f5225e
            java.util.Iterator r5 = r5.iterator()
        L_0x010d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0140
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r6 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r6
            int r7 = r6.f5200f
            if (r7 == r11) goto L_0x011e
            goto L_0x010d
        L_0x011e:
            if (r12 != 0) goto L_0x0127
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r6.f5196b
            androidx.constraintlayout.solver.widgets.d r8 = r0.f5221a
            if (r7 != r8) goto L_0x0127
            goto L_0x010d
        L_0x0127:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.f5202h
            boolean r7 = r7.f5192j
            if (r7 != 0) goto L_0x012e
            goto L_0x013f
        L_0x012e:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r6.f5203i
            boolean r7 = r7.f5192j
            if (r7 != 0) goto L_0x0135
            goto L_0x013f
        L_0x0135:
            boolean r7 = r6 instanceof androidx.constraintlayout.solver.widgets.analyzer.C2203c
            if (r7 != 0) goto L_0x010d
            androidx.constraintlayout.solver.widgets.analyzer.f r6 = r6.f5199e
            boolean r6 = r6.f5192j
            if (r6 != 0) goto L_0x010d
        L_0x013f:
            r1 = r3
        L_0x0140:
            androidx.constraintlayout.solver.widgets.d r11 = r0.f5221a
            r11.mo8270J(r2)
            androidx.constraintlayout.solver.widgets.d r11 = r0.f5221a
            r11.mo8271K(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C2220d.mo8342S(int, boolean):boolean");
    }

    /* renamed from: U */
    public final boolean mo8343U(int i) {
        return (this.f5262B0 & i) == i;
    }
}
