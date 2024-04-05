package p425q9;

import java.util.concurrent.ThreadFactory;

/* renamed from: q9.x */
public final class C13274x implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(new C13273w(runnable, 10));
    }
}
