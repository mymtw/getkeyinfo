package com.paypal.android.platform.authsdk.authcommon.views;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.C17049R;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProgressSpinnerView extends ConstraintLayout {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long FADE_ANIMATION_DURATION = 250;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(attributeSet, "attrs");
        View.inflate(context, C17049R.C17053layout.view_progress_spinner, this);
    }

    public final void hideProgressSpinner() {
        if (getVisibility() == 0) {
            animate().alpha(0.0f).setDuration(FADE_ANIMATION_DURATION).setListener(new ProgressSpinnerView$hideProgressSpinner$1(this));
        }
    }

    public final void showProgressSpinner() {
        if (!(getVisibility() == 0)) {
            setAlpha(0.0f);
            setVisibility(0);
            setClickable(true);
            setFocusable(true);
            animate().alpha(1.0f).setDuration(FADE_ANIMATION_DURATION).setListener((Animator.AnimatorListener) null);
        }
    }
}
