package com.braze.push.support;

import android.text.Html;
import android.text.Spanned;
import com.appboy.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

public final class HtmlUtils {

    /* renamed from: a */
    public static final String f11863a = C19383o.m32802l("HtmlUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: a */
    public static final CharSequence m11217a(String str, BrazeConfigurationProvider brazeConfigurationProvider) {
        C19383o.m32797g(str, "<this>");
        if (C19457k.m33020X0(str)) {
            BrazeLogger.m11283e(f11863a, (BrazeLogger.Priority) null, (Throwable) null, HtmlUtils$getHtmlSpannedTextIfEnabled$1.INSTANCE, 14);
            return str;
        } else if (!brazeConfigurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            return str;
        } else {
            Spanned fromHtml = Html.fromHtml(str, 0);
            C19383o.m32796f(fromHtml, "{\n        if (Build.VERS…tml(this)\n        }\n    }");
            return fromHtml;
        }
    }
}
