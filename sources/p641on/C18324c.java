package p641on;

import p605kk.C18122f;
import p605kk.C18123g;
import p605kk.C18126j;

/* renamed from: on.c */
public final /* synthetic */ class C18324c implements C18122f {

    /* renamed from: b */
    public final /* synthetic */ C18325d f40222b;

    /* renamed from: c */
    public final /* synthetic */ boolean f40223c = true;

    /* renamed from: d */
    public final /* synthetic */ C18327e f40224d;

    public /* synthetic */ C18324c(C18325d dVar, C18327e eVar) {
        this.f40222b = dVar;
        this.f40224d = eVar;
    }

    public final C18123g then(Object obj) {
        C18325d dVar = this.f40222b;
        boolean z = this.f40223c;
        C18327e eVar = this.f40224d;
        Void voidR = (Void) obj;
        if (z) {
            synchronized (dVar) {
                dVar.f40229c = C18126j.m30617e(eVar);
            }
        } else {
            dVar.getClass();
        }
        return C18126j.m30617e(eVar);
    }
}
