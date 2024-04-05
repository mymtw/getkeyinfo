package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

class TimePickerView extends ConstraintLayout {

    /* renamed from: b */
    public final Chip f34876b;

    /* renamed from: c */
    public final Chip f34877c;

    /* renamed from: d */
    public final ClockHandView f34878d;

    /* renamed from: e */
    public final ClockFaceView f34879e;

    /* renamed from: f */
    public final MaterialButtonToggleGroup f34880f;

    /* renamed from: g */
    public C15524d f34881g;

    /* renamed from: h */
    public C15525e f34882h;

    /* renamed from: i */
    public C15523c f34883i;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class C15521a implements View.OnClickListener {
        public C15521a() {
        }

        public final void onClick(View view) {
            C15525e eVar = TimePickerView.this.f34882h;
            if (eVar != null) {
                eVar.mo55186c(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    public class C15522b implements MaterialButtonToggleGroup.C15237e {
        public C15522b() {
        }

        /* renamed from: a */
        public final void mo53320a(int i, boolean z) {
            int i2 = i == R.id.material_clock_period_pm_button ? 1 : 0;
            C15524d dVar = TimePickerView.this.f34881g;
            if (dVar != null && z) {
                TimeModel timeModel = ((C15530d) dVar).f34896c;
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
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    public interface C15523c {
        void onDoubleTap();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    public interface C15524d {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    public interface C15525e {
        /* renamed from: c */
        void mo55186c(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo55182a() {
        if (this.f34880f.getVisibility() == 0) {
            C2236a aVar = new C2236a();
            aVar.mo8487e(this);
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            int i = 1;
            if (C2364y.C2369e.m5233d(this) == 0) {
                i = 2;
            }
            aVar.mo8486d(R.id.material_clock_display, i);
            aVar.mo8484b(this);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo55182a();
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            mo55182a();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C15521a aVar = new C15521a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f34879e = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f34880f = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new C15522b());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f34876b = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f34877c = chip2;
        this.f34878d = (ClockHandView) findViewById(R.id.material_clock_hand);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2371g.m5249f(chip, 2);
        C2364y.C2371g.m5249f(chip2, 2);
        C15539j jVar = new C15539j(new GestureDetector(getContext(), new C15538i(this)));
        chip.setOnTouchListener(jVar);
        chip2.setOnTouchListener(jVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }
}
