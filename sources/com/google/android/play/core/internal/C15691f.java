package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: com.google.android.play.core.internal.f */
public final class C15691f extends C15681a {

    /* renamed from: c */
    public final /* synthetic */ IBinder f35455c;

    /* renamed from: d */
    public final /* synthetic */ C15695h f35456d;

    public C15691f(C15695h hVar, IBinder iBinder) {
        this.f35456d = hVar;
        this.f35455c = iBinder;
    }

    /* renamed from: a */
    public final void mo55347a() {
        C15697i iVar = this.f35456d.f35458b;
        iVar.f35474n = (IInterface) iVar.f35469i.mo15d(this.f35455c);
        C15697i iVar2 = this.f35456d.f35458b;
        iVar2.f35462b.mo52245e("linkToDeath", new Object[0]);
        try {
            iVar2.f35474n.asBinder().linkToDeath(iVar2.f35471k, 0);
        } catch (RemoteException e) {
            iVar2.f35462b.mo52244d(e, "linkToDeath failed", new Object[0]);
        }
        C15697i iVar3 = this.f35456d.f35458b;
        iVar3.f35467g = false;
        Iterator it = iVar3.f35464d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f35456d.f35458b.f35464d.clear();
    }
}
