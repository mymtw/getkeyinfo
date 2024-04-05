package com.paypal.android.platform.authsdk.authcommon.security.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ResourceUtils {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @TargetApi(24)
        private final void setSystemLocale(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }

        private final void setSystemLocaleLegacy(Configuration configuration, Locale locale) {
            configuration.locale = locale;
        }

        public final void setLocale$auth_sdk_thirdPartyRelease(Context context, Locale locale) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(locale, "locale");
            Locale.setDefault(locale);
            Resources resources = context.getResources();
            C19383o.m32796f(resources, "context.getResources()");
            Configuration configuration = resources.getConfiguration();
            C19383o.m32796f(configuration, "config");
            setSystemLocale(configuration, locale);
        }
    }
}
