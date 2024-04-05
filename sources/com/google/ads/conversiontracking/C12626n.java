package com.google.ads.conversiontracking;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.ads.conversiontracking.n */
public class C12626n implements ServiceConnection {

    /* renamed from: a */
    public boolean f27850a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f27851b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo45407a() throws InterruptedException {
        if (!this.f27850a) {
            this.f27850a = true;
            return this.f27851b.take();
        }
        throw new IllegalStateException();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f27851b.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
