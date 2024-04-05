package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;

/* renamed from: com.google.android.gms.measurement.internal.b6 */
public final class C14936b6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33291b = 1;

    /* renamed from: c */
    public final /* synthetic */ zzcf f33292c;

    /* renamed from: d */
    public final /* synthetic */ String f33293d;

    /* renamed from: e */
    public final /* synthetic */ Object f33294e;

    /* renamed from: f */
    public final /* synthetic */ Object f33295f;

    public C14936b6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, String str, String str2) {
        this.f33295f = appMeasurementDynamiteService;
        this.f33292c = zzcf;
        this.f33293d = str;
        this.f33294e = str2;
    }

    public final void run() {
        C15103u3 u3Var;
        switch (this.f33291b) {
            case 0:
                byte[] bArr = null;
                try {
                    Object obj = this.f33295f;
                    zzeb zzeb = ((C14999i6) obj).f33574e;
                    if (zzeb == null) {
                        ((C15103u3) ((C14999i6) obj).f33681b).mo52016b().f33724g.mo52237a("Discarding data. Failed to send event to service to bundle");
                        u3Var = (C15103u3) ((C14999i6) this.f33295f).f33681b;
                    } else {
                        bArr = zzeb.zzu((zzat) this.f33294e, this.f33293d);
                        ((C14999i6) this.f33295f).mo52132r();
                        u3Var = (C15103u3) ((C14999i6) this.f33295f).f33681b;
                    }
                } catch (RemoteException e) {
                    ((C15103u3) ((C14999i6) this.f33295f).f33681b).mo52016b().f33724g.mo52238b(e, "Failed to send event to the service to bundle");
                    u3Var = (C15103u3) ((C14999i6) this.f33295f).f33681b;
                } catch (Throwable th) {
                    ((C15103u3) ((C14999i6) this.f33295f).f33681b).mo52335w().mo52187A(this.f33292c, bArr);
                    throw th;
                }
                u3Var.mo52335w().mo52187A(this.f33292c, bArr);
                return;
            default:
                C14999i6 u = ((AppMeasurementDynamiteService) this.f33295f).zza.mo52333u();
                zzcf zzcf = this.f33292c;
                u.mo51995g();
                u.mo51946h();
                u.mo52133s(new C14972f6(u, this.f33293d, (String) this.f33294e, u.mo52130p(false), zzcf));
                return;
        }
    }

    public C14936b6(C14999i6 i6Var, zzat zzat, String str, zzcf zzcf) {
        this.f33295f = i6Var;
        this.f33294e = zzat;
        this.f33293d = str;
        this.f33292c = zzcf;
    }
}
