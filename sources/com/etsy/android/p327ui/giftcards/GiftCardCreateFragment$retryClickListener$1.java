package com.etsy.android.p327ui.giftcards;

import android.view.View;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.giftcards.GiftCardCreateFragment$retryClickListener$1 */
public final class GiftCardCreateFragment$retryClickListener$1 extends TrackingOnClickListener {
    public final /* synthetic */ GiftCardCreateFragment this$0;

    public GiftCardCreateFragment$retryClickListener$1(GiftCardCreateFragment giftCardCreateFragment) {
        this.this$0 = giftCardCreateFragment;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.startLoading();
    }
}
