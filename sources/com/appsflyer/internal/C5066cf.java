package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFInAppEventType;

/* renamed from: com.appsflyer.internal.cf */
public final class C5066cf extends C5059by {
    public C5066cf(Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    public final C5089f AFKeystoreWrapper(String str) {
        return super.AFKeystoreWrapper(values(str));
    }
}
