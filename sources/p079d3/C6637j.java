package p079d3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: d3.j */
public final class C6637j implements Executor {

    /* renamed from: b */
    public final ArrayDeque<C6638a> f14641b = new ArrayDeque<>();

    /* renamed from: c */
    public final Executor f14642c;

    /* renamed from: d */
    public final Object f14643d = new Object();

    /* renamed from: e */
    public volatile Runnable f14644e;

    /* renamed from: d3.j$a */
    public static class C6638a implements Runnable {

        /* renamed from: b */
        public final C6637j f14645b;

        /* renamed from: c */
        public final Runnable f14646c;

        public C6638a(C6637j jVar, Runnable runnable) {
            this.f14645b = jVar;
            this.f14646c = runnable;
        }

        public final void run() {
            try {
                this.f14646c.run();
            } finally {
                this.f14645b.mo18817a();
            }
        }
    }

    public C6637j(ExecutorService executorService) {
        this.f14642c = executorService;
    }

    /* renamed from: a */
    public final void mo18817a() {
        synchronized (this.f14643d) {
            Runnable poll = this.f14641b.poll();
            this.f14644e = poll;
            if (poll != null) {
                this.f14642c.execute(this.f14644e);
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f14643d) {
            this.f14641b.add(new C6638a(this, runnable));
            if (this.f14644e == null) {
                mo18817a();
            }
        }
    }
}
