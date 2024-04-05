package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import p689ul.C18604b;
import p689ul.C18606d;
import p689ul.C18610h;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
public final class C15026l6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33663b = 0;

    /* renamed from: c */
    public final /* synthetic */ Object f33664c;

    /* renamed from: d */
    public final /* synthetic */ Object f33665d;

    public C15026l6(C14973f7 f7Var, Runnable runnable) {
        this.f33664c = f7Var;
        this.f33665d = runnable;
    }

    public final void run() {
        switch (this.f33663b) {
            case 0:
                ((C14973f7) this.f33664c).mo52019e();
                C14973f7 f7Var = (C14973f7) this.f33664c;
                Runnable runnable = (Runnable) this.f33665d;
                f7Var.mo52015a().mo51995g();
                if (f7Var.f33501q == null) {
                    f7Var.f33501q = new ArrayList();
                }
                f7Var.f33501q.add(runnable);
                ((C14973f7) this.f33664c).mo52034t();
                return;
            default:
                synchronized (((C18610h) this.f33665d).f41096b) {
                    C18604b bVar = ((C18610h) this.f33665d).f41097c;
                    if (bVar != null) {
                        bVar.mo46667a(((C18606d) this.f33664c).mo70118e());
                    }
                }
                return;
        }
    }

    public C15026l6(C18610h hVar, C18606d dVar) {
        this.f33665d = hVar;
        this.f33664c = dVar;
    }
}
