package com.appboy.support;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;

public class PackageUtils {
    private static final String TAG = BrazeLogger.m11287i(PackageUtils.class);
    private static String sPackageName;

    public static String getResourcePackageName(Context context) {
        String str = sPackageName;
        if (str != null) {
            return str;
        }
        String packageName = context.getPackageName();
        sPackageName = packageName;
        return packageName;
    }

    public static void setResourcePackageName(String str) {
        if (!StringUtils.m11343d(str)) {
            sPackageName = str;
        } else {
            BrazeLogger.m11292n(TAG, "Package name may not be null or blank");
        }
    }
}
