package com.google.android.gms.common.api.internal;

final class zabi implements Runnable {
    private final /* synthetic */ zabg zaa;

    public zabi(zabg zabg) {
        this.zaa = zabg;
    }

    public final void run() {
        this.zaa.zaa.zac.disconnect(this.zaa.zaa.zac.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
