package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.y3 */
public final class C14877y3 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C14889z3 f33171a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14877y3(C14889z3 z3Var) {
        super((Handler) null);
        this.f33171a = z3Var;
    }

    public final void onChange(boolean z) {
        C14889z3 z3Var = this.f33171a;
        synchronized (z3Var.f33189d) {
            z3Var.f33190e = null;
            C14742n4.f32964h.incrementAndGet();
        }
        synchronized (z3Var) {
            Iterator it = z3Var.f33191f.iterator();
            while (it.hasNext()) {
                ((C14573a4) it.next()).zza();
            }
        }
    }
}
