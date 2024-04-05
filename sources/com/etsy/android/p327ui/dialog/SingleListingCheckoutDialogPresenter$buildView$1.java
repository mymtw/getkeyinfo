package com.etsy.android.p327ui.dialog;

import android.view.View;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.googlepay.GooglePayCheckoutSpec;
import com.etsy.android.p327ui.core.listingnomapper.SingleListingCheckoutNavigationSpec;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SingleListingCheckoutKey;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.dialog.SingleListingCheckoutDialogPresenter$buildView$1 */
public final class SingleListingCheckoutDialogPresenter$buildView$1 extends TrackingOnClickListener {
    public final /* synthetic */ C9726b this$0;

    public SingleListingCheckoutDialogPresenter$buildView$1(C9726b bVar) {
        this.this$0 = bVar;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        C9726b bVar = this.this$0;
        String str = bVar.f21526f;
        String string = bVar.f21522b.getString(ResponseConstants.QUANTITY);
        if (string == null) {
            string = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        String str2 = string;
        String string2 = bVar.f21522b.getString(ResponseConstants.OFFERING_ID);
        String string3 = bVar.f21522b.getString(ResponseConstants.PERSONALIZATION);
        String string4 = bVar.f21522b.getString("listing_variation");
        if (bVar.f21524d != null) {
            C19846a<C19394m> aVar = bVar.f21523c;
            if (aVar != null) {
                aVar.invoke();
            }
            PaymentOption paymentOption = bVar.f21524d;
            C19383o.m32794d(paymentOption);
            C12788a.m20424c(bVar.f21521a.getActivity(), new SingleListingCheckoutKey(C19421p.m32935c0(bVar.f21521a.getActivity()), new SingleListingCheckoutNavigationSpec(str, str2, paymentOption, string2, string3, string4), (GooglePayCheckoutSpec) null, 4, (DefaultConstructorMarker) null));
            bVar.f21521a.getAnalyticsContext().mo21333d("show_single_listing_checkout_webview", new SingleListingCheckoutDialogPresenter$proceedToCheckout$2(str, bVar));
            this.this$0.f21521a.getAnalyticsContext().mo21333d("single_listing_checkout_tapped_buy_button", new SingleListingCheckoutDialogPresenter$buildView$1$onViewClick$1(this.this$0));
            return;
        }
        throw new IllegalStateException("selectedPaymentOption must not be null");
    }
}
