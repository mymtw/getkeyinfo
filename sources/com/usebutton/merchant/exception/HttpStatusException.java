package com.usebutton.merchant.exception;

public class HttpStatusException extends ButtonNetworkException {
    private final int statusCode;

    public HttpStatusException(String str, int i) {
        super(str);
        this.statusCode = i;
    }

    public boolean wasBadRequest() {
        int i = this.statusCode;
        return i >= 400 && i < 500;
    }

    public boolean wasRateLimited() {
        return this.statusCode == 429;
    }

    public boolean wasServerError() {
        int i = this.statusCode;
        return i >= 500 && i < 600;
    }

    public boolean wasUnauthorized() {
        return this.statusCode == 401;
    }
}
