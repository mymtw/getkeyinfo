package com.paypal.pyplcheckout.addressbook.model;

import com.paypal.pyplcheckout.addressbook.view.interfaces.AddressBookViewListener;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalAddressBookHeaderViewListener;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalAddressBookInfoViewListener;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AddressBookViewListenerImpl implements AddressBookViewListener {
    private PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener;
    private PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener;

    public AddressBookViewListenerImpl() {
        this((PayPalAddressBookHeaderViewListener) null, (PayPalAddressBookInfoViewListener) null, 3, (DefaultConstructorMarker) null);
    }

    public AddressBookViewListenerImpl(PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener2, PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener2) {
        this.payPalAddressBookHeaderViewListener = payPalAddressBookHeaderViewListener2;
        this.payPalAddressBookInfoViewListener = payPalAddressBookInfoViewListener2;
    }

    public void onPayPalAddNewAddressClick() {
        PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener2 = this.payPalAddressBookInfoViewListener;
        if (payPalAddressBookInfoViewListener2 != null) {
            payPalAddressBookInfoViewListener2.onPayPalAddNewAddressClick();
        }
    }

    public void onPayPalAddressSelected(int i) {
        PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener2 = this.payPalAddressBookInfoViewListener;
        if (payPalAddressBookInfoViewListener2 != null) {
            payPalAddressBookInfoViewListener2.onPayPalAddressSelected(i);
        }
    }

    public void onPayPalBackArrowClick() {
        PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener2 = this.payPalAddressBookHeaderViewListener;
        if (payPalAddressBookHeaderViewListener2 != null) {
            payPalAddressBookHeaderViewListener2.onPayPalBackArrowClick();
        }
    }

    public void onPayPalPickUpSelected(int i, ShippingMethodType shippingMethodType) {
        C19383o.m32797g(shippingMethodType, "shippingMethodType");
        PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener2 = this.payPalAddressBookInfoViewListener;
        if (payPalAddressBookInfoViewListener2 != null) {
            payPalAddressBookInfoViewListener2.onPayPalPickUpSelected(i, shippingMethodType);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressBookViewListenerImpl(PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener2, PayPalAddressBookInfoViewListener payPalAddressBookInfoViewListener2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : payPalAddressBookHeaderViewListener2, (i & 2) != 0 ? null : payPalAddressBookInfoViewListener2);
    }
}
