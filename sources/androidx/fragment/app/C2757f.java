package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C2744b;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;

/* renamed from: androidx.fragment.app.f */
public final class C2757f implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ SpecialEffectsController.Operation f6281a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f6282b;

    /* renamed from: c */
    public final /* synthetic */ View f6283c;

    /* renamed from: d */
    public final /* synthetic */ C2744b.C2746b f6284d;

    /* renamed from: androidx.fragment.app.f$a */
    public class C2758a implements Runnable {
        public C2758a() {
        }

        public final void run() {
            C2757f fVar = C2757f.this;
            fVar.f6282b.endViewTransition(fVar.f6283c);
            C2757f.this.f6284d.mo10515a();
        }
    }

    public C2757f(View view, ViewGroup viewGroup, C2744b.C2746b bVar, SpecialEffectsController.Operation operation) {
        this.f6281a = operation;
        this.f6282b = viewGroup;
        this.f6283c = view;
        this.f6284d = bVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f6282b.post(new C2758a());
        if (FragmentManager.m6465J(2)) {
            Objects.toString(this.f6281a);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (FragmentManager.m6465J(2)) {
            Objects.toString(this.f6281a);
        }
    }
}
