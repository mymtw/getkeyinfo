package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import com.etsy.android.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.r */
public final class C15301r {

    /* renamed from: a */
    public static AtomicReference<C15300q> f34298a = new AtomicReference<>();

    /* renamed from: a */
    public static long m24851a(long j) {
        Calendar g = m24857g((Calendar) null);
        g.setTimeInMillis(j);
        return m24853c(g).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m24852b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    /* renamed from: c */
    public static Calendar m24853c(Calendar calendar) {
        Calendar g = m24857g(calendar);
        Calendar g2 = m24857g((Calendar) null);
        g2.set(g.get(1), g.get(2), g.get(5));
        return g2;
    }

    /* renamed from: d */
    public static SimpleDateFormat m24854d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: e */
    public static String m24855e(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: f */
    public static Calendar m24856f() {
        C15300q qVar = f34298a.get();
        if (qVar == null) {
            qVar = C15300q.f34295c;
        }
        java.util.TimeZone timeZone = qVar.f34297b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = qVar.f34296a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return instance;
    }

    /* renamed from: g */
    public static Calendar m24857g(Calendar calendar) {
        Calendar instance = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
