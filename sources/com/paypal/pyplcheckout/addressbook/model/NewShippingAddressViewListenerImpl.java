package com.paypal.pyplcheckout.addressbook.model;

import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalAddressBookHeaderViewListener;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalNewAddressHeaderViewListener;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalNewShippingAddressViewListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NewShippingAddressViewListenerImpl implements PayPalNewShippingAddressViewListener, PayPalAddressBookHeaderViewListener {
    private PayPalNewAddressHeaderViewListener payPalAddressBookHeaderViewListener;
    private PayPalNewShippingAddressViewListener payPalAddressBookInfoViewListener;

    public NewShippingAddressViewListenerImpl() {
        this((PayPalNewAddressHeaderViewListener) null, (PayPalNewShippingAddressViewListener) null, 3, (DefaultConstructorMarker) null);
    }

    public NewShippingAddressViewListenerImpl(PayPalNewAddressHeaderViewListener payPalNewAddressHeaderViewListener, PayPalNewShippingAddressViewListener payPalNewShippingAddressViewListener) {
        this.payPalAddressBookHeaderViewListener = payPalNewAddressHeaderViewListener;
        this.payPalAddressBookInfoViewListener = payPalNewShippingAddressViewListener;
    }

    public void onPayPalAddNewAddressClick() {
        PayPalNewShippingAddressViewListener payPalNewShippingAddressViewListener = this.payPalAddressBookInfoViewListener;
        if (payPalNewShippingAddressViewListener != null) {
            payPalNewShippingAddressViewListener.onPayPalAddNewAddressClick();
        }
    }

    public void onPayPalAddressSelected(int i) {
        PayPalNewShippingAddressViewListener payPalNewShippingAddressViewListener = this.payPalAddressBookInfoViewListener;
        if (payPalNewShippingAddressViewListener != null) {
            payPalNewShippingAddressViewListener.onPayPalAddressSelected(i);
        }
    }

    public void onPayPalBackArrowClick() {
        PayPalNewAddressHeaderViewListener payPalNewAddressHeaderViewListener = this.payPalAddressBookHeaderViewListener;
        if (payPalNewAddressHeaderViewListener != null) {
            payPalNewAddressHeaderViewListener.onPayPalBackArrowClick();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewShippingAddressViewListenerImpl(PayPalNewAddressHeaderViewListener payPalNewAddressHeaderViewListener, PayPalNewShippingAddressViewListener payPalNewShippingAddressViewListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalNewAddressHeaderViewListener, (i & 2) != 0 ? null : payPalNewShippingAddressViewListener);
    }
}
