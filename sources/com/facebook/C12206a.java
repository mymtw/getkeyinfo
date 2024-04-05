package com.facebook;

import android.os.Bundle;
import com.facebook.AccessToken;
import java.util.Date;
import org.json.JSONObject;
import p365hg.C12869i0;

/* renamed from: com.facebook.a */
public final class C12206a implements C12869i0.C12870a {

    /* renamed from: a */
    public final /* synthetic */ Bundle f27249a;

    /* renamed from: b */
    public final /* synthetic */ String f27250b;

    public C12206a(Bundle bundle, AccessToken.C12172a aVar, String str) {
        this.f27249a = bundle;
        this.f27250b = str;
    }

    /* renamed from: a */
    public final void mo39272a(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            try {
                str = jSONObject.getString("id");
            } catch (Exception unused) {
                new FacebookException("Unable to generate access token due to missing user id");
                throw null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            this.f27249a.putString("user_id", str);
            AccessToken.C12174c cVar = AccessToken.Companion;
            Bundle bundle = this.f27249a;
            AccessTokenSource accessTokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
            Date date = new Date();
            String str2 = this.f27250b;
            cVar.getClass();
            AccessToken.C12174c.m19978a(bundle, accessTokenSource, date, str2);
            throw null;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: b */
    public final void mo39273b(FacebookException facebookException) {
        throw null;
    }
}
