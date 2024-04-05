package p765pr;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p248tp.C8061n;
import p736cq.C18981a;
import retrofit2.C20145v;
import retrofit2.adapter.rxjava2.HttpException;

/* renamed from: pr.a */
public final class C20058a<T> extends C8061n<T> {

    /* renamed from: b */
    public final C8061n<C20145v<T>> f44422b;

    /* renamed from: pr.a$a */
    public static class C20059a<R> implements Observer<C20145v<R>> {

        /* renamed from: b */
        public final Observer<? super R> f44423b;

        /* renamed from: c */
        public boolean f44424c;

        public C20059a(Observer<? super R> observer) {
            this.f44423b = observer;
        }

        public final void onComplete() {
            if (!this.f44424c) {
                this.f44423b.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (!this.f44424c) {
                this.f44423b.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C18981a.m32123b(assertionError);
        }

        public final void onNext(Object obj) {
            C20145v vVar = (C20145v) obj;
            if (vVar.mo74384a()) {
                this.f44423b.onNext(vVar.f44615b);
                return;
            }
            this.f44424c = true;
            HttpException httpException = new HttpException(vVar);
            try {
                this.f44423b.onError(httpException);
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(new CompositeException(httpException, th));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            this.f44423b.onSubscribe(disposable);
        }
    }

    public C20058a(C8061n<C20145v<T>> nVar) {
        this.f44422b = nVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f44422b.subscribe(new C20059a(observer));
    }
}
