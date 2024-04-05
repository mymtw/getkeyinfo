package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.e6 */
public final class C14963e6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f33452b;

    /* renamed from: c */
    public final /* synthetic */ String f33453c;

    /* renamed from: d */
    public final /* synthetic */ String f33454d;

    /* renamed from: e */
    public final /* synthetic */ zzp f33455e;

    /* renamed from: f */
    public final /* synthetic */ C14999i6 f33456f;

    public C14963e6(C14999i6 i6Var, AtomicReference atomicReference, String str, String str2, zzp zzp) {
        this.f33456f = i6Var;
        this.f33452b = atomicReference;
        this.f33453c = str;
        this.f33454d = str2;
        this.f33455e = zzp;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f33452b) {
            try {
                C14999i6 i6Var = this.f33456f;
                zzeb zzeb = i6Var.f33574e;
                if (zzeb == null) {
                    ((C15103u3) i6Var.f33681b).mo52016b().f33724g.mo52240d((Object) null, this.f33453c, this.f33454d, "(legacy) Failed to get conditional properties; not connected to service");
                    this.f33452b.set(Collections.emptyList());
                    this.f33452b.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    Preconditions.checkNotNull(this.f33455e);
                    this.f33452b.set(zzeb.zzf(this.f33453c, this.f33454d, this.f33455e));
                } else {
                    this.f33452b.set(zzeb.zzg((String) null, this.f33453c, this.f33454d));
                }
                this.f33456f.mo52132r();
                atomicReference = this.f33452b;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    ((C15103u3) this.f33456f.f33681b).mo52016b().f33724g.mo52240d((Object) null, this.f33453c, e, "(legacy) Failed to get conditional properties; remote exception");
                    this.f33452b.set(Collections.emptyList());
                    atomicReference = this.f33452b;
                } catch (Throwable th) {
                    this.f33452b.notify();
                    throw th;
                }
            }
        }
    }
}
