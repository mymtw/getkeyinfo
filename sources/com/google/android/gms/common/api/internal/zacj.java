package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import p605kk.C18124h;

final class zacj extends TaskApiCall {
    private final /* synthetic */ TaskApiCall.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacj(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.zaa = builder;
    }

    public final void doExecute(Api.AnyClient anyClient, C18124h hVar) throws RemoteException {
        this.zaa.zaa.accept(anyClient, hVar);
    }
}
