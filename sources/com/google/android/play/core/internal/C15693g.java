package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.g */
public final class C15693g extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ C15695h f35457c;

    public C15693g(C15695h hVar) {
        this.f35457c = hVar;
    }

    /* renamed from: a */
    public final void mo55347a() {
        C15697i iVar = this.f35457c.f35458b;
        iVar.f35462b.mo52245e("unlinkToDeath", new Object[0]);
        iVar.f35474n.asBinder().unlinkToDeath(iVar.f35471k, 0);
        C15697i iVar2 = this.f35457c.f35458b;
        iVar2.f35474n = null;
        iVar2.f35467g = false;
    }
}
