package p203p0;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.C2208h;
import androidx.constraintlayout.solver.widgets.analyzer.C2216n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: p0.b */
public class C7647b extends ConstraintWidget implements C7646a {

    /* renamed from: p0 */
    public ConstraintWidget[] f16942p0 = new ConstraintWidget[4];

    /* renamed from: q0 */
    public int f16943q0 = 0;

    /* renamed from: O */
    public final void mo20058O(int i, C2216n nVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f16943q0; i2++) {
            nVar.mo8333a(this.f16942p0[i2]);
        }
        for (int i3 = 0; i3 < this.f16943q0; i3++) {
            C2208h.m4842a(this.f16942p0[i3], i, arrayList, nVar);
        }
    }

    /* renamed from: a */
    public final void mo20056a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.f16943q0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f16942p0;
            if (i > constraintWidgetArr.length) {
                this.f16942p0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f16942p0;
            int i2 = this.f16943q0;
            constraintWidgetArr2[i2] = constraintWidget;
            this.f16943q0 = i2 + 1;
        }
    }

    /* renamed from: b */
    public final void mo20057b() {
        this.f16943q0 = 0;
        Arrays.fill(this.f16942p0, (Object) null);
    }

    /* renamed from: c */
    public void mo8356c() {
    }

    /* renamed from: j */
    public void mo8281j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo8281j(constraintWidget, hashMap);
        C7647b bVar = (C7647b) constraintWidget;
        this.f16943q0 = 0;
        int i = bVar.f16943q0;
        for (int i2 = 0; i2 < i; i2++) {
            mo20056a(hashMap.get(bVar.f16942p0[i2]));
        }
    }
}
