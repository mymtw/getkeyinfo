package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zab;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

final class zaak extends zab {
    private final WeakReference<zaaf> zaa;

    public zaak(zaaf zaaf) {
        this.zaa = new WeakReference<>(zaaf);
    }

    public final void zaa(zak zak) {
        zaaf zaaf = this.zaa.get();
        if (zaaf != null) {
            zaaf.zaa.zaa((zaay) new zaan(this, zaaf, zaaf, zak));
        }
    }
}
