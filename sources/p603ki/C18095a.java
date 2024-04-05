package p603ki;

import p649pm.C18412o;
import p722ym.C18895a;

/* renamed from: ki.a */
public final /* synthetic */ class C18095a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f39505b;

    /* renamed from: c */
    public final /* synthetic */ Object f39506c;

    public /* synthetic */ C18095a(C18412o oVar, C18895a aVar) {
        this.f39505b = oVar;
        this.f39506c = aVar;
    }

    public final void run() {
        C18412o oVar = (C18412o) this.f39505b;
        C18895a aVar = (C18895a) this.f39506c;
        synchronized (oVar) {
            if (oVar.f40497b == null) {
                oVar.f40496a.add(aVar);
            } else {
                oVar.f40497b.add(aVar.get());
            }
        }
    }
}
