package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.appsflyer.internal.f */
public abstract class C5089f {
    public final Map<String, Object> AFInAppEventParameterName;
    public Map<String, Object> AFInAppEventType;
    public AppsFlyerRequestListener AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public byte[] getLevel;
    public String init;
    public int onAttributionFailureNative;
    private final boolean onDeepLinkingNative;
    public boolean onInstallConversionDataLoadedNative;
    public String onInstallConversionFailureNative;
    public String valueOf;
    public Application values;

    public C5089f() {
        this((String) null, (String) null, (Boolean) null, (Context) null);
    }

    public final boolean AFInAppEventType() {
        return this.onInstallConversionDataLoadedNative;
    }

    public C5089f AFKeystoreWrapper(String str) {
        this.onInstallConversionFailureNative = str;
        return this;
    }

    public final boolean valueOf() {
        return this.onDeepLinkingNative;
    }

    public final byte[] values() {
        return this.getLevel;
    }

    public C5089f(String str, String str2, Boolean bool, Context context) {
        this.AFInAppEventParameterName = new HashMap();
        this.AFLogger$LogLevel = str;
        this.onInstallConversionFailureNative = str2;
        this.onDeepLinkingNative = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.values = (Application) context.getApplicationContext();
        }
    }

    public final C5089f AFInAppEventType(Map<String, ?> map) {
        this.AFInAppEventParameterName.putAll(map);
        return this;
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    public final String values(String str) {
        String AFInAppEventType2 = C4986ag.AFInAppEventType().AFInAppEventType((Context) this.values);
        return AFInAppEventType2 != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, AFInAppEventType2).build().toString() : str;
    }
}
