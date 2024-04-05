package p090e3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p079d3.C6637j;

/* renamed from: e3.b */
public final class C6713b implements C6712a {

    /* renamed from: a */
    public final C6637j f14803a;

    /* renamed from: b */
    public final Handler f14804b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C6714a f14805c = new C6714a();

    /* renamed from: e3.b$a */
    public class C6714a implements Executor {
        public C6714a() {
        }

        public final void execute(Runnable runnable) {
            C6713b.this.f14804b.post(runnable);
        }
    }

    public C6713b(ExecutorService executorService) {
        this.f14803a = new C6637j(executorService);
    }

    /* renamed from: a */
    public final void mo18901a(Runnable runnable) {
        this.f14803a.execute(runnable);
    }
}
