package p145io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p736cq.C18981a;

/* renamed from: io.reactivex.subjects.PublishSubject */
public final class PublishSubject<T> extends C19257c<T> {

    /* renamed from: d */
    public static final PublishDisposable[] f43078d = new PublishDisposable[0];

    /* renamed from: e */
    public static final PublishDisposable[] f43079e = new PublishDisposable[0];

    /* renamed from: b */
    public final AtomicReference<PublishDisposable<T>[]> f43080b = new AtomicReference<>(f43079e);

    /* renamed from: c */
    public Throwable f43081c;

    /* renamed from: io.reactivex.subjects.PublishSubject$PublishDisposable */
    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        public final Observer<? super T> downstream;
        public final PublishSubject<T> parent;

        public PublishDisposable(Observer<? super T> observer, PublishSubject<T> publishSubject) {
            this.downstream = observer;
            this.parent = publishSubject;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.mo71387m(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                C18981a.m32123b(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        boolean z;
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        while (true) {
            PublishDisposable<T>[] publishDisposableArr = (PublishDisposable[]) this.f43080b.get();
            z = false;
            if (publishDisposableArr != f43078d) {
                int length = publishDisposableArr.length;
                PublishDisposable[] publishDisposableArr2 = new PublishDisposable[(length + 1)];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
                publishDisposableArr2[length] = publishDisposable;
                AtomicReference<PublishDisposable<T>[]> atomicReference = this.f43080b;
                while (true) {
                    if (!atomicReference.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                        if (atomicReference.get() != publishDisposableArr) {
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
            Throwable th = this.f43081c;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        } else if (publishDisposable.isDisposed()) {
            mo71387m(publishDisposable);
        }
    }

    /* renamed from: l */
    public final boolean mo71386l() {
        return ((PublishDisposable[]) this.f43080b.get()).length != 0;
    }

    /* renamed from: m */
    public final void mo71387m(PublishDisposable<T> publishDisposable) {
        boolean z;
        PublishDisposable[] publishDisposableArr;
        do {
            PublishDisposable<T>[] publishDisposableArr2 = (PublishDisposable[]) this.f43080b.get();
            if (publishDisposableArr2 != f43078d && publishDisposableArr2 != f43079e) {
                int length = publishDisposableArr2.length;
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (publishDisposableArr2[i2] == publishDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        publishDisposableArr = f43079e;
                    } else {
                        PublishDisposable[] publishDisposableArr3 = new PublishDisposable[(length - 1)];
                        System.arraycopy(publishDisposableArr2, 0, publishDisposableArr3, 0, i);
                        System.arraycopy(publishDisposableArr2, i + 1, publishDisposableArr3, i, (length - i) - 1);
                        publishDisposableArr = publishDisposableArr3;
                    }
                    AtomicReference<PublishDisposable<T>[]> atomicReference = this.f43080b;
                    while (true) {
                        if (!atomicReference.compareAndSet(publishDisposableArr2, publishDisposableArr)) {
                            if (atomicReference.get() != publishDisposableArr2) {
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
        PublishDisposable<T>[] publishDisposableArr = this.f43080b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f43078d;
        if (publishDisposableArr != publishDisposableArr2) {
            for (PublishDisposable onComplete : (PublishDisposable[]) this.f43080b.getAndSet(publishDisposableArr2)) {
                onComplete.onComplete();
            }
        }
    }

    public final void onError(Throwable th) {
        if (th != null) {
            PublishDisposable<T>[] publishDisposableArr = this.f43080b.get();
            PublishDisposable<T>[] publishDisposableArr2 = f43078d;
            if (publishDisposableArr == publishDisposableArr2) {
                C18981a.m32123b(th);
                return;
            }
            this.f43081c = th;
            for (PublishDisposable onError : (PublishDisposable[]) this.f43080b.getAndSet(publishDisposableArr2)) {
                onError.onError(th);
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    public final void onNext(T t) {
        if (t != null) {
            for (PublishDisposable onNext : (PublishDisposable[]) this.f43080b.get()) {
                onNext.onNext(t);
            }
            return;
        }
        throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.f43080b.get() == f43078d) {
            disposable.dispose();
        }
    }
}
