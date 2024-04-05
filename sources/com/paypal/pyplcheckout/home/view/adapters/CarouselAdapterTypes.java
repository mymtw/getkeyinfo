package com.paypal.pyplcheckout.home.view.adapters;

public enum CarouselAdapterTypes {
    FUNDING_OPTION(0),
    BNPL_OFFER(1),
    WEB_ADD_CARD(2),
    NATIVE_ADD_CARD(3);
    
    private final int value;

    private CarouselAdapterTypes(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
