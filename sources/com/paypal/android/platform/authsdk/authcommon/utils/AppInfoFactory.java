package com.paypal.android.platform.authsdk.authcommon.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.model.AppInfo;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AppInfoFactory {
    public static final AppInfoFactory INSTANCE = new AppInfoFactory();

    private AppInfoFactory() {
    }

    private final String lookUpAppVersion(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            C19383o.m32796f(str, "appContext.packageManage…ckageName, 0).versionName");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "Unknown";
        }
    }

    private final String lookupClientPlatform(Context context) {
        Object systemService = context.getSystemService(ResponseConstants.PHONE);
        if (systemService != null) {
            return ((TelephonyManager) systemService).getPhoneType() == 2 ? "AndroidCDMA" : "AndroidGSM";
        }
        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    public final AppInfo create(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Context applicationContext = context.getApplicationContext();
        C19383o.m32796f(applicationContext, "appContext");
        String lookupClientPlatform = lookupClientPlatform(applicationContext);
        String lookUpAppVersion = lookUpAppVersion(applicationContext);
        String packageName = applicationContext.getPackageName();
        C19383o.m32796f(packageName, "appContext.packageName");
        Locale locale = applicationContext.getResources().getConfiguration().locale;
        C19383o.m32796f(locale, "appContext.resources.configuration.locale");
        return new AppInfo(lookupClientPlatform, lookUpAppVersion, packageName, (String) null, locale, 8, (DefaultConstructorMarker) null);
    }
}
