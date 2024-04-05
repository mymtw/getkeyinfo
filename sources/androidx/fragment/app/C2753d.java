package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2744b;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;

/* renamed from: androidx.fragment.app.d */
public final class C2753d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f6271a;

    /* renamed from: b */
    public final /* synthetic */ View f6272b;

    /* renamed from: c */
    public final /* synthetic */ boolean f6273c;

    /* renamed from: d */
    public final /* synthetic */ SpecialEffectsController.Operation f6274d;

    /* renamed from: e */
    public final /* synthetic */ C2744b.C2746b f6275e;

    public C2753d(ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.Operation operation, C2744b.C2746b bVar) {
        this.f6271a = viewGroup;
        this.f6272b = view;
        this.f6273c = z;
        this.f6274d = operation;
        this.f6275e = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6271a.endViewTransition(this.f6272b);
        if (this.f6273c) {
            this.f6274d.f6203a.applyState(this.f6272b);
        }
        this.f6275e.mo10515a();
        if (FragmentManager.m6465J(2)) {
            Objects.toString(this.f6274d);
        }
    }
}
