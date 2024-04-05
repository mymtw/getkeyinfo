package p558el;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: el.c */
public final class C17716c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f38520a;

    public C17716c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f38520a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38520a.mo54736d();
    }

    public final void onAnimationStart(Animator animator) {
        this.f38520a.f34655d.animateContentIn(70, 180);
    }
}
