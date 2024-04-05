package com.etsy.android.lib.network;

import android.content.SharedPreferences;
import com.etsy.android.lib.network.oauth2.OAuth2AccessToken;
import kotlin.jvm.internal.C19383o;
import p496za.C13943a;

/* renamed from: com.etsy.android.lib.network.s */
public final class C8808s implements C8809t {

    /* renamed from: a */
    public final SharedPreferences f19355a;

    public C8808s(C13943a aVar) {
        C19383o.m32797g(aVar, "preferencesProvider");
        this.f19355a = aVar.mo46761a();
    }

    /* renamed from: a */
    public final OAuth2AccessToken mo30124a() {
        return C8807r.m17190b(this.f19355a);
    }

    /* renamed from: b */
    public final void mo30125b(OAuth2AccessToken oAuth2AccessToken) {
        C8807r.m17191c(this.f19355a, oAuth2AccessToken);
    }

    public final void clear() {
        C8807r.m17189a(this.f19355a);
    }
}
