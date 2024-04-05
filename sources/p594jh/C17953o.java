package p594jh;

import p513bj.C14060k;
import p594jh.C17884a1;
import p594jh.C17939k1;

/* renamed from: jh.o */
public final /* synthetic */ class C17953o implements C14060k.C14061a {

    /* renamed from: a */
    public final /* synthetic */ C17984x0 f39135a;

    /* renamed from: b */
    public final /* synthetic */ int f39136b;

    public /* synthetic */ C17953o(C17984x0 x0Var, int i) {
        this.f39135a = x0Var;
        this.f39136b = i;
    }

    public final void invoke(Object obj) {
        Object obj2;
        C17984x0 x0Var = this.f39135a;
        int i = this.f39136b;
        C17884a1.C17886b bVar = (C17884a1.C17886b) obj;
        if (x0Var.f39304a.mo47701o() == 1) {
            obj2 = x0Var.f39304a.mo69480m(0, new C17939k1.C17942c()).f39110d;
        } else {
            obj2 = null;
        }
        bVar.onTimelineChanged(x0Var.f39304a, obj2, i);
        bVar.onTimelineChanged(x0Var.f39304a, i);
    }
}
