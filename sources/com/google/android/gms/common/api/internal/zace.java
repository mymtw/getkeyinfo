package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zau;
import com.google.android.gms.signin.internal.zab;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p581hk.C17821a;
import p581hk.C17823c;
import p581hk.C17826f;

public final class zace extends zab implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static Api.AbstractClientBuilder<? extends C17826f, C17821a> zaa = C17823c.f38729a;
    private final Context zab;
    private final Handler zac;
    private final Api.AbstractClientBuilder<? extends C17826f, C17821a> zad;
    private Set<Scope> zae;
    private ClientSettings zaf;
    private C17826f zag;
    /* access modifiers changed from: private */
    public zach zah;

    public zace(Context context, Handler handler, ClientSettings clientSettings) {
        this(context, handler, clientSettings, zaa);
    }

    /* access modifiers changed from: private */
    public final void zab(zak zak) {
        ConnectionResult zaa2 = zak.zaa();
        if (zaa2.isSuccess()) {
            zau zau = (zau) Preconditions.checkNotNull(zak.zab());
            ConnectionResult zab2 = zau.zab();
            if (!zab2.isSuccess()) {
                String valueOf = String.valueOf(zab2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.zah.zaa(zab2);
                this.zag.disconnect();
                return;
            }
            this.zah.zaa(zau.zaa(), this.zae);
        } else {
            this.zah.zaa(zaa2);
        }
        this.zag.disconnect();
    }

    public final void onConnected(Bundle bundle) {
        this.zag.mo69060b(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zah.zaa(connectionResult);
    }

    public final void onConnectionSuspended(int i) {
        this.zag.disconnect();
    }

    public final void zaa(zach zach) {
        C17826f fVar = this.zag;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.zaf.zaa(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends C17826f, C17821a> abstractClientBuilder = this.zad;
        Context context = this.zab;
        Looper looper = this.zac.getLooper();
        ClientSettings clientSettings = this.zaf;
        this.zag = (C17826f) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.zac(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.zah = zach;
        Set<Scope> set = this.zae;
        if (set == null || set.isEmpty()) {
            this.zac.post(new zacg(this));
        } else {
            this.zag.zab();
        }
    }

    private zace(Context context, Handler handler, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends C17826f, C17821a> abstractClientBuilder) {
        this.zab = context;
        this.zac = handler;
        this.zaf = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zae = clientSettings.getRequiredScopes();
        this.zad = abstractClientBuilder;
    }

    public final void zaa() {
        C17826f fVar = this.zag;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    public final void zaa(zak zak) {
        this.zac.post(new zacf(this, zak));
    }
}
