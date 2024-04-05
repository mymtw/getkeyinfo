package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
public final class C14583b1 implements ThreadFactory {

    /* renamed from: b */
    public final ThreadFactory f32754b = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f32754b.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
