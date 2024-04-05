package p145io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8054g;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSingle */
public final class FlowableSingle<T> extends C19104a<T, T> {

    /* renamed from: d */
    public final T f42661d;

    /* renamed from: e */
    public final boolean f42662e = true;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSingle$SingleElementSubscriber */
    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements C8056i<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        public final T defaultValue;
        public boolean done;
        public final boolean failOnEmpty;
        public Subscription upstream;

        public SingleElementSubscriber(C20024c<? super T> cVar, T t, boolean z) {
            super(cVar);
            this.defaultValue = t;
            this.failOnEmpty = z;
        }

        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                T t = this.value;
                this.value = null;
                if (t == null) {
                    t = this.defaultValue;
                }
                if (t != null) {
                    complete(t);
                } else if (this.failOnEmpty) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C18981a.m32123b(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.value != null) {
                    this.done = true;
                    this.upstream.cancel();
                    this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
            }
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingle(C8054g gVar, Object obj) {
        super(gVar);
        this.f42661d = obj;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42671c.mo20619c(new SingleElementSubscriber(cVar, this.f42661d, this.f42662e));
    }
}
