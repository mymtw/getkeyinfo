package com.google.android.material.timepicker;

import com.etsy.android.R;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* renamed from: com.google.android.material.timepicker.h */
public final class C15537h implements MaterialButtonToggleGroup.C15237e {

    /* renamed from: a */
    public final /* synthetic */ C15533g f34916a;

    public C15537h(C15533g gVar) {
        this.f34916a = gVar;
    }

    /* renamed from: a */
    public final void mo53320a(int i, boolean z) {
        int i2 = i == R.id.material_clock_period_pm_button ? 1 : 0;
        TimeModel timeModel = this.f34916a.f34905c;
        if (i2 != timeModel.f34875h) {
            timeModel.f34875h = i2;
            int i3 = timeModel.f34872e;
            if (i3 < 12 && i2 == 1) {
                timeModel.f34872e = i3 + 12;
            } else if (i3 >= 12 && i2 == 0) {
                timeModel.f34872e = i3 - 12;
            }
        }
    }
}
