package com.paypal.android.platform.authsdk.authcommon;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;

public enum ChallengeType {
    Login(EventsNameKt.LOGIN),
    EmailPassword("emailpassword"),
    OTPLogin("otplogin"),
    SplitLogin("splitlogin"),
    PartnerAuthLLS("partnerauthlls"),
    StepUp("stepup"),
    Biometric("biometric"),
    Captcha("captcha");
    
    private final String value;

    private ChallengeType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
