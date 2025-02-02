package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

public final class zaaa implements zaaw {
    /* access modifiers changed from: private */
    public final zaaz zaa;
    private boolean zab = false;

    public zaaa(zaaz zaaz) {
        this.zaa = zaaz;
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        return zab(t);
    }

    public final void zaa() {
    }

    public final void zaa(Bundle bundle) {
    }

    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        try {
            this.zaa.zad.zae.zaa(t);
            zaar zaar = this.zaa.zad;
            Api.Client client = zaar.zab.get(t.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.zaa.zab.containsKey(t.getClientKey())) {
                t.run(client);
            } else {
                t.setFailedResult(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.zaa.zaa((zaay) new zaad(this, this));
        }
        return t;
    }

    public final void zac() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zaa((zaay) new zaac(this, this));
        }
    }

    public final void zad() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zad.zae.zaa();
            zab();
        }
    }

    public final void zaa(int i) {
        this.zaa.zaa((ConnectionResult) null);
        this.zaa.zae.zaa(i, this.zab);
    }

    public final boolean zab() {
        if (this.zab) {
            return false;
        }
        Set<zacn> set = this.zaa.zad.zad;
        if (set == null || set.isEmpty()) {
            this.zaa.zaa((ConnectionResult) null);
            return true;
        }
        this.zab = true;
        for (zacn zaa2 : set) {
            zaa2.zaa();
        }
        return false;
    }
}
