package kotlinx.coroutines;

import androidx.compose.p015ui.text.input.C1993m;
import com.google.android.gms.measurement.internal.C15095t3;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C19719d;

/* renamed from: kotlinx.coroutines.x0 */
public final class C19837x0 extends C19834w0 implements C19744j0 {

    /* renamed from: c */
    public final Executor f43847c;

    public C19837x0(Executor executor) {
        this.f43847c = executor;
        Method method = C19719d.f43658a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = C19719d.f43658a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f43847c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C1993m.m4372r(coroutineContext, cancellationException);
            C19760n0.f43720b.mo7108A0(coroutineContext, runnable);
        }
    }

    /* renamed from: E0 */
    public final Executor mo72680E0() {
        return this.f43847c;
    }

    public final void close() {
        Executor executor = this.f43847c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19837x0) && ((C19837x0) obj).f43847c == this.f43847c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f43847c);
    }

    /* renamed from: i */
    public final C19766p0 mo72115i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f43847c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C1993m.m4372r(coroutineContext, cancellationException);
            }
        }
        return scheduledFuture != null ? new C19763o0(scheduledFuture) : C19547f0.f43502i.mo72115i(j, runnable, coroutineContext);
    }

    /* renamed from: t */
    public final void mo72116t(long j, C19753l lVar) {
        Executor executor = this.f43847c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            C15095t3 t3Var = new C15095t3((Object) this, (Object) lVar, 3);
            CoroutineContext coroutineContext = lVar.f43710f;
            try {
                scheduledFuture = scheduledExecutorService.schedule(t3Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C1993m.m4372r(coroutineContext, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            lVar.mo72497O(new C19702h(scheduledFuture));
        } else {
            C19547f0.f43502i.mo72116t(j, lVar);
        }
    }

    public final String toString() {
        return this.f43847c.toString();
    }
}
