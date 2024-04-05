package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

final class zacf implements Runnable {
    private final /* synthetic */ zak zaa;
    private final /* synthetic */ zace zab;

    public zacf(zace zace, zak zak) {
        this.zab = zace;
        this.zaa = zak;
    }

    public final void run() {
        this.zab.zab(this.zaa);
    }
}
