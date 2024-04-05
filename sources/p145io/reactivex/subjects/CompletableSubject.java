package p145io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8048a;
import p248tp.C8050c;
import p736cq.C18981a;

/* renamed from: io.reactivex.subjects.CompletableSubject */
public final class CompletableSubject extends C8048a implements C8050c {

    /* renamed from: e */
    public static final CompletableDisposable[] f43067e = new CompletableDisposable[0];

    /* renamed from: f */
    public static final CompletableDisposable[] f43068f = new CompletableDisposable[0];

    /* renamed from: b */
    public final AtomicReference<CompletableDisposable[]> f43069b = new AtomicReference<>(f43067e);

    /* renamed from: c */
    public final AtomicBoolean f43070c = new AtomicBoolean();

    /* renamed from: d */
    public Throwable f43071d;

    /* renamed from: io.reactivex.subjects.CompletableSubject$CompletableDisposable */
    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        public final C8050c downstream;

        public CompletableDisposable(C8050c cVar, CompletableSubject completableSubject) {
            this.downstream = cVar;
            lazySet(completableSubject);
        }

        public void dispose() {
            CompletableSubject completableSubject = (CompletableSubject) getAndSet((Object) null);
            if (completableSubject != null) {
                completableSubject.mo71384e(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        boolean z;
        CompletableDisposable completableDisposable = new CompletableDisposable(cVar, this);
        cVar.onSubscribe(completableDisposable);
        while (true) {
            CompletableDisposable[] completableDisposableArr = this.f43069b.get();
            z = false;
            if (completableDisposableArr != f43068f) {
                int length = completableDisposableArr.length;
                CompletableDisposable[] completableDisposableArr2 = new CompletableDisposable[(length + 1)];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
                completableDisposableArr2[length] = completableDisposable;
                AtomicReference<CompletableDisposable[]> atomicReference = this.f43069b;
                while (true) {
                    if (!atomicReference.compareAndSet(completableDisposableArr, completableDisposableArr2)) {
                        if (atomicReference.get() != completableDisposableArr) {
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
            Throwable th = this.f43071d;
            if (th != null) {
                cVar.onError(th);
            } else {
                cVar.onComplete();
            }
        } else if (completableDisposable.isDisposed()) {
            mo71384e(completableDisposable);
        }
    }

    /* renamed from: e */
    public final void mo71384e(CompletableDisposable completableDisposable) {
        boolean z;
        CompletableDisposable[] completableDisposableArr;
        do {
            CompletableDisposable[] completableDisposableArr2 = this.f43069b.get();
            int length = completableDisposableArr2.length;
            if (length != 0) {
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (completableDisposableArr2[i2] == completableDisposable) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        completableDisposableArr = f43067e;
                    } else {
                        CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[(length - 1)];
                        System.arraycopy(completableDisposableArr2, 0, completableDisposableArr3, 0, i);
                        System.arraycopy(completableDisposableArr2, i + 1, completableDisposableArr3, i, (length - i) - 1);
                        completableDisposableArr = completableDisposableArr3;
                    }
                    AtomicReference<CompletableDisposable[]> atomicReference = this.f43069b;
                    while (true) {
                        if (!atomicReference.compareAndSet(completableDisposableArr2, completableDisposableArr)) {
                            if (atomicReference.get() != completableDisposableArr2) {
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
        if (this.f43070c.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : this.f43069b.getAndSet(f43068f)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    public final void onError(Throwable th) {
        if (th != null) {
            if (this.f43070c.compareAndSet(false, true)) {
                this.f43071d = th;
                for (CompletableDisposable completableDisposable : this.f43069b.getAndSet(f43068f)) {
                    completableDisposable.downstream.onError(th);
                }
                return;
            }
            C18981a.m32123b(th);
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.f43069b.get() == f43068f) {
            disposable.dispose();
        }
    }
}
