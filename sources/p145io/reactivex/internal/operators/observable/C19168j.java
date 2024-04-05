package p145io.reactivex.internal.operators.observable;

import java.util.Iterator;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8061n;
import p313aq.C8537b;

/* renamed from: io.reactivex.internal.operators.observable.j */
public final class C19168j<T> extends C8061n<T> {

    /* renamed from: b */
    public final Iterable<? extends T> f42843b;

    /* renamed from: io.reactivex.internal.operators.observable.j$a */
    public static final class C19169a<T> extends C8537b<T> {

        /* renamed from: b */
        public final Observer<? super T> f42844b;

        /* renamed from: c */
        public final Iterator<? extends T> f42845c;

        /* renamed from: d */
        public volatile boolean f42846d;

        /* renamed from: e */
        public boolean f42847e;

        /* renamed from: f */
        public boolean f42848f;

        /* renamed from: g */
        public boolean f42849g;

        public C19169a(Observer<? super T> observer, Iterator<? extends T> it) {
            this.f42844b = observer;
            this.f42845c = it;
        }

        public final void clear() {
            this.f42848f = true;
        }

        public final void dispose() {
            this.f42846d = true;
        }

        public final boolean isDisposed() {
            return this.f42846d;
        }

        public final boolean isEmpty() {
            return this.f42848f;
        }

        public final T poll() {
            if (this.f42848f) {
                return null;
            }
            if (!this.f42849g) {
                this.f42849g = true;
            } else if (!this.f42845c.hasNext()) {
                this.f42848f = true;
                return null;
            }
            T next = this.f42845c.next();
            C12965a.m20650b(next, "The iterator returned a null value");
            return next;
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f42847e = true;
            return 1;
        }
    }

    public C19168j(Iterable<? extends T> iterable) {
        this.f42843b = iterable;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        try {
            Iterator<? extends T> it = this.f42843b.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete((Observer<?>) observer);
                    return;
                }
                C19169a aVar = new C19169a(observer, it);
                observer.onSubscribe(aVar);
                if (!aVar.f42847e) {
                    while (!aVar.f42846d) {
                        try {
                            Object next = aVar.f42845c.next();
                            C12965a.m20650b(next, "The iterator returned a null value");
                            aVar.f42844b.onNext(next);
                            if (!aVar.f42846d) {
                                try {
                                    if (!aVar.f42845c.hasNext()) {
                                        if (!aVar.f42846d) {
                                            aVar.f42844b.onComplete();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C19421p.m32940h0(th);
                                    aVar.f42844b.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C19421p.m32940h0(th2);
                            aVar.f42844b.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                C19421p.m32940h0(th3);
                EmptyDisposable.error(th3, (Observer<?>) observer);
            }
        } catch (Throwable th4) {
            C19421p.m32940h0(th4);
            EmptyDisposable.error(th4, (Observer<?>) observer);
        }
    }
}
