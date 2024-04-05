package com.appsflyer.internal;

import android.content.Context;

/* renamed from: com.appsflyer.internal.bs */
public final class C5053bs {
    public static boolean AFInAppEventType(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
