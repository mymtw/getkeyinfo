package kotlin.coroutines;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: kotlin.coroutines.a */
public abstract class C19338a implements CoroutineContext.C19335a {
    private final CoroutineContext.C19337b<?> key;

    public C19338a(CoroutineContext.C19337b<?> bVar) {
        C19383o.m32797g(bVar, "key");
        this.key = bVar;
    }

    public <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
    }

    public CoroutineContext.C19337b<?> getKey() {
        return this.key;
    }

    public CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        return CoroutineContext.C19335a.C19336a.m32672b(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }
}
