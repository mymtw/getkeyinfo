package com.facebook.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0118a;
import androidx.activity.result.C0120c;
import androidx.activity.result.C0122e;
import androidx.activity.result.C0126g;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.editable.EditableListing;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.paypal.pyplcheckout.utils.BrowserPackages;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p019b.C3443a;
import p156k.C7160b;
import p156k.C7167d;
import p365hg.C12850e;
import p365hg.C12879l0;
import p365hg.C12903s;
import p401mg.C13080a;
import p453tf.C13415g;
import p453tf.C13417i;
import p453tf.C13418j;

/* renamed from: com.facebook.login.e */
public class C12311e {

    /* renamed from: j */
    public static final Set<String> f27436j = Collections.unmodifiableSet(new LoginManager$2());

    /* renamed from: k */
    public static final String f27437k = C12311e.class.toString();

    /* renamed from: l */
    public static volatile C12311e f27438l;

    /* renamed from: a */
    public LoginBehavior f27439a = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    public DefaultAudience f27440b = DefaultAudience.FRIENDS;

    /* renamed from: c */
    public final SharedPreferences f27441c;

    /* renamed from: d */
    public String f27442d = "rerequest";

    /* renamed from: e */
    public String f27443e;

    /* renamed from: f */
    public boolean f27444f;

    /* renamed from: g */
    public LoginTargetApp f27445g = LoginTargetApp.FACEBOOK;

    /* renamed from: h */
    public boolean f27446h = false;

    /* renamed from: i */
    public boolean f27447i = false;

    /* renamed from: com.facebook.login.e$a */
    public class C12312a implements CallbackManagerImpl.C12247a {

        /* renamed from: a */
        public final /* synthetic */ C13417i f27448a;

        public C12312a(C13417i iVar) {
            this.f27448a = iVar;
        }

        /* renamed from: a */
        public final boolean mo39375a(int i, Intent intent) {
            C12311e.this.mo39616e(i, intent, this.f27448a);
            return true;
        }
    }

    /* renamed from: com.facebook.login.e$b */
    public class C12313b implements CallbackManagerImpl.C12247a {
        public C12313b() {
        }

        /* renamed from: a */
        public final boolean mo39375a(int i, Intent intent) {
            C12311e.this.mo39616e(i, intent, (C13417i) null);
            return true;
        }
    }

    /* renamed from: com.facebook.login.e$c */
    public static class C12314c implements C12322g {

        /* renamed from: a */
        public final Activity f27451a;

        public C12314c(Activity activity) {
            C12879l0.m20601e(activity, "activity");
            this.f27451a = activity;
        }

        /* renamed from: a */
        public final Activity mo39619a() {
            return this.f27451a;
        }

        public final void startActivityForResult(Intent intent, int i) {
            this.f27451a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.e$d */
    public static class C12315d implements C12322g {

        /* renamed from: a */
        public C0126g f27452a;

        /* renamed from: b */
        public C13415g f27453b;

        /* renamed from: com.facebook.login.e$d$a */
        public class C12316a extends C3443a<Intent, Pair<Integer, Intent>> {
            /* renamed from: a */
            public final Intent mo1146a(ComponentActivity componentActivity, Object obj) {
                return (Intent) obj;
            }

            /* renamed from: c */
            public final Object mo1147c(int i, Intent intent) {
                return Pair.create(Integer.valueOf(i), intent);
            }
        }

        /* renamed from: com.facebook.login.e$d$b */
        public class C12317b {

            /* renamed from: a */
            public C0120c<Intent> f27454a = null;
        }

        /* renamed from: com.facebook.login.e$d$c */
        public class C12318c implements C0118a<Pair<Integer, Intent>> {

            /* renamed from: b */
            public final /* synthetic */ C12317b f27455b;

            public C12318c(C12317b bVar) {
                this.f27455b = bVar;
            }

            /* renamed from: a */
            public final void mo413a(Object obj) {
                Pair pair = (Pair) obj;
                C12315d.this.f27453b.onActivityResult(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), ((Integer) pair.first).intValue(), (Intent) pair.second);
                C0120c<Intent> cVar = this.f27455b.f27454a;
                if (cVar != null) {
                    cVar.mo1158c();
                    this.f27455b.f27454a = null;
                }
            }
        }

        public C12315d(C0126g gVar, C13415g gVar2) {
            this.f27452a = gVar;
            this.f27453b = gVar2;
        }

        /* renamed from: a */
        public final Activity mo39619a() {
            C0126g gVar = this.f27452a;
            if (gVar instanceof Activity) {
                return (Activity) gVar;
            }
            return null;
        }

        public final void startActivityForResult(Intent intent, int i) {
            C12317b bVar = new C12317b();
            C0122e d = this.f27452a.getActivityResultRegistry().mo1161d("facebook-login", new C12316a(), new C12318c(bVar));
            bVar.f27454a = d;
            d.mo1157b(intent);
        }
    }

    /* renamed from: com.facebook.login.e$e */
    public static class C12319e implements C12322g {

        /* renamed from: a */
        public final C12903s f27457a;

        public C12319e(C12903s sVar) {
            String str = C12879l0.f28392a;
            this.f27457a = sVar;
        }

        /* renamed from: a */
        public final Activity mo39619a() {
            C12903s sVar = this.f27457a;
            Fragment fragment = sVar.f28451a;
            if (fragment != null) {
                return fragment.getActivity();
            }
            android.app.Fragment fragment2 = sVar.f28452b;
            if (fragment2 != null) {
                return fragment2.getActivity();
            }
            return null;
        }

        public final void startActivityForResult(Intent intent, int i) {
            C12903s sVar = this.f27457a;
            Fragment fragment = sVar.f28451a;
            if (fragment != null) {
                fragment.startActivityForResult(intent, i);
                return;
            }
            android.app.Fragment fragment2 = sVar.f28452b;
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i);
            }
        }
    }

    /* renamed from: com.facebook.login.e$f */
    public static class C12320f {

        /* renamed from: a */
        public static C12310d f27458a;

        /* renamed from: a */
        public static C12310d m20155a(Activity activity) {
            C12310d dVar;
            Class<C12320f> cls = C12320f.class;
            Context context = activity;
            if (activity == null) {
                context = C13418j.m21106b();
            }
            if (context == null) {
                dVar = null;
            } else {
                if (f27458a == null) {
                    f27458a = new C12310d(context, C13418j.m21107c());
                }
                dVar = f27458a;
            }
            return dVar;
        }
    }

    public C12311e() {
        C12879l0.m20603g();
        this.f27441c = C13418j.m21106b().getSharedPreferences("com.facebook.loginManager", 0);
        if (C13418j.f29395o && C12850e.m20501a() != null) {
            C7167d.m13828a(C13418j.m21106b(), BrowserPackages.CHROME_PACKAGE, new CustomTabPrefetchHelper());
            Context b = C13418j.m21106b();
            String packageName = C13418j.m21106b().getPackageName();
            if (packageName != null) {
                Context applicationContext = b.getApplicationContext();
                try {
                    C7167d.m13828a(applicationContext, packageName, new C7160b(applicationContext));
                } catch (SecurityException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static C12311e m20139b() {
        if (f27438l == null) {
            synchronized (C12311e.class) {
                if (f27438l == null) {
                    f27438l = new C12311e();
                }
            }
        }
        return f27438l;
    }

    /* renamed from: c */
    public static boolean m20140c(String str) {
        return str != null && (str.startsWith(EditableListing.REQUEST_PARAM_PUBLISH) || str.startsWith("manage") || f27436j.contains(str));
    }

    /* renamed from: d */
    public static void m20141d(Activity activity, LoginClient.Result.Code code, Map map, FacebookException facebookException, boolean z, LoginClient.Request request) {
        C12310d a = C12320f.m20155a(activity);
        if (a != null) {
            String str = "fb_mobile_login_complete";
            if (request != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("try_login_activity", z ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
                String authId = request.getAuthId();
                if (request.isFamilyLogin()) {
                    str = "foa_mobile_login_complete";
                }
                if (!C13080a.m20762b(a)) {
                    try {
                        Bundle b = C12310d.m20137b(authId);
                        if (code != null) {
                            b.putString("2_result", code.getLoggingValue());
                        }
                        if (!(facebookException == null || facebookException.getMessage() == null)) {
                            b.putString("5_error_message", facebookException.getMessage());
                        }
                        JSONObject jSONObject = null;
                        if (!hashMap.isEmpty()) {
                            jSONObject = new JSONObject(hashMap);
                        }
                        if (map != null) {
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            try {
                                for (Map.Entry entry : map.entrySet()) {
                                    jSONObject.put((String) entry.getKey(), entry.getValue());
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        if (jSONObject != null) {
                            b.putString("6_extras", jSONObject.toString());
                        }
                        a.f27433a.mo46174a(b, str);
                        if (code == LoginClient.Result.Code.SUCCESS && !C13080a.m20762b(a)) {
                            C12310d.f27432d.schedule(new C12309c(a, C12310d.m20137b(authId)), 5, TimeUnit.SECONDS);
                        }
                    } catch (Throwable th) {
                        C13080a.m20761a(a, th);
                    }
                }
            } else if (!C13080a.m20762b(a)) {
                try {
                    a.mo39614a(str, "");
                } catch (Throwable th2) {
                    C13080a.m20761a(a, th2);
                }
            }
        }
    }

    /* renamed from: h */
    public static void m20142h(C13415g gVar) {
        if (gVar instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) gVar).f27340a.remove(Integer.valueOf(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode()));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* renamed from: a */
    public final LoginClient.Request mo39615a(C12308b bVar) {
        LoginClient.Request request = new LoginClient.Request(this.f27439a, Collections.unmodifiableSet(bVar.f27428a != null ? new HashSet(bVar.f27428a) : new HashSet()), this.f27440b, this.f27442d, C13418j.m21107c(), UUID.randomUUID().toString(), this.f27445g, bVar.f27429b);
        request.setRerequest(AccessToken.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.f27443e);
        request.setResetMessengerState(this.f27444f);
        request.setFamilyLogin(this.f27446h);
        request.setShouldSkipAccountDeduplication(this.f27447i);
        return request;
    }

    /* renamed from: e */
    public final void mo39616e(int i, Intent intent, C13417i iVar) {
        boolean z;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Result.Code code;
        Map<String, String> map;
        FacebookException facebookException;
        LoginClient.Request request;
        Map<String, String> map2;
        AuthenticationToken authenticationToken2;
        boolean z2;
        LoginClient.Request request2;
        FacebookAuthorizationException facebookAuthorizationException;
        FacebookAuthorizationException facebookAuthorizationException2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        C12321f fVar = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result != null) {
                LoginClient.Request request3 = result.request;
                LoginClient.Result.Code code3 = result.code;
                if (i == -1) {
                    if (code3 == LoginClient.Result.Code.SUCCESS) {
                        accessToken = result.token;
                        authenticationToken2 = result.authenticationToken;
                        z2 = false;
                        facebookAuthorizationException = null;
                        map2 = result.loggingExtras;
                        FacebookAuthorizationException facebookAuthorizationException3 = facebookAuthorizationException;
                        request2 = request3;
                        code2 = code3;
                        facebookException = facebookAuthorizationException3;
                    } else {
                        facebookAuthorizationException2 = new FacebookAuthorizationException(result.errorMessage);
                    }
                } else if (i == 0) {
                    z2 = true;
                    accessToken = null;
                    facebookAuthorizationException = null;
                    authenticationToken2 = null;
                    map2 = result.loggingExtras;
                    FacebookAuthorizationException facebookAuthorizationException32 = facebookAuthorizationException;
                    request2 = request3;
                    code2 = code3;
                    facebookException = facebookAuthorizationException32;
                } else {
                    facebookAuthorizationException2 = null;
                }
                authenticationToken2 = null;
                z2 = false;
                facebookAuthorizationException = facebookAuthorizationException2;
                accessToken = null;
                map2 = result.loggingExtras;
                FacebookAuthorizationException facebookAuthorizationException322 = facebookAuthorizationException;
                request2 = request3;
                code2 = code3;
                facebookException = facebookAuthorizationException322;
            } else {
                accessToken = null;
                map2 = null;
                facebookException = null;
                authenticationToken2 = null;
                z2 = false;
                request2 = null;
            }
            authenticationToken = authenticationToken2;
            code = code2;
            request = request2;
            boolean z3 = z2;
            map = map2;
            z = z3;
        } else if (i == 0) {
            code = LoginClient.Result.Code.CANCEL;
            z = true;
            accessToken = null;
            request = null;
            facebookException = null;
            map = null;
            authenticationToken = null;
        } else {
            code = code2;
            accessToken = null;
            request = null;
            facebookException = null;
            map = null;
            authenticationToken = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        m20141d((Activity) null, code, map, facebookException2, true, request);
        if (accessToken != null) {
            AccessToken.setCurrentAccessToken(accessToken);
            Profile.fetchProfileForCurrentAccessToken();
        }
        if (authenticationToken != null) {
            AuthenticationToken.setCurrentAuthenticationToken(authenticationToken);
        }
        if (iVar != null) {
            if (accessToken != null) {
                Set<String> permissions = request.getPermissions();
                HashSet hashSet = new HashSet(accessToken.getPermissions());
                if (request.isRerequest()) {
                    hashSet.retainAll(permissions);
                }
                HashSet hashSet2 = new HashSet(permissions);
                hashSet2.removeAll(hashSet);
                fVar = new C12321f(accessToken, authenticationToken, hashSet, hashSet2);
            }
            if (z || (fVar != null && fVar.f27461c.size() == 0)) {
                iVar.onCancel();
            } else if (facebookException2 != null) {
                iVar.mo30105b(facebookException2);
            } else if (accessToken != null) {
                SharedPreferences.Editor edit = this.f27441c.edit();
                edit.putBoolean("express_login_allowed", true);
                edit.apply();
                iVar.mo30104a(fVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo39617f(C13415g gVar, C13417i<C12321f> iVar) {
        if (gVar instanceof CallbackManagerImpl) {
            CallbackManagerImpl callbackManagerImpl = (CallbackManagerImpl) gVar;
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            C12312a aVar = new C12312a(iVar);
            callbackManagerImpl.getClass();
            callbackManagerImpl.f27340a.put(Integer.valueOf(requestCode), aVar);
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|(1:13)|14|(1:16)|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0089 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39618g(com.facebook.login.C12322g r10, com.facebook.login.LoginClient.Request r11) throws com.facebook.FacebookException {
        /*
            r9 = this;
            android.app.Activity r0 = r10.mo39619a()
            com.facebook.login.d r0 = com.facebook.login.C12311e.C12320f.m20155a(r0)
            if (r0 == 0) goto L_0x0093
            boolean r1 = r11.isFamilyLogin()
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = "foa_mobile_login_start"
            goto L_0x0015
        L_0x0013:
            java.lang.String r1 = "fb_mobile_login_start"
        L_0x0015:
            boolean r2 = p401mg.C13080a.m20762b(r0)
            if (r2 == 0) goto L_0x001c
            goto L_0x0093
        L_0x001c:
            java.lang.String r2 = r11.getAuthId()     // Catch:{ all -> 0x008f }
            android.os.Bundle r2 = com.facebook.login.C12310d.m20137b(r2)     // Catch:{ all -> 0x008f }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0089 }
            r3.<init>()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r4 = "login_behavior"
            com.facebook.login.LoginBehavior r5 = r11.getLoginBehavior()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x0089 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r4 = "request_code"
            int r5 = com.facebook.login.LoginClient.getLoginRequestCode()     // Catch:{ JSONException -> 0x0089 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r4 = "permissions"
            java.lang.String r5 = ","
            java.util.Set r6 = r11.getPermissions()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r5 = android.text.TextUtils.join(r5, r6)     // Catch:{ JSONException -> 0x0089 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r4 = "default_audience"
            com.facebook.login.DefaultAudience r5 = r11.getDefaultAudience()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x0089 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r4 = "isReauthorize"
            boolean r5 = r11.isRerequest()     // Catch:{ JSONException -> 0x0089 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r4 = r0.f27435c     // Catch:{ JSONException -> 0x0089 }
            if (r4 == 0) goto L_0x006d
            java.lang.String r5 = "facebookVersion"
            r3.put(r5, r4)     // Catch:{ JSONException -> 0x0089 }
        L_0x006d:
            com.facebook.login.LoginTargetApp r4 = r11.getLoginTargetApp()     // Catch:{ JSONException -> 0x0089 }
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = "target_app"
            com.facebook.login.LoginTargetApp r5 = r11.getLoginTargetApp()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x0089 }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x0089 }
        L_0x0080:
            java.lang.String r4 = "6_extras"
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0089 }
            r2.putString(r4, r3)     // Catch:{ JSONException -> 0x0089 }
        L_0x0089:
            uf.m r3 = r0.f27433a     // Catch:{ all -> 0x008f }
            r3.mo46175b(r1, r2)     // Catch:{ all -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r1 = move-exception
            p401mg.C13080a.m20761a(r0, r1)
        L_0x0093:
            com.facebook.internal.CallbackManagerImpl$RequestCodeOffset r0 = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login
            int r0 = r0.toRequestCode()
            com.facebook.login.e$b r1 = new com.facebook.login.e$b
            r1.<init>()
            com.facebook.internal.CallbackManagerImpl.m20094a(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r1 = p453tf.C13418j.m21106b()
            java.lang.Class<com.facebook.FacebookActivity> r2 = com.facebook.FacebookActivity.class
            r0.setClass(r1, r2)
            com.facebook.login.LoginBehavior r1 = r11.getLoginBehavior()
            java.lang.String r1 = r1.toString()
            r0.setAction(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "request"
            r1.putParcelable(r2, r11)
            java.lang.String r2 = "com.facebook.LoginFragment:Request"
            r0.putExtra(r2, r1)
            android.content.Context r1 = p453tf.C13418j.m21106b()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 0
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r0, r2)
            r3 = 1
            if (r1 == 0) goto L_0x00db
            r1 = r3
            goto L_0x00dc
        L_0x00db:
            r1 = r2
        L_0x00dc:
            if (r1 != 0) goto L_0x00df
            goto L_0x00e7
        L_0x00df:
            int r1 = com.facebook.login.LoginClient.getLoginRequestCode()     // Catch:{ ActivityNotFoundException -> 0x00e7 }
            r10.startActivityForResult(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x00e7 }
            r2 = r3
        L_0x00e7:
            if (r2 == 0) goto L_0x00ea
            return
        L_0x00ea:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest."
            r0.<init>((java.lang.String) r1)
            r7 = 0
            android.app.Activity r3 = r10.mo39619a()
            com.facebook.login.LoginClient$Result$Code r4 = com.facebook.login.LoginClient.Result.Code.ERROR
            r5 = 0
            r6 = r0
            r8 = r11
            m20141d(r3, r4, r5, r6, r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C12311e.mo39618g(com.facebook.login.g, com.facebook.login.LoginClient$Request):void");
    }
}
