package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.C4986ag;
import com.appsflyer.internal.C5082cp;
import com.appsflyer.internal.C5097l;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkGenerator {
    private final String AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String onAppOpenAttributionNative;
    private final Map<String, String> onAttributionFailureNative = new HashMap();
    private final Map<String, String> onDeepLinkingNative = new HashMap();
    private String onInstallConversionDataLoadedNative;
    private String valueOf;
    private String values;

    public LinkGenerator(String str) {
        this.AFInAppEventParameterName = str;
    }

    private Map<String, String> AFInAppEventParameterName() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onDeepLinkingNative.clear();
        this.onDeepLinkingNative.put("pid", this.AFInAppEventParameterName);
        linkedHashMap.put("pid", valueOf(this.AFInAppEventParameterName, "media source"));
        String str = this.AppsFlyer2dXConversionCallback;
        if (str != null) {
            this.onDeepLinkingNative.put("af_referrer_uid", str);
            linkedHashMap.put("af_referrer_uid", valueOf(this.AppsFlyer2dXConversionCallback, "referrerUID"));
        }
        String str2 = this.valueOf;
        if (str2 != null) {
            this.onDeepLinkingNative.put(AFInAppEventParameterName.AF_CHANNEL, str2);
            linkedHashMap.put(AFInAppEventParameterName.AF_CHANNEL, valueOf(this.valueOf, AppsFlyerProperties.CHANNEL));
        }
        String str3 = this.AFLogger$LogLevel;
        if (str3 != null) {
            this.onDeepLinkingNative.put("af_referrer_customer_id", str3);
            linkedHashMap.put("af_referrer_customer_id", valueOf(this.AFLogger$LogLevel, "referrerCustomerId"));
        }
        String str4 = this.values;
        if (str4 != null) {
            this.onDeepLinkingNative.put("c", str4);
            linkedHashMap.put("c", valueOf(this.values, "campaign"));
        }
        String str5 = this.init;
        if (str5 != null) {
            this.onDeepLinkingNative.put("af_referrer_name", str5);
            linkedHashMap.put("af_referrer_name", valueOf(this.init, "referrerName"));
        }
        String str6 = this.AFVersionDeclaration;
        if (str6 != null) {
            this.onDeepLinkingNative.put("af_referrer_image_url", str6);
            linkedHashMap.put("af_referrer_image_url", valueOf(this.AFVersionDeclaration, "referrerImageURL"));
        }
        if (this.onInstallConversionDataLoadedNative != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.onInstallConversionDataLoadedNative);
            String str7 = this.getLevel;
            if (str7 != null) {
                String str8 = "";
                this.getLevel = str7.replaceFirst("^[/]", str8);
                if (!this.onInstallConversionDataLoadedNative.endsWith("/")) {
                    str8 = "/";
                }
                sb.append(str8);
                sb.append(this.getLevel);
            }
            String obj = sb.toString();
            this.onDeepLinkingNative.put("af_dp", obj);
            linkedHashMap.put("af_dp", valueOf(obj, "deepLink"));
        }
        for (Map.Entry next : this.onAttributionFailureNative.entrySet()) {
            this.onDeepLinkingNative.put(next.getKey(), next.getValue());
            linkedHashMap.put(next.getKey(), valueOf((String) next.getValue(), (String) next.getKey()));
        }
        return linkedHashMap;
    }

    private static String valueOf(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.AFKeystoreWrapper(sb.toString(), (Throwable) e);
            return "";
        } catch (Throwable th) {
            AFLogger.values(th);
            return "";
        }
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.onAttributionFailureNative.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.onAttributionFailureNative.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventType;
        if (str == null || !str.startsWith("http")) {
            sb.append(String.format(C5082cp.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()}));
        } else {
            sb.append(this.AFInAppEventType);
        }
        if (this.AFKeystoreWrapper != null) {
            sb.append(JsonPointer.SEPARATOR);
            sb.append(this.AFKeystoreWrapper);
        }
        sb.append(valueOf(AFInAppEventParameterName()));
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.onAppOpenAttributionNative;
    }

    public String getCampaign() {
        return this.values;
    }

    public String getChannel() {
        return this.valueOf;
    }

    public String getMediaSource() {
        return this.AFInAppEventParameterName;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.onAttributionFailureNative);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.onInstallConversionDataLoadedNative = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventType = String.format("https://%s/%s", new Object[]{String.format("%sapp.%s", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()}), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFInAppEventType = String.format("https://%s/%s", new Object[]{str2, str});
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.onAppOpenAttributionNative = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.values = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.getLevel = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.init = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AppsFlyer2dXConversionCallback = str;
        return this;
    }

    private static String valueOf(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() == 0) {
                sb.append(RFC1522Codec.SEP);
            } else {
                sb.append('&');
            }
            sb.append(valueOf((String) next.getKey(), (String) next.getKey()));
            sb.append('=');
            sb.append((String) next.getValue());
        }
        return sb.toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        AFInAppEventParameterName();
        String str = this.onAppOpenAttributionNative;
        Map<String, String> map = this.onDeepLinkingNative;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, C4986ag.AFInAppEventType(), context);
        createOneLinkHttpTask.AFInAppEventType = responseListener;
        createOneLinkHttpTask.valueOf = str;
        if (C5097l.AFInAppEventType == null) {
            C5097l.AFInAppEventType = new C5097l();
        }
        C5097l.AFInAppEventType.valueOf().execute(createOneLinkHttpTask);
    }
}
