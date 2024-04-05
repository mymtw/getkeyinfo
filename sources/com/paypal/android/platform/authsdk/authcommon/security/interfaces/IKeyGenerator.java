package com.paypal.android.platform.authsdk.authcommon.security.interfaces;

import android.content.Context;
import java.security.PublicKey;

public interface IKeyGenerator {
    PublicKey generatePublicKey(Context context, String str, boolean z);
}
