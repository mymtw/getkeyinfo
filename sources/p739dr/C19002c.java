package p739dr;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p735br.C18980c;

/* renamed from: dr.c */
public final class C19002c {

    /* renamed from: a */
    public static final C19003a f42343a = new C19003a();

    /* renamed from: b */
    public static final String[] f42344b;

    /* renamed from: c */
    public static final DateFormat[] f42345c;

    /* renamed from: dr.c$a */
    public static final class C19003a extends ThreadLocal<DateFormat> {
        public final Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C18980c.f42305e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {StdDateFormat.DATE_FORMAT_STR_RFC1123, "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f42344b = strArr;
        f42345c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m32143a(String str) {
        C19383o.m32797g(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f42343a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f42344b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f42345c;
                DateFormat dateFormat = dateFormatArr[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f42344b[i], Locale.US);
                    dateFormat.setTimeZone(C18980c.f42305e);
                    dateFormatArr[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            C19394m mVar = C19394m.f43287a;
            return null;
        }
    }
}
