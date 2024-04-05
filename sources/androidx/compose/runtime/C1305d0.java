package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19835w1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19721f;
import p753kq.C19861p;

/* renamed from: androidx.compose.runtime.d0 */
public final class C1305d0 implements C1426z0 {

    /* renamed from: b */
    public final C19861p<C19525d0, C19340c<? super C19394m>, Object> f2829b;

    /* renamed from: c */
    public final C19721f f2830c;

    /* renamed from: d */
    public C19835w1 f2831d;

    public C1305d0(CoroutineContext coroutineContext, C19861p<? super C19525d0, ? super C19340c<? super C19394m>, ? extends Object> pVar) {
        C19383o.m32797g(coroutineContext, "parentCoroutineContext");
        C19383o.m32797g(pVar, "task");
        this.f2829b = pVar;
        this.f2830c = C19697g.m33463a(coroutineContext);
    }

    public final void onAbandoned() {
        C19835w1 w1Var = this.f2831d;
        if (w1Var != null) {
            w1Var.mo72134a((CancellationException) null);
        }
        this.f2831d = null;
    }

    public final void onForgotten() {
        C19835w1 w1Var = this.f2831d;
        if (w1Var != null) {
            w1Var.mo72134a((CancellationException) null);
        }
        this.f2831d = null;
    }

    public final void onRemembered() {
        C19835w1 w1Var = this.f2831d;
        if (w1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause((Throwable) null);
            w1Var.mo72134a(cancellationException);
        }
        this.f2831d = C19697g.m33468f(this.f2830c, (CoroutineContext) null, (CoroutineStart) null, this.f2829b, 3);
    }
}
