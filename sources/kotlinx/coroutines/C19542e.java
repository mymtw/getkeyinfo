package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlinx.coroutines.e */
public final class C19542e<T> extends C19464a<T> {

    /* renamed from: d */
    public final Thread f43487d;

    /* renamed from: e */
    public final C19821t0 f43488e;

    public C19542e(CoroutineContext coroutineContext, Thread thread, C19821t0 t0Var) {
        super(coroutineContext, true);
        this.f43487d = thread;
        this.f43488e = t0Var;
    }

    /* renamed from: H */
    public final void mo72252H(Object obj) {
        if (!C19383o.m32792b(Thread.currentThread(), this.f43487d)) {
            LockSupport.unpark(this.f43487d);
        }
    }
}
