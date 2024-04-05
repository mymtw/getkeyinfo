package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zas;

final class zacp extends zas {
    private final /* synthetic */ zacn zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacp(zacn zacn, Looper looper) {
        super(looper);
        this.zaa = zacn;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            PendingResult pendingResult = (PendingResult) message.obj;
            synchronized (this.zaa.zae) {
                zacn zacn = (zacn) Preconditions.checkNotNull(this.zaa.zab);
                if (pendingResult == null) {
                    zacn.zaa(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacc) {
                    zacn.zaa(((zacc) pendingResult).zaa());
                } else {
                    zacn.zaa((PendingResult<?>) pendingResult);
                }
            }
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i);
            Log.e("TransformedResultImpl", sb.toString());
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new String("Runtime exception on the transformation worker thread: "));
            throw runtimeException;
        }
    }
}
