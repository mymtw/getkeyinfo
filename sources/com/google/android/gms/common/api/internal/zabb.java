package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zas;
import p003a2.C0023f;

final class zabb extends zas {
    private final /* synthetic */ zaaz zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zabb(zaaz zaaz, Looper looper) {
        super(looper);
        this.zaa = zaaz;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zaay) message.obj).zaa(this.zaa);
        } else if (i != 2) {
            C0023f.m112m(31, "Unknown message id: ", i, "GACStateManager");
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
