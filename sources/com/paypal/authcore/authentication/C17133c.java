package com.paypal.authcore.authentication;

import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17156f;

/* renamed from: com.paypal.authcore.authentication.c */
public interface C17133c {
    void completeWithFailure(AuthorizationException authorizationException);

    void completeWithSuccess(C17156f fVar);

    String getTrackingID();
}
