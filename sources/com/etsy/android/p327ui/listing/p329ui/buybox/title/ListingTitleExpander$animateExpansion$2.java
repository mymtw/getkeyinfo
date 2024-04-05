package com.etsy.android.p327ui.listing.p329ui.buybox.title;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.title.ListingTitleExpander$animateExpansion$2 */
public final class ListingTitleExpander$animateExpansion$2 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup.LayoutParams $layoutParams;
    public final /* synthetic */ TextView $listingTitle;

    public ListingTitleExpander$animateExpansion$2(ViewGroup.LayoutParams layoutParams, TextView textView) {
        this.$layoutParams = layoutParams;
        this.$listingTitle = textView;
    }

    public void onAnimationEnd(Animator animator) {
        C19383o.m32797g(animator, ResponseConstants.ANIMATION);
        this.$layoutParams.height = -2;
        this.$listingTitle.requestLayout();
        this.$listingTitle.setTextIsSelectable(true);
    }
}
