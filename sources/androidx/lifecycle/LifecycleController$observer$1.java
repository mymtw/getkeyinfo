package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C19699g1;

public final class LifecycleController$observer$1 implements C2885q {

    /* renamed from: b */
    public final /* synthetic */ LifecycleController f6432b;

    /* renamed from: c */
    public final /* synthetic */ C19699g1 f6433c;

    public LifecycleController$observer$1(LifecycleController lifecycleController, C19699g1 g1Var) {
        this.f6432b = lifecycleController;
        this.f6433c = g1Var;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (sVar.getLifecycle().mo10734b() == Lifecycle.State.DESTROYED) {
            LifecycleController lifecycleController = this.f6432b;
            this.f6433c.mo72134a((CancellationException) null);
            lifecycleController.mo10738a();
        } else if (sVar.getLifecycle().mo10734b().compareTo(this.f6432b.f6429b) < 0) {
            this.f6432b.f6430c.f6496a = true;
        } else {
            C2862h hVar = this.f6432b.f6430c;
            if (hVar.f6496a) {
                if (true ^ hVar.f6497b) {
                    hVar.f6496a = false;
                    hVar.mo10818a();
                    return;
                }
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
        }
    }
}
