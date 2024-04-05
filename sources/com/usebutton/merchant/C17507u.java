package com.usebutton.merchant;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;

/* renamed from: com.usebutton.merchant.u */
public final class C17507u implements C17506t {

    /* renamed from: e */
    public static C17507u f38283e;

    /* renamed from: f */
    public static final int f38284f;

    /* renamed from: g */
    public static final int f38285g;

    /* renamed from: a */
    public String f38286a;

    /* renamed from: b */
    public String f38287b = "https://mobileapi.usebutton.com";

    /* renamed from: c */
    public final String f38288c;

    /* renamed from: d */
    public final C17477c0 f38289d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f38284f = (int) timeUnit.toMillis(5);
        f38285g = (int) timeUnit.toMillis(15);
    }

    public C17507u(String str, C17479d0 d0Var) {
        this.f38288c = str;
        this.f38289d = d0Var;
    }

    /* renamed from: c */
    public static JSONObject m29360c(HttpURLConnection httpURLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream()), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return new JSONObject(sb.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0104  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.usebutton.merchant.C17475b0 mo68683a(com.usebutton.merchant.ApiRequest r8) throws com.usebutton.merchant.exception.ButtonNetworkException {
        /*
            r7 = this;
            java.lang.String r0 = "Error has occurred"
            java.lang.String r1 = "u"
            r2 = 0
            java.lang.String r3 = r8.f38212b     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00d4 }
            java.net.HttpURLConnection r3 = r7.mo68684b(r3)     // Catch:{ IOException -> 0x00f7, JSONException -> 0x00d4 }
            com.usebutton.merchant.ApiRequest$RequestMethod r4 = r8.f38211a     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r4 = r4.getValue()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r3.setRequestMethod(r4)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r3.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.util.HashMap r4 = r8.f38213c     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
        L_0x0025:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r3.setRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            goto L_0x0025
        L_0x0041:
            org.json.JSONObject r8 = r8.f38214d     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r4 = "application_id"
            java.lang.String r5 = r7.f38286a     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r8.put(r4, r5)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r4 = "session_id"
            com.usebutton.merchant.c0 r5 = r7.f38289d     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            com.usebutton.merchant.d0 r5 = (com.usebutton.merchant.C17479d0) r5     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            android.content.SharedPreferences r5 = r5.f38237a     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r6 = "btn_session_id"
            java.lang.String r2 = r5.getString(r6, r2)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r8.put(r4, r2)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r5 = "UTF-8"
            r2.<init>(r4, r5)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r4 = r8.toString()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r2.write(r4)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r2.close()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r4.<init>()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r5 = "Request Body: "
            r4.append(r5)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r4.append(r8)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r8 = r4.toString()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            android.util.Log.d(r1, r8)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r8.<init>()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r4 = "Response Code: "
            r8.append(r4)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r8.append(r2)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            android.util.Log.d(r1, r8)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r8 = 400(0x190, float:5.6E-43)
            if (r2 >= r8) goto L_0x00b0
            org.json.JSONObject r8 = m29360c(r3)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r7.mo68685d(r8)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            com.usebutton.merchant.b0 r4 = new com.usebutton.merchant.b0     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r4.<init>(r2, r8)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r3.disconnect()
            return r4
        L_0x00b0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r8.<init>()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r4 = "Unsuccessful Request. HTTP StatusCode: "
            r8.append(r4)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r8.append(r2)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            android.util.Log.e(r1, r8)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            com.usebutton.merchant.exception.HttpStatusException r4 = new com.usebutton.merchant.exception.HttpStatusException     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            r4.<init>(r8, r2)     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
            throw r4     // Catch:{ IOException -> 0x00cf, JSONException -> 0x00cc, all -> 0x00ca }
        L_0x00ca:
            r8 = move-exception
            goto L_0x0102
        L_0x00cc:
            r8 = move-exception
            r2 = r3
            goto L_0x00d5
        L_0x00cf:
            r8 = move-exception
            r2 = r3
            goto L_0x00f8
        L_0x00d2:
            r8 = move-exception
            goto L_0x0101
        L_0x00d4:
            r8 = move-exception
        L_0x00d5:
            android.util.Log.e(r1, r0, r8)     // Catch:{ all -> 0x00d2 }
            com.usebutton.merchant.exception.ButtonNetworkException r0 = new com.usebutton.merchant.exception.ButtonNetworkException     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r1.<init>()     // Catch:{ all -> 0x00d2 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r8.getSimpleName()     // Catch:{ all -> 0x00d2 }
            r1.append(r8)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = " has occurred"
            r1.append(r8)     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x00d2 }
            r0.<init>((java.lang.String) r8)     // Catch:{ all -> 0x00d2 }
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00f7:
            r8 = move-exception
        L_0x00f8:
            android.util.Log.e(r1, r0, r8)     // Catch:{ all -> 0x00d2 }
            com.usebutton.merchant.exception.NetworkNotFoundException r0 = new com.usebutton.merchant.exception.NetworkNotFoundException     // Catch:{ all -> 0x00d2 }
            r0.<init>(r8)     // Catch:{ all -> 0x00d2 }
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x0101:
            r3 = r2
        L_0x0102:
            if (r3 == 0) goto L_0x0107
            r3.disconnect()
        L_0x0107:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.merchant.C17507u.mo68683a(com.usebutton.merchant.ApiRequest):com.usebutton.merchant.b0");
    }

    /* renamed from: b */
    public final HttpURLConnection mo68684b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C0023f.m110k(new StringBuilder(), this.f38287b, str)).openConnection();
        httpURLConnection.setConnectTimeout(f38284f);
        httpURLConnection.setReadTimeout(f38285g);
        httpURLConnection.setRequestProperty("User-Agent", this.f38288c);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    /* renamed from: d */
    public final void mo68685d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("meta");
            if (jSONObject2.has("session_id")) {
                String optString = jSONObject2.optString("session_id", (String) null);
                if (optString != null) {
                    ((C17479d0) this.f38289d).f38237a.edit().putString("btn_session_id", optString).apply();
                } else {
                    ((C17479d0) this.f38289d).f38237a.edit().clear().apply();
                }
            }
        } catch (JSONException e) {
            Log.e("u", "Error parsing session data from response body", e);
        }
    }
}
