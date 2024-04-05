package com.etsy.android.lib.network;

import android.content.SharedPreferences;
import com.etsy.android.lib.network.oauth2.OAuth2AccessToken;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.network.r */
public final class C8807r {
    /* renamed from: a */
    public static void m17189a(SharedPreferences sharedPreferences) {
        C19383o.m32797g(sharedPreferences, "$receiver");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C19383o.m32796f(edit, "editor");
        edit.remove("oauth2_access_token");
        edit.remove("oauth2_refresh_token");
        edit.remove("oauth2_expiration_time");
        edit.remove("oauth2_token_type");
        edit.apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.lib.network.oauth2.OAuth2AccessToken m17190b(android.content.SharedPreferences r10) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            java.lang.String r0 = "oauth2_access_token"
            r1 = 0
            java.lang.String r3 = r10.getString(r0, r1)
            if (r3 != 0) goto L_0x000f
            return r1
        L_0x000f:
            java.lang.String r0 = "oauth2_refresh_token"
            java.lang.String r4 = r10.getString(r0, r1)
            if (r4 != 0) goto L_0x0018
            return r1
        L_0x0018:
            java.lang.String r0 = "oauth2_expiration_time"
            boolean r2 = r10.contains(r0)
            if (r2 != 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            r5 = -9223372036854775808
            long r7 = r10.getLong(r0, r5)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r0 = r1
            goto L_0x0031
        L_0x002d:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
        L_0x0031:
            if (r0 == 0) goto L_0x0075
            long r5 = r0.longValue()
            java.lang.String r0 = "oauth2_token_type"
            java.lang.String r7 = r10.getString(r0, r1)
            if (r7 != 0) goto L_0x0040
            return r1
        L_0x0040:
            java.lang.String r0 = "user_id"
            java.lang.String r8 = r10.getString(r0, r1)
            if (r8 != 0) goto L_0x0049
            return r1
        L_0x0049:
            java.lang.String r0 = "oauth2_cookies"
            com.etsy.android.lib.network.OAuth2SharedPrefsExtensions$getOAuth2Tokens$cookies$1 r2 = com.etsy.android.lib.network.OAuth2SharedPrefsExtensions$getOAuth2Tokens$cookies$1.INSTANCE
            java.lang.String r9 = "defaultValue"
            kotlin.jvm.internal.C19383o.m32797g(r2, r9)
            java.util.Set r1 = r10.getStringSet(r0, r1)
            if (r1 != 0) goto L_0x006d
            java.lang.Object r1 = r2.invoke()
            java.util.Set r1 = (java.util.Set) r1
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r2 = "editor"
            kotlin.jvm.internal.C19383o.m32796f(r10, r2)
            r10.putStringSet(r0, r1)
            r10.apply()
        L_0x006d:
            r9 = r1
            com.etsy.android.lib.network.oauth2.OAuth2AccessToken r10 = new com.etsy.android.lib.network.oauth2.OAuth2AccessToken
            r2 = r10
            r2.<init>(r3, r4, r5, r7, r8, r9)
            return r10
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.network.C8807r.m17190b(android.content.SharedPreferences):com.etsy.android.lib.network.oauth2.OAuth2AccessToken");
    }

    /* renamed from: c */
    public static void m17191c(SharedPreferences sharedPreferences, OAuth2AccessToken oAuth2AccessToken) {
        C19383o.m32797g(sharedPreferences, "$receiver");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C19383o.m32796f(edit, "editor");
        Set<String> set = null;
        edit.putString("oauth2_access_token", oAuth2AccessToken != null ? oAuth2AccessToken.getAccessToken() : null);
        edit.putString("oauth2_token_type", oAuth2AccessToken != null ? oAuth2AccessToken.getTokenType() : null);
        edit.putString("oauth2_refresh_token", oAuth2AccessToken != null ? oAuth2AccessToken.getRefreshToken() : null);
        if (oAuth2AccessToken != null) {
            edit.putLong("oauth2_expiration_time", oAuth2AccessToken.getExpirationTime());
        }
        edit.putString("user_id", oAuth2AccessToken != null ? oAuth2AccessToken.getUserId() : null);
        if (oAuth2AccessToken != null) {
            set = oAuth2AccessToken.getCookies();
        }
        edit.putStringSet("oauth2_cookies", set);
        edit.apply();
    }
}
