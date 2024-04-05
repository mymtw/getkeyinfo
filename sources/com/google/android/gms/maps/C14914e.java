package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;
import p514bk.C14089b;

/* renamed from: com.google.android.gms.maps.e */
public final class C14914e extends zzaq {

    /* renamed from: a */
    public final /* synthetic */ C14089b f33247a;

    public C14914e(C14089b bVar) {
        this.f33247a = bVar;
    }

    public final void zza(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        C14089b bVar = this.f33247a;
        IGoogleMapDelegate iGoogleMapDelegate2 = (IGoogleMapDelegate) Preconditions.checkNotNull(iGoogleMapDelegate);
        bVar.mo46960a();
    }
}
