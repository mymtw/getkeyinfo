package com.google.common.util.concurrent;

import com.google.common.util.concurrent.C16372b;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.common.util.concurrent.n */
public final class C16390n implements Executor {

    /* renamed from: b */
    public boolean f36500b = true;

    /* renamed from: c */
    public final /* synthetic */ Executor f36501c;

    /* renamed from: d */
    public final /* synthetic */ AbstractFuture f36502d;

    /* renamed from: com.google.common.util.concurrent.n$a */
    public class C16391a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f36503b;

        public C16391a(Runnable runnable) {
            this.f36503b = runnable;
        }

        public final void run() {
            C16390n.this.f36500b = false;
            this.f36503b.run();
        }
    }

    public C16390n(Executor executor, C16372b.C16373a aVar) {
        this.f36501c = executor;
        this.f36502d = aVar;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f36501c.execute(new C16391a(runnable));
        } catch (RejectedExecutionException e) {
            if (this.f36500b) {
                this.f36502d.mo58317k(e);
            }
        }
    }
}
