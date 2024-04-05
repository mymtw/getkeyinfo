package com.paypal.pyplcheckout.home.view.customviews;

import android.view.View;
import androidx.compose.animation.C0388a;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.AddCardViewStateUpdateEvent;
import com.paypal.pyplcheckout.extensions.AnyExtensionsKt;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.customviews.productviews.CheckoutButtonBehaviourDescriptor;
import com.paypal.pyplcheckout.services.Repository;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class PayPalContinueButton$initEvents$4 implements EventListener {
    public final /* synthetic */ PayPalContinueButton this$0;

    public PayPalContinueButton$initEvents$4(PayPalContinueButton payPalContinueButton) {
        this.this$0 = payPalContinueButton;
    }

    /* access modifiers changed from: private */
    /* renamed from: onEvent$lambda-0  reason: not valid java name */
    public static final void m35301onEvent$lambda0(View view) {
        Events.Companion.getInstance().fire(PayPalEventTypes.NATIVE_ADD_CARD_BUTTON_CLICKED, (ResultData) null);
    }

    public void onEvent(EventType eventType, ResultData resultData) {
        C19383o.m32797g(eventType, "type");
        if (resultData != null) {
            Object data = ((Success) resultData).getData();
            if (data != null) {
                AddCardViewStateUpdateEvent addCardViewStateUpdateEvent = (AddCardViewStateUpdateEvent) data;
                this.this$0.addCardPosition = addCardViewStateUpdateEvent.getAddCardPosition();
                CardUiModel.AddCardUiModel addCard = addCardViewStateUpdateEvent.getAddCard();
                this.this$0.isAddCardMode = true;
                if (addCard instanceof CardUiModel.AddCardUiModel.Web) {
                    this.this$0.isActionButtonClickEnabled = true;
                    this.this$0.getMainPaysheetViewModel().setCallToActionState(Repository.CTAState.ADD_CARD);
                    this.this$0.button.setContentDescription(this.this$0.getResources().getString(C17165R.string.paypal_checkout_add_card_button));
                    PayPalContinueButton payPalContinueButton = this.this$0;
                    payPalContinueButton.updateCheckoutButton(C0388a.m1049e(new Object[]{payPalContinueButton.getResources().getString(C17165R.string.paypal_checkout_add_card)}, 1, "+ %s", "format(format, *args)"), new CheckoutButtonBehaviourDescriptor(CheckoutButtonBehaviourDescriptor.Type.ADD_CARD_BEHAVIOUR));
                    this.this$0.button.setOnClickListener(this.this$0);
                } else if (addCard instanceof CardUiModel.AddCardUiModel.Native) {
                    if (this.this$0.getAddCardViewModel().getAddCardLoadingState().getValue() instanceof AddCardViewModel.AddCardLoadingState.Loading) {
                        this.this$0.toggleLoadingState(true);
                    } else {
                        this.this$0.isActionButtonClickEnabled = true;
                        this.this$0.getMainPaysheetViewModel().setCallToActionState(Repository.CTAState.ADD_CARD);
                        this.this$0.button.setContentDescription(this.this$0.getResources().getString(C17165R.string.paypal_checkout_add_card_button));
                        PayPalContinueButton payPalContinueButton2 = this.this$0;
                        payPalContinueButton2.updateCheckoutButton(payPalContinueButton2.getResources().getString(C17165R.string.paypal_checkout_native_add_continue_button), new CheckoutButtonBehaviourDescriptor(CheckoutButtonBehaviourDescriptor.Type.PAY_NOW_BEHAVIOUR));
                    }
                    this.this$0.button.setOnClickListener(new C17245i());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                AnyExtensionsKt.getExhaustive(C19394m.f43287a);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.model.AddCardViewStateUpdateEvent");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.Success<*>");
    }
}
