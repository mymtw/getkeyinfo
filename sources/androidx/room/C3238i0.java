package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.i0 */
public final class C3238i0 implements Executor {

    /* renamed from: b */
    public final Executor f7534b;

    /* renamed from: c */
    public final ArrayDeque<Runnable> f7535c = new ArrayDeque<>();

    /* renamed from: d */
    public Runnable f7536d;

    /* renamed from: androidx.room.i0$a */
    public class C3239a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f7537b;

        public C3239a(Runnable runnable) {
            this.f7537b = runnable;
        }

        public final void run() {
            try {
                this.f7537b.run();
            } finally {
                C3238i0.this.mo12032a();
            }
        }
    }

    public C3238i0(Executor executor) {
        this.f7534b = executor;
    }

    /* renamed from: a */
    public final synchronized void mo12032a() {
        Runnable poll = this.f7535c.poll();
        this.f7536d = poll;
        if (poll != null) {
            this.f7534b.execute(poll);
        }
    }

    public final synchronized void execute(Runnable runnable) {
        this.f7535c.offer(new C3239a(runnable));
        if (this.f7536d == null) {
            mo12032a();
        }
    }
}
