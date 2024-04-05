package com.etsy.android.p327ui.core.listingpromotion;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.listingpromotion.ListingPromotionView$trackingClick$1 */
public final class ListingPromotionView$trackingClick$1 extends TrackingOnClickListener {
    public final /* synthetic */ C19857l<View, C19394m> $onClickLambda;

    public ListingPromotionView$trackingClick$1(C19857l<? super View, C19394m> lVar) {
        this.$onClickLambda = lVar;
    }

    public void onViewClick(View view) {
        this.$onClickLambda.invoke(view);
    }
}
