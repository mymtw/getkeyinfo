package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.a */
public final class C16584a {

    /* renamed from: a */
    public final SharedPreferences f36794a;

    /* renamed from: com.google.firebase.messaging.a$a */
    public static class C16585a {

        /* renamed from: d */
        public static final long f36795d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        public final String f36796a;

        /* renamed from: b */
        public final String f36797b;

        /* renamed from: c */
        public final long f36798c;

        public C16585a(String str, String str2, long j) {
            this.f36796a = str;
            this.f36797b = str2;
            this.f36798c = j;
        }

        /* renamed from: a */
        public static String m27410a(long j, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(ResponseConstants.TIMESTAMP, j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
                return null;
            }
        }

        /* renamed from: b */
        public static C16585a m27411b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C16585a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C16585a(jSONObject.getString(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(ResponseConstants.TIMESTAMP));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r4 = java.lang.String.valueOf(r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r4.length() != 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        r4 = "Error creating file in no backup dir: ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        r4 = new java.lang.String("Error creating file in no backup dir: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        android.util.Log.d("FirebaseMessaging", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16584a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            r3.f36794a = r0
            java.lang.Object r1 = p260v0.C8184a.f17966a
            java.io.File r4 = p260v0.C8184a.C8187c.m16467c(r4)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "com.google.android.gms.appid-no-backup"
            r1.<init>(r4, r2)
            boolean r4 = r1.exists()
            if (r4 == 0) goto L_0x0020
            goto L_0x0076
        L_0x0020:
            boolean r4 = r1.createNewFile()     // Catch:{ IOException -> 0x004d }
            if (r4 == 0) goto L_0x0076
            monitor-enter(r3)     // Catch:{ IOException -> 0x004d }
            java.util.Map r4 = r0.getAll()     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x004a }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            if (r4 != 0) goto L_0x0076
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r1 = "App restored, clearing state"
            android.util.Log.i(r4, r1)     // Catch:{ IOException -> 0x004d }
            monitor-enter(r3)     // Catch:{ IOException -> 0x004d }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch:{ all -> 0x0047 }
            r4.commit()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            goto L_0x0076
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r4 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0076
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Error creating file in no backup dir: "
            int r1 = r4.length()
            if (r1 == 0) goto L_0x006c
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0071
        L_0x006c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0071:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.d(r0, r4)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C16584a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static String m27409a(String str, String str2) {
        return C0073e.m210j(new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length()), str, "|T|", str2, "|*");
    }
}
