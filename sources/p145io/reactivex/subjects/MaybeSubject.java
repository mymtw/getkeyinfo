package p145io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8057j;
import p248tp.C8058k;
import p736cq.C18981a;

/* renamed from: io.reactivex.subjects.MaybeSubject */
public final class MaybeSubject<T> extends C8057j<T> implements C8058k<T> {

    /* renamed from: f */
    public static final MaybeDisposable[] f43072f = new MaybeDisposable[0];

    /* renamed from: g */
    public static final MaybeDisposable[] f43073g = new MaybeDisposable[0];

    /* renamed from: b */
    public final AtomicReference<MaybeDisposable<T>[]> f43074b = new AtomicReference<>(f43072f);

    /* renamed from: c */
    public final AtomicBoolean f43075c = new AtomicBoolean();

    /* renamed from: d */
    public T f43076d;

    /* renamed from: e */
    public Throwable f43077e;

    /* renamed from: io.reactivex.subjects.MaybeSubject$MaybeDisposable */
    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        public final C8058k<? super T> downstream;

        public MaybeDisposable(C8058k<? super T> kVar, MaybeSubject<T> maybeSubject) {
            this.downstream = kVar;
            lazySet(maybeSubject);
        }

        public void dispose() {
            MaybeSubject maybeSubject = (MaybeSubject) getAndSet((Object) null);
            if (maybeSubject != null) {
                maybeSubject.mo71385c(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* renamed from: b */
    public final void mo20625b(C8058k<? super T> kVar) {
        boolean z;
        MaybeDisposable maybeDisposable = new MaybeDisposable(kVar, this);
        kVar.onSubscribe(maybeDisposable);
        while (true) {
            MaybeDisposable<T>[] maybeDisposableArr = (MaybeDisposable[]) this.f43074b.get();
            z = false;
            if (maybeDisposableArr != f43073g) {
                int length = maybeDisposableArr.length;
                MaybeDisposable[] maybeDisposableArr2 = new MaybeDisposable[(length + 1)];
                System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
                maybeDisposableArr2[length] = maybeDisposable;
                AtomicReference<MaybeDisposable<T>[]> atomicReference = this.f43074b;
                while (true) {
                    if (!atomicReference.compareAndSet(maybeDisposableArr, maybeDisposableArr2)) {
                        if (atomicReference.get() != maybeDisposableArr) {
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
            Throwable th = this.f43077e;
            if (th != null) {
                kVar.onError(th);
                return;
            }
            T t = this.f43076d;
            if (t == null) {
                kVar.onComplete();
            } else {
                kVar.onSuccess(t);
            }
        } else if (maybeDisposable.isDisposed()) {
            mo71385c(maybeDisposable);
        }
    }

    /* renamed from: c */
    public final void mo71385c(MaybeDisposable<T> maybeDisposable) {
        boolean z;
        MaybeDisposable[] maybeDisposableArr;
        do {
            MaybeDisposable<T>[] maybeDisposableArr2 = (MaybeDisposable[]) this.f43074b.get();
            int length = maybeDisposableArr2.length;
            if (length != 0) {
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (maybeDisposableArr2[i2] == maybeDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        maybeDisposableArr = f43072f;
                    } else {
                        MaybeDisposable[] maybeDisposableArr3 = new MaybeDisposable[(length - 1)];
                        System.arraycopy(maybeDisposableArr2, 0, maybeDisposableArr3, 0, i);
                        System.arraycopy(maybeDisposableArr2, i + 1, maybeDisposableArr3, i, (length - i) - 1);
                        maybeDisposableArr = maybeDisposableArr3;
                    }
                    AtomicReference<MaybeDisposable<T>[]> atomicReference = this.f43074b;
                    while (true) {
                        if (!atomicReference.compareAndSet(maybeDisposableArr2, maybeDisposableArr)) {
                            if (atomicReference.get() != maybeDisposableArr2) {
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

    public final void onComplete() {
        if (this.f43075c.compareAndSet(false, true)) {
            for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f43074b.getAndSet(f43073g)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    public final void onError(Throwable th) {
        if (th != null) {
            if (this.f43075c.compareAndSet(false, true)) {
                this.f43077e = th;
                for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f43074b.getAndSet(f43073g)) {
                    maybeDisposable.downstream.onError(th);
                }
                return;
            }
            C18981a.m32123b(th);
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.f43074b.get() == f43073g) {
            disposable.dispose();
        }
    }

    public final void onSuccess(T t) {
        if (t != null) {
            if (this.f43075c.compareAndSet(false, true)) {
                this.f43076d = t;
                for (MaybeDisposable maybeDisposable : (MaybeDisposable[]) this.f43074b.getAndSet(f43073g)) {
                    maybeDisposable.downstream.onSuccess(t);
                }
                return;
            }
            return;
        }
        throw new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
}
