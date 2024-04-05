package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaac;
import p605kk.C18123g;
import p605kk.C18124h;
import p671sj.C18513c;

public final class zaq extends GoogleApi<Api.ApiOptions.NoOptions> implements zaac {
    private static final Api.ClientKey<zar> zaa;
    private static final Api.AbstractClientBuilder<zar, Api.ApiOptions.NoOptions> zab;
    private static final Api<Api.ApiOptions.NoOptions> zac;

    static {
        Api.ClientKey<zar> clientKey = new Api.ClientKey<>();
        zaa = clientKey;
        zas zas = new zas();
        zab = zas;
        zac = new Api<>("ClientTelemetry.API", zas, clientKey);
    }

    public zaq(Context context) {
        super(context, zac, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final C18123g<Void> zaa(zaaa zaaa) {
        return doBestEffortWrite(TaskApiCall.builder().setFeatures(C18513c.f40773a).setAutoResolveMissingFeatures(false).run(new zap(zaaa)).build());
    }

    public static final /* synthetic */ void zaa(zaaa zaaa, zar zar, C18124h hVar) throws RemoteException {
        ((zak) zar.getService()).zaa(zaaa);
        hVar.mo69678b(null);
    }
}
