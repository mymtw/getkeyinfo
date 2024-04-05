package com.google.android.material.datepicker;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.t */
public final class C15303t extends RecyclerView.Adapter<C15304a> {

    /* renamed from: b */
    public final MaterialCalendar<?> f34301b;

    /* renamed from: com.google.android.material.datepicker.t$a */
    public static class C15304a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f34302b;

        public C15304a(TextView textView) {
            super(textView);
            this.f34302b = textView;
        }
    }

    public C15303t(MaterialCalendar<?> materialCalendar) {
        this.f34301b = materialCalendar;
    }

    public final int getItemCount() {
        return this.f34301b.getCalendarConstraints().getYearSpan();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C15304a aVar = (C15304a) b0Var;
        int i2 = this.f34301b.getCalendarConstraints().getStart().f34238d + i;
        String string = aVar.f34302b.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.f34302b.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        aVar.f34302b.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i2)}));
        C15284b calendarStyle = this.f34301b.getCalendarStyle();
        Calendar f = C15301r.m24856f();
        C15283a aVar2 = f.get(1) == i2 ? calendarStyle.f34264f : calendarStyle.f34262d;
        for (Long longValue : this.f34301b.getDateSelector().getSelectedDays()) {
            f.setTimeInMillis(longValue.longValue());
            if (f.get(1) == i2) {
                aVar2 = calendarStyle.f34263e;
            }
        }
        aVar2.mo53854b(aVar.f34302b);
        aVar.f34302b.setOnClickListener(new C15302s(this, i2));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C15304a((TextView) C0326j.m859c(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
