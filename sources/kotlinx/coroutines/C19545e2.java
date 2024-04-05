package kotlinx.coroutines;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: kotlinx.coroutines.e2 */
public final class C19545e2 implements CoroutineContext.C19335a, CoroutineContext.C19337b<C19545e2> {

    /* renamed from: b */
    public static final C19545e2 f43500b = new C19545e2();

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
    }

    public final CoroutineContext.C19337b<?> getKey() {
        return this;
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        return CoroutineContext.C19335a.C19336a.m32672b(this, bVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }
}
