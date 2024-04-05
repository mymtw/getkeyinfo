package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p248tp.C8054g;
import p248tp.C8056i;
import p287xp.C8340h;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRetryPredicate */
public final class FlowableRetryPredicate<T> extends C19104a<T, T> {

    /* renamed from: d */
    public final C8340h<? super Throwable> f42653d;

    /* renamed from: e */
    public final long f42654e = 1;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableRetryPredicate$RetrySubscriber */
    public static final class RetrySubscriber<T> extends AtomicInteger implements C8056i<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final C20024c<? super T> downstream;
        public final C8340h<? super Throwable> predicate;
        public long produced;
        public long remaining;

        /* renamed from: sa */
        public final SubscriptionArbiter f42655sa;
        public final C20023b<? extends T> source;

        public RetrySubscriber(C20024c<? super T> cVar, long j, C8340h<? super Throwable> hVar, SubscriptionArbiter subscriptionArbiter, C20023b<? extends T> bVar) {
            this.downstream = cVar;
            this.f42655sa = subscriptionArbiter;
            this.source = bVar;
            this.predicate = hVar;
            this.remaining = j;
        }

        public void onComplete() {
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        public void onSubscribe(Subscription subscription) {
            this.f42655sa.setSubscription(subscription);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f42655sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0;
                        this.f42655sa.produced(j);
                    }
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowableRetryPredicate(C8054g gVar) {
        super(gVar);
        Functions.C12964i iVar = Functions.f28542f;
        this.f42653d = iVar;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(cVar, this.f42654e, this.f42653d, subscriptionArbiter, this.f42671c).subscribeNext();
    }
}
