package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.measurement.zzcf;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
public final class C14998i5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzcf f33569b;

    /* renamed from: c */
    public final /* synthetic */ zzat f33570c;

    /* renamed from: d */
    public final /* synthetic */ String f33571d;

    /* renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f33572e;

    public C14998i5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, zzat zzat, String str) {
        this.f33572e = appMeasurementDynamiteService;
        this.f33569b = zzcf;
        this.f33570c = zzat;
        this.f33571d = str;
    }

    public final void run() {
        C14999i6 u = this.f33572e.zza.mo52333u();
        zzcf zzcf = this.f33569b;
        zzat zzat = this.f33570c;
        String str = this.f33571d;
        u.mo51995g();
        u.mo51946h();
        C15018k7 w = ((C15103u3) u.f33681b).mo52335w();
        w.getClass();
        if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(((C15103u3) w.f33681b).f33872b, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            ((C15103u3) u.f33681b).mo52016b().f33727j.mo52237a("Not bundling data. Service unavailable or out of date");
            ((C15103u3) u.f33681b).mo52335w().mo52187A(zzcf, new byte[0]);
            return;
        }
        u.mo52133s(new C14936b6(u, zzat, str, zzcf));
    }
}
