package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.C19335a;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: kotlin.coroutines.b */
public abstract class C19339b<B extends CoroutineContext.C19335a, E extends B> implements CoroutineContext.C19337b<E> {

    /* renamed from: b */
    public final C19857l<CoroutineContext.C19335a, E> f43192b;

    /* renamed from: c */
    public final CoroutineContext.C19337b<?> f43193c;

    public C19339b(CoroutineContext.C19337b<B> bVar, C19857l<? super CoroutineContext.C19335a, ? extends E> lVar) {
        C19383o.m32797g(bVar, "baseKey");
        C19383o.m32797g(lVar, "safeCast");
        this.f43192b = lVar;
        this.f43193c = bVar instanceof C19339b ? ((C19339b) bVar).f43193c : bVar;
    }
}
