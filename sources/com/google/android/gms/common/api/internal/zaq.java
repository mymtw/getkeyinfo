package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

public final class zaq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api<?> zaa;
    private final boolean zab;
    private zap zac;

    public zaq(Api<?> api, boolean z) {
        this.zaa = api;
        this.zab = z;
    }

    public final void onConnected(Bundle bundle) {
        zaa().onConnected(bundle);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zaa().zaa(connectionResult, this.zaa, this.zab);
    }

    public final void onConnectionSuspended(int i) {
        zaa().onConnectionSuspended(i);
    }

    public final void zaa(zap zap) {
        this.zac = zap;
    }

    private final zap zaa() {
        Preconditions.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.zac;
    }
}
