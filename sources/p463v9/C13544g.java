package p463v9;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.Connectivity;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p628nj.C18263b;

/* renamed from: v9.g */
public final class C13544g {

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor f29621a;

    /* renamed from: b */
    public static final Object f29622b = new Object();

    /* renamed from: v9.g$a */
    public static class C13545a implements Runnable {

        /* renamed from: b */
        public Connectivity f29623b;

        public C13545a(Connectivity connectivity) {
            this.f29623b = connectivity;
        }

        public final void run() {
            if (this.f29623b.mo29933a() && C18263b.f40057V.mo45960e()) {
                C8694h.f19097a.mo21308c();
                C13537b bVar = C18263b.f40057V.f29142h;
                if (bVar != null) {
                    bVar.mo46196e();
                }
            }
        }
    }
}
