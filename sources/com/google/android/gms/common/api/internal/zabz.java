package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import p605kk.C18124h;

final class zabz extends RegisterListenerMethod {
    private final /* synthetic */ RegistrationMethods.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zabz(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.zaa = builder;
    }

    public final void registerListener(Api.AnyClient anyClient, C18124h hVar) throws RemoteException {
        this.zaa.zaa.accept(anyClient, hVar);
    }
}
