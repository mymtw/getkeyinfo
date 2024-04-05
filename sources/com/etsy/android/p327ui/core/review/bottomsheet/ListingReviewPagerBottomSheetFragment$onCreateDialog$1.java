package com.etsy.android.p327ui.core.review.bottomsheet;

import android.app.Dialog;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.review.bottomsheet.ListingReviewPagerBottomSheetFragment$onCreateDialog$1 */
public final class ListingReviewPagerBottomSheetFragment$onCreateDialog$1 extends BottomSheetDialog {
    public final /* synthetic */ ListingReviewPagerBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewPagerBottomSheetFragment$onCreateDialog$1(ListingReviewPagerBottomSheetFragment listingReviewPagerBottomSheetFragment, FragmentActivity fragmentActivity) {
        super(fragmentActivity, R.style.RoundedCornerExpandedBottomSheetDialog);
        this.this$0 = listingReviewPagerBottomSheetFragment;
    }

    public void onStart() {
        Dialog dialog = this.this$0.getDialog();
        C19383o.m32795e(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetBehavior<FrameLayout> behavior = ((BottomSheetDialog) dialog).getBehavior();
        ListingReviewPagerBottomSheetFragment listingReviewPagerBottomSheetFragment = this.this$0;
        behavior.setPeekHeight(Resources.getSystem().getDisplayMetrics().heightPixels - (((int) TypedValue.applyDimension(1, listingReviewPagerBottomSheetFragment.getResources().getDimension(R.dimen.actionbar_height), listingReviewPagerBottomSheetFragment.getResources().getDisplayMetrics())) / 2));
        behavior.setSkipCollapsed(true);
        super.onStart();
    }
}
