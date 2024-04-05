package com.bugsnag.android;

import android.os.HandlerThread;

/* renamed from: com.bugsnag.android.b */
public final class C5720b {

    /* renamed from: a */
    public final HandlerThread f12148a;

    public C5720b() {
        HandlerThread handlerThread = new HandlerThread("bugsnag-anr-collector");
        this.f12148a = handlerThread;
        handlerThread.start();
    }
}
