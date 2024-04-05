package com.bugsnag.android.internal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.internal.a */
public final class C5760a {

    /* renamed from: a */
    public static final C5761a f12308a = new C5761a();

    /* renamed from: com.bugsnag.android.internal.a$a */
    public static final class C5761a extends ThreadLocal<DateFormat> {
        public final Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    /* renamed from: a */
    public static final Date m11556a(String str) {
        C19383o.m32798h(str, "date");
        try {
            Object obj = f12308a.get();
            if (obj != null) {
                Date parse = ((DateFormat) obj).parse(str);
                if (parse != null) {
                    return parse;
                }
                throw new ParseException("DateFormat.parse returned null", 0);
            }
            throw new IllegalArgumentException("Unable to find valid dateformatter".toString());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Failed to parse timestamp", e);
        }
    }

    /* renamed from: b */
    public static final String m11557b(Date date) {
        C19383o.m32798h(date, "date");
        Object obj = f12308a.get();
        if (obj != null) {
            String format = ((DateFormat) obj).format(date);
            C19383o.m32793c(format, "iso8601Format.format(date)");
            return format;
        }
        throw new IllegalArgumentException("Unable to find valid dateformatter".toString());
    }
}
