package androidx.core.view;

import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.s0 */
public final class C2330s0 {

    /* renamed from: a */
    public WeakReference<View> f5586a;

    public C2330s0(View view) {
        this.f5586a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public final void mo8918a(float f) {
        View view = this.f5586a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: b */
    public final void mo8919b() {
        View view = this.f5586a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void mo8920c(long j) {
        View view = this.f5586a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* renamed from: d */
    public final void mo8921d(C2332t0 t0Var) {
        View view = this.f5586a.get();
        if (view == null) {
            return;
        }
        if (t0Var != null) {
            view.animate().setListener(new C2326q0(t0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: e */
    public final void mo8922e() {
        View view = this.f5586a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: f */
    public final void mo8923f(float f) {
        View view = this.f5586a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
