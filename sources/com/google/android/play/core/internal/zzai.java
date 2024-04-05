package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import p689ul.C18614l;

public final /* synthetic */ class zzai implements IBinder.DeathRecipient {
    public final /* synthetic */ C15697i zza;

    public /* synthetic */ zzai(C15697i iVar) {
        this.zza = iVar;
    }

    public final void binderDied() {
        C15697i iVar = this.zza;
        iVar.f35462b.mo52245e("reportBinderDeath", new Object[0]);
        C15687d dVar = (C15687d) iVar.f35470j.get();
        if (dVar != null) {
            iVar.f35462b.mo52245e("calling onBinderDied", new Object[0]);
            dVar.zza();
        } else {
            iVar.f35462b.mo52245e("%s : Binder has died.", iVar.f35463c);
            Iterator it = iVar.f35464d.iterator();
            while (it.hasNext()) {
                RemoteException remoteException = new RemoteException(String.valueOf(iVar.f35463c).concat(" : Binder has died."));
                C18614l lVar = ((C15681a) it.next()).f35439b;
                if (lVar != null) {
                    lVar.mo70125a(remoteException);
                }
            }
            iVar.f35464d.clear();
        }
        iVar.mo55525d();
    }
}
