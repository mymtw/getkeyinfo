package p765pr;

import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p248tp.C8061n;
import p736cq.C18981a;
import retrofit2.C20089b;
import retrofit2.C20113n;
import retrofit2.C20145v;

/* renamed from: pr.c */
public final class C20062c<T> extends C8061n<C20145v<T>> {

    /* renamed from: b */
    public final C20089b<T> f44430b;

    /* renamed from: pr.c$a */
    public static final class C20063a implements Disposable {

        /* renamed from: b */
        public final C20089b<?> f44431b;

        /* renamed from: c */
        public volatile boolean f44432c;

        public C20063a(C20089b<?> bVar) {
            this.f44431b = bVar;
        }

        public final void dispose() {
            this.f44432c = true;
            this.f44431b.cancel();
        }

        public final boolean isDisposed() {
            return this.f44432c;
        }
    }

    public C20062c(C20113n nVar) {
        this.f44430b = nVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super C20145v<T>> observer) {
        boolean z;
        C20089b<T> clone = this.f44430b.clone();
        C20063a aVar = new C20063a(clone);
        observer.onSubscribe(aVar);
        if (!aVar.f44432c) {
            try {
                C20145v<T> e = clone.mo74365e();
                if (!aVar.f44432c) {
                    observer.onNext(e);
                }
                if (!aVar.f44432c) {
                    try {
                        observer.onComplete();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
                C19421p.m32940h0(th);
                if (z) {
                    C18981a.m32123b(th);
                } else if (!aVar.f44432c) {
                    try {
                        observer.onError(th);
                    } catch (Throwable th3) {
                        C19421p.m32940h0(th3);
                        C18981a.m32123b(new CompositeException(th, th3));
                    }
                }
            }
        }
    }
}
