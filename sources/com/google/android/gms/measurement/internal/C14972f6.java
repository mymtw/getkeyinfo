package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
public final class C14972f6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f33477b;

    /* renamed from: c */
    public final /* synthetic */ String f33478c;

    /* renamed from: d */
    public final /* synthetic */ zzp f33479d;

    /* renamed from: e */
    public final /* synthetic */ zzcf f33480e;

    /* renamed from: f */
    public final /* synthetic */ C14999i6 f33481f;

    public C14972f6(C14999i6 i6Var, String str, String str2, zzp zzp, zzcf zzcf) {
        this.f33481f = i6Var;
        this.f33477b = str;
        this.f33478c = str2;
        this.f33479d = zzp;
        this.f33480e = zzcf;
    }

    public final void run() {
        C15103u3 u3Var;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            C14999i6 i6Var = this.f33481f;
            zzeb zzeb = i6Var.f33574e;
            if (zzeb == null) {
                ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52239c(this.f33477b, "Failed to get conditional properties; not connected to service", this.f33478c);
                u3Var = (C15103u3) this.f33481f.f33681b;
            } else {
                Preconditions.checkNotNull(this.f33479d);
                arrayList = C15018k7.m24480p(zzeb.zzf(this.f33477b, this.f33478c, this.f33479d));
                this.f33481f.mo52132r();
                u3Var = (C15103u3) this.f33481f.f33681b;
            }
        } catch (RemoteException e) {
            ((C15103u3) this.f33481f.f33681b).mo52016b().f33724g.mo52240d(this.f33477b, this.f33478c, e, "Failed to get conditional properties; remote exception");
            u3Var = (C15103u3) this.f33481f.f33681b;
        } catch (Throwable th) {
            ((C15103u3) this.f33481f.f33681b).mo52335w().mo52225y(this.f33480e, arrayList);
            throw th;
        }
        u3Var.mo52335w().mo52225y(this.f33480e, arrayList);
    }
}
