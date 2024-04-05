package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p772tq.C20203a;

/* renamed from: com.google.android.gms.measurement.internal.j */
public final class C15001j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33585b;

    /* renamed from: c */
    public final /* synthetic */ Object f33586c;

    /* renamed from: d */
    public final /* synthetic */ Object f33587d;

    public /* synthetic */ C15001j(int i, Object obj, Object obj2) {
        this.f33585b = i;
        this.f33587d = obj;
        this.f33586c = obj2;
    }

    public final void run() {
        switch (this.f33585b) {
            case 0:
                ((C15051o4) this.f33586c).mo52018d();
                if (C20203a.m34524G()) {
                    ((C15051o4) this.f33586c).mo52015a().mo52308o(this);
                    return;
                }
                boolean z = ((C15010k) this.f33587d).f33623c != 0;
                ((C15010k) this.f33587d).f33623c = 0;
                if (z) {
                    ((C15010k) this.f33587d).mo51941b();
                    return;
                }
                return;
            case 1:
                ((zzgn) this.f33587d).zza.mo52019e();
                ((zzgn) this.f33587d).zza.mo52030p((zzp) this.f33586c);
                return;
            default:
                C14999i6 i6Var = (C14999i6) this.f33587d;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    Preconditions.checkNotNull((zzp) this.f33586c);
                    zzeb.zzj((zzp) this.f33586c);
                    ((C15103u3) ((C14999i6) this.f33587d).f33681b).mo52328o().mo52120m();
                    ((C14999i6) this.f33587d).mo52125k(zzeb, (AbstractSafeParcelable) null, (zzp) this.f33586c);
                    ((C14999i6) this.f33587d).mo52132r();
                    return;
                } catch (RemoteException e) {
                    ((C15103u3) ((C14999i6) this.f33587d).f33681b).mo52016b().f33724g.mo52238b(e, "Failed to send app launch to the service");
                    return;
                }
        }
    }
}
