package p021b1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: b1.m */
public final class C3465m implements ThreadFactory {

    /* renamed from: b */
    public String f8084b = "fonts-androidx";

    /* renamed from: c */
    public int f8085c = 10;

    /* renamed from: b1.m$a */
    public static class C3466a extends Thread {

        /* renamed from: b */
        public final int f8086b;

        public C3466a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f8086b = i;
        }

        public final void run() {
            Process.setThreadPriority(this.f8086b);
            super.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new C3466a(runnable, this.f8084b, this.f8085c);
    }
}
