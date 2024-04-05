package com.paypal.pyplcheckout.utils;

import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;

public final class StringExtensionsKt$camelCase$1 extends Lambda implements C19857l<String, CharSequence> {
    public static final StringExtensionsKt$camelCase$1 INSTANCE = new StringExtensionsKt$camelCase$1();

    public StringExtensionsKt$camelCase$1() {
        super(1);
    }

    public final CharSequence invoke(String str) {
        C19383o.m32797g(str, "word");
        String lowercase = StringExtensionsKt.lowercase(str);
        if (!(lowercase.length() > 0)) {
            return lowercase;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = lowercase.charAt(0);
        Locale locale = Locale.getDefault();
        C19383o.m32796f(locale, "getDefault()");
        sb.append(C17782b.m29879p0(charAt, locale));
        String substring = lowercase.substring(1);
        C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }
}
