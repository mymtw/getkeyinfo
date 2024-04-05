package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.as */
final class C5017as extends C5001aj {
    public C5018a AFInAppEventType;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    public boolean valueOf = false;

    /* renamed from: com.appsflyer.internal.as$a */
    public interface C5018a {
        void valueOf(String str);

        void values(Map<String, String> map);
    }

    public C5017as(Uri uri, C4986ag agVar, Context context) {
        super(agVar, context, "GET");
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            String[] strArr = {"onelink.me", "onelnk.com", "app.aflink.com"};
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                if (uri.getHost().contains(strArr[i])) {
                    z = true;
                }
            }
            if (C5095j.AFLogger$LogLevel != null) {
                StringBuilder sb = new StringBuilder("Validate if link ");
                sb.append(uri);
                sb.append(" belongs to custom domains: ");
                sb.append(Arrays.asList(C5095j.AFLogger$LogLevel));
                AFLogger.AFKeystoreWrapper(sb.toString());
                for (String str : C5095j.AFLogger$LogLevel) {
                    if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                        AFLogger.valueOf("Link matches custom domain: ".concat(String.valueOf(str)));
                        this.valueOf = true;
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.values = split[1];
                this.getLevel = split[2];
                this.AppsFlyer2dXConversionCallback = uri.toString();
            }
        }
    }

    public final boolean AFInAppEventParameterName() {
        return !TextUtils.isEmpty(this.values) && !TextUtils.isEmpty(this.getLevel) && !this.values.equals("app");
    }

    public final void valueOf(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.AFVersionDeclaration);
        String valueOf2 = String.valueOf(this.init.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", valueOf2);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.init.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.init.get("model")));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.init.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.init.get("sdk")));
        AFInAppEventType(httpsURLConnection, this.AFInAppEventParameterName, this.AFVersionDeclaration, this.values, this.getLevel, valueOf2);
    }

    public final void values(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.AFInAppEventType.values(hashMap);
        } catch (JSONException e) {
            this.AFInAppEventType.valueOf("Can't parse OneLink data");
            AFLogger.AFKeystoreWrapper("Error while parsing to json ".concat(String.valueOf(str)), (Throwable) e);
        }
    }

    public final String valueOf() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(C5001aj.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()}));
        sb.append("/");
        sb.append(this.values);
        sb.append("?id=");
        sb.append(this.getLevel);
        return sb.toString();
    }

    public final void values() {
        String str = this.AppsFlyer2dXConversionCallback;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.AFInAppEventType.valueOf(str);
    }
}
