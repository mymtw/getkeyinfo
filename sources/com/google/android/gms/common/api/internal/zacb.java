package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import p605kk.C18124h;

final class zacb extends UnregisterListenerMethod {
    private final /* synthetic */ RegistrationMethods.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacb(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zaa = builder;
    }

    public final void unregisterListener(Api.AnyClient anyClient, C18124h hVar) throws RemoteException {
        this.zaa.zab.accept(anyClient, hVar);
    }
}
