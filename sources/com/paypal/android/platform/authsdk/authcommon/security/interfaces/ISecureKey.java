package com.paypal.android.platform.authsdk.authcommon.security.interfaces;

import android.content.Context;

public interface ISecureKey {
    String generateEncodedKey(Context context, String str);
}
