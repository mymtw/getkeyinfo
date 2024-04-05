package p558el;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: el.d */
public final class C17717d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f38521a;

    public C17717d(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f38521a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38521a.mo54735c();
    }

    public final void onAnimationStart(Animator animator) {
        this.f38521a.f34655d.animateContentOut(0, 180);
    }
}
