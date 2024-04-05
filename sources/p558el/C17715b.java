package p558el;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: el.b */
public final class C17715b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f38519a;

    public C17715b(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f38519a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38519a.mo54735c();
    }
}
