package p737cr;

import android.support.p013v4.media.C0072d;
import java.util.logging.Level;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;

/* renamed from: cr.e */
public final class C18989e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C18985d f42331b;

    public C18989e(C18985d dVar) {
        this.f42331b = dVar;
    }

    public final void run() {
        C18982a c;
        while (true) {
            synchronized (this.f42331b) {
                c = this.f42331b.mo70427c();
            }
            if (c != null) {
                C18984c cVar = c.f42309a;
                C19383o.m32794d(cVar);
                long j = -1;
                C18985d dVar = C18985d.f42320h;
                boolean isLoggable = C18985d.f42321i.isLoggable(Level.FINE);
                if (isLoggable) {
                    j = cVar.f42318e.f42329g.nanoTime();
                    C19543e0.m33334t(c, cVar, "starting");
                }
                try {
                    C18985d.m32133a(this.f42331b, c);
                    C19394m mVar = C19394m.f43287a;
                    if (isLoggable) {
                        long nanoTime = cVar.f42318e.f42329g.nanoTime() - j;
                        StringBuilder h = C0072d.m201h("finished run in ");
                        h.append(C19543e0.m33296M(nanoTime));
                        C19543e0.m33334t(c, cVar, h.toString());
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        long nanoTime2 = cVar.f42318e.f42329g.nanoTime() - j;
                        StringBuilder h2 = C0072d.m201h("failed a run in ");
                        h2.append(C19543e0.m33296M(nanoTime2));
                        C19543e0.m33334t(c, cVar, h2.toString());
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
