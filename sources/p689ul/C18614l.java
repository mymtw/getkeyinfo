package p689ul;

/* renamed from: ul.l */
public final class C18614l {

    /* renamed from: a */
    public final C18617o f41104a = new C18617o();

    /* renamed from: a */
    public final void mo70125a(Exception exc) {
        C18617o oVar = this.f41104a;
        synchronized (oVar.f41106a) {
            if (!oVar.f41108c) {
                oVar.f41108c = true;
                oVar.f41110e = exc;
                oVar.f41107b.mo70124b(oVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo70126b(Object obj) {
        C18617o oVar = this.f41104a;
        synchronized (oVar.f41106a) {
            if (!oVar.f41108c) {
                oVar.f41108c = true;
                oVar.f41109d = obj;
                oVar.f41107b.mo70124b(oVar);
            }
        }
    }
}
