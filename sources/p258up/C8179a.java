package p258up;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p145io.reactivex.disposables.Disposable;
import p269vp.C8221a;

/* renamed from: up.a */
public abstract class C8179a implements Disposable {

    /* renamed from: b */
    public final AtomicBoolean f17955b = new AtomicBoolean();

    /* renamed from: up.a$a */
    public class C8180a implements Runnable {
        public C8180a() {
        }

        public final void run() {
            C8179a.this.mo20811a();
        }
    }

    /* renamed from: a */
    public abstract void mo20811a();

    public final void dispose() {
        if (!this.f17955b.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo20811a();
        } else {
            C8221a.m16513a().mo20647c(new C8180a());
        }
    }

    public final boolean isDisposed() {
        return this.f17955b.get();
    }
}
