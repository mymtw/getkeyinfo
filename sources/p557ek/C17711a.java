package p557ek;

import android.os.Bundle;
import com.facebook.login.LoginStatusClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C14926a5;
import com.google.android.gms.measurement.internal.C14935b5;
import com.google.android.gms.measurement.internal.C15007j5;
import com.google.android.gms.measurement.internal.C15018k7;
import com.google.android.gms.measurement.internal.C15061p5;
import com.google.android.gms.measurement.internal.C15103u3;
import com.google.android.gms.measurement.internal.zzkv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p193o.C7494b;
import p772tq.C20203a;

/* renamed from: ek.a */
public final class C17711a extends C17713c {

    /* renamed from: a */
    public final C15103u3 f38515a;

    /* renamed from: b */
    public final C15007j5 f38516b;

    public C17711a(C15103u3 u3Var) {
        Preconditions.checkNotNull(u3Var);
        this.f38515a = u3Var;
        this.f38516b = u3Var.mo52331s();
    }

    /* renamed from: a */
    public final void mo52173a(String str) {
        this.f38515a.mo52324k().mo52084h(this.f38515a.f33885o.elapsedRealtime(), str);
    }

    /* renamed from: b */
    public final void mo52174b(String str, Bundle bundle, String str2) {
        this.f38515a.mo52331s().mo52148C(str, bundle, str2);
    }

    /* renamed from: c */
    public final void mo52175c(String str) {
        this.f38515a.mo52324k().mo52085i(this.f38515a.f33885o.elapsedRealtime(), str);
    }

    /* renamed from: d */
    public final void mo52176d(String str, Bundle bundle, String str2) {
        C15007j5 j5Var = this.f38516b;
        j5Var.mo52150l(str, str2, bundle, true, true, ((C15103u3) j5Var.f33681b).f33885o.currentTimeMillis());
    }

    /* renamed from: e */
    public final List<Bundle> mo52177e(String str, String str2) {
        C15007j5 j5Var = this.f38516b;
        if (((C15103u3) j5Var.f33681b).mo52015a().mo52310q()) {
            ((C15103u3) j5Var.f33681b).mo52016b().f33724g.mo52237a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        ((C15103u3) j5Var.f33681b).getClass();
        if (C20203a.m34524G()) {
            ((C15103u3) j5Var.f33681b).mo52016b().f33724g.mo52237a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        ((C15103u3) j5Var.f33681b).mo52015a().mo52305l(atomicReference, LoginStatusClient.DEFAULT_TOAST_DURATION_MS, "get conditional user properties", new C14926a5(j5Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C15018k7.m24480p(list);
        }
        ((C15103u3) j5Var.f33681b).mo52016b().f33724g.mo52238b((Object) null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    /* renamed from: f */
    public final Map<String, Object> mo52178f(String str, String str2, boolean z) {
        C15007j5 j5Var = this.f38516b;
        if (((C15103u3) j5Var.f33681b).mo52015a().mo52310q()) {
            ((C15103u3) j5Var.f33681b).mo52016b().f33724g.mo52237a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        ((C15103u3) j5Var.f33681b).getClass();
        if (C20203a.m34524G()) {
            ((C15103u3) j5Var.f33681b).mo52016b().f33724g.mo52237a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        ((C15103u3) j5Var.f33681b).mo52015a().mo52305l(atomicReference, LoginStatusClient.DEFAULT_TOAST_DURATION_MS, "get user properties", new C14935b5(j5Var, atomicReference, str, str2, z));
        List<zzkv> list = (List) atomicReference.get();
        if (list == null) {
            ((C15103u3) j5Var.f33681b).mo52016b().f33724g.mo52238b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        C7494b bVar = new C7494b(list.size());
        for (zzkv zzkv : list) {
            Object zza = zzkv.zza();
            if (zza != null) {
                bVar.put(zzkv.zzb, zza);
            }
        }
        return bVar;
    }

    /* renamed from: g */
    public final void mo52179g(Bundle bundle) {
        C15007j5 j5Var = this.f38516b;
        j5Var.mo52155q(bundle, ((C15103u3) j5Var.f33681b).f33885o.currentTimeMillis());
    }

    public final int zza(String str) {
        C15007j5 j5Var = this.f38516b;
        j5Var.getClass();
        Preconditions.checkNotEmpty(str);
        ((C15103u3) j5Var.f33681b).getClass();
        return 25;
    }

    public final long zzb() {
        return this.f38515a.mo52335w().mo52211i0();
    }

    public final String zzh() {
        return this.f38516b.mo52164z();
    }

    public final String zzi() {
        C15061p5 p5Var = ((C15103u3) this.f38516b.f33681b).mo52332t().f33922d;
        if (p5Var != null) {
            return p5Var.f33750b;
        }
        return null;
    }

    public final String zzj() {
        C15061p5 p5Var = ((C15103u3) this.f38516b.f33681b).mo52332t().f33922d;
        if (p5Var != null) {
            return p5Var.f33749a;
        }
        return null;
    }

    public final String zzk() {
        return this.f38516b.mo52164z();
    }
}
