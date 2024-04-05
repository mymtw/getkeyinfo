package com.google.android.datatransport.runtime;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.google.android.datatransport.runtime.n */
public final class C6552n implements Executor {

    /* renamed from: b */
    public final Executor f14486b;

    /* renamed from: com.google.android.datatransport.runtime.n$a */
    public static class C6553a implements Runnable {

        /* renamed from: b */
        public final Runnable f14487b;

        public C6553a(Runnable runnable) {
            this.f14487b = runnable;
        }

        public final void run() {
            try {
                this.f14487b.run();
            } catch (Exception e) {
                Log.e(C19388s.m32864h0("Executor"), "Background execution failure.", e);
            }
        }
    }

    public C6552n(ExecutorService executorService) {
        this.f14486b = executorService;
    }

    public final void execute(Runnable runnable) {
        this.f14486b.execute(new C6553a(runnable));
    }
}
