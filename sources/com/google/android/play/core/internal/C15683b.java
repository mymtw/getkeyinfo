package com.google.android.play.core.internal;

import java.util.Iterator;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.internal.b */
public final class C15683b extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ C15681a f35441c;

    /* renamed from: d */
    public final /* synthetic */ C15697i f35442d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15683b(C15697i iVar, C18614l lVar, C15681a aVar) {
        super(lVar);
        this.f35442d = iVar;
        this.f35441c = aVar;
    }

    /* renamed from: a */
    public final void mo55347a() {
        C15697i iVar = this.f35442d;
        C15681a aVar = this.f35441c;
        if (iVar.f35474n == null && !iVar.f35467g) {
            iVar.f35462b.mo52245e("Initiate binding to the service.", new Object[0]);
            iVar.f35464d.add(aVar);
            C15695h hVar = new C15695h(iVar);
            iVar.f35473m = hVar;
            iVar.f35467g = true;
            if (!iVar.f35461a.bindService(iVar.f35468h, hVar, 1)) {
                iVar.f35462b.mo52245e("Failed to bind to the service.", new Object[0]);
                iVar.f35467g = false;
                Iterator it = iVar.f35464d.iterator();
                while (it.hasNext()) {
                    zzat zzat = new zzat();
                    C18614l lVar = ((C15681a) it.next()).f35439b;
                    if (lVar != null) {
                        lVar.mo70125a(zzat);
                    }
                }
                iVar.f35464d.clear();
            }
        } else if (iVar.f35467g) {
            iVar.f35462b.mo52245e("Waiting to bind to the service.", new Object[0]);
            iVar.f35464d.add(aVar);
        } else {
            aVar.run();
        }
    }
}
