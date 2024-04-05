package p145io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.s0 */
public final class C7080s0 {

    /* renamed from: c */
    public static JSONObject f15764c;

    /* renamed from: d */
    public static C7080s0 f15765d;

    /* renamed from: a */
    public final ArrayList<String> f15766a;

    /* renamed from: b */
    public final JSONObject f15767b;

    /* renamed from: io.branch.referral.s0$a */
    public static class C7081a extends BranchAsyncTask<Void, Void, JSONObject> {

        /* renamed from: a */
        public final C7077r f15768a;

        public C7081a(Context context) {
            this.f15768a = C7077r.m13677h(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object doInBackground(java.lang.Object[] r7) {
            /*
                r6 = this;
                java.lang.Void[] r7 = (java.lang.Void[]) r7
                r7 = 0
                android.net.TrafficStats.setThreadStatsTag(r7)
                org.json.JSONObject r7 = new org.json.JSONObject
                r7.<init>()
                r0 = 0
                java.lang.String r1 = "%sdk/uriskiplist_v#.json"
                java.lang.String r2 = "%"
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                if (r3 != 0) goto L_0x0018
                r3 = r0
                goto L_0x001a
            L_0x0018:
                java.lang.String r3 = "https://cdn.branch.io/"
            L_0x001a:
                java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                java.lang.String r3 = "#"
                org.json.JSONObject r4 = p145io.branch.referral.C7080s0.f15764c     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                java.lang.String r5 = "version"
                int r4 = r4.optInt(r5)     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                int r4 = r4 + 1
                java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                java.lang.String r1 = r1.replace(r3, r4)     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ Exception -> 0x007b, all -> 0x0074 }
                r0 = 1500(0x5dc, float:2.102E-42)
                r1.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                r1.setReadTimeout(r0)     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                int r0 = r1.getResponseCode()     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L_0x006b
                java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                if (r0 == 0) goto L_0x006b
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                java.io.InputStream r3 = r1.getInputStream()     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                r0.<init>(r2)     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                java.lang.String r0 = r0.readLine()     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0072, all -> 0x006f }
                r7 = r2
            L_0x006b:
                r1.disconnect()
                goto L_0x0080
            L_0x006f:
                r7 = move-exception
                r0 = r1
                goto L_0x0075
            L_0x0072:
                r0 = r1
                goto L_0x007b
            L_0x0074:
                r7 = move-exception
            L_0x0075:
                if (r0 == 0) goto L_0x007a
                r0.disconnect()
            L_0x007a:
                throw r7
            L_0x007b:
                if (r0 == 0) goto L_0x0080
                r0.disconnect()
            L_0x0080:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7080s0.C7081a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public final void onPostExecute(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            super.onPostExecute(jSONObject);
            if (jSONObject.optInt(ResponseConstants.VERSION) > C7080s0.f15764c.optInt(ResponseConstants.VERSION)) {
                C7080s0.f15764c = jSONObject;
                this.f15768a.mo19335y("skip_url_format_key", jSONObject.toString());
            }
        }
    }

    public C7080s0(Context context) {
        JSONObject jSONObject = new JSONObject();
        this.f15767b = jSONObject;
        try {
            jSONObject.putOpt(ResponseConstants.VERSION, 0);
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt("uri_skip_list", jSONArray);
            jSONArray.put("^fb\\d+:");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException unused) {
        }
        C7077r h = C7077r.m13677h(context);
        JSONObject jSONObject2 = new JSONObject();
        String r = h.mo19328r("skip_url_format_key");
        if (TextUtils.isEmpty(r) || "bnc_no_value".equals(r)) {
            jSONObject2 = this.f15767b;
        } else {
            try {
                jSONObject2 = new JSONObject(r);
            } catch (JSONException unused2) {
            }
        }
        f15764c = jSONObject2;
        this.f15766a = new ArrayList<>();
    }

    /* renamed from: a */
    public final String mo19336a(String str) {
        String str2;
        try {
            JSONArray optJSONArray = f15764c.optJSONArray("uri_skip_list");
            if (optJSONArray != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    try {
                        str2 = optJSONArray.getString(i);
                        if (Pattern.compile(str2).matcher(str).find()) {
                            break;
                        }
                        i++;
                    } catch (JSONException unused) {
                    }
                }
            }
            str2 = null;
            if (str2 == null) {
                if (this.f15766a.size() <= 0) {
                    return str;
                }
                Iterator<String> it = this.f15766a.iterator();
                while (it.hasNext()) {
                    if (str.matches(it.next())) {
                        return str;
                    }
                }
            }
            return str2;
        } catch (Exception unused2) {
            return str;
        }
    }
}
