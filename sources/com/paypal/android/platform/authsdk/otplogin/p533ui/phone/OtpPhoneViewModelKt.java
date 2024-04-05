package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import org.json.JSONObject;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModelKt */
public final class OtpPhoneViewModelKt {
    /* access modifiers changed from: private */
    public static final String extractNonce(String str) {
        try {
            return new JSONObject(str).get("nonce").toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
