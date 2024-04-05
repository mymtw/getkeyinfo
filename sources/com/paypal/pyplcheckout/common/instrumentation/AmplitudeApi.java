package com.paypal.pyplcheckout.common.instrumentation;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeSession;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeUploadRequest;
import com.paypal.pyplcheckout.common.instrumentation.amplitude.models.DeviceInfo;
import com.paypal.pyplcheckout.utils.AmplitudeUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20002r;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.C20016y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AmplitudeApi {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "AmplitudeApi";
    /* access modifiers changed from: private */
    public final AmplitudeUtils amplitudeUtils;
    private final C19285c apiKey$delegate = C19350d.m32677b(new AmplitudeApi$apiKey$2(this));
    private final DeviceInfo deviceInfo;
    private final C16708i gson;
    private final C20009t okHttpClient;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return AmplitudeApi.TAG;
        }
    }

    public AmplitudeApi(AmplitudeUtils amplitudeUtils2, C20009t tVar, C16708i iVar, DeviceInfo deviceInfo2) {
        C19383o.m32797g(amplitudeUtils2, "amplitudeUtils");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(iVar, "gson");
        C19383o.m32797g(deviceInfo2, "deviceInfo");
        this.amplitudeUtils = amplitudeUtils2;
        this.okHttpClient = tVar;
        this.gson = iVar;
        this.deviceInfo = deviceInfo2;
    }

    private final C20011u buildRequest(AmplitudeUploadRequest amplitudeUploadRequest) {
        C20011u.C20012a aVar = new C20011u.C20012a();
        aVar.mo73003f("https://api2.amplitude.com/2/httpapi");
        aVar.mo73000c("Content-type", "application/json");
        aVar.mo73000c("Accept", "application/json");
        C20016y.C20017a aVar2 = C20016y.f44360a;
        String j = this.gson.mo59463j(amplitudeUploadRequest);
        C19383o.m32796f(j, "gson.toJson(amplitudeUploadRequest)");
        C20002r.f44260f.getClass();
        C20002r b = C20002r.C20003a.m34244b("application/json; charset=utf-8");
        aVar2.getClass();
        aVar.mo73001d("POST", C20016y.C20017a.m34281b(j, b));
        return aVar.mo72999b();
    }

    private final String getApiKey() {
        return (String) this.apiKey$delegate.getValue();
    }

    public static /* synthetic */ Object logEvent$default(AmplitudeApi amplitudeApi, AmplitudeEvent amplitudeEvent, int i, C19340c cVar, int i2, Object obj) throws AmplitudeApiException {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return amplitudeApi.logEvent(amplitudeEvent, i, cVar);
    }

    private final Map<String, Object> truncate(JSONObject jSONObject) {
        if (jSONObject.length() > 1000) {
            String str = TAG;
            C19383o.m32796f(str, "TAG");
            PLog.w$default(str, "Warning: too many properties (more than 1000), ignoring", 0, 4, (Object) null);
            return C19294b0.m32559p0();
        }
        Iterator<String> keys = jSONObject.keys();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    C19383o.m32796f(next, "key");
                    linkedHashMap.put(next, truncate((String) obj));
                } else if (obj instanceof JSONObject) {
                    C19383o.m32796f(next, "key");
                    linkedHashMap.put(next, truncate((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    C19383o.m32796f(next, "key");
                    linkedHashMap.put(next, truncate((JSONArray) obj));
                } else {
                    C19383o.m32796f(next, "key");
                    C19383o.m32796f(obj, "value");
                    linkedHashMap.put(next, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd A[SYNTHETIC, Splitter:B:41:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da A[Catch:{ Exception -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object logEvent(com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent r21, int r22, kotlin.coroutines.C19340c<? super kotlin.C19394m> r23) throws com.paypal.pyplcheckout.common.instrumentation.AmplitudeApiException {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            boolean r2 = r0 instanceof com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi$logEvent$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi$logEvent$1 r2 = (com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi$logEvent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi$logEvent$1 r2 = new com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi$logEvent$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 2
            r6 = 3
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0063
            if (r4 == r8) goto L_0x004a
            if (r4 == r5) goto L_0x003b
            if (r4 != r6) goto L_0x0033
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x0151
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003b:
            int r4 = r2.I$0
            java.lang.Object r5 = r2.L$1
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent r5 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent) r5
            java.lang.Object r9 = r2.L$0
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi r9 = (com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x0143
        L_0x004a:
            int r4 = r2.I$0
            java.lang.Object r9 = r2.L$3
            java.lang.Class r9 = (java.lang.Class) r9
            java.lang.Object r9 = r2.L$2
            okhttp3.e r9 = (okhttp3.C19944e) r9
            java.lang.Object r9 = r2.L$1
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent r9 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent) r9
            java.lang.Object r10 = r2.L$0
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi r10 = (com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi) r10
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)     // Catch:{ Exception -> 0x0060 }
            goto L_0x00b7
        L_0x0060:
            r0 = move-exception
            goto L_0x012a
        L_0x0063:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeUploadRequest r0 = new com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeUploadRequest     // Catch:{ Exception -> 0x0123 }
            java.lang.String r4 = r20.getApiKey()     // Catch:{ Exception -> 0x0123 }
            java.util.List r9 = p568fn.C17782b.m29864d0(r21)     // Catch:{ Exception -> 0x0123 }
            r0.<init>(r4, r9)     // Catch:{ Exception -> 0x0123 }
            okhttp3.t r4 = r1.okHttpClient     // Catch:{ Exception -> 0x0123 }
            okhttp3.u r0 = r1.buildRequest(r0)     // Catch:{ Exception -> 0x0123 }
            okhttp3.e r0 = r4.mo20743a(r0)     // Catch:{ Exception -> 0x0123 }
            java.lang.Class<com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeResponse> r4 = com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeResponse.class
            r2.L$0 = r1     // Catch:{ Exception -> 0x0123 }
            r9 = r21
            r2.L$1 = r9     // Catch:{ Exception -> 0x0121 }
            r2.L$2 = r0     // Catch:{ Exception -> 0x0121 }
            r2.L$3 = r4     // Catch:{ Exception -> 0x0121 }
            r10 = r22
            r2.I$0 = r10     // Catch:{ Exception -> 0x011f }
            r2.label = r8     // Catch:{ Exception -> 0x011f }
            kotlinx.coroutines.l r11 = new kotlinx.coroutines.l     // Catch:{ Exception -> 0x011f }
            kotlin.coroutines.c r12 = kotlin.jvm.internal.C19388s.m32873m0(r2)     // Catch:{ Exception -> 0x011f }
            r11.<init>(r8, r12)     // Catch:{ Exception -> 0x011f }
            r11.mo72548n()     // Catch:{ Exception -> 0x011f }
            com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$1 r12 = new com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$1     // Catch:{ Exception -> 0x011f }
            r12.<init>(r4, r11)     // Catch:{ Exception -> 0x011f }
            r4 = r0
            okhttp3.internal.connection.e r4 = (okhttp3.internal.connection.C19971e) r4     // Catch:{ Exception -> 0x011f }
            r4.mo72857S(r12)     // Catch:{ Exception -> 0x011f }
            com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$2 r4 = new com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$2     // Catch:{ Exception -> 0x011f }
            r4.<init>(r0)     // Catch:{ Exception -> 0x011f }
            r11.mo72497O(r4)     // Catch:{ Exception -> 0x011f }
            java.lang.Object r0 = r11.mo72547l()     // Catch:{ Exception -> 0x011f }
            if (r0 != r3) goto L_0x00b5
            return r3
        L_0x00b5:
            r4 = r10
            r10 = r1
        L_0x00b7:
            com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeResponse r0 = (com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeResponse) r0     // Catch:{ Exception -> 0x0060 }
            int r11 = r0.getCode()     // Catch:{ Exception -> 0x0060 }
            r12 = 200(0xc8, float:2.8E-43)
            r13 = 0
            if (r12 > r11) goto L_0x00c8
            r12 = 300(0x12c, float:4.2E-43)
            if (r11 >= r12) goto L_0x00c8
            r11 = r8
            goto L_0x00c9
        L_0x00c8:
            r11 = r13
        L_0x00c9:
            java.lang.String r12 = "TAG"
            if (r11 == 0) goto L_0x00da
            java.lang.String r0 = TAG     // Catch:{ Exception -> 0x0060 }
            kotlin.jvm.internal.C19383o.m32796f(r0, r12)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r11 = "Successfully logged event to amplitude"
            r12 = 4
            com.paypal.pyplcheckout.common.instrumentation.PLog.v$default(r0, r11, r13, r12, r7)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0151
        L_0x00da:
            java.lang.String r14 = TAG     // Catch:{ Exception -> 0x0060 }
            kotlin.jvm.internal.C19383o.m32796f(r14, r12)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r11 = r0.getError()     // Catch:{ Exception -> 0x0060 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060 }
            r12.<init>()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r13 = "Failed to log event to amplitude: "
            r12.append(r13)     // Catch:{ Exception -> 0x0060 }
            r12.append(r11)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r15 = r12.toString()     // Catch:{ Exception -> 0x0060 }
            r16 = 0
            r17 = 0
            r18 = 12
            r19 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.e$default(r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0060 }
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApiException r11 = new com.paypal.pyplcheckout.common.instrumentation.AmplitudeApiException     // Catch:{ Exception -> 0x0060 }
            java.io.IOException r12 = new java.io.IOException     // Catch:{ Exception -> 0x0060 }
            int r0 = r0.getCode()     // Catch:{ Exception -> 0x0060 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060 }
            r13.<init>()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r14 = "Amplitude api error code: "
            r13.append(r14)     // Catch:{ Exception -> 0x0060 }
            r13.append(r0)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0060 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x0060 }
            r11.<init>(r12, r9)     // Catch:{ Exception -> 0x0060 }
            throw r11     // Catch:{ Exception -> 0x0060 }
        L_0x011f:
            r0 = move-exception
            goto L_0x0128
        L_0x0121:
            r0 = move-exception
            goto L_0x0126
        L_0x0123:
            r0 = move-exception
            r9 = r21
        L_0x0126:
            r10 = r22
        L_0x0128:
            r4 = r10
            r10 = r1
        L_0x012a:
            if (r4 >= r6) goto L_0x0154
            r11 = 1000(0x3e8, double:4.94E-321)
            r2.L$0 = r10
            r2.L$1 = r9
            r2.L$2 = r7
            r2.L$3 = r7
            r2.I$0 = r4
            r2.label = r5
            java.lang.Object r0 = p628nj.C18263b.m30814I(r11, r2)
            if (r0 != r3) goto L_0x0141
            return r3
        L_0x0141:
            r5 = r9
            r9 = r10
        L_0x0143:
            int r4 = r4 + r8
            r2.L$0 = r7
            r2.L$1 = r7
            r2.label = r6
            java.lang.Object r0 = r9.logEvent(r5, r4, r2)
            if (r0 != r3) goto L_0x0151
            return r3
        L_0x0151:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        L_0x0154:
            com.paypal.pyplcheckout.common.instrumentation.AmplitudeApiException r2 = new com.paypal.pyplcheckout.common.instrumentation.AmplitudeApiException
            r2.<init>(r0, r9)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.common.instrumentation.AmplitudeApi.logEvent(com.paypal.pyplcheckout.common.instrumentation.amplitude.models.AmplitudeEvent, int, kotlin.coroutines.c):java.lang.Object");
    }

    private final JSONArray truncate(JSONArray jSONArray) {
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                jSONArray.put(i, truncate((String) obj));
            } else if (obj instanceof JSONObject) {
                jSONArray.put(i, truncate((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                jSONArray.put(i, truncate((JSONArray) obj));
            }
            i = i2;
        }
        return jSONArray;
    }

    private final String truncate(String str) {
        if (str.length() <= 1024) {
            return str;
        }
        String substring = str.substring(0, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final Object logEvent(AmplitudeSession amplitudeSession, String str, JSONObject jSONObject, C19340c<? super C19394m> cVar) throws AmplitudeApiException {
        String str2 = str;
        AmplitudeEvent amplitudeEvent = new AmplitudeEvent(str, System.currentTimeMillis(), amplitudeSession.getUserId(), amplitudeSession.getDeviceId(), amplitudeSession.getSessionId(), this.deviceInfo.getVersionName(), this.deviceInfo.getOsName(), this.deviceInfo.getOsVersion(), this.deviceInfo.getApiLevel(), this.deviceInfo.getBrand(), this.deviceInfo.getDeviceManufacturer(), this.deviceInfo.getDeviceModel(), this.deviceInfo.getCarrier(), this.deviceInfo.getCountry(), this.deviceInfo.getLanguage(), this.deviceInfo.getPlatform(), truncate(jSONObject), amplitudeSession.getUserProperties(), (String) null, PrimitiveArrayBuilder.MAX_CHUNK_SIZE, (DefaultConstructorMarker) null);
        if (C19383o.m32792b(str2, "crypto_currency_quote_callback") || C19383o.m32792b(str2, "crypto_currency_api")) {
            return C19394m.f43287a;
        }
        Object logEvent$default = logEvent$default(this, amplitudeEvent, 0, cVar, 2, (Object) null);
        if (logEvent$default == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return logEvent$default;
        }
        return C19394m.f43287a;
    }
}
