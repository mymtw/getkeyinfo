package p597jl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: jl.o */
public final class C18028o implements C18036w {

    /* renamed from: a */
    public float f39439a = 1.1f;

    /* renamed from: b */
    public float f39440b = 0.8f;

    /* renamed from: c */
    public boolean f39441c;

    /* renamed from: d */
    public boolean f39442d = true;

    public C18028o(boolean z) {
        this.f39441c = z;
    }

    /* renamed from: c */
    public static ObjectAnimator m30462c(float f, float f2, View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new C18027n(scaleX, scaleY, view));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public final Animator mo69584a(ViewGroup viewGroup, View view) {
        if (!this.f39442d) {
            return null;
        }
        return this.f39441c ? m30462c(1.0f, this.f39439a, view) : m30462c(1.0f, this.f39440b, view);
    }

    /* renamed from: b */
    public final Animator mo69585b(ViewGroup viewGroup, View view) {
        return this.f39441c ? m30462c(this.f39440b, 1.0f, view) : m30462c(this.f39439a, 1.0f, view);
    }
}
