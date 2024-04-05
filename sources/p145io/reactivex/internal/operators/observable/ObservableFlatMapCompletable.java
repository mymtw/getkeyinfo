package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.observers.BasicIntQueueDisposable;
import p145io.reactivex.internal.util.AtomicThrowable;
import p248tp.C8050c;
import p248tp.C8052e;
import p248tp.C8065q;
import p287xp.C8339g;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapCompletable */
public final class ObservableFlatMapCompletable<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final C8339g<? super T, ? extends C8052e> f42745c;

    /* renamed from: d */
    public final boolean f42746d;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapCompletable$FlatMapCompletableMainObserver */
    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final Observer<? super T> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final C8339g<? super T, ? extends C8052e> mapper;
        public final C7091a set = new C7091a();
        public Disposable upstream;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver */
        public final class InnerObserver extends AtomicReference<Disposable> implements C8050c, Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            public InnerObserver() {
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.isDisposed((Disposable) get());
            }

            public void onComplete() {
                FlatMapCompletableMainObserver.this.innerComplete(this);
            }

            public void onError(Throwable th) {
                FlatMapCompletableMainObserver.this.innerError(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public FlatMapCompletableMainObserver(Observer<? super T> observer, C8339g<? super T, ? extends C8052e> gVar, boolean z) {
            this.downstream = observer;
            this.mapper = gVar;
            this.delayErrors = z;
            lazySet(1);
        }

        public void clear() {
        }

        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        public void innerComplete(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
            this.set.mo19404c(innerObserver);
            onComplete();
        }

        public void innerError(FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th) {
            this.set.mo19404c(innerObserver);
            onError(th);
        }

        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable terminate = this.errors.terminate();
                if (terminate != null) {
                    this.downstream.onError(terminate);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                C18981a.m32123b(th);
            } else if (!this.delayErrors) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(this.errors.terminate());
                }
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.mapper.apply(t);
                C12965a.m20650b(apply, "The mapper returned a null CompletableSource");
                C8052e eVar = (C8052e) apply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!this.disposed && this.set.mo19403b(innerObserver)) {
                    eVar.mo20607a(innerObserver);
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return null;
        }

        public int requestFusion(int i) {
            return i & 2;
        }
    }

    public ObservableFlatMapCompletable(C8065q<T> qVar, C8339g<? super T, ? extends C8052e> gVar, boolean z) {
        super(qVar);
        this.f42745c = gVar;
        this.f42746d = z;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f42793b.subscribe(new FlatMapCompletableMainObserver(observer, this.f42745c, this.f42746d));
    }
}
