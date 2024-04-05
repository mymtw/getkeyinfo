package com.etsy.android.stylekit.views;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.HorizontalScrollView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import kotlin.jvm.internal.C19383o;

public final class CollageRemovableActionGroup extends HorizontalScrollView {
    public static final int $stable = 0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRemovableActionGroup(Context context) {
        this(context, (AttributeSet) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    private final void addItemInternal(String str, View.OnClickListener onClickListener, int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, chipGroup(), false);
        C19383o.m32795e(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        Chip chip = (Chip) inflate;
        chip.setText(str);
        chip.setOnCloseIconClickListener(onClickListener);
        chipGroup().addView(chip);
    }

    private final ChipGroup chipGroup() {
        View childAt = getChildAt(0);
        C19383o.m32795e(childAt, "null cannot be cast to non-null type com.google.android.material.chip.ChipGroup");
        return (ChipGroup) childAt;
    }

    public final void addItem(String str, View.OnClickListener onClickListener) {
        C19383o.m32797g(str, ResponseConstants.LABEL);
        C19383o.m32797g(onClickListener, "removeListener");
        addItemInternal(str, onClickListener, R.layout.clg_actiongroup_removable_item);
    }

    public final void addItemSmall(String str, View.OnClickListener onClickListener) {
        C19383o.m32797g(str, ResponseConstants.LABEL);
        C19383o.m32797g(onClickListener, "removeListener");
        addItemInternal(str, onClickListener, R.layout.clg_actiongroup_removable_item_small);
    }

    public void removeView(View view) {
        chipGroup().removeView(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollageRemovableActionGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageRemovableActionGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        ChipGroup chipGroup = new ChipGroup(context);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.tap_target_size_sp));
        chipGroup.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.tap_target_size_sp));
        chipGroup.setClipToPadding(false);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        chipGroup.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        addView(chipGroup);
        LayoutTransition layoutTransition = new LayoutTransition();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object) null, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f})});
        C19383o.m32796f(ofPropertyValuesHolder, "ofPropertyValuesHolder(n…ofFloat(\"alpha\", 0f, 1f))");
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        layoutTransition.setStartDelay(2, 0);
        layoutTransition.setDuration(2, 300);
        layoutTransition.setAnimator(2, ofPropertyValuesHolder);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder((Object) null, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f})});
        C19383o.m32796f(ofPropertyValuesHolder2, "ofPropertyValuesHolder(n…ofFloat(\"alpha\", 1f, 0f))");
        ofPropertyValuesHolder2.setInterpolator(new FastOutSlowInInterpolator());
        layoutTransition.setStartDelay(3, 0);
        layoutTransition.setDuration(3, 300);
        layoutTransition.setAnimator(3, ofPropertyValuesHolder2);
        layoutTransition.setStartDelay(1, 100);
        layoutTransition.setDuration(1, 300);
        chipGroup().setLayoutTransition(layoutTransition);
    }
}
