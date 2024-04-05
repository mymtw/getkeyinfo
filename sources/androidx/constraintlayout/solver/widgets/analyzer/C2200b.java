package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.b */
public final class C2200b {

    /* renamed from: a */
    public final ArrayList<ConstraintWidget> f5206a = new ArrayList<>();

    /* renamed from: b */
    public C2201a f5207b = new C2201a();

    /* renamed from: c */
    public C2220d f5208c;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.b$a */
    public static class C2201a {

        /* renamed from: a */
        public ConstraintWidget.DimensionBehaviour f5209a;

        /* renamed from: b */
        public ConstraintWidget.DimensionBehaviour f5210b;

        /* renamed from: c */
        public int f5211c;

        /* renamed from: d */
        public int f5212d;

        /* renamed from: e */
        public int f5213e;

        /* renamed from: f */
        public int f5214f;

        /* renamed from: g */
        public int f5215g;

        /* renamed from: h */
        public boolean f5216h;

        /* renamed from: i */
        public boolean f5217i;

        /* renamed from: j */
        public int f5218j;
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.b$b */
    public interface C2202b {
    }

    public C2200b(C2220d dVar) {
        this.f5208c = dVar;
    }

    /* renamed from: a */
    public final boolean mo8314a(C2202b bVar, ConstraintWidget constraintWidget, int i) {
        C2201a aVar = this.f5207b;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f5125P;
        aVar.f5209a = dimensionBehaviourArr[0];
        boolean z = true;
        aVar.f5210b = dimensionBehaviourArr[1];
        aVar.f5211c = constraintWidget.mo8289r();
        this.f5207b.f5212d = constraintWidget.mo8286o();
        C2201a aVar2 = this.f5207b;
        aVar2.f5217i = false;
        aVar2.f5218j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar2.f5209a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = dimensionBehaviour == dimensionBehaviour2;
        boolean z3 = aVar2.f5210b == dimensionBehaviour2;
        boolean z4 = z2 && constraintWidget.f5129T > 0.0f;
        boolean z5 = z3 && constraintWidget.f5129T > 0.0f;
        if (z4 && constraintWidget.f5164o[0] == 4) {
            aVar2.f5209a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z5 && constraintWidget.f5164o[1] == 4) {
            aVar2.f5210b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ((ConstraintLayout.C2235b) bVar).mo8460b(constraintWidget, aVar2);
        constraintWidget.mo8272L(this.f5207b.f5213e);
        constraintWidget.mo8269I(this.f5207b.f5214f);
        C2201a aVar3 = this.f5207b;
        constraintWidget.f5176z = aVar3.f5216h;
        int i2 = aVar3.f5215g;
        constraintWidget.f5133X = i2;
        if (i2 <= 0) {
            z = false;
        }
        constraintWidget.f5176z = z;
        aVar3.f5218j = 0;
        return aVar3.f5217i;
    }

    /* renamed from: b */
    public final void mo8315b(C2220d dVar, int i, int i2) {
        int i3 = dVar.f5134Y;
        int i4 = dVar.f5135Z;
        dVar.f5134Y = 0;
        dVar.f5135Z = 0;
        dVar.mo8272L(i);
        dVar.mo8269I(i2);
        if (i3 < 0) {
            dVar.f5134Y = 0;
        } else {
            dVar.f5134Y = i3;
        }
        if (i4 < 0) {
            dVar.f5135Z = 0;
        } else {
            dVar.f5135Z = i4;
        }
        this.f5208c.mo8338O();
    }

    /* renamed from: c */
    public final void mo8316c(C2220d dVar) {
        this.f5206a.clear();
        int size = dVar.f16944p0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.f16944p0.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f5125P;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                this.f5206a.add(constraintWidget);
            }
        }
        dVar.f5271r0.f5222b = true;
    }
}
