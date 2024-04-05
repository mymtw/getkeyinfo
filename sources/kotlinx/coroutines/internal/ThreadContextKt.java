package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19841y1;
import p753kq.C19861p;

public final class ThreadContextKt {

    /* renamed from: a */
    public static final C19736t f43649a = new C19736t("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final C19861p<Object, CoroutineContext.C19335a, Object> f43650b = ThreadContextKt$countAll$1.INSTANCE;

    /* renamed from: c */
    public static final C19861p<C19841y1<?>, CoroutineContext.C19335a, C19841y1<?>> f43651c = ThreadContextKt$findOne$1.INSTANCE;

    /* renamed from: d */
    public static final C19861p<C19742z, CoroutineContext.C19335a, C19742z> f43652d = ThreadContextKt$updateState$1.INSTANCE;

    /* renamed from: a */
    public static final void m33528a(CoroutineContext coroutineContext, Object obj) {
        if (obj != f43649a) {
            if (obj instanceof C19742z) {
                C19742z zVar = (C19742z) obj;
                int length = zVar.f43696c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        C19841y1<Object> y1Var = zVar.f43696c[length];
                        C19383o.m32794d(y1Var);
                        y1Var.mo72118G(zVar.f43695b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = coroutineContext.fold(null, f43651c);
                if (fold != null) {
                    ((C19841y1) fold).mo72118G(obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }

    /* renamed from: b */
    public static final Object m33529b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f43650b);
        C19383o.m32794d(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m33530c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m33529b(coroutineContext);
        }
        return obj == 0 ? f43649a : obj instanceof Integer ? coroutineContext.fold(new C19742z(coroutineContext, ((Number) obj).intValue()), f43652d) : ((C19841y1) obj).mo72122x0(coroutineContext);
    }
}
