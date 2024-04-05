package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;
import p514bk.C14090c;

/* renamed from: com.google.android.gms.maps.f */
public final class C14915f extends zzbq {

    /* renamed from: a */
    public final /* synthetic */ C14090c f33248a;

    public C14915f(C14090c cVar) {
        this.f33248a = cVar;
    }

    public final void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        C14090c cVar = this.f33248a;
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate2 = (IStreetViewPanoramaDelegate) Preconditions.checkNotNull(iStreetViewPanoramaDelegate, "delegate");
        cVar.mo46961a();
    }
}
