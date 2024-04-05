package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;
import p514bk.C14090c;

/* renamed from: com.google.android.gms.maps.c */
public final class C14912c extends zzbq {

    /* renamed from: a */
    public final /* synthetic */ C14090c f33245a;

    public C14912c(C14090c cVar) {
        this.f33245a = cVar;
    }

    public final void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        C14090c cVar = this.f33245a;
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate2 = (IStreetViewPanoramaDelegate) Preconditions.checkNotNull(iStreetViewPanoramaDelegate, "delegate");
        cVar.mo46961a();
    }
}
