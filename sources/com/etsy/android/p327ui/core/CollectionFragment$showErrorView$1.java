package com.etsy.android.p327ui.core;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$showErrorView$1 */
public final class CollectionFragment$showErrorView$1 extends TrackingOnClickListener {
    public final /* synthetic */ CollectionFragment this$0;

    public CollectionFragment$showErrorView$1(CollectionFragment collectionFragment) {
        this.this$0 = collectionFragment;
    }

    public void onViewClick(View view) {
        this.this$0.onSearchCleared();
    }
}
