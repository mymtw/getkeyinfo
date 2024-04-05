package p186n2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.BaseInterpolator;
import com.etsy.android.R;
import p186n2.C7418m;

/* renamed from: n2.v */
public final class C7435v {

    /* renamed from: n2.v$a */
    public static class C7436a extends AnimatorListenerAdapter implements C7418m.C7422d {

        /* renamed from: a */
        public final View f16613a;

        /* renamed from: b */
        public final View f16614b;

        /* renamed from: c */
        public final int f16615c;

        /* renamed from: d */
        public final int f16616d;

        /* renamed from: e */
        public int[] f16617e;

        /* renamed from: f */
        public float f16618f;

        /* renamed from: g */
        public float f16619g;

        /* renamed from: h */
        public final float f16620h;

        /* renamed from: i */
        public final float f16621i;

        public C7436a(View view, View view2, int i, int i2, float f, float f2) {
            this.f16614b = view;
            this.f16613a = view2;
            this.f16615c = i - Math.round(view.getTranslationX());
            this.f16616d = i2 - Math.round(view.getTranslationY());
            this.f16620h = f;
            this.f16621i = f2;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f16617e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, (Object) null);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f16617e == null) {
                this.f16617e = new int[2];
            }
            this.f16617e[0] = Math.round(this.f16614b.getTranslationX() + ((float) this.f16615c));
            this.f16617e[1] = Math.round(this.f16614b.getTranslationY() + ((float) this.f16616d));
            this.f16613a.setTag(R.id.transition_position, this.f16617e);
        }

        public final void onAnimationPause(Animator animator) {
            this.f16618f = this.f16614b.getTranslationX();
            this.f16619g = this.f16614b.getTranslationY();
            this.f16614b.setTranslationX(this.f16620h);
            this.f16614b.setTranslationY(this.f16621i);
        }

        public final void onAnimationResume(Animator animator) {
            this.f16614b.setTranslationX(this.f16618f);
            this.f16614b.setTranslationY(this.f16619g);
        }

        public final void onTransitionCancel(C7418m mVar) {
        }

        public final void onTransitionEnd(C7418m mVar) {
            this.f16614b.setTranslationX(this.f16620h);
            this.f16614b.setTranslationY(this.f16621i);
            mVar.mo19793z(this);
        }

        public final void onTransitionPause(C7418m mVar) {
        }

        public final void onTransitionResume(C7418m mVar) {
        }

        public final void onTransitionStart(C7418m mVar) {
        }
    }

    /* renamed from: a */
    public static ObjectAnimator m14370a(View view, C7433t tVar, int i, int i2, float f, float f2, float f3, float f4, BaseInterpolator baseInterpolator, C7418m mVar) {
        float f5;
        float f6;
        View view2 = view;
        C7433t tVar2 = tVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) tVar2.f16607b.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C7436a aVar = new C7436a(view, tVar2.f16607b, round, round2, translationX, translationY);
        mVar.mo19776a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(baseInterpolator);
        return ofPropertyValuesHolder;
    }
}
