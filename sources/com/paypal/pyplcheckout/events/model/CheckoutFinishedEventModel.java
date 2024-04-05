package com.paypal.pyplcheckout.events.model;

public final class CheckoutFinishedEventModel {
    private final boolean isAddCardMode;
    private final boolean isClickEnabled;

    public CheckoutFinishedEventModel(boolean z, boolean z2) {
        this.isClickEnabled = z;
        this.isAddCardMode = z2;
    }

    public final boolean isAddCardMode() {
        return this.isAddCardMode;
    }

    public final boolean isClickEnabled() {
        return this.isClickEnabled;
    }
}
