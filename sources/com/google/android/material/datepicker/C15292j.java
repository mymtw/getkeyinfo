package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.j */
public final class C15292j extends BaseAdapter {

    /* renamed from: g */
    public static final int f34280g = C15301r.m24857g((Calendar) null).getMaximum(4);

    /* renamed from: b */
    public final Month f34281b;

    /* renamed from: c */
    public final DateSelector<?> f34282c;

    /* renamed from: d */
    public Collection<Long> f34283d;

    /* renamed from: e */
    public C15284b f34284e;

    /* renamed from: f */
    public final CalendarConstraints f34285f;

    public C15292j(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f34281b = month;
        this.f34282c = dateSelector;
        this.f34285f = calendarConstraints;
        this.f34283d = dateSelector.getSelectedDays();
    }

    /* renamed from: a */
    public final int mo53863a() {
        return this.f34281b.mo53834e();
    }

    /* renamed from: b */
    public final Long getItem(int i) {
        if (i < this.f34281b.mo53834e() || i > mo53865c()) {
            return null;
        }
        Month month = this.f34281b;
        return Long.valueOf(month.mo53836f((i - month.mo53834e()) + 1));
    }

    /* renamed from: c */
    public final int mo53865c() {
        return (this.f34281b.mo53834e() + this.f34281b.f34240f) - 1;
    }

    /* renamed from: d */
    public final void mo53866d(TextView textView, long j) {
        C15283a aVar;
        if (textView != null) {
            boolean z = false;
            if (this.f34285f.getDateValidator().isValid(j)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f34282c.getSelectedDays().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C15301r.m24851a(j) == C15301r.m24851a(it.next().longValue())) {
                        z = true;
                        break;
                    }
                }
                aVar = z ? this.f34284e.f34260b : C15301r.m24856f().getTimeInMillis() == j ? this.f34284e.f34261c : this.f34284e.f34259a;
            } else {
                textView.setEnabled(false);
                aVar = this.f34284e.f34265g;
            }
            aVar.mo53854b(textView);
        }
    }

    /* renamed from: e */
    public final void mo53867e(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m24824c(j).equals(this.f34281b)) {
            Calendar c = C15301r.m24853c(this.f34281b.f34236b);
            c.setTimeInMillis(j);
            int i = c.get(5);
            mo53866d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().mo53863a() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public final int getCount() {
        return mo53863a() + this.f34281b.f34240f;
    }

    public final long getItemId(int i) {
        return (long) (i / this.f34281b.f34239e);
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            android.content.Context r0 = r9.getContext()
            com.google.android.material.datepicker.b r1 = r6.f34284e
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.b r1 = new com.google.android.material.datepicker.b
            r1.<init>(r0)
            r6.f34284e = r1
        L_0x000f:
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r8 != 0) goto L_0x001f
            r8 = 2131624508(0x7f0e023c, float:1.8876198E38)
            android.view.View r8 = androidx.appcompat.widget.C0326j.m859c(r9, r8, r9, r1)
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001f:
            int r8 = r6.mo53863a()
            int r8 = r7 - r8
            if (r8 < 0) goto L_0x0099
            com.google.android.material.datepicker.Month r9 = r6.f34281b
            int r2 = r9.f34240f
            if (r8 < r2) goto L_0x002e
            goto L_0x0099
        L_0x002e:
            r2 = 1
            int r8 = r8 + r2
            r0.setTag(r9)
            android.content.res.Resources r9 = r0.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            java.util.Locale r9 = r9.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r9 = java.lang.String.format(r9, r4, r3)
            r0.setText(r9)
            com.google.android.material.datepicker.Month r9 = r6.f34281b
            long r8 = r9.mo53836f(r8)
            com.google.android.material.datepicker.Month r3 = r6.f34281b
            int r3 = r3.f34238d
            com.google.android.material.datepicker.Month r4 = new com.google.android.material.datepicker.Month
            java.util.Calendar r5 = com.google.android.material.datepicker.C15301r.m24856f()
            r4.<init>(r5)
            int r4 = r4.f34238d
            if (r3 != r4) goto L_0x007c
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "MMMEd"
            android.icu.text.DateFormat r3 = com.google.android.material.datepicker.C15301r.m24852b(r4, r3)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r8)
            java.lang.String r8 = r3.format(r4)
            r0.setContentDescription(r8)
            goto L_0x0092
        L_0x007c:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "yMMMEd"
            android.icu.text.DateFormat r3 = com.google.android.material.datepicker.C15301r.m24852b(r4, r3)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r8)
            java.lang.String r8 = r3.format(r4)
            r0.setContentDescription(r8)
        L_0x0092:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x00a1
        L_0x0099:
            r8 = 8
            r0.setVisibility(r8)
            r0.setEnabled(r1)
        L_0x00a1:
            java.lang.Long r7 = r6.getItem(r7)
            if (r7 != 0) goto L_0x00a8
            goto L_0x00af
        L_0x00a8:
            long r7 = r7.longValue()
            r6.mo53866d(r0, r7)
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C15292j.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
