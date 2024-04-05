package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzcf;

/* renamed from: com.google.android.gms.measurement.internal.d3 */
public final class C14951d3 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33345b;

    /* renamed from: c */
    public final /* synthetic */ Object f33346c;

    /* renamed from: d */
    public final /* synthetic */ Object f33347d;

    /* renamed from: e */
    public final /* synthetic */ Object f33348e;

    public /* synthetic */ C14951d3(Object obj, int i, Object obj2, Object obj3) {
        this.f33345b = i;
        this.f33348e = obj;
        this.f33346c = obj2;
        this.f33347d = obj3;
    }

    public final void run() {
        C15103u3 u3Var;
        switch (this.f33345b) {
            case 0:
                zzfc zzfc = (zzfc) this.f33348e;
                C14960e3 e3Var = zzfc.zza;
                String zza = zzfc.zzb;
                zzbr zzbr = (zzbr) this.f33346c;
                e3Var.f33444a.mo52015a().mo51995g();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", zza);
                try {
                    if (zzbr.zzd(bundle) == null) {
                        e3Var.f33444a.mo52016b().f33724g.mo52237a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e) {
                    e3Var.f33444a.mo52016b().f33724g.mo52238b(e.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                e3Var.f33444a.mo52015a().mo51995g();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                String str = null;
                try {
                    if (!((C15103u3) ((C14999i6) this.f33348e).f33681b).mo52330q().mo51955m().mo51987f()) {
                        ((C15103u3) ((C14999i6) this.f33348e).f33681b).mo52016b().f33729l.mo52237a("Analytics storage consent denied; will not get app instance id");
                        ((C15103u3) ((C14999i6) this.f33348e).f33681b).mo52331s().f33602h.set((Object) null);
                        ((C15103u3) ((C14999i6) this.f33348e).f33681b).mo52330q().f33302g.mo51938b((String) null);
                        u3Var = (C15103u3) ((C14999i6) this.f33348e).f33681b;
                    } else {
                        Object obj = this.f33348e;
                        zzeb zzeb = ((C14999i6) obj).f33574e;
                        if (zzeb == null) {
                            ((C15103u3) ((C14999i6) obj).f33681b).mo52016b().f33724g.mo52237a("Failed to get app instance id");
                            u3Var = (C15103u3) ((C14999i6) this.f33348e).f33681b;
                        } else {
                            Preconditions.checkNotNull((zzp) this.f33346c);
                            str = zzeb.zzd((zzp) this.f33346c);
                            if (str != null) {
                                ((C15103u3) ((C14999i6) this.f33348e).f33681b).mo52331s().f33602h.set(str);
                                ((C15103u3) ((C14999i6) this.f33348e).f33681b).mo52330q().f33302g.mo51938b(str);
                            }
                            ((C14999i6) this.f33348e).mo52132r();
                            u3Var = (C15103u3) ((C14999i6) this.f33348e).f33681b;
                        }
                    }
                } catch (RemoteException e2) {
                    ((C15103u3) ((C14999i6) this.f33348e).f33681b).mo52016b().f33724g.mo52238b(e2, "Failed to get app instance id");
                    u3Var = (C15103u3) ((C14999i6) this.f33348e).f33681b;
                } catch (Throwable th) {
                    ((C15103u3) ((C14999i6) this.f33348e).f33681b).mo52335w().mo52190D((zzcf) this.f33347d, (String) null);
                    throw th;
                }
                u3Var.mo52335w().mo52190D((zzcf) this.f33347d, str);
                return;
        }
    }
}
