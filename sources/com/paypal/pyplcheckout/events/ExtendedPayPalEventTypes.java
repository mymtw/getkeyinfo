package com.paypal.pyplcheckout.events;

public enum ExtendedPayPalEventTypes implements EventType {
    FINISHED_FIREBASE_AUTH("Finished session Auth from FireBase"),
    RECEIVED_CHECKOUT_COMPLETE_RESPONSE("Received a response from SPB for out checkout complete request"),
    SPB_REQUESTED_CLOSE("SPB sent a request to close our Exp."),
    SHIPPING_CALLBACK_REQUEST_SENT("Shipping callback request sent"),
    SHIPPING_CALLBACK_RESPONSE_RECEIVED("Shipping callback response received"),
    FINISHED_SETTING_SPB_PROPS("Finished setting SPB PROPS, now Login"),
    KILL_APP_CANCEL_TB_TIMER("Cancel Props timer, app being killed"),
    INSTRUMENTATION_SENT("Instrumentation event sent"),
    CONTINGENCY_ERROR("Errors in CheckoutSession contain contingencies"),
    SDK_SHUT_DOWN("SDK was instructed to shut down");
    
    private final String payPalEventDescription;

    private ExtendedPayPalEventTypes(String str) {
        this.payPalEventDescription = str;
    }

    public String getDescription() {
        return this.payPalEventDescription;
    }
}
