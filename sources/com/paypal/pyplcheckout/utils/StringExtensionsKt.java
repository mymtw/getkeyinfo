package com.paypal.pyplcheckout.utils;

import android.support.p013v4.media.session.C0087d;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import java.util.Locale;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19451e;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import p753kq.C19857l;

public final class StringExtensionsKt {
    private static final Regex camel = new Regex("(?<=[a-zA-Z])[A-Z]");

    private static final String appendQueryParam(String str, String str2, String str3) {
        char c = RFC1522Codec.SEP;
        if (C19459m.m33037f1(str, RFC1522Codec.SEP)) {
            c = '&';
        }
        return str + c + str2 + "=" + str3;
    }

    public static final String camelCase(String str) {
        C19383o.m32797g(str, "<this>");
        return C19327t.m32644Z0(C19459m.m33056y1(str, new String[]{" "}, 0, 6), " ", (String) null, (String) null, StringExtensionsKt$camelCase$1.INSTANCE, 30);
    }

    public static final String cleanseReturnUrl(String str, String str2) {
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, UrlConstantsKt.URL_PARAM_OP_TYPE);
        String appendQueryParam = !C19459m.m33036e1(str, UrlConstantsKt.URL_PARAM_OP_TYPE, false) ? appendQueryParam(str, UrlConstantsKt.URL_PARAM_OP_TYPE, str2) : str;
        if (!C19459m.m33036e1(str, UrlConstantsKt.URL_PARAM_PAYER_ID, false)) {
            String userId = DebugConfigManager.getInstance().getUserId();
            C19383o.m32796f(userId, "getInstance().userId");
            appendQueryParam = appendQueryParam(appendQueryParam, UrlConstantsKt.URL_PARAM_PAYER_ID, userId);
        }
        if (C19459m.m33036e1(appendQueryParam, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, false)) {
            return appendQueryParam;
        }
        String checkoutToken = DebugConfigManager.getInstance().getCheckoutToken();
        C19383o.m32796f(checkoutToken, "getInstance().checkoutToken");
        return appendQueryParam(appendQueryParam, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, checkoutToken);
    }

    public static final String lowercase(String str) {
        C19383o.m32797g(str, "<this>");
        Locale locale = Locale.getDefault();
        C19383o.m32796f(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final String nullIfNullOrEmpty(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final String toSnakeCase(String str) {
        C19383o.m32797g(str, "<this>");
        String replace = camel.replace((CharSequence) str, (C19857l<? super C19451e, ? extends CharSequence>) StringExtensionsKt$toSnakeCase$1.INSTANCE);
        Locale locale = Locale.ROOT;
        return C0087d.m237g(locale, "ROOT", replace, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public static final String uppercase(String str) {
        C19383o.m32797g(str, "<this>");
        Locale locale = Locale.getDefault();
        C19383o.m32796f(locale, "getDefault()");
        String upperCase = str.toUpperCase(locale);
        C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
