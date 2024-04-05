package p765pr;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p248tp.C8061n;
import p736cq.C18981a;
import retrofit2.C20145v;

/* renamed from: pr.e */
public final class C20065e<T> extends C8061n<C20064d<T>> {

    /* renamed from: b */
    public final C8061n<C20145v<T>> f44435b;

    /* renamed from: pr.e$a */
    public static class C20066a<R> implements Observer<C20145v<R>> {

        /* renamed from: b */
        public final Observer<? super C20064d<R>> f44436b;

        public C20066a(Observer<? super C20064d<R>> observer) {
            this.f44436b = observer;
        }

        public final void onComplete() {
            this.f44436b.onComplete();
        }

        public final void onError(Throwable th) {
            try {
                Observer<? super C20064d<R>> observer = this.f44436b;
                if (th != null) {
                    observer.onNext(new C20064d((C20145v) null, th));
                    this.f44436b.onComplete();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th2) {
                C19421p.m32940h0(th2);
                C18981a.m32123b(new CompositeException(th, th2));
            }
        }

        public final void onNext(Object obj) {
            C20145v vVar = (C20145v) obj;
            Observer<? super C20064d<R>> observer = this.f44436b;
            if (vVar != null) {
                observer.onNext(new C20064d(vVar, (Throwable) null));
                return;
            }
            throw new NullPointerException("response == null");
        }

        public final void onSubscribe(Disposable disposable) {
            this.f44436b.onSubscribe(disposable);
        }
    }

    public C20065e(C8061n<C20145v<T>> nVar) {
        this.f44435b = nVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super C20064d<T>> observer) {
        this.f44435b.subscribe(new C20066a(observer));
    }
}
