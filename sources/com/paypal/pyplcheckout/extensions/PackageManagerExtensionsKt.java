package com.paypal.pyplcheckout.extensions;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.utils.BrowserPackages;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;

public final class PackageManagerExtensionsKt {
    public static final boolean isPackageEnabled(PackageManager packageManager) {
        C19383o.m32797g(packageManager, "<this>");
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(BrowserPackages.CHROME_PACKAGE, 0);
            C19383o.m32796f(applicationInfo, "this.getApplicationInfo(…ckages.CHROME_PACKAGE, 0)");
            return applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            String str = PYPLCheckoutUtils.TAG;
            PLog.e$default(str, "THE GIVEN PACKAGE OR COMPONENT NAME CANNOT BE FOUND." + e, (Throwable) null, 0, 12, (Object) null);
            return false;
        }
    }

    public static final boolean isPackageInstalled(PackageManager packageManager, String str) {
        C19383o.m32797g(packageManager, "<this>");
        if (str != null) {
            try {
                packageManager.getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }
}
