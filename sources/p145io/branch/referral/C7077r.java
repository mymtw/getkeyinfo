package p145io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p010a9.C0048b;

/* renamed from: io.branch.referral.r */
public final class C7077r {

    /* renamed from: f */
    public static C7077r f15755f = null;

    /* renamed from: g */
    public static boolean f15756g = false;

    /* renamed from: a */
    public final SharedPreferences f15757a;

    /* renamed from: b */
    public SharedPreferences.Editor f15758b;

    /* renamed from: c */
    public final JSONObject f15759c = new JSONObject();

    /* renamed from: d */
    public final JSONObject f15760d = new JSONObject();

    /* renamed from: e */
    public final C7036f f15761e;

    public C7077r(Context context) {
        new JSONObject();
        this.f15761e = new C7036f();
        SharedPreferences sharedPreferences = context.getSharedPreferences("branch_referral_shared_pref", 0);
        this.f15757a = sharedPreferences;
        this.f15758b = sharedPreferences.edit();
    }

    /* renamed from: a */
    public static void m13675a(String str) {
        if (f15756g && !TextUtils.isEmpty(str)) {
            Log.i("BranchSDK", str);
        }
    }

    /* renamed from: b */
    public static void m13676b(String str, Exception exc) {
        if (!TextUtils.isEmpty(str)) {
            Log.e("BranchSDK", str, exc);
        }
    }

    /* renamed from: h */
    public static C7077r m13677h(Context context) {
        if (f15755f == null) {
            f15755f = new C7077r(context);
        }
        return f15755f;
    }

    /* renamed from: c */
    public final void mo19314c() {
        Iterator<String> it = mo19315d().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ArrayList<String> d = mo19315d();
            if (!d.contains(next)) {
                d.add(next);
                mo19330t(d);
            }
            this.f15758b.putInt(C0326j.m864i("bnc_total_base_", next), 0).apply();
            this.f15758b.putInt("bnc_balance_base_" + next, 0).apply();
        }
        mo19330t(new ArrayList());
    }

    /* renamed from: d */
    public final ArrayList<String> mo19315d() {
        String r = mo19328r("bnc_actions");
        if (r.equals("bnc_no_value")) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, r.split(","));
        return arrayList;
    }

    /* renamed from: e */
    public final boolean mo19316e(String str) {
        return this.f15757a.getBoolean(str, false);
    }

    /* renamed from: f */
    public final String mo19317f() {
        return mo19328r("bnc_branch_key");
    }

    /* renamed from: g */
    public final String mo19318g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.f15760d.get(str).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final int mo19319i(int i, String str) {
        return this.f15757a.getInt(str, i);
    }

    /* renamed from: j */
    public final String mo19320j() {
        return mo19328r("bnc_link_click_id");
    }

    /* renamed from: k */
    public final long mo19321k(String str) {
        return this.f15757a.getLong(str, 0);
    }

    /* renamed from: l */
    public final String mo19322l() {
        String r = mo19328r("bnc_randomized_bundle_token");
        return (TextUtils.isEmpty(r) || r.equals("bnc_no_value")) ? mo19328r("bnc_identity_id") : r;
    }

    /* renamed from: m */
    public final String mo19323m() {
        String r = mo19328r("bnc_randomized_device_token");
        return (TextUtils.isEmpty(r) || r.equals("bnc_no_value")) ? mo19328r("bnc_device_fingerprint_id") : r;
    }

    /* renamed from: n */
    public final String mo19324n() {
        String r = mo19328r("bnc_gclid_json_object");
        if (r.equals("bnc_no_value")) {
            return "bnc_no_value";
        }
        try {
            JSONObject jSONObject = new JSONObject(r);
            if (((Long) jSONObject.get("bnc_gclid_expiration_date")).longValue() - System.currentTimeMillis() > 0) {
                return jSONObject.getString("bnc_gclid_value");
            }
            this.f15758b.remove("bnc_gclid_json_object").apply();
            return null;
        } catch (JSONException e) {
            this.f15758b.remove("bnc_gclid_json_object").apply();
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public final int mo19325o() {
        return mo19319i(3, "bnc_retry_count");
    }

    /* renamed from: p */
    public final int mo19326p() {
        return mo19319i(1000, "bnc_retry_interval");
    }

    /* renamed from: q */
    public final String mo19327q() {
        return mo19328r("bnc_session_id");
    }

    /* renamed from: r */
    public final String mo19328r(String str) {
        return this.f15757a.getString(str, "bnc_no_value");
    }

    /* renamed from: s */
    public final void mo19329s(JSONObject jSONObject) throws JSONException {
        C7036f fVar = this.f15761e;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry next : fVar.f15652a.entrySet()) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry : ((ConcurrentHashMap) next.getValue()).entrySet()) {
                jSONObject3.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject2.put((String) next.getKey(), jSONObject3);
        }
        jSONObject.put(Defines$Jsonkey.PartnerData.getKey(), jSONObject2);
    }

    /* renamed from: t */
    public final void mo19330t(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            mo19335y("bnc_actions", "bnc_no_value");
            return;
        }
        Iterator<String> it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            str = C0048b.m163a(str, it.next(), ",");
        }
        mo19335y("bnc_actions", str.substring(0, str.length() - 1));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0069 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19331u(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "bnc_branch_key"
            java.lang.String r1 = r6.mo19328r(r0)
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = r6.mo19320j()
            java.lang.String r2 = "bnc_link_click_identifier"
            java.lang.String r2 = r6.mo19328r(r2)
            java.lang.String r3 = "bnc_app_link"
            java.lang.String r3 = r6.mo19328r(r3)
            java.lang.String r4 = "bnc_push_identifier"
            java.lang.String r4 = r6.mo19328r(r4)
            android.content.SharedPreferences$Editor r5 = r6.f15758b
            r5.clear()
            java.lang.String r5 = "bnc_link_click_id"
            r6.mo19335y(r5, r1)
            java.lang.String r1 = "bnc_link_click_identifier"
            r6.mo19335y(r1, r2)
            java.lang.String r1 = "bnc_app_link"
            r6.mo19335y(r1, r3)
            java.lang.String r1 = "bnc_push_identifier"
            r6.mo19335y(r1, r4)
            android.content.SharedPreferences$Editor r1 = r6.f15758b
            r1.apply()
            r6.mo19335y(r0, r7)
            io.branch.referral.Branch r7 = p145io.branch.referral.Branch.m13575j()
            if (r7 == 0) goto L_0x006d
            io.branch.referral.Branch r7 = p145io.branch.referral.Branch.m13575j()
            java.util.concurrent.ConcurrentHashMap<io.branch.referral.e, java.lang.String> r7 = r7.f15582h
            r7.clear()
            io.branch.referral.Branch r7 = p145io.branch.referral.Branch.m13575j()
            io.branch.referral.y r7 = r7.f15580f
            r7.getClass()
            java.lang.Object r0 = p145io.branch.referral.C7089y.f15776e
            monitor-enter(r0)
            java.util.List<io.branch.referral.ServerRequest> r1 = r7.f15779c     // Catch:{ UnsupportedOperationException -> 0x0069 }
            r1.clear()     // Catch:{ UnsupportedOperationException -> 0x0069 }
            r7.mo19388b()     // Catch:{ UnsupportedOperationException -> 0x0069 }
            goto L_0x0069
        L_0x0067:
            r7 = move-exception
            goto L_0x006b
        L_0x0069:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            goto L_0x006d
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r7
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7077r.mo19331u(java.lang.String):void");
    }

    /* renamed from: v */
    public final void mo19332v(long j, String str) {
        this.f15758b.putLong(str, j).apply();
    }

    /* renamed from: w */
    public final void mo19333w(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bnc_gclid_value", str);
            jSONObject.put("bnc_gclid_expiration_date", System.currentTimeMillis() + this.f15757a.getLong("bnc_gclid_expiration_window", 2592000000L));
            mo19335y("bnc_gclid_json_object", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: x */
    public final void mo19334x(String str) {
        mo19335y("bnc_session_params", str);
    }

    /* renamed from: y */
    public final void mo19335y(String str, String str2) {
        this.f15758b.putString(str, str2).apply();
    }
}
