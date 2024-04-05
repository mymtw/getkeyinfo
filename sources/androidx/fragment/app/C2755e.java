package androidx.fragment.app;

import android.animation.Animator;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;
import p002a1.C0007b;

/* renamed from: androidx.fragment.app.e */
public final class C2755e implements C0007b.C0008a {

    /* renamed from: a */
    public final /* synthetic */ Animator f6278a;

    /* renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f6279b;

    public C2755e(Animator animator, SpecialEffectsController.Operation operation) {
        this.f6278a = animator;
        this.f6279b = operation;
    }

    public final void onCancel() {
        this.f6278a.end();
        if (FragmentManager.m6465J(2)) {
            Objects.toString(this.f6279b);
        }
    }
}
