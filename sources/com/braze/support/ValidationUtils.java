package com.braze.support;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import org.apache.commons.codec.language.p763bm.Rule;
import p030bo.app.C3551a5;
import p753kq.C19846a;

public final class ValidationUtils {

    /* renamed from: a */
    public static final ValidationUtils f11978a = new ValidationUtils();

    /* renamed from: b */
    public static final Set<String> f11979b = C19382n.m32704D0("AED", "AFN", Rule.ALL, "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL");

    /* renamed from: c */
    public static final Regex f11980c = new Regex(".+@.+\\..+");

    /* renamed from: d */
    public static final Regex f11981d = new Regex("^[0-9 .\\(\\)\\+\\-]+$");

    /* renamed from: com.braze.support.ValidationUtils$a */
    public static final class C5597a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<String> f11982b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5597a(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f11982b = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Provided string field is too long [");
            h.append(((String) this.f11982b.element).length());
            h.append("]. The max length is 255, truncating provided field.");
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$b */
    public static final class C5598b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5598b f11983b = new C5598b();

        public C5598b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$c */
    public static final class C5599c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11984b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5599c(String str) {
            super(0);
            this.f11984b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("The custom event is a blocklisted custom event: ");
            h.append(this.f11984b);
            h.append(". Invalid custom event.");
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$d */
    public static final class C5600d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5600d f11985b = new C5600d();

        public C5600d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The productId is empty, not logging in-app purchase to Braze.";
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$e */
    public static final class C5601e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11986b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5601e(String str) {
            super(0);
            this.f11986b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11986b, "The productId is a blocklisted productId: ");
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$f */
    public static final class C5602f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5602f f11987b = new C5602f();

        public C5602f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            ValidationUtils validationUtils = ValidationUtils.f11978a;
            return C19383o.m32802l(ValidationUtils.f11979b, "The currencyCode is empty. Expected one of ");
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$g */
    public static final class C5603g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11988b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5603g(String str) {
            super(0);
            this.f11988b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("The currencyCode ");
            h.append(this.f11988b);
            h.append(" is invalid. Expected one of ");
            ValidationUtils validationUtils = ValidationUtils.f11978a;
            h.append(ValidationUtils.f11979b);
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$h */
    public static final class C5604h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5604h f11989b = new C5604h();

        public C5604h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The price is null.";
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$i */
    public static final class C5605i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11990b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5605i(int i) {
            super(0);
            this.f11990b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0071c.m191c(C0072d.m201h("The requested purchase quantity of "), this.f11990b, " is less than one. Invalid purchase");
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$j */
    public static final class C5606j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f11991b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5606j(int i) {
            super(0);
            this.f11991b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0071c.m191c(C0072d.m201h("The requested purchase quantity of "), this.f11991b, " is greater than the maximum of 100");
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$k */
    public static final class C5607k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5607k f11992b = new C5607k();

        public C5607k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Campaign ID cannot be null or blank";
        }
    }

    /* renamed from: com.braze.support.ValidationUtils$l */
    public static final class C5608l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5608l f11993b = new C5608l();

        public C5608l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Push story page ID cannot be null or blank";
        }
    }

    /* renamed from: a */
    public static final String m11346a(String str) {
        if (str == null || C19457k.m33020X0(str)) {
            return "";
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T obj = C19459m.m33035H1(str).toString();
        ref$ObjectRef.element = obj;
        int length = obj.length();
        ValidationUtils validationUtils = f11978a;
        if (length > 255) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, validationUtils, BrazeLogger.Priority.W, (Throwable) null, new C5597a(ref$ObjectRef), 6);
            T substring = ((String) ref$ObjectRef.element).substring(0, 255);
            C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ref$ObjectRef.element = substring;
        }
        return (String) ref$ObjectRef.element;
    }

    /* renamed from: b */
    public static final boolean m11347b(double d, double d2) {
        return d < 90.0d && d > -90.0d && d2 < 180.0d && d2 > -180.0d;
    }

    /* renamed from: c */
    public static final boolean m11348c(String str, C3551a5 a5Var) {
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        if (str == null || C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11978a, BrazeLogger.Priority.W, (Throwable) null, C5598b.f11983b, 6);
        } else if (!a5Var.mo13082c().contains(str)) {
            return true;
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11978a, BrazeLogger.Priority.W, (Throwable) null, new C5599c(str), 6);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m11349d(String str, String str2, BigDecimal bigDecimal, int i, C3551a5 a5Var) {
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        if (str3 == null || C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11978a, BrazeLogger.Priority.W, (Throwable) null, C5600d.f11985b, 6);
        } else if (a5Var.mo13083d().contains(str3)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11978a, BrazeLogger.Priority.W, (Throwable) null, new C5601e(str3), 6);
        } else {
            if (str4 == null || C19457k.m33020X0(str2)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f11978a, BrazeLogger.Priority.W, (Throwable) null, C5602f.f11987b, 6);
            } else {
                ValidationUtils validationUtils = f11978a;
                Set<String> set = f11979b;
                String obj = C19459m.m33035H1(str2).toString();
                Locale locale = Locale.US;
                C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
                String upperCase = obj.toUpperCase(locale);
                C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (!set.contains(upperCase)) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, validationUtils, BrazeLogger.Priority.W, (Throwable) null, new C5603g(str4), 6);
                } else if (bigDecimal == null) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, validationUtils, BrazeLogger.Priority.W, (Throwable) null, C5604h.f11989b, 6);
                } else if (i2 <= 0) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, validationUtils, BrazeLogger.Priority.W, (Throwable) null, new C5605i(i2), 6);
                } else if (i2 <= 100) {
                    return true;
                } else {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, validationUtils, BrazeLogger.Priority.W, (Throwable) null, new C5606j(i2), 6);
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m11350e(String str, String str2) {
        if (str == null || C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11978a, BrazeLogger.Priority.W, (Throwable) null, C5607k.f11992b, 6);
        } else {
            if (!(str2 == null || C19457k.m33020X0(str2))) {
                return true;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11978a, BrazeLogger.Priority.W, (Throwable) null, C5608l.f11993b, 6);
        }
        return false;
    }
}
