package p121h;

import android.os.Looper;
import androidx.preference.C3039b;
import java.util.concurrent.Executor;

/* renamed from: h.a */
public final class C6900a extends C3039b {

    /* renamed from: d */
    public static volatile C6900a f15276d;

    /* renamed from: e */
    public static final C6901a f15277e = new C6901a();

    /* renamed from: c */
    public C6903c f15278c = new C6903c();

    /* renamed from: h.a$a */
    public static class C6901a implements Executor {
        public final void execute(Runnable runnable) {
            C6900a.m13347u0().f15278c.f15280d.execute(runnable);
        }
    }

    /* renamed from: u0 */
    public static C6900a m13347u0() {
        if (f15276d != null) {
            return f15276d;
        }
        synchronized (C6900a.class) {
            if (f15276d == null) {
                f15276d = new C6900a();
            }
        }
        return f15276d;
    }

    /* renamed from: v0 */
    public final void mo19013v0(Runnable runnable) {
        C6903c cVar = this.f15278c;
        if (cVar.f15281e == null) {
            synchronized (cVar.f15279c) {
                if (cVar.f15281e == null) {
                    cVar.f15281e = C6903c.m13350u0(Looper.getMainLooper());
                }
            }
        }
        cVar.f15281e.post(runnable);
    }
}
