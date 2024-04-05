package p145io.reactivex.internal.operators.flowable;

import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p287xp.C8333a;
import p503zp.C13965a;
import p503zp.C13970f;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableDoFinally$DoFinallyConditionalSubscriber */
final class FlowableDoFinally$DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements C13965a<T> {
    private static final long serialVersionUID = 4109457741734051389L;
    public final C13965a<? super T> downstream;
    public final C8333a onFinally;

    /* renamed from: qs */
    public C13970f<T> f42634qs;
    public boolean syncFused;
    public Subscription upstream;

    public FlowableDoFinally$DoFinallyConditionalSubscriber(C13965a<? super T> aVar, C8333a aVar2) {
        this.downstream = aVar;
        this.onFinally = aVar2;
    }

    public void cancel() {
        this.upstream.cancel();
        runFinally();
    }

    public void clear() {
        this.f42634qs.clear();
    }

    public boolean isEmpty() {
        return this.f42634qs.isEmpty();
    }

    public void onComplete() {
        this.downstream.onComplete();
        runFinally();
    }

    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
    }

    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            if (subscription instanceof C13970f) {
                this.f42634qs = (C13970f) subscription;
            }
            this.downstream.onSubscribe(this);
        }
    }

    public T poll() throws Exception {
        T poll = this.f42634qs.poll();
        if (poll == null && this.syncFused) {
            runFinally();
        }
        return poll;
    }

    public void request(long j) {
        this.upstream.request(j);
    }

    public int requestFusion(int i) {
        C13970f<T> fVar = this.f42634qs;
        boolean z = false;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i);
        if (requestFusion != 0) {
            if (requestFusion == 1) {
                z = true;
            }
            this.syncFused = z;
        }
        return requestFusion;
    }

    public void runFinally() {
        if (compareAndSet(0, 1)) {
            try {
                this.onFinally.run();
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
            }
        }
    }

    public boolean tryOnNext(T t) {
        return this.downstream.tryOnNext(t);
    }
}
