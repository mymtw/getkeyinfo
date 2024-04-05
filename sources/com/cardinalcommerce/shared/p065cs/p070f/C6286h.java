package com.cardinalcommerce.shared.p065cs.p070f;

import android.os.AsyncTask;
import androidx.preference.C3039b;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.h */
public class C6286h implements Serializable {

    /* renamed from: a */
    public static long f13861a = 1;

    /* renamed from: b */
    public char[] f13862b;

    /* renamed from: c */
    public char[] f13863c;

    /* renamed from: d */
    public char[] f13864d;

    /* renamed from: e */
    public char[] f13865e;

    /* renamed from: f */
    public int f13866f;

    /* renamed from: g */
    public boolean f13867g;

    /* renamed from: h */
    public boolean f13868h;

    /* renamed from: i */
    public boolean f13869i;

    /* renamed from: j */
    public boolean f13870j;

    /* renamed from: k */
    public boolean f13871k;

    /* renamed from: l */
    public boolean f13872l;

    /* renamed from: m */
    public boolean f13873m;

    /* renamed from: n */
    private final C8172b f13874n = C8172b.m16432f();

    /* renamed from: com.cardinalcommerce.shared.cs.f.h$a */
    public class C6287a implements Runnable {
        public C6287a() {
        }

        public final void run() {
            C3039b.m7156Z(C6286h.this.f13862b);
            C3039b.m7156Z(C6286h.this.f13863c);
            C3039b.m7156Z(C6286h.this.f13864d);
            C3039b.m7156Z(C6286h.this.f13865e);
            C6286h hVar = C6286h.this;
            hVar.f13866f = 0;
            hVar.f13867g = false;
            hVar.f13868h = false;
            hVar.f13869i = false;
            hVar.f13870j = false;
            hVar.f13871k = false;
            hVar.f13872l = false;
            hVar.f13873m = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"HardwareIds"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6286h(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            u8.b r0 = p257u8.C8172b.m16432f()
            r5.f13874n = r0
            r0 = 0
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x0035 }
        L_0x000e:
            boolean r2 = r1.hasMoreElements()     // Catch:{ Exception -> 0x0035 }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r1.nextElement()     // Catch:{ Exception -> 0x0035 }
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch:{ Exception -> 0x0035 }
            java.util.Enumeration r2 = r2.getInetAddresses()     // Catch:{ Exception -> 0x0035 }
        L_0x001e:
            boolean r3 = r2.hasMoreElements()     // Catch:{ Exception -> 0x0035 }
            if (r3 == 0) goto L_0x000e
            java.lang.Object r3 = r2.nextElement()     // Catch:{ Exception -> 0x0035 }
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch:{ Exception -> 0x0035 }
            boolean r4 = r3.isLoopbackAddress()     // Catch:{ Exception -> 0x0035 }
            if (r4 != 0) goto L_0x001e
            java.lang.String r1 = r3.getHostAddress()     // Catch:{ Exception -> 0x0035 }
            goto L_0x0042
        L_0x0035:
            r1 = move-exception
            u8.b r2 = r5.f13874n
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "IP Address"
            r2.mo19177d(r3, r1, r0)
        L_0x0041:
            r1 = r0
        L_0x0042:
            char[] r1 = androidx.preference.C3039b.m7190y(r1)
            r5.f13862b = r1
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            int r1 = p260v0.C8184a.m16458a(r6, r1)
            if (r1 != 0) goto L_0x00b2
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.String r1 = "wifi"
            java.lang.Object r6 = r6.getSystemService(r1)
            android.net.wifi.WifiManager r6 = (android.net.wifi.WifiManager) r6
            if (r6 == 0) goto L_0x0062
            android.net.wifi.WifiInfo r0 = r6.getConnectionInfo()
        L_0x0062:
            if (r0 == 0) goto L_0x00b2
            java.lang.String r1 = r0.getMacAddress()
            char[] r1 = androidx.preference.C3039b.m7190y(r1)
            r5.f13864d = r1
            java.lang.String r1 = r0.getBSSID()
            char[] r1 = androidx.preference.C3039b.m7190y(r1)
            r5.f13863c = r1
            java.lang.String r1 = r0.getSSID()
            char[] r1 = androidx.preference.C3039b.m7190y(r1)
            r5.f13865e = r1
            int r0 = r0.getNetworkId()
            r5.f13866f = r0
            boolean r0 = r6.is5GHzBandSupported()
            r5.f13867g = r0
            boolean r0 = r6.isDeviceToApRttSupported()
            r5.f13868h = r0
            boolean r0 = r6.isEnhancedPowerReportingSupported()
            r5.f13869i = r0
            boolean r0 = r6.isP2pSupported()
            r5.f13870j = r0
            boolean r0 = r6.isPreferredNetworkOffloadSupported()
            r5.f13871k = r0
            boolean r0 = r6.isTdlsSupported()
            r5.f13872l = r0
            boolean r6 = r6.isScanAlwaysAvailable()
            r5.f13873m = r6
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.shared.p065cs.p070f.C6286h.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public JSONObject mo17834a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("Is5GHzBandSupport", Boolean.valueOf(this.f13867g));
            jSONObject.putOpt("IsDeviceToApRttSupported", Boolean.valueOf(this.f13868h));
            jSONObject.putOpt("IsEnhancedPowerReportingSupported", Boolean.valueOf(this.f13869i));
            jSONObject.putOpt("IsP2pSupported", Boolean.valueOf(this.f13870j));
            jSONObject.putOpt("IsPreferredNetworkOffloadSupported", Boolean.valueOf(this.f13871k));
            jSONObject.putOpt("IsScanAlwaysAvailable", Boolean.valueOf(this.f13873m));
            jSONObject.putOpt("IsTdlsSupported", Boolean.valueOf(this.f13872l));
            jSONObject.putOpt("BSSID", C3039b.m7142L(this.f13863c));
            jSONObject.putOpt("NetworkID", Integer.valueOf(this.f13866f));
            jSONObject.putOpt("SSID", C3039b.m7142L(this.f13865e));
            jSONObject.putOpt("WifiMacAddress", C3039b.m7142L(this.f13864d));
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo17835b() {
        AsyncTask.execute(new C6287a());
    }
}
