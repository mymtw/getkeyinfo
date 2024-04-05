package p145io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.observers.BasicIntQueueDisposable;
import p145io.reactivex.internal.queue.C19213a;
import p736cq.C18981a;

/* renamed from: io.reactivex.subjects.UnicastSubject */
public final class UnicastSubject<T> extends C19257c<T> {

    /* renamed from: b */
    public final C19213a<T> f43088b;

    /* renamed from: c */
    public final AtomicReference<Observer<? super T>> f43089c;

    /* renamed from: d */
    public final AtomicReference<Runnable> f43090d;

    /* renamed from: e */
    public final boolean f43091e;

    /* renamed from: f */
    public volatile boolean f43092f;

    /* renamed from: g */
    public volatile boolean f43093g;

    /* renamed from: h */
    public Throwable f43094h;

    /* renamed from: i */
    public final AtomicBoolean f43095i;

    /* renamed from: j */
    public final BasicIntQueueDisposable<T> f43096j;

    /* renamed from: k */
    public boolean f43097k;

    /* renamed from: io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable */
    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public UnicastQueueDisposable() {
        }

        public void clear() {
            UnicastSubject.this.f43088b.clear();
        }

        public void dispose() {
            if (!UnicastSubject.this.f43092f) {
                UnicastSubject.this.f43092f = true;
                UnicastSubject.this.mo71418l();
                UnicastSubject.this.f43089c.lazySet((Object) null);
                if (UnicastSubject.this.f43096j.getAndIncrement() == 0) {
                    UnicastSubject.this.f43089c.lazySet((Object) null);
                    UnicastSubject unicastSubject = UnicastSubject.this;
                    if (!unicastSubject.f43097k) {
                        unicastSubject.f43088b.clear();
                    }
                }
            }
        }

        public boolean isDisposed() {
            return UnicastSubject.this.f43092f;
        }

        public boolean isEmpty() {
            return UnicastSubject.this.f43088b.isEmpty();
        }

        public T poll() throws Exception {
            return UnicastSubject.this.f43088b.poll();
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.f43097k = true;
            return 2;
        }
    }

    public UnicastSubject(int i) {
        C12965a.m20651c(i, "capacityHint");
        this.f43088b = new C19213a<>(i);
        this.f43090d = new AtomicReference<>();
        this.f43091e = true;
        this.f43089c = new AtomicReference<>();
        this.f43095i = new AtomicBoolean();
        this.f43096j = new UnicastQueueDisposable();
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        if (this.f43095i.get() || !this.f43095i.compareAndSet(false, true)) {
            EmptyDisposable.error((Throwable) new IllegalStateException("Only a single observer allowed."), (Observer<?>) observer);
            return;
        }
        observer.onSubscribe(this.f43096j);
        this.f43089c.lazySet(observer);
        if (this.f43092f) {
            this.f43089c.lazySet((Object) null);
        } else {
            mo71419m();
        }
    }

    /* renamed from: l */
    public final void mo71418l() {
        boolean z;
        Runnable runnable = this.f43090d.get();
        if (runnable != null) {
            AtomicReference<Runnable> atomicReference = this.f43090d;
            while (true) {
                if (!atomicReference.compareAndSet(runnable, (Object) null)) {
                    if (atomicReference.get() != runnable) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                runnable.run();
            }
        }
    }

    /* renamed from: m */
    public final void mo71419m() {
        boolean z;
        boolean z2;
        if (this.f43096j.getAndIncrement() == 0) {
            Observer observer = this.f43089c.get();
            int i = 1;
            while (observer == null) {
                i = this.f43096j.addAndGet(-i);
                if (i != 0) {
                    observer = this.f43089c.get();
                } else {
                    return;
                }
            }
            if (this.f43097k) {
                C19213a<T> aVar = this.f43088b;
                boolean z3 = !this.f43091e;
                int i2 = 1;
                while (!this.f43092f) {
                    boolean z4 = this.f43093g;
                    if (z3 && z4) {
                        Throwable th = this.f43094h;
                        if (th != null) {
                            this.f43089c.lazySet((Object) null);
                            aVar.clear();
                            observer.onError(th);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            return;
                        }
                    }
                    observer.onNext(null);
                    if (z4) {
                        this.f43089c.lazySet((Object) null);
                        Throwable th2 = this.f43094h;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    } else {
                        i2 = this.f43096j.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                this.f43089c.lazySet((Object) null);
                return;
            }
            C19213a<T> aVar2 = this.f43088b;
            boolean z5 = !this.f43091e;
            boolean z6 = true;
            int i3 = 1;
            while (!this.f43092f) {
                boolean z7 = this.f43093g;
                T poll = this.f43088b.poll();
                boolean z8 = poll == null;
                if (z7) {
                    if (z5 && z6) {
                        Throwable th3 = this.f43094h;
                        if (th3 != null) {
                            this.f43089c.lazySet((Object) null);
                            aVar2.clear();
                            observer.onError(th3);
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            z6 = false;
                        } else {
                            return;
                        }
                    }
                    if (z8) {
                        this.f43089c.lazySet((Object) null);
                        Throwable th4 = this.f43094h;
                        if (th4 != null) {
                            observer.onError(th4);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                }
                if (z8) {
                    i3 = this.f43096j.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else {
                    observer.onNext(poll);
                }
            }
            this.f43089c.lazySet((Object) null);
            aVar2.clear();
        }
    }

    public final void onComplete() {
        if (!this.f43093g && !this.f43092f) {
            this.f43093g = true;
            mo71418l();
            mo71419m();
        }
    }

    public final void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.f43093g || this.f43092f) {
            C18981a.m32123b(th);
        } else {
            this.f43094h = th;
            this.f43093g = true;
            mo71418l();
            mo71419m();
        }
    }

    public final void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!this.f43093g && !this.f43092f) {
            this.f43088b.offer(t);
            mo71419m();
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.f43093g || this.f43092f) {
            disposable.dispose();
        }
    }

    public UnicastSubject(int i, Runnable runnable) {
        C12965a.m20651c(i, "capacityHint");
        this.f43088b = new C19213a<>(i);
        if (runnable != null) {
            this.f43090d = new AtomicReference<>(runnable);
            this.f43091e = true;
            this.f43089c = new AtomicReference<>();
            this.f43095i = new AtomicBoolean();
            this.f43096j = new UnicastQueueDisposable();
            return;
        }
        throw new NullPointerException("onTerminate");
    }
}
