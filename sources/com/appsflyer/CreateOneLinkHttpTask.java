package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.C4986ag;
import com.appsflyer.internal.C5001aj;
import com.appsflyer.internal.C5100n;
import com.appsflyer.share.LinkGenerator;
import com.etsy.android.lib.models.editable.EditableListing;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class CreateOneLinkHttpTask extends C5001aj {
    public ResponseListener AFInAppEventType;
    private final Map<String, String> AFLogger$LogLevel;
    private String AppsFlyer2dXConversionCallback = "";
    private final String getLevel;
    public String valueOf;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, C4986ag agVar, Context context) {
        super(agVar, context, "POST");
        if (context != null) {
            this.AppsFlyer2dXConversionCallback = context.getPackageName();
        } else {
            AFLogger.AppsFlyer2dXConversionCallback("CreateOneLinkHttpTask: context can't be null");
        }
        this.values = str;
        this.getLevel = EditableListing.LISTING_ID_DEVICE_DRAFT;
        this.AFLogger$LogLevel = map;
    }

    public final void valueOf(HttpsURLConnection httpsURLConnection) throws IOException {
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", this.getLevel);
        hashMap.put("uuid", this.AFVersionDeclaration);
        hashMap.put("data", this.AFLogger$LogLevel);
        hashMap.put("meta", this.init);
        String str = this.valueOf;
        if (str != null) {
            hashMap.put("brand_domain", str);
        }
        String jSONObject = C5100n.AFKeystoreWrapper(hashMap).toString();
        AFInAppEventType(httpsURLConnection, this.AFInAppEventParameterName, jSONObject);
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    public final void values(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.AFInAppEventType.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e) {
            this.AFInAppEventType.onResponseError("Can't parse one link data");
            AFLogger.AFKeystoreWrapper("Error while parsing to json ".concat(String.valueOf(str)), (Throwable) e);
        }
    }

    public final void values() {
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.values, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.AppsFlyer2dXConversionCallback).addParameter("af_siteid", this.AppsFlyer2dXConversionCallback).addParameters(this.AFLogger$LogLevel);
        C4986ag.AFInAppEventType();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.AFInAppEventType.onResponse(addParameters.generateLink());
    }

    public final String valueOf() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(C5001aj.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()}));
        sb.append("/");
        sb.append(this.values);
        return sb.toString();
    }
}
