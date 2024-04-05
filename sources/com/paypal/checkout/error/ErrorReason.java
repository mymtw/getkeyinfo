package com.paypal.checkout.error;

public enum ErrorReason {
    USER_AND_CHECKOUT_ERROR("Error with user and checkout response"),
    CURRENCY_CONVERSION_ERROR("Error updating currency conversion"),
    CREATE_ORDER_ERROR("Error creating order"),
    APPROVE_ORDER_ERROR("Error approving order"),
    PATCH_ORDER_ERROR("Error patching order"),
    AUTHENTICATION_ERROR("Error authenticating buyer"),
    ELIGIBILITY_ERROR("Error getting buyer eligibility"),
    SHIPPING_CHANGE_ERROR("Error with buyer shipping change"),
    CANCEL_URL_ERROR("Error getting cancel URL"),
    FEATURE_NOT_SUPPORTED_ERROR("Feature not supported error"),
    CONTINGENCIES_ERROR("Error with user contingencies"),
    FUNDING_ELIGIBILITY_ERROR("Error with funding eligibility"),
    THREE_DS_ERROR("Error with 3ds"),
    CONTINGENCY_CLEARED_ERROR("Error clearing strong customer authentication contingency"),
    STRONG_CUSTOMER_AUTHENTICATION_ERROR("Error completing strong customer authentication contingency"),
    CLIENT_CONFIG_UPDATE_ERROR("Error updating Client Config"),
    NO_INTERNET_CONNECTION("There is no internet connection"),
    NO_ORDER_ID_PRESENT_ERROR("The received URI has no orderID parameter"),
    NONE("none");
    
    private final String reason;

    private ErrorReason(String str) {
        this.reason = str;
    }

    public final String getReason() {
        return this.reason;
    }
}
