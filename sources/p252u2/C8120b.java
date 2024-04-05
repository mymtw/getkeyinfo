package p252u2;

import androidx.lifecycle.C2895z;
import androidx.work.C3429n;
import androidx.work.impl.utils.futures.C3419a;

/* renamed from: u2.b */
public final class C8120b implements C3429n {

    /* renamed from: c */
    public final C2895z<C3429n.C3430a> f17727c = new C2895z<>();

    /* renamed from: d */
    public final C3419a<C3429n.C3430a.C3433c> f17728d = new C3419a<>();

    public C8120b() {
        mo20713a(C3429n.f8036b);
    }

    /* renamed from: a */
    public final void mo20713a(C3429n.C3430a aVar) {
        this.f17727c.postValue(aVar);
        if (aVar instanceof C3429n.C3430a.C3433c) {
            this.f17728d.mo12917i((C3429n.C3430a.C3433c) aVar);
        } else if (aVar instanceof C3429n.C3430a.C3431a) {
            this.f17728d.mo12918j(((C3429n.C3430a.C3431a) aVar).f8037a);
        }
    }
}
