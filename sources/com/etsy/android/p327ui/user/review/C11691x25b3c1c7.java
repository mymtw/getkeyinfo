package com.etsy.android.p327ui.user.review;

import android.view.View;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$updateForwardButton$lambda-20$$inlined$doOnLayout$1 */
public final class C11691x25b3c1c7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ CreateReviewActivity this$0;

    public C11691x25b3c1c7(CreateReviewActivity createReviewActivity) {
        this.this$0 = createReviewActivity;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        if (ViewExtensions.m12858b(this.this$0.stepIndicatorView, this.this$0.forwardButton)) {
            ViewExtensions.m12860d(this.this$0.stepIndicatorView);
        } else {
            ViewExtensions.m12869m(this.this$0.stepIndicatorView);
        }
    }
}
