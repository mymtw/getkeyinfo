package com.paypal.pyplcheckout.model;

public enum PaymentProcessors {
    VISA(0, 0, 19, 3, (int) null),
    MASTERCARD(0, 0, 0, 7, (int) null),
    AMEX(15, 4, 15),
    DISCOVER(0, 0, 19, 3, (int) null),
    DINERSCLUB(16, 0, 19, 2, (int) null),
    CHINAUNIONPAY(0, 0, 19, 3, (int) null),
    NOTFOUND(0, 0, 0, 7, (int) null);
    
    private final int autoAdvanceLength;
    private final int cscMaxLength;
    private final int maxLength;

    private PaymentProcessors(int i, int i2, int i3) {
        this.autoAdvanceLength = i;
        this.cscMaxLength = i2;
        this.maxLength = i3;
    }

    public final int getAutoAdvanceLength() {
        return this.autoAdvanceLength;
    }

    public final int getCscMaxLength() {
        return this.cscMaxLength;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }
}
