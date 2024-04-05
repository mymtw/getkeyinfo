package com.etsy.android.p327ui.giftcards;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.giftcards.GiftCardCreateFragment$onCreateView$3 */
public final class GiftCardCreateFragment$onCreateView$3 extends TrackingOnClickListener {
    public final /* synthetic */ GiftCardCreateFragment this$0;

    public GiftCardCreateFragment$onCreateView$3(GiftCardCreateFragment giftCardCreateFragment) {
        this.this$0 = giftCardCreateFragment;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.onAddToCart();
    }
}
