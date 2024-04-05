package com.etsy.android.p327ui.core;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12788a;
import p356ge.C12790b;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$showErrorView$2 */
public final class CollectionFragment$showErrorView$2 extends TrackingOnClickListener {
    public final /* synthetic */ CollectionFragment this$0;

    public CollectionFragment$showErrorView$2(CollectionFragment collectionFragment) {
        this.this$0 = collectionFragment;
    }

    public void onViewClick(View view) {
        C12788a.m20424c(this.this$0.getActivity(), new HomePagerKey(C12790b.m20432d(this.this$0), (Bundle) null, true, 2, (DefaultConstructorMarker) null));
    }
}
