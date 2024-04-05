package com.etsy.android.p327ui.cart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.EtsyWebFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$checkoutCanceledReceiver$1 */
public final class MultiShopCartFragment$checkoutCanceledReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ MultiShopCartFragment this$0;

    public MultiShopCartFragment$checkoutCanceledReceiver$1(MultiShopCartFragment multiShopCartFragment) {
        this.this$0 = multiShopCartFragment;
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (C19383o.m32792b(EtsyWebFragment.ACTION_RESULT_CANCELED, intent != null ? intent.getAction() : null)) {
            this.this$0.handleCheckoutCanceled(intent);
            this.this$0.needsRefresh = true;
        }
    }
}
