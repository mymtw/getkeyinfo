package p145io.reactivex.internal.operators.observable;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8061n;
import p248tp.C8065q;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.observable.ObservableCombineLatest */
public final class ObservableCombineLatest<T, R> extends C8061n<R> {

    /* renamed from: b */
    public final C8065q<? extends T>[] f42722b;

    /* renamed from: c */
    public final Iterable<? extends C8065q<? extends T>> f42723c;

    /* renamed from: d */
    public final C8339g<? super Object[], ? extends R> f42724d;

    /* renamed from: e */
    public final int f42725e;

    /* renamed from: f */
    public final boolean f42726f = false;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver */
    public static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        public final int index;
        public final LatestCoordinator<T, R> parent;

        public CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.parent = latestCoordinator;
            this.index = i;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        public void onNext(T t) {
            this.parent.innerNext(this.index, t);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator */
    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        public int active;
        public volatile boolean cancelled;
        public final C8339g<? super Object[], ? extends R> combiner;
        public int complete;
        public final boolean delayError;
        public volatile boolean done;
        public final Observer<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public Object[] latest;
        public final CombinerObserver<T, R>[] observers;
        public final C19213a<Object[]> queue;

        public LatestCoordinator(Observer<? super R> observer, C8339g<? super Object[], ? extends R> gVar, int i, int i2, boolean z) {
            this.downstream = observer;
            this.combiner = gVar;
            this.delayError = z;
            this.latest = new Object[i];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i];
            for (int i3 = 0; i3 < i; i3++) {
                combinerObserverArr[i3] = new CombinerObserver<>(this, i3);
            }
            this.observers = combinerObserverArr;
            this.queue = new C19213a<>(i2);
        }

        public void cancelSources() {
            for (CombinerObserver<T, R> dispose : this.observers) {
                dispose.dispose();
            }
        }

        public void clear(C19213a<?> aVar) {
            synchronized (this) {
                this.latest = null;
            }
            aVar.clear();
        }

        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear(this.queue);
                }
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                C19213a<Object[]> aVar = this.queue;
                Observer<? super R> observer = this.downstream;
                boolean z = this.delayError;
                int i = 1;
                while (!this.cancelled) {
                    if (z || this.errors.get() == null) {
                        boolean z2 = this.done;
                        Object[] poll = aVar.poll();
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            clear(aVar);
                            Throwable terminate = this.errors.terminate();
                            if (terminate == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(terminate);
                                return;
                            }
                        } else if (z3) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                Object apply = this.combiner.apply(poll);
                                C12965a.m20650b(apply, "The combiner returned a null value");
                                observer.onNext(apply);
                            } catch (Throwable th) {
                                C19421p.m32940h0(th);
                                this.errors.addThrowable(th);
                                cancelSources();
                                clear(aVar);
                                observer.onError(this.errors.terminate());
                                return;
                            }
                        }
                    } else {
                        cancelSources();
                        clear(aVar);
                        observer.onError(this.errors.terminate());
                        return;
                    }
                }
                clear(aVar);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            cancelSources();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            drain();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void innerComplete(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = r1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.complete     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.complete = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.done = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.cancelSources()
            L_0x0021:
                r3.drain()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.innerComplete(int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
            r0 = r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void innerError(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                boolean r0 = r0.addThrowable(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.delayError
                r0 = 1
                if (r4 == 0) goto L_0x002d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.latest     // Catch:{ all -> 0x002a }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x002a }
                if (r3 != 0) goto L_0x001a
                r3 = r0
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.complete     // Catch:{ all -> 0x002a }
                int r1 = r1 + r0
                r2.complete = r1     // Catch:{ all -> 0x002a }
                int r4 = r4.length     // Catch:{ all -> 0x002a }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.done = r0     // Catch:{ all -> 0x002a }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                r0 = r3
                goto L_0x002d
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            L_0x002d:
                if (r0 == 0) goto L_0x0032
                r2.cancelSources()
            L_0x0032:
                r2.drain()
                goto L_0x0039
            L_0x0036:
                p736cq.C18981a.m32123b(r4)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.innerError(int, java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            drain();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void innerNext(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.active     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.active = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                io.reactivex.internal.queue.a<java.lang.Object[]> r4 = r3.queue     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.offer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.drain()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.innerNext(int, java.lang.Object):void");
        }

        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(C8065q<? extends T>[] qVarArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i = 0; i < length && !this.done && !this.cancelled; i++) {
                qVarArr[i].subscribe(combinerObserverArr[i]);
            }
        }
    }

    public ObservableCombineLatest(C8065q[] qVarArr, List list, C8339g gVar, int i) {
        this.f42722b = qVarArr;
        this.f42723c = list;
        this.f42724d = gVar;
        this.f42725e = i;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super R> observer) {
        int i;
        C8065q<? extends T>[] qVarArr = this.f42722b;
        if (qVarArr == null) {
            qVarArr = new C8065q[8];
            i = 0;
            for (C8065q<? extends T> qVar : this.f42723c) {
                if (i == qVarArr.length) {
                    C8065q<? extends T>[] qVarArr2 = new C8065q[((i >> 2) + i)];
                    System.arraycopy(qVarArr, 0, qVarArr2, 0, i);
                    qVarArr = qVarArr2;
                }
                qVarArr[i] = qVar;
                i++;
            }
        } else {
            i = qVarArr.length;
        }
        int i2 = i;
        if (i2 == 0) {
            EmptyDisposable.complete((Observer<?>) observer);
            return;
        }
        new LatestCoordinator(observer, this.f42724d, i2, this.f42725e, this.f42726f).subscribe(qVarArr);
    }
}
