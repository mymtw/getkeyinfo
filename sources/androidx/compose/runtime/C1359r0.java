package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.r0 */
public final class C1359r0<T> implements C1357q0<T>, C1338j0<T> {

    /* renamed from: b */
    public final CoroutineContext f2956b;

    /* renamed from: c */
    public final /* synthetic */ C1338j0<T> f2957c;

    public C1359r0(C1338j0<T> j0Var, CoroutineContext coroutineContext) {
        C19383o.m32797g(j0Var, "state");
        C19383o.m32797g(coroutineContext, "coroutineContext");
        this.f2956b = coroutineContext;
        this.f2957c = j0Var;
    }

    public final T component1() {
        return this.f2957c.component1();
    }

    public final C19857l<T, C19394m> component2() {
        return this.f2957c.component2();
    }

    public final CoroutineContext getCoroutineContext() {
        return this.f2956b;
    }

    public final T getValue() {
        return this.f2957c.getValue();
    }

    public final void setValue(T t) {
        this.f2957c.setValue(t);
    }
}
