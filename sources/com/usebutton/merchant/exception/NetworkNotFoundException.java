package com.usebutton.merchant.exception;

public class NetworkNotFoundException extends ButtonNetworkException {
    public NetworkNotFoundException(Exception exc) {
        super(exc);
    }
}
