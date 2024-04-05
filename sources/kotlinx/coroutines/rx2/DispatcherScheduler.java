package kotlinx.coroutines.rx2;

import androidx.compose.animation.C0391c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19838x1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C19721f;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8066r;

public final class DispatcherScheduler extends C8066r {

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f43743d = AtomicLongFieldUpdater.newUpdater(DispatcherScheduler.class, "workerCounter");
    private volatile /* synthetic */ long workerCounter;

    public static final class DispatcherWorker extends C8066r.C8069c {

        /* renamed from: b */
        public final long f43744b;

        /* renamed from: c */
        public final CoroutineDispatcher f43745c = null;

        /* renamed from: d */
        public final C19838x1 f43746d;

        public DispatcherWorker(long j) {
            this.f43744b = j;
            C19838x1 x1Var = new C19838x1((C19699g1) null);
            this.f43746d = x1Var;
            x1Var.plus((CoroutineContext) null);
            throw null;
        }

        /* renamed from: b */
        public final Disposable mo20653b(Runnable runnable, long j, TimeUnit timeUnit) {
            return C19790c.m33751a((C19721f) null, runnable, timeUnit.toMillis(j), new DispatcherScheduler$DispatcherWorker$schedule$1(this));
        }

        public final void dispose() {
            throw null;
        }

        public final boolean isDisposed() {
            return !C19697g.m33467e((C19525d0) null);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f43745c);
            sb.append(" (worker ");
            sb.append(this.f43744b);
            sb.append(", ");
            return C0391c.m1057c(sb, isDisposed() ? "disposed" : "active", ')');
        }
    }

    /* renamed from: b */
    public final C8066r.C8069c mo20646b() {
        new DispatcherWorker(f43743d.getAndIncrement(this));
        throw null;
    }

    /* renamed from: d */
    public final Disposable mo20648d(Runnable runnable, long j, TimeUnit timeUnit) {
        C19790c.m33751a((C19721f) null, runnable, timeUnit.toMillis(j), new DispatcherScheduler$scheduleDirect$1(this));
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
