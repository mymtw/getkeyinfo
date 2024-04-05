package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.C15632n1;
import com.google.android.play.core.assetpacks.C15674y;
import java.util.concurrent.atomic.AtomicReference;
import p605kk.C18120d;
import p605kk.C18123g;
import p605kk.C18135s;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
public final class C14944c5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33323b;

    /* renamed from: c */
    public final /* synthetic */ Object f33324c;

    /* renamed from: d */
    public final /* synthetic */ Object f33325d;

    public /* synthetic */ C14944c5(int i, Object obj, Object obj2) {
        this.f33323b = i;
        this.f33325d = obj;
        this.f33324c = obj2;
    }

    public final void run() {
        switch (this.f33323b) {
            case 0:
                synchronized (((AtomicReference) this.f33324c)) {
                    try {
                        Object obj = this.f33325d;
                        ((AtomicReference) this.f33324c).set(Integer.valueOf(((C15103u3) ((C15007j5) obj).f33681b).f33878h.mo51968k(((C15103u3) ((C15007j5) obj).f33681b).mo52327n().mo52046l(), C14959e2.f33380N)));
                        ((AtomicReference) this.f33324c).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f33324c).notify();
                        throw th;
                    }
                }
                return;
            case 1:
                synchronized (((C18135s) this.f33325d).f39594c) {
                    C18120d dVar = ((C18135s) this.f33325d).f39595d;
                    if (dVar != null) {
                        dVar.mo414a((Exception) Preconditions.checkNotNull(((C18123g) this.f33324c).mo69663j()));
                    }
                }
                return;
            case 2:
                ((C15674y) this.f33324c).mo69856e((AssetPackState) this.f33325d);
                return;
            default:
                C15632n1 n1Var = (C15632n1) this.f33324c;
                n1Var.f35254b.mo55341a(n1Var.f35256d, (Intent) this.f33325d);
                return;
        }
    }

    public /* synthetic */ C14944c5(Object obj, Object obj2, int i) {
        this.f33323b = i;
        this.f33324c = obj;
        this.f33325d = obj2;
    }
}
