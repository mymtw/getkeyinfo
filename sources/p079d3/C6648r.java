package p079d3;

import android.support.p013v4.media.C0072d;
import androidx.work.C3422l;
import com.facebook.AuthenticationTokenClaims;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: d3.r */
public final class C6648r {

    /* renamed from: e */
    public static final String f14675e = C3422l.m8214e("WorkTimer");

    /* renamed from: a */
    public final ScheduledExecutorService f14676a;

    /* renamed from: b */
    public final HashMap f14677b = new HashMap();

    /* renamed from: c */
    public final HashMap f14678c = new HashMap();

    /* renamed from: d */
    public final Object f14679d = new Object();

    /* renamed from: d3.r$a */
    public class C6649a implements ThreadFactory {

        /* renamed from: b */
        public int f14680b = 0;

        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder h = C0072d.m201h("WorkManager-WorkTimer-thread-");
            h.append(this.f14680b);
            newThread.setName(h.toString());
            this.f14680b++;
            return newThread;
        }
    }

    /* renamed from: d3.r$b */
    public interface C6650b {
        /* renamed from: a */
        void mo12867a(String str);
    }

    /* renamed from: d3.r$c */
    public static class C6651c implements Runnable {

        /* renamed from: b */
        public final C6648r f14681b;

        /* renamed from: c */
        public final String f14682c;

        public C6651c(C6648r rVar, String str) {
            this.f14681b = rVar;
            this.f14682c = str;
        }

        public final void run() {
            synchronized (this.f14681b.f14679d) {
                if (((C6651c) this.f14681b.f14677b.remove(this.f14682c)) != null) {
                    C6650b bVar = (C6650b) this.f14681b.f14678c.remove(this.f14682c);
                    if (bVar != null) {
                        bVar.mo12867a(this.f14682c);
                    }
                } else {
                    C3422l.m8213c().mo12926a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f14682c}), new Throwable[0]);
                }
            }
        }
    }

    public C6648r() {
        C6649a aVar = new C6649a();
        this.f14676a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public final void mo18826a(String str, C6650b bVar) {
        synchronized (this.f14679d) {
            C3422l.m8213c().mo12926a(f14675e, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo18827b(str);
            C6651c cVar = new C6651c(this, str);
            this.f14677b.put(str, cVar);
            this.f14678c.put(str, bVar);
            this.f14676a.schedule(cVar, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    public final void mo18827b(String str) {
        synchronized (this.f14679d) {
            if (((C6651c) this.f14677b.remove(str)) != null) {
                C3422l.m8213c().mo12926a(f14675e, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f14678c.remove(str);
            }
        }
    }
}
