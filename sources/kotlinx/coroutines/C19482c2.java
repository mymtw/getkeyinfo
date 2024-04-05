package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* renamed from: kotlinx.coroutines.c2 */
public final class C19482c2 extends CoroutineDispatcher {

    /* renamed from: c */
    public static final /* synthetic */ int f43414c = 0;

    static {
        new C19482c2();
    }

    /* renamed from: A0 */
    public final void mo7108A0(CoroutineContext coroutineContext, Runnable runnable) {
        C19549f2 f2Var = (C19549f2) coroutineContext.get(C19549f2.f43506c);
        if (f2Var != null) {
            f2Var.f43507b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
