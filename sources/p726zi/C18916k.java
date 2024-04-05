package p726zi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: zi.k */
public final /* synthetic */ class C18916k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C18917l f42136a;

    public /* synthetic */ C18916k(C18917l lVar) {
        this.f42136a = lVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C18917l lVar = this.f42136a;
        lVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = lVar.f42141b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = lVar.f42142c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = lVar.f42144e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }
}
