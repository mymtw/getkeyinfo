package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class zaco {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost");
    @VisibleForTesting
    public final Set<BasePendingResult<?>> zab = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final zacq zac = new zacr(this);

    public final void zaa(BasePendingResult<? extends Result> basePendingResult) {
        this.zab.add(basePendingResult);
        basePendingResult.zaa(this.zac);
    }

    public final void zaa() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.zaa((zacq) null);
            if (basePendingResult.zaa()) {
                this.zab.remove(basePendingResult);
            }
        }
    }
}
