package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.squareup.picasso.z */
public final class C17470z extends Handler {
    public C17470z(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000);
    }
}
