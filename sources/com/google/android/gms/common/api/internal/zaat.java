package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zaat implements GoogleApiClient.ConnectionCallbacks {
    private final /* synthetic */ AtomicReference zaa;
    private final /* synthetic */ StatusPendingResult zab;
    private final /* synthetic */ zaar zac;

    public zaat(zaar zaar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.zac = zaar;
        this.zaa = atomicReference;
        this.zab = statusPendingResult;
    }

    public final void onConnected(Bundle bundle) {
        this.zac.zaa((GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.zaa.get()), this.zab, true);
    }

    public final void onConnectionSuspended(int i) {
    }
}
