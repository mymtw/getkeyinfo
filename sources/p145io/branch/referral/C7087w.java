package p145io.branch.referral;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7080s0;
import p145io.branch.referral.ServerRequest;
import p238sp.C7907a;
import p238sp.C7908b;
import p238sp.C7909c;
import p238sp.C7910d;
import p238sp.C7911e;
import p238sp.C7912f;

/* renamed from: io.branch.referral.w */
public abstract class C7087w extends ServerRequest {

    /* renamed from: j */
    public final Context f15772j;

    /* renamed from: k */
    public Branch.C7016e f15773k;

    /* renamed from: l */
    public boolean f15774l;

    public C7087w(Context context, Defines$RequestPath defines$RequestPath, boolean z) {
        super(context, defines$RequestPath);
        this.f15772j = context;
        this.f15774l = !z;
    }

    /* renamed from: t */
    public static boolean m13721t(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("open") || str.equalsIgnoreCase("install");
        }
        return false;
    }

    /* renamed from: u */
    public static void m13722u(Branch branch) {
        String str;
        WeakReference<Activity> weakReference = branch.f15586l;
        C7912f.f17366a = weakReference;
        if (Branch.m13575j() != null) {
            Branch.m13575j().mo19197k();
            JSONObject k = Branch.m13575j().mo19197k();
            StringBuilder h = C0072d.m201h("~");
            h.append(Defines$Jsonkey.ReferringLink.getKey());
            str = k.optString(h.toString());
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && weakReference != null) {
            JSONObject k2 = Branch.m13575j().mo19197k();
            if (k2.optInt("_branch_validate") == 60514) {
                if (k2.optBoolean(Defines$Jsonkey.Clicked_Branch_Link.getKey())) {
                    if (C7912f.f17366a.get() != null) {
                        new AlertDialog.Builder(C7912f.f17366a.get(), 16974374).setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new C7910d(k2)).setNegativeButton("No", new C7909c(k2)).setNeutralButton(17039360, new C7908b()).setCancelable(false).setIcon(17301651).show();
                    }
                } else if (C7912f.f17366a.get() != null) {
                    new AlertDialog.Builder(C7912f.f17366a.get(), 16974374).setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton("Got it", new C7911e()).setCancelable(false).setIcon(17301651).show();
                }
            } else if (k2.optBoolean("bnc_validate")) {
                new Handler().postDelayed(new C7907a(k2), 500);
            }
        }
        Context context = branch.f15578d;
        if (C7080s0.f15765d == null) {
            C7080s0.f15765d = new C7080s0(context);
        }
        C7080s0 s0Var = C7080s0.f15765d;
        Context context2 = branch.f15578d;
        s0Var.getClass();
        try {
            new C7080s0.C7081a(context2).executeTask(new Void[0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public void mo19251j() {
        JSONObject jSONObject = this.f15615a;
        try {
            if (!this.f15617c.mo19328r("bnc_app_link").equals("bnc_no_value")) {
                jSONObject.put(Defines$Jsonkey.AndroidAppLinkURL.getKey(), this.f15617c.mo19328r("bnc_app_link"));
            }
            if (!this.f15617c.mo19328r("bnc_push_identifier").equals("bnc_no_value")) {
                jSONObject.put(Defines$Jsonkey.AndroidPushIdentifier.getKey(), this.f15617c.mo19328r("bnc_push_identifier"));
            }
            if (!this.f15617c.mo19328r("bnc_external_intent_uri").equals("bnc_no_value")) {
                jSONObject.put(Defines$Jsonkey.External_Intent_URI.getKey(), this.f15617c.mo19328r("bnc_external_intent_uri"));
            }
            if (!this.f15617c.mo19328r("bnc_external_intent_extra").equals("bnc_no_value")) {
                jSONObject.put(Defines$Jsonkey.External_Intent_Extra.getKey(), this.f15617c.mo19328r("bnc_external_intent_extra"));
            }
        } catch (JSONException unused) {
        }
        Branch.f15573y = false;
    }

    /* renamed from: k */
    public void mo19252k(C7031c0 c0Var, Branch branch) {
        Branch j = Branch.m13575j();
        C7089y yVar = j.f15580f;
        if (yVar != null) {
            yVar.mo19390d(ServerRequest.PROCESS_WAIT_LOCK.SDK_INIT_WAIT_LOCK);
            j.mo19203t();
        }
        this.f15617c.mo19335y("bnc_link_click_identifier", "bnc_no_value");
        this.f15617c.mo19335y("bnc_google_search_install_identifier", "bnc_no_value");
        this.f15617c.mo19335y("bnc_google_play_install_referrer_extras", "bnc_no_value");
        this.f15617c.mo19335y("bnc_external_intent_uri", "bnc_no_value");
        this.f15617c.mo19335y("bnc_external_intent_extra", "bnc_no_value");
        this.f15617c.mo19335y("bnc_app_link", "bnc_no_value");
        this.f15617c.mo19335y("bnc_push_identifier", "bnc_no_value");
        this.f15617c.f15758b.putBoolean("bnc_triggered_by_fb_app_link", false).apply();
        this.f15617c.mo19335y("bnc_install_referrer", "bnc_no_value");
        this.f15617c.f15758b.putBoolean("bnc_is_full_app_conversion", false).apply();
        this.f15617c.mo19335y("bnc_initial_referrer", "bnc_no_value");
        if (this.f15617c.mo19321k("bnc_previous_update_time") == 0) {
            C7077r rVar = this.f15617c;
            rVar.mo19332v(rVar.mo19321k("bnc_last_known_update_time"), "bnc_previous_update_time");
        }
    }

    /* renamed from: m */
    public final boolean mo19253m() {
        JSONObject jSONObject = this.f15615a;
        if (!jSONObject.has(Defines$Jsonkey.AndroidAppLinkURL.getKey()) && !jSONObject.has(Defines$Jsonkey.AndroidPushIdentifier.getKey()) && !jSONObject.has(Defines$Jsonkey.LinkIdentifier.getKey())) {
            return this instanceof C7082t;
        }
        jSONObject.remove(Defines$Jsonkey.RandomizedDeviceToken.getKey());
        jSONObject.remove(Defines$Jsonkey.RandomizedBundleToken.getKey());
        jSONObject.remove(Defines$Jsonkey.FaceBookAppLinkChecked.getKey());
        jSONObject.remove(Defines$Jsonkey.External_Intent_Extra.getKey());
        jSONObject.remove(Defines$Jsonkey.External_Intent_URI.getKey());
        jSONObject.remove(Defines$Jsonkey.FirstInstallTime.getKey());
        jSONObject.remove(Defines$Jsonkey.LastUpdateTime.getKey());
        jSONObject.remove(Defines$Jsonkey.OriginalInstallTime.getKey());
        jSONObject.remove(Defines$Jsonkey.PreviousUpdateTime.getKey());
        jSONObject.remove(Defines$Jsonkey.InstallBeginTimeStamp.getKey());
        jSONObject.remove(Defines$Jsonkey.ClickedReferrerTimeStamp.getKey());
        jSONObject.remove(Defines$Jsonkey.HardwareID.getKey());
        jSONObject.remove(Defines$Jsonkey.IsHardwareIDReal.getKey());
        jSONObject.remove(Defines$Jsonkey.LocalIP.getKey());
        jSONObject.remove(Defines$Jsonkey.ReferrerGclid.getKey());
        jSONObject.remove(Defines$Jsonkey.Identity.getKey());
        try {
            jSONObject.put(Defines$Jsonkey.TrackingDisabled.getKey(), true);
        } catch (JSONException unused) {
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0099 A[SYNTHETIC, Splitter:B:17:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19254n(org.json.JSONObject r20) throws org.json.JSONException {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            super.mo19254n(r20)
            io.branch.referral.r r0 = r1.f15617c
            r0.mo19329s(r2)
            io.branch.referral.q r0 = p145io.branch.referral.C7072q.m13663c()
            java.lang.String r0 = r0.mo19308a()
            boolean r3 = p145io.branch.referral.C7072q.m13664d(r0)
            if (r3 != 0) goto L_0x0023
            io.branch.referral.Defines$Jsonkey r3 = p145io.branch.referral.Defines$Jsonkey.AppVersion
            java.lang.String r3 = r3.getKey()
            r2.put(r3, r0)
        L_0x0023:
            io.branch.referral.r r0 = r1.f15617c
            java.lang.String r3 = "bnc_initial_referrer"
            java.lang.String r0 = r0.mo19328r(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r4 = "bnc_no_value"
            if (r0 != 0) goto L_0x004e
            io.branch.referral.r r0 = r1.f15617c
            java.lang.String r0 = r0.mo19328r(r3)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x004e
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.InitialReferrer
            java.lang.String r0 = r0.getKey()
            io.branch.referral.r r5 = r1.f15617c
            java.lang.String r3 = r5.mo19328r(r3)
            r2.put(r0, r3)
        L_0x004e:
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.FaceBookAppLinkChecked
            java.lang.String r0 = r0.getKey()
            io.branch.referral.r r3 = r1.f15617c
            java.lang.String r5 = "bnc_triggered_by_fb_app_link"
            boolean r3 = r3.mo19316e(r5)
            r2.put(r0, r3)
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.Debug
            java.lang.String r0 = r0.getKey()
            r3 = 0
            r2.put(r0, r3)
            io.branch.referral.q r0 = p145io.branch.referral.C7072q.m13663c()
            java.lang.String r5 = r0.mo19308a()
            io.branch.referral.q r0 = p145io.branch.referral.C7072q.m13663c()
            android.content.Context r0 = r0.f15749b
            r6 = 0
            if (r0 == 0) goto L_0x0090
            android.content.pm.PackageManager r8 = r0.getPackageManager()     // Catch:{ Exception -> 0x008a }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x008a }
            android.content.pm.PackageInfo r0 = r8.getPackageInfo(r0, r3)     // Catch:{ Exception -> 0x008a }
            long r8 = r0.firstInstallTime     // Catch:{ Exception -> 0x008a }
            goto L_0x0091
        L_0x008a:
            r0 = move-exception
            java.lang.String r8 = "Error obtaining FirstInstallTime"
            p145io.branch.referral.C7077r.m13676b(r8, r0)
        L_0x0090:
            r8 = r6
        L_0x0091:
            io.branch.referral.q r0 = p145io.branch.referral.C7072q.m13663c()
            android.content.Context r0 = r0.f15749b
            if (r0 == 0) goto L_0x00ae
            android.content.pm.PackageManager r10 = r0.getPackageManager()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x00a8 }
            android.content.pm.PackageInfo r0 = r10.getPackageInfo(r0, r3)     // Catch:{ Exception -> 0x00a8 }
            long r10 = r0.lastUpdateTime     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00af
        L_0x00a8:
            r0 = move-exception
            java.lang.String r10 = "Error obtaining LastUpdateTime"
            p145io.branch.referral.C7077r.m13676b(r10, r0)
        L_0x00ae:
            r10 = r6
        L_0x00af:
            io.branch.referral.r r0 = r1.f15617c
            java.lang.String r12 = "bnc_app_version"
            java.lang.String r0 = r0.mo19328r(r12)
            boolean r0 = r4.equals(r0)
            r13 = 2
            r14 = 1
            if (r0 == 0) goto L_0x00e6
            long r15 = r10 - r8
            r17 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r13 = r3
        L_0x00ca:
            android.content.Context r0 = r1.f15772j
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r5 = "com.mobileapptracking"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r5, r3)
            r3 = 0
            java.lang.String r5 = "mat_id"
            java.lang.String r0 = r0.getString(r5, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r14
            if (r0 == 0) goto L_0x00f4
            r13 = 5
            goto L_0x00f4
        L_0x00e6:
            io.branch.referral.r r0 = r1.f15617c
            java.lang.String r0 = r0.mo19328r(r12)
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r13 = r14
        L_0x00f4:
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.Update
            java.lang.String r0 = r0.getKey()
            r2.put(r0, r13)
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.FirstInstallTime
            java.lang.String r0 = r0.getKey()
            r2.put(r0, r8)
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.LastUpdateTime
            java.lang.String r0 = r0.getKey()
            r2.put(r0, r10)
            io.branch.referral.r r0 = r1.f15617c
            java.lang.String r3 = "bnc_original_install_time"
            long r12 = r0.mo19321k(r3)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0121
            io.branch.referral.r r0 = r1.f15617c
            r0.mo19332v(r8, r3)
            goto L_0x0122
        L_0x0121:
            r8 = r12
        L_0x0122:
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.OriginalInstallTime
            java.lang.String r0 = r0.getKey()
            r2.put(r0, r8)
            io.branch.referral.r r0 = r1.f15617c
            java.lang.String r3 = "bnc_last_known_update_time"
            long r5 = r0.mo19321k(r3)
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            java.lang.String r7 = "bnc_previous_update_time"
            if (r0 >= 0) goto L_0x0143
            io.branch.referral.r r0 = r1.f15617c
            r0.mo19332v(r5, r7)
            io.branch.referral.r r0 = r1.f15617c
            r0.mo19332v(r10, r3)
        L_0x0143:
            io.branch.referral.Defines$Jsonkey r0 = p145io.branch.referral.Defines$Jsonkey.PreviousUpdateTime
            java.lang.String r0 = r0.getKey()
            io.branch.referral.r r3 = r1.f15617c
            long r5 = r3.mo19321k(r7)
            r2.put(r0, r5)
            r19.mo19258r(r20)
            io.branch.referral.r r0 = r1.f15617c
            java.lang.String r3 = "bnc_identity"
            java.lang.String r0 = r0.mo19328r(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0172
            boolean r3 = r0.equals(r4)
            if (r3 != 0) goto L_0x0172
            io.branch.referral.Defines$Jsonkey r3 = p145io.branch.referral.Defines$Jsonkey.Identity
            java.lang.String r3 = r3.getKey()
            r2.put(r3, r0)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7087w.mo19254n(org.json.JSONObject):void");
    }

    /* renamed from: p */
    public final boolean mo19256p() {
        return true;
    }

    /* renamed from: q */
    public final JSONObject mo19257q() {
        JSONObject q = super.mo19257q();
        try {
            q.put("INITIATED_BY_CLIENT", this.f15774l);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return q;
    }

    /* renamed from: s */
    public abstract String mo19265s();

    public C7087w(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context, boolean z) {
        super(defines$RequestPath, jSONObject, context);
        this.f15772j = context;
        this.f15774l = !z;
    }
}
