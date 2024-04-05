package com.paypal.checkout.createorder;

public enum ProcessingInstruction {
    ORDER_SAVED_EXPLICITLY,
    ORDER_SAVED_ON_BUYER_APPROVAL,
    ORDER_COMPLETE_ON_PAYMENT_APPROVAL,
    NO_INSTRUCTION
}
