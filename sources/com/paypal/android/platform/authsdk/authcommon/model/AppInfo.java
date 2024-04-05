package com.paypal.android.platform.authsdk.authcommon.model;

import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.utils.StringUtilsKt;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

public final class AppInfo {
    private final String TAG;
    private final String clientPlatform;
    private final Locale locale;
    private final String name;
    private final String sdkVersion;
    private final String version;

    public AppInfo(String str, String str2, String str3, String str4, Locale locale2) {
        C19383o.m32797g(str, "clientPlatform");
        C19383o.m32797g(str2, ResponseConstants.VERSION);
        C19383o.m32797g(str3, "name");
        C19383o.m32797g(str4, "sdkVersion");
        C19383o.m32797g(locale2, "locale");
        this.clientPlatform = str;
        this.version = str2;
        this.name = str3;
        this.sdkVersion = str4;
        this.locale = locale2;
        this.TAG = "AppInfo";
    }

    public final String getClientPlatform() {
        return this.clientPlatform;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParameterValue(String str, String str2) {
        C19383o.m32797g(str, "appGuid");
        C19383o.m32797g(str2, "deviceAppId");
        String str3 = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_app_id", str2);
            jSONObject.put("client_platform", this.clientPlatform);
            jSONObject.put("app_version", StringUtilsKt.getFilteredVersion(this.version));
            jSONObject.put("app_category", "3");
            jSONObject.put(EventsNameKt.APP_GUID, str);
            if (str3.length() == 0) {
                str3 = "disabled";
            }
            jSONObject.put("push_notification_id", str3);
        } catch (JSONException e) {
            String str4 = this.TAG;
            Log.w(str4, "Failed to generate app info " + e + ".t");
        }
        String jSONObject2 = jSONObject.toString();
        C19383o.m32796f(jSONObject2, "data.toString()");
        return jSONObject2;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppInfo(String str, String str2, String str3, String str4, Locale locale2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "Version Name" : str4, locale2);
    }
}
