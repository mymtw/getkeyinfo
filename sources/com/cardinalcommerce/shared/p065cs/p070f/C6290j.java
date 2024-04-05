package com.cardinalcommerce.shared.p065cs.p070f;

import android.location.Location;
import androidx.preference.C3039b;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.j */
public final class C6290j {

    /* renamed from: a */
    public char[] f13887a;

    /* renamed from: b */
    public char[] f13888b;

    public C6290j() {
    }

    public C6290j(Location location) {
        this.f13887a = C3039b.m7190y(String.valueOf(location.getLatitude()));
        this.f13888b = C3039b.m7190y(String.valueOf(location.getLongitude()));
    }

    /* renamed from: a */
    public final JSONObject mo17840a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("Latitude", C3039b.m7142L(this.f13887a));
            jSONObject.putOpt("Longitude", C3039b.m7142L(this.f13888b));
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }
}
