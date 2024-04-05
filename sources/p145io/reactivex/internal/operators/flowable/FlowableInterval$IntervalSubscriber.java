package p145io.reactivex.internal.operators.flowable;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableInterval$IntervalSubscriber */
final class FlowableInterval$IntervalSubscriber extends AtomicLong implements Subscription, Runnable {
    private static final long serialVersionUID = -2809475196591179431L;
    public long count;
    public final C20024c<? super Long> downstream;
    public final AtomicReference<Disposable> resource = new AtomicReference<>();

    public FlowableInterval$IntervalSubscriber(C20024c<? super Long> cVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        DisposableHelper.dispose(this.resource);
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this, j);
        }
    }

    public void run() {
        if (this.resource.get() == DisposableHelper.DISPOSED) {
            return;
        }
        if (get() != 0) {
            C20024c<? super Long> cVar = this.downstream;
            long j = this.count;
            this.count = j + 1;
            cVar.onNext(Long.valueOf(j));
            C19382n.m32774u0(this, 1);
            return;
        }
        this.downstream.onError(new MissingBackpressureException(C0087d.m236f(C0072d.m201h("Can't deliver value "), this.count, " due to lack of requests")));
        DisposableHelper.dispose(this.resource);
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.setOnce(this.resource, disposable);
    }
}
