package com.cardinalcommerce.shared.p065cs.p070f;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import androidx.preference.C3039b;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p103f5.C6787b;
import p257u8.C8171a;
import p257u8.C8172b;
import p260v0.C8184a;

/* renamed from: com.cardinalcommerce.shared.cs.f.g */
public class C6285g implements Serializable {

    /* renamed from: a */
    private C6277a f13848a;

    /* renamed from: b */
    private char[] f13849b = C3039b.m7190y("2.2.4");

    /* renamed from: c */
    private char[] f13850c;

    /* renamed from: d */
    private C6288i f13851d = new C6288i();

    /* renamed from: e */
    private char[] f13852e = C3039b.m7190y(Locale.getDefault().getDisplayLanguage());

    /* renamed from: f */
    private C6296n f13853f;

    /* renamed from: g */
    private C6293l f13854g;

    /* renamed from: h */
    private C6281d f13855h;

    /* renamed from: i */
    private C6290j f13856i = new C6290j();

    /* renamed from: j */
    private C6283e f13857j;

    /* renamed from: k */
    private JSONObject f13858k;

    /* renamed from: l */
    private C6292k f13859l;

    /* renamed from: m */
    private final C8172b f13860m = C8172b.m16432f();

    /* renamed from: a */
    public C6283e mo17822a() {
        return this.f13857j;
    }

    /* renamed from: a */
    public void mo17823a(Context context, JSONObject jSONObject) {
        this.f13857j = new C6283e(context);
        boolean z = false;
        boolean z2 = C8184a.m16458a(context, "android.permission.READ_PHONE_STATE") == 0;
        boolean z3 = C8184a.m16458a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        boolean z4 = C8184a.m16458a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        C8184a.m16458a(context, "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS");
        C8184a.m16458a(context, "android.permission.GET_ACCOUNTS");
        C8184a.m16458a(context, "android.permission.READ_EXTERNAL_STORAGE");
        if (C8184a.m16458a(context, "android.permission.BLUETOOTH") == 0) {
            z = true;
        }
        if (z2) {
            try {
                this.f13854g = new C6293l(context);
            } catch (Exception e) {
                this.f13860m.mo19177d("NativeData Data", e.getMessage(), (String) null);
            }
        }
        if (z4 || z3) {
            try {
                LocationManager locationManager = (LocationManager) context.getSystemService("location");
                Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
                Location lastKnownLocation2 = locationManager.getLastKnownLocation("network");
                if (0 < (lastKnownLocation != null ? lastKnownLocation.getTime() : 0) - (lastKnownLocation2 != null ? lastKnownLocation2.getTime() : 0) && lastKnownLocation != null) {
                    mo17824a(new C6290j(lastKnownLocation));
                } else if (lastKnownLocation2 != null) {
                    mo17824a(new C6290j(lastKnownLocation2));
                }
            } catch (Exception e2) {
                this.f13860m.mo19177d("NativeData Data", e2.getMessage(), (String) null);
            }
        }
        if (z) {
            this.f13857j.f13846b = new C6278b(context);
        }
        this.f13853f = new C6296n(context);
        this.f13855h = new C6281d(context);
        this.f13848a = new C6277a(context);
        C6787b.m13170a().getClass();
        this.f13850c = C3039b.m7190y(C6787b.m13172j());
        this.f13858k = jSONObject;
    }

    /* renamed from: a */
    public void mo17824a(C6290j jVar) {
        this.f13856i = jVar;
    }

    /* renamed from: a */
    public void mo17825a(C6292k kVar) {
        this.f13859l = kVar;
    }

    /* renamed from: b */
    public C6277a mo17826b() {
        return this.f13848a;
    }

    /* renamed from: c */
    public C6296n mo17827c() {
        return this.f13853f;
    }

    /* renamed from: d */
    public C6293l mo17828d() {
        return this.f13854g;
    }

    /* renamed from: e */
    public C6281d mo17829e() {
        return this.f13855h;
    }

    /* renamed from: f */
    public C6288i mo17830f() {
        return this.f13851d;
    }

    /* renamed from: g */
    public C6290j mo17831g() {
        return this.f13856i;
    }

    /* renamed from: h */
    public JSONObject mo17832h() {
        JSONObject jSONObject = new JSONObject();
        try {
            C6283e eVar = this.f13857j;
            if (eVar != null) {
                jSONObject.putOpt("ConnectionData", eVar.mo17820a());
            }
            char[] cArr = this.f13852e;
            if (cArr != null) {
                jSONObject.putOpt("Language", C3039b.m7142L(cArr));
            }
            C6290j jVar = this.f13856i;
            if (jVar != null) {
                jSONObject.putOpt("LocationData", jVar.mo17840a());
            }
            C6281d dVar = this.f13855h;
            if (dVar != null) {
                jSONObject.putOpt("DeviceData", dVar.mo17817a());
            }
            C6288i iVar = this.f13851d;
            if (iVar != null) {
                jSONObject.putOpt("OS", iVar.mo17837a());
            }
            C6293l lVar = this.f13854g;
            if (lVar != null) {
                jSONObject.putOpt("TelephonyData", lVar.mo17842a());
            }
            JSONObject jSONObject2 = this.f13858k;
            if (jSONObject2 != null) {
                jSONObject.putOpt("ConfigurationData", jSONObject2);
            }
            C6296n nVar = this.f13853f;
            if (nVar != null) {
                jSONObject.putOpt("UserData", nVar.mo17847b());
            }
            C6277a aVar = this.f13848a;
            if (aVar != null) {
                jSONObject.putOpt("ApplicationData", aVar.mo17811e());
            }
            C6292k kVar = this.f13859l;
            if (kVar != null) {
                jSONObject.putOpt("SecurityWarnings", kVar.mo17841b());
            }
            char[] cArr2 = this.f13849b;
            if (cArr2 != null) {
                jSONObject.putOpt("SdkVersion", C3039b.m7142L(cArr2));
            }
            char[] cArr3 = this.f13850c;
            if (cArr3 != null) {
                jSONObject.putOpt("SDKAppId", C3039b.m7142L(cArr3));
            }
            JSONArray jSONArray = new JSONArray();
            for (String put : C8171a.f17929b) {
                jSONArray.put(put);
            }
            jSONObject.putOpt("SDK3DSSupport", jSONArray);
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }

    /* renamed from: i */
    public void mo17833i() {
        C6283e eVar = this.f13857j;
        if (eVar != null) {
            AsyncTask.execute(new C6280c(eVar));
            this.f13858k = null;
        }
        char[] cArr = this.f13852e;
        if (cArr != null) {
            C3039b.m7156Z(cArr);
            this.f13852e = null;
        }
        C6290j jVar = this.f13856i;
        if (jVar != null) {
            AsyncTask.execute(new C6284f(jVar));
            this.f13856i = null;
        }
        C6281d dVar = this.f13855h;
        if (dVar != null) {
            dVar.mo17818b();
            this.f13855h = null;
        }
        C6288i iVar = this.f13851d;
        if (iVar != null) {
            iVar.mo17838b();
            this.f13851d = null;
        }
        C6293l lVar = this.f13854g;
        if (lVar != null) {
            lVar.mo17843b();
            this.f13854g = null;
        }
        if (this.f13858k != null) {
            this.f13858k = null;
        }
        C6277a aVar = this.f13848a;
        if (aVar != null) {
            aVar.mo17812f();
            this.f13848a = null;
        }
        char[] cArr2 = this.f13849b;
        if (cArr2 != null) {
            C3039b.m7156Z(cArr2);
            this.f13849b = null;
        }
        char[] cArr3 = this.f13850c;
        if (cArr3 != null) {
            C3039b.m7156Z(cArr3);
            this.f13850c = null;
        }
    }
}
