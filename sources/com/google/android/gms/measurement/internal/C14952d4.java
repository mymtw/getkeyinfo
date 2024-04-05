package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import p689ul.C18603a;
import p689ul.C18606d;
import p689ul.C18609g;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
public final class C14952d4 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33349b;

    /* renamed from: c */
    public final /* synthetic */ Object f33350c;

    /* renamed from: d */
    public final /* synthetic */ Object f33351d;

    public /* synthetic */ C14952d4(int i, Object obj, Object obj2) {
        this.f33349b = i;
        this.f33351d = obj;
        this.f33350c = obj2;
    }

    public final void run() {
        switch (this.f33349b) {
            case 0:
                ((zzgn) this.f33351d).zza.mo52019e();
                C14973f7 zzc = ((zzgn) this.f33351d).zza;
                zzp zzp = (zzp) this.f33350c;
                zzc.mo52015a().mo51995g();
                zzc.mo52021g();
                Preconditions.checkNotEmpty(zzp.zza);
                zzc.mo52007J(zzp);
                return;
            case 1:
                Object obj = this.f33351d;
                C14999i6 i6Var = (C14999i6) obj;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Failed to send current screen to service");
                    return;
                }
                try {
                    C15061p5 p5Var = (C15061p5) this.f33350c;
                    if (p5Var == null) {
                        zzeb.zzq(0, (String) null, (String) null, ((C15103u3) ((C14999i6) obj).f33681b).f33872b.getPackageName());
                    } else {
                        zzeb.zzq(p5Var.f33751c, p5Var.f33749a, p5Var.f33750b, ((C15103u3) ((C14999i6) obj).f33681b).f33872b.getPackageName());
                    }
                    ((C14999i6) this.f33351d).mo52132r();
                    return;
                } catch (RemoteException e) {
                    ((C15103u3) ((C14999i6) this.f33351d).f33681b).mo52016b().f33724g.mo52238b(e, "Failed to send current screen to the service");
                    return;
                }
            default:
                synchronized (((C18609g) this.f33351d).f41093b) {
                    C18603a aVar = ((C18609g) this.f33351d).f41094c;
                    if (aVar != null) {
                        aVar.mo5885b((C18606d) this.f33350c);
                    }
                }
                return;
        }
    }
}
