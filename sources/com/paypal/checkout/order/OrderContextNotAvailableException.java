package com.paypal.checkout.order;

public final class OrderContextNotAvailableException extends IllegalStateException {
    public OrderContextNotAvailableException() {
        super("Tried to retrieve OrderContext before it was created.");
    }
}
