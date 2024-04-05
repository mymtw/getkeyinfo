package com.etsy.android.p327ui.listing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ListingFragment$googlePayUpdatesReceiver$1 */
public final class ListingFragment$googlePayUpdatesReceiver$1 extends BroadcastReceiver {
    public final /* synthetic */ ListingFragment this$0;

    public ListingFragment$googlePayUpdatesReceiver$1(ListingFragment listingFragment) {
        this.this$0 = listingFragment;
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        Object value = this.this$0.getViewModel().f22226g.getValue();
        GooglePayData googlePayData = null;
        ListingViewState.C10092d dVar = value instanceof ListingViewState.C10092d ? (ListingViewState.C10092d) value : null;
        if (dVar != null) {
            googlePayData = dVar.f22240h;
        }
        GooglePayData googlePayData2 = googlePayData;
        FragmentActivity activity = this.this$0.getActivity();
        if (googlePayData2 != null && activity != null) {
            intent.putExtra(CartWithSavedFragment.CHECKED_OUT_IS_MSCO, true);
            this.this$0.getGooglePayHelper().mo31652a(activity, googlePayData2, intent.getIntExtra(EtsyWebFragment.KEY_REQUEST_CODE, -1), intent.getIntExtra(EtsyWebFragment.KEY_RESULT_CODE, Integer.MIN_VALUE), intent, new ListingFragment$googlePayUpdatesReceiver$1$onReceive$1(this.this$0));
        }
    }
}
