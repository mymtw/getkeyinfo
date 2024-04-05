package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.ArrayCompositeDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p248tp.C8065q;
import p248tp.C8073u;
import p287xp.C8336d;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator */
final class ObservableSequenceEqualSingle$EqualCoordinator<T> extends AtomicInteger implements Disposable {
    private static final long serialVersionUID = -6178010334400373240L;
    public volatile boolean cancelled;
    public final C8336d<? super T, ? super T> comparer;
    public final C8073u<? super Boolean> downstream;
    public final C8065q<? extends T> first;
    public final C19187x<T>[] observers;
    public final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
    public final C8065q<? extends T> second;

    /* renamed from: v1 */
    public T f42763v1;

    /* renamed from: v2 */
    public T f42764v2;

    public ObservableSequenceEqualSingle$EqualCoordinator(C8073u<? super Boolean> uVar, int i, C8065q<? extends T> qVar, C8065q<? extends T> qVar2, C8336d<? super T, ? super T> dVar) {
        this.downstream = uVar;
        this.first = qVar;
        this.second = qVar2;
        this.comparer = dVar;
        C19187x<T>[] xVarArr = new C19187x[2];
        this.observers = xVarArr;
        xVarArr[0] = new C19187x<>(this, 0, i);
        xVarArr[1] = new C19187x<>(this, 1, i);
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
                C19187x<T>[] xVarArr = this.observers;
                xVarArr[0].f42872c.clear();
                xVarArr[1].f42872c.clear();
            }
        }
    }

    public void drain() {
        Throwable th;
        Throwable th2;
        if (getAndIncrement() == 0) {
            C19187x<T>[] xVarArr = this.observers;
            C19187x<T> xVar = xVarArr[0];
            C19213a<T> aVar = xVar.f42872c;
            C19187x<T> xVar2 = xVarArr[1];
            C19213a<T> aVar2 = xVar2.f42872c;
            int i = 1;
            while (!this.cancelled) {
                boolean z = xVar.f42874e;
                if (!z || (th2 = xVar.f42875f) == null) {
                    boolean z2 = xVar2.f42874e;
                    if (!z2 || (th = xVar2.f42875f) == null) {
                        if (this.f42763v1 == null) {
                            this.f42763v1 = aVar.poll();
                        }
                        boolean z3 = this.f42763v1 == null;
                        if (this.f42764v2 == null) {
                            this.f42764v2 = aVar2.poll();
                        }
                        T t = this.f42764v2;
                        boolean z4 = t == null;
                        if (z && z2 && z3 && z4) {
                            this.downstream.onSuccess(Boolean.TRUE);
                            return;
                        } else if (!z || !z2 || z3 == z4) {
                            if (!z3 && !z4) {
                                try {
                                    C8336d<? super T, ? super T> dVar = this.comparer;
                                    T t2 = this.f42763v1;
                                    ((C12965a.C12966a) dVar).getClass();
                                    if (!C12965a.m20649a(t2, t)) {
                                        cancel(aVar, aVar2);
                                        this.downstream.onSuccess(Boolean.FALSE);
                                        return;
                                    }
                                    this.f42763v1 = null;
                                    this.f42764v2 = null;
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
                            this.downstream.onSuccess(Boolean.FALSE);
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
        C19187x<T>[] xVarArr = this.observers;
        this.first.subscribe(xVarArr[0]);
        this.second.subscribe(xVarArr[1]);
    }
}
