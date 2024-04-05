package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.core.view.C2330s0;
import androidx.core.view.C2362x;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.datepicker.l */
public final class C15294l extends RecyclerView.Adapter<C15295a> {

    /* renamed from: b */
    public final Context f34288b;

    /* renamed from: c */
    public final CalendarConstraints f34289c;

    /* renamed from: d */
    public final DateSelector<?> f34290d;

    /* renamed from: e */
    public final MaterialCalendar.C15270k f34291e;

    /* renamed from: f */
    public final int f34292f;

    /* renamed from: com.google.android.material.datepicker.l$a */
    public static class C15295a extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f34293b;

        /* renamed from: c */
        public final MaterialCalendarGridView f34294c;

        public C15295a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f34293b = textView;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            new C2362x().mo8988e(textView, Boolean.TRUE);
            this.f34294c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C15294l(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, MaterialCalendar.C15263d dVar) {
        Month start = calendarConstraints.getStart();
        Month end = calendarConstraints.getEnd();
        Month openAt = calendarConstraints.getOpenAt();
        if (start.f34236b.compareTo(openAt.f34236b) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (openAt.f34236b.compareTo(end.f34236b) <= 0) {
            int dayHeight = MaterialCalendar.getDayHeight(contextThemeWrapper) * C15292j.f34280g;
            int dayHeight2 = MaterialDatePicker.isFullscreen(contextThemeWrapper) ? MaterialCalendar.getDayHeight(contextThemeWrapper) : 0;
            this.f34288b = contextThemeWrapper;
            this.f34292f = dayHeight + dayHeight2;
            this.f34289c = calendarConstraints;
            this.f34290d = dateSelector;
            this.f34291e = dVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int getItemCount() {
        return this.f34289c.getMonthSpan();
    }

    public final long getItemId(int i) {
        Calendar c = C15301r.m24853c(this.f34289c.getStart().f34236b);
        c.add(2, i);
        return new Month(c).f34236b.getTimeInMillis();
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        C15295a aVar = (C15295a) b0Var;
        Calendar c = C15301r.m24853c(this.f34289c.getStart().f34236b);
        c.add(2, i);
        Month month = new Month(c);
        aVar.f34293b.setText(month.mo53837g(aVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f34294c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !month.equals(materialCalendarGridView.getAdapter().f34281b)) {
            C15292j jVar = new C15292j(month, this.f34290d, this.f34289c);
            materialCalendarGridView.setNumColumns(month.f34239e);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.invalidate();
            C15292j a = materialCalendarGridView.getAdapter();
            for (Long longValue : a.f34283d) {
                a.mo53867e(materialCalendarGridView, longValue.longValue());
            }
            DateSelector<?> dateSelector = a.f34282c;
            if (dateSelector != null) {
                for (Long longValue2 : dateSelector.getSelectedDays()) {
                    a.mo53867e(materialCalendarGridView, longValue2.longValue());
                }
                a.f34283d = a.f34282c.getSelectedDays();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C15293k(this, materialCalendarGridView));
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) C0326j.m859c(viewGroup, R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            return new C15295a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f34292f));
        return new C15295a(linearLayout, true);
    }
}
