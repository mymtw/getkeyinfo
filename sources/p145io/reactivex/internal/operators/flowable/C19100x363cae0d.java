package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8056i;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber */
final class C19100x363cae0d<T> extends AtomicInteger implements C8056i<T>, Disposable {
    private static final long serialVersionUID = 8443155186132538303L;
    public final boolean delayErrors;
    public volatile boolean disposed;
    public final C8050c downstream;
    public final AtomicThrowable errors = new AtomicThrowable();
    public final C8339g<? super T, ? extends C8052e> mapper;
    public final int maxConcurrency;
    public final C7091a set = new C7091a();
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber$InnerObserver */
    public final class InnerObserver extends AtomicReference<Disposable> implements C8050c, Disposable {
        private static final long serialVersionUID = 8606673141535671828L;

        public InnerObserver() {
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }

        public void onComplete() {
            C19100x363cae0d.this.innerComplete(this);
        }

        public void onError(Throwable th) {
            C19100x363cae0d.this.innerError(this, th);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public C19100x363cae0d(C8050c cVar, C8339g<? super T, ? extends C8052e> gVar, boolean z, int i) {
        this.downstream = cVar;
        this.mapper = gVar;
        this.delayErrors = z;
        this.maxConcurrency = i;
        lazySet(1);
    }

    public void dispose() {
        this.disposed = true;
        this.upstream.cancel();
        this.set.dispose();
    }

    public void innerComplete(C19100x363cae0d<T>.InnerObserver innerObserver) {
        this.set.mo19404c(innerObserver);
        onComplete();
    }

    public void innerError(C19100x363cae0d<T>.InnerObserver innerObserver, Throwable th) {
        this.set.mo19404c(innerObserver);
        onError(th);
    }

    public boolean isDisposed() {
        return this.set.f15781c;
    }

    public void onComplete() {
        if (decrementAndGet() == 0) {
            Throwable terminate = this.errors.terminate();
            if (terminate != null) {
                this.downstream.onError(terminate);
            } else {
                this.downstream.onComplete();
            }
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1);
        }
    }

    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            C18981a.m32123b(th);
        } else if (!this.delayErrors) {
            dispose();
            if (getAndSet(0) > 0) {
                this.downstream.onError(this.errors.terminate());
            }
        } else if (decrementAndGet() == 0) {
            this.downstream.onError(this.errors.terminate());
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1);
        }
    }

    public void onNext(T t) {
        try {
            Object apply = this.mapper.apply(t);
            C12965a.m20650b(apply, "The mapper returned a null CompletableSource");
            C8052e eVar = (C8052e) apply;
            getAndIncrement();
            InnerObserver innerObserver = new InnerObserver();
            if (!this.disposed && this.set.mo19403b(innerObserver)) {
                eVar.mo20607a(innerObserver);
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.upstream.cancel();
            onError(th);
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
}
