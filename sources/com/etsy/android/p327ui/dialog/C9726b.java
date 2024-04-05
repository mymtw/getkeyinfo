package com.etsy.android.p327ui.dialog;

import android.os.Bundle;
import android.widget.Button;
import com.etsy.android.R;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.SingleListingCheckout;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.dialog.b */
public final class C9726b {

    /* renamed from: a */
    public final TrackingBaseFragment f21521a;

    /* renamed from: b */
    public final Bundle f21522b;

    /* renamed from: c */
    public final C19846a<C19394m> f21523c;

    /* renamed from: d */
    public PaymentOption f21524d;

    /* renamed from: e */
    public Button f21525e;

    /* renamed from: f */
    public final String f21526f;

    /* renamed from: g */
    public final SingleListingCheckout f21527g;

    public C9726b(TrackingBaseFragment trackingBaseFragment, Bundle bundle, C19846a<C19394m> aVar) {
        C19383o.m32797g(trackingBaseFragment, "fragment");
        this.f21521a = trackingBaseFragment;
        this.f21522b = bundle;
        this.f21523c = aVar;
        String string = bundle.getString("listing_id");
        if (string != null) {
            this.f21526f = string;
            SingleListingCheckout singleListingCheckout = (SingleListingCheckout) bundle.getParcelable(ResponseConstants.SINGLE_LISTING_CHECKOUT);
            if (singleListingCheckout != null) {
                this.f21527g = singleListingCheckout;
                return;
            }
            throw new IllegalStateException("Listing is null.");
        }
        throw new IllegalStateException("Listing ID is null. Listing must have an ID for checkout.");
    }

    /* renamed from: a */
    public final void mo32582a(PaymentOption paymentOption) {
        if (paymentOption == null) {
            return;
        }
        if (C19383o.m32792b("paypal", paymentOption.getPaymentMethod())) {
            Button button = this.f21525e;
            if (button != null) {
                button.setText(this.f21521a.getString(R.string.listing_proceed_to_checkout_paypal));
            }
        } else if (paymentOption.isKlarnaInstallments()) {
            Button button2 = this.f21525e;
            if (button2 != null) {
                button2.setText(paymentOption.getSubmitText());
            }
        } else {
            Button button3 = this.f21525e;
            if (button3 != null) {
                button3.setText(this.f21521a.getString(R.string.listing_proceed_to_checkout));
            }
        }
    }
}
