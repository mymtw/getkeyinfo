package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8056i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.CompletableMerge$CompletableMergeSubscriber */
final class CompletableMerge$CompletableMergeSubscriber extends AtomicInteger implements C8056i<C8052e>, Disposable {
    private static final long serialVersionUID = -2108443387387077490L;
    public final boolean delayErrors;
    public final C8050c downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final int maxConcurrency;
    public final C7091a set = new C7091a();
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableMerge$CompletableMergeSubscriber$MergeInnerObserver */
    public final class MergeInnerObserver extends AtomicReference<Disposable> implements C8050c, Disposable {
        private static final long serialVersionUID = 251330541679988317L;

        public MergeInnerObserver() {
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            CompletableMerge$CompletableMergeSubscriber.this.innerComplete(this);
        }

        public void onError(Throwable th) {
            CompletableMerge$CompletableMergeSubscriber.this.innerError(this, th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public CompletableMerge$CompletableMergeSubscriber(C8050c cVar, int i, boolean z) {
        this.downstream = cVar;
        this.maxConcurrency = i;
        this.delayErrors = z;
        lazySet(1);
    }

    public void dispose() {
        this.upstream.cancel();
        this.set.dispose();
    }

    public void innerComplete(MergeInnerObserver mergeInnerObserver) {
        this.set.mo19404c(mergeInnerObserver);
        if (decrementAndGet() == 0) {
            Throwable th = (Throwable) this.error.get();
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1);
        }
    }

    public void innerError(MergeInnerObserver mergeInnerObserver, Throwable th) {
        this.set.mo19404c(mergeInnerObserver);
        if (!this.delayErrors) {
            this.upstream.cancel();
            this.set.dispose();
            if (!this.error.addThrowable(th)) {
                C18981a.m32123b(th);
            } else if (getAndSet(0) > 0) {
                this.downstream.onError(this.error.terminate());
            }
        } else if (!this.error.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (decrementAndGet() == 0) {
            this.downstream.onError(this.error.terminate());
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1);
        }
    }

    public boolean isDisposed() {
        return this.set.f15781c;
    }

    public void onComplete() {
        if (decrementAndGet() != 0) {
            return;
        }
        if (((Throwable) this.error.get()) != null) {
            this.downstream.onError(this.error.terminate());
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (!this.delayErrors) {
            this.set.dispose();
            if (!this.error.addThrowable(th)) {
                C18981a.m32123b(th);
            } else if (getAndSet(0) > 0) {
                this.downstream.onError(this.error.terminate());
            }
        } else if (!this.error.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (decrementAndGet() == 0) {
            this.downstream.onError(this.error.terminate());
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            int i = this.maxConcurrency;
            if (i == Integer.MAX_VALUE) {
                subscription.request(Long.MAX_VALUE);
            } else {
                subscription.request((long) i);
            }
        }
    }

    public void onNext(C8052e eVar) {
        getAndIncrement();
        MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
        this.set.mo19403b(mergeInnerObserver);
        eVar.mo20607a(mergeInnerObserver);
    }
}
