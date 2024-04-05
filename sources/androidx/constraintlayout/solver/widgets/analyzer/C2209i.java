package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C2223f;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.i */
public final class C2209i extends WidgetRun {
    public C2209i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f5142d.mo8309f();
        constraintWidget.f5144e.mo8309f();
        this.f5200f = ((C2223f) constraintWidget).f5327t0;
    }

    /* renamed from: a */
    public final void mo8301a(C2204d dVar) {
        DependencyNode dependencyNode = this.f5202h;
        if (dependencyNode.f5185c && !dependencyNode.f5192j) {
            this.f5202h.mo8304d((int) ((((float) ((DependencyNode) dependencyNode.f5194l.get(0)).f5189g) * ((C2223f) this.f5196b).f5323p0) + 0.5f));
        }
    }

    /* renamed from: d */
    public final void mo8307d() {
        ConstraintWidget constraintWidget = this.f5196b;
        C2223f fVar = (C2223f) constraintWidget;
        int i = fVar.f5324q0;
        int i2 = fVar.f5325r0;
        if (fVar.f5327t0 == 1) {
            if (i != -1) {
                this.f5202h.f5194l.add(constraintWidget.f5126Q.f5142d.f5202h);
                this.f5196b.f5126Q.f5142d.f5202h.f5193k.add(this.f5202h);
                this.f5202h.f5188f = i;
            } else if (i2 != -1) {
                this.f5202h.f5194l.add(constraintWidget.f5126Q.f5142d.f5203i);
                this.f5196b.f5126Q.f5142d.f5203i.f5193k.add(this.f5202h);
                this.f5202h.f5188f = -i2;
            } else {
                DependencyNode dependencyNode = this.f5202h;
                dependencyNode.f5184b = true;
                dependencyNode.f5194l.add(constraintWidget.f5126Q.f5142d.f5203i);
                this.f5196b.f5126Q.f5142d.f5203i.f5193k.add(this.f5202h);
            }
            mo8327m(this.f5196b.f5142d.f5202h);
            mo8327m(this.f5196b.f5142d.f5203i);
            return;
        }
        if (i != -1) {
            this.f5202h.f5194l.add(constraintWidget.f5126Q.f5144e.f5202h);
            this.f5196b.f5126Q.f5144e.f5202h.f5193k.add(this.f5202h);
            this.f5202h.f5188f = i;
        } else if (i2 != -1) {
            this.f5202h.f5194l.add(constraintWidget.f5126Q.f5144e.f5203i);
            this.f5196b.f5126Q.f5144e.f5203i.f5193k.add(this.f5202h);
            this.f5202h.f5188f = -i2;
        } else {
            DependencyNode dependencyNode2 = this.f5202h;
            dependencyNode2.f5184b = true;
            dependencyNode2.f5194l.add(constraintWidget.f5126Q.f5144e.f5203i);
            this.f5196b.f5126Q.f5144e.f5203i.f5193k.add(this.f5202h);
        }
        mo8327m(this.f5196b.f5144e.f5202h);
        mo8327m(this.f5196b.f5144e.f5203i);
    }

    /* renamed from: e */
    public final void mo8308e() {
        ConstraintWidget constraintWidget = this.f5196b;
        if (((C2223f) constraintWidget).f5327t0 == 1) {
            constraintWidget.f5131V = this.f5202h.f5189g;
        } else {
            constraintWidget.f5132W = this.f5202h.f5189g;
        }
    }

    /* renamed from: f */
    public final void mo8309f() {
        this.f5202h.mo8303c();
    }

    /* renamed from: k */
    public final boolean mo8312k() {
        return false;
    }

    /* renamed from: m */
    public final void mo8327m(DependencyNode dependencyNode) {
        this.f5202h.f5193k.add(dependencyNode);
        dependencyNode.f5194l.add(this.f5202h);
    }
}
