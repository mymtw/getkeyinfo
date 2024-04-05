package androidx.constraintlayout.solver.widgets.analyzer;

import android.support.p013v4.media.C0072d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.m */
public final class C2214m extends WidgetRun {

    /* renamed from: k */
    public DependencyNode f5235k;

    /* renamed from: l */
    public C2199a f5236l = null;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.m$a */
    public static /* synthetic */ class C2215a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5237a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5237a = r0
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5237a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5237a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2214m.C2215a.<clinit>():void");
        }
    }

    public C2214m(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f5235k = dependencyNode;
        this.f5202h.f5187e = DependencyNode.Type.TOP;
        this.f5203i.f5187e = DependencyNode.Type.BOTTOM;
        dependencyNode.f5187e = DependencyNode.Type.BASELINE;
        this.f5200f = 1;
    }

    /* renamed from: a */
    public final void mo8301a(C2204d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        if (C2215a.f5237a[this.f5204j.ordinal()] != 3) {
            C2206f fVar = this.f5199e;
            if (fVar.f5185c && !fVar.f5192j && this.f5198d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget constraintWidget = this.f5196b;
                int i2 = constraintWidget.f5162n;
                if (i2 == 2) {
                    ConstraintWidget constraintWidget2 = constraintWidget.f5126Q;
                    if (constraintWidget2 != null) {
                        C2206f fVar2 = constraintWidget2.f5144e.f5199e;
                        if (fVar2.f5192j) {
                            fVar.mo8304d((int) ((((float) fVar2.f5189g) * constraintWidget.f5171u) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    C2206f fVar3 = constraintWidget.f5142d.f5199e;
                    if (fVar3.f5192j) {
                        int i3 = constraintWidget.f5130U;
                        if (i3 == -1) {
                            f3 = (float) fVar3.f5189g;
                            f2 = constraintWidget.f5129T;
                        } else if (i3 == 0) {
                            f = ((float) fVar3.f5189g) * constraintWidget.f5129T;
                            i = (int) (f + 0.5f);
                            fVar.mo8304d(i);
                        } else if (i3 != 1) {
                            i = 0;
                            fVar.mo8304d(i);
                        } else {
                            f3 = (float) fVar3.f5189g;
                            f2 = constraintWidget.f5129T;
                        }
                        f = f3 / f2;
                        i = (int) (f + 0.5f);
                        fVar.mo8304d(i);
                    }
                }
            }
            DependencyNode dependencyNode = this.f5202h;
            if (dependencyNode.f5185c) {
                DependencyNode dependencyNode2 = this.f5203i;
                if (dependencyNode2.f5185c) {
                    if (!dependencyNode.f5192j || !dependencyNode2.f5192j || !this.f5199e.f5192j) {
                        if (!this.f5199e.f5192j && this.f5198d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            ConstraintWidget constraintWidget3 = this.f5196b;
                            if (constraintWidget3.f5160m == 0 && !constraintWidget3.mo8297y()) {
                                int i4 = ((DependencyNode) this.f5202h.f5194l.get(0)).f5189g;
                                DependencyNode dependencyNode3 = this.f5202h;
                                int i5 = i4 + dependencyNode3.f5188f;
                                int i6 = ((DependencyNode) this.f5203i.f5194l.get(0)).f5189g + this.f5203i.f5188f;
                                dependencyNode3.mo8304d(i5);
                                this.f5203i.mo8304d(i6);
                                this.f5199e.mo8304d(i6 - i5);
                                return;
                            }
                        }
                        if (!this.f5199e.f5192j && this.f5198d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f5195a == 1 && this.f5202h.f5194l.size() > 0 && this.f5203i.f5194l.size() > 0) {
                            int i7 = (((DependencyNode) this.f5203i.f5194l.get(0)).f5189g + this.f5203i.f5188f) - (((DependencyNode) this.f5202h.f5194l.get(0)).f5189g + this.f5202h.f5188f);
                            C2206f fVar4 = this.f5199e;
                            int i8 = fVar4.f5229m;
                            if (i7 < i8) {
                                fVar4.mo8304d(i7);
                            } else {
                                fVar4.mo8304d(i8);
                            }
                        }
                        if (this.f5199e.f5192j && this.f5202h.f5194l.size() > 0 && this.f5203i.f5194l.size() > 0) {
                            DependencyNode dependencyNode4 = (DependencyNode) this.f5202h.f5194l.get(0);
                            DependencyNode dependencyNode5 = (DependencyNode) this.f5203i.f5194l.get(0);
                            int i9 = dependencyNode4.f5189g;
                            DependencyNode dependencyNode6 = this.f5202h;
                            int i10 = dependencyNode6.f5188f + i9;
                            int i11 = dependencyNode5.f5189g;
                            int i12 = this.f5203i.f5188f + i11;
                            float f4 = this.f5196b.f5139b0;
                            if (dependencyNode4 == dependencyNode5) {
                                f4 = 0.5f;
                            } else {
                                i9 = i10;
                                i11 = i12;
                            }
                            dependencyNode6.mo8304d((int) ((((float) ((i11 - i9) - this.f5199e.f5189g)) * f4) + ((float) i9) + 0.5f));
                            this.f5203i.mo8304d(this.f5202h.f5189g + this.f5199e.f5189g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ConstraintWidget constraintWidget4 = this.f5196b;
        mo8313l(constraintWidget4.f5115F, constraintWidget4.f5117H, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        r0 = r10.f5196b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8307d() {
        /*
            r10 = this;
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r1 = r0.f5136a
            if (r1 == 0) goto L_0x000f
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r10.f5199e
            int r0 = r0.mo8286o()
            r1.mo8304d(r0)
        L_0x000f:
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            boolean r0 = r0.f5192j
            r1 = 1
            if (r0 != 0) goto L_0x0090
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.f5125P
            r2 = r2[r1]
            r10.f5198d = r2
            boolean r0 = r0.f5176z
            if (r0 == 0) goto L_0x0029
            androidx.constraintlayout.solver.widgets.analyzer.a r0 = new androidx.constraintlayout.solver.widgets.analyzer.a
            r0.<init>(r10)
            r10.f5236l = r0
        L_0x0029:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r2) goto L_0x00c6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r2) goto L_0x0080
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.f5126Q
            if (r2 == 0) goto L_0x0080
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.f5125P
            r3 = r3[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r4) goto L_0x0080
            int r0 = r2.mo8286o()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.f5115F
            int r1 = r1.mo8252e()
            int r0 = r0 - r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.f5117H
            int r1 = r1.mo8252e()
            int r0 = r0 - r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.m r3 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.f5115F
            int r4 = r4.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r3, r4)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r3.f5117H
            int r3 = r3.mo8252e()
            int r3 = -r3
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r2, r3)
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r10.f5199e
            r1.mo8304d(r0)
            return
        L_0x0080:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r2) goto L_0x00c6
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            int r2 = r2.mo8286o()
            r0.mo8304d(r2)
            goto L_0x00c6
        L_0x0090:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r2) goto L_0x00c6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.f5126Q
            if (r2 == 0) goto L_0x00c6
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.f5125P
            r3 = r3[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r4) goto L_0x00c6
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.m r3 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r3.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5115F
            int r0 = r0.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r3, r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.f5117H
            int r2 = r2.mo8252e()
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            return
        L_0x00c6:
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            boolean r2 = r0.f5192j
            r3 = 0
            r4 = 4
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L_0x022d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r10.f5196b
            boolean r8 = r7.f5136a
            if (r8 == 0) goto L_0x022d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r7.f5122M
            r2 = r0[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r2.f5105f
            if (r8 == 0) goto L_0x0158
            r9 = r0[r6]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.f5105f
            if (r9 == 0) goto L_0x0158
            boolean r0 = r7.mo8297y()
            if (r0 == 0) goto L_0x0108
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.f5122M
            r1 = r1[r5]
            int r1 = r1.mo8252e()
            r0.f5188f = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r1 = r1.f5122M
            r1 = r1[r6]
            int r1 = r1.mo8252e()
            int r1 = -r1
            r0.f5188f = r1
            goto L_0x0147
        L_0x0108:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.f5122M
            r0 = r0[r5]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r0)
            if (r0 == 0) goto L_0x0123
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.f5122M
            r3 = r3[r5]
            int r3 = r3.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r2, r0, r3)
        L_0x0123:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.f5122M
            r0 = r0[r6]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r0)
            if (r0 == 0) goto L_0x013f
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.f5122M
            r3 = r3[r6]
            int r3 = r3.mo8252e()
            int r3 = -r3
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r2, r0, r3)
        L_0x013f:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5202h
            r0.f5184b = r1
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            r0.f5184b = r1
        L_0x0147:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r1 = r0.f5176z
            if (r1 == 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            int r0 = r0.f5133X
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r2, r0)
            goto L_0x0426
        L_0x0158:
            if (r8 == 0) goto L_0x018b
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r2)
            if (r0 == 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.f5122M
            r2 = r2[r5]
            int r2 = r2.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            int r2 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r1 = r0.f5176z
            if (r1 == 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            int r0 = r0.f5133X
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r2, r0)
            goto L_0x0426
        L_0x018b:
            r1 = r0[r6]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.f5105f
            if (r2 == 0) goto L_0x01c4
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r1)
            if (r0 == 0) goto L_0x01b3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.f5122M
            r2 = r2[r6]
            int r2 = r2.mo8252e()
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            int r2 = r2.f5189g
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
        L_0x01b3:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r1 = r0.f5176z
            if (r1 == 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            int r0 = r0.f5133X
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r2, r0)
            goto L_0x0426
        L_0x01c4:
            r0 = r0[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.f5105f
            if (r1 == 0) goto L_0x01ee
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r0)
            if (r0 == 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r0, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5235k
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            int r2 = r2.f5133X
            int r2 = -r2
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            int r2 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            goto L_0x0426
        L_0x01ee:
            boolean r0 = r7 instanceof p203p0.C7646a
            if (r0 != 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r7.f5126Q
            if (r0 == 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.mo8284m(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.f5105f
            if (r0 != 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.f5126Q
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            int r0 = r0.mo8291t()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r2, r1, r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            int r2 = r2.f5189g
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r0, r1, r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r1 = r0.f5176z
            if (r1 == 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            int r0 = r0.f5133X
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r1, r2, r0)
            goto L_0x0426
        L_0x022d:
            if (r2 != 0) goto L_0x029c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = r10.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r7) goto L_0x029c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            int r7 = r2.f5162n
            if (r7 == r5) goto L_0x0272
            if (r7 == r6) goto L_0x023e
            goto L_0x029f
        L_0x023e:
            boolean r0 = r2.mo8297y()
            if (r0 != 0) goto L_0x029f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            int r2 = r0.f5160m
            if (r2 != r6) goto L_0x024b
            goto L_0x029f
        L_0x024b:
            androidx.constraintlayout.solver.widgets.analyzer.k r0 = r0.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r0.f5199e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            java.util.ArrayList r2 = r2.f5194l
            r2.add(r0)
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            r0.f5184b = r1
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5203i
            r0.add(r2)
            goto L_0x029f
        L_0x0272:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.f5126Q
            if (r2 != 0) goto L_0x0277
            goto L_0x029f
        L_0x0277:
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            java.util.ArrayList r0 = r0.f5194l
            r0.add(r2)
            java.util.ArrayList r0 = r2.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            r0.f5184b = r1
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5203i
            r0.add(r2)
            goto L_0x029f
        L_0x029c:
            r0.mo8302b(r10)
        L_0x029f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r0.f5122M
            r7 = r2[r5]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r7.f5105f
            if (r8 == 0) goto L_0x0302
            r9 = r2[r6]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.f5105f
            if (r9 == 0) goto L_0x0302
            boolean r0 = r0.mo8297y()
            if (r0 == 0) goto L_0x02d3
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.f5122M
            r2 = r2[r5]
            int r2 = r2.mo8252e()
            r0.f5188f = r2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.f5122M
            r2 = r2[r6]
            int r2 = r2.mo8252e()
            int r2 = -r2
            r0.f5188f = r2
            goto L_0x02f1
        L_0x02d3:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r0 = r0.f5122M
            r0 = r0[r5]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r2 = r2.f5122M
            r2 = r2[r6]
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r2)
            r0.mo8302b(r10)
            r2.mo8302b(r10)
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.RunType.CENTER
            r10.f5204j = r0
        L_0x02f1:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r0 = r0.f5176z
            if (r0 == 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.a r3 = r10.f5236l
            r10.mo8306c(r0, r2, r1, r3)
            goto L_0x0418
        L_0x0302:
            r9 = 0
            if (r8 == 0) goto L_0x0362
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r7)
            if (r0 == 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.f5122M
            r3 = r3[r5]
            int r3 = r3.mo8252e()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r2, r0, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r10.f5199e
            r10.mo8306c(r0, r2, r1, r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r0 = r0.f5176z
            if (r0 == 0) goto L_0x0332
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.a r3 = r10.f5236l
            r10.mo8306c(r0, r2, r1, r3)
        L_0x0332:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x0418
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            float r3 = r0.f5129T
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.k r0 = r0.f5142d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r0.f5198d
            if (r3 != r2) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r0.f5199e
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            java.util.ArrayList r0 = r0.f5194l
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.k r2 = r2.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            r0.f5183a = r10
            goto L_0x0418
        L_0x0362:
            r5 = r2[r6]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r5.f5105f
            r8 = -1
            if (r7 == 0) goto L_0x0399
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r5)
            if (r0 == 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5203i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r10.f5196b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] r3 = r3.f5122M
            r3 = r3[r6]
            int r3 = r3.mo8252e()
            int r3 = -r3
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r2, r0, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r10.f5199e
            r10.mo8306c(r0, r2, r8, r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r0 = r0.f5176z
            if (r0 == 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.a r3 = r10.f5236l
            r10.mo8306c(r0, r2, r1, r3)
            goto L_0x0418
        L_0x0399:
            r2 = r2[r4]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r2.f5105f
            if (r4 == 0) goto L_0x03bd
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4804h(r2)
            if (r0 == 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r2, r0, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.a r3 = r10.f5236l
            r10.mo8306c(r0, r2, r8, r3)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r10.f5199e
            r10.mo8306c(r0, r2, r1, r3)
            goto L_0x0418
        L_0x03bd:
            boolean r2 = r0 instanceof p203p0.C7646a
            if (r2 != 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.f5126Q
            if (r2 == 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.m r2 = r2.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r2.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r3 = r10.f5202h
            int r0 = r0.mo8291t()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.m4803b(r3, r2, r0)
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5203i
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.f r3 = r10.f5199e
            r10.mo8306c(r0, r2, r1, r3)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            boolean r0 = r0.f5176z
            if (r0 == 0) goto L_0x03ea
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r10.f5235k
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r2 = r10.f5202h
            androidx.constraintlayout.solver.widgets.analyzer.a r3 = r10.f5236l
            r10.mo8306c(r0, r2, r1, r3)
        L_0x03ea:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.f5198d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x0418
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r10.f5196b
            float r3 = r0.f5129T
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.k r0 = r0.f5142d
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r0.f5198d
            if (r3 != r2) goto L_0x0418
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r0.f5199e
            java.util.ArrayList r0 = r0.f5193k
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r10.f5199e
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            java.util.ArrayList r0 = r0.f5194l
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r10.f5196b
            androidx.constraintlayout.solver.widgets.analyzer.k r2 = r2.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r2 = r2.f5199e
            r0.add(r2)
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            r0.f5183a = r10
        L_0x0418:
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            java.util.ArrayList r0 = r0.f5194l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0426
            androidx.constraintlayout.solver.widgets.analyzer.f r0 = r10.f5199e
            r0.f5185c = r1
        L_0x0426:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2214m.mo8307d():void");
    }

    /* renamed from: e */
    public final void mo8308e() {
        DependencyNode dependencyNode = this.f5202h;
        if (dependencyNode.f5192j) {
            this.f5196b.f5132W = dependencyNode.f5189g;
        }
    }

    /* renamed from: f */
    public final void mo8309f() {
        this.f5197c = null;
        this.f5202h.mo8303c();
        this.f5203i.mo8303c();
        this.f5235k.mo8303c();
        this.f5199e.mo8303c();
        this.f5201g = false;
    }

    /* renamed from: k */
    public final boolean mo8312k() {
        return this.f5198d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f5196b.f5162n == 0;
    }

    /* renamed from: m */
    public final void mo8331m() {
        this.f5201g = false;
        this.f5202h.mo8303c();
        this.f5202h.f5192j = false;
        this.f5203i.mo8303c();
        this.f5203i.f5192j = false;
        this.f5235k.mo8303c();
        this.f5235k.f5192j = false;
        this.f5199e.f5192j = false;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VerticalRun ");
        h.append(this.f5196b.f5145e0);
        return h.toString();
    }
}
