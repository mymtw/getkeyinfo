package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8061n;

/* renamed from: io.reactivex.internal.operators.observable.g */
public final class C19162g<T> extends C8061n<T> {

    /* renamed from: b */
    public final Callable<? extends Throwable> f42831b;

    public C19162g(Functions.C12962g gVar) {
        this.f42831b = gVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        try {
            Object call = this.f42831b.call();
            C12965a.m20650b(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            C19421p.m32940h0(th);
        }
        EmptyDisposable.error(th, (Observer<?>) observer);
    }
}
