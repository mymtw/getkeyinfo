package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p689ul.C18614l;

/* renamed from: com.google.android.play.core.assetpacks.o */
public final class C15634o extends C15626m {
    public C15634o(C15662v vVar, C18614l lVar) {
        super(vVar, lVar);
    }

    public final void zze(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.zze(bundle, bundle2);
        this.f35237a.mo70126b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
