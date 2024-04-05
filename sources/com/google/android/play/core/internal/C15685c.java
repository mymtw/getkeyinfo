package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.c */
public final class C15685c extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ C15697i f35446c;

    public C15685c(C15697i iVar) {
        this.f35446c = iVar;
    }

    /* renamed from: a */
    public final void mo55347a() {
        C15697i iVar = this.f35446c;
        if (iVar.f35474n != null) {
            iVar.f35462b.mo52245e("Unbind from service.", new Object[0]);
            C15697i iVar2 = this.f35446c;
            iVar2.f35461a.unbindService(iVar2.f35473m);
            C15697i iVar3 = this.f35446c;
            iVar3.f35467g = false;
            iVar3.f35474n = null;
            iVar3.f35473m = null;
        }
        this.f35446c.mo55525d();
    }
}
