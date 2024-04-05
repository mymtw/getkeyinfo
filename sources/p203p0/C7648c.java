package p203p0;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import p194o0.C7508a;

/* renamed from: p0.c */
public class C7648c extends ConstraintWidget {

    /* renamed from: p0 */
    public ArrayList<ConstraintWidget> f16944p0 = new ArrayList<>();

    /* renamed from: C */
    public void mo8263C() {
        this.f16944p0.clear();
        super.mo8263C();
    }

    /* renamed from: F */
    public final void mo8266F(C7508a aVar) {
        super.mo8266F(aVar);
        int size = this.f16944p0.size();
        for (int i = 0; i < size; i++) {
            this.f16944p0.get(i).mo8266F(aVar);
        }
    }

    /* renamed from: O */
    public void mo8338O() {
        ArrayList<ConstraintWidget> arrayList = this.f16944p0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.f16944p0.get(i);
                if (constraintWidget instanceof C7648c) {
                    ((C7648c) constraintWidget).mo8338O();
                }
            }
        }
    }
}
