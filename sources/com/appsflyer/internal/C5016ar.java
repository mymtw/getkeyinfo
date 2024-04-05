package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;

/* renamed from: com.appsflyer.internal.ar */
public final class C5016ar {
    public static Uri AFInAppEventParameterName(Activity activity) {
        return activity.getReferrer();
    }
}
