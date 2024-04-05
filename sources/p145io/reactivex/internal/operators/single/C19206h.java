package p145io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.C7092b;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8071s;
import p248tp.C8073u;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.single.h */
public final class C19206h<T> extends C8071s<T> {

    /* renamed from: b */
    public final Callable<? extends T> f42937b;

    public C19206h(Callable<? extends T> callable) {
        this.f42937b = callable;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        Disposable a = C7092b.m13750a();
        uVar.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                Object call = this.f42937b.call();
                C12965a.m20650b(call, "The callable returned a null value");
                if (!a.isDisposed()) {
                    uVar.onSuccess(call);
                }
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                if (!a.isDisposed()) {
                    uVar.onError(th);
                } else {
                    C18981a.m32123b(th);
                }
            }
        }
    }
}
