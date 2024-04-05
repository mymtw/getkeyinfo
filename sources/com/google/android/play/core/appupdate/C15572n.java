package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.install.InstallException;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.appupdate.n */
public final class C15572n extends C15571m {
    public C15572n(C15574p pVar, C18614l lVar) {
        super(pVar, new C15032m3("OnCompleteUpdateCallback"), lVar);
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        super.zzb(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f35046b.mo70125a(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f35046b.mo70126b((Object) null);
        }
    }
}
