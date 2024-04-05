package androidx.compose.runtime;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19729m;
import p753kq.C19857l;
import p753kq.C19861p;
import p768rq.C20153b;

public final class SdkStubsFallbackFrameClock implements C1321f0 {

    /* renamed from: b */
    public static final SdkStubsFallbackFrameClock f2790b = new SdkStubsFallbackFrameClock();

    /* renamed from: Q */
    public final <R> Object mo5381Q(C19857l<? super Long, ? extends R> lVar, C19340c<? super R> cVar) {
        C20153b bVar = C19760n0.f43719a;
        return C19697g.m33471i(cVar, C19729m.f43681a, new SdkStubsFallbackFrameClock$withFrameNanos$2(lVar, (C19340c<? super SdkStubsFallbackFrameClock$withFrameNanos$2>) null));
    }

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32672b(this, bVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }
}
