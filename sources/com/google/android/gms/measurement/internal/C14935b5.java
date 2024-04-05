package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
public final class C14935b5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33285b = 1;

    /* renamed from: c */
    public final /* synthetic */ boolean f33286c;

    /* renamed from: d */
    public final /* synthetic */ String f33287d;

    /* renamed from: e */
    public final /* synthetic */ Object f33288e;

    /* renamed from: f */
    public final /* synthetic */ Object f33289f;

    /* renamed from: g */
    public final /* synthetic */ C14933b3 f33290g;

    public C14935b5(C15007j5 j5Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f33290g = j5Var;
        this.f33288e = atomicReference;
        this.f33287d = str;
        this.f33289f = str2;
        this.f33286c = z;
    }

    public final void run() {
        switch (this.f33285b) {
            case 0:
                C14999i6 u = ((C15103u3) ((C15007j5) this.f33290g).f33681b).mo52333u();
                boolean z = this.f33286c;
                u.mo51995g();
                u.mo51946h();
                u.mo52133s(new C15121w5(u, (AtomicReference) this.f33288e, this.f33287d, (String) this.f33289f, u.mo52130p(false), z));
                return;
            default:
                C14999i6 i6Var = (C14999i6) this.f33290g;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52237a("Discarding data. Failed to send event to service");
                    return;
                }
                Preconditions.checkNotNull((zzp) this.f33288e);
                ((C14999i6) this.f33290g).mo52125k(zzeb, this.f33286c ? null : (zzat) this.f33289f, (zzp) this.f33288e);
                ((C14999i6) this.f33290g).mo52132r();
                return;
        }
    }

    public C14935b5(C14999i6 i6Var, zzp zzp, boolean z, zzat zzat, String str) {
        this.f33290g = i6Var;
        this.f33288e = zzp;
        this.f33286c = z;
        this.f33289f = zzat;
        this.f33287d = str;
    }
}
