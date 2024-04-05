package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8056i;
import p248tp.C8066r;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn$UnsubscribeSubscriber */
final class FlowableUnsubscribeOn$UnsubscribeSubscriber<T> extends AtomicBoolean implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 1015244841293359600L;
    public final C20024c<? super T> downstream;
    public final C8066r scheduler;
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn$UnsubscribeSubscriber$a */
    public final class C19103a implements Runnable {
        public C19103a() {
        }

        public final void run() {
            FlowableUnsubscribeOn$UnsubscribeSubscriber.this.upstream.cancel();
        }
    }

    public FlowableUnsubscribeOn$UnsubscribeSubscriber(C20024c<? super T> cVar, C8066r rVar) {
        this.downstream = cVar;
        this.scheduler = rVar;
    }

    public void cancel() {
        if (compareAndSet(false, true)) {
            this.scheduler.mo20647c(new C19103a());
        }
    }

    public void onComplete() {
        if (!get()) {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (get()) {
            C18981a.m32123b(th);
        } else {
            this.downstream.onError(th);
        }
    }

    public void onNext(T t) {
        if (!get()) {
            this.downstream.onNext(t);
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
        }
    }

    public void request(long j) {
        this.upstream.request(j);
    }
}
