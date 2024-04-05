package p145io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8054g;
import p248tp.C8061n;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.e */
public final class C19108e<T> extends C8054g<T> {

    /* renamed from: c */
    public final C8061n<T> f42673c;

    /* renamed from: io.reactivex.internal.operators.flowable.e$a */
    public static final class C19109a<T> implements Observer<T>, Subscription {

        /* renamed from: b */
        public final C20024c<? super T> f42674b;

        /* renamed from: c */
        public Disposable f42675c;

        public C19109a(C20024c<? super T> cVar) {
            this.f42674b = cVar;
        }

        public final void cancel() {
            this.f42675c.dispose();
        }

        public final void onComplete() {
            this.f42674b.onComplete();
        }

        public final void onError(Throwable th) {
            this.f42674b.onError(th);
        }

        public final void onNext(T t) {
            this.f42674b.onNext(t);
        }

        public final void onSubscribe(Disposable disposable) {
            this.f42675c = disposable;
            this.f42674b.onSubscribe(this);
        }

        public final void request(long j) {
        }
    }

    public C19108e(C8061n<T> nVar) {
        this.f42673c = nVar;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42673c.subscribe(new C19109a(cVar));
    }
}
