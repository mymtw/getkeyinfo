package com.cardinalcommerce.shared.p065cs.p070f;

import android.content.Context;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.n */
public class C6296n implements Serializable {

    /* renamed from: a */
    private final C6295m f13984a;

    public C6296n(Context context) {
        this.f13984a = new C6295m(context);
    }

    /* renamed from: a */
    public C6295m mo17846a() {
        return this.f13984a;
    }

    /* renamed from: b */
    public JSONObject mo17847b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("SettingsData", this.f13984a.mo17845a());
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }
}
