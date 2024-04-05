package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import p605kk.C18124h;

abstract class zac<T> extends zad {
    public final C18124h<T> zab;

    public zac(int i, C18124h<T> hVar) {
        super(i);
        this.zab = hVar;
    }

    public void zaa(Status status) {
        this.zab.mo69679c(new ApiException(status));
    }

    public void zaa(zav zav, boolean z) {
    }

    public abstract void zab(GoogleApiManager.zaa<?> zaa) throws RemoteException;

    public void zaa(Exception exc) {
        this.zab.mo69679c(exc);
    }

    public final void zaa(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            zab(zaa);
        } catch (DeadObjectException e) {
            zaa(zab.zab(e));
            throw e;
        } catch (RemoteException e2) {
            zaa(zab.zab(e2));
        } catch (RuntimeException e3) {
            zaa((Exception) e3);
        }
    }
}
