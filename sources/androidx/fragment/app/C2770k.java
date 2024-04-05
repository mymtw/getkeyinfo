package androidx.fragment.app;

import androidx.fragment.app.C2744b;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;

/* renamed from: androidx.fragment.app.k */
public final class C2770k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C2744b.C2748d f6313b;

    /* renamed from: c */
    public final /* synthetic */ SpecialEffectsController.Operation f6314c;

    public C2770k(C2744b.C2748d dVar, SpecialEffectsController.Operation operation) {
        this.f6313b = dVar;
        this.f6314c = operation;
    }

    public final void run() {
        this.f6313b.mo10515a();
        if (FragmentManager.m6465J(2)) {
            Objects.toString(this.f6314c);
        }
    }
}
