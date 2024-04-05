package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.flow.internal.h */
public final class C19631h implements CoroutineContext {

    /* renamed from: b */
    public final Throwable f43595b;

    /* renamed from: c */
    public final /* synthetic */ CoroutineContext f43596c;

    public C19631h(Throwable th, CoroutineContext coroutineContext) {
        this.f43595b = th;
        this.f43596c = coroutineContext;
    }

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        return this.f43596c.fold(r, pVar);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        return this.f43596c.get(bVar);
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        return this.f43596c.minusKey(bVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f43596c.plus(coroutineContext);
    }
}
