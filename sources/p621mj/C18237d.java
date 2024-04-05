package p621mj;

import java.util.Iterator;
import p621mj.C18233a;

/* renamed from: mj.d */
public final class C18237d implements C18236c {

    /* renamed from: a */
    public final /* synthetic */ C18233a f39979a;

    public C18237d(C18233a aVar) {
        this.f39979a = aVar;
    }

    /* renamed from: a */
    public final void mo69788a(C18235b bVar) {
        C18233a aVar = this.f39979a;
        aVar.f39975b = bVar;
        Iterator<C18233a.C18234a> it = aVar.f39977d.iterator();
        while (it.hasNext()) {
            T t = this.f39979a.f39975b;
            it.next().zaa();
        }
        this.f39979a.f39977d.clear();
        this.f39979a.f39976c = null;
    }
}
