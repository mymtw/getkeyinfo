package p036c5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: c5.e */
public final class C4416e {

    /* renamed from: a */
    public static final C4417a f9694a = new C4417a();

    /* renamed from: b */
    public static final C4418b f9695b = new C4418b();

    /* renamed from: c5.e$a */
    public class C4417a implements Executor {
        public final void execute(Runnable runnable) {
            C4426l.m10132f().post(runnable);
        }
    }

    /* renamed from: c5.e$b */
    public class C4418b implements Executor {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static void m10118a(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
