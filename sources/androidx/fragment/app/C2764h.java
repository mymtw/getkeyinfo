package androidx.fragment.app;

import androidx.fragment.app.SpecialEffectsController;
import p193o.C7494b;

/* renamed from: androidx.fragment.app.h */
public final class C2764h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f6300b;

    /* renamed from: c */
    public final /* synthetic */ SpecialEffectsController.Operation f6301c;

    /* renamed from: d */
    public final /* synthetic */ boolean f6302d;

    public C2764h(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, C7494b bVar) {
        this.f6300b = operation;
        this.f6301c = operation2;
        this.f6302d = z;
    }

    public final void run() {
        Fragment fragment = this.f6300b.f6205c;
        Fragment fragment2 = this.f6301c.f6205c;
        boolean z = this.f6302d;
        C2759f0 f0Var = C2754d0.f6276a;
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }
}
