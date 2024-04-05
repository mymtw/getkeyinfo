package p475we;

import kotlin.jvm.internal.C19383o;
import p248tp.C8072t;
import p689ul.C18604b;

/* renamed from: we.f */
public final /* synthetic */ class C13830f implements C18604b {

    /* renamed from: b */
    public final /* synthetic */ C13831g f30444b;

    /* renamed from: c */
    public final /* synthetic */ C8072t f30445c;

    public /* synthetic */ C13830f(C13831g gVar, C8072t tVar) {
        this.f30444b = gVar;
        this.f30445c = tVar;
    }

    /* renamed from: a */
    public final void mo46667a(Exception exc) {
        C13831g gVar = this.f30444b;
        C8072t tVar = this.f30445c;
        C19383o.m32797g(gVar, "this$0");
        C19383o.m32797g(tVar, "$emitter");
        C13827c cVar = gVar.f30449d;
        C19383o.m32796f(exc, "exception");
        cVar.mo46666a(exc);
        tVar.tryOnError(exc);
    }
}
