package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.IAccountAccessor;

final class zabj implements Runnable {
    private final /* synthetic */ ConnectionResult zaa;
    private final /* synthetic */ GoogleApiManager.zac zab;

    public zabj(GoogleApiManager.zac zac, ConnectionResult connectionResult) {
        this.zab = zac;
        this.zaa = connectionResult;
    }

    public final void run() {
        GoogleApiManager.zaa zaa2 = (GoogleApiManager.zaa) GoogleApiManager.this.zap.get(this.zab.zac);
        if (zaa2 != null) {
            if (this.zaa.isSuccess()) {
                boolean unused = this.zab.zaf = true;
                if (this.zab.zab.requiresSignIn()) {
                    this.zab.zaa();
                    return;
                }
                try {
                    this.zab.zab.getRemoteService((IAccountAccessor) null, this.zab.zab.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.zab.zab.disconnect("Failed to get service from broker.");
                    zaa2.onConnectionFailed(new ConnectionResult(10));
                }
            } else {
                zaa2.onConnectionFailed(this.zaa);
            }
        }
    }
}
