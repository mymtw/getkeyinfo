package com.etsy.android.p327ui.core.review;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.review.ListingReviewPagerAdapter$instantiateItem$1 */
public final class ListingReviewPagerAdapter$instantiateItem$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewPagerAdapter$instantiateItem$1(View view) {
        super(0);
        this.$view = view;
    }

    public final void invoke() {
        if ((((ConstraintLayout) this.$view.findViewById(R.id.review_parent_layout)) == null || ((ScrollView) this.$view.findViewById(R.id.review_scrollview)) == null || ((ConstraintLayout) this.$view.findViewById(R.id.review_parent_layout)).getHeight() <= ((ScrollView) this.$view.findViewById(R.id.review_scrollview)).getHeight()) ? false : true) {
            int paddingStart = ((ConstraintLayout) this.$view.findViewById(R.id.review_parent_layout)).getPaddingStart();
            int paddingEnd = ((ConstraintLayout) this.$view.findViewById(R.id.review_parent_layout)).getPaddingEnd();
            int paddingTop = ((ConstraintLayout) this.$view.findViewById(R.id.review_parent_layout)).getPaddingTop();
            Context context = this.$view.getContext();
            C19383o.m32796f(context, "view.context");
            ((ConstraintLayout) this.$view.findViewById(R.id.review_parent_layout)).setPadding(paddingStart, paddingTop, paddingEnd, C19543e0.m33295K(60, context));
        }
    }
}
