package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p605kk.C18124h;

public final class zav {
    /* access modifiers changed from: private */
    public final Map<BasePendingResult<?>, Boolean> zaa = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */
    public final Map<C18124h<?>, Boolean> zab = Collections.synchronizedMap(new WeakHashMap());

    public final void zaa(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.zaa.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.addStatusListener(new zax(this, basePendingResult));
    }

    public final void zab() {
        zaa(false, GoogleApiManager.zaa);
    }

    public final <TResult> void zaa(C18124h<TResult> hVar, boolean z) {
        this.zab.put(hVar, Boolean.valueOf(z));
        hVar.f39566a.mo69656c(new zaw(this, hVar));
    }

    public final boolean zaa() {
        return !this.zaa.isEmpty() || !this.zab.isEmpty();
    }

    public final void zaa(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        zaa(true, new Status(20, sb.toString()));
    }

    private final void zaa(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.zaa) {
            hashMap = new HashMap(this.zaa);
        }
        synchronized (this.zab) {
            hashMap2 = new HashMap(this.zab);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C18124h) entry2.getKey()).mo69679c(new ApiException(status));
            }
        }
    }
}
