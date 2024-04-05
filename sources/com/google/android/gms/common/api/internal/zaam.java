package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import p581hk.C17826f;

final class zaam implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ zaaf zaa;

    private zaam(zaaf zaaf) {
        this.zaa = zaaf;
    }

    public final void onConnected(Bundle bundle) {
        ClientSettings clientSettings = (ClientSettings) Preconditions.checkNotNull(this.zaa.zar);
        ((C17826f) Preconditions.checkNotNull(this.zaa.zak)).mo69060b(new zaak(this.zaa));
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zaa.zab.lock();
        try {
            if (this.zaa.zaa(connectionResult)) {
                this.zaa.zag();
                this.zaa.zae();
            } else {
                this.zaa.zab(connectionResult);
            }
        } finally {
            this.zaa.zab.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
    }

    public /* synthetic */ zaam(zaaf zaaf, zaae zaae) {
        this(zaaf);
    }
}
