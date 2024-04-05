package com.bumptech.glide.load.engine;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a */
public final class C5992a implements ThreadFactory {

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    public class C5993a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f12845b;

        public C5993a(Runnable runnable) {
            this.f12845b = runnable;
        }

        public final void run() {
            Process.setThreadPriority(10);
            this.f12845b.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C5993a(runnable), "glide-active-resources");
    }
}
