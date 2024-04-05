package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.appsflyer.internal.au */
public final class C5021au {
    public final SharedPreferences AFInAppEventParameterName;
    public final Application AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper = new ConcurrentHashMap();

    public C5021au(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.AFInAppEventType = application;
        this.AFInAppEventParameterName = C4986ag.AFInAppEventParameterName((Context) application);
    }

    public final boolean AFInAppEventType() {
        C4986ag.AFInAppEventType();
        return C4986ag.AFInAppEventType(this.AFInAppEventParameterName, "appsFlyerCount", false) == 0;
    }
}
