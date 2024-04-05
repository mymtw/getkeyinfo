package p632nn;

import p316be.C8549a;
import p605kk.C18116a;
import p605kk.C18123g;
import p605kk.C18126j;
import p641on.C18323b;
import p641on.C18324c;
import p641on.C18325d;
import p641on.C18327e;

/* renamed from: nn.a */
public final /* synthetic */ class C18275a implements C18116a {

    /* renamed from: b */
    public final /* synthetic */ C18276b f40109b;

    /* renamed from: c */
    public final /* synthetic */ C18123g f40110c;

    /* renamed from: d */
    public final /* synthetic */ C18123g f40111d;

    public /* synthetic */ C18275a(C18276b bVar, C18123g gVar, C18123g gVar2) {
        this.f40109b = bVar;
        this.f40110c = gVar;
        this.f40111d = gVar2;
    }

    public final Object then(C18123g gVar) {
        C18276b bVar = this.f40109b;
        C18123g gVar2 = this.f40110c;
        C18123g gVar3 = this.f40111d;
        bVar.getClass();
        if (!gVar2.mo69668o() || gVar2.mo69664k() == null) {
            return C18126j.m30617e(Boolean.FALSE);
        }
        C18327e eVar = (C18327e) gVar2.mo69664k();
        if (gVar3.mo69668o()) {
            C18327e eVar2 = (C18327e) gVar3.mo69664k();
            if (!(eVar2 == null || !eVar.f40234c.equals(eVar2.f40234c))) {
                return C18126j.m30617e(Boolean.FALSE);
            }
        }
        C18325d dVar = bVar.f40115d;
        return C18126j.m30615c(dVar.f40227a, new C18323b(dVar, eVar)).mo69669p(dVar.f40227a, new C18324c(dVar, eVar)).mo69660g(bVar.f40113b, new C8549a(bVar));
    }
}
