package p145io.reactivex.internal.operators.flowable;

import com.etsy.android.lib.push.registration.C8830c;
import com.etsy.android.lib.push.registration.C8831d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p030bo.app.C4237u6;
import p145io.reactivex.BackpressureStrategy;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.MissingBackpressureException;
import p145io.reactivex.internal.disposables.CancellableDisposable;
import p145io.reactivex.internal.disposables.SequentialDisposable;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8054g;
import p248tp.C8055h;
import p287xp.C8338f;
import p503zp.C13972h;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate */
public final class FlowableCreate<T> extends C8054g<T> {

    /* renamed from: c */
    public final C8830c f42626c;

    /* renamed from: d */
    public final BackpressureStrategy f42627d;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter */
    public static abstract class BaseEmitter<T> extends AtomicLong implements C8055h<T>, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        public final C20024c<? super T> downstream;
        public final SequentialDisposable serial = new SequentialDisposable();

        public BaseEmitter(C20024c<? super T> cVar) {
            this.downstream = cVar;
        }

        public final void cancel() {
            this.serial.dispose();
            onUnsubscribed();
        }

        public void complete() {
            if (!isCancelled()) {
                try {
                    this.downstream.onComplete();
                } finally {
                    this.serial.dispose();
                }
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean error(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                this.serial.dispose();
                return true;
            } catch (Throwable th2) {
                this.serial.dispose();
                throw th2;
            }
        }

        public final boolean isCancelled() {
            return this.serial.isDisposed();
        }

        public void onComplete() {
            complete();
        }

        public final void onError(Throwable th) {
            if (!tryOnError(th)) {
                C18981a.m32123b(th);
            }
        }

        public abstract /* synthetic */ void onNext(T t);

        public void onRequested() {
        }

        public void onUnsubscribed() {
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(this, j);
                onRequested();
            }
        }

        public final long requested() {
            return get();
        }

        public final C8055h<T> serialize() {
            return new SerializedEmitter(this);
        }

        public final void setCancellable(C8338f fVar) {
            setDisposable(new CancellableDisposable(fVar));
        }

        public final void setDisposable(Disposable disposable) {
            this.serial.update(disposable);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        public boolean tryOnError(Throwable th) {
            return error(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$BufferAsyncEmitter */
    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        public volatile boolean done;
        public Throwable error;
        public final C19213a<T> queue;
        public final AtomicInteger wip = new AtomicInteger();

        public BufferAsyncEmitter(C20024c<? super T> cVar, int i) {
            super(cVar);
            this.queue = new C19213a<>(i);
        }

        public void drain() {
            int i;
            if (this.wip.getAndIncrement() == 0) {
                C20024c<? super T> cVar = this.downstream;
                C19213a<T> aVar = this.queue;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            aVar.clear();
                            return;
                        } else {
                            boolean z = this.done;
                            T poll = aVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable th = this.error;
                                if (th != null) {
                                    error(th);
                                    return;
                                } else {
                                    complete();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                cVar.onNext(poll);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            aVar.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean isEmpty = aVar.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                error(th2);
                                return;
                            } else {
                                complete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C19382n.m32774u0(this, j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            if (!this.done && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.queue.offer(t);
                drain();
            }
        }

        public void onRequested() {
            drain();
        }

        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean tryOnError(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$DropAsyncEmitter */
    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public DropAsyncEmitter(C20024c<? super T> cVar) {
            super(cVar);
        }

        public void onOverflow() {
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$ErrorAsyncEmitter */
    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        public ErrorAsyncEmitter(C20024c<? super T> cVar) {
            super(cVar);
        }

        public void onOverflow() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$LatestAsyncEmitter */
    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        public volatile boolean done;
        public Throwable error;
        public final AtomicReference<T> queue = new AtomicReference<>();
        public final AtomicInteger wip = new AtomicInteger();

        public LatestAsyncEmitter(C20024c<? super T> cVar) {
            super(cVar);
        }

        public void drain() {
            int i;
            boolean z;
            if (this.wip.getAndIncrement() == 0) {
                C20024c<? super T> cVar = this.downstream;
                AtomicReference<T> atomicReference = this.queue;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        z = false;
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        } else {
                            boolean z2 = this.done;
                            T andSet = atomicReference.getAndSet((Object) null);
                            boolean z3 = andSet == null;
                            if (z2 && z3) {
                                Throwable th = this.error;
                                if (th != null) {
                                    error(th);
                                    return;
                                } else {
                                    complete();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                cVar.onNext(andSet);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        }
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                error(th2);
                                return;
                            } else {
                                complete();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C19382n.m32774u0(this, j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            if (!this.done && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.queue.set(t);
                drain();
            }
        }

        public void onRequested() {
            drain();
        }

        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet((Object) null);
            }
        }

        public boolean tryOnError(Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$MissingEmitter */
    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public MissingEmitter(C20024c<? super T> cVar) {
            super(cVar);
        }

        public void onNext(T t) {
            long j;
            if (!isCancelled()) {
                if (t != null) {
                    this.downstream.onNext(t);
                    do {
                        j = get();
                        if (j == 0 || compareAndSet(j, j - 1)) {
                            return;
                        }
                        j = get();
                        return;
                    } while (compareAndSet(j, j - 1));
                    return;
                }
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$NoOverflowBaseAsyncEmitter */
    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public NoOverflowBaseAsyncEmitter(C20024c<? super T> cVar) {
            super(cVar);
        }

        public final void onNext(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.downstream.onNext(t);
                    C19382n.m32774u0(this, 1);
                } else {
                    onOverflow();
                }
            }
        }

        public abstract void onOverflow();
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$SerializedEmitter */
    public static final class SerializedEmitter<T> extends AtomicInteger implements C8055h<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final BaseEmitter<T> emitter;
        public final AtomicThrowable error = new AtomicThrowable();
        public final C13972h<T> queue = new C19213a(16);

        public SerializedEmitter(BaseEmitter<T> baseEmitter) {
            this.emitter = baseEmitter;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            BaseEmitter<T> baseEmitter = this.emitter;
            C13972h<T> hVar = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            int i = 1;
            while (!baseEmitter.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    hVar.clear();
                    baseEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.done;
                T poll = hVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    baseEmitter.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    baseEmitter.onNext(poll);
                }
            }
            hVar.clear();
        }

        public boolean isCancelled() {
            return this.emitter.isCancelled();
        }

        public void onComplete() {
            if (!this.emitter.isCancelled() && !this.done) {
                this.done = true;
                drain();
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C18981a.m32123b(th);
            }
        }

        public void onNext(T t) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C13972h<T> hVar = this.queue;
                    synchronized (hVar) {
                        hVar.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.emitter.onNext(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        public long requested() {
            return this.emitter.requested();
        }

        public C8055h<T> serialize() {
            return this;
        }

        public void setCancellable(C8338f fVar) {
            this.emitter.setCancellable(fVar);
        }

        public void setDisposable(Disposable disposable) {
            this.emitter.setDisposable(disposable);
        }

        public String toString() {
            return this.emitter.toString();
        }

        public boolean tryOnError(Throwable th) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$a */
    public static /* synthetic */ class C19098a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.reactivex.BackpressureStrategy[] r0 = p145io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42628a = r0
                io.reactivex.BackpressureStrategy r1 = p145io.reactivex.BackpressureStrategy.MISSING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42628a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.reactivex.BackpressureStrategy r1 = p145io.reactivex.BackpressureStrategy.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42628a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.reactivex.BackpressureStrategy r1 = p145io.reactivex.BackpressureStrategy.DROP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42628a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.reactivex.BackpressureStrategy r1 = p145io.reactivex.BackpressureStrategy.LATEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.flowable.FlowableCreate.C19098a.<clinit>():void");
        }
    }

    public FlowableCreate(C8830c cVar, BackpressureStrategy backpressureStrategy) {
        this.f42626c = cVar;
        this.f42627d = backpressureStrategy;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        int i = C19098a.f42628a[this.f42627d.ordinal()];
        BaseEmitter bufferAsyncEmitter = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new BufferAsyncEmitter(cVar, C8054g.f17572b) : new LatestAsyncEmitter(cVar) : new DropAsyncEmitter(cVar) : new ErrorAsyncEmitter(cVar) : new MissingEmitter(cVar);
        cVar.onSubscribe(bufferAsyncEmitter);
        try {
            C8830c cVar2 = this.f42626c;
            boolean z = cVar2.f19420a;
            C8831d dVar = cVar2.f19421b;
            C19383o.m32797g(dVar, "this$0");
            if (z) {
                dVar.f19422a.deleteToken();
            }
            dVar.f19422a.getToken().mo69656c(new C4237u6(bufferAsyncEmitter, 3));
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            bufferAsyncEmitter.onError(th);
        }
    }
}
