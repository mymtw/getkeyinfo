package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C2223f;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import p203p0.C7647b;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.h */
public final class C2208h {
    /* renamed from: a */
    public static C2216n m4842a(ConstraintWidget constraintWidget, int i, ArrayList<C2216n> arrayList, C2216n nVar) {
        int i2;
        int i3 = i == 0 ? constraintWidget.f5163n0 : constraintWidget.f5165o0;
        int i4 = 0;
        if (i3 != -1 && (nVar == null || i3 != nVar.f5240b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C2216n nVar2 = arrayList.get(i5);
                if (nVar2.f5240b == i3) {
                    if (nVar != null) {
                        nVar.mo8336d(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (constraintWidget instanceof C7647b) {
                C7647b bVar = (C7647b) constraintWidget;
                int i6 = 0;
                while (true) {
                    if (i6 >= bVar.f16943q0) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = bVar.f16942p0[i6];
                    if ((i == 0 && (i2 = constraintWidget2.f5163n0) != -1) || (i == 1 && (i2 = constraintWidget2.f5165o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i2 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C2216n nVar3 = arrayList.get(i7);
                        if (nVar3.f5240b == i2) {
                            nVar = nVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new C2216n(i);
            }
            arrayList.add(nVar);
        }
        if (nVar.mo8333a(constraintWidget)) {
            if (constraintWidget instanceof C2223f) {
                C2223f fVar = (C2223f) constraintWidget;
                ConstraintAnchor constraintAnchor = fVar.f5326s0;
                if (fVar.f5327t0 == 0) {
                    i4 = 1;
                }
                constraintAnchor.mo8250c(i4, nVar, arrayList);
            }
            if (i == 0) {
                constraintWidget.f5163n0 = nVar.f5240b;
                constraintWidget.f5114E.mo8250c(i, nVar, arrayList);
                constraintWidget.f5116G.mo8250c(i, nVar, arrayList);
            } else {
                constraintWidget.f5165o0 = nVar.f5240b;
                constraintWidget.f5115F.mo8250c(i, nVar, arrayList);
                constraintWidget.f5118I.mo8250c(i, nVar, arrayList);
                constraintWidget.f5117H.mo8250c(i, nVar, arrayList);
            }
            constraintWidget.f5121L.mo8250c(i, nVar, arrayList);
        }
        return nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4843b(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r5, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r6, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r7, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r8) {
        /*
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r1
            goto L_0x0014
        L_0x0013:
            r5 = r2
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = r1
            goto L_0x0024
        L_0x0023:
            r6 = r2
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C2208h.m4843b(androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour):boolean");
    }
}
