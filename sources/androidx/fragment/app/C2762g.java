package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2744b;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;
import p002a1.C0007b;

/* renamed from: androidx.fragment.app.g */
public final class C2762g implements C0007b.C0008a {

    /* renamed from: a */
    public final /* synthetic */ View f6289a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f6290b;

    /* renamed from: c */
    public final /* synthetic */ C2744b.C2746b f6291c;

    /* renamed from: d */
    public final /* synthetic */ SpecialEffectsController.Operation f6292d;

    public C2762g(View view, ViewGroup viewGroup, C2744b.C2746b bVar, SpecialEffectsController.Operation operation) {
        this.f6289a = view;
        this.f6290b = viewGroup;
        this.f6291c = bVar;
        this.f6292d = operation;
    }

    public final void onCancel() {
        this.f6289a.clearAnimation();
        this.f6290b.endViewTransition(this.f6289a);
        this.f6291c.mo10515a();
        if (FragmentManager.m6465J(2)) {
            Objects.toString(this.f6292d);
        }
    }
}
