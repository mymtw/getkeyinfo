package com.paypal.pyplcheckout.services;

import com.paypal.pyplcheckout.BuildConfig;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.BeaverLoggerRequest;
import com.paypal.pyplcheckout.services.api.LogApi;
import com.paypal.pyplcheckout.services.callbacks.LogCallback;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.cli.HelpFormatter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010a9.C0048b;

public final class BeaverLogger {
    public static final BeaverLogger INSTANCE;
    private static final String TAG = "BeaverLogger";
    private static final Map<String, String> headers = new LinkedHashMap();

    static {
        BeaverLogger beaverLogger = new BeaverLogger();
        INSTANCE = beaverLogger;
        beaverLogger.setInitialHeaders();
        beaverLogger.userAgentCheck();
        logStartupInfo$default(beaverLogger, (LogApi) null, 1, (Object) null);
    }

    private BeaverLogger() {
    }

    private final void format(String str, Object obj) {
        String a = C0048b.m163a(" ", str, " ");
        PLog.d$default("IV1 ", " ", 0, 4, (Object) null);
        String format = String.format("%s%s%s", Arrays.copyOf(new Object[]{getSplitter(50), a, getSplitter(50)}, 3));
        C19383o.m32796f(format, "format(this, *args)");
        PLog.d$default("IV1 ", format, 0, 4, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        PLog.d$default("IV1 ", sb.toString(), 0, 4, (Object) null);
        PLog.d$default("IV1 ", getSplitter(a.length() + 100), 0, 4, (Object) null);
        PLog.d$default("IV1 ", " ", 0, 4, (Object) null);
    }

    private final DebugConfigManager getConfig() {
        DebugConfigManager instance = DebugConfigManager.getInstance();
        C19383o.m32796f(instance, "getInstance()");
        return instance;
    }

    public static /* synthetic */ JSONObject getFPTIPayload$default(BeaverLogger beaverLogger, JSONObject jSONObject, JSONObject jSONObject2, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        if ((i & 2) != 0) {
            jSONObject2 = null;
        }
        return beaverLogger.getFPTIPayload(jSONObject, jSONObject2);
    }

    public static /* synthetic */ void getHeaders$annotations() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return new org.json.JSONObject(r3.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object getJsonObjFromStr(java.lang.Object r3) {
        /*
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x000a }
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x000a }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x000a }
            goto L_0x000f
        L_0x000a:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0010 }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x0010 }
        L_0x000f:
            return r0
        L_0x0010:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.BeaverLogger.getJsonObjFromStr(java.lang.Object):java.lang.Object");
    }

    private final String getLoggedUserId() {
        String sdkSessionId = SdkComponent.Companion.getInstance().getInstrumentationSession().getSdkSessionId();
        return sdkSessionId == null ? "null_sdk_session_id" : sdkSessionId;
    }

    private final MerchantConfigRepository getMerchantConfigRepository() {
        return SdkComponent.Companion.getInstance().getMerchantConfigRepository();
    }

    private final String getSplitter(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < i) {
            i2++;
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "builder.toString()");
        return sb2;
    }

    public static /* synthetic */ void immediateFlush$default(BeaverLogger beaverLogger, JSONObject jSONObject, JSONObject jSONObject2, LogApi logApi, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        if ((i & 2) != 0) {
            jSONObject2 = null;
        }
        if ((i & 4) != 0) {
            logApi = new LogApi();
        }
        beaverLogger.immediateFlush(jSONObject, jSONObject2, logApi);
    }

    public static /* synthetic */ void info$default(BeaverLogger beaverLogger, String str, JSONObject jSONObject, LogApi logApi, int i, Object obj) {
        if ((i & 4) != 0) {
            logApi = new LogApi();
        }
        beaverLogger.info(str, jSONObject, logApi);
    }

    public static /* synthetic */ void logAmplitude$default(BeaverLogger beaverLogger, JSONObject jSONObject, Exception exc, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        if ((i & 2) != 0) {
            exc = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        beaverLogger.logAmplitude(jSONObject, exc, str);
    }

    public static /* synthetic */ void logStartupInfo$default(BeaverLogger beaverLogger, LogApi logApi, int i, Object obj) {
        if ((i & 1) != 0) {
            logApi = new LogApi();
        }
        beaverLogger.logStartupInfo(logApi);
    }

    private final void setInitialHeaders() {
        Map<String, String> map = headers;
        map.put("x-app-name", BuildConfig.APP_NAME);
        map.put("Content-type", "application/json");
        map.put("no-cache", "cache-control");
    }

    public static /* synthetic */ void track$default(BeaverLogger beaverLogger, JSONObject jSONObject, LogApi logApi, int i, Object obj) {
        if ((i & 2) != 0) {
            logApi = new LogApi();
        }
        beaverLogger.track(jSONObject, logApi);
    }

    public final JSONObject getFPTIPayload(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            jSONArray.put(jSONObject2);
            jSONObject3.put("events", jSONArray);
        }
        if (jSONObject != null) {
            jSONArray.put(jSONObject);
            jSONObject3.put("tracking", jSONArray);
        }
        return jSONObject3;
    }

    public final Map<String, String> getHeaders() {
        return headers;
    }

    public final void immediateFlush(JSONObject jSONObject, JSONObject jSONObject2, LogApi logApi) {
        C19383o.m32797g(logApi, "logAPI");
        try {
            logApi.setRequest(new BeaverLoggerRequest(getConfig().getCheckoutEnvironment().getLoggerUrl(), headers, getFPTIPayload(jSONObject, jSONObject2)));
            logApi.enqueueRequest(LogCallback.Companion.get());
        } catch (JSONException e) {
            String str = TAG;
            C19383o.m32796f(str, "TAG");
            PLog.e$default(str, "JSONException WHILE TRYING TO FLUSH THE LOGGER. " + e, (Throwable) null, 0, 12, (Object) null);
            logAmplitude(jSONObject, e, "BeaverLogger::immediateFlush()");
        }
    }

    public final void info(String str, JSONObject jSONObject, LogApi logApi) {
        C19383o.m32797g(str, "event");
        C19383o.m32797g(jSONObject, "payload");
        C19383o.m32797g(logApi, "logAPI");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", "info");
            jSONObject2.put("event", str);
            jSONObject2.put("timeStamp", System.currentTimeMillis());
            jSONObject2.put("payload", jSONObject);
            prettyLogger(jSONObject2);
            immediateFlush$default(this, (JSONObject) null, jSONObject2, logApi, 1, (Object) null);
        } catch (JSONException e) {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            PLog.e$default(str2, "JSONException WHILE TRYING TO ENQUEUE THE LOGGER. " + e, (Throwable) null, 0, 12, (Object) null);
        }
    }

    public final void logAmplitude(JSONObject jSONObject, Exception exc, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            BeaverLogger beaverLogger = INSTANCE;
            jSONObject.put("button_session_id", beaverLogger.getConfig().getButtonSessionId());
            jSONObject.put("user_id", beaverLogger.getLoggedUserId());
            jSONObject.put("called_from_function", str);
            jSONObject.put("info_msg", String.valueOf(exc));
            SdkComponent.Companion.getInstance().getAmplitudeManager().getLogger().logEvent(PEnums.TransitionName.FPTI_LOGGING_ERROR.toString(), jSONObject);
        } catch (Exception e) {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            PLog.eR$default(str2, "ERROR with data when logging to amplitudeexception. " + e, (Exception) null, 4, (Object) null);
        }
    }

    public final void logStartupInfo(LogApi logApi) {
        C19383o.m32797g(logApi, "logAPI");
        try {
            JSONObject jSONObject = new JSONObject();
            BeaverLogger beaverLogger = INSTANCE;
            jSONObject.put("kPYPLMerchantId", beaverLogger.getConfig().getClientId());
            jSONObject.put("kPYPLCheckoutToken", beaverLogger.getConfig().getCheckoutToken());
            jSONObject.put("kPYPLUniversalLink", beaverLogger.getMerchantConfigRepository().getMerchantReturnURLScheme());
            jSONObject.put("kPYPLCheckoutJSSession", beaverLogger.getConfig().checkCheckoutJSSession());
            info(PEnums.LogType.CAL.toString(), jSONObject, logApi);
        } catch (JSONException e) {
            JSONException jSONException = e;
            String str = TAG;
            C19383o.m32796f(str, "TAG");
            PLog.e$default(str, "JSONException WHILE TRYING TO GENERATE THE PAYLOAD HEADER." + jSONException, (Throwable) null, 0, 12, (Object) null);
            logAmplitude$default(this, (JSONObject) null, jSONException, "BeaverLogger::logStartupInfo()", 1, (Object) null);
        }
    }

    public final void prettyLogger(Object obj) {
        C19383o.m32797g(obj, "source");
        Object jsonObjFromStr = getJsonObjFromStr(obj);
        if (jsonObjFromStr != null) {
            try {
                if (jsonObjFromStr instanceof JSONObject) {
                    String jSONObject = ((JSONObject) jsonObjFromStr).toString(2);
                    C19383o.m32796f(jSONObject, "logObject.toString(2)");
                    format("INST_VALIDATION", jSONObject);
                } else if (jsonObjFromStr instanceof JSONArray) {
                    String jSONArray = ((JSONArray) jsonObjFromStr).toString(2);
                    C19383o.m32796f(jSONArray, "logObject.toString(2)");
                    format("INST_VALIDATION", jSONArray);
                } else {
                    format("INST_VALIDATION", obj);
                }
            } catch (JSONException unused) {
                format("INST_VALIDATION", obj);
            }
        } else {
            format("INST_VALIDATION", obj);
        }
    }

    public final void track(JSONObject jSONObject, LogApi logApi) {
        C19383o.m32797g(jSONObject, "payload");
        C19383o.m32797g(logApi, "logAPI");
        prettyLogger(jSONObject);
        immediateFlush$default(this, jSONObject, (JSONObject) null, logApi, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d A[Catch:{ Exception -> 0x0075 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void userAgentCheck() {
        /*
            r8 = this;
            java.lang.String r0 = "/"
            java.lang.String r1 = " "
            com.paypal.pyplcheckout.model.DebugConfigManager r2 = r8.getConfig()     // Catch:{ Exception -> 0x0075 }
            android.content.Context r2 = r2.getProviderContext()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r3 = "Undefined"
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            r4 = r3
            goto L_0x001b
        L_0x0012:
            int r4 = com.paypal.pyplcheckout.C17165R.string.paypal_checkout_sdk_app_name     // Catch:{ Exception -> 0x0075 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Exception -> 0x0075 }
            if (r4 != 0) goto L_0x001b
            goto L_0x0010
        L_0x001b:
            if (r2 == 0) goto L_0x0025
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ Exception -> 0x0075 }
        L_0x0025:
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0075 }
            java.lang.String r5 = "MODEL"
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)     // Catch:{ Exception -> 0x0075 }
            kotlin.text.Regex r5 = new kotlin.text.Regex     // Catch:{ Exception -> 0x0075 }
            r5.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r6 = "_"
            java.lang.String r2 = r5.replace((java.lang.CharSequence) r2, (java.lang.String) r6)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = com.paypal.pyplcheckout.utils.StringExtensionsKt.lowercase(r2)     // Catch:{ Exception -> 0x0075 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0075 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
            r6.<init>()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r7 = "NativeCheckout/"
            r6.append(r7)     // Catch:{ Exception -> 0x0075 }
            r6.append(r2)     // Catch:{ Exception -> 0x0075 }
            r6.append(r0)     // Catch:{ Exception -> 0x0075 }
            r6.append(r5)     // Catch:{ Exception -> 0x0075 }
            r6.append(r1)     // Catch:{ Exception -> 0x0075 }
            r6.append(r4)     // Catch:{ Exception -> 0x0075 }
            r6.append(r0)     // Catch:{ Exception -> 0x0075 }
            r6.append(r3)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0075 }
            java.util.Map<java.lang.String, java.lang.String> r1 = headers     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = "User-Agent"
            kotlin.text.Regex r3 = new kotlin.text.Regex     // Catch:{ Exception -> 0x0075 }
            java.lang.String r4 = "[^\\x20-\\x7E]"
            r3.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r4 = ""
            java.lang.String r0 = r3.replace((java.lang.CharSequence) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x0075 }
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0075 }
            goto L_0x008c
        L_0x0075:
            r0 = move-exception
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.String r4 = "BeaverLogger::userAgentCheck()"
            r1 = r8
            r3 = r0
            logAmplitude$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = TAG
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            java.lang.String r2 = "error in adding logger header"
            com.paypal.pyplcheckout.common.instrumentation.PLog.m28733eR(r1, r2, r0)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.BeaverLogger.userAgentCheck():void");
    }
}
