package com.etsy.android.config.flags.p073ui;

import android.support.p013v4.media.session.C0087d;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: com.etsy.android.config.flags.ui.ConfigFlagOrigin */
public enum ConfigFlagOrigin {
    SERVER,
    COMPILED,
    OVERWRITTEN;

    public String toString() {
        String str;
        String name = name();
        Locale locale = Locale.ROOT;
        String g = C0087d.m237g(locale, "ROOT", name, locale, "this as java.lang.String).toLowerCase(locale)");
        if (!(g.length() > 0)) {
            return g;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = g.charAt(0);
        if (Character.isLowerCase(charAt)) {
            C19383o.m32796f(locale, "ROOT");
            str = C17782b.m29879p0(charAt, locale);
        } else {
            str = String.valueOf(charAt);
        }
        sb.append(str);
        String substring = g.substring(1);
        C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }
}
