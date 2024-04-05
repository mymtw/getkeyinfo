package com.paypal.checkout.paymentbutton;

import android.view.KeyEvent;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.activities.PYPLInitiateCheckoutActivity;
import com.paypal.pyplcheckout.home.view.customviews.PayPalHomeBodyContainer;
import com.paypal.pyplcheckout.home.view.customviews.ShippingView;
import com.paypal.pyplcheckout.threeds.view.customviews.PayPalThreeDSV1StepUpView;

/* renamed from: com.paypal.checkout.paymentbutton.a */
public final /* synthetic */ class C17143a implements EventListener {

    /* renamed from: a */
    public final /* synthetic */ int f37520a;

    /* renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f37521b;

    public /* synthetic */ C17143a(KeyEvent.Callback callback, int i) {
        this.f37520a = i;
        this.f37521b = callback;
    }

    public final void onEvent(EventType eventType, ResultData resultData) {
        switch (this.f37520a) {
            case 0:
                PaymentButton.m35146eligibilityEventListener$lambda0((PaymentButton) this.f37521b, eventType, resultData);
                return;
            case 1:
                PYPLInitiateCheckoutActivity.m35263parseOriginFinishedListener$lambda0((PYPLInitiateCheckoutActivity) this.f37521b, eventType, resultData);
                return;
            case 2:
                PayPalHomeBodyContainer.m35334contingencyEventListener$lambda1((PayPalHomeBodyContainer) this.f37521b, eventType, resultData);
                return;
            case 3:
                ShippingView.m35388initEvents$lambda9((ShippingView) this.f37521b, eventType, resultData);
                return;
            default:
                PayPalThreeDSV1StepUpView.m35445init$lambda0((PayPalThreeDSV1StepUpView) this.f37521b, eventType, resultData);
                return;
        }
    }
}
