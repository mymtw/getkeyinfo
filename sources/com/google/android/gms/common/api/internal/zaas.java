package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zaas implements GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ StatusPendingResult zaa;

    public zaas(zaar zaar, StatusPendingResult statusPendingResult) {
        this.zaa = statusPendingResult;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zaa.setResult(new Status(8));
    }
}
