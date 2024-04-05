package androidx.constraintlayout.solver.widgets.analyzer;

import android.support.p013v4.media.C0072d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.k */
public final class C2211k extends WidgetRun {

    /* renamed from: k */
    public static int[] f5231k = new int[2];

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.k$a */
    public static /* synthetic */ class C2212a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5232a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5232a = r0
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5232a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5232a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2211k.C2212a.<clinit>():void");
        }
    }

    public C2211k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f5202h.f5187e = DependencyNode.Type.LEFT;
        this.f5203i.f5187e = DependencyNode.Type.RIGHT;
        this.f5200f = 0;
    }

    /* renamed from: m */
    public static void m4856m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0277, code lost:
        if (r12 != 1) goto L_0x02d6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8301a(androidx.constraintlayout.solver.widgets.analyzer.C2204d r20) {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = androidx.constraintlayout.solver.widgets.analyzer.C2211k.C2212a.f5232a
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r2 = r0.f5204j
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L_0x03f2
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            boolean r4 = r1.f5192j
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            if (r4 != 0) goto L_0x02d6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r0.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r7) goto L_0x02d6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.f5196b
            int r7 = r4.f5160m
            r8 = 2
            if (r7 == r8) goto L_0x02bf
            if (r7 == r2) goto L_0x002a
            goto L_0x02d6
        L_0x002a:
            int r7 = r4.f5162n
            r8 = -1
            if (r7 == 0) goto L_0x0062
            if (r7 != r2) goto L_0x0032
            goto L_0x0062
        L_0x0032:
            int r2 = r4.f5130U
            if (r2 == r8) goto L_0x0051
            if (r2 == 0) goto L_0x0046
            if (r2 == r6) goto L_0x003c
            r2 = r3
            goto L_0x005d
        L_0x003c:
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r4.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            int r2 = r2.f5189g
            float r2 = (float) r2
            float r4 = r4.f5129T
            goto L_0x005a
        L_0x0046:
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r4.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            int r2 = r2.f5189g
            float r2 = (float) r2
            float r4 = r4.f5129T
            float r2 = r2 / r4
            goto L_0x005b
        L_0x0051:
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r4.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            int r2 = r2.f5189g
            float r2 = (float) r2
            float r4 = r4.f5129T
        L_0x005a:
            float r2 = r2 * r4
        L_0x005b:
            float r2 = r2 + r5
            int r2 = (int) r2
        L_0x005d:
            r1.mo8304d(r2)
            goto L_0x02d6
        L_0x0062:
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r4.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r1.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r4.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.f5105f
            if (r7 == 0) goto L_0x0070
            r7 = r6
            goto L_0x0071
        L_0x0070:
            r7 = r3
        L_0x0071:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r4.f5115F
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.f5105f
            if (r9 == 0) goto L_0x0079
            r9 = r6
            goto L_0x007a
        L_0x0079:
            r9 = r3
        L_0x007a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r4.f5116G
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r10.f5105f
            if (r10 == 0) goto L_0x0082
            r10 = r6
            goto L_0x0083
        L_0x0082:
            r10 = r3
        L_0x0083:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r4.f5117H
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r11.f5105f
            if (r11 == 0) goto L_0x008b
            r11 = r6
            goto L_0x008c
        L_0x008b:
            r11 = r3
        L_0x008c:
            int r15 = r4.f5130U
            if (r7 == 0) goto L_0x01c7
            if (r9 == 0) goto L_0x01c7
            if (r10 == 0) goto L_0x01c7
            if (r11 == 0) goto L_0x01c7
            float r4 = r4.f5129T
            boolean r7 = r2.f5192j
            if (r7 == 0) goto L_0x00f9
            boolean r7 = r1.f5192j
            if (r7 == 0) goto L_0x00f9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r0.f5202h
            boolean r7 = r5.f5185c
            if (r7 == 0) goto L_0x00f8
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.f5203i
            boolean r7 = r7.f5185c
            if (r7 != 0) goto L_0x00ad
            goto L_0x00f8
        L_0x00ad:
            java.util.ArrayList r5 = r5.f5194l
            java.lang.Object r5 = r5.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r5
            int r5 = r5.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.f5202h
            int r7 = r7.f5188f
            int r13 = r5 + r7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r0.f5203i
            java.util.ArrayList r5 = r5.f5194l
            java.lang.Object r5 = r5.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r5
            int r5 = r5.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.f5203i
            int r7 = r7.f5188f
            int r14 = r5 - r7
            int r5 = r2.f5189g
            int r2 = r2.f5188f
            int r2 = r2 + r5
            int r5 = r1.f5189g
            int r1 = r1.f5188f
            int r16 = r5 - r1
            int[] r1 = f5231k
            r12 = r1
            r7 = r15
            r15 = r2
            r17 = r4
            r18 = r7
            m4856m(r12, r13, r14, r15, r16, r17, r18)
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r0.f5199e
            r3 = r1[r3]
            r2.mo8304d(r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            r1 = r1[r6]
            r2.mo8304d(r1)
        L_0x00f8:
            return
        L_0x00f9:
            r7 = r15
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = r0.f5202h
            boolean r9 = r8.f5192j
            if (r9 == 0) goto L_0x0155
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r0.f5203i
            boolean r10 = r9.f5192j
            if (r10 == 0) goto L_0x0155
            boolean r10 = r2.f5185c
            if (r10 == 0) goto L_0x0154
            boolean r10 = r1.f5185c
            if (r10 != 0) goto L_0x010f
            goto L_0x0154
        L_0x010f:
            int r10 = r8.f5189g
            int r8 = r8.f5188f
            int r13 = r10 + r8
            int r8 = r9.f5189g
            int r9 = r9.f5188f
            int r14 = r8 - r9
            java.util.ArrayList r8 = r2.f5194l
            java.lang.Object r8 = r8.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f5189g
            int r9 = r2.f5188f
            int r15 = r8 + r9
            java.util.ArrayList r8 = r1.f5194l
            java.lang.Object r8 = r8.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f5189g
            int r9 = r1.f5188f
            int r16 = r8 - r9
            int[] r8 = f5231k
            r12 = r8
            r17 = r4
            r18 = r7
            m4856m(r12, r13, r14, r15, r16, r17, r18)
            androidx.constraintlayout.solver.widgets.analyzer.f r9 = r0.f5199e
            r10 = r8[r3]
            r9.mo8304d(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r9 = r9.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r9 = r9.f5199e
            r8 = r8[r6]
            r9.mo8304d(r8)
            goto L_0x0155
        L_0x0154:
            return
        L_0x0155:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = r0.f5202h
            boolean r9 = r8.f5185c
            if (r9 == 0) goto L_0x01c6
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r0.f5203i
            boolean r9 = r9.f5185c
            if (r9 == 0) goto L_0x01c6
            boolean r9 = r2.f5185c
            if (r9 == 0) goto L_0x01c6
            boolean r9 = r1.f5185c
            if (r9 != 0) goto L_0x016a
            goto L_0x01c6
        L_0x016a:
            java.util.ArrayList r8 = r8.f5194l
            java.lang.Object r8 = r8.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r0.f5202h
            int r9 = r9.f5188f
            int r13 = r8 + r9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = r0.f5203i
            java.util.ArrayList r8 = r8.f5194l
            java.lang.Object r8 = r8.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r9 = r0.f5203i
            int r9 = r9.f5188f
            int r14 = r8 - r9
            java.util.ArrayList r8 = r2.f5194l
            java.lang.Object r8 = r8.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f5189g
            int r2 = r2.f5188f
            int r15 = r8 + r2
            java.util.ArrayList r2 = r1.f5194l
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f5189g
            int r1 = r1.f5188f
            int r16 = r2 - r1
            int[] r1 = f5231k
            r12 = r1
            r17 = r4
            r18 = r7
            m4856m(r12, r13, r14, r15, r16, r17, r18)
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r0.f5199e
            r4 = r1[r3]
            r2.mo8304d(r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            r1 = r1[r6]
            r2.mo8304d(r1)
            goto L_0x02d6
        L_0x01c6:
            return
        L_0x01c7:
            r12 = r15
            if (r7 == 0) goto L_0x024a
            if (r10 == 0) goto L_0x024a
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            boolean r2 = r1.f5185c
            if (r2 == 0) goto L_0x0249
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.f5203i
            boolean r2 = r2.f5185c
            if (r2 != 0) goto L_0x01d9
            goto L_0x0249
        L_0x01d9:
            float r2 = r4.f5129T
            java.util.ArrayList r1 = r1.f5194l
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.f5202h
            int r4 = r4.f5188f
            int r1 = r1 + r4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.f5203i
            java.util.ArrayList r4 = r4.f5194l
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r4
            int r4 = r4.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r0.f5203i
            int r7 = r7.f5188f
            int r4 = r4 - r7
            if (r12 == r8) goto L_0x0226
            if (r12 == 0) goto L_0x0226
            if (r12 == r6) goto L_0x0203
            goto L_0x02d6
        L_0x0203:
            int r4 = r4 - r1
            int r1 = r0.mo8310g(r4, r3)
            float r4 = (float) r1
            float r4 = r4 / r2
            float r4 = r4 + r5
            int r4 = (int) r4
            int r7 = r0.mo8310g(r4, r6)
            if (r4 == r7) goto L_0x0216
            float r1 = (float) r7
            float r1 = r1 * r2
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x0216:
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r0.f5199e
            r2.mo8304d(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r1.f5199e
            r1.mo8304d(r7)
            goto L_0x02d6
        L_0x0226:
            int r4 = r4 - r1
            int r1 = r0.mo8310g(r4, r3)
            float r4 = (float) r1
            float r4 = r4 * r2
            float r4 = r4 + r5
            int r4 = (int) r4
            int r7 = r0.mo8310g(r4, r6)
            if (r4 == r7) goto L_0x0239
            float r1 = (float) r7
            float r1 = r1 / r2
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x0239:
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r0.f5199e
            r2.mo8304d(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r1.f5199e
            r1.mo8304d(r7)
            goto L_0x02d6
        L_0x0249:
            return
        L_0x024a:
            if (r9 == 0) goto L_0x02d6
            if (r11 == 0) goto L_0x02d6
            boolean r7 = r2.f5185c
            if (r7 == 0) goto L_0x02be
            boolean r7 = r1.f5185c
            if (r7 != 0) goto L_0x0257
            goto L_0x02be
        L_0x0257:
            float r4 = r4.f5129T
            java.util.ArrayList r7 = r2.f5194l
            java.lang.Object r7 = r7.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r7
            int r7 = r7.f5189g
            int r2 = r2.f5188f
            int r7 = r7 + r2
            java.util.ArrayList r2 = r1.f5194l
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f5189g
            int r1 = r1.f5188f
            int r2 = r2 - r1
            if (r12 == r8) goto L_0x029c
            if (r12 == 0) goto L_0x027a
            if (r12 == r6) goto L_0x029c
            goto L_0x02d6
        L_0x027a:
            int r2 = r2 - r7
            int r1 = r0.mo8310g(r2, r6)
            float r2 = (float) r1
            float r2 = r2 * r4
            float r2 = r2 + r5
            int r2 = (int) r2
            int r7 = r0.mo8310g(r2, r3)
            if (r2 == r7) goto L_0x028d
            float r1 = (float) r7
            float r1 = r1 / r4
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x028d:
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r0.f5199e
            r2.mo8304d(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            r2.mo8304d(r1)
            goto L_0x02d6
        L_0x029c:
            int r2 = r2 - r7
            int r1 = r0.mo8310g(r2, r6)
            float r2 = (float) r1
            float r2 = r2 / r4
            float r2 = r2 + r5
            int r2 = (int) r2
            int r7 = r0.mo8310g(r2, r3)
            if (r2 == r7) goto L_0x02af
            float r1 = (float) r7
            float r1 = r1 * r4
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x02af:
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r0.f5199e
            r2.mo8304d(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            r2.mo8304d(r1)
            goto L_0x02d6
        L_0x02be:
            return
        L_0x02bf:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r4.f5126Q
            if (r2 == 0) goto L_0x02d6
            androidx.constraintlayout.solver.widgets.analyzer.k r2 = r2.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            boolean r7 = r2.f5192j
            if (r7 == 0) goto L_0x02d6
            float r4 = r4.f5168r
            int r2 = r2.f5189g
            float r2 = (float) r2
            float r2 = r2 * r4
            float r2 = r2 + r5
            int r2 = (int) r2
            r1.mo8304d(r2)
        L_0x02d6:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            boolean r2 = r1.f5185c
            if (r2 == 0) goto L_0x03f1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.f5203i
            boolean r4 = r2.f5185c
            if (r4 != 0) goto L_0x02e4
            goto L_0x03f1
        L_0x02e4:
            boolean r1 = r1.f5192j
            if (r1 == 0) goto L_0x02f3
            boolean r1 = r2.f5192j
            if (r1 == 0) goto L_0x02f3
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            boolean r1 = r1.f5192j
            if (r1 == 0) goto L_0x02f3
            return
        L_0x02f3:
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            boolean r1 = r1.f5192j
            if (r1 != 0) goto L_0x033d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x033d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5196b
            int r2 = r1.f5160m
            if (r2 != 0) goto L_0x033d
            boolean r1 = r1.mo8296x()
            if (r1 != 0) goto L_0x033d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            java.util.ArrayList r1 = r1.f5194l
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.f5203i
            java.util.ArrayList r2 = r2.f5194l
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r1 = r1.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r0.f5202h
            int r4 = r3.f5188f
            int r1 = r1 + r4
            int r2 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.f5203i
            int r4 = r4.f5188f
            int r2 = r2 + r4
            int r4 = r2 - r1
            r3.mo8304d(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5203i
            r1.mo8304d(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            r1.mo8304d(r4)
            return
        L_0x033d:
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            boolean r1 = r1.f5192j
            if (r1 != 0) goto L_0x03a1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x03a1
            int r1 = r0.f5195a
            if (r1 != r6) goto L_0x03a1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            java.util.ArrayList r1 = r1.f5194l
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03a1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5203i
            java.util.ArrayList r1 = r1.f5194l
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03a1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            java.util.ArrayList r1 = r1.f5194l
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.f5203i
            java.util.ArrayList r2 = r2.f5194l
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r1 = r1.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.f5202h
            int r4 = r4.f5188f
            int r1 = r1 + r4
            int r2 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.f5203i
            int r4 = r4.f5188f
            int r2 = r2 + r4
            int r2 = r2 - r1
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            int r1 = r1.f5229m
            int r1 = java.lang.Math.min(r2, r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.f5196b
            int r4 = r2.f5167q
            int r2 = r2.f5166p
            int r1 = java.lang.Math.max(r2, r1)
            if (r4 <= 0) goto L_0x039c
            int r1 = java.lang.Math.min(r4, r1)
        L_0x039c:
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r0.f5199e
            r2.mo8304d(r1)
        L_0x03a1:
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            boolean r1 = r1.f5192j
            if (r1 != 0) goto L_0x03a8
            return
        L_0x03a8:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5202h
            java.util.ArrayList r1 = r1.f5194l
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.f5203i
            java.util.ArrayList r2 = r2.f5194l
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) r2
            int r3 = r1.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r0.f5202h
            int r6 = r4.f5188f
            int r6 = r6 + r3
            int r7 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r8 = r0.f5203i
            int r8 = r8.f5188f
            int r8 = r8 + r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r0.f5196b
            float r9 = r9.f5137a0
            if (r1 != r2) goto L_0x03d2
            r9 = r5
            goto L_0x03d4
        L_0x03d2:
            r3 = r6
            r7 = r8
        L_0x03d4:
            int r7 = r7 - r3
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            int r1 = r1.f5189g
            int r7 = r7 - r1
            float r1 = (float) r3
            float r1 = r1 + r5
            float r2 = (float) r7
            float r2 = r2 * r9
            float r2 = r2 + r1
            int r1 = (int) r2
            r4.mo8304d(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r0.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r0.f5202h
            int r2 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r0.f5199e
            int r3 = r3.f5189g
            int r2 = r2 + r3
            r1.mo8304d(r2)
        L_0x03f1:
            return
        L_0x03f2:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.f5114E
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.f5116G
            r0.mo8313l(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2211k.mo8301a(androidx.constraintlayout.solver.widgets.analyzer.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        r0 = r8.f5196b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8307d() {
        /*
            r8 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            boolean r1 = r0.f5136a
            if (r1 == 0) goto L_0x000f
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            int r0 = r0.mo8289r()
            r1.mo8304d(r0)
        L_0x000f:
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            boolean r1 = r0.f5192j
            r2 = 0
            if (r1 != 0) goto L_0x0083
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r1.f5125P
            r3 = r3[r2]
            r8.f5198d = r3
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r4) goto L_0x00bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r3 != r4) goto L_0x0077
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r1.f5126Q
            if (r5 == 0) goto L_0x0032
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r5.f5125P
            r6 = r6[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x0038
        L_0x0032:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r5.f5125P
            r6 = r6[r2]
            if (r6 != r4) goto L_0x0077
        L_0x0038:
            int r0 = r5.mo8289r()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.f5114E
            int r1 = r1.mo8252e()
            int r0 = r0 - r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.f5116G
            int r1 = r1.mo8252e()
            int r0 = r0 - r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.k r2 = r5.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5114E
            int r3 = r3.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r2, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.k r2 = r5.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5116G
            int r3 = r3.mo8252e()
            int r3 = -r3
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r2, r3)
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r1.mo8304d(r0)
            return
        L_0x0077:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r4) goto L_0x00bf
            int r1 = r1.mo8289r()
            r0.mo8304d(r1)
            goto L_0x00bf
        L_0x0083:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L_0x00bf
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.f5126Q
            if (r3 == 0) goto L_0x0097
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r3.f5125P
            r4 = r4[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r5) goto L_0x009d
        L_0x0097:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r3.f5125P
            r4 = r4[r2]
            if (r4 != r1) goto L_0x00bf
        L_0x009d:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.k r2 = r3.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5114E
            int r0 = r0.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r2, r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.k r1 = r3.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5116G
            int r2 = r2.mo8252e()
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            return
        L_0x00bf:
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            boolean r1 = r0.f5192j
            r3 = 1
            if (r1 == 0) goto L_0x01be
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            boolean r4 = r1.f5136a
            if (r4 == 0) goto L_0x01be
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r1.f5122M
            r4 = r0[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r4.f5105f
            if (r5 == 0) goto L_0x0140
            r6 = r0[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.f5105f
            if (r6 == 0) goto L_0x0140
            boolean r0 = r1.mo8296x()
            if (r0 == 0) goto L_0x00ff
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.f5122M
            r1 = r1[r2]
            int r1 = r1.mo8252e()
            r0.f5188f = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.f5122M
            r1 = r1[r3]
            int r1 = r1.mo8252e()
            int r1 = -r1
            r0.f5188f = r1
            goto L_0x03a9
        L_0x00ff:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.f5122M
            r0 = r0[r2]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r0)
            if (r0 == 0) goto L_0x011a
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r4.f5122M
            r2 = r4[r2]
            int r2 = r2.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r2)
        L_0x011a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.f5122M
            r0 = r0[r3]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r0)
            if (r0 == 0) goto L_0x0136
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.f5122M
            r2 = r2[r3]
            int r2 = r2.mo8252e()
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r2)
        L_0x0136:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5202h
            r0.f5184b = r3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            r0.f5184b = r3
            goto L_0x03a9
        L_0x0140:
            if (r5 == 0) goto L_0x0164
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r4)
            if (r0 == 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.f5122M
            r2 = r3[r2]
            int r2 = r2.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r8.f5199e
            int r2 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            goto L_0x03a9
        L_0x0164:
            r0 = r0[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.f5105f
            if (r2 == 0) goto L_0x018e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r0)
            if (r0 == 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.f5122M
            r2 = r2[r3]
            int r2 = r2.mo8252e()
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r8.f5199e
            int r2 = r2.f5189g
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            goto L_0x03a9
        L_0x018e:
            boolean r0 = r1 instanceof p203p0.C7646a
            if (r0 != 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r1.f5126Q
            if (r0 == 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r1.mo8284m(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5105f
            if (r0 != 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5126Q
            androidx.constraintlayout.solver.widgets.analyzer.k r1 = r1.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r8.f5202h
            int r0 = r0.mo8290s()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r2, r1, r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r8.f5199e
            int r2 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            goto L_0x03a9
        L_0x01be:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = r8.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r4) goto L_0x02ef
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            int r4 = r1.f5160m
            r5 = 2
            if (r4 == r5) goto L_0x02c6
            r5 = 3
            if (r4 == r5) goto L_0x01d0
            goto L_0x02ef
        L_0x01d0:
            int r4 = r1.f5162n
            if (r4 != r5) goto L_0x0275
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r8.f5202h
            r4.f5183a = r8
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r8.f5203i
            r4.f5183a = r8
            androidx.constraintlayout.solver.widgets.analyzer.m r4 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r4.f5202h
            r5.f5183a = r8
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r4 = r4.f5203i
            r4.f5183a = r8
            r0.f5183a = r8
            boolean r0 = r1.mo8297y()
            if (r0 == 0) goto L_0x0242
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            java.util.ArrayList r0 = r0.f5194l
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r1.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r0.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r0.f5199e
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r0.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r0.f5199e
            r1.f5183a = r8
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            java.util.ArrayList r1 = r1.f5194l
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5202h
            r1.add(r0)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            java.util.ArrayList r0 = r0.f5194l
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.f5203i
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r0.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5202h
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r0.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            goto L_0x02ef
        L_0x0242:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            boolean r0 = r0.mo8296x()
            if (r0 == 0) goto L_0x0266
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r0.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r0.f5199e
            java.util.ArrayList r0 = r0.f5194l
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r1.f5199e
            r0.add(r1)
            goto L_0x02ef
        L_0x0266:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r0.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r0.f5199e
            java.util.ArrayList r0 = r0.f5194l
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            goto L_0x02ef
        L_0x0275:
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r1.f5199e
            java.util.ArrayList r0 = r0.f5194l
            r0.add(r1)
            java.util.ArrayList r0 = r1.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r0.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5202h
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.m r0 = r0.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.f5203i
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            r0.f5184b = r3
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5203i
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5202h
            java.util.ArrayList r0 = r0.f5194l
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            java.util.ArrayList r0 = r0.f5194l
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            goto L_0x02ef
        L_0x02c6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.f5126Q
            if (r1 != 0) goto L_0x02cb
            goto L_0x02ef
        L_0x02cb:
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r1.f5199e
            java.util.ArrayList r0 = r0.f5194l
            r0.add(r1)
            java.util.ArrayList r0 = r1.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r8.f5199e
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            r0.f5184b = r3
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            r0.add(r1)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r8.f5199e
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5203i
            r0.add(r1)
        L_0x02ef:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r0.f5122M
            r4 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r4.f5105f
            if (r5 == 0) goto L_0x0343
            r6 = r1[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.f5105f
            if (r6 == 0) goto L_0x0343
            boolean r0 = r0.mo8296x()
            if (r0 == 0) goto L_0x0324
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.f5122M
            r1 = r1[r2]
            int r1 = r1.mo8252e()
            r0.f5188f = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.f5122M
            r1 = r1[r3]
            int r1 = r1.mo8252e()
            int r1 = -r1
            r0.f5188f = r1
            goto L_0x03a9
        L_0x0324:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.f5122M
            r0 = r0[r2]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.f5122M
            r1 = r1[r3]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r1)
            r0.mo8302b(r8)
            r1.mo8302b(r8)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER
            r8.f5204j = r0
            goto L_0x03a9
        L_0x0343:
            if (r5 == 0) goto L_0x0364
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r4)
            if (r0 == 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r4 = r4.f5122M
            r2 = r4[r2]
            int r2 = r2.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r8.f5199e
            r8.mo8306c(r0, r1, r3, r2)
            goto L_0x03a9
        L_0x0364:
            r1 = r1[r3]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.f5105f
            if (r2 == 0) goto L_0x038b
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r1)
            if (r0 == 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r8.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.f5122M
            r2 = r2[r3]
            int r2 = r2.mo8252e()
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5203i
            r2 = -1
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r8.f5199e
            r8.mo8306c(r0, r1, r2, r3)
            goto L_0x03a9
        L_0x038b:
            boolean r1 = r0 instanceof p203p0.C7646a
            if (r1 != 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5126Q
            if (r1 == 0) goto L_0x03a9
            androidx.constraintlayout.solver.widgets.analyzer.k r1 = r1.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r8.f5202h
            int r0 = r0.mo8290s()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r2, r1, r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r8.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r8.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r8.f5199e
            r8.mo8306c(r0, r1, r3, r2)
        L_0x03a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2211k.mo8307d():void");
    }

    /* renamed from: e */
    public final void mo8308e() {
        DependencyNode dependencyNode = this.f5202h;
        if (dependencyNode.f5192j) {
            this.f5196b.f5131V = dependencyNode.f5189g;
        }
    }

    /* renamed from: f */
    public final void mo8309f() {
        this.f5197c = null;
        this.f5202h.mo8303c();
        this.f5203i.mo8303c();
        this.f5199e.mo8303c();
        this.f5201g = false;
    }

    /* renamed from: k */
    public final boolean mo8312k() {
        return this.f5198d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f5196b.f5160m == 0;
    }

    /* renamed from: n */
    public final void mo8329n() {
        this.f5201g = false;
        this.f5202h.mo8303c();
        this.f5202h.f5192j = false;
        this.f5203i.mo8303c();
        this.f5203i.f5192j = false;
        this.f5199e.f5192j = false;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HorizontalRun ");
        h.append(this.f5196b.f5145e0);
        return h.toString();
    }
}
