package androidx.constraintlayout.solver.widgets;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.constraintlayout.solver.C2188b;
import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;
import p003a2.C0023f;
import p203p0.C7647b;

/* renamed from: androidx.constraintlayout.solver.widgets.a */
public final class C2197a extends C7647b {

    /* renamed from: r0 */
    public int f5179r0 = 0;

    /* renamed from: s0 */
    public boolean f5180s0 = true;

    /* renamed from: t0 */
    public int f5181t0 = 0;

    /* renamed from: u0 */
    public boolean f5182u0 = false;

    /* renamed from: A */
    public final boolean mo8261A() {
        return this.f5182u0;
    }

    /* renamed from: B */
    public final boolean mo8262B() {
        return this.f5182u0;
    }

    /* renamed from: P */
    public final boolean mo8299P() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f16943q0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.f16942p0[i4];
            if ((this.f5180s0 || constraintWidget.mo8277f()) && ((((i2 = this.f5179r0) == 0 || i2 == 1) && !constraintWidget.mo8261A()) || (((i3 = this.f5179r0) == 2 || i3 == 3) && !constraintWidget.mo8262B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f16943q0; i6++) {
            ConstraintWidget constraintWidget2 = this.f16942p0[i6];
            if (this.f5180s0 || constraintWidget2.mo8277f()) {
                if (!z2) {
                    int i7 = this.f5179r0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.mo8284m(ConstraintAnchor.Type.LEFT).mo8251d();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.mo8284m(ConstraintAnchor.Type.RIGHT).mo8251d();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.mo8284m(ConstraintAnchor.Type.TOP).mo8251d();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.mo8284m(ConstraintAnchor.Type.BOTTOM).mo8251d();
                    }
                    z2 = true;
                }
                int i8 = this.f5179r0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.mo8284m(ConstraintAnchor.Type.LEFT).mo8251d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.mo8284m(ConstraintAnchor.Type.RIGHT).mo8251d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.mo8284m(ConstraintAnchor.Type.TOP).mo8251d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.mo8284m(ConstraintAnchor.Type.BOTTOM).mo8251d());
                }
            }
        }
        int i9 = i5 + this.f5181t0;
        int i10 = this.f5179r0;
        if (i10 == 0 || i10 == 1) {
            mo8267G(i9, i9);
        } else {
            mo8268H(i9, i9);
        }
        this.f5182u0 = true;
        return true;
    }

    /* renamed from: Q */
    public final int mo8300Q() {
        int i = this.f5179r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: e */
    public final void mo8276e(C2190c cVar, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        int i;
        int i2;
        ConstraintAnchor[] constraintAnchorArr2 = this.f5122M;
        constraintAnchorArr2[0] = this.f5114E;
        constraintAnchorArr2[2] = this.f5115F;
        constraintAnchorArr2[1] = this.f5116G;
        constraintAnchorArr2[3] = this.f5117H;
        int i3 = 0;
        while (true) {
            constraintAnchorArr = this.f5122M;
            if (i3 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i3];
            constraintAnchor.f5108i = cVar.mo8233k(constraintAnchor);
            i3++;
        }
        int i4 = this.f5179r0;
        if (i4 >= 0 && i4 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i4];
            if (!this.f5182u0) {
                mo8299P();
            }
            if (this.f5182u0) {
                this.f5182u0 = false;
                int i5 = this.f5179r0;
                if (i5 == 0 || i5 == 1) {
                    cVar.mo8226d(this.f5114E.f5108i, this.f5131V);
                    cVar.mo8226d(this.f5116G.f5108i, this.f5131V);
                } else if (i5 == 2 || i5 == 3) {
                    cVar.mo8226d(this.f5115F.f5108i, this.f5132W);
                    cVar.mo8226d(this.f5117H.f5108i, this.f5132W);
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.f16943q0) {
                        z2 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.f16942p0[i6];
                    if ((this.f5180s0 || constraintWidget.mo8277f()) && ((((i2 = this.f5179r0) == 0 || i2 == 1) && constraintWidget.f5125P[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f5114E.f5105f != null && constraintWidget.f5116G.f5105f != null) || ((i2 == 2 || i2 == 3) && constraintWidget.f5125P[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f5115F.f5105f != null && constraintWidget.f5117H.f5105f != null))) {
                        z2 = true;
                    } else {
                        i6++;
                    }
                }
                z2 = true;
                boolean z3 = this.f5114E.mo8254g() || this.f5116G.mo8254g();
                boolean z4 = this.f5115F.mo8254g() || this.f5117H.mo8254g();
                boolean z5 = !z2 && (((i = this.f5179r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
                int i7 = 5;
                if (!z5) {
                    i7 = 4;
                }
                for (int i8 = 0; i8 < this.f16943q0; i8++) {
                    ConstraintWidget constraintWidget2 = this.f16942p0[i8];
                    if (this.f5180s0 || constraintWidget2.mo8277f()) {
                        SolverVariable k = cVar.mo8233k(constraintWidget2.f5122M[this.f5179r0]);
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f5122M;
                        int i9 = this.f5179r0;
                        ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i9];
                        constraintAnchor3.f5108i = k;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f5105f;
                        int i10 = (constraintAnchor4 == null || constraintAnchor4.f5103d != this) ? 0 : constraintAnchor3.f5106g + 0;
                        if (i9 == 0 || i9 == 2) {
                            C2188b l = cVar.mo8234l();
                            SolverVariable m = cVar.mo8235m();
                            m.f5053d = 0;
                            l.mo8216d(constraintAnchor2.f5108i, k, m, this.f5181t0 - i10);
                            cVar.mo8225c(l);
                        } else {
                            C2188b l2 = cVar.mo8234l();
                            SolverVariable m2 = cVar.mo8235m();
                            m2.f5053d = 0;
                            l2.mo8215c(constraintAnchor2.f5108i, k, m2, this.f5181t0 + i10);
                            cVar.mo8225c(l2);
                        }
                        cVar.mo8227e(constraintAnchor2.f5108i, k, this.f5181t0 + i10, i7);
                    }
                }
                int i11 = this.f5179r0;
                if (i11 == 0) {
                    cVar.mo8227e(this.f5116G.f5108i, this.f5114E.f5108i, 0, 8);
                    cVar.mo8227e(this.f5114E.f5108i, this.f5126Q.f5116G.f5108i, 0, 4);
                    cVar.mo8227e(this.f5114E.f5108i, this.f5126Q.f5114E.f5108i, 0, 0);
                } else if (i11 == 1) {
                    cVar.mo8227e(this.f5114E.f5108i, this.f5116G.f5108i, 0, 8);
                    cVar.mo8227e(this.f5114E.f5108i, this.f5126Q.f5114E.f5108i, 0, 4);
                    cVar.mo8227e(this.f5114E.f5108i, this.f5126Q.f5116G.f5108i, 0, 0);
                } else if (i11 == 2) {
                    cVar.mo8227e(this.f5117H.f5108i, this.f5115F.f5108i, 0, 8);
                    cVar.mo8227e(this.f5115F.f5108i, this.f5126Q.f5117H.f5108i, 0, 4);
                    cVar.mo8227e(this.f5115F.f5108i, this.f5126Q.f5115F.f5108i, 0, 0);
                } else if (i11 == 3) {
                    cVar.mo8227e(this.f5115F.f5108i, this.f5117H.f5108i, 0, 8);
                    cVar.mo8227e(this.f5115F.f5108i, this.f5126Q.f5115F.f5108i, 0, 4);
                    cVar.mo8227e(this.f5115F.f5108i, this.f5126Q.f5117H.f5108i, 0, 0);
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo8277f() {
        return true;
    }

    /* renamed from: j */
    public final void mo8281j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo8281j(constraintWidget, hashMap);
        C2197a aVar = (C2197a) constraintWidget;
        this.f5179r0 = aVar.f5179r0;
        this.f5180s0 = aVar.f5180s0;
        this.f5181t0 = aVar.f5181t0;
    }

    public final String toString() {
        String k = C0023f.m110k(C0072d.m201h("[Barrier] "), this.f5145e0, " {");
        for (int i = 0; i < this.f16943q0; i++) {
            ConstraintWidget constraintWidget = this.f16942p0[i];
            if (i > 0) {
                k = C0326j.m864i(k, ", ");
            }
            StringBuilder h = C0072d.m201h(k);
            h.append(constraintWidget.f5145e0);
            k = h.toString();
        }
        return C0326j.m864i(k, "}");
    }
}
