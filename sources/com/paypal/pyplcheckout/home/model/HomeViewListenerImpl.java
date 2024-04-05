package com.paypal.pyplcheckout.home.model;

import android.view.View;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.interfaces.HomeViewListener;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalCheckoutButtonClickedListener;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalCompoundHeaderViewListener;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalCurrencyConversionViewListener;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalExpandedCartDetailsViewListener;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalPoliciesAndRightsLinkViewListener;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalShippingViewListener;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalSnappingRecyclerViewListener;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class HomeViewListenerImpl implements HomeViewListener {
    private PayPalCheckoutButtonClickedListener mPayPalCheckoutButtonClickedListener;
    private PayPalCompoundHeaderViewListener mPayPalCompoundHeaderViewListener;
    private PayPalCurrencyConversionViewListener mPayPalCurrencyConversionViewListener;
    private PayPalExpandedCartDetailsViewListener mPayPalExpandedCartDetailsViewListener;
    private PayPalPoliciesAndRightsLinkViewListener mPayPalPoliciesAndRightsLinkViewListener;
    private PayPalShippingViewListener mPayPalShippingViewListener;
    private PayPalSnappingRecyclerViewListener mPayPalSnappingRecyclerViewListener;

    public final PayPalCheckoutButtonClickedListener getMPayPalCheckoutButtonClickedListener() {
        return this.mPayPalCheckoutButtonClickedListener;
    }

    public final PayPalCompoundHeaderViewListener getMPayPalCompoundHeaderViewListener() {
        return this.mPayPalCompoundHeaderViewListener;
    }

    public final PayPalCurrencyConversionViewListener getMPayPalCurrencyConversionViewListener() {
        return this.mPayPalCurrencyConversionViewListener;
    }

    public final PayPalExpandedCartDetailsViewListener getMPayPalExpandedCartDetailsViewListener() {
        return this.mPayPalExpandedCartDetailsViewListener;
    }

    public final PayPalPoliciesAndRightsLinkViewListener getMPayPalPoliciesAndRightsLinkViewListener() {
        return this.mPayPalPoliciesAndRightsLinkViewListener;
    }

    public final PayPalShippingViewListener getMPayPalShippingViewListener() {
        return this.mPayPalShippingViewListener;
    }

    public final PayPalSnappingRecyclerViewListener getMPayPalSnappingRecyclerViewListener() {
        return this.mPayPalSnappingRecyclerViewListener;
    }

    public void initFundingOptionSelection(int i) {
        PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener = this.mPayPalSnappingRecyclerViewListener;
        if (payPalSnappingRecyclerViewListener != null) {
            payPalSnappingRecyclerViewListener.initFundingOptionSelection(i);
        }
    }

    public void onCartDetailsArrowClick(View view, int i, int i2) {
        C19383o.m32797g(view, "view");
        PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener = this.mPayPalExpandedCartDetailsViewListener;
        if (payPalExpandedCartDetailsViewListener != null) {
            payPalExpandedCartDetailsViewListener.onCartDetailsArrowClick(view, i, i2);
        }
    }

    public void onCheckoutViewClicked() {
        PayPalCheckoutButtonClickedListener payPalCheckoutButtonClickedListener = this.mPayPalCheckoutButtonClickedListener;
        if (payPalCheckoutButtonClickedListener != null) {
            payPalCheckoutButtonClickedListener.onCheckoutViewClicked();
        }
    }

    public void onCryptoRatesAndFeesClickListener() {
        PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener = this.mPayPalCurrencyConversionViewListener;
        if (payPalCurrencyConversionViewListener != null) {
            payPalCurrencyConversionViewListener.onCryptoRatesAndFeesClickListener();
        }
    }

    public void onCurrencyConversionViewClickListener() {
        PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener = this.mPayPalCurrencyConversionViewListener;
        if (payPalCurrencyConversionViewListener != null) {
            payPalCurrencyConversionViewListener.onCurrencyConversionViewClickListener();
        }
    }

    public void onEmptyCartDetailsReceived() {
        PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener = this.mPayPalExpandedCartDetailsViewListener;
        if (payPalExpandedCartDetailsViewListener != null) {
            payPalExpandedCartDetailsViewListener.onEmptyCartDetailsReceived();
        }
    }

    public void onFundingInstrumentSelected(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, List<? extends CardUiModel> list) {
        C19383o.m32797g(list, "listOfPaymentCards");
        PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener = this.mPayPalSnappingRecyclerViewListener;
        if (payPalSnappingRecyclerViewListener != null) {
            payPalSnappingRecyclerViewListener.onFundingInstrumentSelected(i, i2, z, z2, z3, z4, list);
        }
    }

    public void onPayPalLogoClicked() {
        PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener = this.mPayPalCompoundHeaderViewListener;
        if (payPalCompoundHeaderViewListener != null) {
            payPalCompoundHeaderViewListener.onPayPalLogoClicked();
        }
    }

    public void onPolicyAndRightsLinkClick() {
        PayPalPoliciesAndRightsLinkViewListener payPalPoliciesAndRightsLinkViewListener = this.mPayPalPoliciesAndRightsLinkViewListener;
        if (payPalPoliciesAndRightsLinkViewListener != null) {
            payPalPoliciesAndRightsLinkViewListener.onPolicyAndRightsLinkClick();
        }
    }

    public void onProfileImageHeaderClick() {
        PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener = this.mPayPalCompoundHeaderViewListener;
        if (payPalCompoundHeaderViewListener != null) {
            payPalCompoundHeaderViewListener.onProfileImageHeaderClick();
        }
    }

    public void onProfileInitialsHeaderClick() {
        PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener = this.mPayPalCompoundHeaderViewListener;
        if (payPalCompoundHeaderViewListener != null) {
            payPalCompoundHeaderViewListener.onProfileInitialsHeaderClick();
        }
    }

    public void onSeeMore72HourClicked() {
        PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener = this.mPayPalCurrencyConversionViewListener;
        if (payPalCurrencyConversionViewListener != null) {
            payPalCurrencyConversionViewListener.onSeeMore72HourClicked();
        }
    }

    public void onShippingMethodClickListener() {
        PayPalShippingViewListener payPalShippingViewListener = this.mPayPalShippingViewListener;
        if (payPalShippingViewListener != null) {
            payPalShippingViewListener.onShippingMethodClickListener();
        }
    }

    public void onShippingNameUpdated() {
        PayPalShippingViewListener payPalShippingViewListener = this.mPayPalShippingViewListener;
        if (payPalShippingViewListener != null) {
            payPalShippingViewListener.onShippingNameUpdated();
        }
    }

    public void onShippingViewClickListener() {
        PayPalShippingViewListener payPalShippingViewListener = this.mPayPalShippingViewListener;
        if (payPalShippingViewListener != null) {
            payPalShippingViewListener.onShippingViewClickListener();
        }
    }

    public void onUpdateAddCardViewState(int i, List<? extends CardUiModel> list) {
        C19383o.m32797g(list, "listOfPaymentCards");
        PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener = this.mPayPalSnappingRecyclerViewListener;
        if (payPalSnappingRecyclerViewListener != null) {
            payPalSnappingRecyclerViewListener.onUpdateAddCardViewState(i, list);
        }
    }

    public void setCurrencyPaddingViewVisible(boolean z) {
        PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener = this.mPayPalCurrencyConversionViewListener;
        if (payPalCurrencyConversionViewListener != null) {
            payPalCurrencyConversionViewListener.setCurrencyPaddingViewVisible(z);
        }
    }

    public final void setMPayPalCheckoutButtonClickedListener(PayPalCheckoutButtonClickedListener payPalCheckoutButtonClickedListener) {
        this.mPayPalCheckoutButtonClickedListener = payPalCheckoutButtonClickedListener;
    }

    public final void setMPayPalCompoundHeaderViewListener(PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener) {
        this.mPayPalCompoundHeaderViewListener = payPalCompoundHeaderViewListener;
    }

    public final void setMPayPalCurrencyConversionViewListener(PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener) {
        this.mPayPalCurrencyConversionViewListener = payPalCurrencyConversionViewListener;
    }

    public final void setMPayPalExpandedCartDetailsViewListener(PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener) {
        this.mPayPalExpandedCartDetailsViewListener = payPalExpandedCartDetailsViewListener;
    }

    public final void setMPayPalPoliciesAndRightsLinkViewListener(PayPalPoliciesAndRightsLinkViewListener payPalPoliciesAndRightsLinkViewListener) {
        this.mPayPalPoliciesAndRightsLinkViewListener = payPalPoliciesAndRightsLinkViewListener;
    }

    public final void setMPayPalShippingViewListener(PayPalShippingViewListener payPalShippingViewListener) {
        this.mPayPalShippingViewListener = payPalShippingViewListener;
    }

    public final void setMPayPalSnappingRecyclerViewListener(PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener) {
        this.mPayPalSnappingRecyclerViewListener = payPalSnappingRecyclerViewListener;
    }

    public void setUpInvoiceSummaryTotal(String str, boolean z) {
        C19383o.m32797g(str, "grandTotal");
        PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener = this.mPayPalExpandedCartDetailsViewListener;
        if (payPalExpandedCartDetailsViewListener != null) {
            payPalExpandedCartDetailsViewListener.setUpInvoiceSummaryTotal(str, z);
        }
    }
}
