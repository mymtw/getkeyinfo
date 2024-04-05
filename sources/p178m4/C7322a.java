package p178m4;

import android.os.Process;
import android.os.StrictMode;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m4.a */
public final class C7322a implements ExecutorService {

    /* renamed from: c */
    public static final long f16234c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    public static volatile int f16235d;

    /* renamed from: b */
    public final ExecutorService f16236b;

    /* renamed from: m4.a$a */
    public static final class C7323a implements ThreadFactory {

        /* renamed from: m4.a$a$a */
        public class C7324a extends Thread {
            public C7324a(Runnable runnable) {
                super(runnable);
            }

            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public final Thread newThread(Runnable runnable) {
            return new C7324a(runnable);
        }
    }

    /* renamed from: m4.a$b */
    public static final class C7325b implements ThreadFactory {

        /* renamed from: b */
        public final ThreadFactory f16237b;

        /* renamed from: c */
        public final String f16238c;

        /* renamed from: d */
        public final C7327c f16239d;

        /* renamed from: e */
        public final boolean f16240e;

        /* renamed from: f */
        public final AtomicInteger f16241f = new AtomicInteger();

        /* renamed from: m4.a$b$a */
        public class C7326a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Runnable f16242b;

            public C7326a(Runnable runnable) {
                this.f16242b = runnable;
            }

            public final void run() {
                if (C7325b.this.f16240e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f16242b.run();
                } catch (Throwable th) {
                    C7325b.this.f16239d.mo19601a(th);
                }
            }
        }

        public C7325b(C7323a aVar, String str, boolean z) {
            C7327c.C7328a aVar2 = C7327c.f16244a;
            this.f16237b = aVar;
            this.f16238c = str;
            this.f16239d = aVar2;
            this.f16240e = z;
        }

        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.f16237b.newThread(new C7326a(runnable));
            StringBuilder h = C0072d.m201h("glide-");
            h.append(this.f16238c);
            h.append("-thread-");
            h.append(this.f16241f.getAndIncrement());
            newThread.setName(h.toString());
            return newThread;
        }
    }

    /* renamed from: m4.a$c */
    public interface C7327c {

        /* renamed from: a */
        public static final C7328a f16244a = new C7328a();

        /* renamed from: m4.a$c$a */
        public class C7328a implements C7327c {
            /* renamed from: a */
            public final void mo19601a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: a */
        void mo19601a(Throwable th);
    }

    public C7322a(ThreadPoolExecutor threadPoolExecutor) {
        this.f16236b = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f16236b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f16236b.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f16236b.invokeAll(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f16236b.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f16236b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f16236b.isTerminated();
    }

    public final void shutdown() {
        this.f16236b.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f16236b.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f16236b.submit(runnable);
    }

    public final String toString() {
        return this.f16236b.toString();
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f16236b.invokeAll(collection, j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f16236b.invokeAny(collection, j, timeUnit);
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f16236b.submit(runnable, t);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f16236b.submit(callable);
    }
}
