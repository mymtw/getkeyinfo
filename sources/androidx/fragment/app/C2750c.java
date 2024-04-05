package androidx.fragment.app;

import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.c */
public final class C2750c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ List f6241b;

    /* renamed from: c */
    public final /* synthetic */ SpecialEffectsController.Operation f6242c;

    /* renamed from: d */
    public final /* synthetic */ C2744b f6243d;

    public C2750c(C2744b bVar, ArrayList arrayList, SpecialEffectsController.Operation operation) {
        this.f6243d = bVar;
        this.f6241b = arrayList;
        this.f6242c = operation;
    }

    public final void run() {
        if (this.f6241b.contains(this.f6242c)) {
            this.f6241b.remove(this.f6242c);
            C2744b bVar = this.f6243d;
            SpecialEffectsController.Operation operation = this.f6242c;
            bVar.getClass();
            operation.f6203a.applyState(operation.f6205c.mView);
        }
    }
}
