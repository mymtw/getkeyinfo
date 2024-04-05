package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class zacg implements Runnable {
    private final /* synthetic */ zace zaa;

    public zacg(zace zace) {
        this.zaa = zace;
    }

    public final void run() {
        this.zaa.zah.zaa(new ConnectionResult(4));
    }
}
