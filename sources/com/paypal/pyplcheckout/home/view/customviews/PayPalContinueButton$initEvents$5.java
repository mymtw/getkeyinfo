package com.paypal.pyplcheckout.home.view.customviews;

import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.FundingInstrumentSelectedEvent;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.customviews.productviews.CheckoutButtonBehaviourDescriptor;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.services.Repository;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class PayPalContinueButton$initEvents$5 implements EventListener {
    public final /* synthetic */ PayPalContinueButton this$0;

    public PayPalContinueButton$initEvents$5(PayPalContinueButton payPalContinueButton) {
        this.this$0 = payPalContinueButton;
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        if (resultData != null) {
            Object data = ((Success) resultData).getData();
            if (data != null) {
                FundingInstrumentSelectedEvent fundingInstrumentSelectedEvent = (FundingInstrumentSelectedEvent) data;
                int selectedPosition = fundingInstrumentSelectedEvent.getSelectedPosition();
                List<CardUiModel> listOfPaymentCards = fundingInstrumentSelectedEvent.getListOfPaymentCards();
                if ((selectedPosition < fundingInstrumentSelectedEvent.getFundingOptionsListSize() || selectedPosition < this.this$0.addCardPosition) && this.this$0.isAddCardMode) {
                    this.this$0.isAddCardMode = false;
                }
                if (!(listOfPaymentCards.get(selectedPosition) instanceof CardUiModel.AddCardUiModel) && (this.this$0.getMainPaysheetViewModel().getCurrentPayMode() == Repository.PayModeEnum.CONTINUE || this.this$0.getMainPaysheetViewModel().getCurrentPayMode() == Repository.PayModeEnum.PAY_NOW)) {
                    if (this.this$0.isInvalidShippingAddress) {
                        this.this$0.isActionButtonClickEnabled = false;
                        PayPalContinueButton payPalContinueButton = this.this$0;
                        payPalContinueButton.updateCheckoutButton(payPalContinueButton.getResources().getString(C17165R.string.paypal_checkout_choose_a_new_address), new CheckoutButtonBehaviourDescriptor(CheckoutButtonBehaviourDescriptor.Type.PAY_NOW_BEHAVIOUR));
                    }
                    if (this.this$0.isInvalidShippingMethod) {
                        this.this$0.isActionButtonClickEnabled = false;
                        ShippingMethods selectedShippingMethod = SdkComponent.Companion.getInstance().getRepository().getSelectedShippingMethod();
                        if ((selectedShippingMethod == null ? null : selectedShippingMethod.getType()) == ShippingMethodType.Type.PICKUP) {
                            PayPalContinueButton payPalContinueButton2 = this.this$0;
                            payPalContinueButton2.updateCheckoutButton(payPalContinueButton2.getResources().getString(C17165R.string.paypal_checkout_choose_new_pickup_method), new CheckoutButtonBehaviourDescriptor(CheckoutButtonBehaviourDescriptor.Type.PAY_NOW_BEHAVIOUR));
                        } else {
                            PayPalContinueButton payPalContinueButton3 = this.this$0;
                            payPalContinueButton3.updateCheckoutButton(payPalContinueButton3.getResources().getString(C17165R.string.paypal_checkout_choose_new_shipping_method), new CheckoutButtonBehaviourDescriptor(CheckoutButtonBehaviourDescriptor.Type.PAY_NOW_BEHAVIOUR));
                        }
                    }
                    if (!this.this$0.isInvalidShippingAddress && !this.this$0.isInvalidShippingMethod && !this.this$0.isAddCardMode && this.this$0.isActionButtonClickEnabled) {
                        this.this$0.setCheckoutText();
                    }
                    this.this$0.isAddCardMode = false;
                }
                if (listOfPaymentCards.get(selectedPosition) instanceof CardUiModel.AddCardUiModel) {
                    this.this$0.isAddCardMode = true;
                }
                this.this$0.button.setOnClickListener(this.this$0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.model.FundingInstrumentSelectedEvent");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.Success<*>");
    }
}
