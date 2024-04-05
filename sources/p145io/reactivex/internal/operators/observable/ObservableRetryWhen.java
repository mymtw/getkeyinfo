package p145io.reactivex.internal.operators.observable;

import com.etsy.android.lib.push.registration.C8839l;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.util.AtomicThrowable;
import p145io.reactivex.subjects.C19257c;
import p248tp.C8061n;
import p248tp.C8065q;
import p287xp.C8339g;
import p514bk.C14088a;

/* renamed from: io.reactivex.internal.operators.observable.ObservableRetryWhen */
public final class ObservableRetryWhen<T> extends C19145a<T, T> {

    /* renamed from: c */
    public final C8339g<? super C8061n<Throwable>, ? extends C8065q<?>> f42756c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver */
    public static final class RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 802743776666017014L;
        public volatile boolean active;
        public final Observer<? super T> downstream;
        public final AtomicThrowable error = new AtomicThrowable();
        public final RepeatWhenObserver<T>.InnerRepeatObserver inner = new InnerRepeatObserver();
        public final C19257c<Throwable> signaller;
        public final C8065q<T> source;
        public final AtomicReference<Disposable> upstream = new AtomicReference<>();
        public final AtomicInteger wip = new AtomicInteger();

        /* renamed from: io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver$InnerRepeatObserver */
        public final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public InnerRepeatObserver() {
            }

            public void onComplete() {
                RepeatWhenObserver.this.innerComplete();
            }

            public void onError(Throwable th) {
                RepeatWhenObserver.this.innerError(th);
            }

            public void onNext(Object obj) {
                RepeatWhenObserver.this.innerNext();
            }

            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public RepeatWhenObserver(Observer<? super T> observer, C19257c<Throwable> cVar, C8065q<T> qVar) {
            this.downstream = observer;
            this.signaller = cVar;
            this.source = qVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.inner);
        }

        public void innerComplete() {
            DisposableHelper.dispose(this.upstream);
            C14088a.m21789r(this.downstream, this, this.error);
        }

        public void innerError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            C14088a.m21791t(this.downstream, th, this, this.error);
        }

        public void innerNext() {
            subscribeNext();
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        public void onComplete() {
            DisposableHelper.dispose(this.inner);
            C14088a.m21789r(this.downstream, this, this.error);
        }

        public void onError(Throwable th) {
            DisposableHelper.replace(this.upstream, (Disposable) null);
            this.active = false;
            this.signaller.onNext(th);
        }

        public void onNext(T t) {
            C14088a.m21793v(this.downstream, t, this, this.error);
        }

        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.upstream, disposable);
        }

        public void subscribeNext() {
            if (this.wip.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.subscribe(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public ObservableRetryWhen(C8061n nVar, C8839l lVar) {
        super(nVar);
        this.f42756c = lVar;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [io.reactivex.subjects.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20638h(p145io.reactivex.Observer<? super T> r5) {
        /*
            r4 = this;
            io.reactivex.subjects.PublishSubject r0 = new io.reactivex.subjects.PublishSubject
            r0.<init>()
            boolean r1 = r0 instanceof p145io.reactivex.subjects.C19256b
            if (r1 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            io.reactivex.subjects.b r1 = new io.reactivex.subjects.b
            r1.<init>(r0)
            r0 = r1
        L_0x0010:
            xp.g<? super tp.n<java.lang.Throwable>, ? extends tp.q<?>> r1 = r4.f42756c     // Catch:{ all -> 0x0030 }
            java.lang.Object r1 = r1.apply(r0)     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "The handler returned a null ObservableSource"
            p145io.reactivex.internal.functions.C12965a.m20650b(r1, r2)     // Catch:{ all -> 0x0030 }
            tp.q r1 = (p248tp.C8065q) r1     // Catch:{ all -> 0x0030 }
            io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver r2 = new io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver
            tp.q<T> r3 = r4.f42793b
            r2.<init>(r5, r0, r3)
            r5.onSubscribe(r2)
            io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver<T>$InnerRepeatObserver r5 = r2.inner
            r1.subscribe(r5)
            r2.subscribeNext()
            return
        L_0x0030:
            r0 = move-exception
            kotlin.reflect.C19421p.m32940h0(r0)
            p145io.reactivex.internal.disposables.EmptyDisposable.error((java.lang.Throwable) r0, (p145io.reactivex.Observer<?>) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservableRetryWhen.mo20638h(io.reactivex.Observer):void");
    }
}
