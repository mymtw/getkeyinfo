package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class zaax extends zabm {
    private WeakReference<zaar> zaa;

    public zaax(zaar zaar) {
        this.zaa = new WeakReference<>(zaar);
    }

    public final void zaa() {
        zaar zaar = this.zaa.get();
        if (zaar != null) {
            zaar.zae();
        }
    }
}
