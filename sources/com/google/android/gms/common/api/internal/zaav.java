package com.google.android.gms.common.api.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import p588ij.C17842a;

final class zaav implements ResultCallback<Status> {
    private final /* synthetic */ StatusPendingResult zaa;
    private final /* synthetic */ boolean zab;
    private final /* synthetic */ GoogleApiClient zac;
    private final /* synthetic */ zaar zad;

    public zaav(zaar zaar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.zad = zaar;
        this.zaa = statusPendingResult;
        this.zab = z;
        this.zac = googleApiClient;
    }

    public final void onResult(Result result) {
        Status status = (Status) result;
        C17842a a = C17842a.m29965a(this.zad.zaj);
        String g = a.mo69080g("defaultGoogleSignInAccount");
        a.mo69081h("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g)) {
            a.mo69081h(C17842a.m29966f("googleSignInAccount", g));
            a.mo69081h(C17842a.m29966f("googleSignInOptions", g));
        }
        if (status.isSuccess() && this.zad.isConnected()) {
            this.zad.reconnect();
        }
        this.zaa.setResult(status);
        if (this.zab) {
            this.zac.disconnect();
        }
    }
}
