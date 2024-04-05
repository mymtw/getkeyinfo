package p590il;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: il.h */
public final class C17861h implements C17866m {

    /* renamed from: a */
    public float f38782a = 0.8f;

    /* renamed from: b */
    public boolean f38783b;

    /* renamed from: c */
    public boolean f38784c = true;

    public C17861h(boolean z) {
        this.f38783b = z;
    }

    /* renamed from: c */
    public static ObjectAnimator m29992c(float f, float f2, View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new C17860g(scaleX, scaleY, view));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public final Animator mo69085a(ViewGroup viewGroup, View view) {
        if (!this.f38784c) {
            return null;
        }
        return this.f38783b ? m29992c(1.0f, 1.1f, view) : m29992c(1.0f, this.f38782a, view);
    }

    /* renamed from: b */
    public final Animator mo69086b(ViewGroup viewGroup, View view) {
        return this.f38783b ? m29992c(this.f38782a, 1.0f, view) : m29992c(1.1f, 1.0f, view);
    }
}
