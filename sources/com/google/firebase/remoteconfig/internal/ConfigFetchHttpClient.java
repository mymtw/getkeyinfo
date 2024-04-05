package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.etsy.android.lib.requests.EtsyRequest;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: h */
    public static final Pattern f36891h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Context f36892a;

    /* renamed from: b */
    public final String f36893b;

    /* renamed from: c */
    public final String f36894c;

    /* renamed from: d */
    public final String f36895d;

    /* renamed from: e */
    public final String f36896e;

    /* renamed from: f */
    public final long f36897f;

    /* renamed from: g */
    public final long f36898g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f36892a = context;
        this.f36893b = str;
        this.f36894c = str2;
        Matcher matcher = f36891h.matcher(str);
        this.f36895d = matcher.matches() ? matcher.group(1) : null;
        this.f36896e = str3;
        this.f36897f = j;
        this.f36898g = j2;
    }

    /* renamed from: c */
    public static JSONObject m27659c(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), EtsyRequest.CONTENT_ENCODING));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    /* renamed from: d */
    public static void m27660d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: a */
    public final JSONObject mo59440a(String str, String str2, Map<String, String> map) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f36893b);
            Locale locale = this.f36892a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f36892a.getPackageManager().getPackageInfo(this.f36892a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(i >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f36892a.getPackageName());
            hashMap.put("sdkVersion", "21.0.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: b */
    public final HttpURLConnection mo59441b() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.f36895d, this.f36896e})).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:30|31|32|(2:33|34)|(3:38|39|40)|41|(2:43|44)|(3:48|49|50)|51|53|54|(3:57|58|59)|60|61|62|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x014c */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a4 A[LOOP:0: B:10:0x009e->B:12:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d6 A[Catch:{ IOException | JSONException -> 0x016c, all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[SYNTHETIC, Splitter:B:67:0x0160] */
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.C16688a.C16689a fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Date r13) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigException {
        /*
            r6 = this;
            r0 = 1
            r7.setDoOutput(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r6.f36897f
            long r2 = r1.toMillis(r2)
            int r2 = (int) r2
            r7.setConnectTimeout(r2)
            long r2 = r6.f36898g
            long r1 = r1.toMillis(r2)
            int r1 = (int) r1
            r7.setReadTimeout(r1)
            java.lang.String r1 = "If-None-Match"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = r6.f36894c
            java.lang.String r1 = "X-Goog-Api-Key"
            r7.setRequestProperty(r1, r11)
            android.content.Context r11 = r6.f36892a
            java.lang.String r11 = r11.getPackageName()
            java.lang.String r1 = "X-Android-Package"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = "FirebaseRemoteConfig"
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.f36892a     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0061 }
            byte[] r3 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r3, r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r3 != 0) goto L_0x005c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0061 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = "Could not get fingerprint hash for package: "
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.Context r4 = r6.f36892a     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0061 }
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x0061 }
            android.util.Log.e(r11, r3)     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x0078
        L_0x005c:
            java.lang.String r11 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r3, r1)     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x0079
        L_0x0061:
            r3 = move-exception
            java.lang.String r4 = "No such package: "
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r4)
            android.content.Context r5 = r6.f36892a
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r11, r4, r3)
        L_0x0078:
            r11 = r2
        L_0x0079:
            java.lang.String r3 = "X-Android-Cert"
            r7.setRequestProperty(r3, r11)
            java.lang.String r11 = "X-Google-GFE-Can-Retry"
            java.lang.String r3 = "yes"
            r7.setRequestProperty(r11, r3)
            java.lang.String r11 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r11, r9)
            java.lang.String r11 = "application/json"
            java.lang.String r3 = "Content-Type"
            r7.setRequestProperty(r3, r11)
            java.lang.String r3 = "Accept"
            r7.setRequestProperty(r3, r11)
            java.util.Set r11 = r12.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x009e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00ba
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r7.setRequestProperty(r3, r12)
            goto L_0x009e
        L_0x00ba:
            org.json.JSONObject r8 = r6.mo59440a(r8, r9, r10)     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            m27660d(r7, r8)     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            r7.connect()     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x0160
            java.lang.String r8 = "ETag"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            org.json.JSONObject r9 = m27659c(r7)     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x00ea }
            r7.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00ea:
            java.lang.String r7 = "state"
            java.lang.Object r7 = r9.get(r7)     // Catch:{ JSONException -> 0x00f8 }
            java.lang.String r10 = "NO_CHANGE"
            boolean r7 = r7.equals(r10)     // Catch:{ JSONException -> 0x00f8 }
            r7 = r7 ^ r0
            goto L_0x00f9
        L_0x00f8:
            r7 = r0
        L_0x00f9:
            if (r7 != 0) goto L_0x0101
            com.google.firebase.remoteconfig.internal.a$a r7 = new com.google.firebase.remoteconfig.internal.a$a
            r7.<init>(r0, r2, r2)
            return r7
        L_0x0101:
            int r7 = p641on.C18327e.f40231f     // Catch:{ JSONException -> 0x0157 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0157 }
            r7.<init>()     // Catch:{ JSONException -> 0x0157 }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0157 }
            r10.<init>()     // Catch:{ JSONException -> 0x0157 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0157 }
            r11.<init>()     // Catch:{ JSONException -> 0x0157 }
            java.lang.String r12 = "entries"
            org.json.JSONObject r12 = r9.getJSONObject(r12)     // Catch:{ JSONException -> 0x0119 }
            goto L_0x011a
        L_0x0119:
            r12 = r2
        L_0x011a:
            if (r12 == 0) goto L_0x0126
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0126 }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x0126 }
            r7 = r0
        L_0x0126:
            java.lang.String r12 = "experimentDescriptions"
            org.json.JSONArray r12 = r9.getJSONArray(r12)     // Catch:{ JSONException -> 0x012d }
            goto L_0x012e
        L_0x012d:
            r12 = r2
        L_0x012e:
            if (r12 == 0) goto L_0x013a
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013a }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x013a }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x013a }
            r10 = r0
        L_0x013a:
            java.lang.String r12 = "personalizationMetadata"
            org.json.JSONObject r2 = r9.getJSONObject(r12)     // Catch:{ JSONException -> 0x0140 }
        L_0x0140:
            if (r2 == 0) goto L_0x014c
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x014c }
            java.lang.String r12 = r2.toString()     // Catch:{ JSONException -> 0x014c }
            r9.<init>(r12)     // Catch:{ JSONException -> 0x014c }
            r11 = r9
        L_0x014c:
            on.e r9 = new on.e     // Catch:{ JSONException -> 0x0157 }
            r9.<init>(r7, r13, r10, r11)     // Catch:{ JSONException -> 0x0157 }
            com.google.firebase.remoteconfig.internal.a$a r7 = new com.google.firebase.remoteconfig.internal.a$a
            r7.<init>(r1, r9, r8)
            return r7
        L_0x0157:
            r7 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r8 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.String r9 = "Fetch failed: fetch response could not be parsed."
            r8.<init>(r9, r7)
            throw r8
        L_0x0160:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r9 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            java.lang.String r10 = r7.getResponseMessage()     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
            throw r9     // Catch:{ IOException -> 0x016e, JSONException -> 0x016c }
        L_0x016a:
            r8 = move-exception
            goto L_0x0177
        L_0x016c:
            r8 = move-exception
            goto L_0x016f
        L_0x016e:
            r8 = move-exception
        L_0x016f:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r9 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException     // Catch:{ all -> 0x016a }
            java.lang.String r10 = "The client had an error while calling the backend!"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x016a }
            throw r9     // Catch:{ all -> 0x016a }
        L_0x0177:
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0181 }
            r7.close()     // Catch:{ IOException -> 0x0181 }
        L_0x0181:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.util.Date):com.google.firebase.remoteconfig.internal.a$a");
    }
}
