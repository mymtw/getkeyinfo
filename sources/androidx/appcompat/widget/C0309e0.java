package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.appcompat.widget.e0 */
public final class C0309e0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ C0311f0 f762b;

    public C0309e0(C0311f0 f0Var) {
        this.f762b = f0Var;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0299a0 a0Var;
        if (i != -1 && (a0Var = this.f762b.f773d) != null) {
            a0Var.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
