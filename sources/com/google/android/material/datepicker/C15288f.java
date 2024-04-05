package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.f */
public final class C15288f {
    /* renamed from: a */
    public static String m24838a(long j) {
        Calendar f = C15301r.m24856f();
        Calendar g = C15301r.m24857g((Calendar) null);
        g.setTimeInMillis(j);
        return f.get(1) == g.get(1) ? m24839b(j, Locale.getDefault()) : m24840c(j, Locale.getDefault());
    }

    /* renamed from: b */
    public static String m24839b(long j, Locale locale) {
        return C15301r.m24852b("MMMd", locale).format(new Date(j));
    }

    /* renamed from: c */
    public static String m24840c(long j, Locale locale) {
        return C15301r.m24852b("yMMMd", locale).format(new Date(j));
    }
}
