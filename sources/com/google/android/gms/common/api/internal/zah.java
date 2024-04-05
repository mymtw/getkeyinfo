package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import p605kk.C18124h;

public final class zah<ResultT> extends zad {
    private final TaskApiCall<Api.AnyClient, ResultT> zab;
    private final C18124h<ResultT> zac;
    private final StatusExceptionMapper zad;

    public zah(int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, C18124h<ResultT> hVar, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zac = hVar;
        this.zab = taskApiCall;
        this.zad = statusExceptionMapper;
        if (i == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void zaa(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            this.zab.doExecute(zaa.zab(), this.zac);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zaa(zab.zab(e2));
        } catch (RuntimeException e3) {
            zaa((Exception) e3);
        }
    }

    public final Feature[] zac(GoogleApiManager.zaa<?> zaa) {
        return this.zab.zaa();
    }

    public final boolean zad(GoogleApiManager.zaa<?> zaa) {
        return this.zab.shouldAutoResolveMissingFeatures();
    }

    public final void zaa(Status status) {
        this.zac.mo69679c(this.zad.getException(status));
    }

    public final void zaa(Exception exc) {
        this.zac.mo69679c(exc);
    }

    public final void zaa(zav zav, boolean z) {
        zav.zaa(this.zac, z);
    }
}
