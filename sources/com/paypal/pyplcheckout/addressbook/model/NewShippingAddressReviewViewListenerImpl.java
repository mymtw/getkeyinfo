package com.paypal.pyplcheckout.addressbook.model;

import com.paypal.pyplcheckout.addressbook.view.interfaces.AddressBookViewListener;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalNewAddressReviewHeaderViewListener;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalNewShippingAddressReviewViewListener;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalAddNewShippingAddressButtonClickedListener;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NewShippingAddressReviewViewListenerImpl implements AddressBookViewListener {
    private PayPalAddNewShippingAddressButtonClickedListener payPalAddButtonClickedListener;
    private PayPalNewAddressReviewHeaderViewListener payPalAddressReviewHeaderViewListener;
    private PayPalNewShippingAddressReviewViewListener payPalAddressReviewViewListener;

    public NewShippingAddressReviewViewListenerImpl() {
        this((PayPalNewAddressReviewHeaderViewListener) null, (PayPalNewShippingAddressReviewViewListener) null, (PayPalAddNewShippingAddressButtonClickedListener) null, 7, (DefaultConstructorMarker) null);
    }

    public NewShippingAddressReviewViewListenerImpl(PayPalNewAddressReviewHeaderViewListener payPalNewAddressReviewHeaderViewListener, PayPalNewShippingAddressReviewViewListener payPalNewShippingAddressReviewViewListener, PayPalAddNewShippingAddressButtonClickedListener payPalAddNewShippingAddressButtonClickedListener) {
        this.payPalAddressReviewHeaderViewListener = payPalNewAddressReviewHeaderViewListener;
        this.payPalAddressReviewViewListener = payPalNewShippingAddressReviewViewListener;
        this.payPalAddButtonClickedListener = payPalAddNewShippingAddressButtonClickedListener;
    }

    public void onPayPalAddNewAddressClick() {
        PayPalNewShippingAddressReviewViewListener payPalNewShippingAddressReviewViewListener = this.payPalAddressReviewViewListener;
        if (payPalNewShippingAddressReviewViewListener != null) {
            payPalNewShippingAddressReviewViewListener.onPayPalAddNewAddressReviewClick();
        }
    }

    public void onPayPalAddressSelected(int i) {
        PayPalNewShippingAddressReviewViewListener payPalNewShippingAddressReviewViewListener = this.payPalAddressReviewViewListener;
        if (payPalNewShippingAddressReviewViewListener != null) {
            payPalNewShippingAddressReviewViewListener.onPayPalAddressSelected(i);
        }
    }

    public void onPayPalBackArrowClick() {
        PayPalNewAddressReviewHeaderViewListener payPalNewAddressReviewHeaderViewListener = this.payPalAddressReviewHeaderViewListener;
        if (payPalNewAddressReviewHeaderViewListener != null) {
            payPalNewAddressReviewHeaderViewListener.onPayPalBackArrowClick();
        }
    }

    public void onPayPalPickUpSelected(int i, ShippingMethodType shippingMethodType) {
        C19383o.m32797g(shippingMethodType, "shippingMethodType");
        PayPalNewShippingAddressReviewViewListener payPalNewShippingAddressReviewViewListener = this.payPalAddressReviewViewListener;
        if (payPalNewShippingAddressReviewViewListener != null) {
            payPalNewShippingAddressReviewViewListener.onPayPalPickUpSelected(i, shippingMethodType);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewShippingAddressReviewViewListenerImpl(PayPalNewAddressReviewHeaderViewListener payPalNewAddressReviewHeaderViewListener, PayPalNewShippingAddressReviewViewListener payPalNewShippingAddressReviewViewListener, PayPalAddNewShippingAddressButtonClickedListener payPalAddNewShippingAddressButtonClickedListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalNewAddressReviewHeaderViewListener, (i & 2) != 0 ? null : payPalNewShippingAddressReviewViewListener, (i & 4) != 0 ? null : payPalAddNewShippingAddressButtonClickedListener);
    }
}
