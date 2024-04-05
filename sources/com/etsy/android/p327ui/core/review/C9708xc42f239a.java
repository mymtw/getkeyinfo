package com.etsy.android.p327ui.core.review;

import android.content.Context;
import android.view.View;
import com.etsy.android.p327ui.core.review.ListingVideoReviewFragment;
import com.etsy.android.stylekit.views.CollagePlayerView;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;

/* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$slideReviewDetailsWithController$$inlined$doOnLayout$1 */
public final class C9708xc42f239a implements View.OnLayoutChangeListener {
    public final /* synthetic */ ListingVideoReviewFragment this$0;

    public C9708xc42f239a(ListingVideoReviewFragment listingVideoReviewFragment) {
        this.this$0 = listingVideoReviewFragment;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        View controlsView = ((CollagePlayerView) view).getControlsView();
        Integer valueOf = controlsView != null ? Integer.valueOf(controlsView.getHeight()) : null;
        if (valueOf != null) {
            this.this$0.updateBottomMargin(valueOf.intValue());
            Context requireContext = this.this$0.requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            float intValue = ((float) valueOf.intValue()) - ((float) C19543e0.m33295K(20, requireContext));
            CollagePlayerView access$getVideoViewCollage$p = this.this$0.videoViewCollage;
            if (access$getVideoViewCollage$p != null) {
                access$getVideoViewCollage$p.setControllerVisibilityListener(new ListingVideoReviewFragment.C9707d(this.this$0, intValue));
            } else {
                C19383o.m32805o("videoViewCollage");
                throw null;
            }
        }
    }
}
