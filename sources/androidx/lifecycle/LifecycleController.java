package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19699g1;

public final class LifecycleController {

    /* renamed from: a */
    public final Lifecycle f6428a;

    /* renamed from: b */
    public final Lifecycle.State f6429b;

    /* renamed from: c */
    public final C2862h f6430c;

    /* renamed from: d */
    public final C2885q f6431d;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, C2862h hVar, C19699g1 g1Var) {
        C19383o.m32797g(lifecycle, "lifecycle");
        C19383o.m32797g(state, "minState");
        C19383o.m32797g(hVar, "dispatchQueue");
        this.f6428a = lifecycle;
        this.f6429b = state;
        this.f6430c = hVar;
        LifecycleController$observer$1 lifecycleController$observer$1 = new LifecycleController$observer$1(this, g1Var);
        this.f6431d = lifecycleController$observer$1;
        if (lifecycle.mo10734b() == Lifecycle.State.DESTROYED) {
            g1Var.mo72134a((CancellationException) null);
            mo10738a();
            return;
        }
        lifecycle.mo10733a(lifecycleController$observer$1);
    }

    /* renamed from: a */
    public final void mo10738a() {
        this.f6428a.mo10735c(this.f6431d);
        C2862h hVar = this.f6430c;
        hVar.f6497b = true;
        hVar.mo10818a();
    }
}
