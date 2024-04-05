package kotlin.coroutines;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public interface CoroutineContext {

    public static final class DefaultImpls {
        /* renamed from: a */
        public static CoroutineContext m32670a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            C19383o.m32797g(coroutineContext2, ResponseConstants.CONTEXT);
            return coroutineContext2 == EmptyCoroutineContext.INSTANCE ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, CoroutineContext$plus$1.INSTANCE);
        }
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    public interface C19335a extends CoroutineContext {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a */
        public static final class C19336a {
            /* renamed from: a */
            public static <E extends C19335a> E m32671a(C19335a aVar, C19337b<E> bVar) {
                C19383o.m32797g(bVar, "key");
                if (C19383o.m32792b(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            /* renamed from: b */
            public static CoroutineContext m32672b(C19335a aVar, C19337b<?> bVar) {
                C19383o.m32797g(bVar, "key");
                return C19383o.m32792b(aVar.getKey(), bVar) ? EmptyCoroutineContext.INSTANCE : aVar;
            }
        }

        <E extends C19335a> E get(C19337b<E> bVar);

        C19337b<?> getKey();
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$b */
    public interface C19337b<E extends C19335a> {
    }

    <R> R fold(R r, C19861p<? super R, ? super C19335a, ? extends R> pVar);

    <E extends C19335a> E get(C19337b<E> bVar);

    CoroutineContext minusKey(C19337b<?> bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
