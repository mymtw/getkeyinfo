package p145io.reactivex.internal.schedulers;

import android.support.p013v4.media.C0072d;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p003a2.C0023f;

/* renamed from: io.reactivex.internal.schedulers.RxThreadFactory */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    public final boolean nonBlocking;
    public final String prefix;
    public final int priority;

    /* renamed from: io.reactivex.internal.schedulers.RxThreadFactory$a */
    public static final class C19214a extends Thread {
        public C19214a(String str, Runnable runnable) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        String str = this.prefix + '-' + incrementAndGet();
        Thread aVar = this.nonBlocking ? new C19214a(str, runnable) : new Thread(runnable, str);
        aVar.setPriority(this.priority);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return C0023f.m110k(C0072d.m201h("RxThreadFactory["), this.prefix, "]");
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }
}
