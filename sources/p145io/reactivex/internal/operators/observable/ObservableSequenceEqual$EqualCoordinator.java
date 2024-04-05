package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.ArrayCompositeDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p248tp.C8065q;
import p287xp.C8336d;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSequenceEqual$EqualCoordinator */
final class ObservableSequenceEqual$EqualCoordinator<T> extends AtomicInteger implements Disposable {
    private static final long serialVersionUID = -6178010334400373240L;
    public volatile boolean cancelled;
    public final C8336d<? super T, ? super T> comparer;
    public final Observer<? super Boolean> downstream;
    public final C8065q<? extends T> first;
    public final C19186w<T>[] observers;
    public final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
    public final C8065q<? extends T> second;

    /* renamed from: v1 */
    public T f42761v1;

    /* renamed from: v2 */
    public T f42762v2;

    public ObservableSequenceEqual$EqualCoordinator(Observer<? super Boolean> observer, int i, C8065q<? extends T> qVar, C8065q<? extends T> qVar2, C8336d<? super T, ? super T> dVar) {
        this.downstream = observer;
        this.first = qVar;
        this.second = qVar2;
        this.comparer = dVar;
        C19186w<T>[] wVarArr = new C19186w[2];
        this.observers = wVarArr;
        wVarArr[0] = new C19186w<>(this, 0, i);
        wVarArr[1] = new C19186w<>(this, 1, i);
    }

    public void cancel(C19213a<T> aVar, C19213a<T> aVar2) {
        this.cancelled = true;
        aVar.clear();
        aVar2.clear();
    }

    public void dispose() {
        if (!this.cancelled) {
            this.cancelled = true;
            this.resources.dispose();
            if (getAndIncrement() == 0) {
                C19186w<T>[] wVarArr = this.observers;
                wVarArr[0].f42867c.clear();
                wVarArr[1].f42867c.clear();
            }
        }
    }

    public void drain() {
        Throwable th;
        Throwable th2;
        if (getAndIncrement() == 0) {
            C19186w<T>[] wVarArr = this.observers;
            C19186w<T> wVar = wVarArr[0];
            C19213a<T> aVar = wVar.f42867c;
            C19186w<T> wVar2 = wVarArr[1];
            C19213a<T> aVar2 = wVar2.f42867c;
            int i = 1;
            while (!this.cancelled) {
                boolean z = wVar.f42869e;
                if (!z || (th2 = wVar.f42870f) == null) {
                    boolean z2 = wVar2.f42869e;
                    if (!z2 || (th = wVar2.f42870f) == null) {
                        if (this.f42761v1 == null) {
                            this.f42761v1 = aVar.poll();
                        }
                        boolean z3 = this.f42761v1 == null;
                        if (this.f42762v2 == null) {
                            this.f42762v2 = aVar2.poll();
                        }
                        T t = this.f42762v2;
                        boolean z4 = t == null;
                        if (z && z2 && z3 && z4) {
                            this.downstream.onNext(Boolean.TRUE);
                            this.downstream.onComplete();
                            return;
                        } else if (!z || !z2 || z3 == z4) {
                            if (!z3 && !z4) {
                                try {
                                    C8336d<? super T, ? super T> dVar = this.comparer;
                                    T t2 = this.f42761v1;
                                    ((C12965a.C12966a) dVar).getClass();
                                    if (!C12965a.m20649a(t2, t)) {
                                        cancel(aVar, aVar2);
                                        this.downstream.onNext(Boolean.FALSE);
                                        this.downstream.onComplete();
                                        return;
                                    }
                                    this.f42761v1 = null;
                                    this.f42762v2 = null;
                                } catch (Throwable th3) {
                                    C19421p.m32940h0(th3);
                                    cancel(aVar, aVar2);
                                    this.downstream.onError(th3);
                                    return;
                                }
                            }
                            if ((z3 || z4) && (i = addAndGet(-i)) == 0) {
                                return;
                            }
                        } else {
                            cancel(aVar, aVar2);
                            this.downstream.onNext(Boolean.FALSE);
                            this.downstream.onComplete();
                            return;
                        }
                    } else {
                        cancel(aVar, aVar2);
                        this.downstream.onError(th);
                        return;
                    }
                } else {
                    cancel(aVar, aVar2);
                    this.downstream.onError(th2);
                    return;
                }
            }
            aVar.clear();
            aVar2.clear();
        }
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    public boolean setDisposable(Disposable disposable, int i) {
        return this.resources.setResource(i, disposable);
    }

    public void subscribe() {
        C19186w<T>[] wVarArr = this.observers;
        this.first.subscribe(wVarArr[0]);
        this.second.subscribe(wVarArr[1]);
    }
}
