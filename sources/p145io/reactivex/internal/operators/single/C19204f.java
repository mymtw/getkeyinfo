package p145io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.functions.Functions;
import p248tp.C8071s;
import p248tp.C8073u;

/* renamed from: io.reactivex.internal.operators.single.f */
public final class C19204f<T> extends C8071s<T> {

    /* renamed from: b */
    public final Callable<? extends Throwable> f42934b;

    public C19204f(Functions.C12962g gVar) {
        this.f42934b = gVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        try {
            Object call = this.f42934b.call();
            C12965a.m20650b(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            C19421p.m32940h0(th);
        }
        EmptyDisposable.error(th, (C8073u<?>) uVar);
    }
}
