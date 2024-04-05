package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zas;
import p003a2.C0023f;

final class zaau extends zas {
    private final /* synthetic */ zaar zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaau(zaar zaar, Looper looper) {
        super(looper);
        this.zaa = zaar;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.zaa.zaf();
        } else if (i != 2) {
            C0023f.m112m(31, "Unknown message id: ", i, "GoogleApiClientImpl");
        } else {
            this.zaa.zae();
        }
    }
}
