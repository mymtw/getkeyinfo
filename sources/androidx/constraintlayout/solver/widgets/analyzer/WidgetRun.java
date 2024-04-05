package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public abstract class WidgetRun implements C2204d {

    /* renamed from: a */
    public int f5195a;

    /* renamed from: b */
    public ConstraintWidget f5196b;

    /* renamed from: c */
    public C2213l f5197c;

    /* renamed from: d */
    public ConstraintWidget.DimensionBehaviour f5198d;

    /* renamed from: e */
    public C2206f f5199e = new C2206f(this);

    /* renamed from: f */
    public int f5200f = 0;

    /* renamed from: g */
    public boolean f5201g = false;

    /* renamed from: h */
    public DependencyNode f5202h = new DependencyNode(this);

    /* renamed from: i */
    public DependencyNode f5203i = new DependencyNode(this);

    /* renamed from: j */
    public RunType f5204j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$a */
    public static /* synthetic */ class C2198a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5205a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5205a = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.C2198a.<clinit>():void");
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f5196b = constraintWidget;
    }

    /* renamed from: b */
    public static void m4803b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f5194l.add(dependencyNode2);
        dependencyNode.f5188f = i;
        dependencyNode2.f5193k.add(dependencyNode);
    }

    /* renamed from: h */
    public static DependencyNode m4804h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f5105f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f5103d;
        int i = C2198a.f5205a[constraintAnchor2.f5104e.ordinal()];
        if (i == 1) {
            return constraintWidget.f5142d.f5202h;
        }
        if (i == 2) {
            return constraintWidget.f5142d.f5203i;
        }
        if (i == 3) {
            return constraintWidget.f5144e.f5202h;
        }
        if (i == 4) {
            return constraintWidget.f5144e.f5235k;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f5144e.f5203i;
    }

    /* renamed from: i */
    public static DependencyNode m4805i(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f5105f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f5103d;
        WidgetRun widgetRun = i == 0 ? constraintWidget.f5142d : constraintWidget.f5144e;
        int i2 = C2198a.f5205a[constraintAnchor2.f5104e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f5203i;
        }
        return widgetRun.f5202h;
    }

    /* renamed from: a */
    public void mo8301a(C2204d dVar) {
    }

    /* renamed from: c */
    public final void mo8306c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, C2206f fVar) {
        dependencyNode.f5194l.add(dependencyNode2);
        dependencyNode.f5194l.add(this.f5199e);
        dependencyNode.f5190h = i;
        dependencyNode.f5191i = fVar;
        dependencyNode2.f5193k.add(dependencyNode);
        fVar.f5193k.add(dependencyNode);
    }

    /* renamed from: d */
    public abstract void mo8307d();

    /* renamed from: e */
    public abstract void mo8308e();

    /* renamed from: f */
    public abstract void mo8309f();

    /* renamed from: g */
    public final int mo8310g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f5196b;
            int i4 = constraintWidget.f5167q;
            i3 = Math.max(constraintWidget.f5166p, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f5196b;
            int i5 = constraintWidget2.f5170t;
            int max = Math.max(constraintWidget2.f5169s, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* renamed from: j */
    public long mo8311j() {
        C2206f fVar = this.f5199e;
        if (fVar.f5192j) {
            return (long) fVar.f5189g;
        }
        return 0;
    }

    /* renamed from: k */
    public abstract boolean mo8312k();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r10.f5195a == 3) goto L_0x00b4;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8313l(androidx.constraintlayout.solver.widgets.ConstraintAnchor r13, androidx.constraintlayout.solver.widgets.ConstraintAnchor r14, int r15) {
        /*
            r12 = this;
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = m4804h(r13)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = m4804h(r14)
            boolean r2 = r0.f5192j
            if (r2 == 0) goto L_0x00f5
            boolean r2 = r1.f5192j
            if (r2 != 0) goto L_0x0012
            goto L_0x00f5
        L_0x0012:
            int r2 = r0.f5189g
            int r13 = r13.mo8252e()
            int r13 = r13 + r2
            int r2 = r1.f5189g
            int r14 = r14.mo8252e()
            int r2 = r2 - r14
            int r14 = r2 - r13
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r12.f5199e
            boolean r4 = r3.f5192j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b4
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r12.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x00b4
            int r4 = r12.f5195a
            if (r4 == 0) goto L_0x00ad
            r7 = 1
            if (r4 == r7) goto L_0x009d
            r8 = 2
            if (r4 == r8) goto L_0x0075
            r8 = 3
            if (r4 == r8) goto L_0x003f
            goto L_0x00b4
        L_0x003f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r12.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.k r9 = r4.f5142d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.f5198d
            if (r10 != r6) goto L_0x0056
            int r10 = r9.f5195a
            if (r10 != r8) goto L_0x0056
            androidx.constraintlayout.solver.widgets.analyzer.m r10 = r4.f5144e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r10.f5198d
            if (r11 != r6) goto L_0x0056
            int r6 = r10.f5195a
            if (r6 != r8) goto L_0x0056
            goto L_0x00b4
        L_0x0056:
            if (r15 != 0) goto L_0x005a
            androidx.constraintlayout.solver.widgets.analyzer.m r9 = r4.f5144e
        L_0x005a:
            androidx.constraintlayout.solver.widgets.analyzer.f r6 = r9.f5199e
            boolean r8 = r6.f5192j
            if (r8 == 0) goto L_0x00b4
            float r4 = r4.f5129T
            if (r15 != r7) goto L_0x006b
            int r6 = r6.f5189g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x0071
        L_0x006b:
            int r6 = r6.f5189g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x0071:
            r3.mo8304d(r4)
            goto L_0x00b4
        L_0x0075:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r12.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r4.f5126Q
            if (r6 == 0) goto L_0x00b4
            if (r15 != 0) goto L_0x0080
            androidx.constraintlayout.solver.widgets.analyzer.k r6 = r6.f5142d
            goto L_0x0082
        L_0x0080:
            androidx.constraintlayout.solver.widgets.analyzer.m r6 = r6.f5144e
        L_0x0082:
            androidx.constraintlayout.solver.widgets.analyzer.f r6 = r6.f5199e
            boolean r7 = r6.f5192j
            if (r7 == 0) goto L_0x00b4
            if (r15 != 0) goto L_0x008d
            float r4 = r4.f5168r
            goto L_0x008f
        L_0x008d:
            float r4 = r4.f5171u
        L_0x008f:
            int r6 = r6.f5189g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r12.mo8310g(r4, r15)
            r3.mo8304d(r4)
            goto L_0x00b4
        L_0x009d:
            int r3 = r3.f5229m
            int r3 = r12.mo8310g(r3, r15)
            androidx.constraintlayout.solver.widgets.analyzer.f r4 = r12.f5199e
            int r3 = java.lang.Math.min(r3, r14)
            r4.mo8304d(r3)
            goto L_0x00b4
        L_0x00ad:
            int r4 = r12.mo8310g(r14, r15)
            r3.mo8304d(r4)
        L_0x00b4:
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r12.f5199e
            boolean r4 = r3.f5192j
            if (r4 != 0) goto L_0x00bb
            return
        L_0x00bb:
            int r3 = r3.f5189g
            if (r3 != r14) goto L_0x00ca
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r14 = r12.f5202h
            r14.mo8304d(r13)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r12.f5203i
            r13.mo8304d(r2)
            return
        L_0x00ca:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = r12.f5196b
            if (r15 != 0) goto L_0x00d1
            float r14 = r14.f5137a0
            goto L_0x00d3
        L_0x00d1:
            float r14 = r14.f5139b0
        L_0x00d3:
            if (r0 != r1) goto L_0x00da
            int r13 = r0.f5189g
            int r2 = r1.f5189g
            r14 = r5
        L_0x00da:
            int r2 = r2 - r13
            int r2 = r2 - r3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r15 = r12.f5202h
            float r13 = (float) r13
            float r13 = r13 + r5
            float r0 = (float) r2
            float r0 = r0 * r14
            float r0 = r0 + r13
            int r13 = (int) r0
            r15.mo8304d(r13)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r13 = r12.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r14 = r12.f5202h
            int r14 = r14.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.f r15 = r12.f5199e
            int r15 = r15.f5189g
            int r14 = r14 + r15
            r13.mo8304d(r14)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.mo8313l(androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int):void");
    }
}
