package com.paypal.pyplcheckout.interfaces;

public interface SDKInterceptor {
    void intercept(Progression progression, SDKInterceptFinishListener sDKInterceptFinishListener);
}
