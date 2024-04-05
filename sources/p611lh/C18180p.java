package p611lh;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: lh.p */
public final /* synthetic */ class C18180p implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Handler f39782b;

    public /* synthetic */ C18180p(Handler handler) {
        this.f39782b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f39782b.post(runnable);
    }
}
