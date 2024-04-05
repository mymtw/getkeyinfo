package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.C2200b;
import androidx.constraintlayout.widget.ConstraintLayout;
import p203p0.C7647b;

/* renamed from: androidx.constraintlayout.solver.widgets.h */
public class C2226h extends C7647b {

    /* renamed from: A0 */
    public C2200b.C2201a f5331A0 = new C2200b.C2201a();

    /* renamed from: B0 */
    public C2200b.C2202b f5332B0 = null;

    /* renamed from: r0 */
    public int f5333r0 = 0;

    /* renamed from: s0 */
    public int f5334s0 = 0;

    /* renamed from: t0 */
    public int f5335t0 = 0;

    /* renamed from: u0 */
    public int f5336u0 = 0;

    /* renamed from: v0 */
    public int f5337v0 = 0;

    /* renamed from: w0 */
    public int f5338w0 = 0;

    /* renamed from: x0 */
    public boolean f5339x0 = false;

    /* renamed from: y0 */
    public int f5340y0 = 0;

    /* renamed from: z0 */
    public int f5341z0 = 0;

    /* renamed from: P */
    public void mo8344P(int i, int i2, int i3, int i4) {
    }

    /* renamed from: Q */
    public final void mo8355Q(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        C2200b.C2202b bVar;
        ConstraintWidget constraintWidget2;
        while (true) {
            bVar = this.f5332B0;
            if (bVar != null || (constraintWidget2 = this.f5126Q) == null) {
                C2200b.C2201a aVar = this.f5331A0;
                aVar.f5209a = dimensionBehaviour;
                aVar.f5210b = dimensionBehaviour2;
                aVar.f5211c = i;
                aVar.f5212d = i2;
                ((ConstraintLayout.C2235b) bVar).mo8460b(constraintWidget, aVar);
                constraintWidget.mo8272L(this.f5331A0.f5213e);
                constraintWidget.mo8269I(this.f5331A0.f5214f);
                C2200b.C2201a aVar2 = this.f5331A0;
                constraintWidget.f5176z = aVar2.f5216h;
                int i3 = aVar2.f5215g;
                constraintWidget.f5133X = i3;
            } else {
                this.f5332B0 = ((C2220d) constraintWidget2).f5272s0;
            }
        }
        C2200b.C2201a aVar3 = this.f5331A0;
        aVar3.f5209a = dimensionBehaviour;
        aVar3.f5210b = dimensionBehaviour2;
        aVar3.f5211c = i;
        aVar3.f5212d = i2;
        ((ConstraintLayout.C2235b) bVar).mo8460b(constraintWidget, aVar3);
        constraintWidget.mo8272L(this.f5331A0.f5213e);
        constraintWidget.mo8269I(this.f5331A0.f5214f);
        C2200b.C2201a aVar22 = this.f5331A0;
        constraintWidget.f5176z = aVar22.f5216h;
        int i32 = aVar22.f5215g;
        constraintWidget.f5133X = i32;
        constraintWidget.f5176z = i32 > 0;
    }

    /* renamed from: c */
    public final void mo8356c() {
        for (int i = 0; i < this.f16943q0; i++) {
            ConstraintWidget constraintWidget = this.f16942p0[i];
            if (constraintWidget != null) {
                constraintWidget.f5111B = true;
            }
        }
    }
}
