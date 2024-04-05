package p365hg;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import p453tf.C13422l;

/* renamed from: hg.a0 */
public final class C12830a0<V> implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C12835b0 f28317b;

    /* renamed from: c */
    public final /* synthetic */ Callable f28318c;

    public C12830a0(C12835b0 b0Var) {
        C13422l lVar = C13422l.f29407b;
        this.f28317b = b0Var;
        this.f28318c = lVar;
    }

    public final Object call() {
        try {
            this.f28317b.f28330a = this.f28318c.call();
        } finally {
            CountDownLatch countDownLatch = this.f28317b.f28331b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
