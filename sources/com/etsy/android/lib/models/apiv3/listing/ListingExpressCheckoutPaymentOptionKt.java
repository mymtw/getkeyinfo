package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.PaymentOption;
import kotlin.jvm.internal.C19383o;

public final class ListingExpressCheckoutPaymentOptionKt {
    public static final PaymentOption toPaymentOption(ListingExpressCheckoutPaymentOption listingExpressCheckoutPaymentOption) {
        C19383o.m32797g(listingExpressCheckoutPaymentOption, "<this>");
        PaymentOption paymentOption = new PaymentOption();
        paymentOption.setLabel(listingExpressCheckoutPaymentOption.getLabel());
        paymentOption.setPaymentMethod(listingExpressCheckoutPaymentOption.getPaymentMethod());
        Boolean selected = listingExpressCheckoutPaymentOption.getSelected();
        paymentOption.setSelected(selected != null ? selected.booleanValue() : false);
        paymentOption.setIconClasses(listingExpressCheckoutPaymentOption.getIconClasses());
        paymentOption.setInputId(listingExpressCheckoutPaymentOption.getInputId());
        paymentOption.setSubmitClasses(listingExpressCheckoutPaymentOption.getSubmitClasses());
        paymentOption.setSubmitText(listingExpressCheckoutPaymentOption.getSubmitText());
        return paymentOption;
    }
}
