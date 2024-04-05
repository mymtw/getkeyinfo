package com.paypal.android.platform.authsdk.authinterface;

import android.content.Context;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationError;

public interface IdentityConfirmation {
    void confirmEmail(Context context, EmailConfirmationContext emailConfirmationContext, CommonListener<ConfirmEmailResult, AuthenticationError.ConfirmEmail> commonListener);
}
