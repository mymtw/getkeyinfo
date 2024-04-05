package p689ul;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ul.n */
public final class C18616n implements Executor {

    /* renamed from: b */
    public final Handler f41105b = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f41105b.post(runnable);
    }
}
