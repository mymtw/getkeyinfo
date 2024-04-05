package com.bugsnag.android;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bugsnag.android.h */
public final class C5751h {

    /* renamed from: com.bugsnag.android.h$a */
    public static final class C5752a implements ThreadFactory {

        /* renamed from: b */
        public final /* synthetic */ String f12266b;

        public C5752a(String str) {
            this.f12266b = str;
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f12266b);
        }
    }

    /* renamed from: a */
    public static final ThreadPoolExecutor m11539a(String str, boolean z) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        C5752a aVar = new C5752a(str);
        return new ThreadPoolExecutor(z ? 1 : 0, 1, 30, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }
}
