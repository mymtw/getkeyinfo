package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import p003a2.C0023f;

public final class zay extends RemoteCreator<zam> {
    private static final zay zaa = new zay();

    private zay() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        return zaa.zab(context, i, i2);
    }

    private final View zab(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        try {
            zaw zaw = new zaw(i, i2, (Scope[]) null);
            return (View) ObjectWrapper.unwrap(((zam) getRemoteCreatorInstance(context)).zaa(ObjectWrapper.wrap(context), zaw));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException(C0023f.m107h(64, "Could not get button with size ", i, " and color ", i2), e);
        }
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zal(iBinder);
    }
}
