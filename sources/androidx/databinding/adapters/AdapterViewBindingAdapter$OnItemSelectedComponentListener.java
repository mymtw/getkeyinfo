package androidx.databinding.adapters;

import android.view.View;
import android.widget.AdapterView;
import androidx.databinding.C2447g;
import p135i1.C6981a;
import p135i1.C6982b;

public class AdapterViewBindingAdapter$OnItemSelectedComponentListener implements AdapterView.OnItemSelectedListener {
    private final C2447g mAttrChanged;
    private final C6982b mNothingSelected;
    private final C6981a mSelected;

    public AdapterViewBindingAdapter$OnItemSelectedComponentListener(C6981a aVar, C6982b bVar, C2447g gVar) {
        this.mSelected = aVar;
        this.mNothingSelected = bVar;
        this.mAttrChanged = gVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C6981a aVar = this.mSelected;
        if (aVar != null) {
            aVar.mo19150a();
        }
        C2447g gVar = this.mAttrChanged;
        if (gVar != null) {
            gVar.mo9291a();
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        C6982b bVar = this.mNothingSelected;
        if (bVar != null) {
            bVar.mo19151a();
        }
        C2447g gVar = this.mAttrChanged;
        if (gVar != null) {
            gVar.mo9291a();
        }
    }
}
