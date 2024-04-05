package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: com.google.android.material.datepicker.s */
public final class C15302s implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f34299b;

    /* renamed from: c */
    public final /* synthetic */ C15303t f34300c;

    public C15302s(C15303t tVar, int i) {
        this.f34300c = tVar;
        this.f34299b = i;
    }

    public final void onClick(View view) {
        this.f34300c.f34301b.setCurrentMonth(this.f34300c.f34301b.getCalendarConstraints().clamp(Month.m24823a(this.f34299b, this.f34300c.f34301b.getCurrentMonth().f34237c)));
        this.f34300c.f34301b.setSelector(MaterialCalendar.CalendarSelector.DAY);
    }
}
