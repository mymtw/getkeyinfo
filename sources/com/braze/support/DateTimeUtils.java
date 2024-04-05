package com.braze.support;

import android.support.p013v4.media.C0072d;
import com.appboy.Constants;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p003a2.C0023f;
import p753kq.C19846a;

public final class DateTimeUtils {

    /* renamed from: a */
    public static final TimeZone f11946a = TimeZone.getTimeZone("UTC");

    /* renamed from: com.braze.support.DateTimeUtils$a */
    public static final class C5575a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11947b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5575a(String str) {
            super(0);
            this.f11947b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Exception parsing date "), this.f11947b, ". Returning null");
        }
    }

    /* renamed from: a */
    public static final String m11299a(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        C19383o.m32797g(date, "<this>");
        C19383o.m32797g(brazeDateFormat, "dateFormat");
        C19383o.m32797g(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        C19383o.m32796f(format, "simpleDateFormat.format(this)");
        return format;
    }

    /* renamed from: b */
    public static /* synthetic */ String m11300b(Date date, BrazeDateFormat brazeDateFormat) {
        TimeZone timeZone = f11946a;
        C19383o.m32796f(timeZone, "UTC_TIME_ZONE");
        return m11299a(date, brazeDateFormat, timeZone);
    }

    /* renamed from: c */
    public static final String m11301c(BrazeDateFormat brazeDateFormat) {
        C19383o.m32797g(brazeDateFormat, "dateFormat");
        Date date = new Date(m11302d() * 1000);
        TimeZone timeZone = TimeZone.getDefault();
        C19383o.m32796f(timeZone, "getDefault()");
        return m11299a(date, brazeDateFormat, timeZone);
    }

    /* renamed from: d */
    public static final long m11302d() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: e */
    public static final double m11303e() {
        return ((double) System.currentTimeMillis()) / 1000.0d;
    }

    /* renamed from: f */
    public static final Date m11304f(String str, BrazeDateFormat brazeDateFormat) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(brazeDateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(f11946a);
        try {
            Date parse = simpleDateFormat.parse(str);
            C19383o.m32794d(parse);
            return parse;
        } catch (Exception e) {
            BrazeLogger.m11283e(C19383o.m32802l("DateTimeUtils", Constants.LOG_TAG_PREFIX), BrazeLogger.Priority.E, e, new C5575a(str), 8);
            throw e;
        }
    }
}
