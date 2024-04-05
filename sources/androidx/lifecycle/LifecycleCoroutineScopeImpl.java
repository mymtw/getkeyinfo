package androidx.lifecycle;

import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19729m;
import p768rq.C20153b;

public final class LifecycleCoroutineScopeImpl extends C2882o implements C2885q {

    /* renamed from: b */
    public final Lifecycle f6434b;

    /* renamed from: c */
    public final CoroutineContext f6435c;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, "coroutineContext");
        this.f6434b = lifecycle;
        this.f6435c = coroutineContext;
        if (lifecycle.mo10734b() == Lifecycle.State.DESTROYED) {
            C1993m.m4372r(coroutineContext, (CancellationException) null);
        }
    }

    /* renamed from: a */
    public final Lifecycle mo10742a() {
        return this.f6434b;
    }

    /* renamed from: d */
    public final void mo10743d() {
        C20153b bVar = C19760n0.f43719a;
        C19697g.m33468f(this, C19729m.f43681a.mo72111E0(), (CoroutineStart) null, new LifecycleCoroutineScopeImpl$register$1(this, (C19340c<? super LifecycleCoroutineScopeImpl$register$1>) null), 2);
    }

    public final CoroutineContext getCoroutineContext() {
        return this.f6435c;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (this.f6434b.mo10734b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            this.f6434b.mo10735c(this);
            C1993m.m4372r(this.f6435c, (CancellationException) null);
        }
    }
}
