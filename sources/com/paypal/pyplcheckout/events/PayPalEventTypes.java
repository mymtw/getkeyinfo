package com.paypal.pyplcheckout.events;

public enum PayPalEventTypes implements EventType {
    FINISHED_CLIENT_CONFIG_UPDATE("Finished Client Config Update"),
    FINISHED_ELIGIBILITY_CALL("Finished eligibility call"),
    FINISHED_USER_CHECKOUT_RESPONSE("Finished fetching user checkout response"),
    FINISHED_CRYPTO_QUOTE_RESPONSE("Finished fetching cryptocurrency quote response"),
    FINISHED_CHECKOUT_ON_APPROVE("Checking onApprove complete"),
    FINISHED_FINAL_ANIMATION("Finished final checkout animation"),
    FINISHED_PRE_REVIEW_CALLS("Finished pre review calls"),
    FINISHED_POST_REVIEW_CALLS("Finished post review calls"),
    FINISHED_POST_APPROVE_CALLS("Finished post approve calls"),
    FINALIZE_CHECKOUT("Finalize checkout"),
    FINISH_CHECKOUT("Finish checkout"),
    START_THREE_DS_FLOW_REQUEST("Start three DS flow request"),
    SCA_ON_CONTINGENCY_CLEARED("SCA on contingency cleared"),
    BACK_BTN_BLOCK_REQUEST("Back button block request"),
    CTA_BTN_BLOCK_REQUEST("CTA button block request"),
    DISABLE_VIEWS_TOUCH_INTERACTION("Disable views touch interaction"),
    CART_DETAILS_EXPANDING("Cart details expanding"),
    OUTSIDE_SCREEN_CLICK_TRIGGERED("Outside screen click triggered"),
    CAROUSEL_ADD_CARD_POSITION_TRIGGERED("Carousel add card position triggered"),
    CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED("Carousel credit offer position triggered"),
    CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED("Carousel pay in four position triggered"),
    CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED("Carousel funding instrument position triggered"),
    CAROUSEL_SCROLLABILITY_CHANGE("Carousel scrollability change"),
    CHECKOUT_BUTTON_CLICKED("Checkout button clicked"),
    CHECKOUT_BUTTON_UI_RENDER_REQUESTED("Checkout button ui render requested"),
    START_FRAGMENT("Start fragment"),
    FINISH_FRAGMENT("Finish fragment"),
    FINISH_ACTIVITY_AND_SHOW_PAY_SHEET("Finish activity and show pay sheet"),
    START_ACTIVITY_AND_HIDE_PAY_SHEET("Start activity and hide pay sheet"),
    SHIPPING_CHANGES_NEW_SHIPPING_ADDRESS_SELECTED("Shipping changes - [new shipping address selected]"),
    SHIPPING_CHANGES_INVALID_SHIPPING_ADDRESS("Shipping changes - [invalid shipping address]"),
    PATCH_SHIPPING_CHANGES_ERROR("Shipping changes - [error]"),
    PATCH_SHIPPING_CHANGES_NEW_SHIPPING_ADDRESS_SELECTED("Shipping changes - [new shipping address selected]"),
    PATCH_SHIPPING_CHANGES_REFRESH_IS_COMPLETE("Patch Shipping changes - [refresh is complete]"),
    SHIPPING_CHANGES_REFRESH_IS_PENDING("Shipping changes - [refresh is pending]"),
    SHIPPING_CHANGES_REFRESH_IS_COMPLETED("Shipping changes - [refresh is completed]"),
    SHIPPING_CHANGES_INVALID_SHIPPING_METHOD("Shipping changes - [invalid shipping method]"),
    THREE_DS_DECISIONING_FLOW_FINISHED("Three DS Decisioning complete with a lookup result"),
    THREE_DS_RESOLVE_CONTINGENCY_FLOW_FINISHED("Three DS contingency is finalized with checkout session"),
    NATIVE_CHECKOUT_PAY_SHEET_LIFE_CYCLE("Native checkout pay sheet life cycle"),
    FINISHED_APPROVE_PAYMENT_CALL("Finished approve payment call"),
    FETCH_USER_DATA_COMPLETE("User data fetch complete, stop animation"),
    CONTINGENCY_EVENT("Contingency event"),
    THREE_DS_V1_STEP_UP_CLOSING("3DS v1 step up closing"),
    THREE_DS_V1_CANCEL_CLICKED("3DS v1 cancel clicked"),
    START_THREE_DS_V1_FLOW("start_three_ds_v1_flow"),
    USER_LOGOUT("user_logout"),
    CLEARED_THREE_DS_CONTINGENCIES("clear of all 3ds contingencies"),
    MAKE_PLANNING_CALL("Make planning call"),
    SHOW_NATIVE_ADD_CARD("show the native add card flow"),
    FUNDING_ELIGIBILITY_RESPONSE("Funding elgibility response"),
    NEW_SHIPPING_ADDRESS_REQUESTED("A new shipping address was requested"),
    NEW_SHIPPING_ADDRESS_RESULT("Response for adding a new shipping address"),
    CHECKOUT_PARAMS_SET("setup onboarding"),
    NATIVE_ADD_CARD_BUTTON_CLICKED("native add card button clicked"),
    REFRESH_CAROUSEL("refresh carousel"),
    CTA_LOADING_SPINNER("start the loading spinner on the cta"),
    VALIDATE_ADDRESS_API_REQUESTED("validate address api requested"),
    VALIDATE_ADDRESS_API_STARTED("validate address api started"),
    VALIDATE_ADDRESS_API_FINISHED("validate address api finished"),
    START_FINAL_LOADING_ANIMATION("start the final loading animation"),
    SHOW_SPINNER_BASED_ON_TREATMENT("show loading spinner based on treatment"),
    FINISHED_ORIGIN_URI_PARSING("finish parsing origin uri"),
    FETCH_USER_AND_CHECKOUT_ATTEMPTED("Attempted fetching user and checkout"),
    POST_AUTH_SUCCESS_HANDLER_RESPONSE("post auth success handler response"),
    USER_ACCEPTED_CRYPTO_CURRENCY_CONSENT("user_accepted_crypto_currency_consent");
    
    private final String payPalEventDescription;

    private PayPalEventTypes(String str) {
        this.payPalEventDescription = str;
    }

    public String getDescription() {
        return this.payPalEventDescription;
    }
}
