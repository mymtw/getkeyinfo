package p558el;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: el.a */
public final class C17714a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f38518a;

    public C17714a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f38518a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38518a.mo54736d();
    }
}
