package com.google.android.gms.measurement.internal;

import p605kk.C18118b;
import p605kk.C18133q;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
public final class C15088s5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33837b;

    /* renamed from: c */
    public final /* synthetic */ Object f33838c;

    public /* synthetic */ C15088s5(Object obj, int i) {
        this.f33837b = i;
        this.f33838c = obj;
    }

    public final void run() {
        switch (this.f33837b) {
            case 0:
                C15113v5 v5Var = (C15113v5) this.f33838c;
                v5Var.f33924f = v5Var.f33929k;
                return;
            default:
                synchronized (((C18133q) this.f33838c).f39588c) {
                    C18118b bVar = ((C18133q) this.f33838c).f39589d;
                    if (bVar != null) {
                        bVar.mo69676b();
                    }
                }
                return;
        }
    }
}
