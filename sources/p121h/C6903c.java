package p121h;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.preference.C3039b;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h.c */
public final class C6903c extends C3039b {

    /* renamed from: c */
    public final Object f15279c = new Object();

    /* renamed from: d */
    public final ExecutorService f15280d = Executors.newFixedThreadPool(4, new C6904a());

    /* renamed from: e */
    public volatile Handler f15281e;

    /* renamed from: h.c$a */
    public class C6904a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f15282b = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f15282b.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: u0 */
    public static Handler m13350u0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
