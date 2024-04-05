package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import java.util.concurrent.TimeUnit;
import p605kk.C18124h;

final class zar implements PendingResult.StatusListener {
    private final /* synthetic */ PendingResult zaa;
    private final /* synthetic */ C18124h zab;
    private final /* synthetic */ PendingResultUtil.ResultConverter zac;
    private final /* synthetic */ PendingResultUtil.zaa zad;

    public zar(PendingResult pendingResult, C18124h hVar, PendingResultUtil.ResultConverter resultConverter, PendingResultUtil.zaa zaa2) {
        this.zaa = pendingResult;
        this.zab = hVar;
        this.zac = resultConverter;
        this.zad = zaa2;
    }

    public final void onComplete(Status status) {
        if (status.isSuccess()) {
            this.zab.mo69678b(this.zac.convert(this.zaa.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.zab.mo69677a(this.zad.zaa(status));
    }
}
