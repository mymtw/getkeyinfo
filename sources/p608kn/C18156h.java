package p608kn;

import com.google.firebase.perf.p530v1.C16653b;
import com.google.firebase.perf.util.C16630e;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p568fn.C17781a;

/* renamed from: kn.h */
public final class C18156h {

    /* renamed from: f */
    public static final C17781a f39648f = C17781a.m29823d();

    /* renamed from: a */
    public final ScheduledExecutorService f39649a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C16653b> f39650b;

    /* renamed from: c */
    public final Runtime f39651c;

    /* renamed from: d */
    public ScheduledFuture f39652d = null;

    /* renamed from: e */
    public long f39653e = -1;

    public C18156h() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f39649a = newSingleThreadScheduledExecutor;
        this.f39650b = new ConcurrentLinkedQueue<>();
        this.f39651c = runtime;
    }

    /* renamed from: a */
    public final synchronized void mo69701a(long j, Timer timer) {
        this.f39653e = j;
        try {
            this.f39652d = this.f39649a.scheduleAtFixedRate(new C18155g(0, this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C17781a aVar = f39648f;
            aVar.mo69018f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
        return;
    }

    /* renamed from: b */
    public final C16653b mo69702b(Timer timer) {
        if (timer == null) {
            return null;
        }
        long currentTimestampMicros = timer.getCurrentTimestampMicros();
        C16653b.C16655b B = C16653b.m27552B();
        B.mo59761u();
        C16653b.m27554z((C16653b) B.f37158c, currentTimestampMicros);
        int b = C16630e.m27496b(StorageUnit.BYTES.toKilobytes(this.f39651c.totalMemory() - this.f39651c.freeMemory()));
        B.mo59761u();
        C16653b.m27551A((C16653b) B.f37158c, b);
        return (C16653b) B.mo59759s();
    }
}
