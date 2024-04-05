package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.observers.C19249d;
import p248tp.C8065q;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableDebounceTimed */
public final class ObservableDebounceTimed<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final long f42728c = 500;

    /* renamed from: d */
    public final TimeUnit f42729d;

    /* renamed from: e */
    public final C8066r f42730e;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceEmitter */
    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        public final long idx;
        public final AtomicBoolean once = new AtomicBoolean();
        public final C19138a<T> parent;
        public final T value;

        public DebounceEmitter(T t, long j, C19138a<T> aVar) {
            this.value = t;
            this.idx = j;
            this.parent = aVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void run() {
            if (this.once.compareAndSet(false, true)) {
                C19138a<T> aVar = this.parent;
                long j = this.idx;
                T t = this.value;
                if (j == aVar.f42737h) {
                    aVar.f42731b.onNext(t);
                    dispose();
                }
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDebounceTimed$a */
    public static final class C19138a<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f42731b;

        /* renamed from: c */
        public final long f42732c;

        /* renamed from: d */
        public final TimeUnit f42733d;

        /* renamed from: e */
        public final C8066r.C8069c f42734e;

        /* renamed from: f */
        public Disposable f42735f;

        /* renamed from: g */
        public Disposable f42736g;

        /* renamed from: h */
        public volatile long f42737h;

        /* renamed from: i */
        public boolean f42738i;

        public C19138a(C19249d dVar, long j, TimeUnit timeUnit, C8066r.C8069c cVar) {
            this.f42731b = dVar;
            this.f42732c = j;
            this.f42733d = timeUnit;
            this.f42734e = cVar;
        }

        public final void dispose() {
            this.f42735f.dispose();
            this.f42734e.dispose();
        }

        public final boolean isDisposed() {
            return this.f42734e.isDisposed();
        }

        public final void onComplete() {
            if (!this.f42738i) {
                this.f42738i = true;
                Disposable disposable = this.f42736g;
                if (disposable != null) {
                    disposable.dispose();
                }
                DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
                if (debounceEmitter != null) {
                    debounceEmitter.run();
                }
                this.f42731b.onComplete();
                this.f42734e.dispose();
            }
        }

        public final void onError(Throwable th) {
            if (this.f42738i) {
                C18981a.m32123b(th);
                return;
            }
            Disposable disposable = this.f42736g;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f42738i = true;
            this.f42731b.onError(th);
            this.f42734e.dispose();
        }

        public final void onNext(T t) {
            if (!this.f42738i) {
                long j = this.f42737h + 1;
                this.f42737h = j;
                Disposable disposable = this.f42736g;
                if (disposable != null) {
                    disposable.dispose();
                }
                DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
                this.f42736g = debounceEmitter;
                debounceEmitter.setResource(this.f42734e.mo20653b(debounceEmitter, this.f42732c, this.f42733d));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f42735f, disposable)) {
                this.f42735f = disposable;
                this.f42731b.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(C8065q qVar, C8066r rVar, TimeUnit timeUnit) {
        super(qVar);
        this.f42729d = timeUnit;
        this.f42730e = rVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new C19138a(new C19249d(observer), this.f42728c, this.f42729d, this.f42730e.mo20646b()));
    }
}
