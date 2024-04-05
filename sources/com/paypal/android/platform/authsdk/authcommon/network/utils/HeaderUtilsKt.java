package com.paypal.android.platform.authsdk.authcommon.network.utils;

import java.util.Arrays;
import kotlin.jvm.internal.C19383o;

public final class HeaderUtilsKt {
    private static final String APP_GUID_KEY = "appGuid";
    private static final String APP_NAME_KEY = "appName";
    private static final String APP_VERSION_KEY = "appVersion";
    private static final String DEVICE_ID_KEY = "deviceId";
    private static final String DEVICE_LANGUAGE_KEY = "deviceLanguage";
    private static final String DEVICE_LOCAL_KEY = "deviceLocale";
    private static final String DEVICE_LOCATION_COUNTRY_KEY = "deviceLocationCountry";
    private static final String DEVICE_MAKE_KEY = "deviceMake";
    private static final String DEVICE_MODEL_KEY = "deviceModel";
    private static final String DEVICE_NETWORK_CARRIER_KEY = "deviceNetworkCarrier";
    private static final String DEVICE_NETWORK_TYPE_KEY = "deviceNetworkType";
    private static final String DEVICE_OS_KEY = "deviceOS";
    private static final String DEVICE_OS_VERSION_KEY = "deviceOSVersion";
    private static final String DEVICE_TYPE_KEY = "deviceType";
    private static final String RISK_VISITOR_ID = "riskVisitorId";
    private static final String SDK_VERSION_KEY = "sdkVersion";
    private static final String TAG = "AUTH_HEADERUTILS";
    private static final String VISITOR_ID_KEY = "visitorId";
    private static final String XPAYPAL_CONSUMERAPP_CONTEXT_KEY = "X-PayPal-ConsumerApp-Context";

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[Catch:{ JSONException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[Catch:{ JSONException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ce A[Catch:{ JSONException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cf A[Catch:{ JSONException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map<java.lang.String, java.lang.String> createPayPalConsumerAppContextHeader(com.paypal.android.platform.authsdk.authcommon.model.DeviceInfo r6, com.paypal.android.platform.authsdk.authcommon.model.AppInfo r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "thirdParty"
            java.lang.String r1 = "deviceInfo"
            kotlin.jvm.internal.C19383o.m32797g(r6, r1)
            java.lang.String r1 = "appInfo"
            kotlin.jvm.internal.C19383o.m32797g(r7, r1)
            java.lang.String r1 = "appGuid"
            kotlin.jvm.internal.C19383o.m32797g(r8, r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r2)
            r2 = 1
            java.lang.String r4 = "visitorId"
            java.lang.String r5 = r6.getId()     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r5 = escapeValue(r5)     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r4 = r6.getCountryCode()     // Catch:{ JSONException -> 0x00d5 }
            if (r4 == 0) goto L_0x0038
            int r4 = r4.length()     // Catch:{ JSONException -> 0x00d5 }
            if (r4 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r4 = 0
            goto L_0x0039
        L_0x0038:
            r4 = r2
        L_0x0039:
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "deviceLocationCountry"
            java.lang.String r5 = r6.getCountryCode()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x00d5 }
        L_0x0044:
            java.util.Locale r4 = r7.getLocale()     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r5 = "deviceLocale"
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r5 = "deviceLanguage"
            java.lang.String r4 = r4.getLanguage()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x00d5 }
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r0, r0)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r5 = "appName"
            if (r4 == 0) goto L_0x0064
            java.lang.String r4 = "com.paypal.thirdpartysdk"
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x00d5 }
            goto L_0x006b
        L_0x0064:
            java.lang.String r4 = r7.getName()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x00d5 }
        L_0x006b:
            r3.put(r1, r8)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r8 = "appVersion"
            java.lang.String r1 = r7.getVersion()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r8, r1)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r8 = "sdkVersion"
            java.lang.String r7 = r7.getSdkVersion()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r8, r7)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r7 = "deviceOS"
            java.lang.String r8 = r6.getOs()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r7, r8)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r7 = "deviceOSVersion"
            java.lang.String r8 = r6.getOsVersion()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r7, r8)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r7 = "deviceMake"
            java.lang.String r8 = r6.getMake()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r7, r8)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r7 = "deviceModel"
            java.lang.String r8 = r6.getModel()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r7, r8)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r7 = "deviceType"
            java.lang.String r8 = r6.getType()     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r8 = escapeValue(r8)     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r7, r8)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r7 = "deviceNetworkType"
            java.lang.String r8 = r6.getNetworkType()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r7, r8)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r7 = "deviceNetworkCarrier"
            java.lang.String r8 = r6.getNetworkCarrier()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r7, r8)     // Catch:{ JSONException -> 0x00d5 }
            java.lang.String r7 = "deviceId"
            java.lang.String r6 = r6.getId()     // Catch:{ JSONException -> 0x00d5 }
            r3.put(r7, r6)     // Catch:{ JSONException -> 0x00d5 }
            if (r9 != 0) goto L_0x00cf
            goto L_0x00ec
        L_0x00cf:
            java.lang.String r6 = "riskVisitorId"
            r3.put(r6, r9)     // Catch:{ JSONException -> 0x00d5 }
            goto L_0x00ec
        L_0x00d5:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Exception parsing Json "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "AUTH_HEADERUTILS"
            android.util.Log.d(r7, r6)
        L_0x00ec:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r2)
            java.lang.String r7 = r3.toString()
            java.lang.String r8 = "contextHeader.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)
            java.lang.String r7 = com.paypal.android.platform.authsdk.authcommon.utils.StringUtilsKt.encodeString(r7)
            if (r7 != 0) goto L_0x0102
            java.lang.String r7 = ""
        L_0x0102:
            java.lang.String r8 = "X-PayPal-ConsumerApp-Context"
            r6.put(r8, r7)
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r0, r0)
            if (r7 == 0) goto L_0x0114
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = "Android"
            r6.put(r7, r8)
        L_0x0114:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.network.utils.HeaderUtilsKt.createPayPalConsumerAppContextHeader(com.paypal.android.platform.authsdk.authcommon.model.DeviceInfo, com.paypal.android.platform.authsdk.authcommon.model.AppInfo, java.lang.String, java.lang.String):java.util.Map");
    }

    private static final String escapeValue(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt == '\"' || charAt == '\\') || charAt == '/') {
                    sb.append('\\');
                    sb.append(charAt);
                } else if (charAt == 9) {
                    sb.append("\\t");
                } else if (charAt == 8) {
                    sb.append("\\b");
                } else if (charAt == 10) {
                    sb.append("\\n");
                } else if (charAt == 13) {
                    sb.append("\\r");
                } else if (charAt == '$') {
                    sb.append("\\$");
                } else if (charAt <= 31) {
                    String format = String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(charAt)}, 1));
                    C19383o.m32796f(format, "format(format, *args)");
                    sb.append(format);
                } else {
                    sb.append(charAt);
                }
            }
        }
        return sb.toString();
    }
}
