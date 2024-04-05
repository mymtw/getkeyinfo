package p768rq;

import com.paypal.pyplcheckout.p543di.QualifierConstantsKt;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19834w0;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: rq.e */
public class C20156e extends C19834w0 {

    /* renamed from: c */
    public CoroutineScheduler f44637c;

    public C20156e(int i, long j, int i2) {
        this.f44637c = new CoroutineScheduler(i, j, QualifierConstantsKt.DEFAULT_DISPATCHER_QUALIFIER, i2);
    }

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler coroutineScheduler = this.f44637c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f43760i;
        coroutineScheduler.mo72609b(runnable, C20161j.f44647f, false);
    }

    /* renamed from: B0 */
    public final void mo72075B0(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler coroutineScheduler = this.f44637c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f43760i;
        coroutineScheduler.mo72609b(runnable, C20161j.f44647f, true);
    }

    /* renamed from: E0 */
    public final Executor mo72680E0() {
        return this.f44637c;
    }
}
