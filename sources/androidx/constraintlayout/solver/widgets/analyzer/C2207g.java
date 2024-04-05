package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.C2200b;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.g */
public final class C2207g {

    /* renamed from: a */
    public static C2200b.C2201a f5230a = new C2200b.C2201a();

    /* renamed from: a */
    public static boolean m4835a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f5125P;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f5126Q;
        C2220d dVar = constraintWidget2 != null ? (C2220d) constraintWidget2 : null;
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar.f5125P[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.f5125P[1];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = dimensionBehaviour == dimensionBehaviour7 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f5160m == 0 && constraintWidget.f5129T == 0.0f && constraintWidget.mo8293u(0)) || constraintWidget.mo8261A();
        boolean z2 = dimensionBehaviour2 == dimensionBehaviour7 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f5162n == 0 && constraintWidget.f5129T == 0.0f && constraintWidget.mo8293u(1)) || constraintWidget.mo8262B();
        if (constraintWidget.f5129T <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r11 = r9.f5116G.f5105f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        r4 = r10.f5105f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4836b(androidx.constraintlayout.solver.widgets.ConstraintWidget r13, androidx.constraintlayout.solver.widgets.analyzer.C2200b.C2202b r14, boolean r15) {
        /*
            boolean r0 = r13 instanceof androidx.constraintlayout.solver.widgets.C2220d
            if (r0 != 0) goto L_0x0018
            boolean r0 = r13.mo8298z()
            if (r0 == 0) goto L_0x0018
            boolean r0 = m4835a(r13)
            if (r0 == 0) goto L_0x0018
            androidx.constraintlayout.solver.widgets.analyzer.b$a r0 = new androidx.constraintlayout.solver.widgets.analyzer.b$a
            r0.<init>()
            androidx.constraintlayout.solver.widgets.C2220d.m4876T(r13, r14, r0)
        L_0x0018:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mo8284m(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r13.mo8284m(r1)
            int r2 = r0.mo8251d()
            int r3 = r1.mo8251d()
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r0.f5100a
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0109
            boolean r0 = r0.f5102c
            if (r0 == 0) goto L_0x0109
            java.util.Iterator r0 = r4.iterator()
        L_0x003d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0109
            java.lang.Object r4 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r4.f5103d
            boolean r10 = m4835a(r9)
            boolean r11 = r9.mo8298z()
            if (r11 == 0) goto L_0x005f
            if (r10 == 0) goto L_0x005f
            androidx.constraintlayout.solver.widgets.analyzer.b$a r11 = new androidx.constraintlayout.solver.widgets.analyzer.b$a
            r11.<init>()
            androidx.constraintlayout.solver.widgets.C2220d.m4876T(r9, r14, r11)
        L_0x005f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r9.f5125P
            r11 = r11[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00b5
            if (r10 == 0) goto L_0x006a
            goto L_0x00b5
        L_0x006a:
            if (r11 != r12) goto L_0x003d
            int r10 = r9.f5167q
            if (r10 < 0) goto L_0x003d
            int r10 = r9.f5166p
            if (r10 < 0) goto L_0x003d
            int r10 = r9.f5143d0
            if (r10 == r6) goto L_0x0082
            int r10 = r9.f5160m
            if (r10 != 0) goto L_0x003d
            float r10 = r9.f5129T
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x003d
        L_0x0082:
            boolean r10 = r9.mo8296x()
            if (r10 != 0) goto L_0x003d
            boolean r10 = r9.f5111B
            if (r10 != 0) goto L_0x003d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.f5114E
            if (r4 != r10) goto L_0x009a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.f5105f
            if (r11 == 0) goto L_0x009a
            boolean r11 = r11.f5102c
            if (r11 != 0) goto L_0x00a6
        L_0x009a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5116G
            if (r4 != r11) goto L_0x00a8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r10.f5105f
            if (r4 == 0) goto L_0x00a8
            boolean r4 = r4.f5102c
            if (r4 == 0) goto L_0x00a8
        L_0x00a6:
            r4 = r7
            goto L_0x00a9
        L_0x00a8:
            r4 = r8
        L_0x00a9:
            if (r4 == 0) goto L_0x003d
            boolean r4 = r9.mo8296x()
            if (r4 != 0) goto L_0x003d
            m4838d(r13, r14, r9, r15)
            goto L_0x003d
        L_0x00b5:
            boolean r10 = r9.mo8298z()
            if (r10 == 0) goto L_0x00bc
            goto L_0x003d
        L_0x00bc:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.f5114E
            if (r4 != r10) goto L_0x00d8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.f5105f
            if (r11 != 0) goto L_0x00d8
            int r4 = r10.mo8252e()
            int r4 = r4 + r2
            int r10 = r9.mo8289r()
            int r10 = r10 + r4
            r9.mo8267G(r4, r10)
            m4836b(r9, r14, r15)
            goto L_0x003d
        L_0x00d8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5116G
            if (r4 != r11) goto L_0x00f4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r10.f5105f
            if (r12 != 0) goto L_0x00f4
            int r4 = r11.mo8252e()
            int r4 = r2 - r4
            int r10 = r9.mo8289r()
            int r10 = r4 - r10
            r9.mo8267G(r10, r4)
            m4836b(r9, r14, r15)
            goto L_0x003d
        L_0x00f4:
            if (r4 != r10) goto L_0x003d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r11.f5105f
            if (r4 == 0) goto L_0x003d
            boolean r4 = r4.f5102c
            if (r4 == 0) goto L_0x003d
            boolean r4 = r9.mo8296x()
            if (r4 != 0) goto L_0x003d
            m4837c(r9, r14, r15)
            goto L_0x003d
        L_0x0109:
            boolean r0 = r13 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r0 == 0) goto L_0x010e
            return
        L_0x010e:
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5100a
            if (r0 == 0) goto L_0x01de
            boolean r1 = r1.f5102c
            if (r1 == 0) goto L_0x01de
            java.util.Iterator r0 = r0.iterator()
        L_0x011a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01de
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.f5103d
            boolean r4 = m4835a(r2)
            boolean r9 = r2.mo8298z()
            if (r9 == 0) goto L_0x013c
            if (r4 == 0) goto L_0x013c
            androidx.constraintlayout.solver.widgets.analyzer.b$a r9 = new androidx.constraintlayout.solver.widgets.analyzer.b$a
            r9.<init>()
            androidx.constraintlayout.solver.widgets.C2220d.m4876T(r2, r14, r9)
        L_0x013c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r2.f5114E
            if (r1 != r9) goto L_0x014a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r2.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.f5105f
            if (r10 == 0) goto L_0x014a
            boolean r10 = r10.f5102c
            if (r10 != 0) goto L_0x0156
        L_0x014a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r2.f5116G
            if (r1 != r10) goto L_0x0158
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.f5105f
            if (r9 == 0) goto L_0x0158
            boolean r9 = r9.f5102c
            if (r9 == 0) goto L_0x0158
        L_0x0156:
            r9 = r7
            goto L_0x0159
        L_0x0158:
            r9 = r8
        L_0x0159:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r2.f5125P
            r10 = r10[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0192
            if (r4 == 0) goto L_0x0164
            goto L_0x0192
        L_0x0164:
            if (r10 != r11) goto L_0x011a
            int r1 = r2.f5167q
            if (r1 < 0) goto L_0x011a
            int r1 = r2.f5166p
            if (r1 < 0) goto L_0x011a
            int r1 = r2.f5143d0
            if (r1 == r6) goto L_0x017c
            int r1 = r2.f5160m
            if (r1 != 0) goto L_0x011a
            float r1 = r2.f5129T
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x011a
        L_0x017c:
            boolean r1 = r2.mo8296x()
            if (r1 != 0) goto L_0x011a
            boolean r1 = r2.f5111B
            if (r1 != 0) goto L_0x011a
            if (r9 == 0) goto L_0x011a
            boolean r1 = r2.mo8296x()
            if (r1 != 0) goto L_0x011a
            m4838d(r13, r14, r2, r15)
            goto L_0x011a
        L_0x0192:
            boolean r4 = r2.mo8298z()
            if (r4 == 0) goto L_0x0199
            goto L_0x011a
        L_0x0199:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.f5114E
            if (r1 != r4) goto L_0x01b5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r2.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.f5105f
            if (r10 != 0) goto L_0x01b5
            int r1 = r4.mo8252e()
            int r1 = r1 + r3
            int r4 = r2.mo8289r()
            int r4 = r4 + r1
            r2.mo8267G(r1, r4)
            m4836b(r2, r14, r15)
            goto L_0x011a
        L_0x01b5:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r2.f5116G
            if (r1 != r10) goto L_0x01d1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r4.f5105f
            if (r1 != 0) goto L_0x01d1
            int r1 = r10.mo8252e()
            int r1 = r3 - r1
            int r4 = r2.mo8289r()
            int r4 = r1 - r4
            r2.mo8267G(r4, r1)
            m4836b(r2, r14, r15)
            goto L_0x011a
        L_0x01d1:
            if (r9 == 0) goto L_0x011a
            boolean r1 = r2.mo8296x()
            if (r1 != 0) goto L_0x011a
            m4837c(r2, r14, r15)
            goto L_0x011a
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4836b(androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.analyzer.b$b, boolean):void");
    }

    /* renamed from: c */
    public static void m4837c(ConstraintWidget constraintWidget, C2200b.C2202b bVar, boolean z) {
        float f = constraintWidget.f5137a0;
        int d = constraintWidget.f5114E.f5105f.mo8251d();
        int d2 = constraintWidget.f5116G.f5105f.mo8251d();
        int e = constraintWidget.f5114E.mo8252e() + d;
        int e2 = d2 - constraintWidget.f5116G.mo8252e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int r = constraintWidget.mo8289r();
        int i = (d2 - d) - r;
        if (d > d2) {
            i = (d - d2) - r;
        }
        int i2 = ((int) ((f * ((float) i)) + 0.5f)) + d;
        int i3 = i2 + r;
        if (d > d2) {
            i3 = i2 - r;
        }
        constraintWidget.mo8267G(i2, i3);
        m4836b(constraintWidget, bVar, z);
    }

    /* renamed from: d */
    public static void m4838d(ConstraintWidget constraintWidget, C2200b.C2202b bVar, ConstraintWidget constraintWidget2, boolean z) {
        float f = constraintWidget2.f5137a0;
        int e = constraintWidget2.f5114E.mo8252e() + constraintWidget2.f5114E.f5105f.mo8251d();
        int d = constraintWidget2.f5116G.f5105f.mo8251d() - constraintWidget2.f5116G.mo8252e();
        if (d >= e) {
            int r = constraintWidget2.mo8289r();
            if (constraintWidget2.f5143d0 != 8) {
                int i = constraintWidget2.f5160m;
                if (i == 2) {
                    r = (int) (constraintWidget2.f5137a0 * 0.5f * ((float) (constraintWidget instanceof C2220d ? constraintWidget.mo8289r() : constraintWidget.f5126Q.mo8289r())));
                } else if (i == 0) {
                    r = d - e;
                }
                r = Math.max(constraintWidget2.f5166p, r);
                int i2 = constraintWidget2.f5167q;
                if (i2 > 0) {
                    r = Math.min(i2, r);
                }
            }
            int i3 = e + ((int) ((f * ((float) ((d - e) - r))) + 0.5f));
            constraintWidget2.mo8267G(i3, r + i3);
            m4836b(constraintWidget2, bVar, z);
        }
    }

    /* renamed from: e */
    public static void m4839e(ConstraintWidget constraintWidget, C2200b.C2202b bVar) {
        float f = constraintWidget.f5139b0;
        int d = constraintWidget.f5115F.f5105f.mo8251d();
        int d2 = constraintWidget.f5117H.f5105f.mo8251d();
        int e = constraintWidget.f5115F.mo8252e() + d;
        int e2 = d2 - constraintWidget.f5117H.mo8252e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int o = constraintWidget.mo8286o();
        int i = (d2 - d) - o;
        if (d > d2) {
            i = (d - d2) - o;
        }
        int i2 = (int) ((f * ((float) i)) + 0.5f);
        int i3 = d + i2;
        int i4 = i3 + o;
        if (d > d2) {
            i3 = d - i2;
            i4 = i3 - o;
        }
        constraintWidget.mo8268H(i3, i4);
        m4841g(constraintWidget, bVar);
    }

    /* renamed from: f */
    public static void m4840f(ConstraintWidget constraintWidget, C2200b.C2202b bVar, ConstraintWidget constraintWidget2) {
        float f = constraintWidget2.f5139b0;
        int e = constraintWidget2.f5115F.mo8252e() + constraintWidget2.f5115F.f5105f.mo8251d();
        int d = constraintWidget2.f5117H.f5105f.mo8251d() - constraintWidget2.f5117H.mo8252e();
        if (d >= e) {
            int o = constraintWidget2.mo8286o();
            if (constraintWidget2.f5143d0 != 8) {
                int i = constraintWidget2.f5162n;
                if (i == 2) {
                    o = (int) (f * 0.5f * ((float) (constraintWidget instanceof C2220d ? constraintWidget.mo8286o() : constraintWidget.f5126Q.mo8286o())));
                } else if (i == 0) {
                    o = d - e;
                }
                o = Math.max(constraintWidget2.f5169s, o);
                int i2 = constraintWidget2.f5170t;
                if (i2 > 0) {
                    o = Math.min(i2, o);
                }
            }
            int i3 = e + ((int) ((f * ((float) ((d - e) - o))) + 0.5f));
            constraintWidget2.mo8268H(i3, o + i3);
            m4841g(constraintWidget2, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r11 = r9.f5117H.f5105f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        r4 = r10.f5105f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4841g(androidx.constraintlayout.solver.widgets.ConstraintWidget r13, androidx.constraintlayout.solver.widgets.analyzer.C2200b.C2202b r14) {
        /*
            boolean r0 = r13 instanceof androidx.constraintlayout.solver.widgets.C2220d
            if (r0 != 0) goto L_0x0018
            boolean r0 = r13.mo8298z()
            if (r0 == 0) goto L_0x0018
            boolean r0 = m4835a(r13)
            if (r0 == 0) goto L_0x0018
            androidx.constraintlayout.solver.widgets.analyzer.b$a r0 = new androidx.constraintlayout.solver.widgets.analyzer.b$a
            r0.<init>()
            androidx.constraintlayout.solver.widgets.C2220d.m4876T(r13, r14, r0)
        L_0x0018:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r13.mo8284m(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r13.mo8284m(r1)
            int r2 = r0.mo8251d()
            int r3 = r1.mo8251d()
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r4 = r0.f5100a
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0103
            boolean r0 = r0.f5102c
            if (r0 == 0) goto L_0x0103
            java.util.Iterator r0 = r4.iterator()
        L_0x003d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0103
            java.lang.Object r4 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r4.f5103d
            boolean r10 = m4835a(r9)
            boolean r11 = r9.mo8298z()
            if (r11 == 0) goto L_0x005f
            if (r10 == 0) goto L_0x005f
            androidx.constraintlayout.solver.widgets.analyzer.b$a r11 = new androidx.constraintlayout.solver.widgets.analyzer.b$a
            r11.<init>()
            androidx.constraintlayout.solver.widgets.C2220d.m4876T(r9, r14, r11)
        L_0x005f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r9.f5125P
            r11 = r11[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00b5
            if (r10 == 0) goto L_0x006a
            goto L_0x00b5
        L_0x006a:
            if (r11 != r12) goto L_0x003d
            int r10 = r9.f5170t
            if (r10 < 0) goto L_0x003d
            int r10 = r9.f5169s
            if (r10 < 0) goto L_0x003d
            int r10 = r9.f5143d0
            if (r10 == r6) goto L_0x0082
            int r10 = r9.f5162n
            if (r10 != 0) goto L_0x003d
            float r10 = r9.f5129T
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x003d
        L_0x0082:
            boolean r10 = r9.mo8297y()
            if (r10 != 0) goto L_0x003d
            boolean r10 = r9.f5111B
            if (r10 != 0) goto L_0x003d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.f5115F
            if (r4 != r10) goto L_0x009a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5117H
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.f5105f
            if (r11 == 0) goto L_0x009a
            boolean r11 = r11.f5102c
            if (r11 != 0) goto L_0x00a6
        L_0x009a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5117H
            if (r4 != r11) goto L_0x00a8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r10.f5105f
            if (r4 == 0) goto L_0x00a8
            boolean r4 = r4.f5102c
            if (r4 == 0) goto L_0x00a8
        L_0x00a6:
            r4 = r7
            goto L_0x00a9
        L_0x00a8:
            r4 = r8
        L_0x00a9:
            if (r4 == 0) goto L_0x003d
            boolean r4 = r9.mo8297y()
            if (r4 != 0) goto L_0x003d
            m4840f(r13, r14, r9)
            goto L_0x003d
        L_0x00b5:
            boolean r10 = r9.mo8298z()
            if (r10 == 0) goto L_0x00bc
            goto L_0x003d
        L_0x00bc:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r9.f5115F
            if (r4 != r10) goto L_0x00d8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5117H
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.f5105f
            if (r11 != 0) goto L_0x00d8
            int r4 = r10.mo8252e()
            int r4 = r4 + r2
            int r10 = r9.mo8286o()
            int r10 = r10 + r4
            r9.mo8268H(r4, r10)
            m4841g(r9, r14)
            goto L_0x003d
        L_0x00d8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r9.f5117H
            if (r4 != r11) goto L_0x00f4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r11.f5105f
            if (r12 != 0) goto L_0x00f4
            int r4 = r11.mo8252e()
            int r4 = r2 - r4
            int r10 = r9.mo8286o()
            int r10 = r4 - r10
            r9.mo8268H(r10, r4)
            m4841g(r9, r14)
            goto L_0x003d
        L_0x00f4:
            if (r4 != r10) goto L_0x003d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r11.f5105f
            if (r4 == 0) goto L_0x003d
            boolean r4 = r4.f5102c
            if (r4 == 0) goto L_0x003d
            m4839e(r9, r14)
            goto L_0x003d
        L_0x0103:
            boolean r0 = r13 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r0 == 0) goto L_0x0108
            return
        L_0x0108:
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r1.f5100a
            if (r0 == 0) goto L_0x01d8
            boolean r1 = r1.f5102c
            if (r1 == 0) goto L_0x01d8
            java.util.Iterator r0 = r0.iterator()
        L_0x0114:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d8
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.f5103d
            boolean r4 = m4835a(r2)
            boolean r9 = r2.mo8298z()
            if (r9 == 0) goto L_0x0136
            if (r4 == 0) goto L_0x0136
            androidx.constraintlayout.solver.widgets.analyzer.b$a r9 = new androidx.constraintlayout.solver.widgets.analyzer.b$a
            r9.<init>()
            androidx.constraintlayout.solver.widgets.C2220d.m4876T(r2, r14, r9)
        L_0x0136:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r2.f5115F
            if (r1 != r9) goto L_0x0144
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r2.f5117H
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.f5105f
            if (r10 == 0) goto L_0x0144
            boolean r10 = r10.f5102c
            if (r10 != 0) goto L_0x0150
        L_0x0144:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r2.f5117H
            if (r1 != r10) goto L_0x0152
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.f5105f
            if (r9 == 0) goto L_0x0152
            boolean r9 = r9.f5102c
            if (r9 == 0) goto L_0x0152
        L_0x0150:
            r9 = r7
            goto L_0x0153
        L_0x0152:
            r9 = r8
        L_0x0153:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r2.f5125P
            r10 = r10[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x018c
            if (r4 == 0) goto L_0x015e
            goto L_0x018c
        L_0x015e:
            if (r10 != r11) goto L_0x0114
            int r1 = r2.f5170t
            if (r1 < 0) goto L_0x0114
            int r1 = r2.f5169s
            if (r1 < 0) goto L_0x0114
            int r1 = r2.f5143d0
            if (r1 == r6) goto L_0x0176
            int r1 = r2.f5162n
            if (r1 != 0) goto L_0x0114
            float r1 = r2.f5129T
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0114
        L_0x0176:
            boolean r1 = r2.mo8297y()
            if (r1 != 0) goto L_0x0114
            boolean r1 = r2.f5111B
            if (r1 != 0) goto L_0x0114
            if (r9 == 0) goto L_0x0114
            boolean r1 = r2.mo8297y()
            if (r1 != 0) goto L_0x0114
            m4840f(r13, r14, r2)
            goto L_0x0114
        L_0x018c:
            boolean r4 = r2.mo8298z()
            if (r4 == 0) goto L_0x0193
            goto L_0x0114
        L_0x0193:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.f5115F
            if (r1 != r4) goto L_0x01af
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r2.f5117H
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.f5105f
            if (r10 != 0) goto L_0x01af
            int r1 = r4.mo8252e()
            int r1 = r1 + r3
            int r4 = r2.mo8286o()
            int r4 = r4 + r1
            r2.mo8268H(r1, r4)
            m4841g(r2, r14)
            goto L_0x0114
        L_0x01af:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r2.f5117H
            if (r1 != r10) goto L_0x01cb
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r4.f5105f
            if (r1 != 0) goto L_0x01cb
            int r1 = r10.mo8252e()
            int r1 = r3 - r1
            int r4 = r2.mo8286o()
            int r4 = r1 - r4
            r2.mo8268H(r4, r1)
            m4841g(r2, r14)
            goto L_0x0114
        L_0x01cb:
            if (r9 == 0) goto L_0x0114
            boolean r1 = r2.mo8297y()
            if (r1 != 0) goto L_0x0114
            m4839e(r2, r14)
            goto L_0x0114
        L_0x01d8:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r13.mo8284m(r0)
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r0 = r13.f5100a
            if (r0 == 0) goto L_0x024a
            boolean r0 = r13.f5102c
            if (r0 == 0) goto L_0x024a
            int r0 = r13.mo8251d()
            java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintAnchor> r13 = r13.f5100a
            java.util.Iterator r13 = r13.iterator()
        L_0x01f0:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x024a
            java.lang.Object r1 = r13.next()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r1.f5103d
            boolean r3 = m4835a(r2)
            boolean r4 = r2.mo8298z()
            if (r4 == 0) goto L_0x0212
            if (r3 == 0) goto L_0x0212
            androidx.constraintlayout.solver.widgets.analyzer.b$a r4 = new androidx.constraintlayout.solver.widgets.analyzer.b$a
            r4.<init>()
            androidx.constraintlayout.solver.widgets.C2220d.m4876T(r2, r14, r4)
        L_0x0212:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.f5125P
            r4 = r4[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x021c
            if (r3 == 0) goto L_0x01f0
        L_0x021c:
            boolean r3 = r2.mo8298z()
            if (r3 == 0) goto L_0x0223
            goto L_0x01f0
        L_0x0223:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r2.f5118I
            if (r1 != r3) goto L_0x01f0
            boolean r1 = r2.f5176z
            if (r1 != 0) goto L_0x022c
            goto L_0x0246
        L_0x022c:
            int r1 = r2.f5133X
            int r1 = r0 - r1
            int r3 = r2.f5128S
            int r3 = r3 + r1
            r2.f5132W = r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.f5115F
            r4.mo8259l(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.f5117H
            r1.mo8259l(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r2.f5118I
            r1.mo8259l(r0)
            r2.f5154j = r7
        L_0x0246:
            m4841g(r2, r14)
            goto L_0x01f0
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2207g.m4841g(androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.analyzer.b$b):void");
    }
}
