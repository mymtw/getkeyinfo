package com.google.android.material.timepicker;

import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;

/* renamed from: com.google.android.material.timepicker.d */
public final class C15530d implements ClockHandView.C15515d, TimePickerView.C15525e, TimePickerView.C15524d, ClockHandView.C15514c, C15531e {

    /* renamed from: g */
    public static final String[] f34892g = {"12", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: h */
    public static final String[] f34893h = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};

    /* renamed from: i */
    public static final String[] f34894i = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: b */
    public TimePickerView f34895b;

    /* renamed from: c */
    public TimeModel f34896c;

    /* renamed from: d */
    public float f34897d;

    /* renamed from: e */
    public float f34898e;

    /* renamed from: f */
    public boolean f34899f = false;

    public C15530d(TimePickerView timePickerView, TimeModel timeModel) {
        this.f34895b = timePickerView;
        this.f34896c = timeModel;
        if (timeModel.f34871d == 0) {
            timePickerView.f34880f.setVisibility(0);
        }
        this.f34895b.f34878d.f34854h.add(this);
        TimePickerView timePickerView2 = this.f34895b;
        timePickerView2.f34882h = this;
        timePickerView2.f34881g = this;
        timePickerView2.f34878d.f34862p = this;
        mo55197h("%d", f34892g);
        mo55197h("%d", f34893h);
        mo55197h("%02d", f34894i);
        invalidate();
    }

    /* renamed from: a */
    public final void mo55192a() {
        this.f34895b.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo55193b() {
        this.f34895b.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo55186c(int i) {
        mo55195f(i, true);
    }

    /* renamed from: d */
    public final void mo55143d(float f, boolean z) {
        if (!this.f34899f) {
            TimeModel timeModel = this.f34896c;
            int i = timeModel.f34872e;
            int i2 = timeModel.f34873f;
            int round = Math.round(f);
            TimeModel timeModel2 = this.f34896c;
            if (timeModel2.f34874g == 12) {
                int i3 = ((round + 3) / 6) % 60;
                timeModel2.f34873f = i3;
                this.f34897d = (float) Math.floor((double) (i3 * 6));
            } else {
                this.f34896c.mo55175c((round + (mo55194e() / 2)) / mo55194e());
                this.f34898e = (float) (mo55194e() * this.f34896c.mo55174b());
            }
            if (!z) {
                mo55196g();
                TimeModel timeModel3 = this.f34896c;
                if (timeModel3.f34873f != i2 || timeModel3.f34872e != i) {
                    this.f34895b.performHapticFeedback(4);
                }
            }
        }
    }

    /* renamed from: e */
    public final int mo55194e() {
        return this.f34896c.f34871d == 1 ? 15 : 30;
    }

    /* renamed from: f */
    public final void mo55195f(int i, boolean z) {
        boolean z2 = false;
        boolean z3 = i == 12;
        TimePickerView timePickerView = this.f34895b;
        timePickerView.f34878d.f34849c = z3;
        TimeModel timeModel = this.f34896c;
        timeModel.f34874g = i;
        timePickerView.f34879e.mo55142c(z3 ? R.string.material_minute_suffix : R.string.material_hour_suffix, z3 ? f34894i : timeModel.f34871d == 1 ? f34893h : f34892g);
        this.f34895b.f34878d.mo55147b(z3 ? this.f34897d : this.f34898e, z);
        TimePickerView timePickerView2 = this.f34895b;
        timePickerView2.f34876b.setChecked(i == 12);
        Chip chip = timePickerView2.f34877c;
        if (i == 10) {
            z2 = true;
        }
        chip.setChecked(z2);
        C2364y.m5201p(this.f34895b.f34877c, new C15526a(this.f34895b.getContext(), R.string.material_hour_selection));
        C2364y.m5201p(this.f34895b.f34876b, new C15526a(this.f34895b.getContext(), R.string.material_minute_selection));
    }

    /* renamed from: g */
    public final void mo55196g() {
        TimePickerView timePickerView = this.f34895b;
        TimeModel timeModel = this.f34896c;
        int i = timeModel.f34875h;
        int b = timeModel.mo55174b();
        int i2 = this.f34896c.f34873f;
        timePickerView.f34880f.check(i == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(i2)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(b)});
        timePickerView.f34876b.setText(format);
        timePickerView.f34877c.setText(format2);
    }

    /* renamed from: h */
    public final void mo55197h(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.m25113a(this.f34895b.getResources(), strArr[i], str);
        }
    }

    public final void invalidate() {
        this.f34898e = (float) (mo55194e() * this.f34896c.mo55174b());
        TimeModel timeModel = this.f34896c;
        this.f34897d = (float) (timeModel.f34873f * 6);
        mo55195f(timeModel.f34874g, false);
        mo55196g();
    }
}
