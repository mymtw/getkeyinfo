package p665rl;

import java.util.concurrent.ThreadFactory;

/* renamed from: rl.d */
public final class C18486d implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
