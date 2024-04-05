package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p248tp.C8054g;
import p248tp.C8056i;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableRefCount */
public final class FlowableRefCount<T> extends C8054g<T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableRefCount$RefConnection */
    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public boolean disconnectedEarly;
        public final FlowableRefCount<?> parent;
        public long subscriberCount;
        public Disposable timer;

        public RefConnection(FlowableRefCount<?> flowableRefCount) {
        }

        public void run() {
            throw null;
        }

        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.replace(this, disposable);
            throw null;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableRefCount$RefCountSubscriber */
    public static final class RefCountSubscriber<T> extends AtomicBoolean implements C8056i<T>, Subscription {
        private static final long serialVersionUID = -7419642935409022375L;
        public final RefConnection connection;
        public final C20024c<? super T> downstream;
        public final FlowableRefCount<T> parent;
        public Subscription upstream;

        public RefCountSubscriber(C20024c<? super T> cVar, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = cVar;
            this.connection = refConnection;
        }

        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                C18981a.m32123b(th);
                return;
            }
            throw null;
        }

        public void onNext(T t) {
            this.downstream.onNext(t);
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
}
