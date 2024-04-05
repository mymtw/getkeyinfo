package com.cardinalcommerce.shared.p065cs.p070f;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.e */
public final class C6283e {

    /* renamed from: a */
    public C6286h f13845a;

    /* renamed from: b */
    public C6278b f13846b;

    public C6283e(Context context) {
        this.f13845a = new C6286h(context);
    }

    /* renamed from: a */
    public final JSONObject mo17820a() {
        JSONObject jSONObject = new JSONObject();
        try {
            C6278b bVar = this.f13846b;
            if (bVar != null) {
                jSONObject.putOpt("BluetoothData", bVar.mo17813a());
            }
            C6286h hVar = this.f13845a;
            if (hVar != null) {
                jSONObject.putOpt("NetworkData", hVar.mo17834a());
            }
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }
}
