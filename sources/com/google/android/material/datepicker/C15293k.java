package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.k */
public final class C15293k implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ MaterialCalendarGridView f34286b;

    /* renamed from: c */
    public final /* synthetic */ C15294l f34287c;

    public C15293k(C15294l lVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f34287c = lVar;
        this.f34286b = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C15292j a = this.f34286b.getAdapter();
        if (i >= a.mo53863a() && i <= a.mo53865c()) {
            MaterialCalendar.C15270k kVar = this.f34287c.f34291e;
            long longValue = this.f34286b.getAdapter().getItem(i).longValue();
            MaterialCalendar.C15263d dVar = (MaterialCalendar.C15263d) kVar;
            if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(longValue)) {
                MaterialCalendar.this.dateSelector.select(longValue);
                Iterator<C15296m<S>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().mo53829b(MaterialCalendar.this.dateSelector.getSelection());
                }
                MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.yearSelector != null) {
                    MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
