package p145io.reactivex.internal.operators.observable;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.queue.SpscArrayQueue;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8061n;
import p248tp.C8065q;
import p287xp.C8339g;
import p503zp.C13968d;
import p503zp.C13972h;
import p503zp.C13973i;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMap */
public final class ObservableFlatMap<T, U> extends C19145a<T, U> {

    /* renamed from: c */
    public final C8339g<? super T, ? extends C8065q<? extends U>> f42740c;

    /* renamed from: d */
    public final boolean f42741d = false;

    /* renamed from: e */
    public final int f42742e = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: f */
    public final int f42743f;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver */
    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        public volatile boolean done;
        public int fusionMode;

        /* renamed from: id */
        public final long f42744id;
        public final MergeObserver<T, U> parent;
        public volatile C13973i<U> queue;

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j) {
            this.f42744id = j;
            this.parent = mergeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public void onError(Throwable th) {
            if (this.parent.errors.addThrowable(th)) {
                MergeObserver<T, U> mergeObserver = this.parent;
                if (!mergeObserver.delayErrors) {
                    mergeObserver.disposeAll();
                }
                this.done = true;
                this.parent.drain();
                return;
            }
            C18981a.m32123b(th);
        }

        public void onNext(U u) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u, this);
            } else {
                this.parent.drain();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof C13968d)) {
                C13968d dVar = (C13968d) disposable;
                int requestFusion = dVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    this.done = true;
                    this.parent.drain();
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver */
    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        public static final InnerObserver<?, ?>[] CANCELLED = new InnerObserver[0];
        public static final InnerObserver<?, ?>[] EMPTY = new InnerObserver[0];
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Observer<? super U> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public long lastId;
        public int lastIndex;
        public final C8339g<? super T, ? extends C8065q<? extends U>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<InnerObserver<?, ?>[]> observers;
        public volatile C13972h<U> queue;
        public Queue<C8065q<? extends U>> sources;
        public long uniqueId;
        public Disposable upstream;
        public int wip;

        public MergeObserver(Observer<? super U> observer, C8339g<? super T, ? extends C8065q<? extends U>> gVar, boolean z, int i, int i2) {
            this.downstream = observer;
            this.mapper = gVar;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        public boolean addInner(InnerObserver<T, U> innerObserver) {
            boolean z;
            do {
                InnerObserver<?, ?>[] innerObserverArr = (InnerObserver[]) this.observers.get();
                z = false;
                if (innerObserverArr != CANCELLED) {
                    int length = innerObserverArr.length;
                    InnerObserver[] innerObserverArr2 = new InnerObserver[(length + 1)];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                    innerObserverArr2[length] = innerObserver;
                    AtomicReference<InnerObserver<?, ?>[]> atomicReference = this.observers;
                    while (true) {
                        if (!atomicReference.compareAndSet(innerObserverArr, innerObserverArr2)) {
                            if (atomicReference.get() != innerObserverArr) {
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    innerObserver.dispose();
                    return false;
                }
            } while (!z);
            return true;
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = (Throwable) this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            disposeAll();
            Throwable terminate = this.errors.terminate();
            if (terminate != ExceptionHelper.f43031a) {
                this.downstream.onError(terminate);
            }
            return true;
        }

        public void dispose() {
            Throwable terminate;
            if (!this.cancelled) {
                this.cancelled = true;
                if (disposeAll() && (terminate = this.errors.terminate()) != null && terminate != ExceptionHelper.f43031a) {
                    C18981a.m32123b(terminate);
                }
            }
        }

        public boolean disposeAll() {
            InnerObserver<?, ?>[] innerObserverArr;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr2 = (InnerObserver[]) this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr3 = CANCELLED;
            if (innerObserverArr2 == innerObserverArr3 || (innerObserverArr = (InnerObserver[]) this.observers.getAndSet(innerObserverArr3)) == innerObserverArr3) {
                return false;
            }
            for (InnerObserver<?, ?> dispose : innerObserverArr) {
                dispose.dispose();
            }
            return true;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            int i;
            int i2;
            Observer<? super U> observer = this.downstream;
            int i3 = 1;
            while (!checkTerminate()) {
                C13972h<U> hVar = this.queue;
                int i4 = 0;
                if (hVar != null) {
                    while (!checkTerminate()) {
                        U poll = hVar.poll();
                        if (poll != null) {
                            observer.onNext(poll);
                            i4++;
                        }
                    }
                    return;
                }
                if (i4 == 0) {
                    boolean z = this.done;
                    C13972h<U> hVar2 = this.queue;
                    InnerObserver[] innerObserverArr = (InnerObserver[]) this.observers.get();
                    int length = innerObserverArr.length;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            i = this.sources.size();
                        }
                    } else {
                        i = 0;
                    }
                    if (!z || !((hVar2 == null || hVar2.isEmpty()) && length == 0 && i == 0)) {
                        if (length != 0) {
                            long j = this.lastId;
                            int i5 = this.lastIndex;
                            if (length <= i5 || innerObserverArr[i5].f42744id != j) {
                                if (length <= i5) {
                                    i5 = 0;
                                }
                                for (int i6 = 0; i6 < length && innerObserverArr[i5].f42744id != j; i6++) {
                                    i5++;
                                    if (i5 == length) {
                                        i5 = 0;
                                    }
                                }
                                this.lastIndex = i5;
                                this.lastId = innerObserverArr[i5].f42744id;
                            }
                            int i7 = 0;
                            while (i7 < length) {
                                if (!checkTerminate()) {
                                    InnerObserver innerObserver = innerObserverArr[i5];
                                    C13973i<U> iVar = innerObserver.queue;
                                    if (iVar != null) {
                                        while (true) {
                                            try {
                                                U poll2 = iVar.poll();
                                                if (poll2 == null) {
                                                    break;
                                                }
                                                observer.onNext(poll2);
                                                if (checkTerminate()) {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                C19421p.m32940h0(th);
                                                innerObserver.dispose();
                                                this.errors.addThrowable(th);
                                                if (!checkTerminate()) {
                                                    removeInner(innerObserver);
                                                    i4++;
                                                    i2 = i5 + 1;
                                                    if (i2 != length) {
                                                    }
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    boolean z2 = innerObserver.done;
                                    C13973i<U> iVar2 = innerObserver.queue;
                                    if (z2 && (iVar2 == null || iVar2.isEmpty())) {
                                        removeInner(innerObserver);
                                        if (!checkTerminate()) {
                                            i4++;
                                        } else {
                                            return;
                                        }
                                    }
                                    i2 = i5 + 1;
                                    if (i2 != length) {
                                        i7++;
                                    }
                                    i2 = 0;
                                    i7++;
                                } else {
                                    return;
                                }
                            }
                            this.lastIndex = i5;
                            this.lastId = innerObserverArr[i5].f42744id;
                        }
                        if (i4 == 0) {
                            i3 = addAndGet(-i3);
                            if (i3 == 0) {
                                return;
                            }
                        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                            subscribeMore(i4);
                        }
                    } else {
                        Throwable terminate = this.errors.terminate();
                        if (terminate == ExceptionHelper.f43031a) {
                            return;
                        }
                        if (terminate == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(terminate);
                            return;
                        }
                    }
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    subscribeMore(i4);
                }
            }
        }

        public boolean isDisposed() {
            return this.cancelled;
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                C18981a.m32123b(th);
            } else if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                C18981a.m32123b(th);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    Object apply = this.mapper.apply(t);
                    C12965a.m20650b(apply, "The mapper returned a null ObservableSource");
                    C8065q qVar = (C8065q) apply;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            int i = this.wip;
                            if (i == this.maxConcurrency) {
                                this.sources.offer(qVar);
                                return;
                            }
                            this.wip = i + 1;
                        }
                    }
                    subscribeInner(qVar);
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    this.upstream.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public void removeInner(InnerObserver<T, U> innerObserver) {
            boolean z;
            InnerObserver<?, ?>[] innerObserverArr;
            do {
                InnerObserver<?, ?>[] innerObserverArr2 = (InnerObserver[]) this.observers.get();
                int length = innerObserverArr2.length;
                if (length != 0) {
                    int i = -1;
                    z = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerObserverArr2[i2] == innerObserver) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerObserverArr = EMPTY;
                        } else {
                            InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[(length - 1)];
                            System.arraycopy(innerObserverArr2, 0, innerObserverArr3, 0, i);
                            System.arraycopy(innerObserverArr2, i + 1, innerObserverArr3, i, (length - i) - 1);
                            innerObserverArr = innerObserverArr3;
                        }
                        AtomicReference<InnerObserver<?, ?>[]> atomicReference = this.observers;
                        while (true) {
                            if (!atomicReference.compareAndSet(innerObserverArr2, innerObserverArr)) {
                                if (atomicReference.get() != innerObserverArr2) {
                                    continue;
                                    break;
                                }
                            } else {
                                z = true;
                                continue;
                                break;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!z);
        }

        public void subscribeInner(C8065q<? extends U> qVar) {
            C8065q<? extends U> poll;
            while (qVar instanceof Callable) {
                if (tryEmitScalar((Callable) qVar) && this.maxConcurrency != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                            z = true;
                        }
                    }
                    if (z) {
                        drain();
                        return;
                    }
                    qVar = poll;
                } else {
                    return;
                }
            }
            long j = this.uniqueId;
            this.uniqueId = 1 + j;
            InnerObserver innerObserver = new InnerObserver(this, j);
            if (addInner(innerObserver)) {
                qVar.subscribe(innerObserver);
            }
        }

        public void subscribeMore(int i) {
            while (true) {
                int i2 = i - 1;
                if (i != 0) {
                    synchronized (this) {
                        C8065q poll = this.sources.poll();
                        if (poll == null) {
                            this.wip--;
                        } else {
                            subscribeInner(poll);
                        }
                    }
                    i = i2;
                } else {
                    return;
                }
            }
            while (true) {
            }
        }

        public void tryEmit(U u, InnerObserver<T, U> innerObserver) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C13973i iVar = innerObserver.queue;
                if (iVar == null) {
                    iVar = new C19213a(this.bufferSize);
                    innerObserver.queue = iVar;
                }
                iVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.downstream.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            drainLoop();
        }

        public boolean tryEmitScalar(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C13972h<U> hVar = this.queue;
                    if (hVar == null) {
                        hVar = this.maxConcurrency == Integer.MAX_VALUE ? new C19213a<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                        this.queue = hVar;
                    }
                    if (!hVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.errors.addThrowable(th);
                drain();
                return true;
            }
        }
    }

    public ObservableFlatMap(C8061n nVar, C8339g gVar, int i) {
        super(nVar);
        this.f42740c = gVar;
        this.f42743f = i;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super U> observer) {
        boolean z;
        C8065q<T> qVar = this.f42793b;
        C8339g<? super T, ? extends C8065q<? extends U>> gVar = this.f42740c;
        if (qVar instanceof Callable) {
            z = true;
            try {
                Object call = ((Callable) qVar).call();
                if (call == null) {
                    EmptyDisposable.complete((Observer<?>) observer);
                } else {
                    try {
                        Object apply = gVar.apply(call);
                        C12965a.m20650b(apply, "The mapper returned a null ObservableSource");
                        C8065q qVar2 = (C8065q) apply;
                        if (qVar2 instanceof Callable) {
                            try {
                                Object call2 = ((Callable) qVar2).call();
                                if (call2 == null) {
                                    EmptyDisposable.complete((Observer<?>) observer);
                                } else {
                                    ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(observer, call2);
                                    observer.onSubscribe(observableScalarXMap$ScalarDisposable);
                                    observableScalarXMap$ScalarDisposable.run();
                                }
                            } catch (Throwable th) {
                                C19421p.m32940h0(th);
                                EmptyDisposable.error(th, (Observer<?>) observer);
                            }
                        } else {
                            qVar2.subscribe(observer);
                        }
                    } catch (Throwable th2) {
                        C19421p.m32940h0(th2);
                        EmptyDisposable.error(th2, (Observer<?>) observer);
                    }
                }
            } catch (Throwable th3) {
                C19421p.m32940h0(th3);
                EmptyDisposable.error(th3, (Observer<?>) observer);
            }
        } else {
            z = false;
        }
        if (!z) {
            this.f42793b.subscribe(new MergeObserver(observer, this.f42740c, this.f42741d, this.f42742e, this.f42743f));
        }
    }
}
