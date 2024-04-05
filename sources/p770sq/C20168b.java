package p770sq;

import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.support.p013v4.media.C0072d;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.network.utils.AuthHeaderBuilderKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.InvalidInputException;
import lib.android.paypal.com.magnessdk.network.C19874j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0023f;
import p770sq.C20169c;
import p773uq.C20205a;
import p774vq.C20207b;
import p774vq.C20208c;
import p774vq.C20213h;
import p774vq.C20215j;

/* renamed from: sq.b */
public final class C20168b {

    /* renamed from: g */
    public static C20168b f44665g;

    /* renamed from: a */
    public C20215j f44666a;

    /* renamed from: b */
    public C20169c f44667b;

    /* renamed from: c */
    public C19874j f44668c;

    /* renamed from: d */
    public HandlerThread f44669d;

    /* renamed from: e */
    public C20173f f44670e;

    /* renamed from: f */
    public C20213h f44671f;

    /* renamed from: c */
    public static synchronized C20168b m34473c() {
        C20168b bVar;
        synchronized (C20168b.class) {
            if (f44665g == null) {
                f44665g = new C20168b();
            }
            bVar = f44665g;
        }
        return bVar;
    }

    /* renamed from: a */
    public final C20167a mo74413a(Context context, String str, HashMap<String, String> hashMap) throws InvalidInputException {
        boolean z;
        TelephonyManager telephonyManager;
        String str2;
        GsmCellLocation gsmCellLocation;
        CdmaCellLocation cdmaCellLocation;
        Class<C20177g> cls = C20177g.class;
        Class<C20168b> cls2 = C20168b.class;
        StringBuilder l = C0023f.m111l("COLLECT method called with paypalClientMetaDataId : ", str, " , Is pass in additionalData null? : ");
        boolean z2 = false;
        l.append(Boolean.toString(hashMap == null));
        C20205a.m34554a(l.toString(), 0, cls2);
        if (str == null || str.length() <= 32) {
            if (this.f44667b == null) {
                C20205a.m34554a("No MagnesSettings specified, using platform default.", 2, cls2);
                C20169c cVar = new C20169c(new C20169c.C20170a(context));
                this.f44667b = cVar;
                mo74415d(cVar);
            }
            if (this.f44666a.f44831e) {
                C20205a.m34554a("nc presents, collecting coreData.", 0, cls2);
                C20173f fVar = new C20173f();
                this.f44670e = fVar;
                fVar.mo74419h(this.f44667b, this.f44671f, this.f44666a);
                this.f44666a.f44831e = false;
            }
            C20177g gVar = new C20177g();
            C20169c cVar2 = this.f44667b;
            C20213h hVar = this.f44671f;
            C20215j jVar = this.f44666a;
            String str3 = this.f44670e.f44684c;
            C20205a.m34554a("collecting RiskBlobDynamicData", 0, cls);
            gVar.f44759n0 = jVar;
            Context context2 = cVar2.f44673b;
            gVar.f44734a0 = (TelephonyManager) context2.getSystemService(ResponseConstants.PHONE);
            gVar.f44735b0 = (WifiManager) context2.getApplicationContext().getSystemService("wifi");
            gVar.f44741e0 = (LocationManager) context2.getSystemService("location");
            gVar.f44737c0 = (ConnectivityManager) context2.getSystemService("connectivity");
            gVar.f44739d0 = (BatteryManager) context2.getSystemService("batterymanager");
            gVar.f44743f0 = (PowerManager) context2.getSystemService("power");
            gVar.f44745g0 = context2.getPackageManager();
            if (gVar.mo74416d(context2, "android.permission.ACCESS_COARSE_LOCATION") || gVar.mo74416d(context2, "android.permission.ACCESS_FINE_LOCATION")) {
                z2 = true;
            }
            gVar.f44723P = z2;
            gVar.f44725R = gVar.mo74416d(context2, "android.permission.READ_EXTERNAL_STORAGE");
            gVar.f44726S = gVar.mo74416d(context2, "android.permission.WRITE_EXTERNAL_STORAGE");
            gVar.f44724Q = gVar.mo74416d(context2, "android.permission.READ_PHONE_STATE");
            gVar.f44728U = gVar.mo74416d(context2, "android.permission.ACCESS_NETWORK_STATE");
            gVar.f44727T = gVar.mo74416d(context2, "android.permission.ACCESS_WIFI_STATE");
            gVar.f44729V = hashMap;
            gVar.f44718K = System.currentTimeMillis();
            gVar.f44709B = jVar.f44829c.optString("conf_version");
            gVar.f44752k = str;
            gVar.f44714G = str3;
            if (str == null) {
                gVar.f44752k = C20171d.m34477a(false);
            }
            TelephonyManager telephonyManager2 = gVar.f44734a0;
            String str4 = null;
            if (telephonyManager2 == null) {
                z = true;
            } else {
                int phoneType = telephonyManager2.getPhoneType();
                if (phoneType == 0) {
                    str2 = "none";
                } else if (phoneType == 1) {
                    gVar.f44768w = "gsm";
                    if (gVar.f44723P) {
                        CellLocation cellLocation = telephonyManager2.getCellLocation();
                        Class<GsmCellLocation> cls3 = GsmCellLocation.class;
                        gsmCellLocation = (cellLocation == null || !cls3.isAssignableFrom(cellLocation.getClass())) ? null : cls3.cast(cellLocation);
                    } else {
                        gsmCellLocation = null;
                    }
                    gVar.f44732Y = gsmCellLocation;
                    z = true;
                } else if (phoneType != 2) {
                    StringBuilder h = C0072d.m201h("unknown (");
                    h.append(telephonyManager2.getPhoneType());
                    h.append(")");
                    str2 = h.toString();
                } else {
                    gVar.f44768w = "cdma";
                    try {
                        if (gVar.f44723P) {
                            CellLocation cellLocation2 = telephonyManager2.getCellLocation();
                            Class<CdmaCellLocation> cls4 = CdmaCellLocation.class;
                            cdmaCellLocation = (cellLocation2 == null || !cls4.isAssignableFrom(cellLocation2.getClass())) ? null : cls4.cast(cellLocation2);
                        } else {
                            cdmaCellLocation = null;
                        }
                        gVar.f44733Z = cdmaCellLocation;
                    } catch (Exception e) {
                        C20205a.m34555b(e, cls);
                    }
                    z = true;
                }
                gVar.f44768w = str2;
                z = true;
            }
            WifiManager wifiManager = gVar.f44735b0;
            if (wifiManager != null) {
                gVar.f44731X = gVar.f44727T ? wifiManager.getConnectionInfo() : null;
            }
            ConnectivityManager connectivityManager = gVar.f44737c0;
            if (connectivityManager != null) {
                gVar.f44730W = gVar.f44728U ? connectivityManager.getActiveNetworkInfo() : null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                if (!gVar.mo74416d(context2, "android.permission.READ_PRIVILEGED_PHONE_STATE") && ((telephonyManager = gVar.f44734a0) == null || !telephonyManager.hasCarrierPrivileges())) {
                    z = false;
                }
                gVar.f44722O = z;
            }
            gVar.mo74422m(82, cVar2);
            gVar.mo74422m(81, cVar2);
            gVar.mo74422m(16, cVar2);
            gVar.mo74422m(21, cVar2);
            gVar.mo74422m(75, cVar2);
            gVar.mo74422m(23, cVar2);
            gVar.mo74422m(27, cVar2);
            gVar.mo74422m(28, cVar2);
            gVar.mo74422m(25, cVar2);
            gVar.mo74422m(56, cVar2);
            gVar.mo74422m(72, cVar2);
            gVar.mo74422m(42, cVar2);
            gVar.mo74422m(43, cVar2);
            gVar.mo74422m(45, cVar2);
            gVar.mo74422m(53, cVar2);
            gVar.mo74422m(80, cVar2);
            gVar.mo74422m(71, cVar2);
            gVar.mo74422m(4, cVar2);
            gVar.mo74422m(57, cVar2);
            gVar.mo74422m(58, cVar2);
            gVar.mo74422m(6, cVar2);
            gVar.mo74422m(30, cVar2);
            gVar.mo74422m(29, cVar2);
            gVar.mo74422m(13, cVar2);
            gVar.mo74422m(68, cVar2);
            gVar.mo74422m(49, cVar2);
            gVar.mo74422m(84, cVar2);
            gVar.mo74422m(5, cVar2);
            gVar.mo74422m(48, cVar2);
            gVar.mo74422m(11, cVar2);
            gVar.mo74422m(85, cVar2);
            gVar.mo74422m(46, cVar2);
            gVar.mo74422m(79, cVar2);
            gVar.mo74422m(87, cVar2);
            gVar.mo74422m(98, cVar2);
            C20172e.f44678a = false;
            if (C20172e.m34484e(hVar, C20172e.f44679b)) {
                gVar.mo74422m(89, cVar2);
                gVar.mo74422m(92, cVar2);
                gVar.mo74422m(93, cVar2);
                gVar.mo74422m(91, cVar2);
            }
            C20205a.m34554a("finishing RiskBlobDynamicData", 0, cls);
            JSONObject jSONObject = new JSONObject();
            try {
                int i = gVar.f44736c;
                jSONObject.put("base_station_id", i == -1 ? null : Integer.valueOf(i));
                jSONObject.put("bssid", gVar.f44748i);
                jSONObject.put("bssid_array", gVar.f44717J == null ? null : new JSONArray(gVar.f44717J));
                int i2 = gVar.f44738d;
                jSONObject.put("cell_id", i2 == -1 ? null : Integer.valueOf(i2));
                jSONObject.put("conn_type", gVar.f44762q);
                jSONObject.put("conf_version", gVar.f44709B);
                jSONObject.put(EventsNameKt.DEVICE_ID, gVar.f44763r);
                jSONObject.put("dc_id", gVar.f44761p);
                long j = gVar.f44719L;
                jSONObject.put("device_uptime", j == -1 ? null : Long.valueOf(j));
                jSONObject.put("ip_addrs", gVar.f44764s);
                jSONObject.put("ip_addresses", gVar.f44715H == null ? null : new JSONArray(gVar.f44715H));
                jSONObject.put("known_apps", gVar.f44716I == null ? null : new JSONArray(gVar.f44716I));
                jSONObject.put("locale_country", gVar.f44766u);
                jSONObject.put("locale_lang", gVar.f44767v);
                jSONObject.put("location", C20177g.m34504l(gVar.f44747h0));
                int i3 = gVar.f44746h;
                jSONObject.put("location_area_code", i3 == -1 ? null : Integer.valueOf(i3));
                jSONObject.put("phone_type", gVar.f44768w);
                jSONObject.put("risk_comp_session_id", gVar.f44769x);
                jSONObject.put("roaming", gVar.f44720M);
                jSONObject.put("sim_operator_name", gVar.f44712E);
                jSONObject.put("sim_serial_number", gVar.f44770y);
                jSONObject.put("ssid", gVar.f44771z);
                int i4 = gVar.f44744g;
                jSONObject.put("cdma_network_id", i4 == -1 ? null : Integer.valueOf(i4));
                int i5 = gVar.f44742f;
                jSONObject.put("cdma_system_id", i5 == -1 ? null : Integer.valueOf(i5));
                jSONObject.put("subscriber_id", gVar.f44708A);
                long j2 = gVar.f44718K;
                jSONObject.put(ResponseConstants.TIMESTAMP, j2 == -1 ? null : Long.valueOf(j2));
                jSONObject.put("tz_name", gVar.f44765t);
                jSONObject.put("ds", gVar.f44721N);
                int i6 = gVar.f44740e;
                jSONObject.put("tz", i6 == -1 ? null : Integer.valueOf(i6));
                jSONObject.put("network_operator", gVar.f44750j);
                jSONObject.put(AuthHeaderBuilderKt.PAIRING_ID, gVar.f44752k);
                jSONObject.put("serial_number", gVar.f44754l);
                jSONObject.put("VPN_setting", gVar.f44758n);
                jSONObject.put("proxy_setting", gVar.f44756m);
                jSONObject.put("c", gVar.f44760o);
                jSONObject.put("mg_id", gVar.f44710C);
                jSONObject.put("linker_id", gVar.f44711D);
                jSONObject.put("pl", gVar.f44713F);
                jSONObject.put("battery", gVar.f44749i0);
                jSONObject.put("memory", gVar.f44751j0);
                jSONObject.put("disk", gVar.f44753k0);
                jSONObject.put("screen", gVar.f44755l0);
                jSONObject.put("sr", gVar.f44757m0);
                jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, C20172e.f44678a);
                HashMap hashMap2 = gVar.f44729V;
                if (hashMap2 != null) {
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        try {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        } catch (Exception e2) {
                            C20205a.m34555b(e2, cls);
                        }
                    }
                }
            } catch (Exception e3) {
                C20205a.m34555b(e3, cls);
            }
            JSONObject f = this.f44670e.mo74417f();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    Object opt = f.opt(next);
                    if (opt == null || !(opt instanceof JSONObject)) {
                        opt = jSONObject.get(next);
                    } else {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        Iterator<String> keys2 = jSONObject2.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            ((JSONObject) opt).put(next2, jSONObject2.get(next2));
                        }
                    }
                    f.put(next, opt);
                } catch (JSONException e4) {
                    C20205a.m34555b(e4, C20173f.class);
                }
            }
            try {
                C20205a.m34554a("Device Info JSONObject : " + f.toString(2), 0, cls2);
                str4 = f.getString(AuthHeaderBuilderKt.PAIRING_ID);
            } catch (JSONException e5) {
                C20205a.m34555b(e5, cls2);
            }
            C20167a aVar = new C20167a();
            aVar.f44663a = f;
            aVar.f44664b = str4;
            return aVar;
        }
        throw new InvalidInputException("PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***");
    }

    /* renamed from: b */
    public final C20167a mo74414b(Context context, String str, HashMap<String, String> hashMap) throws InvalidInputException {
        StringBuilder l = C0023f.m111l("SUBMIT method called with paypalClientMetaDataId : ", str, " , Is pass in additionalData null? : ");
        boolean z = false;
        l.append(Boolean.toString(false));
        C20205a.m34554a(l.toString(), 0, C20168b.class);
        if (str == null || str.length() <= 32) {
            C20167a a = mo74413a(context, str, hashMap);
            JSONObject jSONObject = a.f44663a;
            C20208c cVar = new C20208c(jSONObject, this.f44667b, this.f44668c);
            cVar.f44806g.getClass();
            cVar.mo74459a();
            this.f44667b.getClass();
            C20169c cVar2 = this.f44667b;
            if (cVar2.f44674c == Environment.LIVE) {
                z = true;
            }
            if (z) {
                C20207b bVar = new C20207b(jSONObject, cVar2, this.f44668c);
                bVar.f44800g.getClass();
                bVar.mo74459a();
            }
            return a;
        }
        throw new InvalidInputException("PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***");
    }

    /* renamed from: d */
    public final void mo74415d(C20169c cVar) {
        this.f44667b = cVar;
        if (this.f44669d == null) {
            HandlerThread handlerThread = new HandlerThread("MagnesHandlerThread");
            this.f44669d = handlerThread;
            handlerThread.start();
            this.f44668c = C19874j.m33866a(this.f44669d.getLooper(), this);
        }
        this.f44666a = new C20215j(cVar, this.f44668c);
        this.f44671f = new C20213h(cVar, this.f44668c);
        if (this.f44670e == null) {
            C20173f fVar = new C20173f();
            this.f44670e = fVar;
            fVar.mo74419h(cVar, this.f44671f, this.f44666a);
        }
    }
}
