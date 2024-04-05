package com.etsy.android.lib.network;

import android.content.SharedPreferences;
import com.etsy.android.lib.network.oauth2.OAuth2AccessToken;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.network.w */
public final class C8813w implements C8809t {

    /* renamed from: a */
    public final C8808s f19365a;

    /* renamed from: b */
    public final SharedPreferences f19366b;

    public C8813w(C8808s sVar, SharedPreferences sharedPreferences) {
        C19383o.m32797g(sVar, "oAuth2Tokens");
        C19383o.m32797g(sharedPreferences, "encryptedSharedPreferences");
        this.f19365a = sVar;
        this.f19366b = sharedPreferences;
    }

    /* renamed from: a */
    public final OAuth2AccessToken mo30124a() {
        OAuth2AccessToken b = C8807r.m17190b(this.f19366b);
        if (b != null) {
            return b;
        }
        OAuth2AccessToken a = this.f19365a.mo30124a();
        if (a == null) {
            return null;
        }
        C8807r.m17191c(this.f19366b, a);
        this.f19365a.clear();
        return a;
    }

    /* renamed from: b */
    public final void mo30125b(OAuth2AccessToken oAuth2AccessToken) {
        C8807r.m17191c(this.f19366b, oAuth2AccessToken);
        this.f19365a.clear();
    }

    public final void clear() {
        C8807r.m17189a(this.f19366b);
        this.f19365a.clear();
    }
}
