package p765pr;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p248tp.C8061n;
import p736cq.C18981a;
import retrofit2.C20089b;
import retrofit2.C20092d;
import retrofit2.C20113n;
import retrofit2.C20145v;

/* renamed from: pr.b */
public final class C20060b<T> extends C8061n<C20145v<T>> {

    /* renamed from: b */
    public final C20089b<T> f44425b;

    /* renamed from: pr.b$a */
    public static final class C20061a<T> implements Disposable, C20092d<T> {

        /* renamed from: b */
        public final C20089b<?> f44426b;

        /* renamed from: c */
        public final Observer<? super C20145v<T>> f44427c;

        /* renamed from: d */
        public volatile boolean f44428d;

        /* renamed from: e */
        public boolean f44429e = false;

        public C20061a(C20089b<?> bVar, Observer<? super C20145v<T>> observer) {
            this.f44426b = bVar;
            this.f44427c = observer;
        }

        public final void dispose() {
            this.f44428d = true;
            this.f44426b.cancel();
        }

        public final boolean isDisposed() {
            return this.f44428d;
        }

        /* renamed from: j */
        public final void mo1135j(C20089b<T> bVar, Throwable th) {
            if (!bVar.mo74367n()) {
                try {
                    this.f44427c.onError(th);
                } catch (Throwable th2) {
                    C19421p.m32940h0(th2);
                    C18981a.m32123b(new CompositeException(th, th2));
                }
            }
        }

        /* renamed from: m */
        public final void mo1137m(C20089b<T> bVar, C20145v<T> vVar) {
            if (!this.f44428d) {
                try {
                    this.f44427c.onNext(vVar);
                    if (!this.f44428d) {
                        this.f44429e = true;
                        this.f44427c.onComplete();
                    }
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    C18981a.m32123b(new CompositeException(th, th));
                }
            }
        }
    }

    public C20060b(C20113n nVar) {
        this.f44425b = nVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super C20145v<T>> observer) {
        C20089b<T> clone = this.f44425b.clone();
        C20061a aVar = new C20061a(clone, observer);
        observer.onSubscribe(aVar);
        if (!aVar.f44428d) {
            clone.mo74362G(aVar);
        }
    }
}
