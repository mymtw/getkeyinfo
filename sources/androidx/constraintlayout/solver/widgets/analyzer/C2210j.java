package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C2197a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.j */
public final class C2210j extends WidgetRun {
    public C2210j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* renamed from: a */
    public final void mo8301a(C2204d dVar) {
        C2197a aVar = (C2197a) this.f5196b;
        int i = aVar.f5179r0;
        Iterator it = this.f5202h.f5194l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((DependencyNode) it.next()).f5189g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f5202h.mo8304d(i3 + aVar.f5181t0);
        } else {
            this.f5202h.mo8304d(i2 + aVar.f5181t0);
        }
    }

    /* renamed from: d */
    public final void mo8307d() {
        ConstraintWidget constraintWidget = this.f5196b;
        if (constraintWidget instanceof C2197a) {
            DependencyNode dependencyNode = this.f5202h;
            dependencyNode.f5184b = true;
            C2197a aVar = (C2197a) constraintWidget;
            int i = aVar.f5179r0;
            boolean z = aVar.f5180s0;
            int i2 = 0;
            if (i == 0) {
                dependencyNode.f5187e = DependencyNode.Type.LEFT;
                while (i2 < aVar.f16943q0) {
                    ConstraintWidget constraintWidget2 = aVar.f16942p0[i2];
                    if (z || constraintWidget2.f5143d0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.f5142d.f5202h;
                        dependencyNode2.f5193k.add(this.f5202h);
                        this.f5202h.f5194l.add(dependencyNode2);
                    }
                    i2++;
                }
                mo8328m(this.f5196b.f5142d.f5202h);
                mo8328m(this.f5196b.f5142d.f5203i);
            } else if (i == 1) {
                dependencyNode.f5187e = DependencyNode.Type.RIGHT;
                while (i2 < aVar.f16943q0) {
                    ConstraintWidget constraintWidget3 = aVar.f16942p0[i2];
                    if (z || constraintWidget3.f5143d0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.f5142d.f5203i;
                        dependencyNode3.f5193k.add(this.f5202h);
                        this.f5202h.f5194l.add(dependencyNode3);
                    }
                    i2++;
                }
                mo8328m(this.f5196b.f5142d.f5202h);
                mo8328m(this.f5196b.f5142d.f5203i);
            } else if (i == 2) {
                dependencyNode.f5187e = DependencyNode.Type.TOP;
                while (i2 < aVar.f16943q0) {
                    ConstraintWidget constraintWidget4 = aVar.f16942p0[i2];
                    if (z || constraintWidget4.f5143d0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f5144e.f5202h;
                        dependencyNode4.f5193k.add(this.f5202h);
                        this.f5202h.f5194l.add(dependencyNode4);
                    }
                    i2++;
                }
                mo8328m(this.f5196b.f5144e.f5202h);
                mo8328m(this.f5196b.f5144e.f5203i);
            } else if (i == 3) {
                dependencyNode.f5187e = DependencyNode.Type.BOTTOM;
                while (i2 < aVar.f16943q0) {
                    ConstraintWidget constraintWidget5 = aVar.f16942p0[i2];
                    if (z || constraintWidget5.f5143d0 != 8) {
                        DependencyNode dependencyNode5 = constraintWidget5.f5144e.f5203i;
                        dependencyNode5.f5193k.add(this.f5202h);
                        this.f5202h.f5194l.add(dependencyNode5);
                    }
                    i2++;
                }
                mo8328m(this.f5196b.f5144e.f5202h);
                mo8328m(this.f5196b.f5144e.f5203i);
            }
        }
    }

    /* renamed from: e */
    public final void mo8308e() {
        ConstraintWidget constraintWidget = this.f5196b;
        if (constraintWidget instanceof C2197a) {
            int i = ((C2197a) constraintWidget).f5179r0;
            if (i == 0 || i == 1) {
                constraintWidget.f5131V = this.f5202h.f5189g;
            } else {
                constraintWidget.f5132W = this.f5202h.f5189g;
            }
        }
    }

    /* renamed from: f */
    public final void mo8309f() {
        this.f5197c = null;
        this.f5202h.mo8303c();
    }

    /* renamed from: k */
    public final boolean mo8312k() {
        return false;
    }

    /* renamed from: m */
    public final void mo8328m(DependencyNode dependencyNode) {
        this.f5202h.f5193k.add(dependencyNode);
        dependencyNode.f5194l.add(this.f5202h);
    }
}
