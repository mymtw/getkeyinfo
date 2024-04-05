package com.paypal.android.platform.authsdk.authcommon.security.interfaces;

import java.security.Signature;

public interface ISecureKeySignature {
    Signature generateSignature(String str);
}
