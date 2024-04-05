package p594jh;

import p513bj.C14060k;
import p594jh.C17884a1;

/* renamed from: jh.d0 */
public final /* synthetic */ class C17903d0 implements C14060k.C14061a {

    /* renamed from: a */
    public final /* synthetic */ int f38887a;

    /* renamed from: b */
    public final /* synthetic */ C17884a1.C17889e f38888b;

    /* renamed from: c */
    public final /* synthetic */ C17884a1.C17889e f38889c;

    public /* synthetic */ C17903d0(C17884a1.C17889e eVar, C17884a1.C17889e eVar2, int i) {
        this.f38887a = i;
        this.f38888b = eVar;
        this.f38889c = eVar2;
    }

    public final void invoke(Object obj) {
        int i = this.f38887a;
        C17884a1.C17889e eVar = this.f38888b;
        C17884a1.C17889e eVar2 = this.f38889c;
        C17884a1.C17886b bVar = (C17884a1.C17886b) obj;
        bVar.onPositionDiscontinuity(i);
        bVar.onPositionDiscontinuity(eVar, eVar2, i);
    }
}
