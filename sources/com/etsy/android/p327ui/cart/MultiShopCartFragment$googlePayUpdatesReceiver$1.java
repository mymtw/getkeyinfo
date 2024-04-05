package com.etsy.android.p327ui.cart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.EtsyWebFragment;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$googlePayUpdatesReceiver$1 */
public final class MultiShopCartFragment$googlePayUpdatesReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ MultiShopCartFragment this$0;

    public MultiShopCartFragment$googlePayUpdatesReceiver$1(MultiShopCartFragment multiShopCartFragment) {
        this.this$0 = multiShopCartFragment;
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (intent != null) {
            this.this$0.processGooglePayRequest(intent.getIntExtra(EtsyWebFragment.KEY_REQUEST_CODE, -1), intent.getIntExtra(EtsyWebFragment.KEY_RESULT_CODE, Integer.MIN_VALUE), intent);
        }
    }
}
