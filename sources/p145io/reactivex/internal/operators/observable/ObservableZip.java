package p145io.reactivex.internal.operators.observable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.queue.C19213a;
import p248tp.C8061n;
import p248tp.C8065q;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.observable.ObservableZip */
public final class ObservableZip<T, R> extends C8061n<R> {

    /* renamed from: b */
    public final C8065q<? extends T>[] f42783b;

    /* renamed from: c */
    public final Iterable<? extends C8065q<? extends T>> f42784c = null;

    /* renamed from: d */
    public final C8339g<? super Object[], ? extends R> f42785d;

    /* renamed from: e */
    public final int f42786e;

    /* renamed from: f */
    public final boolean f42787f;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public final Observer<? super R> downstream;
        public final C19144a<T, R>[] observers;
        public final T[] row;
        public final C8339g<? super Object[], ? extends R> zipper;

        public ZipCoordinator(Observer<? super R> observer, C8339g<? super Object[], ? extends R> gVar, int i, boolean z) {
            this.downstream = observer;
            this.zipper = gVar;
            this.observers = new C19144a[i];
            this.row = new Object[i];
            this.delayError = z;
        }

        public void cancel() {
            clear();
            cancelSources();
        }

        public void cancelSources() {
            for (C19144a<T, R> aVar : this.observers) {
                DisposableHelper.dispose(aVar.f42792f);
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, Observer<? super R> observer, boolean z3, C19144a<?, ?> aVar) {
            if (this.cancelled) {
                cancel();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = aVar.f42791e;
                    if (th != null) {
                        this.cancelled = true;
                        cancel();
                        observer.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.cancelled = true;
                        cancel();
                        observer.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = aVar.f42791e;
                    this.cancelled = true;
                    cancel();
                    if (th2 != null) {
                        observer.onError(th2);
                    } else {
                        observer.onComplete();
                    }
                    return true;
                }
            }
        }

        public void clear() {
            for (C19144a<T, R> aVar : this.observers) {
                aVar.f42789c.clear();
            }
        }

        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear();
                }
            }
        }

        public void drain() {
            Throwable th;
            if (getAndIncrement() == 0) {
                C19144a<T, R>[] aVarArr = this.observers;
                Observer<? super R> observer = this.downstream;
                T[] tArr = this.row;
                boolean z = this.delayError;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C19144a<T, R> aVar : aVarArr) {
                        if (tArr[i3] == null) {
                            boolean z2 = aVar.f42790d;
                            T poll = aVar.f42789c.poll();
                            boolean z3 = poll == null;
                            if (!checkTerminated(z2, z3, observer, z, aVar)) {
                                if (!z3) {
                                    tArr[i3] = poll;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (aVar.f42790d && !z && (th = aVar.f42791e) != null) {
                            this.cancelled = true;
                            cancel();
                            observer.onError(th);
                            return;
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            Object apply = this.zipper.apply(tArr.clone());
                            C12965a.m20650b(apply, "The zipper returned a null value");
                            observer.onNext(apply);
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th2) {
                            C19421p.m32940h0(th2);
                            cancel();
                            observer.onError(th2);
                            return;
                        }
                    }
                }
            }
        }

        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(C8065q<? extends T>[] qVarArr, int i) {
            C19144a<T, R>[] aVarArr = this.observers;
            int length = aVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                aVarArr[i2] = new C19144a<>(this, i);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
                qVarArr[i3].subscribe(aVarArr[i3]);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableZip$a */
    public static final class C19144a<T, R> implements Observer<T> {

        /* renamed from: b */
        public final ZipCoordinator<T, R> f42788b;

        /* renamed from: c */
        public final C19213a<T> f42789c;

        /* renamed from: d */
        public volatile boolean f42790d;

        /* renamed from: e */
        public Throwable f42791e;

        /* renamed from: f */
        public final AtomicReference<Disposable> f42792f = new AtomicReference<>();

        public C19144a(ZipCoordinator<T, R> zipCoordinator, int i) {
            this.f42788b = zipCoordinator;
            this.f42789c = new C19213a<>(i);
        }

        public final void onComplete() {
            this.f42790d = true;
            this.f42788b.drain();
        }

        public final void onError(Throwable th) {
            this.f42791e = th;
            this.f42790d = true;
            this.f42788b.drain();
        }

        public final void onNext(T t) {
            this.f42789c.offer(t);
            this.f42788b.drain();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f42792f, disposable);
        }
    }

    public ObservableZip(C8065q[] qVarArr, Functions.C12956a aVar, int i) {
        this.f42783b = qVarArr;
        this.f42785d = aVar;
        this.f42786e = i;
        this.f42787f = false;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super R> observer) {
        int i;
        C8065q<? extends T>[] qVarArr = this.f42783b;
        if (qVarArr == null) {
            qVarArr = new C8065q[8];
            i = 0;
            for (C8065q<? extends T> qVar : this.f42784c) {
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
        if (i == 0) {
            EmptyDisposable.complete((Observer<?>) observer);
        } else {
            new ZipCoordinator(observer, this.f42785d, i, this.f42787f).subscribe(qVarArr, this.f42786e);
        }
    }
}
