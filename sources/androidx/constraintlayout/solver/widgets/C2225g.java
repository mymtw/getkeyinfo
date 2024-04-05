package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.solver.widgets.g */
public final class C2225g {

    /* renamed from: a */
    public static boolean[] f5330a = new boolean[3];

    /* renamed from: a */
    public static void m4905a(C2220d dVar, C2190c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f5156k = -1;
        constraintWidget.f5158l = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f5125P[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f5125P[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f5114E.f5106g;
            int r = dVar.mo8289r() - constraintWidget.f5116G.f5106g;
            ConstraintAnchor constraintAnchor = constraintWidget.f5114E;
            constraintAnchor.f5108i = cVar.mo8233k(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f5116G;
            constraintAnchor2.f5108i = cVar.mo8233k(constraintAnchor2);
            cVar.mo8226d(constraintWidget.f5114E.f5108i, i);
            cVar.mo8226d(constraintWidget.f5116G.f5108i, r);
            constraintWidget.f5156k = 2;
            constraintWidget.f5131V = i;
            int i2 = r - i;
            constraintWidget.f5127R = i2;
            int i3 = constraintWidget.f5134Y;
            if (i2 < i3) {
                constraintWidget.f5127R = i3;
            }
        }
        if (dVar.f5125P[1] != dimensionBehaviour2 && constraintWidget.f5125P[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i4 = constraintWidget.f5115F.f5106g;
            int o = dVar.mo8286o() - constraintWidget.f5117H.f5106g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.f5115F;
            constraintAnchor3.f5108i = cVar.mo8233k(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.f5117H;
            constraintAnchor4.f5108i = cVar.mo8233k(constraintAnchor4);
            cVar.mo8226d(constraintWidget.f5115F.f5108i, i4);
            cVar.mo8226d(constraintWidget.f5117H.f5108i, o);
            if (constraintWidget.f5133X > 0 || constraintWidget.f5143d0 == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.f5118I;
                constraintAnchor5.f5108i = cVar.mo8233k(constraintAnchor5);
                cVar.mo8226d(constraintWidget.f5118I.f5108i, constraintWidget.f5133X + i4);
            }
            constraintWidget.f5158l = 2;
            constraintWidget.f5132W = i4;
            int i5 = o - i4;
            constraintWidget.f5128S = i5;
            int i6 = constraintWidget.f5135Z;
            if (i5 < i6) {
                constraintWidget.f5128S = i6;
            }
        }
    }

    /* renamed from: b */
    public static final boolean m4906b(int i, int i2) {
        return (i & i2) == i2;
    }
}
