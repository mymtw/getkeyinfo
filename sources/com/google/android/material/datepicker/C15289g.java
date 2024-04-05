package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.g */
public final class C15289g extends BaseAdapter {

    /* renamed from: b */
    public final Calendar f34277b;

    /* renamed from: c */
    public final int f34278c;

    /* renamed from: d */
    public final int f34279d;

    public C15289g() {
        Calendar g = C15301r.m24857g((Calendar) null);
        this.f34277b = g;
        this.f34278c = g.getMaximum(7);
        this.f34279d = g.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.f34278c;
    }

    public final Object getItem(int i) {
        int i2 = this.f34278c;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f34279d;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0010
            r7 = 2131624509(0x7f0e023d, float:1.88762E38)
            android.view.View r7 = androidx.appcompat.widget.C0326j.m859c(r8, r7, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0010:
            java.util.Calendar r7 = r5.f34277b
            int r2 = r5.f34279d
            int r6 = r6 + r2
            int r2 = r5.f34278c
            if (r6 <= r2) goto L_0x001a
            int r6 = r6 - r2
        L_0x001a:
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f34277b
            r3 = 4
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r7 = 2131952580(0x7f1303c4, float:1.9541607E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f34277b
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C15289g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
