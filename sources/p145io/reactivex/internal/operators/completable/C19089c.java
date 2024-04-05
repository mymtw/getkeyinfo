package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.C7092b;
import p145io.reactivex.disposables.Disposable;
import p248tp.C8048a;
import p248tp.C8050c;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.completable.c */
public final class C19089c extends C8048a {

    /* renamed from: b */
    public final Callable<?> f42609b;

    public C19089c(Callable<?> callable) {
        this.f42609b = callable;
    }

    /* renamed from: d */
    public final void mo20609d(C8050c cVar) {
        Disposable a = C7092b.m13750a();
        cVar.onSubscribe(a);
        try {
            this.f42609b.call();
            if (!a.isDisposed()) {
                cVar.onComplete();
            }
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            if (!a.isDisposed()) {
                cVar.onError(th);
            } else {
                C18981a.m32123b(th);
            }
        }
    }
}
