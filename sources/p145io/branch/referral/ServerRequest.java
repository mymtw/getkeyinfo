package p145io.branch.referral;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.C7074q0;

/* renamed from: io.branch.referral.ServerRequest */
public abstract class ServerRequest {

    /* renamed from: i */
    public static final Defines$RequestPath[] f15614i = {Defines$RequestPath.RegisterInstall, Defines$RequestPath.RegisterOpen, Defines$RequestPath.CompletedAction, Defines$RequestPath.ContentEvent, Defines$RequestPath.TrackStandardEvent, Defines$RequestPath.TrackCustomEvent};

    /* renamed from: a */
    public JSONObject f15615a;

    /* renamed from: b */
    public final Defines$RequestPath f15616b;

    /* renamed from: c */
    public final C7077r f15617c;

    /* renamed from: d */
    public long f15618d = 0;

    /* renamed from: e */
    public final Context f15619e;

    /* renamed from: f */
    public final HashSet f15620f;

    /* renamed from: g */
    public boolean f15621g = false;

    /* renamed from: h */
    public int f15622h = 0;

    /* renamed from: io.branch.referral.ServerRequest$BRANCH_API_VERSION */
    public enum BRANCH_API_VERSION {
        V1,
        V1_CPID,
        V1_LATD,
        V2
    }

    /* renamed from: io.branch.referral.ServerRequest$PROCESS_WAIT_LOCK */
    public enum PROCESS_WAIT_LOCK {
        SDK_INIT_WAIT_LOCK,
        FB_APP_LINK_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        STRONG_MATCH_PENDING_WAIT_LOCK,
        USER_SET_WAIT_LOCK,
        HUAWEI_INSTALL_REFERRER_FETCH_WAIT_LOCK,
        GOOGLE_INSTALL_REFERRER_FETCH_WAIT_LOCK,
        SAMSUNG_INSTALL_REFERRER_FETCH_WAIT_LOCK,
        XIAOMI_INSTALL_REFERRER_FETCH_WAIT_LOCK
    }

    public ServerRequest(Context context, Defines$RequestPath defines$RequestPath) {
        this.f15619e = context;
        this.f15616b = defines$RequestPath;
        this.f15617c = C7077r.m13677h(context);
        this.f15615a = new JSONObject();
        this.f15620f = new HashSet();
    }

    /* renamed from: c */
    public static boolean m13601c(Context context) {
        int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.INTERNET");
        if (!(checkCallingOrSelfPermission == 0)) {
            C7077r.m13675a("Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        }
        return checkCallingOrSelfPermission == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ JSONException -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[Catch:{ JSONException -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p145io.branch.referral.ServerRequest m13602d(android.content.Context r6, org.json.JSONObject r7) {
        /*
            java.lang.String r0 = "INITIATED_BY_CLIENT"
            java.lang.String r1 = "REQ_POST_PATH"
            java.lang.String r2 = "REQ_POST"
            java.lang.String r3 = ""
            r4 = 0
            boolean r5 = r7.has(r2)     // Catch:{ JSONException -> 0x0014 }
            if (r5 == 0) goto L_0x0014
            org.json.JSONObject r2 = r7.getJSONObject(r2)     // Catch:{ JSONException -> 0x0014 }
            goto L_0x0015
        L_0x0014:
            r2 = r4
        L_0x0015:
            boolean r5 = r7.has(r1)     // Catch:{ JSONException -> 0x001f }
            if (r5 == 0) goto L_0x001f
            java.lang.String r3 = r7.getString(r1)     // Catch:{ JSONException -> 0x001f }
        L_0x001f:
            r1 = 1
            boolean r5 = r7.has(r0)     // Catch:{ JSONException -> 0x002b }
            if (r5 == 0) goto L_0x002b
            boolean r7 = r7.getBoolean(r0)     // Catch:{ JSONException -> 0x002b }
            r1 = r7
        L_0x002b:
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L_0x00ae
            io.branch.referral.Defines$RequestPath r7 = p145io.branch.referral.Defines$RequestPath.CompletedAction
            java.lang.String r0 = r7.getPath()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0043
            io.branch.referral.s r4 = new io.branch.referral.s
            r4.<init>((p145io.branch.referral.Defines$RequestPath) r7, (org.json.JSONObject) r2, (android.content.Context) r6)
            goto L_0x00ae
        L_0x0043:
            io.branch.referral.Defines$RequestPath r7 = p145io.branch.referral.Defines$RequestPath.GetURL
            java.lang.String r0 = r7.getPath()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0055
            io.branch.referral.t r4 = new io.branch.referral.t
            r4.<init>(r7, r2, r6)
            goto L_0x00ae
        L_0x0055:
            io.branch.referral.Defines$RequestPath r7 = p145io.branch.referral.Defines$RequestPath.IdentifyUser
            java.lang.String r0 = r7.getPath()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0067
            io.branch.referral.v r4 = new io.branch.referral.v
            r4.<init>(r7, r2, r6)
            goto L_0x00ae
        L_0x0067:
            io.branch.referral.Defines$RequestPath r7 = p145io.branch.referral.Defines$RequestPath.Logout
            java.lang.String r0 = r7.getPath()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0079
            io.branch.referral.x r4 = new io.branch.referral.x
            r4.<init>(r7, r2, r6)
            goto L_0x00ae
        L_0x0079:
            io.branch.referral.Defines$RequestPath r7 = p145io.branch.referral.Defines$RequestPath.RegisterClose
            java.lang.String r0 = r7.getPath()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x008b
            io.branch.referral.z r4 = new io.branch.referral.z
            r4.<init>(r7, r2, r6)
            goto L_0x00ae
        L_0x008b:
            io.branch.referral.Defines$RequestPath r7 = p145io.branch.referral.Defines$RequestPath.RegisterInstall
            java.lang.String r0 = r7.getPath()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x009d
            io.branch.referral.a0 r4 = new io.branch.referral.a0
            r4.<init>(r7, r2, r6, r1)
            goto L_0x00ae
        L_0x009d:
            io.branch.referral.Defines$RequestPath r7 = p145io.branch.referral.Defines$RequestPath.RegisterOpen
            java.lang.String r0 = r7.getPath()
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00ae
            io.branch.referral.b0 r4 = new io.branch.referral.b0
            r4.<init>(r7, r2, r6, r1)
        L_0x00ae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.ServerRequest.m13602d(android.content.Context, org.json.JSONObject):io.branch.referral.ServerRequest");
    }

    /* renamed from: l */
    public static boolean m13603l(JSONObject jSONObject) {
        return jSONObject.has(Defines$Jsonkey.AndroidID.getKey()) || jSONObject.has(Defines$Jsonkey.RandomizedDeviceToken.getKey());
    }

    /* renamed from: a */
    public final void mo19244a(PROCESS_WAIT_LOCK process_wait_lock) {
        if (process_wait_lock != null) {
            this.f15620f.add(process_wait_lock);
        }
    }

    /* renamed from: b */
    public abstract void mo19245b();

    /* renamed from: e */
    public BRANCH_API_VERSION mo19246e() {
        return BRANCH_API_VERSION.V1;
    }

    /* renamed from: f */
    public final String mo19247f() {
        return this.f15616b.getPath();
    }

    /* renamed from: g */
    public abstract void mo19248g(int i, String str);

    /* renamed from: h */
    public abstract void mo19249h();

    /* renamed from: i */
    public boolean mo19250i() {
        return !(this instanceof C7082t);
    }

    /* renamed from: j */
    public void mo19251j() {
    }

    /* renamed from: k */
    public abstract void mo19252k(C7031c0 c0Var, Branch branch);

    /* renamed from: m */
    public boolean mo19253m() {
        return this instanceof C7082t;
    }

    /* renamed from: n */
    public void mo19254n(JSONObject jSONObject) throws JSONException {
        String n;
        String str;
        this.f15615a = jSONObject;
        if (mo19246e() == BRANCH_API_VERSION.V1) {
            C7072q c = C7072q.m13663c();
            JSONObject jSONObject2 = this.f15615a;
            c.getClass();
            try {
                C7074q0.C7076b b = c.mo19309b();
                if (!C7072q.m13664d(b.f15753a)) {
                    jSONObject2.put(Defines$Jsonkey.HardwareID.getKey(), b.f15753a);
                    jSONObject2.put(Defines$Jsonkey.IsHardwareIDReal.getKey(), b.f15754b);
                }
                String str2 = Build.MANUFACTURER;
                if (!C7072q.m13664d(str2)) {
                    jSONObject2.put(Defines$Jsonkey.Brand.getKey(), str2);
                }
                String str3 = Build.MODEL;
                if (!C7072q.m13664d(str3)) {
                    jSONObject2.put(Defines$Jsonkey.Model.getKey(), str3);
                }
                DisplayMetrics d = C7074q0.m13671d(c.f15749b);
                jSONObject2.put(Defines$Jsonkey.ScreenDpi.getKey(), d.densityDpi);
                jSONObject2.put(Defines$Jsonkey.ScreenHeight.getKey(), d.heightPixels);
                jSONObject2.put(Defines$Jsonkey.ScreenWidth.getKey(), d.widthPixels);
                jSONObject2.put(Defines$Jsonkey.WiFi.getKey(), "wifi".equalsIgnoreCase(C7074q0.m13668a(c.f15749b)));
                jSONObject2.put(Defines$Jsonkey.UIMode.getKey(), C7074q0.m13672e(c.f15749b));
                String c2 = C7074q0.m13670c(c.f15749b);
                if (!C7072q.m13664d(c2)) {
                    jSONObject2.put(Defines$Jsonkey.OS.getKey(), c2);
                }
                jSONObject2.put(Defines$Jsonkey.APILevel.getKey(), Build.VERSION.SDK_INT);
                c.mo19310e(this, jSONObject2);
                String country = Locale.getDefault().getCountry();
                if (!TextUtils.isEmpty(country)) {
                    jSONObject2.put(Defines$Jsonkey.Country.getKey(), country);
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject2.put(Defines$Jsonkey.Language.getKey(), language);
                }
                String b2 = C7074q0.m13669b();
                if (!TextUtils.isEmpty(b2)) {
                    jSONObject2.put(Defines$Jsonkey.LocalIP.getKey(), b2);
                }
            } catch (JSONException unused) {
            }
        } else {
            JSONObject jSONObject3 = new JSONObject();
            this.f15615a.put(Defines$Jsonkey.UserData.getKey(), jSONObject3);
            C7072q c3 = C7072q.m13663c();
            C7077r rVar = this.f15617c;
            c3.getClass();
            C7074q0.C7076b b3 = c3.mo19309b();
            if (!C7072q.m13664d(b3.f15753a)) {
                jSONObject3.put(Defines$Jsonkey.AndroidID.getKey(), b3.f15753a);
            }
            String str4 = Build.MANUFACTURER;
            if (!C7072q.m13664d(str4)) {
                jSONObject3.put(Defines$Jsonkey.Brand.getKey(), str4);
            }
            String str5 = Build.MODEL;
            if (!C7072q.m13664d(str5)) {
                jSONObject3.put(Defines$Jsonkey.Model.getKey(), str5);
            }
            DisplayMetrics d2 = C7074q0.m13671d(c3.f15749b);
            jSONObject3.put(Defines$Jsonkey.ScreenDpi.getKey(), d2.densityDpi);
            jSONObject3.put(Defines$Jsonkey.ScreenHeight.getKey(), d2.heightPixels);
            jSONObject3.put(Defines$Jsonkey.ScreenWidth.getKey(), d2.widthPixels);
            jSONObject3.put(Defines$Jsonkey.UIMode.getKey(), C7074q0.m13672e(c3.f15749b));
            String c4 = C7074q0.m13670c(c3.f15749b);
            if (!C7072q.m13664d(c4)) {
                jSONObject3.put(Defines$Jsonkey.OS.getKey(), c4);
            }
            jSONObject3.put(Defines$Jsonkey.APILevel.getKey(), Build.VERSION.SDK_INT);
            c3.mo19310e(this, jSONObject3);
            String country2 = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country2)) {
                jSONObject3.put(Defines$Jsonkey.Country.getKey(), country2);
            }
            String language2 = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language2)) {
                jSONObject3.put(Defines$Jsonkey.Language.getKey(), language2);
            }
            String b4 = C7074q0.m13669b();
            if (!TextUtils.isEmpty(b4)) {
                jSONObject3.put(Defines$Jsonkey.LocalIP.getKey(), b4);
            }
            if (rVar != null) {
                if (!C7072q.m13664d(rVar.mo19323m())) {
                    jSONObject3.put(Defines$Jsonkey.RandomizedDeviceToken.getKey(), rVar.mo19323m());
                }
                String r = rVar.mo19328r("bnc_identity");
                if (!C7072q.m13664d(r)) {
                    jSONObject3.put(Defines$Jsonkey.DeveloperIdentity.getKey(), r);
                }
                String r2 = rVar.mo19328r("bnc_app_store_source");
                if (!"bnc_no_value".equals(r2)) {
                    jSONObject3.put(Defines$Jsonkey.App_Store.getKey(), r2);
                }
            }
            jSONObject3.put(Defines$Jsonkey.AppVersion.getKey(), c3.mo19308a());
            jSONObject3.put(Defines$Jsonkey.SDK.getKey(), "android");
            jSONObject3.put(Defines$Jsonkey.SdkVersion.getKey(), "5.2.2");
            String key = Defines$Jsonkey.UserAgent.getKey();
            try {
                str = WebSettings.getDefaultUserAgent(c3.f15749b);
            } catch (Exception unused2) {
                str = "";
            }
            jSONObject3.put(key, str);
            if (this instanceof C7083u) {
                C7083u uVar = (C7083u) this;
                jSONObject3.put(Defines$Jsonkey.LATDAttributionWindow.getKey(), 0);
            }
        }
        C7072q c5 = C7072q.m13663c();
        C7077r rVar2 = this.f15617c;
        JSONObject jSONObject4 = this.f15615a;
        c5.getClass();
        try {
            if (!(this instanceof C7027a0) && (n = rVar2.mo19324n()) != null && !n.equals("bnc_no_value")) {
                jSONObject4.put(Defines$Jsonkey.ReferrerGclid.getKey(), n);
            }
        } catch (JSONException unused3) {
        }
    }

    /* renamed from: o */
    public boolean mo19255o() {
        return this instanceof C7079s;
    }

    /* renamed from: p */
    public boolean mo19256p() {
        return this instanceof C7083u;
    }

    /* renamed from: q */
    public JSONObject mo19257q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("REQ_POST", this.f15615a);
            jSONObject.put("REQ_POST_PATH", this.f15616b.getPath());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public final void mo19258r(JSONObject jSONObject) {
        try {
            Context context = C7072q.m13663c().f15749b;
            boolean z = false;
            if (context != null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage != null) {
                        z = !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty();
                    }
                } catch (Exception e) {
                    C7077r.m13676b("Error obtaining PackageInfo", e);
                }
            }
            String key = (z ? Defines$Jsonkey.NativeApp : Defines$Jsonkey.InstantApp).getKey();
            if (mo19246e() == BRANCH_API_VERSION.V2) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Defines$Jsonkey.UserData.getKey());
                if (optJSONObject != null) {
                    optJSONObject.put(Defines$Jsonkey.Environment.getKey(), key);
                    return;
                }
                return;
            }
            jSONObject.put(Defines$Jsonkey.Environment.getKey(), key);
        } catch (Exception unused) {
        }
    }

    public ServerRequest(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context) {
        this.f15619e = context;
        this.f15616b = defines$RequestPath;
        this.f15615a = jSONObject;
        this.f15617c = C7077r.m13677h(context);
        this.f15620f = new HashSet();
    }
}
