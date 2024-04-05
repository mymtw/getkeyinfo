package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import kotlin.text.C19459m;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13511h;

public abstract class LoginMethodHandler implements Parcelable {
    public static final C12301a Companion = new C12301a();
    public LoginClient loginClient;
    private Map<String, String> methodLoggingExtras;

    /* renamed from: com.facebook.login.LoginMethodHandler$a */
    public static final class C12301a {
        /* renamed from: a */
        public static AccessToken m20131a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
            String string;
            Bundle bundle2 = bundle;
            C19383o.m32797g(bundle, "bundle");
            C19383o.m32797g(str, "applicationId");
            Date n = C12869i0.m20575n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date n2 = C12869i0.m20575n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
            if (string2 == null) {
                return null;
            }
            boolean z = true;
            if ((string2.length() == 0) || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null) {
                return null;
            }
            if (string.length() != 0) {
                z = false;
            }
            if (z) {
                return null;
            }
            return new AccessToken(string2, str, string, stringArrayList, (Collection<String>) null, (Collection<String>) null, accessTokenSource, n, new Date(), n2, bundle.getString(AccessToken.GRAPH_DOMAIN));
        }

        /* renamed from: b */
        public static AuthenticationToken m20132b(Bundle bundle, String str) throws FacebookException {
            C19383o.m32797g(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                boolean z = true;
                if (!(string.length() == 0) && str != null) {
                    if (str.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        try {
                            return new AuthenticationToken(string, str);
                        } catch (Exception e) {
                            throw new FacebookException(e.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: c */
        public static String m20133c(String str) throws FacebookException {
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        Object[] array = C19459m.m33056y1(str, new String[]{"."}, 0, 6).toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length == 2) {
                                byte[] decode = Base64.decode(strArr[1], 0);
                                C19383o.m32796f(decode, "data");
                                String string = new JSONObject(new String(decode, C19446a.f43373b)).getString("user_id");
                                C19383o.m32796f(string, "jsonObject.getString(\"user_id\")");
                                return string;
                            }
                            throw new FacebookException("Failed to retrieve user_id from signed_request");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                }
            }
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
    }

    public LoginMethodHandler(LoginClient loginClient2) {
        C19383o.m32797g(loginClient2, "loginClient");
        this.loginClient = loginClient2;
    }

    public static final AccessToken createAccessTokenFromNativeLogin(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Companion.getClass();
        return C12301a.m20131a(bundle, accessTokenSource, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.AccessToken createAccessTokenFromWebBundle(java.util.Collection<java.lang.String> r15, android.os.Bundle r16, com.facebook.AccessTokenSource r17, java.lang.String r18) throws com.facebook.FacebookException {
        /*
            r0 = r16
            com.facebook.login.LoginMethodHandler$a r1 = Companion
            r1.getClass()
            java.lang.String r1 = "bundle"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            java.lang.String r1 = "applicationId"
            r4 = r18
            kotlin.jvm.internal.C19383o.m32797g(r4, r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r2 = "expires_in"
            java.util.Date r10 = p365hg.C12869i0.m20575n(r0, r2, r1)
            java.lang.String r1 = "access_token"
            java.lang.String r3 = r0.getString(r1)
            r1 = 0
            if (r3 == 0) goto L_0x0110
            java.util.Date r2 = new java.util.Date
            r5 = 0
            r2.<init>(r5)
            java.lang.String r5 = "data_access_expiration_time"
            java.util.Date r12 = p365hg.C12869i0.m20575n(r0, r5, r2)
            java.lang.String r2 = "granted_scopes"
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r6 = ","
            r7 = 1
            r8 = 6
            r9 = 0
            if (r2 == 0) goto L_0x0073
            int r11 = r2.length()
            if (r11 <= 0) goto L_0x004b
            r11 = r7
            goto L_0x004c
        L_0x004b:
            r11 = r9
        L_0x004c:
            if (r11 == 0) goto L_0x0073
            java.lang.String[] r11 = new java.lang.String[]{r6}
            java.util.List r2 = kotlin.text.C19459m.m33056y1(r2, r11, r9, r8)
            java.lang.String[] r11 = new java.lang.String[r9]
            java.lang.Object[] r2 = r2.toArray(r11)
            if (r2 == 0) goto L_0x006d
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r11 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r11)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.ArrayList r2 = p568fn.C17782b.m29888u(r2)
            r11 = r2
            goto L_0x0074
        L_0x006d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x0073:
            r11 = r15
        L_0x0074:
            java.lang.String r2 = "denied_scopes"
            java.lang.String r2 = r0.getString(r2)
            if (r2 == 0) goto L_0x00ac
            int r13 = r2.length()
            if (r13 <= 0) goto L_0x0084
            r13 = r7
            goto L_0x0085
        L_0x0084:
            r13 = r9
        L_0x0085:
            if (r13 == 0) goto L_0x00ac
            java.lang.String[] r13 = new java.lang.String[]{r6}
            java.util.List r2 = kotlin.text.C19459m.m33056y1(r2, r13, r9, r8)
            java.lang.String[] r13 = new java.lang.String[r9]
            java.lang.Object[] r2 = r2.toArray(r13)
            if (r2 == 0) goto L_0x00a6
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r13 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r13)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.ArrayList r2 = p568fn.C17782b.m29888u(r2)
            r13 = r2
            goto L_0x00ad
        L_0x00a6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x00ac:
            r13 = r1
        L_0x00ad:
            java.lang.String r2 = "expired_scopes"
            java.lang.String r2 = r0.getString(r2)
            if (r2 == 0) goto L_0x00e4
            int r14 = r2.length()
            if (r14 <= 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r7 = r9
        L_0x00bd:
            if (r7 == 0) goto L_0x00e4
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.util.List r2 = kotlin.text.C19459m.m33056y1(r2, r6, r9, r8)
            java.lang.String[] r6 = new java.lang.String[r9]
            java.lang.Object[] r2 = r2.toArray(r6)
            if (r2 == 0) goto L_0x00de
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r5 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.ArrayList r2 = p568fn.C17782b.m29888u(r2)
            r8 = r2
            goto L_0x00e5
        L_0x00de:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x00e4:
            r8 = r1
        L_0x00e5:
            boolean r2 = p365hg.C12869i0.m20546B(r3)
            if (r2 == 0) goto L_0x00ec
            goto L_0x0110
        L_0x00ec:
            java.lang.String r1 = "graph_domain"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "signed_request"
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r5 = com.facebook.login.LoginMethodHandler.C12301a.m20133c(r0)
            com.facebook.AccessToken r0 = new com.facebook.AccessToken
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            r2 = r0
            r4 = r18
            r6 = r11
            r7 = r13
            r9 = r17
            r11 = r14
            r13 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = r0
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginMethodHandler.createAccessTokenFromWebBundle(java.util.Collection, android.os.Bundle, com.facebook.AccessTokenSource, java.lang.String):com.facebook.AccessToken");
    }

    public static final AuthenticationToken createAuthenticationTokenFromNativeLogin(Bundle bundle, String str) throws FacebookException {
        Companion.getClass();
        return C12301a.m20132b(bundle, str);
    }

    public static final AuthenticationToken createAuthenticationTokenFromWebBundle(Bundle bundle, String str) throws FacebookException {
        Companion.getClass();
        C19383o.m32797g(bundle, "bundle");
        String string = bundle.getString(AuthenticationToken.AUTHENTICATION_TOKEN_KEY);
        if (string != null) {
            boolean z = true;
            if (!(string.length() == 0) && str != null) {
                if (str.length() != 0) {
                    z = false;
                }
                if (!z) {
                    try {
                        return new AuthenticationToken(string, str);
                    } catch (Exception e) {
                        throw new FacebookException(e.getMessage(), (Throwable) e);
                    }
                }
            }
        }
        return null;
    }

    public static final String getUserIDFromSignedRequest(String str) throws FacebookException {
        Companion.getClass();
        return C12301a.m20133c(str);
    }

    public void addLoggingExtra(String str, Object obj) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map<String, String> map = this.methodLoggingExtras;
        if (map != null) {
            String put = map.put(str, obj != null ? obj.toString() : null);
        }
    }

    public void cancel() {
    }

    public String getClientState(String str) {
        C19383o.m32797g(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", getNameForLogging());
            putChallengeParam(jSONObject);
        } catch (JSONException e) {
            StringBuilder h = C0072d.m201h("Error creating client state json: ");
            h.append(e.getMessage());
            Log.w("LoginMethodHandler", h.toString());
        }
        String jSONObject2 = jSONObject.toString();
        C19383o.m32796f(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final LoginClient getLoginClient() {
        LoginClient loginClient2 = this.loginClient;
        if (loginClient2 != null) {
            return loginClient2;
        }
        C19383o.m32805o("loginClient");
        throw null;
    }

    public final Map<String, String> getMethodLoggingExtras() {
        return this.methodLoggingExtras;
    }

    public abstract String getNameForLogging();

    public void logWebLoginCompleted(String str) {
        LoginClient loginClient2 = this.loginClient;
        if (loginClient2 != null) {
            LoginClient.Request pendingRequest = loginClient2.getPendingRequest();
            C19383o.m32796f(pendingRequest, "loginClient.getPendingRequest()");
            String applicationId = pendingRequest.getApplicationId();
            LoginClient loginClient3 = this.loginClient;
            if (loginClient3 != null) {
                C13511h hVar = new C13511h((Context) loginClient3.getActivity(), applicationId);
                Bundle bundle = new Bundle();
                bundle.putString("fb_web_login_e2e", str);
                bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
                bundle.putString("app_id", applicationId);
                String str2 = C13418j.f29381a;
                if (C13442y.m21140c()) {
                    hVar.mo46170f("fb_dialogs_web_login_dialog_complete", bundle);
                    return;
                }
                return;
            }
            C19383o.m32805o("loginClient");
            throw null;
        }
        C19383o.m32805o("loginClient");
        throw null;
    }

    public boolean needsInternetPermission() {
        return false;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void putChallengeParam(JSONObject jSONObject) throws JSONException {
        C19383o.m32797g(jSONObject, "param");
    }

    public final void setLoginClient(LoginClient loginClient2) {
        C19383o.m32797g(loginClient2, "<set-?>");
        this.loginClient = loginClient2;
    }

    public final void setMethodLoggingExtras(Map<String, String> map) {
        this.methodLoggingExtras = map;
    }

    public boolean shouldKeepTrackOfMultipleIntents() {
        return false;
    }

    public abstract int tryAuthorize(LoginClient.Request request);

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
        C12869i0.m20561Q(parcel, this.methodLoggingExtras);
    }

    public LoginMethodHandler(Parcel parcel) {
        C19383o.m32797g(parcel, "source");
        HashMap N = C12869i0.m20558N(parcel);
        this.methodLoggingExtras = N != null ? C19294b0.m32558A0(N) : null;
    }
}
