package androidx.compose.runtime;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.f0 */
public interface C1321f0 extends CoroutineContext.C19335a {

    /* renamed from: U */
    public static final /* synthetic */ int f2885U = 0;

    /* renamed from: androidx.compose.runtime.f0$a */
    public static final class C1322a implements CoroutineContext.C19337b<C1321f0> {

        /* renamed from: b */
        public static final /* synthetic */ C1322a f2886b = new C1322a();
    }

    /* renamed from: Q */
    <R> Object mo5381Q(C19857l<? super Long, ? extends R> lVar, C19340c<? super R> cVar);

    CoroutineContext.C19337b<?> getKey() {
        return C1322a.f2886b;
    }
}
