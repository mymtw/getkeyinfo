package com.etsy.android.uikit.util;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

public final class AnimationUtil {

    public static class ViewHeightEvaluator extends IntEvaluator {
        private final ViewGroup.LayoutParams mParams;
        private final View mView;

        public ViewHeightEvaluator(View view) {
            this.mView = view;
            this.mParams = view.getLayoutParams();
        }

        public Integer evaluate(float f, Integer num, Integer num2) {
            int intValue = super.evaluate(f, num, num2).intValue();
            ViewGroup.LayoutParams layoutParams = this.mParams;
            layoutParams.height = intValue;
            this.mView.setLayoutParams(layoutParams);
            return Integer.valueOf(intValue);
        }
    }

    /* renamed from: a */
    public static void m19605a(ImageView imageView, int i) {
        imageView.animate().cancel();
        C11896b bVar = new C11896b(imageView, i);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(imageView, "scaleX", new float[]{1.0f, 1.25f}), ObjectAnimator.ofFloat(imageView, "scaleY", new float[]{1.0f, 1.25f})});
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(100);
        animatorSet.addListener(bVar);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(imageView, "scaleX", new float[]{1.25f, 1.0f}), ObjectAnimator.ofFloat(imageView, "scaleY", new float[]{1.25f, 1.0f})});
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        animatorSet2.setDuration(100);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{animatorSet, animatorSet2});
        animatorSet3.start();
    }

    /* renamed from: b */
    public static void m19606b(int i, View view) {
        view.animate().cancel();
        view.setAlpha(0.0f);
        view.animate().setDuration((long) i).alpha(1.0f).setListener((Animator.AnimatorListener) null).start();
        view.setVisibility(0);
    }
}
