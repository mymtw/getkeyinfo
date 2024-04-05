package androidx.room;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19820t;
import p753kq.C19861p;

/* renamed from: androidx.room.h0 */
public final class C3235h0 implements CoroutineContext.C19335a {

    /* renamed from: e */
    public static final C3236a f7516e = new C3236a();

    /* renamed from: b */
    public final C19699g1 f7517b;

    /* renamed from: c */
    public final C19341d f7518c;

    /* renamed from: d */
    public final AtomicInteger f7519d = new AtomicInteger(0);

    /* renamed from: androidx.room.h0$a */
    public static final class C3236a implements CoroutineContext.C19337b<C3235h0> {
    }

    public C3235h0(C19820t tVar, C19341d dVar) {
        C19383o.m32797g(tVar, "transactionThreadControlJob");
        C19383o.m32797g(dVar, "transactionDispatcher");
        this.f7517b = tVar;
        this.f7518c = dVar;
    }

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
    }

    public final CoroutineContext.C19337b<C3235h0> getKey() {
        return f7516e;
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        return CoroutineContext.C19335a.C19336a.m32672b(this, bVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }
}
