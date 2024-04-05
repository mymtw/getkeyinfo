package p425q9;

import android.os.Process;

/* renamed from: q9.w */
public final class C13273w implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f29179b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f29180c;

    public C13273w(Runnable runnable, int i) {
        this.f29179b = i;
        this.f29180c = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.f29179b);
        this.f29180c.run();
    }
}
