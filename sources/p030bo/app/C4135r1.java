package p030bo.app;

import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import p753kq.C19846a;

/* renamed from: bo.app.r1 */
public final class C4135r1 {

    /* renamed from: a */
    private static final String f9185a = C19383o.m32802l("HttpUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: bo.app.r1$a */
    public static final class C4136a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9186b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4136a(String str) {
            super(0);
            this.f9186b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9186b, "Could not parse retry value: ");
        }
    }

    /* renamed from: a */
    public static final Long m9502a(String str) {
        C19383o.m32797g(str, "retryAfter");
        try {
            if (new Regex("[0-9]+(.[0-9]+)?").matches(str)) {
                return Long.valueOf((long) (Double.parseDouble(str) * ((double) 1000)));
            }
            Date parse = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z").parse(str);
            if (parse == null) {
                return null;
            }
            long time = parse.getTime();
            TimeZone timeZone = DateTimeUtils.f11946a;
            return Long.valueOf(time - System.currentTimeMillis());
        } catch (Exception e) {
            BrazeLogger.m11283e(f9185a, BrazeLogger.Priority.E, e, new C4136a(str), 8);
        }
    }

    /* renamed from: b */
    public static final String m9505b(Map<String, String> map, String str) {
        C19383o.m32797g(map, "<this>");
        C19383o.m32797g(str, "key");
        Locale locale = Locale.US;
        C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
        String upperCase = str.toUpperCase(locale);
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            C19383o.m32796f(locale2, UserStateKt.US_COUNTRY);
            String upperCase2 = ((String) next.getKey()).toUpperCase(locale2);
            C19383o.m32796f(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            if (C19383o.m32792b(upperCase2, upperCase)) {
                return (String) next.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m9504a(Map<String, String> map, String str) {
        C19383o.m32797g(map, "<this>");
        C19383o.m32797g(str, "key");
        Locale locale = Locale.US;
        C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
        String upperCase = str.toUpperCase(locale);
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        for (Map.Entry<String, String> key : map.entrySet()) {
            Locale locale2 = Locale.US;
            C19383o.m32796f(locale2, UserStateKt.US_COUNTRY);
            String upperCase2 = ((String) key.getKey()).toUpperCase(locale2);
            C19383o.m32796f(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            if (C19383o.m32792b(upperCase2, upperCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final String m9503a(Object... objArr) {
        C19383o.m32797g(objArr, "requestArgs");
        int length = objArr.length;
        long j = 1;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            j *= (long) obj.hashCode();
        }
        String hexString = Long.toHexString(j);
        C19383o.m32796f(hexString, "toHexString(\n    request…lement.hashCode()\n    }\n)");
        return hexString;
    }
}
