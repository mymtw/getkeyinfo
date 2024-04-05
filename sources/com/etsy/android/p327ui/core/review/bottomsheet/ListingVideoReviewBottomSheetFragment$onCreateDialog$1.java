package com.etsy.android.p327ui.core.review.bottomsheet;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.C2290c1;
import androidx.core.view.C2364y;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.review.bottomsheet.ListingVideoReviewBottomSheetFragment$onCreateDialog$1 */
public final class ListingVideoReviewBottomSheetFragment$onCreateDialog$1 extends BottomSheetDialog {
    public final /* synthetic */ ListingVideoReviewBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingVideoReviewBottomSheetFragment$onCreateDialog$1(ListingVideoReviewBottomSheetFragment listingVideoReviewBottomSheetFragment, FragmentActivity fragmentActivity) {
        super(fragmentActivity, R.style.BottomSheetNoFloatingWithTransparentStatusBar);
        this.this$0 = listingVideoReviewBottomSheetFragment;
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.this$0.getDialog();
        C19383o.m32795e(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        behavior.setState(3);
        behavior.setDraggable(false);
        Window window = bottomSheetDialog.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                window.setDecorFitsSystemWindows(false);
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
            }
            C2290c1 h = C2364y.m5193h(window.getDecorView());
            if (h != null) {
                h.f5551a.mo8888b();
            }
        }
    }
}
