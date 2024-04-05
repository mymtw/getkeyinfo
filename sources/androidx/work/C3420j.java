package androidx.work;

import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C3419a;
import com.google.common.util.concurrent.C16388l;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19707i1;

/* renamed from: androidx.work.j */
public final class C3420j<R> implements C16388l<R> {

    /* renamed from: b */
    public final C19699g1 f8022b;

    /* renamed from: c */
    public final C3419a<R> f8023c;

    public C3420j() {
        throw null;
    }

    public C3420j(C19707i1 i1Var) {
        C3419a<R> aVar = new C3419a<>();
        this.f8022b = i1Var;
        this.f8023c = aVar;
        i1Var.mo72401k(new JobListenableFuture$1(this));
    }

    public final boolean cancel(boolean z) {
        return this.f8023c.cancel(z);
    }

    /* renamed from: e */
    public final void mo7981e(Runnable runnable, Executor executor) {
        this.f8023c.mo7981e(runnable, executor);
    }

    public final R get() {
        return this.f8023c.get();
    }

    public final R get(long j, TimeUnit timeUnit) {
        return this.f8023c.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f8023c.f7992b instanceof AbstractFuture.C3413b;
    }

    public final boolean isDone() {
        return this.f8023c.isDone();
    }
}
