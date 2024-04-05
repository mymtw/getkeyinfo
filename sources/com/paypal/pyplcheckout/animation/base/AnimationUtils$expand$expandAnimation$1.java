package com.paypal.pyplcheckout.animation.base;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.appboy.Constants;
import kotlin.jvm.internal.C19383o;

public final class AnimationUtils$expand$expandAnimation$1 extends Animation {
    public final /* synthetic */ int $targetHeight;
    public final /* synthetic */ View $view;

    public AnimationUtils$expand$expandAnimation$1(View view, int i) {
        this.$view = view;
        this.$targetHeight = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        C19383o.m32797g(transformation, Constants.APPBOY_PUSH_TITLE_KEY);
        ViewGroup.LayoutParams layoutParams = this.$view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? -2 : (int) (((float) this.$targetHeight) * f);
            this.$view.requestLayout();
        }
    }

    public boolean willChangeBounds() {
        return true;
    }
}
