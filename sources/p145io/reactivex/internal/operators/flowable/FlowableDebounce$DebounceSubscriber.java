package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.subscribers.C19258a;
import p248tp.C8056i;
import p287xp.C8339g;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber */
final class FlowableDebounce$DebounceSubscriber<T, U> extends AtomicLong implements C8056i<T>, Subscription {
    private static final long serialVersionUID = 6725975399620862591L;
    public final C8339g<? super T, ? extends C20023b<U>> debounceSelector;
    public final AtomicReference<Disposable> debouncer = new AtomicReference<>();
    public boolean done;
    public final C20024c<? super T> downstream;
    public volatile long index;
    public Subscription upstream;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber$a */
    public static final class C19099a<T, U> extends C19258a<U> {

        /* renamed from: c */
        public final FlowableDebounce$DebounceSubscriber<T, U> f42629c;

        /* renamed from: d */
        public final long f42630d;

        /* renamed from: e */
        public final T f42631e;

        /* renamed from: f */
        public boolean f42632f;

        /* renamed from: g */
        public final AtomicBoolean f42633g = new AtomicBoolean();

        public C19099a(FlowableDebounce$DebounceSubscriber<T, U> flowableDebounce$DebounceSubscriber, long j, T t) {
            this.f42629c = flowableDebounce$DebounceSubscriber;
            this.f42630d = j;
            this.f42631e = t;
        }

        /* renamed from: a */
        public final void mo70653a() {
            if (this.f42633g.compareAndSet(false, true)) {
                this.f42629c.emit(this.f42630d, this.f42631e);
            }
        }

        public final void onComplete() {
            if (!this.f42632f) {
                this.f42632f = true;
                mo70653a();
            }
        }

        public final void onError(Throwable th) {
            if (this.f42632f) {
                C18981a.m32123b(th);
                return;
            }
            this.f42632f = true;
            this.f42629c.onError(th);
        }

        public final void onNext(U u) {
            if (!this.f42632f) {
                this.f42632f = true;
                dispose();
                mo70653a();
            }
        }
    }

    public FlowableDebounce$DebounceSubscriber(C20024c<? super T> cVar, C8339g<? super T, ? extends C20023b<U>> gVar) {
        this.downstream = cVar;
        this.debounceSelector = gVar;
    }

    public void cancel() {
        this.upstream.cancel();
        DisposableHelper.dispose(this.debouncer);
    }

    public void emit(long j, T t) {
        if (j != this.index) {
            return;
        }
        if (get() != 0) {
            this.downstream.onNext(t);
            C19382n.m32774u0(this, 1);
            return;
        }
        cancel();
        this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            Disposable disposable = this.debouncer.get();
            if (!DisposableHelper.isDisposed(disposable)) {
                C19099a aVar = (C19099a) disposable;
                if (aVar != null) {
                    aVar.mo70653a();
                }
                DisposableHelper.dispose(this.debouncer);
                this.downstream.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        DisposableHelper.dispose(this.debouncer);
        this.downstream.onError(th);
    }

    public void onNext(T t) {
        boolean z;
        if (!this.done) {
            long j = this.index + 1;
            this.index = j;
            Disposable disposable = this.debouncer.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                Object apply = this.debounceSelector.apply(t);
                C12965a.m20650b(apply, "The publisher supplied is null");
                C20023b bVar = (C20023b) apply;
                C19099a aVar = new C19099a(this, j, t);
                AtomicReference<Disposable> atomicReference = this.debouncer;
                while (true) {
                    if (!atomicReference.compareAndSet(disposable, aVar)) {
                        if (atomicReference.get() != disposable) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    bVar.subscribe(aVar);
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                cancel();
                this.downstream.onError(th);
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.upstream, subscription)) {
            this.upstream = subscription;
            this.downstream.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            C19382n.m32703D(this, j);
        }
    }
}
