package p597jl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.p013v4.media.session.C0087d;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import java.util.WeakHashMap;
import p003a2.C0015b;

/* renamed from: jl.r */
public final class C18031r implements C18036w {

    /* renamed from: a */
    public int f39447a;

    public C18031r(int i) {
        this.f39447a = i;
    }

    /* renamed from: c */
    public static ObjectAnimator m30465c(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C18029p(f3, view));
        return ofPropertyValuesHolder;
    }

    /* renamed from: d */
    public static ObjectAnimator m30466d(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C18030q(f3, view));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public final Animator mo69584a(ViewGroup viewGroup, View view) {
        int i = this.f39447a;
        int b = C0087d.m233b(view, R.dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (i == 3) {
            return m30465c(view, translationX, translationX - ((float) b), translationX);
        }
        if (i == 5) {
            return m30465c(view, translationX, ((float) b) + translationX, translationX);
        }
        if (i == 48) {
            return m30466d(view, translationY, ((float) b) + translationY, translationY);
        }
        if (i == 80) {
            return m30466d(view, translationY, translationY - ((float) b), translationY);
        }
        boolean z = false;
        if (i == 8388611) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2369e.m5233d(viewGroup) == 1) {
                z = true;
            }
            float f = (float) b;
            return m30465c(view, translationX, z ? translationX - f : f + translationX, translationX);
        } else if (i == 8388613) {
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            if (C2364y.C2369e.m5233d(viewGroup) == 1) {
                z = true;
            }
            float f2 = (float) b;
            return m30465c(view, translationX, z ? f2 + translationX : translationX - f2, translationX);
        } else {
            throw new IllegalArgumentException(C0015b.m88g("Invalid slide direction: ", i));
        }
    }

    /* renamed from: b */
    public final Animator mo69585b(ViewGroup viewGroup, View view) {
        int i = this.f39447a;
        int b = C0087d.m233b(view, R.dimen.mtrl_transition_shared_axis_slide_distance);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (i == 3) {
            return m30465c(view, ((float) b) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return m30465c(view, translationX - ((float) b), translationX, translationX);
        }
        if (i == 48) {
            return m30466d(view, translationY - ((float) b), translationY, translationY);
        }
        if (i == 80) {
            return m30466d(view, ((float) b) + translationY, translationY, translationY);
        }
        boolean z = false;
        if (i == 8388611) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2369e.m5233d(viewGroup) == 1) {
                z = true;
            }
            float f = (float) b;
            return m30465c(view, z ? f + translationX : translationX - f, translationX, translationX);
        } else if (i == 8388613) {
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            if (C2364y.C2369e.m5233d(viewGroup) == 1) {
                z = true;
            }
            float f2 = (float) b;
            return m30465c(view, z ? translationX - f2 : f2 + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException(C0015b.m88g("Invalid slide direction: ", i));
        }
    }
}
