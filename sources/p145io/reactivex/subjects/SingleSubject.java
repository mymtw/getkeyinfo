package p145io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8071s;
import p248tp.C8073u;
import p736cq.C18981a;

/* renamed from: io.reactivex.subjects.SingleSubject */
public final class SingleSubject<T> extends C8071s<T> implements C8073u<T> {

    /* renamed from: f */
    public static final SingleDisposable[] f43082f = new SingleDisposable[0];

    /* renamed from: g */
    public static final SingleDisposable[] f43083g = new SingleDisposable[0];

    /* renamed from: b */
    public final AtomicReference<SingleDisposable<T>[]> f43084b = new AtomicReference<>(f43082f);

    /* renamed from: c */
    public final AtomicBoolean f43085c = new AtomicBoolean();

    /* renamed from: d */
    public T f43086d;

    /* renamed from: e */
    public Throwable f43087e;

    /* renamed from: io.reactivex.subjects.SingleSubject$SingleDisposable */
    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        public final C8073u<? super T> downstream;

        public SingleDisposable(C8073u<? super T> uVar, SingleSubject<T> singleSubject) {
            this.downstream = uVar;
            lazySet(singleSubject);
        }

        public void dispose() {
            SingleSubject singleSubject = (SingleSubject) getAndSet((Object) null);
            if (singleSubject != null) {
                singleSubject.mo71417m(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        boolean z;
        SingleDisposable singleDisposable = new SingleDisposable(uVar, this);
        uVar.onSubscribe(singleDisposable);
        while (true) {
            SingleDisposable<T>[] singleDisposableArr = (SingleDisposable[]) this.f43084b.get();
            z = false;
            if (singleDisposableArr != f43083g) {
                int length = singleDisposableArr.length;
                SingleDisposable[] singleDisposableArr2 = new SingleDisposable[(length + 1)];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
                singleDisposableArr2[length] = singleDisposable;
                AtomicReference<SingleDisposable<T>[]> atomicReference = this.f43084b;
                while (true) {
                    if (!atomicReference.compareAndSet(singleDisposableArr, singleDisposableArr2)) {
                        if (atomicReference.get() != singleDisposableArr) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
                if (z) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Throwable th = this.f43087e;
            if (th != null) {
                uVar.onError(th);
            } else {
                uVar.onSuccess(this.f43086d);
            }
        } else if (singleDisposable.isDisposed()) {
            mo71417m(singleDisposable);
        }
    }

    /* renamed from: m */
    public final void mo71417m(SingleDisposable<T> singleDisposable) {
        boolean z;
        SingleDisposable[] singleDisposableArr;
        do {
            SingleDisposable<T>[] singleDisposableArr2 = (SingleDisposable[]) this.f43084b.get();
            int length = singleDisposableArr2.length;
            if (length != 0) {
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (singleDisposableArr2[i2] == singleDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        singleDisposableArr = f43082f;
                    } else {
                        SingleDisposable[] singleDisposableArr3 = new SingleDisposable[(length - 1)];
                        System.arraycopy(singleDisposableArr2, 0, singleDisposableArr3, 0, i);
                        System.arraycopy(singleDisposableArr2, i + 1, singleDisposableArr3, i, (length - i) - 1);
                        singleDisposableArr = singleDisposableArr3;
                    }
                    AtomicReference<SingleDisposable<T>[]> atomicReference = this.f43084b;
                    while (true) {
                        if (!atomicReference.compareAndSet(singleDisposableArr2, singleDisposableArr)) {
                            if (atomicReference.get() != singleDisposableArr2) {
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

    public final void onError(Throwable th) {
        if (th != null) {
            if (this.f43085c.compareAndSet(false, true)) {
                this.f43087e = th;
                for (SingleDisposable singleDisposable : (SingleDisposable[]) this.f43084b.getAndSet(f43083g)) {
                    singleDisposable.downstream.onError(th);
                }
                return;
            }
            C18981a.m32123b(th);
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.f43084b.get() == f43083g) {
            disposable.dispose();
        }
    }

    public final void onSuccess(T t) {
        if (t != null) {
            if (this.f43085c.compareAndSet(false, true)) {
                this.f43086d = t;
                for (SingleDisposable singleDisposable : (SingleDisposable[]) this.f43084b.getAndSet(f43083g)) {
                    singleDisposable.downstream.onSuccess(t);
                }
                return;
            }
            return;
        }
        throw new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
}
